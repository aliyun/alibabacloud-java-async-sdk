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
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
    private Integer resolutionHeight;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
    private Integer resolutionWidth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Watermark")
    private Watermark watermark;

    private CreatePolicyGroupRequest(Builder builder) {
        super(builder);
        this.cameraRedirect = builder.cameraRedirect;
        this.clipboard = builder.clipboard;
        this.html5FileTransfer = builder.html5FileTransfer;
        this.localDrive = builder.localDrive;
        this.lockResolution = builder.lockResolution;
        this.netRedirectPolicy = builder.netRedirectPolicy;
        this.policyGroupName = builder.policyGroupName;
        this.policyType = builder.policyType;
        this.resolutionHeight = builder.resolutionHeight;
        this.resolutionWidth = builder.resolutionWidth;
        this.watermark = builder.watermark;
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
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
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

    /**
     * @return watermark
     */
    public Watermark getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<CreatePolicyGroupRequest, Builder> {
        private String cameraRedirect; 
        private String clipboard; 
        private String html5FileTransfer; 
        private String localDrive; 
        private String lockResolution; 
        private NetRedirectPolicy netRedirectPolicy; 
        private String policyGroupName; 
        private String policyType; 
        private Integer resolutionHeight; 
        private Integer resolutionWidth; 
        private Watermark watermark; 

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
            this.policyType = request.policyType;
            this.resolutionHeight = request.resolutionHeight;
            this.resolutionWidth = request.resolutionWidth;
            this.watermark = request.watermark;
        } 

        /**
         * <p>Specifies whether to enable the webcam redirection feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
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
         * <p>The read/write permissions on the clipboard.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: read-only.</li>
         * <li>readwrite: read and write.</li>
         * <li>off: read/write disabled.</li>
         * </ul>
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
         * <p>The file transfer policy of the Alibaba Cloud Workspace web client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>all: File upload and download are supported.</li>
         * <li>download: Only file download is supported.</li>
         * <li>upload: Only file upload is supported.</li>
         * <li>off: File upload or download is forbidden.</li>
         * </ul>
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
         * <p>The read/write permissions on the on-premises drive.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: read-only.</li>
         * <li>readwrite: ready and write.</li>
         * <li>off: read/write disabled.</li>
         * </ul>
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
         * <p>Specifies whether to lock the resolution.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
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
         * <p>The network redirection policy.</p>
         */
        public Builder netRedirectPolicy(NetRedirectPolicy netRedirectPolicy) {
            String netRedirectPolicyShrink = shrink(netRedirectPolicy, "NetRedirectPolicy", "json");
            this.putBodyParameter("NetRedirectPolicy", netRedirectPolicyShrink);
            this.netRedirectPolicy = netRedirectPolicy;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
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
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("PolicyType", policyType);
            this.policyType = policyType;
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

        /**
         * Watermark.
         */
        public Builder watermark(Watermark watermark) {
            String watermarkShrink = shrink(watermark, "Watermark", "json");
            this.putBodyParameter("Watermark", watermarkShrink);
            this.watermark = watermark;
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.ruleType = model.ruleType;
                this.target = model.target;
            } 

            /**
             * <p>The type of the rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>prc: an application package name.</li>
             * <li>domain: a domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The name of the application package or domain name.</p>
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

            private Builder() {
            } 

            private Builder(NetRedirectPolicy model) {
                this.customProxy = model.customProxy;
                this.hostAddr = model.hostAddr;
                this.netRedirect = model.netRedirect;
                this.port = model.port;
                this.proxyPassword = model.proxyPassword;
                this.proxyType = model.proxyType;
                this.proxyUserName = model.proxyUserName;
                this.rules = model.rules;
            } 

            /**
             * <p>Specifies whether to manually configure a custom proxy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder customProxy(String customProxy) {
                this.customProxy = customProxy;
                return this;
            }

            /**
             * <p>The IPv4 address of the custom proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX</p>
             */
            public Builder hostAddr(String hostAddr) {
                this.hostAddr = hostAddr;
                return this;
            }

            /**
             * <p>Specifies whether to enable the network redirection feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder netRedirect(String netRedirect) {
                this.netRedirect = netRedirect;
                return this;
            }

            /**
             * <p>The port of the custom proxy. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>1145</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The password of the proxy. The password must be 1 to 256 in length and cannot contain Chinese character or space characters.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder proxyPassword(String proxyPassword) {
                this.proxyPassword = proxyPassword;
                return this;
            }

            /**
             * <p>The type of the proxy protocol.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>socks5.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>socks5</p>
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * <p>The username of the proxy. The name must be 1 to 256 in length and cannot contain Chinese character or space characters.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder proxyUserName(String proxyUserName) {
                this.proxyUserName = proxyUserName;
                return this;
            }

            /**
             * <p>The proxy rules. You can create up to 100 proxy rules.</p>
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
    /**
     * 
     * {@link CreatePolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyGroupRequest</p>
     */
    public static class Watermark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WatermarkColor")
        private Integer watermarkColor;

        @com.aliyun.core.annotation.NameInMap("WatermarkCustomText")
        private String watermarkCustomText;

        @com.aliyun.core.annotation.NameInMap("WatermarkFontSize")
        private Integer watermarkFontSize;

        @com.aliyun.core.annotation.NameInMap("WatermarkSwitch")
        private String watermarkSwitch;

        @com.aliyun.core.annotation.NameInMap("WatermarkTransparencyValue")
        private Integer watermarkTransparencyValue;

        @com.aliyun.core.annotation.NameInMap("WatermarkTypes")
        private java.util.List<String> watermarkTypes;

        private Watermark(Builder builder) {
            this.watermarkColor = builder.watermarkColor;
            this.watermarkCustomText = builder.watermarkCustomText;
            this.watermarkFontSize = builder.watermarkFontSize;
            this.watermarkSwitch = builder.watermarkSwitch;
            this.watermarkTransparencyValue = builder.watermarkTransparencyValue;
            this.watermarkTypes = builder.watermarkTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermark create() {
            return builder().build();
        }

        /**
         * @return watermarkColor
         */
        public Integer getWatermarkColor() {
            return this.watermarkColor;
        }

        /**
         * @return watermarkCustomText
         */
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        /**
         * @return watermarkFontSize
         */
        public Integer getWatermarkFontSize() {
            return this.watermarkFontSize;
        }

        /**
         * @return watermarkSwitch
         */
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        /**
         * @return watermarkTransparencyValue
         */
        public Integer getWatermarkTransparencyValue() {
            return this.watermarkTransparencyValue;
        }

        /**
         * @return watermarkTypes
         */
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

        public static final class Builder {
            private Integer watermarkColor; 
            private String watermarkCustomText; 
            private Integer watermarkFontSize; 
            private String watermarkSwitch; 
            private Integer watermarkTransparencyValue; 
            private java.util.List<String> watermarkTypes; 

            private Builder() {
            } 

            private Builder(Watermark model) {
                this.watermarkColor = model.watermarkColor;
                this.watermarkCustomText = model.watermarkCustomText;
                this.watermarkFontSize = model.watermarkFontSize;
                this.watermarkSwitch = model.watermarkSwitch;
                this.watermarkTransparencyValue = model.watermarkTransparencyValue;
                this.watermarkTypes = model.watermarkTypes;
            } 

            /**
             * WatermarkColor.
             */
            public Builder watermarkColor(Integer watermarkColor) {
                this.watermarkColor = watermarkColor;
                return this;
            }

            /**
             * WatermarkCustomText.
             */
            public Builder watermarkCustomText(String watermarkCustomText) {
                this.watermarkCustomText = watermarkCustomText;
                return this;
            }

            /**
             * WatermarkFontSize.
             */
            public Builder watermarkFontSize(Integer watermarkFontSize) {
                this.watermarkFontSize = watermarkFontSize;
                return this;
            }

            /**
             * WatermarkSwitch.
             */
            public Builder watermarkSwitch(String watermarkSwitch) {
                this.watermarkSwitch = watermarkSwitch;
                return this;
            }

            /**
             * WatermarkTransparencyValue.
             */
            public Builder watermarkTransparencyValue(Integer watermarkTransparencyValue) {
                this.watermarkTransparencyValue = watermarkTransparencyValue;
                return this;
            }

            /**
             * WatermarkTypes.
             */
            public Builder watermarkTypes(java.util.List<String> watermarkTypes) {
                this.watermarkTypes = watermarkTypes;
                return this;
            }

            public Watermark build() {
                return new Watermark(this);
            } 

        } 

    }
}
