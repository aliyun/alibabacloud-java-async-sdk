// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotifyPayOrderStatusRequest} extends {@link RequestModel}
 *
 * <p>NotifyPayOrderStatusRequest</p>
 */
public class NotifyPayOrderStatusRequest extends Request {
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

    private NotifyPayOrderStatusRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.channelId = builder.channelId;
        this.operationDate = builder.operationDate;
        this.payTypes = builder.payTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyPayOrderStatusRequest create() {
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

    public static final class Builder extends Request.Builder<NotifyPayOrderStatusRequest, Builder> {
        private Long amount; 
        private String channelId; 
        private String operationDate; 
        private String payTypes; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(NotifyPayOrderStatusRequest request) {
            super(request);
            this.amount = request.amount;
            this.channelId = request.channelId;
            this.operationDate = request.operationDate;
            this.payTypes = request.payTypes;
            this.requestId = request.requestId;
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

        @Override
        public NotifyPayOrderStatusRequest build() {
            return new NotifyPayOrderStatusRequest(this);
        } 

    } 

}
