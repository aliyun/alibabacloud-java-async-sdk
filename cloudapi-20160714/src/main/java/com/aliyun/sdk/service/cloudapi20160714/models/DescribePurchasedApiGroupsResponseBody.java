// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePurchasedApiGroupsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.purchasedApiGroupAttributes = model.purchasedApiGroupAttributes;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The attributes of the API group.</p>
         */
        public Builder purchasedApiGroupAttributes(PurchasedApiGroupAttributes purchasedApiGroupAttributes) {
            this.purchasedApiGroupAttributes = purchasedApiGroupAttributes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36BBBAD4-1CFB-489F-841A-8CA52EEA787E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePurchasedApiGroupsResponseBody build() {
            return new DescribePurchasedApiGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePurchasedApiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePurchasedApiGroupsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PurchasedApiGroupAttribute model) {
                this.billingType = model.billingType;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.invokeTimesMax = model.invokeTimesMax;
                this.invokeTimesNow = model.invokeTimesNow;
                this.purchasedTime = model.purchasedTime;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAID</p>
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * <p>The description of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the API group expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-19T00:00:00</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>8e91f23f88f94348855b82c9a73209f3</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The maximum number of calls.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder invokeTimesMax(Long invokeTimesMax) {
                this.invokeTimesMax = invokeTimesMax;
                return this;
            }

            /**
             * <p>The current number of calls.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder invokeTimesNow(Long invokeTimesNow) {
                this.invokeTimesNow = invokeTimesNow;
                return this;
            }

            /**
             * <p>The time when the API group was purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-19T00:00:00</p>
             */
            public Builder purchasedTime(String purchasedTime) {
                this.purchasedTime = purchasedTime;
                return this;
            }

            /**
             * <p>The ID of the region where the API group is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the API group.</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The API group is normal.</li>
             * <li><strong>DELETE</strong>: The API group is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
    /**
     * 
     * {@link DescribePurchasedApiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePurchasedApiGroupsResponseBody</p>
     */
    public static class PurchasedApiGroupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PurchasedApiGroupAttribute")
        private java.util.List<PurchasedApiGroupAttribute> purchasedApiGroupAttribute;

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
        public java.util.List<PurchasedApiGroupAttribute> getPurchasedApiGroupAttribute() {
            return this.purchasedApiGroupAttribute;
        }

        public static final class Builder {
            private java.util.List<PurchasedApiGroupAttribute> purchasedApiGroupAttribute; 

            private Builder() {
            } 

            private Builder(PurchasedApiGroupAttributes model) {
                this.purchasedApiGroupAttribute = model.purchasedApiGroupAttribute;
            } 

            /**
             * PurchasedApiGroupAttribute.
             */
            public Builder purchasedApiGroupAttribute(java.util.List<PurchasedApiGroupAttribute> purchasedApiGroupAttribute) {
                this.purchasedApiGroupAttribute = purchasedApiGroupAttribute;
                return this;
            }

            public PurchasedApiGroupAttributes build() {
                return new PurchasedApiGroupAttributes(this);
            } 

        } 

    }
}
