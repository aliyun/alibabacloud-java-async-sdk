// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Artifact} extends {@link TeaModel}
 *
 * <p>Artifact</p>
 */
public class Artifact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jarArtifact")
    private JarArtifact jarArtifact;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("pythonArtifact")
    private PythonArtifact pythonArtifact;

    @com.aliyun.core.annotation.NameInMap("sqlArtifact")
    private SqlArtifact sqlArtifact;

    private Artifact(Builder builder) {
        this.jarArtifact = builder.jarArtifact;
        this.kind = builder.kind;
        this.pythonArtifact = builder.pythonArtifact;
        this.sqlArtifact = builder.sqlArtifact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Artifact create() {
        return builder().build();
    }

    /**
     * @return jarArtifact
     */
    public JarArtifact getJarArtifact() {
        return this.jarArtifact;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return pythonArtifact
     */
    public PythonArtifact getPythonArtifact() {
        return this.pythonArtifact;
    }

    /**
     * @return sqlArtifact
     */
    public SqlArtifact getSqlArtifact() {
        return this.sqlArtifact;
    }

    public static final class Builder {
        private JarArtifact jarArtifact; 
        private String kind; 
        private PythonArtifact pythonArtifact; 
        private SqlArtifact sqlArtifact; 

        /**
         * jarArtifact.
         */
        public Builder jarArtifact(JarArtifact jarArtifact) {
            this.jarArtifact = jarArtifact;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * pythonArtifact.
         */
        public Builder pythonArtifact(PythonArtifact pythonArtifact) {
            this.pythonArtifact = pythonArtifact;
            return this;
        }

        /**
         * sqlArtifact.
         */
        public Builder sqlArtifact(SqlArtifact sqlArtifact) {
            this.sqlArtifact = sqlArtifact;
            return this;
        }

        public Artifact build() {
            return new Artifact(this);
        } 

    } 

}
