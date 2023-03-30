// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayAuthConsumerResourceStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayAuthConsumerResourceStatusRequest</p>
 */
public class UpdateGatewayAuthConsumerResourceStatusRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConsumerId")
    @Validation(required = true)
    private Long consumerId;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("IdList")
    @Validation(required = true)
    private String idList;

    @Query
    @NameInMap("ResourceStatus")
    @Validation(required = true)
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
         * 返回结果显示的语言。取值：zh-CN（默认值）：中文，en-US：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ConsumerId.
         */
        public Builder consumerId(Long consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * IdList.
         */
        public Builder idList(String idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * ResourceStatus.
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
