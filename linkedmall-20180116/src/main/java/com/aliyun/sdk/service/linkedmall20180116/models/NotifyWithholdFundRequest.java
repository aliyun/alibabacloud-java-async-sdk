// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotifyWithholdFundRequest} extends {@link RequestModel}
 *
 * <p>NotifyWithholdFundRequest</p>
 */
public class NotifyWithholdFundRequest extends Request {
    @Query
    @NameInMap("Amount")
    private Long amount;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("OperationDate")
    private String operationDate;

    @Query
    @NameInMap("PayTypes")
    private String payTypes;

    @Query
    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    @Query
    @NameInMap("TenantOrderId")
    @Validation(required = true)
    private String tenantOrderId;

    private NotifyWithholdFundRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.channelId = builder.channelId;
        this.operationDate = builder.operationDate;
        this.payTypes = builder.payTypes;
        this.requestId = builder.requestId;
        this.tenantOrderId = builder.tenantOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyWithholdFundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return operationDate
     */
    public String getOperationDate() {
        return this.operationDate;
    }

    /**
     * @return payTypes
     */
    public String getPayTypes() {
        return this.payTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantOrderId
     */
    public String getTenantOrderId() {
        return this.tenantOrderId;
    }

    public static final class Builder extends Request.Builder<NotifyWithholdFundRequest, Builder> {
        private Long amount; 
        private String channelId; 
        private String operationDate; 
        private String payTypes; 
        private String requestId; 
        private String tenantOrderId; 

        private Builder() {
            super();
        } 

        private Builder(NotifyWithholdFundRequest request) {
            super(request);
            this.amount = request.amount;
            this.channelId = request.channelId;
            this.operationDate = request.operationDate;
            this.payTypes = request.payTypes;
            this.requestId = request.requestId;
            this.tenantOrderId = request.tenantOrderId;
        } 

        /**
         * Amount.
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * OperationDate.
         */
        public Builder operationDate(String operationDate) {
            this.putQueryParameter("OperationDate", operationDate);
            this.operationDate = operationDate;
            return this;
        }

        /**
         * PayTypes.
         */
        public Builder payTypes(String payTypes) {
            this.putQueryParameter("PayTypes", payTypes);
            this.payTypes = payTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * TenantOrderId.
         */
        public Builder tenantOrderId(String tenantOrderId) {
            this.putQueryParameter("TenantOrderId", tenantOrderId);
            this.tenantOrderId = tenantOrderId;
            return this;
        }

        @Override
        public NotifyWithholdFundRequest build() {
            return new NotifyWithholdFundRequest(this);
        } 

    } 

}
