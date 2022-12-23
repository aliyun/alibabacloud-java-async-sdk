// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscriptionBillRequest} extends {@link RequestModel}
 *
 * <p>SubscriptionBillRequest</p>
 */
public class SubscriptionBillRequest extends Request {
    @Query
    @NameInMap("BeginBillingCycle")
    @Validation(required = true)
    private String beginBillingCycle;

    @Query
    @NameInMap("BillFormat")
    @Validation(required = true)
    private String billFormat;

    @Query
    @NameInMap("BucketOwnerId")
    @Validation(required = true)
    private Long bucketOwnerId;

    @Query
    @NameInMap("SubscribeBucket")
    @Validation(required = true)
    private String subscribeBucket;

    @Query
    @NameInMap("SubscribeSegmentSize")
    private Integer subscribeSegmentSize;

    @Query
    @NameInMap("SubscribeType")
    @Validation(required = true)
    private String subscribeType;

    private SubscriptionBillRequest(Builder builder) {
        super(builder);
        this.beginBillingCycle = builder.beginBillingCycle;
        this.billFormat = builder.billFormat;
        this.bucketOwnerId = builder.bucketOwnerId;
        this.subscribeBucket = builder.subscribeBucket;
        this.subscribeSegmentSize = builder.subscribeSegmentSize;
        this.subscribeType = builder.subscribeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionBillRequest create() {
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
     * @return billFormat
     */
    public String getBillFormat() {
        return this.billFormat;
    }

    /**
     * @return bucketOwnerId
     */
    public Long getBucketOwnerId() {
        return this.bucketOwnerId;
    }

    /**
     * @return subscribeBucket
     */
    public String getSubscribeBucket() {
        return this.subscribeBucket;
    }

    /**
     * @return subscribeSegmentSize
     */
    public Integer getSubscribeSegmentSize() {
        return this.subscribeSegmentSize;
    }

    /**
     * @return subscribeType
     */
    public String getSubscribeType() {
        return this.subscribeType;
    }

    public static final class Builder extends Request.Builder<SubscriptionBillRequest, Builder> {
        private String beginBillingCycle; 
        private String billFormat; 
        private Long bucketOwnerId; 
        private String subscribeBucket; 
        private Integer subscribeSegmentSize; 
        private String subscribeType; 

        private Builder() {
            super();
        } 

        private Builder(SubscriptionBillRequest request) {
            super(request);
            this.beginBillingCycle = request.beginBillingCycle;
            this.billFormat = request.billFormat;
            this.bucketOwnerId = request.bucketOwnerId;
            this.subscribeBucket = request.subscribeBucket;
            this.subscribeSegmentSize = request.subscribeSegmentSize;
            this.subscribeType = request.subscribeType;
        } 

        /**
         * subscribeBucket
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * BillFormat.
         */
        public Builder billFormat(String billFormat) {
            this.putQueryParameter("BillFormat", billFormat);
            this.billFormat = billFormat;
            return this;
        }

        /**
         * callerMainUid
         */
        public Builder bucketOwnerId(Long bucketOwnerId) {
            this.putQueryParameter("BucketOwnerId", bucketOwnerId);
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }

        /**
         * subscribeType
         */
        public Builder subscribeBucket(String subscribeBucket) {
            this.putQueryParameter("SubscribeBucket", subscribeBucket);
            this.subscribeBucket = subscribeBucket;
            return this;
        }

        /**
         * SubscribeSegmentSize.
         */
        public Builder subscribeSegmentSize(Integer subscribeSegmentSize) {
            this.putQueryParameter("SubscribeSegmentSize", subscribeSegmentSize);
            this.subscribeSegmentSize = subscribeSegmentSize;
            return this;
        }

        /**
         * popClientIP
         */
        public Builder subscribeType(String subscribeType) {
            this.putQueryParameter("SubscribeType", subscribeType);
            this.subscribeType = subscribeType;
            return this;
        }

        @Override
        public SubscriptionBillRequest build() {
            return new SubscriptionBillRequest(this);
        } 

    } 

}
