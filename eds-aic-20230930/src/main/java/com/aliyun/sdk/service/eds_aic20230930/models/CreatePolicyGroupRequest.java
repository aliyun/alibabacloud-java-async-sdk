// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
    @com.aliyun.core.annotation.NameInMap("LockResolution")
    private String lockResolution;

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
        this.lockResolution = builder.lockResolution;
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
        private String lockResolution; 
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
            this.lockResolution = request.lockResolution;
            this.netRedirectPolicy = request.netRedirectPolicy;
            this.policyGroupName = request.policyGroupName;
            this.resolutionHeight = request.resolutionHeight;
            this.resolutionWidth = request.resolutionWidth;
        } 

        /**
         * <p>Whether to enable local camera redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder cameraRedirect(String cameraRedirect) {
            this.putBodyParameter("CameraRedirect", cameraRedirect);
            this.cameraRedirect = cameraRedirect;
            return this;
        }

        /**
         * <p>Clipboard permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        public Builder clipboard(String clipboard) {
            this.putBodyParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * <p>File transfer policy for the Alibaba Cloud Workspace web client.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder html5FileTransfer(String html5FileTransfer) {
            this.putBodyParameter("Html5FileTransfer", html5FileTransfer);
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }

        /**
         * <p>Local disk mapping permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder localDrive(String localDrive) {
            this.putBodyParameter("LocalDrive", localDrive);
            this.localDrive = localDrive;
            return this;
        }

        /**
         * <p>Whether to lock the resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder lockResolution(String lockResolution) {
            this.putBodyParameter("LockResolution", lockResolution);
            this.lockResolution = lockResolution;
            return this;
        }

        /**
         * <p>Network redirection.</p>
         */
        public Builder netRedirectPolicy(NetRedirectPolicy netRedirectPolicy) {
            String netRedirectPolicyShrink = shrink(netRedirectPolicy, "NetRedirectPolicy", "json");
            this.putBodyParameter("NetRedirectPolicy", netRedirectPolicyShrink);
            this.netRedirectPolicy = netRedirectPolicy;
            return this;
        }

        /**
         * <p>Policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultPolicy</p>
         */
        public Builder policyGroupName(String policyGroupName) {
            this.putBodyParameter("PolicyGroupName", policyGroupName);
            this.policyGroupName = policyGroupName;
            return this;
        }

        /**
         * <p>The height of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        public Builder resolutionHeight(Integer resolutionHeight) {
            this.putBodyParameter("ResolutionHeight", resolutionHeight);
            this.resolutionHeight = resolutionHeight;
            return this;
        }

        /**
         * <p>The width of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
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

    /**
     * 
     * {@link CreatePolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyGroupRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        private Rules(Builder builder) {
            this.ruleType = builder.ruleType;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
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
            private String ruleType; 
            private String target; 

            /**
             * <p>Rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>Application package name or domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyGroupRequest</p>
     */
    public static class NetRedirectPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomProxy")
        private String customProxy;

        @com.aliyun.core.annotation.NameInMap("HostAddr")
        private String hostAddr;

        @com.aliyun.core.annotation.NameInMap("NetRedirect")
        private String netRedirect;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProxyPassword")
        private String proxyPassword;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        @com.aliyun.core.annotation.NameInMap("ProxyUserName")
        private String proxyUserName;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private NetRedirectPolicy(Builder builder) {
            this.customProxy = builder.customProxy;
            this.hostAddr = builder.hostAddr;
            this.netRedirect = builder.netRedirect;
            this.port = builder.port;
            this.proxyPassword = builder.proxyPassword;
            this.proxyType = builder.proxyType;
            this.proxyUserName = builder.proxyUserName;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetRedirectPolicy create() {
            return builder().build();
        }

        /**
         * @return customProxy
         */
        public String getCustomProxy() {
            return this.customProxy;
        }

        /**
         * @return hostAddr
         */
        public String getHostAddr() {
            return this.hostAddr;
        }

        /**
         * @return netRedirect
         */
        public String getNetRedirect() {
            return this.netRedirect;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return proxyPassword
         */
        public String getProxyPassword() {
            return this.proxyPassword;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        /**
         * @return proxyUserName
         */
        public String getProxyUserName() {
            return this.proxyUserName;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String customProxy; 
            private String hostAddr; 
            private String netRedirect; 
            private String port; 
            private String proxyPassword; 
            private String proxyType; 
            private String proxyUserName; 
            private java.util.List<Rules> rules; 

            /**
             * <p>Whether to manually configure a transparent proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder customProxy(String customProxy) {
                this.customProxy = customProxy;
                return this;
            }

            /**
             * <p>Transparent proxy IP. Format: IPv4 address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX</p>
             */
            public Builder hostAddr(String hostAddr) {
                this.hostAddr = hostAddr;
                return this;
            }

            /**
             * <p>Whether to enable network redirection.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder netRedirect(String netRedirect) {
                this.netRedirect = netRedirect;
                return this;
            }

            /**
             * <p>Transparent proxy port. Port value range is 1~65535.</p>
             * 
             * <strong>example:</strong>
             * <p>1145</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Proxy password. Length range is 1~256, and it must not contain Chinese characters or whitespace.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder proxyPassword(String proxyPassword) {
                this.proxyPassword = proxyPassword;
                return this;
            }

            /**
             * <p>Proxy protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>socks5</p>
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * <p>Proxy username. Length range is 1~256, and it must not contain Chinese characters or whitespace.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder proxyUserName(String proxyUserName) {
                this.proxyUserName = proxyUserName;
                return this;
            }

            /**
             * <p>List of proxy rules (up to 100).</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public NetRedirectPolicy build() {
                return new NetRedirectPolicy(this);
            } 

        } 

    }
}
