// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApiGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApiGroupsResponseBody</p>
 */
public class DescribePurchasedApiGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PurchasedApiGroupAttributes")
    private PurchasedApiGroupAttributes purchasedApiGroupAttributes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePurchasedApiGroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.purchasedApiGroupAttributes = builder.purchasedApiGroupAttributes;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurchasedApiGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return purchasedApiGroupAttributes
     */
    public PurchasedApiGroupAttributes getPurchasedApiGroupAttributes() {
        return this.purchasedApiGroupAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private PurchasedApiGroupAttributes purchasedApiGroupAttributes; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The attributes of the API group.
         */
        public Builder purchasedApiGroupAttributes(PurchasedApiGroupAttributes purchasedApiGroupAttributes) {
            this.purchasedApiGroupAttributes = purchasedApiGroupAttributes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePurchasedApiGroupsResponseBody build() {
            return new DescribePurchasedApiGroupsResponseBody(this);
        } 

    } 

    public static class PurchasedApiGroupAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingType")
        private String billingType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InvokeTimesMax")
        private Long invokeTimesMax;

        @com.aliyun.core.annotation.NameInMap("InvokeTimesNow")
        private Long invokeTimesNow;

        @com.aliyun.core.annotation.NameInMap("PurchasedTime")
        private String purchasedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PurchasedApiGroupAttribute(Builder builder) {
            this.billingType = builder.billingType;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.invokeTimesMax = builder.invokeTimesMax;
            this.invokeTimesNow = builder.invokeTimesNow;
            this.purchasedTime = builder.purchasedTime;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PurchasedApiGroupAttribute create() {
            return builder().build();
        }

        /**
         * @return billingType
         */
        public String getBillingType() {
            return this.billingType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return invokeTimesMax
         */
        public Long getInvokeTimesMax() {
            return this.invokeTimesMax;
        }

        /**
         * @return invokeTimesNow
         */
        public Long getInvokeTimesNow() {
            return this.invokeTimesNow;
        }

        /**
         * @return purchasedTime
         */
        public String getPurchasedTime() {
            return this.purchasedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String billingType; 
            private String description; 
            private String expireTime; 
            private String groupId; 
            private String groupName; 
            private Long invokeTimesMax; 
            private Long invokeTimesNow; 
            private String purchasedTime; 
            private String regionId; 
            private String status; 

            /**
             * The billing method.
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * The description of the API group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the API group expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the API group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The maximum number of calls.
             */
            public Builder invokeTimesMax(Long invokeTimesMax) {
                this.invokeTimesMax = invokeTimesMax;
                return this;
            }

            /**
             * The current number of calls.
             */
            public Builder invokeTimesNow(Long invokeTimesNow) {
                this.invokeTimesNow = invokeTimesNow;
                return this;
            }

            /**
             * The time when the API group was purchased.
             */
            public Builder purchasedTime(String purchasedTime) {
                this.purchasedTime = purchasedTime;
                return this;
            }

            /**
             * The ID of the region where the API group is located.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the API group.
             * <p>
             * 
             * *   **NORMAL**: The API group is normal.
             * *   **DELETE**: The API group is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PurchasedApiGroupAttribute build() {
                return new PurchasedApiGroupAttribute(this);
            } 

        } 

    }
    public static class PurchasedApiGroupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PurchasedApiGroupAttribute")
        private java.util.List < PurchasedApiGroupAttribute> purchasedApiGroupAttribute;

        private PurchasedApiGroupAttributes(Builder builder) {
            this.purchasedApiGroupAttribute = builder.purchasedApiGroupAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PurchasedApiGroupAttributes create() {
            return builder().build();
        }

        /**
         * @return purchasedApiGroupAttribute
         */
        public java.util.List < PurchasedApiGroupAttribute> getPurchasedApiGroupAttribute() {
            return this.purchasedApiGroupAttribute;
        }

        public static final class Builder {
            private java.util.List < PurchasedApiGroupAttribute> purchasedApiGroupAttribute; 

            /**
             * PurchasedApiGroupAttribute.
             */
            public Builder purchasedApiGroupAttribute(java.util.List < PurchasedApiGroupAttribute> purchasedApiGroupAttribute) {
                this.purchasedApiGroupAttribute = purchasedApiGroupAttribute;
                return this;
            }

            public PurchasedApiGroupAttributes build() {
                return new PurchasedApiGroupAttributes(this);
            } 

        } 

    }
}
