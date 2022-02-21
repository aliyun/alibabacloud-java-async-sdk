// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolicyGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyGroupRequest</p>
 */
public class ModifyPolicyGroupRequest extends Request {
    @Query
    @NameInMap("AuthorizeAccessPolicyRule")
    private java.util.List < AuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    @Query
    @NameInMap("AuthorizeSecurityPolicyRule")
    private java.util.List < AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    @Query
    @NameInMap("ClientType")
    private java.util.List < ClientType> clientType;

    @Query
    @NameInMap("Clipboard")
    private String clipboard;

    @Query
    @NameInMap("DomainList")
    private String domainList;

    @Query
    @NameInMap("GpuAcceleration")
    private String gpuAcceleration;

    @Query
    @NameInMap("Html5Access")
    private String html5Access;

    @Query
    @NameInMap("Html5FileTransfer")
    private String html5FileTransfer;

    @Query
    @NameInMap("LocalDrive")
    private String localDrive;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PolicyGroupId")
    @Validation(required = true)
    private String policyGroupId;

    @Query
    @NameInMap("PreemptLogin")
    private String preemptLogin;

    @Query
    @NameInMap("PreemptLoginUser")
    private java.util.List < String > preemptLoginUser;

    @Query
    @NameInMap("PrinterRedirection")
    private String printerRedirection;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RevokeAccessPolicyRule")
    private java.util.List < RevokeAccessPolicyRule> revokeAccessPolicyRule;

    @Query
    @NameInMap("RevokeSecurityPolicyRule")
    private java.util.List < RevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    @Query
    @NameInMap("UsbRedirect")
    private String usbRedirect;

    @Query
    @NameInMap("UsbSupplyRedirectRule")
    private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule;

    @Query
    @NameInMap("VisualQuality")
    private String visualQuality;

    @Query
    @NameInMap("Watermark")
    private String watermark;

    @Query
    @NameInMap("WatermarkCustomText")
    private String watermarkCustomText;

    @Query
    @NameInMap("WatermarkTransparency")
    private String watermarkTransparency;

    @Query
    @NameInMap("WatermarkType")
    private String watermarkType;

    private ModifyPolicyGroupRequest(Builder builder) {
        super(builder);
        this.authorizeAccessPolicyRule = builder.authorizeAccessPolicyRule;
        this.authorizeSecurityPolicyRule = builder.authorizeSecurityPolicyRule;
        this.clientType = builder.clientType;
        this.clipboard = builder.clipboard;
        this.domainList = builder.domainList;
        this.gpuAcceleration = builder.gpuAcceleration;
        this.html5Access = builder.html5Access;
        this.html5FileTransfer = builder.html5FileTransfer;
        this.localDrive = builder.localDrive;
        this.name = builder.name;
        this.policyGroupId = builder.policyGroupId;
        this.preemptLogin = builder.preemptLogin;
        this.preemptLoginUser = builder.preemptLoginUser;
        this.printerRedirection = builder.printerRedirection;
        this.regionId = builder.regionId;
        this.revokeAccessPolicyRule = builder.revokeAccessPolicyRule;
        this.revokeSecurityPolicyRule = builder.revokeSecurityPolicyRule;
        this.usbRedirect = builder.usbRedirect;
        this.usbSupplyRedirectRule = builder.usbSupplyRedirectRule;
        this.visualQuality = builder.visualQuality;
        this.watermark = builder.watermark;
        this.watermarkCustomText = builder.watermarkCustomText;
        this.watermarkTransparency = builder.watermarkTransparency;
        this.watermarkType = builder.watermarkType;
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
     * @return authorizeAccessPolicyRule
     */
    public java.util.List < AuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRule() {
        return this.authorizeAccessPolicyRule;
    }

    /**
     * @return authorizeSecurityPolicyRule
     */
    public java.util.List < AuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
    }

    /**
     * @return clientType
     */
    public java.util.List < ClientType> getClientType() {
        return this.clientType;
    }

    /**
     * @return clipboard
     */
    public String getClipboard() {
        return this.clipboard;
    }

    /**
     * @return domainList
     */
    public String getDomainList() {
        return this.domainList;
    }

    /**
     * @return gpuAcceleration
     */
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    /**
     * @return html5Access
     */
    public String getHtml5Access() {
        return this.html5Access;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return preemptLogin
     */
    public String getPreemptLogin() {
        return this.preemptLogin;
    }

    /**
     * @return preemptLoginUser
     */
    public java.util.List < String > getPreemptLoginUser() {
        return this.preemptLoginUser;
    }

    /**
     * @return printerRedirection
     */
    public String getPrinterRedirection() {
        return this.printerRedirection;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return revokeAccessPolicyRule
     */
    public java.util.List < RevokeAccessPolicyRule> getRevokeAccessPolicyRule() {
        return this.revokeAccessPolicyRule;
    }

    /**
     * @return revokeSecurityPolicyRule
     */
    public java.util.List < RevokeSecurityPolicyRule> getRevokeSecurityPolicyRule() {
        return this.revokeSecurityPolicyRule;
    }

    /**
     * @return usbRedirect
     */
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    /**
     * @return usbSupplyRedirectRule
     */
    public java.util.List < UsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
        return this.usbSupplyRedirectRule;
    }

    /**
     * @return visualQuality
     */
    public String getVisualQuality() {
        return this.visualQuality;
    }

    /**
     * @return watermark
     */
    public String getWatermark() {
        return this.watermark;
    }

    /**
     * @return watermarkCustomText
     */
    public String getWatermarkCustomText() {
        return this.watermarkCustomText;
    }

    /**
     * @return watermarkTransparency
     */
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
    }

    /**
     * @return watermarkType
     */
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static final class Builder extends Request.Builder<ModifyPolicyGroupRequest, Builder> {
        private java.util.List < AuthorizeAccessPolicyRule> authorizeAccessPolicyRule; 
        private java.util.List < AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule; 
        private java.util.List < ClientType> clientType; 
        private String clipboard; 
        private String domainList; 
        private String gpuAcceleration; 
        private String html5Access; 
        private String html5FileTransfer; 
        private String localDrive; 
        private String name; 
        private String policyGroupId; 
        private String preemptLogin; 
        private java.util.List < String > preemptLoginUser; 
        private String printerRedirection; 
        private String regionId; 
        private java.util.List < RevokeAccessPolicyRule> revokeAccessPolicyRule; 
        private java.util.List < RevokeSecurityPolicyRule> revokeSecurityPolicyRule; 
        private String usbRedirect; 
        private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule; 
        private String visualQuality; 
        private String watermark; 
        private String watermarkCustomText; 
        private String watermarkTransparency; 
        private String watermarkType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyGroupRequest response) {
            super(response);
            this.authorizeAccessPolicyRule = response.authorizeAccessPolicyRule;
            this.authorizeSecurityPolicyRule = response.authorizeSecurityPolicyRule;
            this.clientType = response.clientType;
            this.clipboard = response.clipboard;
            this.domainList = response.domainList;
            this.gpuAcceleration = response.gpuAcceleration;
            this.html5Access = response.html5Access;
            this.html5FileTransfer = response.html5FileTransfer;
            this.localDrive = response.localDrive;
            this.name = response.name;
            this.policyGroupId = response.policyGroupId;
            this.preemptLogin = response.preemptLogin;
            this.preemptLoginUser = response.preemptLoginUser;
            this.printerRedirection = response.printerRedirection;
            this.regionId = response.regionId;
            this.revokeAccessPolicyRule = response.revokeAccessPolicyRule;
            this.revokeSecurityPolicyRule = response.revokeSecurityPolicyRule;
            this.usbRedirect = response.usbRedirect;
            this.usbSupplyRedirectRule = response.usbSupplyRedirectRule;
            this.visualQuality = response.visualQuality;
            this.watermark = response.watermark;
            this.watermarkCustomText = response.watermarkCustomText;
            this.watermarkTransparency = response.watermarkTransparency;
            this.watermarkType = response.watermarkType;
        } 

        /**
         * AuthorizeAccessPolicyRule.
         */
        public Builder authorizeAccessPolicyRule(java.util.List < AuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
            this.putQueryParameter("AuthorizeAccessPolicyRule", authorizeAccessPolicyRule);
            this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
            return this;
        }

        /**
         * AuthorizeSecurityPolicyRule.
         */
        public Builder authorizeSecurityPolicyRule(java.util.List < AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
            this.putQueryParameter("AuthorizeSecurityPolicyRule", authorizeSecurityPolicyRule);
            this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(java.util.List < ClientType> clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Clipboard.
         */
        public Builder clipboard(String clipboard) {
            this.putQueryParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * DomainList.
         */
        public Builder domainList(String domainList) {
            this.putQueryParameter("DomainList", domainList);
            this.domainList = domainList;
            return this;
        }

        /**
         * GpuAcceleration.
         */
        public Builder gpuAcceleration(String gpuAcceleration) {
            this.putQueryParameter("GpuAcceleration", gpuAcceleration);
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }

        /**
         * Html5Access.
         */
        public Builder html5Access(String html5Access) {
            this.putQueryParameter("Html5Access", html5Access);
            this.html5Access = html5Access;
            return this;
        }

        /**
         * Html5FileTransfer.
         */
        public Builder html5FileTransfer(String html5FileTransfer) {
            this.putQueryParameter("Html5FileTransfer", html5FileTransfer);
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }

        /**
         * LocalDrive.
         */
        public Builder localDrive(String localDrive) {
            this.putQueryParameter("LocalDrive", localDrive);
            this.localDrive = localDrive;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * PreemptLogin.
         */
        public Builder preemptLogin(String preemptLogin) {
            this.putQueryParameter("PreemptLogin", preemptLogin);
            this.preemptLogin = preemptLogin;
            return this;
        }

        /**
         * PreemptLoginUser.
         */
        public Builder preemptLoginUser(java.util.List < String > preemptLoginUser) {
            this.putQueryParameter("PreemptLoginUser", preemptLoginUser);
            this.preemptLoginUser = preemptLoginUser;
            return this;
        }

        /**
         * PrinterRedirection.
         */
        public Builder printerRedirection(String printerRedirection) {
            this.putQueryParameter("PrinterRedirection", printerRedirection);
            this.printerRedirection = printerRedirection;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RevokeAccessPolicyRule.
         */
        public Builder revokeAccessPolicyRule(java.util.List < RevokeAccessPolicyRule> revokeAccessPolicyRule) {
            this.putQueryParameter("RevokeAccessPolicyRule", revokeAccessPolicyRule);
            this.revokeAccessPolicyRule = revokeAccessPolicyRule;
            return this;
        }

        /**
         * RevokeSecurityPolicyRule.
         */
        public Builder revokeSecurityPolicyRule(java.util.List < RevokeSecurityPolicyRule> revokeSecurityPolicyRule) {
            this.putQueryParameter("RevokeSecurityPolicyRule", revokeSecurityPolicyRule);
            this.revokeSecurityPolicyRule = revokeSecurityPolicyRule;
            return this;
        }

        /**
         * UsbRedirect.
         */
        public Builder usbRedirect(String usbRedirect) {
            this.putQueryParameter("UsbRedirect", usbRedirect);
            this.usbRedirect = usbRedirect;
            return this;
        }

        /**
         * UsbSupplyRedirectRule.
         */
        public Builder usbSupplyRedirectRule(java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule) {
            this.putQueryParameter("UsbSupplyRedirectRule", usbSupplyRedirectRule);
            this.usbSupplyRedirectRule = usbSupplyRedirectRule;
            return this;
        }

        /**
         * VisualQuality.
         */
        public Builder visualQuality(String visualQuality) {
            this.putQueryParameter("VisualQuality", visualQuality);
            this.visualQuality = visualQuality;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(String watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        /**
         * WatermarkCustomText.
         */
        public Builder watermarkCustomText(String watermarkCustomText) {
            this.putQueryParameter("WatermarkCustomText", watermarkCustomText);
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }

        /**
         * WatermarkTransparency.
         */
        public Builder watermarkTransparency(String watermarkTransparency) {
            this.putQueryParameter("WatermarkTransparency", watermarkTransparency);
            this.watermarkTransparency = watermarkTransparency;
            return this;
        }

        /**
         * WatermarkType.
         */
        public Builder watermarkType(String watermarkType) {
            this.putQueryParameter("WatermarkType", watermarkType);
            this.watermarkType = watermarkType;
            return this;
        }

        @Override
        public ModifyPolicyGroupRequest build() {
            return new ModifyPolicyGroupRequest(this);
        } 

    } 

    public static class AuthorizeAccessPolicyRule extends TeaModel {
        @NameInMap("CidrIp")
        @Validation(required = true)
        private String cidrIp;

        @NameInMap("Description")
        private String description;

        private AuthorizeAccessPolicyRule(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeAccessPolicyRule create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 

            /**
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AuthorizeAccessPolicyRule build() {
                return new AuthorizeAccessPolicyRule(this);
            } 

        } 

    }
    public static class AuthorizeSecurityPolicyRule extends TeaModel {
        @NameInMap("CidrIp")
        private String cidrIp;

        @NameInMap("Description")
        private String description;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Type")
        private String type;

        private AuthorizeSecurityPolicyRule(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
            this.ipProtocol = builder.ipProtocol;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeSecurityPolicyRule create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String type; 

            /**
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AuthorizeSecurityPolicyRule build() {
                return new AuthorizeSecurityPolicyRule(this);
            } 

        } 

    }
    public static class ClientType extends TeaModel {
        @NameInMap("ClientType")
        private String clientType;

        @NameInMap("Status")
        private String status;

        private ClientType(Builder builder) {
            this.clientType = builder.clientType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientType create() {
            return builder().build();
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clientType; 
            private String status; 

            /**
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClientType build() {
                return new ClientType(this);
            } 

        } 

    }
    public static class RevokeAccessPolicyRule extends TeaModel {
        @NameInMap("CidrIp")
        private String cidrIp;

        @NameInMap("Description")
        private String description;

        private RevokeAccessPolicyRule(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RevokeAccessPolicyRule create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 

            /**
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public RevokeAccessPolicyRule build() {
                return new RevokeAccessPolicyRule(this);
            } 

        } 

    }
    public static class RevokeSecurityPolicyRule extends TeaModel {
        @NameInMap("CidrIp")
        private String cidrIp;

        @NameInMap("Description")
        private String description;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Type")
        private String type;

        private RevokeSecurityPolicyRule(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
            this.ipProtocol = builder.ipProtocol;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RevokeSecurityPolicyRule create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String type; 

            /**
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RevokeSecurityPolicyRule build() {
                return new RevokeSecurityPolicyRule(this);
            } 

        } 

    }
    public static class UsbSupplyRedirectRule extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceClass")
        private String deviceClass;

        @NameInMap("DeviceSubclass")
        private String deviceSubclass;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("UsbRedirectType")
        private Long usbRedirectType;

        @NameInMap("UsbRuleType")
        private Long usbRuleType;

        @NameInMap("VendorId")
        private String vendorId;

        private UsbSupplyRedirectRule(Builder builder) {
            this.description = builder.description;
            this.deviceClass = builder.deviceClass;
            this.deviceSubclass = builder.deviceSubclass;
            this.productId = builder.productId;
            this.usbRedirectType = builder.usbRedirectType;
            this.usbRuleType = builder.usbRuleType;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsbSupplyRedirectRule create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceClass
         */
        public String getDeviceClass() {
            return this.deviceClass;
        }

        /**
         * @return deviceSubclass
         */
        public String getDeviceSubclass() {
            return this.deviceSubclass;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return usbRedirectType
         */
        public Long getUsbRedirectType() {
            return this.usbRedirectType;
        }

        /**
         * @return usbRuleType
         */
        public Long getUsbRuleType() {
            return this.usbRuleType;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        public static final class Builder {
            private String description; 
            private String deviceClass; 
            private String deviceSubclass; 
            private String productId; 
            private Long usbRedirectType; 
            private Long usbRuleType; 
            private String vendorId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceClass.
             */
            public Builder deviceClass(String deviceClass) {
                this.deviceClass = deviceClass;
                return this;
            }

            /**
             * DeviceSubclass.
             */
            public Builder deviceSubclass(String deviceSubclass) {
                this.deviceSubclass = deviceSubclass;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * UsbRedirectType.
             */
            public Builder usbRedirectType(Long usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * UsbRuleType.
             */
            public Builder usbRuleType(Long usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * VendorId.
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            public UsbSupplyRedirectRule build() {
                return new UsbSupplyRedirectRule(this);
            } 

        } 

    }
}
