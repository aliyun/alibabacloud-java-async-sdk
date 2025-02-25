// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSSLResponseBody</p>
 */
public class DescribeInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSSL")
    private InstanceSSL instanceSSL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceSSLResponseBody(Builder builder) {
        this.instanceSSL = builder.instanceSSL;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSSLResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceSSL
     */
    public InstanceSSL getInstanceSSL() {
        return this.instanceSSL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceSSL instanceSSL; 
        private String requestId; 

        /**
         * InstanceSSL.
         */
        public Builder instanceSSL(InstanceSSL instanceSSL) {
            this.instanceSSL = instanceSSL;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSSLResponseBody build() {
            return new DescribeInstanceSSLResponseBody(this);
        } 

    } 

    public static class InstanceSSL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaUrl")
        private String caUrl;

        @com.aliyun.core.annotation.NameInMap("EnableSSL")
        private String enableSSL;

        @com.aliyun.core.annotation.NameInMap("ForceSSL")
        private String forceSSL;

        @com.aliyun.core.annotation.NameInMap("ForceSSLSupport")
        private Boolean forceSSLSupport;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ValidPeriod")
        private String validPeriod;

        private InstanceSSL(Builder builder) {
            this.caUrl = builder.caUrl;
            this.enableSSL = builder.enableSSL;
            this.forceSSL = builder.forceSSL;
            this.forceSSLSupport = builder.forceSSLSupport;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.validPeriod = builder.validPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSSL create() {
            return builder().build();
        }

        /**
         * @return caUrl
         */
        public String getCaUrl() {
            return this.caUrl;
        }

        /**
         * @return enableSSL
         */
        public String getEnableSSL() {
            return this.enableSSL;
        }

        /**
         * @return forceSSL
         */
        public String getForceSSL() {
            return this.forceSSL;
        }

        /**
         * @return forceSSLSupport
         */
        public Boolean getForceSSLSupport() {
            return this.forceSSLSupport;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validPeriod
         */
        public String getValidPeriod() {
            return this.validPeriod;
        }

        public static final class Builder {
            private String caUrl; 
            private String enableSSL; 
            private String forceSSL; 
            private Boolean forceSSLSupport; 
            private String instanceId; 
            private String status; 
            private String validPeriod; 

            /**
             * CaUrl.
             */
            public Builder caUrl(String caUrl) {
                this.caUrl = caUrl;
                return this;
            }

            /**
             * EnableSSL.
             */
            public Builder enableSSL(String enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * ForceSSL.
             */
            public Builder forceSSL(String forceSSL) {
                this.forceSSL = forceSSL;
                return this;
            }

            /**
             * ForceSSLSupport.
             */
            public Builder forceSSLSupport(Boolean forceSSLSupport) {
                this.forceSSLSupport = forceSSLSupport;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ValidPeriod.
             */
            public Builder validPeriod(String validPeriod) {
                this.validPeriod = validPeriod;
                return this;
            }

            public InstanceSSL build() {
                return new InstanceSSL(this);
            } 

        } 

    }
}
