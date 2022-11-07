using Microsoft.AspNetCore.Mvc;
using myProject.model;
using myProject.Repository;


namespace myProject.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class usuarioController : ControllerBase
    {
        private readonly IUsuarioRepository _repository;
        public usuarioController(IUsuarioRepository repository)
        {
            _repository = repository;
        }
        [HttpGet]
        public async Task<IActionResult> GetAll()
        {
            var usuario = await _repository.Getusuario();
            return usuario.Any() ? Ok(usuario) : NoContent();
        }

        [HttpPost]
        public async Task<IActionResult> Post(usuario usuario)
        {
            _repository.AddUsuario(usuario);
            return await _repository.SaveChangesAsync()
            ? Ok("Cliente adicionado") : BadRequest("Dados incorretos");

        }
    }

}