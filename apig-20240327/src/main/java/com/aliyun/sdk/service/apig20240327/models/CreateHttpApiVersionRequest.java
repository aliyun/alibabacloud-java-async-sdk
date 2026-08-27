// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateHttpApiVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateHttpApiVersionRequest</p>
 */
public class CreateHttpApiVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionConfig")
    private HttpApiVersionConfig versionConfig;

    private CreateHttpApiVersionRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.versionConfig = builder.versionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpApiVersionRequest create() {
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
     * @return versionConfig
     */
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    public static final class Builder extends Request.Builder<CreateHttpApiVersionRequest, Builder> {
        private String httpApiId; 
        private HttpApiVersionConfig versionConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateHttpApiVersionRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
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
         * versionConfig.
         */
        public Builder versionConfig(HttpApiVersionConfig versionConfig) {
            this.putBodyParameter("versionConfig", versionConfig);
            this.versionConfig = versionConfig;
            return this;
        }

        @Override
        public CreateHttpApiVersionRequest build() {
            return new CreateHttpApiVersionRequest(this);
        } 

    } 

}
