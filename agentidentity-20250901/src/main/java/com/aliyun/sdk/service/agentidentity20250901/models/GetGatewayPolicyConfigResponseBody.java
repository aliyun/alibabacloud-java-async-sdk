// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetGatewayPolicyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayPolicyConfigResponseBody</p>
 */
public class GetGatewayPolicyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayPolicyConfig")
    private GatewayPolicyConfig gatewayPolicyConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGatewayPolicyConfigResponseBody(Builder builder) {
        this.gatewayPolicyConfig = builder.gatewayPolicyConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayPolicyConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayPolicyConfig
     */
    public GatewayPolicyConfig getGatewayPolicyConfig() {
        return this.gatewayPolicyConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GatewayPolicyConfig gatewayPolicyConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGatewayPolicyConfigResponseBody model) {
            this.gatewayPolicyConfig = model.gatewayPolicyConfig;
            this.requestId = model.requestId;
        } 

        /**
         * GatewayPolicyConfig.
         */
        public Builder gatewayPolicyConfig(GatewayPolicyConfig gatewayPolicyConfig) {
            this.gatewayPolicyConfig = gatewayPolicyConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayPolicyConfigResponseBody build() {
            return new GetGatewayPolicyConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayPolicyConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayPolicyConfigResponseBody</p>
     */
    public static class GatewayPolicyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnforcementMode")
        private String enforcementMode;

        @com.aliyun.core.annotation.NameInMap("PolicySetArn")
        private String policySetArn;

        private GatewayPolicyConfig(Builder builder) {
            this.enforcementMode = builder.enforcementMode;
            this.policySetArn = builder.policySetArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayPolicyConfig create() {
            return builder().build();
        }

        /**
         * @return enforcementMode
         */
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        /**
         * @return policySetArn
         */
        public String getPolicySetArn() {
            return this.policySetArn;
        }

        public static final class Builder {
            private String enforcementMode; 
            private String policySetArn; 

            private Builder() {
            } 

            private Builder(GatewayPolicyConfig model) {
                this.enforcementMode = model.enforcementMode;
                this.policySetArn = model.policySetArn;
            } 

            /**
             * EnforcementMode.
             */
            public Builder enforcementMode(String enforcementMode) {
                this.enforcementMode = enforcementMode;
                return this;
            }

            /**
             * PolicySetArn.
             */
            public Builder policySetArn(String policySetArn) {
                this.policySetArn = policySetArn;
                return this;
            }

            public GatewayPolicyConfig build() {
                return new GatewayPolicyConfig(this);
            } 

        } 

    }
}
