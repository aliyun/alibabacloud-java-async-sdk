// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayAuthConsumerResourceStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayAuthConsumerResourceStatusRequest</p>
 */
public class UpdateGatewayAuthConsumerResourceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean resourceStatus;

    private UpdateGatewayAuthConsumerResourceStatusRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.consumerId = builder.consumerId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.idList = builder.idList;
        this.resourceStatus = builder.resourceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayAuthConsumerResourceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return consumerId
     */
    public Long getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return idList
     */
    public String getIdList() {
        return this.idList;
    }

    /**
     * @return resourceStatus
     */
    public Boolean getResourceStatus() {
        return this.resourceStatus;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayAuthConsumerResourceStatusRequest, Builder> {
        private String acceptLanguage; 
        private Long consumerId; 
        private String gatewayUniqueId; 
        private String idList; 
        private Boolean resourceStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayAuthConsumerResourceStatusRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.consumerId = request.consumerId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.idList = request.idList;
            this.resourceStatus = request.resourceStatus;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the consumer.
         */
        public Builder consumerId(Long consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The list of IDs of the authorized resources that a user wants to update.
         */
        public Builder idList(String idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * The resource authorization status. Valid values:
         * <p>
         * 
         * *   true: enabled
         * *   false: disabled
         */
        public Builder resourceStatus(Boolean resourceStatus) {
            this.putQueryParameter("ResourceStatus", resourceStatus);
            this.resourceStatus = resourceStatus;
            return this;
        }

        @Override
        public UpdateGatewayAuthConsumerResourceStatusRequest build() {
            return new UpdateGatewayAuthConsumerResourceStatusRequest(this);
        } 

    } 

}
