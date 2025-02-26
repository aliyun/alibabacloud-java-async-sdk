// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PathConfig} extends {@link TeaModel}
 *
 * <p>PathConfig</p>
 */
public class PathConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("methods")
    private java.util.List<String> methods;

    @com.aliyun.core.annotation.NameInMap("path")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048)
    private String path;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("rewriteConfig")
    private RewriteConfig rewriteConfig;

    private PathConfig(Builder builder) {
        this.functionName = builder.functionName;
        this.methods = builder.methods;
        this.path = builder.path;
        this.qualifier = builder.qualifier;
        this.rewriteConfig = builder.rewriteConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PathConfig create() {
        return builder().build();
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return methods
     */
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return rewriteConfig
     */
    public RewriteConfig getRewriteConfig() {
        return this.rewriteConfig;
    }

    public static final class Builder {
        private String functionName; 
        private java.util.List<String> methods; 
        private String path; 
        private String qualifier; 
        private RewriteConfig rewriteConfig; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myFunction</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * methods.
         */
        public Builder methods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/*</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * rewriteConfig.
         */
        public Builder rewriteConfig(RewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }

        public PathConfig build() {
            return new PathConfig(this);
        } 

    } 

}
