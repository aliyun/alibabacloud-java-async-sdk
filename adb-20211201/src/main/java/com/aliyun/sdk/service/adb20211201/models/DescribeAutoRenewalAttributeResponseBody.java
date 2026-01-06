// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAutoRenewalAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoRenewalAttributeResponseBody</p>
 */
public class DescribeAutoRenewalAttributeResponseBody extends TeaModel {
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

    private DescribeAutoRenewalAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoRenewalAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAutoRenewalAttributeResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of auto-renewal details.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
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
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BA0F6761-7A8C-59F8-9624-FB56788C0EDF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAutoRenewalAttributeResponseBody build() {
            return new DescribeAutoRenewalAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoRenewalAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoRenewalAttributeResponseBody</p>
     */
    public static class AutoRenewalAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewalEnabled")
        private Boolean autoRenewalEnabled;

        @com.aliyun.core.annotation.NameInMap("AutoRenewalPeriod")
        private Long autoRenewalPeriod;

        @com.aliyun.core.annotation.NameInMap("AutoRenewalPeriodUnit")
        private String autoRenewalPeriodUnit;

        @com.aliyun.core.annotation.NameInMap("AutoRenewalStatus")
        private String autoRenewalStatus;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private AutoRenewalAttribute(Builder builder) {
            this.autoRenewalEnabled = builder.autoRenewalEnabled;
            this.autoRenewalPeriod = builder.autoRenewalPeriod;
            this.autoRenewalPeriodUnit = builder.autoRenewalPeriodUnit;
            this.autoRenewalStatus = builder.autoRenewalStatus;
            this.DBClusterId = builder.DBClusterId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRenewalAttribute create() {
            return builder().build();
        }

        /**
         * @return autoRenewalEnabled
         */
        public Boolean getAutoRenewalEnabled() {
            return this.autoRenewalEnabled;
        }

        /**
         * @return autoRenewalPeriod
         */
        public Long getAutoRenewalPeriod() {
            return this.autoRenewalPeriod;
        }

        /**
         * @return autoRenewalPeriodUnit
         */
        public String getAutoRenewalPeriodUnit() {
            return this.autoRenewalPeriodUnit;
        }

        /**
         * @return autoRenewalStatus
         */
        public String getAutoRenewalStatus() {
            return this.autoRenewalStatus;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Boolean autoRenewalEnabled; 
            private Long autoRenewalPeriod; 
            private String autoRenewalPeriodUnit; 
            private String autoRenewalStatus; 
            private String DBClusterId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AutoRenewalAttribute model) {
                this.autoRenewalEnabled = model.autoRenewalEnabled;
                this.autoRenewalPeriod = model.autoRenewalPeriod;
                this.autoRenewalPeriodUnit = model.autoRenewalPeriodUnit;
                this.autoRenewalStatus = model.autoRenewalStatus;
                this.DBClusterId = model.DBClusterId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Indicates whether auto-renewal is enabled for the cluster. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enables.</li>
             * <li><strong>false</strong>: Disables.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenewalEnabled(Boolean autoRenewalEnabled) {
                this.autoRenewalEnabled = autoRenewalEnabled;
                return this;
            }

            /**
             * <p>The auto-renewal duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewalPeriod(Long autoRenewalPeriod) {
                this.autoRenewalPeriod = autoRenewalPeriod;
                return this;
            }

            /**
             * <p>The unit of auto-renewal duration. Valid values:</p>
             * <ul>
             * <li><strong>Year</strong></li>
             * <li><strong>Month</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Year</p>
             */
            public Builder autoRenewalPeriodUnit(String autoRenewalPeriodUnit) {
                this.autoRenewalPeriodUnit = autoRenewalPeriodUnit;
                return this;
            }

            /**
             * <p>The renewal method. Valid values:</p>
             * <ul>
             * <li><strong>AutoRenewal</strong>: The cluster is automatically renewed.</li>
             * <li><strong>Normal</strong>: The cluster is manually renewed. Before the cluster expires, the system sends you a reminder by SMS message.</li>
             * <li><strong>NotRenewal</strong>: The cluster is not renewed. Reminders are only sent three days before cluster expiration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AutoRenewal</p>
             */
            public Builder autoRenewalStatus(String autoRenewalStatus) {
                this.autoRenewalStatus = autoRenewalStatus;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-uf6485635fz8****</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AutoRenewalAttribute build() {
                return new AutoRenewalAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoRenewalAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoRenewalAttributeResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewalAttribute")
        private java.util.List<AutoRenewalAttribute> autoRenewalAttribute;

        private Items(Builder builder) {
            this.autoRenewalAttribute = builder.autoRenewalAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return autoRenewalAttribute
         */
        public java.util.List<AutoRenewalAttribute> getAutoRenewalAttribute() {
            return this.autoRenewalAttribute;
        }

        public static final class Builder {
            private java.util.List<AutoRenewalAttribute> autoRenewalAttribute; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.autoRenewalAttribute = model.autoRenewalAttribute;
            } 

            /**
             * AutoRenewalAttribute.
             */
            public Builder autoRenewalAttribute(java.util.List<AutoRenewalAttribute> autoRenewalAttribute) {
                this.autoRenewalAttribute = autoRenewalAttribute;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
