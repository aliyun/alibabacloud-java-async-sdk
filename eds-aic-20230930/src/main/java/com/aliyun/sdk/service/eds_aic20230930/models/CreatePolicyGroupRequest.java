// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyGroupRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyGroupRequest</p>
 */
public class CreatePolicyGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CameraRedirect")
    private String cameraRedirect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Clipboard")
    private String clipboard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
    private String html5FileTransfer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocalDrive")
    private String localDrive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetRedirectPolicy")
    private NetRedirectPolicy netRedirectPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
    private String policyGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
    private Integer resolutionHeight;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
    private Integer resolutionWidth;

    private CreatePolicyGroupRequest(Builder builder) {
        super(builder);
        this.cameraRedirect = builder.cameraRedirect;
        this.clipboard = builder.clipboard;
        this.html5FileTransfer = builder.html5FileTransfer;
        this.localDrive = builder.localDrive;
        this.netRedirectPolicy = builder.netRedirectPolicy;
        this.policyGroupName = builder.policyGroupName;
        this.resolutionHeight = builder.resolutionHeight;
        this.resolutionWidth = builder.resolutionWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cameraRedirect
     */
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    /**
     * @return clipboard
     */
    public String getClipboard() {
        return this.clipboard;
    }

    /**
     * @return html5FileTransfer
     */
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    /**
     * @return localDrive
     */
    public String getLocalDrive() {
        return this.localDrive;
    }

    /**
     * @return netRedirectPolicy
     */
    public NetRedirectPolicy getNetRedirectPolicy() {
        return this.netRedirectPolicy;
    }

    /**
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    /**
     * @return resolutionHeight
     */
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    /**
     * @return resolutionWidth
     */
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public static final class Builder extends Request.Builder<CreatePolicyGroupRequest, Builder> {
        private String cameraRedirect; 
        private String clipboard; 
        private String html5FileTransfer; 
        private String localDrive; 
        private NetRedirectPolicy netRedirectPolicy; 
        private String policyGroupName; 
        private Integer resolutionHeight; 
        private Integer resolutionWidth; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyGroupRequest request) {
            super(request);
            this.cameraRedirect = request.cameraRedirect;
            this.clipboard = request.clipboard;
            this.html5FileTransfer = request.html5FileTransfer;
            this.localDrive = request.localDrive;
            this.netRedirectPolicy = request.netRedirectPolicy;
            this.policyGroupName = request.policyGroupName;
            this.resolutionHeight = request.resolutionHeight;
            this.resolutionWidth = request.resolutionWidth;
        } 

        /**
         * CameraRedirect.
         */
        public Builder cameraRedirect(String cameraRedirect) {
            this.putBodyParameter("CameraRedirect", cameraRedirect);
            this.cameraRedirect = cameraRedirect;
            return this;
        }

        /**
         * Clipboard.
         */
        public Builder clipboard(String clipboard) {
            this.putBodyParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * Html5FileTransfer.
         */
        public Builder html5FileTransfer(String html5FileTransfer) {
            this.putBodyParameter("Html5FileTransfer", html5FileTransfer);
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }

        /**
         * LocalDrive.
         */
        public Builder localDrive(String localDrive) {
            this.putBodyParameter("LocalDrive", localDrive);
            this.localDrive = localDrive;
            return this;
        }

        /**
         * NetRedirectPolicy.
         */
        public Builder netRedirectPolicy(NetRedirectPolicy netRedirectPolicy) {
            String netRedirectPolicyShrink = shrink(netRedirectPolicy, "NetRedirectPolicy", "json");
            this.putBodyParameter("NetRedirectPolicy", netRedirectPolicyShrink);
            this.netRedirectPolicy = netRedirectPolicy;
            return this;
        }

        /**
         * PolicyGroupName.
         */
        public Builder policyGroupName(String policyGroupName) {
            this.putBodyParameter("PolicyGroupName", policyGroupName);
            this.policyGroupName = policyGroupName;
            return this;
        }

        /**
         * ResolutionHeight.
         */
        public Builder resolutionHeight(Integer resolutionHeight) {
            this.putBodyParameter("ResolutionHeight", resolutionHeight);
            this.resolutionHeight = resolutionHeight;
            return this;
        }

        /**
         * ResolutionWidth.
         */
        public Builder resolutionWidth(Integer resolutionWidth) {
            this.putBodyParameter("ResolutionWidth", resolutionWidth);
            this.resolutionWidth = resolutionWidth;
            return this;
        }

        @Override
        public CreatePolicyGroupRequest build() {
            return new CreatePolicyGroupRequest(this);
        } 

    } 

    public static class NetRedirectRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        private NetRedirectRule(Builder builder) {
            this.policy = builder.policy;
            this.ruleType = builder.ruleType;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetRedirectRule create() {
            return builder().build();
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String policy; 
            private String ruleType; 
            private String target; 

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public NetRedirectRule build() {
                return new NetRedirectRule(this);
            } 

        } 

    }
    public static class NetRedirectPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetRedirect")
        private String netRedirect;

        @com.aliyun.core.annotation.NameInMap("NetRedirectRule")
        private java.util.List < NetRedirectRule> netRedirectRule;

        private NetRedirectPolicy(Builder builder) {
            this.netRedirect = builder.netRedirect;
            this.netRedirectRule = builder.netRedirectRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetRedirectPolicy create() {
            return builder().build();
        }

        /**
         * @return netRedirect
         */
        public String getNetRedirect() {
            return this.netRedirect;
        }

        /**
         * @return netRedirectRule
         */
        public java.util.List < NetRedirectRule> getNetRedirectRule() {
            return this.netRedirectRule;
        }

        public static final class Builder {
            private String netRedirect; 
            private java.util.List < NetRedirectRule> netRedirectRule; 

            /**
             * NetRedirect.
             */
            public Builder netRedirect(String netRedirect) {
                this.netRedirect = netRedirect;
                return this;
            }

            /**
             * NetRedirectRule.
             */
            public Builder netRedirectRule(java.util.List < NetRedirectRule> netRedirectRule) {
                this.netRedirectRule = netRedirectRule;
                return this;
            }

            public NetRedirectPolicy build() {
                return new NetRedirectPolicy(this);
            } 

        } 

    }
}
