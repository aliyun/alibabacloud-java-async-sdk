// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAutoRenewAttributeResponseBody</p>
 */
public class DescribeInstanceAutoRenewAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRenewAttributes")
    private InstanceRenewAttributes instanceRenewAttributes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The renewal attributes of instances.</p>
         */
        public Builder instanceRenewAttributes(InstanceRenewAttributes instanceRenewAttributes) {
            this.instanceRenewAttributes = instanceRenewAttributes;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried instances.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceAutoRenewAttributeResponseBody build() {
            return new DescribeInstanceAutoRenewAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAutoRenewAttributeResponseBody</p>
     */
    public static class InstanceRenewAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("RenewalStatus")
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
             * <p>Indicates whether auto-renewal is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
                return this;
            }

            /**
             * <p>The auto-renewal duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp18x3z4hc7bixhx****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The unit of the auto-renewal duration.</p>
             * 
             * <strong>example:</strong>
             * <p>week</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The auto-renewal state of the instance. Valid values:</p>
             * <ul>
             * <li>AutoRenewal: Auto-renewal is enabled for the instance.</li>
             * <li>Normal: Auto-renewal is disabled for the instance.</li>
             * <li>NotRenewal: The instance is not to be renewed. The system sends no more expiration reminders, but sends only a non-renewal reminder three days before the expiration date. For an instance that is not to be renewed, you can call the <a href="https://help.aliyun.com/document_detail/52843.html">ModifyInstanceAutoRenewAttribute</a> operation to change its auto-renewal status to <code>Normal</code>. Then, you can manually renew the instance or enable auto-renewal for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
    /**
     * 
     * {@link DescribeInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAutoRenewAttributeResponseBody</p>
     */
    public static class InstanceRenewAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceRenewAttribute")
        private java.util.List<InstanceRenewAttribute> instanceRenewAttribute;

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
        public java.util.List<InstanceRenewAttribute> getInstanceRenewAttribute() {
            return this.instanceRenewAttribute;
        }

        public static final class Builder {
            private java.util.List<InstanceRenewAttribute> instanceRenewAttribute; 

            /**
             * InstanceRenewAttribute.
             */
            public Builder instanceRenewAttribute(java.util.List<InstanceRenewAttribute> instanceRenewAttribute) {
                this.instanceRenewAttribute = instanceRenewAttribute;
                return this;
            }

            public InstanceRenewAttributes build() {
                return new InstanceRenewAttributes(this);
            } 

        } 

    }
}
