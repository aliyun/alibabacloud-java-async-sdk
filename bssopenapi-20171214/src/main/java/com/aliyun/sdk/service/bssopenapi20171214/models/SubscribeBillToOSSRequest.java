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
    @NameInMap("BucketPath")
    private String bucketPath;

    @Query
    @NameInMap("MultAccountRelSubscribe")
    private String multAccountRelSubscribe;

    @Query
    @NameInMap("RowLimitPerFile")
    private Integer rowLimitPerFile;

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
        this.bucketPath = builder.bucketPath;
        this.multAccountRelSubscribe = builder.multAccountRelSubscribe;
        this.rowLimitPerFile = builder.rowLimitPerFile;
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
     * @return bucketPath
     */
    public String getBucketPath() {
        return this.bucketPath;
    }

    /**
     * @return multAccountRelSubscribe
     */
    public String getMultAccountRelSubscribe() {
        return this.multAccountRelSubscribe;
    }

    /**
     * @return rowLimitPerFile
     */
    public Integer getRowLimitPerFile() {
        return this.rowLimitPerFile;
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
        private String bucketPath; 
        private String multAccountRelSubscribe; 
        private Integer rowLimitPerFile; 
        private String subscribeBucket; 
        private String subscribeType; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeBillToOSSRequest request) {
            super(request);
            this.beginBillingCycle = request.beginBillingCycle;
            this.bucketOwnerId = request.bucketOwnerId;
            this.bucketPath = request.bucketPath;
            this.multAccountRelSubscribe = request.multAccountRelSubscribe;
            this.rowLimitPerFile = request.rowLimitPerFile;
            this.subscribeBucket = request.subscribeBucket;
            this.subscribeType = request.subscribeType;
        } 

        /**
         * The initial billing cycle from which bills start to be pushed. After you subscribe to the bills, the system automatically pushes the data that is generated from the initial billing cycle to the current time. If the SubscribeType parameter is set to MonthBill, this parameter is invalid. Historical data is not pushed again. The data generated within the last year can be pushed.
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * The owner ID of the OSS bucket that stores the bills. This parameter is required if you are a bidder or reseller and want to push data to an OSS bucket of a member account. In this case, you must specify this account as the account used to call this operation and grant the AliyunConsumeDump2OSSRole permission to this account. If you are a regular user, you do not need to set this parameter. By default, your account is used to call this operation.
         */
        public Builder bucketOwnerId(Long bucketOwnerId) {
            this.putQueryParameter("BucketOwnerId", bucketOwnerId);
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }

        /**
         * The path of the OSS bucket.
         */
        public Builder bucketPath(String bucketPath) {
            this.putQueryParameter("BucketPath", bucketPath);
            this.bucketPath = bucketPath;
            return this;
        }

        /**
         * The type of the account whose bills are to be pushed if multi-tier accounts are involved. Valid values:
         * <p>
         * 
         * *   MA: the master account and a non-managed member account in Finance Cloud
         * *   ACP1: a member account of a virtual network operator (VNO)
         * 
         * Default value: MA.
         */
        public Builder multAccountRelSubscribe(String multAccountRelSubscribe) {
            this.putQueryParameter("MultAccountRelSubscribe", multAccountRelSubscribe);
            this.multAccountRelSubscribe = multAccountRelSubscribe;
            return this;
        }

        /**
         * RowLimitPerFile.
         */
        public Builder rowLimitPerFile(Integer rowLimitPerFile) {
            this.putQueryParameter("RowLimitPerFile", rowLimitPerFile);
            this.rowLimitPerFile = rowLimitPerFile;
            return this;
        }

        /**
         * The OSS bucket that stores the bills to which you want to subscribe.
         */
        public Builder subscribeBucket(String subscribeBucket) {
            this.putQueryParameter("SubscribeBucket", subscribeBucket);
            this.subscribeBucket = subscribeBucket;
            return this;
        }

        /**
         * The type of the bill to which you want to subscribe. Valid values:
         * <p>
         * 
         * *   BillingItemDetailForBillingPeriod: detailed bills of billable items
         * *   InstanceDetailForBillingPeriod: detailed bills of instances
         * *   BillingItemDetailMonthly: billable item-based bills summarized by billing cycle
         * *   InstanceDetailMonthly: instance-based bills summarized by billing cycle
         * *   SplitItemDetailDaily: split bills summarized by day
         * *   MonthBill: monthly bills in the PDF format. You can subscribe to the monthly PDF bills only of the master account.
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
