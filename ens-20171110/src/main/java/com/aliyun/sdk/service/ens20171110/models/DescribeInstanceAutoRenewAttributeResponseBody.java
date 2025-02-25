// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("InstanceRenewAttributes")
    private InstanceRenewAttributes instanceRenewAttributes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAutoRenewAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceRenewAttributes = builder.instanceRenewAttributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceRenewAttributes
     */
    public InstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private InstanceRenewAttributes instanceRenewAttributes; 
        private String requestId; 

        /**
         * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The renewal status of the instance.</p>
         */
        public Builder instanceRenewAttributes(InstanceRenewAttributes instanceRenewAttributes) {
            this.instanceRenewAttributes = instanceRenewAttributes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4DD66F05-3116-4BAA-B588-52EB2E7F431D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstanceRenewAttribute(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRenewAttribute create() {
            return builder().build();
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean autoRenewal; 
            private String duration; 
            private String instanceId; 

            /**
             * <p>The renewal type of the instance.</p>
             * <ul>
             * <li><strong>true</strong>: enables auto-renewal.</li>
             * <li><strong>false</strong>: disables auto-renewal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * <p>The unit of the auto-renewal period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5ci7l7k1m9m2zmhp4iw3o****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
