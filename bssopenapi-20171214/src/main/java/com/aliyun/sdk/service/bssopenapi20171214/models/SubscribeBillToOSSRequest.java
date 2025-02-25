// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link SubscribeBillToOSSRequest} extends {@link RequestModel}
 *
 * <p>SubscribeBillToOSSRequest</p>
 */
public class SubscribeBillToOSSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginBillingCycle")
    private String beginBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketOwnerId")
    private Long bucketOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketPath")
    private String bucketPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultAccountRelSubscribe")
    private String multAccountRelSubscribe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RowLimitPerFile")
    private Integer rowLimitPerFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscribeBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeType")
    private String subscribeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsingSsl")
    private String usingSsl;

    private SubscribeBillToOSSRequest(Builder builder) {
        super(builder);
        this.beginBillingCycle = builder.beginBillingCycle;
        this.bucketOwnerId = builder.bucketOwnerId;
        this.bucketPath = builder.bucketPath;
        this.multAccountRelSubscribe = builder.multAccountRelSubscribe;
        this.rowLimitPerFile = builder.rowLimitPerFile;
        this.subscribeBucket = builder.subscribeBucket;
        this.subscribeType = builder.subscribeType;
        this.usingSsl = builder.usingSsl;
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

    /**
     * @return usingSsl
     */
    public String getUsingSsl() {
        return this.usingSsl;
    }

    public static final class Builder extends Request.Builder<SubscribeBillToOSSRequest, Builder> {
        private String beginBillingCycle; 
        private Long bucketOwnerId; 
        private String bucketPath; 
        private String multAccountRelSubscribe; 
        private Integer rowLimitPerFile; 
        private String subscribeBucket; 
        private String subscribeType; 
        private String usingSsl; 

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
            this.usingSsl = request.usingSsl;
        } 

        /**
         * <p>The initial billing cycle from which bills start to be pushed. After you subscribe to the bills, the system automatically pushes the data that is generated from the initial billing cycle to the current time. If the SubscribeType parameter is set to MonthBill, this parameter is invalid. Historical data is not pushed again. The data generated within the last year can be pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03</p>
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * <p>The owner ID of the OSS bucket that stores the bills. This parameter is required if you are a bidder or reseller and want to push data to an OSS bucket of a member account. In this case, you must specify this account as the account used to call this operation and grant the AliyunConsumeDump2OSSRole permission to this account. If you are a regular user, you do not need to set this parameter. By default, your account is used to call this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>12341324</p>
         */
        public Builder bucketOwnerId(Long bucketOwnerId) {
            this.putQueryParameter("BucketOwnerId", bucketOwnerId);
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }

        /**
         * <p>The path of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>testpath</p>
         */
        public Builder bucketPath(String bucketPath) {
            this.putQueryParameter("BucketPath", bucketPath);
            this.bucketPath = bucketPath;
            return this;
        }

        /**
         * <p>The type of the account whose bills are to be pushed if multi-tier accounts are involved. Valid values:</p>
         * <ul>
         * <li>MA: the master account and a non-managed member account in Finance Cloud</li>
         * <li>ACP1: a member account of a virtual network operator (VNO)</li>
         * </ul>
         * <p>Default value: MA.</p>
         * 
         * <strong>example:</strong>
         * <p>MA</p>
         */
        public Builder multAccountRelSubscribe(String multAccountRelSubscribe) {
            this.putQueryParameter("MultAccountRelSubscribe", multAccountRelSubscribe);
            this.multAccountRelSubscribe = multAccountRelSubscribe;
            return this;
        }

        /**
         * <p>The upper limit of the number of lines in a single file. When the bill file exceeds the upper limit, it will be split into multiple files and merged into a compressed package.</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
         */
        public Builder rowLimitPerFile(Integer rowLimitPerFile) {
            this.putQueryParameter("RowLimitPerFile", rowLimitPerFile);
            this.rowLimitPerFile = rowLimitPerFile;
            return this;
        }

        /**
         * <p>The OSS bucket that stores the bills to which you want to subscribe.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx-bucket</p>
         */
        public Builder subscribeBucket(String subscribeBucket) {
            this.putQueryParameter("SubscribeBucket", subscribeBucket);
            this.subscribeBucket = subscribeBucket;
            return this;
        }

        /**
         * <p>The type of the bill to which you want to subscribe. Valid values:</p>
         * <ul>
         * <li>BillingItemDetailForBillingPeriod: detailed bills of billable items</li>
         * <li>InstanceDetailForBillingPeriod: detailed bills of instances</li>
         * <li>BillingItemDetailMonthly: billable item-based bills summarized by billing cycle</li>
         * <li>InstanceDetailMonthly: instance-based bills summarized by billing cycle</li>
         * <li>SplitItemDetailDaily: split bills summarized by day</li>
         * <li>MonthBill: monthly bills in the PDF format. You can subscribe to the monthly PDF bills only of the master account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BillingItemDetailForBillingPeriod</p>
         */
        public Builder subscribeType(String subscribeType) {
            this.putQueryParameter("SubscribeType", subscribeType);
            this.subscribeType = subscribeType;
            return this;
        }

        /**
         * <p>Whether to protect network communications through the SSL (Secure Sockets Layer) encryption protocol. When this parameter is set to true, it means that SSL encryption is enabled to ensure the security and integrity of data transmission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder usingSsl(String usingSsl) {
            this.putQueryParameter("UsingSsl", usingSsl);
            this.usingSsl = usingSsl;
            return this;
        }

        @Override
        public SubscribeBillToOSSRequest build() {
            return new SubscribeBillToOSSRequest(this);
        } 

    } 

}
