// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApiGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApiGroupsResponseBody</p>
 */
public class DescribePurchasedApiGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PurchasedApiGroupAttributes")
    private PurchasedApiGroupAttributes purchasedApiGroupAttributes;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PurchasedApiGroupAttributes.
         */
        public Builder purchasedApiGroupAttributes(PurchasedApiGroupAttributes purchasedApiGroupAttributes) {
            this.purchasedApiGroupAttributes = purchasedApiGroupAttributes;
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
         * TotalCount.
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
        @NameInMap("BillingType")
        private String billingType;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("GroupDescription")
        private String groupDescription;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("InvokeTimesMax")
        private Long invokeTimesMax;

        @NameInMap("InvokeTimesNow")
        private Long invokeTimesNow;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RegionId")
        private String regionId;

        private PurchasedApiGroupAttribute(Builder builder) {
            this.billingType = builder.billingType;
            this.createdTime = builder.createdTime;
            this.expireTime = builder.expireTime;
            this.groupDescription = builder.groupDescription;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.invokeTimesMax = builder.invokeTimesMax;
            this.invokeTimesNow = builder.invokeTimesNow;
            this.modifiedTime = builder.modifiedTime;
            this.regionId = builder.regionId;
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
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return groupDescription
         */
        public String getGroupDescription() {
            return this.groupDescription;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String billingType; 
            private String createdTime; 
            private String expireTime; 
            private String groupDescription; 
            private String groupId; 
            private String groupName; 
            private Long invokeTimesMax; 
            private Long invokeTimesNow; 
            private String modifiedTime; 
            private String regionId; 

            /**
             * BillingType.
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GroupDescription.
             */
            public Builder groupDescription(String groupDescription) {
                this.groupDescription = groupDescription;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * InvokeTimesMax.
             */
            public Builder invokeTimesMax(Long invokeTimesMax) {
                this.invokeTimesMax = invokeTimesMax;
                return this;
            }

            /**
             * InvokeTimesNow.
             */
            public Builder invokeTimesNow(Long invokeTimesNow) {
                this.invokeTimesNow = invokeTimesNow;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public PurchasedApiGroupAttribute build() {
                return new PurchasedApiGroupAttribute(this);
            } 

        } 

    }
    public static class PurchasedApiGroupAttributes extends TeaModel {
        @NameInMap("PurchasedApiGroupAttribute")
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
