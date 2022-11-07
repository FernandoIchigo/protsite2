

using myProject.model;

namespace myProject.Repository
{
    public interface IUsuarioRepository
    {
        Task<IEnumerable<usuario>> Getusuario();
        Task<usuario> GetusuarioById(int id);
        void AddUsuario(usuario usuario);
        void AtualizarUsuario(usuario usuario);
        void DeletarUsuario(usuario usuario);
        Task<bool> SaveChangesAsync();





    }
}