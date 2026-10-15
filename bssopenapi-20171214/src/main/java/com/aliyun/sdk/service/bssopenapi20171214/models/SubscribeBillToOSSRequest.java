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
         * <p>The start billing cycle for pushing. After a successful subscription, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly bill PDF subscriptions, and historical data is not re-pushed. Data within the last year can be pushed.</p>
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
         * <p>The UID of the OSS owner that stores the files. Specify this parameter if you are a Bid/Reseller subscriber and need to push files to a sub-account\&quot;s OSS. The specified account must be a sub-account of the calling account, and the AliyunConsumeDump2OSSRole permission must be granted to this account. Regular users do not need to specify this parameter. The default value is the calling account.</p>
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
         * <p>The specified directory under the bucket to which the subscription is delivered.</p>
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
         * <p>For multi-level accounts, specifies the type of bills to push. Valid values:</p>
         * <ul>
         * <li>MA: Pushes bills for the primary account and non-trusteeship linked accounts in the financial cloud.</li>
         * <li>ACP1: Pushes bills for Partner Platform V2.0 sub-accounts.</li>
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
         * <p>The maximum number of rows per file. If a bill file exceeds this limit, it is split into multiple files and compressed into a single archive.</p>
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
         * <p>The name of the OSS bucket that stores the subscribed bill files.</p>
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
         * <p>The type of the subscribed bill. Valid values:</p>
         * <ul>
         * <li>BillingItemDetailForBillingPeriod: billing item details.</li>
         * <li>InstanceDetailForBillingPeriod: instance bill details.</li>
         * <li>BillingItemDetailMonthly: billing item summary by billing cycle.</li>
         * <li>InstanceDetailMonthly: instance bill summary by billing cycle.</li>
         * <li>SplitItemDetailDaily: split bill daily summary.</li>
         * <li>MonthBill: monthly bill PDF. Only MA subscription is supported.</li>
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
         * <p>Specifies whether to use the Secure Sockets Layer (SSL) encryption protocol to protect network communication. Valid values:</p>
         * <ul>
         * <li><p>true: Enables SSL encryption to ensure the security and integrity of data transmission.</p>
         * </li>
         * <li><p>false (default): Does not enable SSL encryption.</p>
         * </li>
         * </ul>
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
