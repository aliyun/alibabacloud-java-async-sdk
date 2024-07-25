// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHttpApiRequest} extends {@link RequestModel}
 *
 * <p>UpdateHttpApiRequest</p>
 */
public class UpdateHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("basePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String basePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List < String > protocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionConfig")
    private HttpApiVersionConfig versionConfig;

    private UpdateHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.basePath = builder.basePath;
        this.description = builder.description;
        this.protocols = builder.protocols;
        this.versionConfig = builder.versionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
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

    public static final class Builder extends Request.Builder<UpdateHttpApiRequest, Builder> {
        private String httpApiId; 
        private String basePath; 
        private String description; 
        private java.util.List < String > protocols; 
        private HttpApiVersionConfig versionConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.basePath = request.basePath;
            this.description = request.description;
            this.protocols = request.protocols;
            this.versionConfig = request.versionConfig;
        } 

        /**
         * httpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
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
        public UpdateHttpApiRequest build() {
            return new UpdateHttpApiRequest(this);
        } 

    } 

}
