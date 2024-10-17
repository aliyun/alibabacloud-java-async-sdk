// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPolicyGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyGroupRequest</p>
 */
public class ModifyPolicyGroupRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("LockResolution")
    private String lockResolution;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetRedirectPolicy")
    private NetRedirectPolicy netRedirectPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
    private String policyGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
    private Integer resolutionHeight;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
    private Integer resolutionWidth;

    private ModifyPolicyGroupRequest(Builder builder) {
        super(builder);
        this.cameraRedirect = builder.cameraRedirect;
        this.clipboard = builder.clipboard;
        this.html5FileTransfer = builder.html5FileTransfer;
        this.localDrive = builder.localDrive;
        this.lockResolution = builder.lockResolution;
        this.netRedirectPolicy = builder.netRedirectPolicy;
        this.policyGroupId = builder.policyGroupId;
        this.policyGroupName = builder.policyGroupName;
        this.resolutionHeight = builder.resolutionHeight;
        this.resolutionWidth = builder.resolutionWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolicyGroupRequest create() {
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
     * @return lockResolution
     */
    public String getLockResolution() {
        return this.lockResolution;
    }

    /**
     * @return netRedirectPolicy
     */
    public NetRedirectPolicy getNetRedirectPolicy() {
        return this.netRedirectPolicy;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
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

    public static final class Builder extends Request.Builder<ModifyPolicyGroupRequest, Builder> {
        private String cameraRedirect; 
        private String clipboard; 
        private String html5FileTransfer; 
        private String localDrive; 
        private String lockResolution; 
        private NetRedirectPolicy netRedirectPolicy; 
        private String policyGroupId; 
        private String policyGroupName; 
        private Integer resolutionHeight; 
        private Integer resolutionWidth; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyGroupRequest request) {
            super(request);
            this.cameraRedirect = request.cameraRedirect;
            this.clipboard = request.clipboard;
            this.html5FileTransfer = request.html5FileTransfer;
            this.localDrive = request.localDrive;
            this.lockResolution = request.lockResolution;
            this.netRedirectPolicy = request.netRedirectPolicy;
            this.policyGroupId = request.policyGroupId;
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
         * LockResolution.
         */
        public Builder lockResolution(String lockResolution) {
            this.putBodyParameter("LockResolution", lockResolution);
            this.lockResolution = lockResolution;
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
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putBodyParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
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
        public ModifyPolicyGroupRequest build() {
            return new ModifyPolicyGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
     */
    public static class NetRedirectPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetRedirect")
        private String netRedirect;

        private NetRedirectPolicy(Builder builder) {
            this.netRedirect = builder.netRedirect;
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

        public static final class Builder {
            private String netRedirect; 

            /**
             * NetRedirect.
             */
            public Builder netRedirect(String netRedirect) {
                this.netRedirect = netRedirect;
                return this;
            }

            public NetRedirectPolicy build() {
                return new NetRedirectPolicy(this);
            } 

        } 

    }
}
