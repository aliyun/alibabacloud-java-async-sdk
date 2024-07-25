// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHttpApiRequest} extends {@link RequestModel}
 *
 * <p>CreateHttpApiRequest</p>
 */
public class CreateHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("basePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String basePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List < String > protocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionConfig")
    private HttpApiVersionConfig versionConfig;

    private CreateHttpApiRequest(Builder builder) {
        super(builder);
        this.basePath = builder.basePath;
        this.description = builder.description;
        this.name = builder.name;
        this.protocols = builder.protocols;
        this.versionConfig = builder.versionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocols
     */
    public java.util.List < String > getProtocols() {
        return this.protocols;
    }

    /**
     * @return versionConfig
     */
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    public static final class Builder extends Request.Builder<CreateHttpApiRequest, Builder> {
        private String basePath; 
        private String description; 
        private String name; 
        private java.util.List < String > protocols; 
        private HttpApiVersionConfig versionConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateHttpApiRequest request) {
            super(request);
            this.basePath = request.basePath;
            this.description = request.description;
            this.name = request.name;
            this.protocols = request.protocols;
            this.versionConfig = request.versionConfig;
        } 

        /**
         * basePath.
         */
        public Builder basePath(String basePath) {
            this.putBodyParameter("basePath", basePath);
            this.basePath = basePath;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * protocols.
         */
        public Builder protocols(java.util.List < String > protocols) {
            this.putBodyParameter("protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        /**
         * versionConfig.
         */
        public Builder versionConfig(HttpApiVersionConfig versionConfig) {
            this.putBodyParameter("versionConfig", versionConfig);
            this.versionConfig = versionConfig;
            return this;
        }

        @Override
        public CreateHttpApiRequest build() {
            return new CreateHttpApiRequest(this);
        } 

    } 

}
