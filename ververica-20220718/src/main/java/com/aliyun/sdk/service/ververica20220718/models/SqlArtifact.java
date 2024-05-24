// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SqlArtifact} extends {@link TeaModel}
 *
 * <p>SqlArtifact</p>
 */
public class SqlArtifact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("additionalDependencies")
    private java.util.List < String > additionalDependencies;

    @com.aliyun.core.annotation.NameInMap("sqlScript")
    private String sqlScript;

    private SqlArtifact(Builder builder) {
        this.additionalDependencies = builder.additionalDependencies;
        this.sqlScript = builder.sqlScript;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlArtifact create() {
        return builder().build();
    }

    /**
     * @return additionalDependencies
     */
    public java.util.List < String > getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    /**
     * @return sqlScript
     */
    public String getSqlScript() {
        return this.sqlScript;
    }

    public static final class Builder {
        private java.util.List < String > additionalDependencies; 
        private String sqlScript; 

        /**
         * additionalDependencies.
         */
        public Builder additionalDependencies(java.util.List < String > additionalDependencies) {
            this.additionalDependencies = additionalDependencies;
            return this;
        }

        /**
         * sqlScript.
         */
        public Builder sqlScript(String sqlScript) {
            this.sqlScript = sqlScript;
            return this;
        }

        public SqlArtifact build() {
            return new SqlArtifact(this);
        } 

    } 

}
