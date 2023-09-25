// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubscriptionInstanceStatusRequest</p>
 */
public class DescribeSubscriptionInstanceStatusRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SubscriptionInstanceId")
    @Validation(required = true)
    private String subscriptionInstanceId;

    private DescribeSubscriptionInstanceStatusRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeSubscriptionInstanceStatusRequest, Builder> {
        private String ownerId; 
        private String subscriptionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSubscriptionInstanceStatusRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SubscriptionInstanceId.
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        @Override
        public DescribeSubscriptionInstanceStatusRequest build() {
            return new DescribeSubscriptionInstanceStatusRequest(this);
        } 

    } 

}
