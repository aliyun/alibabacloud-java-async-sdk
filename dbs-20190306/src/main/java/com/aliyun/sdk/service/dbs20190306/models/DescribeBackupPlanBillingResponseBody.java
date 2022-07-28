// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanBillingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanBillingResponseBody</p>
 */
public class DescribeBackupPlanBillingResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Item")
    private Item item;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Item.
         */
        public Builder item(Item item) {
            this.item = item;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupPlanBillingResponseBody build() {
            return new DescribeBackupPlanBillingResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("BuyChargeType")
        private String buyChargeType;

        @NameInMap("BuyCreateTimestamp")
        private Long buyCreateTimestamp;

        @NameInMap("BuyExpiredTimestamp")
        private Long buyExpiredTimestamp;

        @NameInMap("BuySpec")
        private String buySpec;

        @NameInMap("ContStorageSize")
        private Long contStorageSize;

        @NameInMap("FullStorageSize")
        private Long fullStorageSize;

        @NameInMap("IsExpired")
        private Boolean isExpired;

        @NameInMap("IsFreeBytesUnlimited")
        private Boolean isFreeBytesUnlimited;

        @NameInMap("PaiedBytes")
        private Long paiedBytes;

        @NameInMap("QuotaEndTimestamp")
        private Long quotaEndTimestamp;

        @NameInMap("QuotaStartTimestamp")
        private Long quotaStartTimestamp;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("TotalFreeBytes")
        private Long totalFreeBytes;

        @NameInMap("UsedFullBytes")
        private Long usedFullBytes;

        @NameInMap("UsedIncrementBytes")
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
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
            private String resourceGroupId; 
            private Long totalFreeBytes; 
            private Long usedFullBytes; 
            private Long usedIncrementBytes; 

            /**
             * BuyChargeType.
             */
            public Builder buyChargeType(String buyChargeType) {
                this.buyChargeType = buyChargeType;
                return this;
            }

            /**
             * BuyCreateTimestamp.
             */
            public Builder buyCreateTimestamp(Long buyCreateTimestamp) {
                this.buyCreateTimestamp = buyCreateTimestamp;
                return this;
            }

            /**
             * BuyExpiredTimestamp.
             */
            public Builder buyExpiredTimestamp(Long buyExpiredTimestamp) {
                this.buyExpiredTimestamp = buyExpiredTimestamp;
                return this;
            }

            /**
             * BuySpec.
             */
            public Builder buySpec(String buySpec) {
                this.buySpec = buySpec;
                return this;
            }

            /**
             * ContStorageSize.
             */
            public Builder contStorageSize(Long contStorageSize) {
                this.contStorageSize = contStorageSize;
                return this;
            }

            /**
             * FullStorageSize.
             */
            public Builder fullStorageSize(Long fullStorageSize) {
                this.fullStorageSize = fullStorageSize;
                return this;
            }

            /**
             * IsExpired.
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * IsFreeBytesUnlimited.
             */
            public Builder isFreeBytesUnlimited(Boolean isFreeBytesUnlimited) {
                this.isFreeBytesUnlimited = isFreeBytesUnlimited;
                return this;
            }

            /**
             * PaiedBytes.
             */
            public Builder paiedBytes(Long paiedBytes) {
                this.paiedBytes = paiedBytes;
                return this;
            }

            /**
             * QuotaEndTimestamp.
             */
            public Builder quotaEndTimestamp(Long quotaEndTimestamp) {
                this.quotaEndTimestamp = quotaEndTimestamp;
                return this;
            }

            /**
             * QuotaStartTimestamp.
             */
            public Builder quotaStartTimestamp(Long quotaStartTimestamp) {
                this.quotaStartTimestamp = quotaStartTimestamp;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * TotalFreeBytes.
             */
            public Builder totalFreeBytes(Long totalFreeBytes) {
                this.totalFreeBytes = totalFreeBytes;
                return this;
            }

            /**
             * UsedFullBytes.
             */
            public Builder usedFullBytes(Long usedFullBytes) {
                this.usedFullBytes = usedFullBytes;
                return this;
            }

            /**
             * UsedIncrementBytes.
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
