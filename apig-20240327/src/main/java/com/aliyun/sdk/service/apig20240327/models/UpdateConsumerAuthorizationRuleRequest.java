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
 * {@link UpdateConsumerAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerAuthorizationRuleRequest</p>
 */
public class UpdateConsumerAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
    private String consumerAuthorizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authorizationResourceInfos")
    private java.util.List<AuthorizationResourceInfo> authorizationResourceInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireMode")
    private String expireMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireTimestamp")
    private Long expireTimestamp;

    private UpdateConsumerAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
        this.authorizationResourceInfos = builder.authorizationResourceInfos;
        this.expireMode = builder.expireMode;
        this.expireTimestamp = builder.expireTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerAuthorizationRuleRequest create() {
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
     * @return consumerAuthorizationRuleId
     */
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
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

    public static final class Builder extends Request.Builder<UpdateConsumerAuthorizationRuleRequest, Builder> {
        private String consumerId; 
        private String consumerAuthorizationRuleId; 
        private java.util.List<AuthorizationResourceInfo> authorizationResourceInfos; 
        private String expireMode; 
        private Long expireTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerAuthorizationRuleRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.consumerAuthorizationRuleId = request.consumerAuthorizationRuleId;
            this.authorizationResourceInfos = request.authorizationResourceInfos;
            this.expireMode = request.expireMode;
            this.expireTimestamp = request.expireTimestamp;
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
         * consumerAuthorizationRuleId.
         */
        public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.putPathParameter("consumerAuthorizationRuleId", consumerAuthorizationRuleId);
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
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

        @Override
        public UpdateConsumerAuthorizationRuleRequest build() {
            return new UpdateConsumerAuthorizationRuleRequest(this);
        } 

    } 

}
