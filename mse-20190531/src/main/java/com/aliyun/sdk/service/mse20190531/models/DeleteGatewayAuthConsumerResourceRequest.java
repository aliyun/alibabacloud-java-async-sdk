// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayAuthConsumerResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayAuthConsumerResourceRequest</p>
 */
public class DeleteGatewayAuthConsumerResourceRequest extends Request {
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

    private DeleteGatewayAuthConsumerResourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.consumerId = builder.consumerId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.idList = builder.idList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayAuthConsumerResourceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteGatewayAuthConsumerResourceRequest, Builder> {
        private String acceptLanguage; 
        private Long consumerId; 
        private String gatewayUniqueId; 
        private String idList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayAuthConsumerResourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.consumerId = request.consumerId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.idList = request.idList;
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

        @Override
        public DeleteGatewayAuthConsumerResourceRequest build() {
            return new DeleteGatewayAuthConsumerResourceRequest(this);
        } 

    } 

}
