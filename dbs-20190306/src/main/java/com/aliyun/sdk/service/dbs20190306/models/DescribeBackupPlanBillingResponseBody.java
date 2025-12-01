// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribeBackupPlanBillingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanBillingResponseBody</p>
 */
public class DescribeBackupPlanBillingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Item")
    private Item item;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeBackupPlanBillingResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.item = builder.item;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPlanBillingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return item
     */
    public Item getItem() {
        return this.item;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Item item; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeBackupPlanBillingResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.item = model.item;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This backupPlan can&quot;t support this action</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The billing information of the backup schedule.</p>
         */
        public Builder item(Item item) {
            this.item = item;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EB4DFD5E-3618-498D-BE35-4DBEA0072122</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupPlanBillingResponseBody build() {
            return new DescribeBackupPlanBillingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupPlanBillingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlanBillingResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyChargeType")
        private String buyChargeType;

        @com.aliyun.core.annotation.NameInMap("BuyCreateTimestamp")
        private Long buyCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("BuyExpiredTimestamp")
        private Long buyExpiredTimestamp;

        @com.aliyun.core.annotation.NameInMap("BuySpec")
        private String buySpec;

        @com.aliyun.core.annotation.NameInMap("ContStorageSize")
        private Long contStorageSize;

        @com.aliyun.core.annotation.NameInMap("FullStorageSize")
        private Long fullStorageSize;

        @com.aliyun.core.annotation.NameInMap("IsExpired")
        private Boolean isExpired;

        @com.aliyun.core.annotation.NameInMap("IsFreeBytesUnlimited")
        private Boolean isFreeBytesUnlimited;

        @com.aliyun.core.annotation.NameInMap("PaiedBytes")
        private Long paiedBytes;

        @com.aliyun.core.annotation.NameInMap("QuotaEndTimestamp")
        private Long quotaEndTimestamp;

        @com.aliyun.core.annotation.NameInMap("QuotaStartTimestamp")
        private Long quotaStartTimestamp;

        @com.aliyun.core.annotation.NameInMap("TotalFreeBytes")
        private Long totalFreeBytes;

        @com.aliyun.core.annotation.NameInMap("UsedFullBytes")
        private Long usedFullBytes;

        @com.aliyun.core.annotation.NameInMap("UsedIncrementBytes")
        private Long usedIncrementBytes;

        private Item(Builder builder) {
            this.buyChargeType = builder.buyChargeType;
            this.buyCreateTimestamp = builder.buyCreateTimestamp;
            this.buyExpiredTimestamp = builder.buyExpiredTimestamp;
            this.buySpec = builder.buySpec;
            this.contStorageSize = builder.contStorageSize;
            this.fullStorageSize = builder.fullStorageSize;
            this.isExpired = builder.isExpired;
            this.isFreeBytesUnlimited = builder.isFreeBytesUnlimited;
            this.paiedBytes = builder.paiedBytes;
            this.quotaEndTimestamp = builder.quotaEndTimestamp;
            this.quotaStartTimestamp = builder.quotaStartTimestamp;
            this.totalFreeBytes = builder.totalFreeBytes;
            this.usedFullBytes = builder.usedFullBytes;
            this.usedIncrementBytes = builder.usedIncrementBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return buyChargeType
         */
        public String getBuyChargeType() {
            return this.buyChargeType;
        }

        /**
         * @return buyCreateTimestamp
         */
        public Long getBuyCreateTimestamp() {
            return this.buyCreateTimestamp;
        }

        /**
         * @return buyExpiredTimestamp
         */
        public Long getBuyExpiredTimestamp() {
            return this.buyExpiredTimestamp;
        }

        /**
         * @return buySpec
         */
        public String getBuySpec() {
            return this.buySpec;
        }

        /**
         * @return contStorageSize
         */
        public Long getContStorageSize() {
            return this.contStorageSize;
        }

        /**
         * @return fullStorageSize
         */
        public Long getFullStorageSize() {
            return this.fullStorageSize;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return isFreeBytesUnlimited
         */
        public Boolean getIsFreeBytesUnlimited() {
            return this.isFreeBytesUnlimited;
        }

        /**
         * @return paiedBytes
         */
        public Long getPaiedBytes() {
            return this.paiedBytes;
        }

        /**
         * @return quotaEndTimestamp
         */
        public Long getQuotaEndTimestamp() {
            return this.quotaEndTimestamp;
        }

        /**
         * @return quotaStartTimestamp
         */
        public Long getQuotaStartTimestamp() {
            return this.quotaStartTimestamp;
        }

        /**
         * @return totalFreeBytes
         */
        public Long getTotalFreeBytes() {
            return this.totalFreeBytes;
        }

        /**
         * @return usedFullBytes
         */
        public Long getUsedFullBytes() {
            return this.usedFullBytes;
        }

        /**
         * @return usedIncrementBytes
         */
        public Long getUsedIncrementBytes() {
            return this.usedIncrementBytes;
        }

        public static final class Builder {
            private String buyChargeType; 
            private Long buyCreateTimestamp; 
            private Long buyExpiredTimestamp; 
            private String buySpec; 
            private Long contStorageSize; 
            private Long fullStorageSize; 
            private Boolean isExpired; 
            private Boolean isFreeBytesUnlimited; 
            private Long paiedBytes; 
            private Long quotaEndTimestamp; 
            private Long quotaStartTimestamp; 
            private Long totalFreeBytes; 
            private Long usedFullBytes; 
            private Long usedIncrementBytes; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.buyChargeType = model.buyChargeType;
                this.buyCreateTimestamp = model.buyCreateTimestamp;
                this.buyExpiredTimestamp = model.buyExpiredTimestamp;
                this.buySpec = model.buySpec;
                this.contStorageSize = model.contStorageSize;
                this.fullStorageSize = model.fullStorageSize;
                this.isExpired = model.isExpired;
                this.isFreeBytesUnlimited = model.isFreeBytesUnlimited;
                this.paiedBytes = model.paiedBytes;
                this.quotaEndTimestamp = model.quotaEndTimestamp;
                this.quotaStartTimestamp = model.quotaStartTimestamp;
                this.totalFreeBytes = model.totalFreeBytes;
                this.usedFullBytes = model.usedFullBytes;
                this.usedIncrementBytes = model.usedIncrementBytes;
            } 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PREPAY</li>
             * <li>POSTPAY</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder buyChargeType(String buyChargeType) {
                this.buyChargeType = buyChargeType;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the instance was purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder buyCreateTimestamp(Long buyCreateTimestamp) {
                this.buyCreateTimestamp = buyCreateTimestamp;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the instance expires.</p>
             * <blockquote>
             * <p>This parameter is available only if the value of the BuyChargeType parameter is PREPAY.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder buyExpiredTimestamp(Long buyExpiredTimestamp) {
                this.buyExpiredTimestamp = buyExpiredTimestamp;
                return this;
            }

            /**
             * <p>The specifications of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>micro</p>
             */
            public Builder buySpec(String buySpec) {
                this.buySpec = buySpec;
                return this;
            }

            /**
             * <p>The size of the built-in storage for storing incremental backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>12134</p>
             */
            public Builder contStorageSize(Long contStorageSize) {
                this.contStorageSize = contStorageSize;
                return this;
            }

            /**
             * <p>The size of the built-in storage for storing full backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>13123</p>
             */
            public Builder fullStorageSize(Long fullStorageSize) {
                this.fullStorageSize = fullStorageSize;
                return this;
            }

            /**
             * <p>Indicates whether the instance expired.</p>
             * <blockquote>
             * <p>This parameter is available only if the value of the BuyChargeType parameter is PREPAY.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * <p>Indicates whether the instance has no backup traffic limit.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFreeBytesUnlimited(Boolean isFreeBytesUnlimited) {
                this.isFreeBytesUnlimited = isFreeBytesUnlimited;
                return this;
            }

            /**
             * <p>The total paid backup traffic in the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>213213</p>
             */
            public Builder paiedBytes(Long paiedBytes) {
                this.paiedBytes = paiedBytes;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the billing cycle of free backup traffic ends.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder quotaEndTimestamp(Long quotaEndTimestamp) {
                this.quotaEndTimestamp = quotaEndTimestamp;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the billing cycle of free backup traffic starts.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder quotaStartTimestamp(Long quotaStartTimestamp) {
                this.quotaStartTimestamp = quotaStartTimestamp;
                return this;
            }

            /**
             * <p>The total free backup traffic in the current month.</p>
             * <blockquote>
             * <p>This parameter is available only if the value of the BuyChargeType parameter is PREPAY and the value of the IsFreeBytesUnlimited parameter is false.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>13123</p>
             */
            public Builder totalFreeBytes(Long totalFreeBytes) {
                this.totalFreeBytes = totalFreeBytes;
                return this;
            }

            /**
             * <p>The paid full backup traffic in the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>1312313</p>
             */
            public Builder usedFullBytes(Long usedFullBytes) {
                this.usedFullBytes = usedFullBytes;
                return this;
            }

            /**
             * <p>The paid incremental backup traffic in the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>131231</p>
             */
            public Builder usedIncrementBytes(Long usedIncrementBytes) {
                this.usedIncrementBytes = usedIncrementBytes;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
}
