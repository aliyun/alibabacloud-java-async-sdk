// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyGroupsResponseBody</p>
 */
public class DescribePolicyGroupsResponseBody extends TeaModel {
    @NameInMap("DescribePolicyGroups")
    private java.util.List < DescribePolicyGroups> describePolicyGroups;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePolicyGroupsResponseBody(Builder builder) {
        this.describePolicyGroups = builder.describePolicyGroups;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return describePolicyGroups
     */
    public java.util.List < DescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DescribePolicyGroups> describePolicyGroups; 
        private String nextToken; 
        private String requestId; 

        /**
         * DescribePolicyGroups.
         */
        public Builder describePolicyGroups(java.util.List < DescribePolicyGroups> describePolicyGroups) {
            this.describePolicyGroups = describePolicyGroups;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolicyGroupsResponseBody build() {
            return new DescribePolicyGroupsResponseBody(this);
        } 

    } 

    public static class AuthorizeAccessPolicyRules extends TeaModel {
        @NameInMap("CidrIp")
        private String cidrIp;

        @NameInMap("Description")
        private String description;

        private AuthorizeAccessPolicyRules(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeAccessPolicyRules create() {
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

            public AuthorizeAccessPolicyRules build() {
                return new AuthorizeAccessPolicyRules(this);
            } 

        } 

    }
    public static class AuthorizeSecurityPolicyRules extends TeaModel {
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

        private AuthorizeSecurityPolicyRules(Builder builder) {
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

        public static AuthorizeSecurityPolicyRules create() {
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

            public AuthorizeSecurityPolicyRules build() {
                return new AuthorizeSecurityPolicyRules(this);
            } 

        } 

    }
    public static class ClientTypes extends TeaModel {
        @NameInMap("ClientType")
        private String clientType;

        @NameInMap("Status")
        private String status;

        private ClientTypes(Builder builder) {
            this.clientType = builder.clientType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientTypes create() {
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

            public ClientTypes build() {
                return new ClientTypes(this);
            } 

        } 

    }
    public static class DomainResolveRule extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Policy")
        private String policy;

        private DomainResolveRule(Builder builder) {
            this.description = builder.description;
            this.domain = builder.domain;
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainResolveRule create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private String description; 
            private String domain; 
            private String policy; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            public DomainResolveRule build() {
                return new DomainResolveRule(this);
            } 

        } 

    }
    public static class NetRedirectRule extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("RuleType")
        private String ruleType;

        private NetRedirectRule(Builder builder) {
            this.domain = builder.domain;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetRedirectRule create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String domain; 
            private String ruleType; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public NetRedirectRule build() {
                return new NetRedirectRule(this);
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
    public static class DescribePolicyGroups extends TeaModel {
        @NameInMap("AppContentProtection")
        private String appContentProtection;

        @NameInMap("AuthorizeAccessPolicyRules")
        private java.util.List < AuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        @NameInMap("AuthorizeSecurityPolicyRules")
        private java.util.List < AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        @NameInMap("CameraRedirect")
        private String cameraRedirect;

        @NameInMap("ClientTypes")
        private java.util.List < ClientTypes> clientTypes;

        @NameInMap("Clipboard")
        private String clipboard;

        @NameInMap("DomainList")
        private String domainList;

        @NameInMap("DomainResolveRule")
        private java.util.List < DomainResolveRule> domainResolveRule;

        @NameInMap("DomainResolveRuleType")
        private String domainResolveRuleType;

        @NameInMap("EdsCount")
        private Integer edsCount;

        @NameInMap("EndUserApplyAdminCoordinate")
        private String endUserApplyAdminCoordinate;

        @NameInMap("EndUserGroupCoordinate")
        private String endUserGroupCoordinate;

        @NameInMap("GpuAcceleration")
        private String gpuAcceleration;

        @NameInMap("Html5Access")
        private String html5Access;

        @NameInMap("Html5FileTransfer")
        private String html5FileTransfer;

        @NameInMap("InternetCommunicationProtocol")
        private String internetCommunicationProtocol;

        @NameInMap("LocalDrive")
        private String localDrive;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetRedirect")
        private String netRedirect;

        @NameInMap("NetRedirectRule")
        private java.util.List < NetRedirectRule> netRedirectRule;

        @NameInMap("PolicyGroupId")
        private String policyGroupId;

        @NameInMap("PolicyGroupType")
        private String policyGroupType;

        @NameInMap("PolicyStatus")
        private String policyStatus;

        @NameInMap("PreemptLogin")
        private String preemptLogin;

        @NameInMap("PreemptLoginUsers")
        private java.util.List < String > preemptLoginUsers;

        @NameInMap("PrinterRedirection")
        private String printerRedirection;

        @NameInMap("RecordContent")
        private String recordContent;

        @NameInMap("RecordContentExpires")
        private Long recordContentExpires;

        @NameInMap("Recording")
        private String recording;

        @NameInMap("RecordingAudio")
        private String recordingAudio;

        @NameInMap("RecordingDuration")
        private Integer recordingDuration;

        @NameInMap("RecordingEndTime")
        private String recordingEndTime;

        @NameInMap("RecordingExpires")
        private Long recordingExpires;

        @NameInMap("RecordingFps")
        private Long recordingFps;

        @NameInMap("RecordingStartTime")
        private String recordingStartTime;

        @NameInMap("RemoteCoordinate")
        private String remoteCoordinate;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("ScopeValue")
        private java.util.List < String > scopeValue;

        @NameInMap("UsbRedirect")
        private String usbRedirect;

        @NameInMap("UsbSupplyRedirectRule")
        private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule;

        @NameInMap("VideoRedirect")
        private String videoRedirect;

        @NameInMap("VisualQuality")
        private String visualQuality;

        @NameInMap("Watermark")
        private String watermark;

        @NameInMap("WatermarkColor")
        private Integer watermarkColor;

        @NameInMap("WatermarkCustomText")
        private String watermarkCustomText;

        @NameInMap("WatermarkDegree")
        private Double watermarkDegree;

        @NameInMap("WatermarkFontSize")
        private Integer watermarkFontSize;

        @NameInMap("WatermarkFontStyle")
        private String watermarkFontStyle;

        @NameInMap("WatermarkRowAmount")
        private Integer watermarkRowAmount;

        @NameInMap("WatermarkTransparency")
        private String watermarkTransparency;

        @NameInMap("WatermarkTransparencyValue")
        private Integer watermarkTransparencyValue;

        @NameInMap("WatermarkType")
        private String watermarkType;

        private DescribePolicyGroups(Builder builder) {
            this.appContentProtection = builder.appContentProtection;
            this.authorizeAccessPolicyRules = builder.authorizeAccessPolicyRules;
            this.authorizeSecurityPolicyRules = builder.authorizeSecurityPolicyRules;
            this.cameraRedirect = builder.cameraRedirect;
            this.clientTypes = builder.clientTypes;
            this.clipboard = builder.clipboard;
            this.domainList = builder.domainList;
            this.domainResolveRule = builder.domainResolveRule;
            this.domainResolveRuleType = builder.domainResolveRuleType;
            this.edsCount = builder.edsCount;
            this.endUserApplyAdminCoordinate = builder.endUserApplyAdminCoordinate;
            this.endUserGroupCoordinate = builder.endUserGroupCoordinate;
            this.gpuAcceleration = builder.gpuAcceleration;
            this.html5Access = builder.html5Access;
            this.html5FileTransfer = builder.html5FileTransfer;
            this.internetCommunicationProtocol = builder.internetCommunicationProtocol;
            this.localDrive = builder.localDrive;
            this.name = builder.name;
            this.netRedirect = builder.netRedirect;
            this.netRedirectRule = builder.netRedirectRule;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupType = builder.policyGroupType;
            this.policyStatus = builder.policyStatus;
            this.preemptLogin = builder.preemptLogin;
            this.preemptLoginUsers = builder.preemptLoginUsers;
            this.printerRedirection = builder.printerRedirection;
            this.recordContent = builder.recordContent;
            this.recordContentExpires = builder.recordContentExpires;
            this.recording = builder.recording;
            this.recordingAudio = builder.recordingAudio;
            this.recordingDuration = builder.recordingDuration;
            this.recordingEndTime = builder.recordingEndTime;
            this.recordingExpires = builder.recordingExpires;
            this.recordingFps = builder.recordingFps;
            this.recordingStartTime = builder.recordingStartTime;
            this.remoteCoordinate = builder.remoteCoordinate;
            this.scope = builder.scope;
            this.scopeValue = builder.scopeValue;
            this.usbRedirect = builder.usbRedirect;
            this.usbSupplyRedirectRule = builder.usbSupplyRedirectRule;
            this.videoRedirect = builder.videoRedirect;
            this.visualQuality = builder.visualQuality;
            this.watermark = builder.watermark;
            this.watermarkColor = builder.watermarkColor;
            this.watermarkCustomText = builder.watermarkCustomText;
            this.watermarkDegree = builder.watermarkDegree;
            this.watermarkFontSize = builder.watermarkFontSize;
            this.watermarkFontStyle = builder.watermarkFontStyle;
            this.watermarkRowAmount = builder.watermarkRowAmount;
            this.watermarkTransparency = builder.watermarkTransparency;
            this.watermarkTransparencyValue = builder.watermarkTransparencyValue;
            this.watermarkType = builder.watermarkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribePolicyGroups create() {
            return builder().build();
        }

        /**
         * @return appContentProtection
         */
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        /**
         * @return authorizeAccessPolicyRules
         */
        public java.util.List < AuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        /**
         * @return authorizeSecurityPolicyRules
         */
        public java.util.List < AuthorizeSecurityPolicyRules> getAuthorizeSecurityPolicyRules() {
            return this.authorizeSecurityPolicyRules;
        }

        /**
         * @return cameraRedirect
         */
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        /**
         * @return clientTypes
         */
        public java.util.List < ClientTypes> getClientTypes() {
            return this.clientTypes;
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
         * @return domainResolveRule
         */
        public java.util.List < DomainResolveRule> getDomainResolveRule() {
            return this.domainResolveRule;
        }

        /**
         * @return domainResolveRuleType
         */
        public String getDomainResolveRuleType() {
            return this.domainResolveRuleType;
        }

        /**
         * @return edsCount
         */
        public Integer getEdsCount() {
            return this.edsCount;
        }

        /**
         * @return endUserApplyAdminCoordinate
         */
        public String getEndUserApplyAdminCoordinate() {
            return this.endUserApplyAdminCoordinate;
        }

        /**
         * @return endUserGroupCoordinate
         */
        public String getEndUserGroupCoordinate() {
            return this.endUserGroupCoordinate;
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
         * @return internetCommunicationProtocol
         */
        public String getInternetCommunicationProtocol() {
            return this.internetCommunicationProtocol;
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

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return policyGroupType
         */
        public String getPolicyGroupType() {
            return this.policyGroupType;
        }

        /**
         * @return policyStatus
         */
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        /**
         * @return preemptLogin
         */
        public String getPreemptLogin() {
            return this.preemptLogin;
        }

        /**
         * @return preemptLoginUsers
         */
        public java.util.List < String > getPreemptLoginUsers() {
            return this.preemptLoginUsers;
        }

        /**
         * @return printerRedirection
         */
        public String getPrinterRedirection() {
            return this.printerRedirection;
        }

        /**
         * @return recordContent
         */
        public String getRecordContent() {
            return this.recordContent;
        }

        /**
         * @return recordContentExpires
         */
        public Long getRecordContentExpires() {
            return this.recordContentExpires;
        }

        /**
         * @return recording
         */
        public String getRecording() {
            return this.recording;
        }

        /**
         * @return recordingAudio
         */
        public String getRecordingAudio() {
            return this.recordingAudio;
        }

        /**
         * @return recordingDuration
         */
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        /**
         * @return recordingEndTime
         */
        public String getRecordingEndTime() {
            return this.recordingEndTime;
        }

        /**
         * @return recordingExpires
         */
        public Long getRecordingExpires() {
            return this.recordingExpires;
        }

        /**
         * @return recordingFps
         */
        public Long getRecordingFps() {
            return this.recordingFps;
        }

        /**
         * @return recordingStartTime
         */
        public String getRecordingStartTime() {
            return this.recordingStartTime;
        }

        /**
         * @return remoteCoordinate
         */
        public String getRemoteCoordinate() {
            return this.remoteCoordinate;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scopeValue
         */
        public java.util.List < String > getScopeValue() {
            return this.scopeValue;
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
         * @return videoRedirect
         */
        public String getVideoRedirect() {
            return this.videoRedirect;
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
         * @return watermarkDegree
         */
        public Double getWatermarkDegree() {
            return this.watermarkDegree;
        }

        /**
         * @return watermarkFontSize
         */
        public Integer getWatermarkFontSize() {
            return this.watermarkFontSize;
        }

        /**
         * @return watermarkFontStyle
         */
        public String getWatermarkFontStyle() {
            return this.watermarkFontStyle;
        }

        /**
         * @return watermarkRowAmount
         */
        public Integer getWatermarkRowAmount() {
            return this.watermarkRowAmount;
        }

        /**
         * @return watermarkTransparency
         */
        public String getWatermarkTransparency() {
            return this.watermarkTransparency;
        }

        /**
         * @return watermarkTransparencyValue
         */
        public Integer getWatermarkTransparencyValue() {
            return this.watermarkTransparencyValue;
        }

        /**
         * @return watermarkType
         */
        public String getWatermarkType() {
            return this.watermarkType;
        }

        public static final class Builder {
            private String appContentProtection; 
            private java.util.List < AuthorizeAccessPolicyRules> authorizeAccessPolicyRules; 
            private java.util.List < AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules; 
            private String cameraRedirect; 
            private java.util.List < ClientTypes> clientTypes; 
            private String clipboard; 
            private String domainList; 
            private java.util.List < DomainResolveRule> domainResolveRule; 
            private String domainResolveRuleType; 
            private Integer edsCount; 
            private String endUserApplyAdminCoordinate; 
            private String endUserGroupCoordinate; 
            private String gpuAcceleration; 
            private String html5Access; 
            private String html5FileTransfer; 
            private String internetCommunicationProtocol; 
            private String localDrive; 
            private String name; 
            private String netRedirect; 
            private java.util.List < NetRedirectRule> netRedirectRule; 
            private String policyGroupId; 
            private String policyGroupType; 
            private String policyStatus; 
            private String preemptLogin; 
            private java.util.List < String > preemptLoginUsers; 
            private String printerRedirection; 
            private String recordContent; 
            private Long recordContentExpires; 
            private String recording; 
            private String recordingAudio; 
            private Integer recordingDuration; 
            private String recordingEndTime; 
            private Long recordingExpires; 
            private Long recordingFps; 
            private String recordingStartTime; 
            private String remoteCoordinate; 
            private String scope; 
            private java.util.List < String > scopeValue; 
            private String usbRedirect; 
            private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule; 
            private String videoRedirect; 
            private String visualQuality; 
            private String watermark; 
            private Integer watermarkColor; 
            private String watermarkCustomText; 
            private Double watermarkDegree; 
            private Integer watermarkFontSize; 
            private String watermarkFontStyle; 
            private Integer watermarkRowAmount; 
            private String watermarkTransparency; 
            private Integer watermarkTransparencyValue; 
            private String watermarkType; 

            /**
             * AppContentProtection.
             */
            public Builder appContentProtection(String appContentProtection) {
                this.appContentProtection = appContentProtection;
                return this;
            }

            /**
             * AuthorizeAccessPolicyRules.
             */
            public Builder authorizeAccessPolicyRules(java.util.List < AuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
                this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
                return this;
            }

            /**
             * AuthorizeSecurityPolicyRules.
             */
            public Builder authorizeSecurityPolicyRules(java.util.List < AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
                this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
                return this;
            }

            /**
             * CameraRedirect.
             */
            public Builder cameraRedirect(String cameraRedirect) {
                this.cameraRedirect = cameraRedirect;
                return this;
            }

            /**
             * ClientTypes.
             */
            public Builder clientTypes(java.util.List < ClientTypes> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * Clipboard.
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * DomainList.
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * DomainResolveRule.
             */
            public Builder domainResolveRule(java.util.List < DomainResolveRule> domainResolveRule) {
                this.domainResolveRule = domainResolveRule;
                return this;
            }

            /**
             * DomainResolveRuleType.
             */
            public Builder domainResolveRuleType(String domainResolveRuleType) {
                this.domainResolveRuleType = domainResolveRuleType;
                return this;
            }

            /**
             * EdsCount.
             */
            public Builder edsCount(Integer edsCount) {
                this.edsCount = edsCount;
                return this;
            }

            /**
             * EndUserApplyAdminCoordinate.
             */
            public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
                this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
                return this;
            }

            /**
             * EndUserGroupCoordinate.
             */
            public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
                this.endUserGroupCoordinate = endUserGroupCoordinate;
                return this;
            }

            /**
             * GpuAcceleration.
             */
            public Builder gpuAcceleration(String gpuAcceleration) {
                this.gpuAcceleration = gpuAcceleration;
                return this;
            }

            /**
             * Html5Access.
             */
            public Builder html5Access(String html5Access) {
                this.html5Access = html5Access;
                return this;
            }

            /**
             * Html5FileTransfer.
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * InternetCommunicationProtocol.
             */
            public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
                this.internetCommunicationProtocol = internetCommunicationProtocol;
                return this;
            }

            /**
             * LocalDrive.
             */
            public Builder localDrive(String localDrive) {
                this.localDrive = localDrive;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

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

            /**
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * PolicyGroupType.
             */
            public Builder policyGroupType(String policyGroupType) {
                this.policyGroupType = policyGroupType;
                return this;
            }

            /**
             * PolicyStatus.
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * PreemptLogin.
             */
            public Builder preemptLogin(String preemptLogin) {
                this.preemptLogin = preemptLogin;
                return this;
            }

            /**
             * PreemptLoginUsers.
             */
            public Builder preemptLoginUsers(java.util.List < String > preemptLoginUsers) {
                this.preemptLoginUsers = preemptLoginUsers;
                return this;
            }

            /**
             * PrinterRedirection.
             */
            public Builder printerRedirection(String printerRedirection) {
                this.printerRedirection = printerRedirection;
                return this;
            }

            /**
             * RecordContent.
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * RecordContentExpires.
             */
            public Builder recordContentExpires(Long recordContentExpires) {
                this.recordContentExpires = recordContentExpires;
                return this;
            }

            /**
             * Recording.
             */
            public Builder recording(String recording) {
                this.recording = recording;
                return this;
            }

            /**
             * RecordingAudio.
             */
            public Builder recordingAudio(String recordingAudio) {
                this.recordingAudio = recordingAudio;
                return this;
            }

            /**
             * RecordingDuration.
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * RecordingEndTime.
             */
            public Builder recordingEndTime(String recordingEndTime) {
                this.recordingEndTime = recordingEndTime;
                return this;
            }

            /**
             * RecordingExpires.
             */
            public Builder recordingExpires(Long recordingExpires) {
                this.recordingExpires = recordingExpires;
                return this;
            }

            /**
             * RecordingFps.
             */
            public Builder recordingFps(Long recordingFps) {
                this.recordingFps = recordingFps;
                return this;
            }

            /**
             * RecordingStartTime.
             */
            public Builder recordingStartTime(String recordingStartTime) {
                this.recordingStartTime = recordingStartTime;
                return this;
            }

            /**
             * RemoteCoordinate.
             */
            public Builder remoteCoordinate(String remoteCoordinate) {
                this.remoteCoordinate = remoteCoordinate;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * ScopeValue.
             */
            public Builder scopeValue(java.util.List < String > scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * UsbRedirect.
             */
            public Builder usbRedirect(String usbRedirect) {
                this.usbRedirect = usbRedirect;
                return this;
            }

            /**
             * UsbSupplyRedirectRule.
             */
            public Builder usbSupplyRedirectRule(java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule) {
                this.usbSupplyRedirectRule = usbSupplyRedirectRule;
                return this;
            }

            /**
             * VideoRedirect.
             */
            public Builder videoRedirect(String videoRedirect) {
                this.videoRedirect = videoRedirect;
                return this;
            }

            /**
             * VisualQuality.
             */
            public Builder visualQuality(String visualQuality) {
                this.visualQuality = visualQuality;
                return this;
            }

            /**
             * Watermark.
             */
            public Builder watermark(String watermark) {
                this.watermark = watermark;
                return this;
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
             * WatermarkDegree.
             */
            public Builder watermarkDegree(Double watermarkDegree) {
                this.watermarkDegree = watermarkDegree;
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
             * WatermarkFontStyle.
             */
            public Builder watermarkFontStyle(String watermarkFontStyle) {
                this.watermarkFontStyle = watermarkFontStyle;
                return this;
            }

            /**
             * WatermarkRowAmount.
             */
            public Builder watermarkRowAmount(Integer watermarkRowAmount) {
                this.watermarkRowAmount = watermarkRowAmount;
                return this;
            }

            /**
             * WatermarkTransparency.
             */
            public Builder watermarkTransparency(String watermarkTransparency) {
                this.watermarkTransparency = watermarkTransparency;
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
             * WatermarkType.
             */
            public Builder watermarkType(String watermarkType) {
                this.watermarkType = watermarkType;
                return this;
            }

            public DescribePolicyGroups build() {
                return new DescribePolicyGroups(this);
            } 

        } 

    }
}
