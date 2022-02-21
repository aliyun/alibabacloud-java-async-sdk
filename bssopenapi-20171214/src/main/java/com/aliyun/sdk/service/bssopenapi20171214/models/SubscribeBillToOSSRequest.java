// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeBillToOSSRequest} extends {@link RequestModel}
 *
 * <p>SubscribeBillToOSSRequest</p>
 */
public class SubscribeBillToOSSRequest extends Request {
    @Query
    @NameInMap("BeginBillingCycle")
    private String beginBillingCycle;

    @Query
    @NameInMap("BucketOwnerId")
    private Long bucketOwnerId;

    @Query
    @NameInMap("MultAccountRelSubscribe")
    private String multAccountRelSubscribe;

    @Query
    @NameInMap("SubscribeBucket")
    @Validation(required = true)
    private String subscribeBucket;

    @Query
    @NameInMap("SubscribeType")
    private String subscribeType;

    private SubscribeBillToOSSRequest(Builder builder) {
        super(builder);
        this.beginBillingCycle = builder.beginBillingCycle;
        this.bucketOwnerId = builder.bucketOwnerId;
        this.multAccountRelSubscribe = builder.multAccountRelSubscribe;
        this.subscribeBucket = builder.subscribeBucket;
        this.subscribeType = builder.subscribeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeBillToOSSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginBillingCycle
     */
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    /**
     * @return bucketOwnerId
     */
    public Long getBucketOwnerId() {
        return this.bucketOwnerId;
    }

    /**
     * @return multAccountRelSubscribe
     */
    public String getMultAccountRelSubscribe() {
        return this.multAccountRelSubscribe;
    }

    /**
     * @return subscribeBucket
     */
    public String getSubscribeBucket() {
        return this.subscribeBucket;
    }

    /**
     * @return subscribeType
     */
    public String getSubscribeType() {
        return this.subscribeType;
    }

    public static final class Builder extends Request.Builder<SubscribeBillToOSSRequest, Builder> {
        private String beginBillingCycle; 
        private Long bucketOwnerId; 
        private String multAccountRelSubscribe; 
        private String subscribeBucket; 
        private String subscribeType; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeBillToOSSRequest response) {
            super(response);
            this.beginBillingCycle = response.beginBillingCycle;
            this.bucketOwnerId = response.bucketOwnerId;
            this.multAccountRelSubscribe = response.multAccountRelSubscribe;
            this.subscribeBucket = response.subscribeBucket;
            this.subscribeType = response.subscribeType;
        } 

        /**
         * BeginBillingCycle.
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * BucketOwnerId.
         */
        public Builder bucketOwnerId(Long bucketOwnerId) {
            this.putQueryParameter("BucketOwnerId", bucketOwnerId);
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }

        /**
         * MultAccountRelSubscribe.
         */
        public Builder multAccountRelSubscribe(String multAccountRelSubscribe) {
            this.putQueryParameter("MultAccountRelSubscribe", multAccountRelSubscribe);
            this.multAccountRelSubscribe = multAccountRelSubscribe;
            return this;
        }

        /**
         * SubscribeBucket.
         */
        public Builder subscribeBucket(String subscribeBucket) {
            this.putQueryParameter("SubscribeBucket", subscribeBucket);
            this.subscribeBucket = subscribeBucket;
            return this;
        }

        /**
         * SubscribeType.
         */
        public Builder subscribeType(String subscribeType) {
            this.putQueryParameter("SubscribeType", subscribeType);
            this.subscribeType = subscribeType;
            return this;
        }

        @Override
        public SubscribeBillToOSSRequest build() {
            return new SubscribeBillToOSSRequest(this);
        } 

    } 

}
