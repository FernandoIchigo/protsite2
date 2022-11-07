

using myProject.model;
using myProject.Controllers.Database;
using Microsoft.EntityFrameworkCore;



namespace myProject.Repository
{
    public class UsuarioRepository : IUsuarioRepository
    {

        private readonly usuarioDbContext _context; 

        public UsuarioRepository(usuarioDbContext context) {
            _context = context;

        }
        public void AddUsuario(usuario usuario)
        {
            _context.Add(usuario);

        }

        public void AtualizarUsuario(usuario usuario)
        {
            throw new NotImplementedException();
        }

        public void DeletarUsuario(usuario usuario)
        {
            throw new NotImplementedException();
        }

        public async Task<IEnumerable<usuario>> Getusuario()
        {
            return await _context.usuarios.ToListAsync();
            
        }

        public Task<usuario> GetusuarioById(int id)
        {
            throw new NotImplementedException();
        }

        public async Task<bool> SaveChangesAsync()
        {
           return await _context.SaveChangesAsync() > 0;
           
        }
    }
}