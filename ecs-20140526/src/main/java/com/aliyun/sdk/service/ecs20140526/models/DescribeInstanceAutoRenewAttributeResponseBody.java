// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAutoRenewAttributeResponseBody</p>
 */
public class DescribeInstanceAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("InstanceRenewAttributes")
    private InstanceRenewAttributes instanceRenewAttributes;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceAutoRenewAttributeResponseBody(Builder builder) {
        this.instanceRenewAttributes = builder.instanceRenewAttributes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceRenewAttributes
     */
    public InstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
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
        private InstanceRenewAttributes instanceRenewAttributes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceRenewAttributes.
         */
        public Builder instanceRenewAttributes(InstanceRenewAttributes instanceRenewAttributes) {
            this.instanceRenewAttributes = instanceRenewAttributes;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeInstanceAutoRenewAttributeResponseBody build() {
            return new DescribeInstanceAutoRenewAttributeResponseBody(this);
        } 

    } 

    public static class InstanceRenewAttribute extends TeaModel {
        @NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("RenewalStatus")
        private String renewalStatus;

        private InstanceRenewAttribute(Builder builder) {
            this.autoRenewEnabled = builder.autoRenewEnabled;
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
            this.periodUnit = builder.periodUnit;
            this.renewalStatus = builder.renewalStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRenewAttribute create() {
            return builder().build();
        }

        /**
         * @return autoRenewEnabled
         */
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return renewalStatus
         */
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public static final class Builder {
            private Boolean autoRenewEnabled; 
            private Integer duration; 
            private String instanceId; 
            private String periodUnit; 
            private String renewalStatus; 

            /**
             * AutoRenewEnabled.
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * RenewalStatus.
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
                return this;
            }

            public InstanceRenewAttribute build() {
                return new InstanceRenewAttribute(this);
            } 

        } 

    }
    public static class InstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        private java.util.List < InstanceRenewAttribute> instanceRenewAttribute;

        private InstanceRenewAttributes(Builder builder) {
            this.instanceRenewAttribute = builder.instanceRenewAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRenewAttributes create() {
            return builder().build();
        }

        /**
         * @return instanceRenewAttribute
         */
        public java.util.List < InstanceRenewAttribute> getInstanceRenewAttribute() {
            return this.instanceRenewAttribute;
        }

        public static final class Builder {
            private java.util.List < InstanceRenewAttribute> instanceRenewAttribute; 

            /**
             * InstanceRenewAttribute.
             */
            public Builder instanceRenewAttribute(java.util.List < InstanceRenewAttribute> instanceRenewAttribute) {
                this.instanceRenewAttribute = instanceRenewAttribute;
                return this;
            }

            public InstanceRenewAttributes build() {
                return new InstanceRenewAttributes(this);
            } 

        } 

    }
}
