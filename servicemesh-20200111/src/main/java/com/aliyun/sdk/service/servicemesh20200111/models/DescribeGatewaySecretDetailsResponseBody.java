// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaySecretDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewaySecretDetailsResponseBody</p>
 */
public class DescribeGatewaySecretDetailsResponseBody extends TeaModel {
    @NameInMap("GatewaySecretDetails")
    private java.util.List < GatewaySecretDetails> gatewaySecretDetails;

    @NameInMap("RequestId")
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

    /**
     * @return gatewaySecretDetails
     */
    public java.util.List < GatewaySecretDetails> getGatewaySecretDetails() {
        return this.gatewaySecretDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GatewaySecretDetails> gatewaySecretDetails; 
        private String requestId; 

        /**
         * GatewaySecretDetails.
         */
        public Builder gatewaySecretDetails(java.util.List < GatewaySecretDetails> gatewaySecretDetails) {
            this.gatewaySecretDetails = gatewaySecretDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGatewaySecretDetailsResponseBody build() {
            return new DescribeGatewaySecretDetailsResponseBody(this);
        } 

    } 

    public static class GatewaySecretDetails extends TeaModel {
        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("GatewayName")
        private String gatewayName;

        @NameInMap("IssueTime")
        private String issueTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("SNI")
        private String SNI;

        @NameInMap("SecretName")
        private String secretName;

        @NameInMap("State")
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

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GatewayName.
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * IssueTime.
             */
            public Builder issueTime(String issueTime) {
                this.issueTime = issueTime;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * SNI.
             */
            public Builder SNI(String SNI) {
                this.SNI = SNI;
                return this;
            }

            /**
             * SecretName.
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * State.
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
