// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoRenewAttributeResponseBody</p>
 */
public class DescribeAutoRenewAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeAutoRenewAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * <p>The renewal information about the clusters.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>65D7ACE6-4A61-4B6E-B357-8CB24A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAutoRenewAttributeResponseBody build() {
            return new DescribeAutoRenewAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoRenewAttributeResponseBody</p>
     */
    public static class AutoRenewAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RenewalStatus")
        private String renewalStatus;

        private AutoRenewAttribute(Builder builder) {
            this.autoRenewEnabled = builder.autoRenewEnabled;
            this.DBClusterId = builder.DBClusterId;
            this.duration = builder.duration;
            this.periodUnit = builder.periodUnit;
            this.regionId = builder.regionId;
            this.renewalStatus = builder.renewalStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRenewAttribute create() {
            return builder().build();
        }

        /**
         * @return autoRenewEnabled
         */
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return renewalStatus
         */
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public static final class Builder {
            private Boolean autoRenewEnabled; 
            private String DBClusterId; 
            private Integer duration; 
            private String periodUnit; 
            private String regionId; 
            private String renewalStatus; 

            /**
             * <p>Indicates whether the auto-renewal feature is enabled. Valid values:</p>
             * <ul>
             * <li>true: enabled</li>
             * <li>false: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-*****************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The renewal duration.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The unit of the duration. Valid values:</p>
             * <ul>
             * <li>Year</li>
             * <li>Month</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The renewal status. Valid values:</p>
             * <ul>
             * <li>AutoRenewal: The cluster is automatically renewed.</li>
             * <li>Normal: The cluster is manually renewed. The system sends a text message to remind you before the cluster expires.</li>
             * <li>NotRenewal: The cluster is not renewed. The system does not send a reminder for expiration but only sends a text message three days before the cluster expires to remind you that the cluster is not renewed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AutoRenewal</p>
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
                return this;
            }

            public AutoRenewAttribute build() {
                return new AutoRenewAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoRenewAttributeResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewAttribute")
        private java.util.List < AutoRenewAttribute> autoRenewAttribute;

        private Items(Builder builder) {
            this.autoRenewAttribute = builder.autoRenewAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return autoRenewAttribute
         */
        public java.util.List < AutoRenewAttribute> getAutoRenewAttribute() {
            return this.autoRenewAttribute;
        }

        public static final class Builder {
            private java.util.List < AutoRenewAttribute> autoRenewAttribute; 

            /**
             * AutoRenewAttribute.
             */
            public Builder autoRenewAttribute(java.util.List < AutoRenewAttribute> autoRenewAttribute) {
                this.autoRenewAttribute = autoRenewAttribute;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
