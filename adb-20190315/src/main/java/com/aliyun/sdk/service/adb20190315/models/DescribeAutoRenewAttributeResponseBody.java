// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoRenewAttributeResponseBody</p>
 */
public class DescribeAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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

        public DescribeAutoRenewAttributeResponseBody build() {
            return new DescribeAutoRenewAttributeResponseBody(this);
        } 

    } 

    public static class AutoRenewAttribute extends TeaModel {
        @NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RenewalStatus")
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
             * AutoRenewEnabled.
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
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
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RenewalStatus.
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
    public static class Items extends TeaModel {
        @NameInMap("AutoRenewAttribute")
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
