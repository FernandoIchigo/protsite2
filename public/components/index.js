import React, { Component } from "react"


class header extends Component {
    render() {
        return (
            <>


                <header>
                    <nav className="navbar navbar-expand-lg" style="background-color:#00CED1">
                        <div className="container-fluid">
                            <a className="navbar-brand" href="#">Good Travel</a>
                            <button className="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false"
                                aria-label="Toggle navigation">
                                <span className="navbar-toggler-icon"></span>
                            </button>
                            <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                                <div className="navbar-nav">
                                    <a className="nav-link active" aria-current="page" href="index.html">Home</a>
                                    <a className="nav-link" href="destinos.html">Destinos</a>
                                    <a className="nav-link" href="lojas.html">lojas</a>
                                    <a className="nav-link" href="Registre.html">Registre-se</a>
                                    <a className="nav-link" href="contato.html">Contato</a>
                                </div>
                            </div>
                        </div>
                    </nav>

                </header>
            </>
        )
    }
}

export default Header