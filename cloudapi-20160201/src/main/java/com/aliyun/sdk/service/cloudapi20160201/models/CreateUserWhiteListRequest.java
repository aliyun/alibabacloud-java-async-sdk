// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserWhiteListRequest} extends {@link RequestModel}
 *
 * <p>CreateUserWhiteListRequest</p>
 */
public class CreateUserWhiteListRequest extends Request {
    @Query
    @NameInMap("AoneId")
    private String aoneId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("LimitCount")
    private Integer limitCount;

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

    @Query
    @NameInMap("Value")
    private String value;

    private CreateUserWhiteListRequest(Builder builder) {
        super(builder);
        this.aoneId = builder.aoneId;
        this.description = builder.description;
        this.entityId = builder.entityId;
        this.limitCount = builder.limitCount;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
        this.uid = builder.uid;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aoneId
     */
    public String getAoneId() {
        return this.aoneId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return limitCount
     */
    public Integer getLimitCount() {
        return this.limitCount;
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

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateUserWhiteListRequest, Builder> {
        private String aoneId; 
        private String description; 
        private String entityId; 
        private Integer limitCount; 
        private String securityToken; 
        private String type; 
        private Long uid; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserWhiteListRequest request) {
            super(request);
            this.aoneId = request.aoneId;
            this.description = request.description;
            this.entityId = request.entityId;
            this.limitCount = request.limitCount;
            this.securityToken = request.securityToken;
            this.type = request.type;
            this.uid = request.uid;
            this.value = request.value;
        } 

        /**
         * AoneId.
         */
        public Builder aoneId(String aoneId) {
            this.putQueryParameter("AoneId", aoneId);
            this.aoneId = aoneId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * LimitCount.
         */
        public Builder limitCount(Integer limitCount) {
            this.putQueryParameter("LimitCount", limitCount);
            this.limitCount = limitCount;
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

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateUserWhiteListRequest build() {
            return new CreateUserWhiteListRequest(this);
        } 

    } 

}
