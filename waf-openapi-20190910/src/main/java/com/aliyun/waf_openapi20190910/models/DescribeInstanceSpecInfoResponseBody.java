// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeInstanceSpecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecInfoResponseBody</p>
 */
public class DescribeInstanceSpecInfoResponseBody extends TeaModel {
    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceSpecInfos")
    private java.util.List < InstanceSpecInfos> instanceSpecInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Version")
    private String version;


    private DescribeInstanceSpecInfoResponseBody(Builder builder) {
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.instanceSpecInfos = builder.instanceSpecInfos;
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceSpecInfos
     */
    public java.util.List < InstanceSpecInfos> getInstanceSpecInfos() {
        return this.instanceSpecInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Long expireTime; 
        private String instanceId; 
        private java.util.List < InstanceSpecInfos> instanceSpecInfos; 
        private String requestId; 
        private String version; 

        /**
         * <p>ExpireTime.</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>InstanceSpecInfos.</p>
         */
        public Builder instanceSpecInfos(java.util.List < InstanceSpecInfos> instanceSpecInfos) {
            this.instanceSpecInfos = instanceSpecInfos;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Version.</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeInstanceSpecInfoResponseBody build() {
            return new DescribeInstanceSpecInfoResponseBody(this);
        } 

    } 

    public static class InstanceSpecInfos extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Value")
        private String value;


        private InstanceSpecInfos(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpecInfos create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * <p>Code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceSpecInfos build() {
                return new InstanceSpecInfos(this);
            } 

        } 

    }
}
