// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeGatewaySecretDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewaySecretDetailsResponseBody</p>
 */
public class DescribeGatewaySecretDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewaySecretDetails")
    private java.util.List<GatewaySecretDetails> gatewaySecretDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGatewaySecretDetailsResponseBody(Builder builder) {
        this.gatewaySecretDetails = builder.gatewaySecretDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewaySecretDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewaySecretDetails
     */
    public java.util.List<GatewaySecretDetails> getGatewaySecretDetails() {
        return this.gatewaySecretDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GatewaySecretDetails> gatewaySecretDetails; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGatewaySecretDetailsResponseBody model) {
            this.gatewaySecretDetails = model.gatewaySecretDetails;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information about the secret of the ASM gateway.</p>
         */
        public Builder gatewaySecretDetails(java.util.List<GatewaySecretDetails> gatewaySecretDetails) {
            this.gatewaySecretDetails = gatewaySecretDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGatewaySecretDetailsResponseBody build() {
            return new DescribeGatewaySecretDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGatewaySecretDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGatewaySecretDetailsResponseBody</p>
     */
    public static class GatewaySecretDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("IssueTime")
        private String issueTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SNI")
        private String SNI;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private GatewaySecretDetails(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.gatewayName = builder.gatewayName;
            this.issueTime = builder.issueTime;
            this.message = builder.message;
            this.SNI = builder.SNI;
            this.secretName = builder.secretName;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewaySecretDetails create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return issueTime
         */
        public String getIssueTime() {
            return this.issueTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return SNI
         */
        public String getSNI() {
            return this.SNI;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String expiredTime; 
            private String gatewayName; 
            private String issueTime; 
            private String message; 
            private String SNI; 
            private String secretName; 
            private String state; 

            private Builder() {
            } 

            private Builder(GatewaySecretDetails model) {
                this.expiredTime = model.expiredTime;
                this.gatewayName = model.gatewayName;
                this.issueTime = model.issueTime;
                this.message = model.message;
                this.SNI = model.SNI;
                this.secretName = model.secretName;
                this.state = model.state;
            } 

            /**
             * <p>The time when the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-03 07:45</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The name of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>bookinfo-gateway</p>
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * <p>The time when the certificate was issued.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-03 07:45</p>
             */
            public Builder issueTime(String issueTime) {
                this.issueTime = issueTime;
                return this;
            }

            /**
             * <ul>
             * <li>An error message is returned if the status of the gateway is abnormal. Examples: <code>tls.crt not exist</code>, <code>tls.key not exist</code>, and <code>secret type must be kubernetes.io/tls</code>.</li>
             * <li>An empty value is returned if the status of the gateway is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tls.crt not exist</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The Server Name Indication (SNI) value.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.com</p>
             */
            public Builder SNI(String SNI) {
                this.SNI = SNI;
                return this;
            }

            /**
             * <p>The name of the secret.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-secret</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * <p>The status of the certificate. Valid values:</p>
             * <ul>
             * <li><code>normal</code></li>
             * <li><code>abnormal</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public GatewaySecretDetails build() {
                return new GatewaySecretDetails(this);
            } 

        } 

    }
}
