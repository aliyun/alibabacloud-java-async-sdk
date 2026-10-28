// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
         * <p>The billing month from which to start pushing bills. Format: yyyy-MM.</p>
         * <p>After a successful subscription, the system automatically pushes data from the start billing cycle to the current time. Data for up to the last six months (including the current month) can be pushed. If the specified month exceeds this range, the subscription is invalid.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10</p>
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * <p>The bill file format. Valid values:</p>
         * <ul>
         * <li>csv</li>
         * <li>parquet</li>
         * </ul>
         * <p>If you subscribe to multiple file types, use separate buckets to avoid file overwriting.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>csv</p>
         */
        public Builder billFormat(String billFormat) {
            this.putQueryParameter("BillFormat", billFormat);
            this.billFormat = billFormat;
            return this;
        }

        /**
         * <p>The UID of the account that owns the OSS bucket for storing files.</p>
         * <p>If a partner subscribes and needs to push files to the OSS bucket of a subordinate partner account, this account must be a subordinate partner account of the partner account. Grant the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subordinate partner account. </p>
         * <p>If a partner subscribes and pushes files to the partner account\&quot;s own OSS bucket, grant the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the partner account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5569414254138836</p>
         */
        public Builder bucketOwnerId(Long bucketOwnerId) {
            this.putQueryParameter("BucketOwnerId", bucketOwnerId);
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }

        /**
         * <p>The name of the OSS bucket for storing bill files.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bill-bucket</p>
         */
        public Builder subscribeBucket(String subscribeBucket) {
            this.putQueryParameter("SubscribeBucket", subscribeBucket);
            this.subscribeBucket = subscribeBucket;
            return this;
        }

        /**
         * <p>The row count threshold for a single bill file. If the number of rows exceeds this threshold, the file is automatically split into multiple files. The naming convention for split files is <code>uid_billType_billCycle_SquenceNo_fileNo</code>.</p>
         * <p>All information in the file names is identical except for fileNo. These files belong to the same billing cycle and the same file type but are split into multiple files.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder subscribeSegmentSize(Integer subscribeSegmentSize) {
            this.putQueryParameter("SubscribeSegmentSize", subscribeSegmentSize);
            this.subscribeSegmentSize = subscribeSegmentSize;
            return this;
        }

        /**
         * <p>The subscription type. Valid values: </p>
         * <ul>
         * <li>PartnerBillingItemDetailForBillingPeriod: billing item detail.</li>
         * <li>PartnerBillingItemDetailMonthly: billing item monthly bill.</li>
         * <li>PartnerInstanceDetailForBillingPeriod: instance bill detail.</li>
         * <li>PartnerInstanceDetailMonthly: instance monthly bill.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PartnerBillingItemDetailForBillingPeriod</p>
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
