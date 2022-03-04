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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("InstanceRenewAttributes")
    private InstanceRenewAttributes instanceRenewAttributes;

    private DescribeInstanceAutoRenewAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.instanceRenewAttributes = builder.instanceRenewAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return instanceRenewAttributes
     */
    public InstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
    }

    public static final class Builder {
        private String requestId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer totalCount; 
        private InstanceRenewAttributes instanceRenewAttributes; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The total number of returned instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of instance renewal attributes InstanceRenewAttribute.
         */
        public Builder instanceRenewAttributes(InstanceRenewAttributes instanceRenewAttributes) {
            this.instanceRenewAttributes = instanceRenewAttributes;
            return this;
        }

        public DescribeInstanceAutoRenewAttributeResponseBody build() {
            return new DescribeInstanceAutoRenewAttributeResponseBody(this);
        } 

    } 

    public static class InstanceRenewAttribute extends TeaModel {
        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("RenewalStatus")
        private String renewalStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        private InstanceRenewAttribute(Builder builder) {
            this.periodUnit = builder.periodUnit;
            this.duration = builder.duration;
            this.renewalStatus = builder.renewalStatus;
            this.instanceId = builder.instanceId;
            this.autoRenewEnabled = builder.autoRenewEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRenewAttribute create() {
            return builder().build();
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return renewalStatus
         */
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return autoRenewEnabled
         */
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public static final class Builder {
            private String periodUnit; 
            private Integer duration; 
            private String renewalStatus; 
            private String instanceId; 
            private Boolean autoRenewEnabled; 

            /**
             * The unit of the automatic renewal period.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The automatic renewal period.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The automatic renewal status of the instance. Possible values:
             * <p>
             * 
             * -AutoRenewal: set to automatic renewal.
             * 
             * -Normal: Cancels automatic renewal.
             * 
             * -NotRenewal: no renewal is required. The system does not send expiration reminders, but only sends non-renewal reminders three days before expiration. If you no longer renew an ECS instance, you can change it from [ModifyInstanceAutoRenewAttribute](~~ 52843 ~~) to pending ("Normal"), and then renew it by yourself or set it to automatic.
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether automatic renewal is enabled.
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
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
