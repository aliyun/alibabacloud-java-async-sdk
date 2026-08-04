// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterCreateMemberApiKeyRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateMemberApiKeyRequest</p>
 */
public class ModelRouterCreateMemberApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireAt")
    private String expireAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ModelRouterCreateMemberApiKeyRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.id = builder.id;
        this.expireAt = builder.expireAt;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateMemberApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return expireAt
     */
    public String getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModelRouterCreateMemberApiKeyRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private String expireAt; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateMemberApiKeyRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.id = request.id;
            this.expireAt = request.expireAt;
            this.name = request.name;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putPathParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * expireAt.
         */
        public Builder expireAt(String expireAt) {
            this.putBodyParameter("expireAt", expireAt);
            this.expireAt = expireAt;
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

        @Override
        public ModelRouterCreateMemberApiKeyRequest build() {
            return new ModelRouterCreateMemberApiKeyRequest(this);
        } 

    } 

}
