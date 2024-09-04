// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscriptionBillRequest} extends {@link RequestModel}
 *
 * <p>SubscriptionBillRequest</p>
 */
public class SubscriptionBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginBillingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketOwnerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bucketOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscribeBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeSegmentSize")
    private Integer subscribeSegmentSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The start month from which the bills are pushed. Specify the value in the yyyy-MM format.
         * <p>
         * 
         * After the subscription is generated, the system automatically pushes the bill data that is generated from the month that you specified to the current point in time. Data of up to six months can be pushed. The current month is included. If you subscribe to the bills for more than six months, the subscription is invalid.
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * The file format of the bill. Valid values: csv and parquet.
         * <p>
         * 
         * If you subscribe to the bills of multiple file formats, we recommend that you store the bills in different OSS buckets to prevent file overwriting.
         */
        public Builder billFormat(String billFormat) {
            this.putQueryParameter("BillFormat", billFormat);
            this.billFormat = billFormat;
            return this;
        }

        /**
         * The ID of the user to which the OSS bucket belongs.
         * <p>
         * 
         * If you are an eco-partner of Alibaba Cloud and you need to push the bills to the OSS bucket of a subordinate partner account, you must set this parameter to the ID of the subordinate partner account and grant the [AliyunConsumeDump2OSSRole](https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D) permission to the subordinate partner account.
         * 
         * If you are an eco-partner of Alibaba Cloud and you need to push the bills to the OSS bucket of your own account, your account must be granted the [AliyunConsumeDump2OSSRole](https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D) permission.
         */
        public Builder bucketOwnerId(Long bucketOwnerId) {
            this.putQueryParameter("BucketOwnerId", bucketOwnerId);
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }

        /**
         * The name of the Object Storage Service (OSS) bucket in which you want to store the bills.
         */
        public Builder subscribeBucket(String subscribeBucket) {
            this.putQueryParameter("SubscribeBucket", subscribeBucket);
            this.subscribeBucket = subscribeBucket;
            return this;
        }

        /**
         * The maximum rows in a single bill file. If the number of bill rows exceed the upper limit, the bill is automatically split into multiple files. The name of each split file is in the `uid_billType_billCycle_SquenceNo_fileNo` format.
         * <p>
         * 
         * Files whose names are the same except for the fileNo field are of the same type and belong to the same billing cycle.
         */
        public Builder subscribeSegmentSize(Integer subscribeSegmentSize) {
            this.putQueryParameter("SubscribeSegmentSize", subscribeSegmentSize);
            this.subscribeSegmentSize = subscribeSegmentSize;
            return this;
        }

        /**
         * The type of the bill to which you want to subscribe. Valid values: PartnerBillingItemDetailForBillingPeriod, PartnerBillingItemDetailMonthly, PartnerInstanceDetailForBillingPeriod, and PartnerInstanceDetailMonthly.
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
