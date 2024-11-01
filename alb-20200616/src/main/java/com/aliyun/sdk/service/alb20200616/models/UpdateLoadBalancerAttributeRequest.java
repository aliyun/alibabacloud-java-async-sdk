// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateLoadBalancerAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoadBalancerAttributeRequest</p>
 */
public class UpdateLoadBalancerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionConfig")
    private ModificationProtectionConfig modificationProtectionConfig;

    private UpdateLoadBalancerAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.modificationProtectionConfig = builder.modificationProtectionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return modificationProtectionConfig
     */
    public ModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public static final class Builder extends Request.Builder<UpdateLoadBalancerAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private ModificationProtectionConfig modificationProtectionConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoadBalancerAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.loadBalancerId = request.loadBalancerId;
            this.loadBalancerName = request.loadBalancerName;
            this.modificationProtectionConfig = request.modificationProtectionConfig;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: performs a dry run and sends the request. If the request passes the dry run, a <code>2xx HTTP</code> status code is returned and the operation is performed. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the ALB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-o9ulmq5hgn68jk****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The name of the ALB instance. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-instance-test</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The configuration read-only mode.</p>
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.putQueryParameter("ModificationProtectionConfig", modificationProtectionConfig);
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        @Override
        public UpdateLoadBalancerAttributeRequest build() {
            return new UpdateLoadBalancerAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLoadBalancerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerAttributeRequest</p>
     */
    public static class ModificationProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ModificationProtectionConfig(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModificationProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reason; 
            private String status; 

            /**
             * <p>It must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
             * <p>This parameter takes effect only when <strong>ModificationProtectionStatus</strong> is set to <strong>ConsoleProtection</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the configuration read-only mode. Valid values:</p>
             * <ul>
             * <li><strong>NonProtection</strong>: disables the configuration read-only mode. In this case, you cannot specify <strong>ModificationProtectionReason</strong>. If you specify <strong>ModificationProtectionReason</strong>, the value of the parameter is cleared.</li>
             * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode. In this case, you can specify <strong>ModificationProtectionReason</strong>.</li>
             * </ul>
             * <blockquote>
             * <p>If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ConsoleProtection</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ModificationProtectionConfig build() {
                return new ModificationProtectionConfig(this);
            } 

        } 

    }
}
