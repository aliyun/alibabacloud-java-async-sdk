// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PathConfig} extends {@link TeaModel}
 *
 * <p>PathConfig</p>
 */
public class PathConfig extends TeaModel {
    @NameInMap("accountId")
    private String accountId;

    @NameInMap("functionName")
    private String functionName;

    @NameInMap("innerRewriteConfig")
    private InnerRewriteConfig innerRewriteConfig;

    @NameInMap("methods")
    private java.util.List < String > methods;

    @NameInMap("path")
    @Validation(maxLength = 2048)
    private String path;

    @NameInMap("qualifier")
    private String qualifier;

    @NameInMap("rewriteConfig")
    private RewriteConfig rewriteConfig;

    @NameInMap("serviceName")
    private String serviceName;

    private PathConfig(Builder builder) {
        this.accountId = builder.accountId;
        this.functionName = builder.functionName;
        this.innerRewriteConfig = builder.innerRewriteConfig;
        this.methods = builder.methods;
        this.path = builder.path;
        this.qualifier = builder.qualifier;
        this.rewriteConfig = builder.rewriteConfig;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PathConfig create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return innerRewriteConfig
     */
    public InnerRewriteConfig getInnerRewriteConfig() {
        return this.innerRewriteConfig;
    }

    /**
     * @return methods
     */
    public java.util.List < String > getMethods() {
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

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private String accountId; 
        private String functionName; 
        private InnerRewriteConfig innerRewriteConfig; 
        private java.util.List < String > methods; 
        private String path; 
        private String qualifier; 
        private RewriteConfig rewriteConfig; 
        private String serviceName; 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * innerRewriteConfig.
         */
        public Builder innerRewriteConfig(InnerRewriteConfig innerRewriteConfig) {
            this.innerRewriteConfig = innerRewriteConfig;
            return this;
        }

        /**
         * methods.
         */
        public Builder methods(java.util.List < String > methods) {
            this.methods = methods;
            return this;
        }

        /**
         * path.
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

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public PathConfig build() {
            return new PathConfig(this);
        } 

    } 

}
