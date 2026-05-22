// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link UpdateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiKeyRequest</p>
 */
public class UpdateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiKeyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auth")
    private Auth auth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String description;

    private UpdateApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
        this.auth = builder.auth;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return auth
     */
    public Auth getAuth() {
        return this.auth;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateApiKeyRequest, Builder> {
        private Long apiKeyId; 
        private Auth auth; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
            this.auth = request.auth;
            this.description = request.description;
        } 

        /**
         * <p>API Key ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3268483</p>
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.putPathParameter("apiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * auth.
         */
        public Builder auth(Auth auth) {
            this.putBodyParameter("auth", auth);
            this.auth = auth;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateApiKeyRequest build() {
            return new UpdateApiKeyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApiKeyRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiKeyRequest</p>
     */
    public static class Auth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessIps")
        private java.util.List<String> accessIps;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Auth(Builder builder) {
            this.accessIps = builder.accessIps;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auth create() {
            return builder().build();
        }

        /**
         * @return accessIps
         */
        public java.util.List<String> getAccessIps() {
            return this.accessIps;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> accessIps; 
            private String type; 

            private Builder() {
            } 

            private Builder(Auth model) {
                this.accessIps = model.accessIps;
                this.type = model.type;
            } 

            /**
             * accessIps.
             */
            public Builder accessIps(java.util.List<String> accessIps) {
                this.accessIps = accessIps;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Auth build() {
                return new Auth(this);
            } 

        } 

    }
}
