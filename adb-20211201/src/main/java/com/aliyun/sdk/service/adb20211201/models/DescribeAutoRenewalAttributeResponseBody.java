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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
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
             * AutoRenewalEnabled.
             */
            public Builder autoRenewalEnabled(Boolean autoRenewalEnabled) {
                this.autoRenewalEnabled = autoRenewalEnabled;
                return this;
            }

            /**
             * AutoRenewalPeriod.
             */
            public Builder autoRenewalPeriod(Long autoRenewalPeriod) {
                this.autoRenewalPeriod = autoRenewalPeriod;
                return this;
            }

            /**
             * AutoRenewalPeriodUnit.
             */
            public Builder autoRenewalPeriodUnit(String autoRenewalPeriodUnit) {
                this.autoRenewalPeriodUnit = autoRenewalPeriodUnit;
                return this;
            }

            /**
             * AutoRenewalStatus.
             */
            public Builder autoRenewalStatus(String autoRenewalStatus) {
                this.autoRenewalStatus = autoRenewalStatus;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * RegionId.
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
