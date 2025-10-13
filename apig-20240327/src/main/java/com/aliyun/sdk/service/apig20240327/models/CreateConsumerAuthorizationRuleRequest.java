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
 * {@link CreateConsumerAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerAuthorizationRuleRequest</p>
 */
public class CreateConsumerAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authorizationResourceInfos")
    private java.util.List<AuthorizationResourceInfo> authorizationResourceInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireMode")
    private String expireMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireTimestamp")
    private Long expireTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentResourceType")
    private String parentResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private CreateConsumerAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.authorizationResourceInfos = builder.authorizationResourceInfos;
        this.expireMode = builder.expireMode;
        this.expireTimestamp = builder.expireTimestamp;
        this.parentResourceType = builder.parentResourceType;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerAuthorizationRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return authorizationResourceInfos
     */
    public java.util.List<AuthorizationResourceInfo> getAuthorizationResourceInfos() {
        return this.authorizationResourceInfos;
    }

    /**
     * @return expireMode
     */
    public String getExpireMode() {
        return this.expireMode;
    }

    /**
     * @return expireTimestamp
     */
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /**
     * @return parentResourceType
     */
    public String getParentResourceType() {
        return this.parentResourceType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<CreateConsumerAuthorizationRuleRequest, Builder> {
        private String consumerId; 
        private java.util.List<AuthorizationResourceInfo> authorizationResourceInfos; 
        private String expireMode; 
        private Long expireTimestamp; 
        private String parentResourceType; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerAuthorizationRuleRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.authorizationResourceInfos = request.authorizationResourceInfos;
            this.expireMode = request.expireMode;
            this.expireTimestamp = request.expireTimestamp;
            this.parentResourceType = request.parentResourceType;
            this.resourceType = request.resourceType;
        } 

        /**
         * consumerId.
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * authorizationResourceInfos.
         */
        public Builder authorizationResourceInfos(java.util.List<AuthorizationResourceInfo> authorizationResourceInfos) {
            this.putBodyParameter("authorizationResourceInfos", authorizationResourceInfos);
            this.authorizationResourceInfos = authorizationResourceInfos;
            return this;
        }

        /**
         * expireMode.
         */
        public Builder expireMode(String expireMode) {
            this.putBodyParameter("expireMode", expireMode);
            this.expireMode = expireMode;
            return this;
        }

        /**
         * expireTimestamp.
         */
        public Builder expireTimestamp(Long expireTimestamp) {
            this.putBodyParameter("expireTimestamp", expireTimestamp);
            this.expireTimestamp = expireTimestamp;
            return this;
        }

        /**
         * parentResourceType.
         */
        public Builder parentResourceType(String parentResourceType) {
            this.putBodyParameter("parentResourceType", parentResourceType);
            this.parentResourceType = parentResourceType;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CreateConsumerAuthorizationRuleRequest build() {
            return new CreateConsumerAuthorizationRuleRequest(this);
        } 

    } 

}
