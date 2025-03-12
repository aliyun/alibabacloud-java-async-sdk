// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
         * <p>The SSL setting of the OceanBase cluster instance.</p>
         */
        public Builder instanceSSL(InstanceSSL instanceSSL) {
            this.instanceSSL = instanceSSL;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-xxxx-xxxx-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSSLResponseBody build() {
            return new DescribeInstanceSSLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSSLResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSSLResponseBody</p>
     */
    public static class InstanceSSL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoUpdate")
        private String autoUpdate;

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

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("ValidPeriod")
        private String validPeriod;

        private InstanceSSL(Builder builder) {
            this.autoUpdate = builder.autoUpdate;
            this.caUrl = builder.caUrl;
            this.enableSSL = builder.enableSSL;
            this.forceSSL = builder.forceSSL;
            this.forceSSLSupport = builder.forceSSLSupport;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.validPeriod = builder.validPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSSL create() {
            return builder().build();
        }

        /**
         * @return autoUpdate
         */
        public String getAutoUpdate() {
            return this.autoUpdate;
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
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return validPeriod
         */
        public String getValidPeriod() {
            return this.validPeriod;
        }

        public static final class Builder {
            private String autoUpdate; 
            private String caUrl; 
            private String enableSSL; 
            private String forceSSL; 
            private Boolean forceSSLSupport; 
            private String instanceId; 
            private String status; 
            private String tenantId; 
            private String validPeriod; 

            /**
             * <p>The status of automatic update of SSL certificates. Valid values: </p>
             * <ul>
             * <li>CLOSE: The automatic update of SSL certificates is disabled. </li>
             * <li>OPEN: The automatic update of SSL certificates is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPEN</p>
             */
            public Builder autoUpdate(String autoUpdate) {
                this.autoUpdate = autoUpdate;
                return this;
            }

            /**
             * <p>The URL of the certificate authority (CA) node.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx">https://xxxx</a></p>
             */
            public Builder caUrl(String caUrl) {
                this.caUrl = caUrl;
                return this;
            }

            /**
             * <p>The operation to modify the SSL status. Valid values:</p>
             * <ul>
             * <li><p>open: Enable SSL encryption.</p>
             * </li>
             * <li><p>update: Update the CA certificate.</p>
             * </li>
             * <li><p>close: Disable SSL encryption.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPEN</p>
             */
            public Builder enableSSL(String enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * <p>The forced enabling status of SSL.</p>
             * 
             * <strong>example:</strong>
             * <p>CLOSE</p>
             */
            public Builder forceSSL(String forceSSL) {
                this.forceSSL = forceSSL;
                return this;
            }

            /**
             * <p>Indicates whether SSL can be forcibly enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceSSLSupport(Boolean forceSSLSupport) {
                this.forceSSLSupport = forceSSLSupport;
                return this;
            }

            /**
             * <p>The ID of the OceanBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ob317v4uif****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The SSL status of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The validity period of the SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-20 07:55:03.0</p>
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
