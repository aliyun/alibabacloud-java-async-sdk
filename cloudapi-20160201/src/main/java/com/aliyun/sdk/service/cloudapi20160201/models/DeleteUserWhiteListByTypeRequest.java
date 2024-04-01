// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserWhiteListByTypeRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserWhiteListByTypeRequest</p>
 */
public class DeleteUserWhiteListByTypeRequest extends Request {
    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    private DeleteUserWhiteListByTypeRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserWhiteListByTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DeleteUserWhiteListByTypeRequest, Builder> {
        private String entityId; 
        private String securityToken; 
        private String type; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserWhiteListByTypeRequest request) {
            super(request);
            this.entityId = request.entityId;
            this.securityToken = request.securityToken;
            this.type = request.type;
            this.uid = request.uid;
        } 

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DeleteUserWhiteListByTypeRequest build() {
            return new DeleteUserWhiteListByTypeRequest(this);
        } 

    } 

}
