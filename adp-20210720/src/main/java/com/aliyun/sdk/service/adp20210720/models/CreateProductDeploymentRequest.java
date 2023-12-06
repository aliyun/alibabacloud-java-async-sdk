// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductDeploymentRequest} extends {@link RequestModel}
 *
 * <p>CreateProductDeploymentRequest</p>
 */
public class CreateProductDeploymentRequest extends Request {
    @Body
    @NameInMap("environmentUID")
    @Validation(required = true)
    private String environmentUID;

    @Body
    @NameInMap("namespace")
    private String namespace;

    @Body
    @NameInMap("oldProductVersionUID")
    private String oldProductVersionUID;

    @Body
    @NameInMap("packageConfig")
    private String packageConfig;

    @Body
    @NameInMap("packageUID")
    private String packageUID;

    @Body
    @NameInMap("productVersionUID")
    private String productVersionUID;

    @Body
    @NameInMap("timeout")
    private Long timeout;

    private CreateProductDeploymentRequest(Builder builder) {
        super(builder);
        this.environmentUID = builder.environmentUID;
        this.namespace = builder.namespace;
        this.oldProductVersionUID = builder.oldProductVersionUID;
        this.packageConfig = builder.packageConfig;
        this.packageUID = builder.packageUID;
        this.productVersionUID = builder.productVersionUID;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductDeploymentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentUID
     */
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return oldProductVersionUID
     */
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    /**
     * @return packageConfig
     */
    public String getPackageConfig() {
        return this.packageConfig;
    }

    /**
     * @return packageUID
     */
    public String getPackageUID() {
        return this.packageUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateProductDeploymentRequest, Builder> {
        private String environmentUID; 
        private String namespace; 
        private String oldProductVersionUID; 
        private String packageConfig; 
        private String packageUID; 
        private String productVersionUID; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductDeploymentRequest request) {
            super(request);
            this.environmentUID = request.environmentUID;
            this.namespace = request.namespace;
            this.oldProductVersionUID = request.oldProductVersionUID;
            this.packageConfig = request.packageConfig;
            this.packageUID = request.packageUID;
            this.productVersionUID = request.productVersionUID;
            this.timeout = request.timeout;
        } 

        /**
         * environmentUID.
         */
        public Builder environmentUID(String environmentUID) {
            this.putBodyParameter("environmentUID", environmentUID);
            this.environmentUID = environmentUID;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * oldProductVersionUID.
         */
        public Builder oldProductVersionUID(String oldProductVersionUID) {
            this.putBodyParameter("oldProductVersionUID", oldProductVersionUID);
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }

        /**
         * packageConfig.
         */
        public Builder packageConfig(String packageConfig) {
            this.putBodyParameter("packageConfig", packageConfig);
            this.packageConfig = packageConfig;
            return this;
        }

        /**
         * packageUID.
         */
        public Builder packageUID(String packageUID) {
            this.putBodyParameter("packageUID", packageUID);
            this.packageUID = packageUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putBodyParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Long timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateProductDeploymentRequest build() {
            return new CreateProductDeploymentRequest(this);
        } 

    } 

}
