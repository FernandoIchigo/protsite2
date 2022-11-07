

using Microsoft.EntityFrameworkCore
using myProject.model;

namespace myProject.Controllers.Database
{
    public class usuarioDbContext : DbContext
    {
        public usuarioDbContext(DbContextOptions<usuarioDbContext> options) : base(options)
        {

        }
        public DbSet<usuario> usuarios { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder){
            var usuario = modelBuilder.Entity<usuario>();
            usuario:ToTable("usuario");
            usuario.HasKey(x => x.Id);
            usuario.Property(x => x.Nome).HasColumnName("nome").IsRequired();
            usuario.Property(x => x.Id).HasColumnName("id").ValueGeneratedOnAdd();
            usuario.Property(x => x.Endereço).HasColumnName("endereço").IsRequired();
            usuario.Property(x => x.telefone).HasColumnName("telefone");
            usuario.Property(x => x.Cpf).HasColumnName("cpf").IsRequired();


        }

        private void ToTable(string v)
        {
            throw new NotImplementedException();
        }
    }
}