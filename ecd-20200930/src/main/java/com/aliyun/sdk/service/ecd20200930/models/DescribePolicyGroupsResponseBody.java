// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyGroupsResponseBody</p>
 */
public class DescribePolicyGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DescribePolicyGroups")
    private java.util.List < DescribePolicyGroups> describePolicyGroups;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The details of the policies.
         */
        public Builder describePolicyGroups(java.util.List < DescribePolicyGroups> describePolicyGroups) {
            this.describePolicyGroups = describePolicyGroups;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("Description")
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
             * The CIDR block that is allowed to access the client. The value is an IPv4 CIDR block.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * The remarks on the CIDR block that is allowed to access the client.
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
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * The object to which the security group rule applies. The value is an IPv4 CIDR block.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * The description of the security group rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The protocol type of the security group rule.
             * <p>
             * 
             * Valid values:
             * 
             * *   tcp: Transmission Control Protocol (TCP)
             * *   udp: User Datagram Protocol (UDP)
             * *   all: all protocols
             * *   gre: Generic Routing Encapsulation (GRE)
             * *   icmp: Internet Control Message Protocol (ICMP) for IPv4
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The authorization of the security group rule.
             * <p>
             * 
             * Valid values:
             * 
             * *   drop: denies all access requests.
             * *   accept: accepts all access requests.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The port range of the security group rule.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The priority of the security group rule. A smaller value indicates a higher priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The direction of the security group rule.
             * <p>
             * 
             * Valid values:
             * 
             * *   outflow: outbound
             * *   inflow: inbound
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
        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * The client type.
             * <p>
             * 
             * Valid values:
             * 
             * *   html5: web client
             * *   linux: Alibaba Cloud Workspace hardware terminal
             * *   android: Android client
             * *   windows: Windows client
             * *   ios: iOS client
             * *   macos: macOS client
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * Indicates whether a specific type of client is allowed to connect to the cloud desktop.
             * <p>
             * 
             * Valid values:
             * 
             * *   OFF
             * *   ON
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
    public static class DeviceRedirects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("RedirectType")
        private String redirectType;

        private DeviceRedirects(Builder builder) {
            this.deviceType = builder.deviceType;
            this.redirectType = builder.redirectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRedirects create() {
            return builder().build();
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return redirectType
         */
        public String getRedirectType() {
            return this.redirectType;
        }

        public static final class Builder {
            private String deviceType; 
            private String redirectType; 

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * RedirectType.
             */
            public Builder redirectType(String redirectType) {
                this.redirectType = redirectType;
                return this;
            }

            public DeviceRedirects build() {
                return new DeviceRedirects(this);
            } 

        } 

    }
    public static class DeviceRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DevicePid")
        private String devicePid;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("DeviceVid")
        private String deviceVid;

        @com.aliyun.core.annotation.NameInMap("OptCommand")
        private String optCommand;

        @com.aliyun.core.annotation.NameInMap("RedirectType")
        private String redirectType;

        private DeviceRules(Builder builder) {
            this.deviceName = builder.deviceName;
            this.devicePid = builder.devicePid;
            this.deviceType = builder.deviceType;
            this.deviceVid = builder.deviceVid;
            this.optCommand = builder.optCommand;
            this.redirectType = builder.redirectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRules create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return devicePid
         */
        public String getDevicePid() {
            return this.devicePid;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return deviceVid
         */
        public String getDeviceVid() {
            return this.deviceVid;
        }

        /**
         * @return optCommand
         */
        public String getOptCommand() {
            return this.optCommand;
        }

        /**
         * @return redirectType
         */
        public String getRedirectType() {
            return this.redirectType;
        }

        public static final class Builder {
            private String deviceName; 
            private String devicePid; 
            private String deviceType; 
            private String deviceVid; 
            private String optCommand; 
            private String redirectType; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DevicePid.
             */
            public Builder devicePid(String devicePid) {
                this.devicePid = devicePid;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * DeviceVid.
             */
            public Builder deviceVid(String deviceVid) {
                this.deviceVid = deviceVid;
                return this;
            }

            /**
             * OptCommand.
             */
            public Builder optCommand(String optCommand) {
                this.optCommand = optCommand;
                return this;
            }

            /**
             * RedirectType.
             */
            public Builder redirectType(String redirectType) {
                this.redirectType = redirectType;
                return this;
            }

            public DeviceRules build() {
                return new DeviceRules(this);
            } 

        } 

    }
    public static class DomainResolveRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Policy")
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
             * The rule description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether the domain name resolution is allowed. Valid values:
             * <p>
             * 
             * *   allow
             * *   block
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
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private NetRedirectRule(Builder builder) {
            this.domain = builder.domain;
            this.policy = builder.policy;
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

        public static final class Builder {
            private String domain; 
            private String policy; 
            private String ruleType; 

            /**
             * The rule content.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether the rule is allowed.
             * <p>
             * 
             * Valid values:
             * 
             * *   allow
             * *   block
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The rule type.
             * <p>
             * 
             * Valid values:
             * 
             * *   prc: process
             * *   domain: domain name
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
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceClass")
        private String deviceClass;

        @com.aliyun.core.annotation.NameInMap("DeviceSubclass")
        private String deviceSubclass;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("UsbRedirectType")
        private Long usbRedirectType;

        @com.aliyun.core.annotation.NameInMap("UsbRuleType")
        private Long usbRuleType;

        @com.aliyun.core.annotation.NameInMap("VendorId")
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
             * The rule description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The device class. This parameter is required when `usbRuleType` is set to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).
             */
            public Builder deviceClass(String deviceClass) {
                this.deviceClass = deviceClass;
                return this;
            }

            /**
             * The subclass of the device. This parameter is required when `usbRuleType` is set to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).
             */
            public Builder deviceSubclass(String deviceSubclass) {
                this.deviceSubclass = deviceSubclass;
                return this;
            }

            /**
             * The product ID.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * Indicates whether USB redirection is allowed.
             * <p>
             * 
             * Valid values:
             * 
             * *   1: allowed
             * *   2: not allowed
             */
            public Builder usbRedirectType(Long usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * The type of the USB redirection rule.
             * <p>
             * 
             * Valid values:
             * 
             * *   1: by device class
             * *   2: by device vendor
             */
            public Builder usbRuleType(Long usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * The vendor ID (VID). For more information, see [Valid USB VIDs](https://www.usb.org/sites/default/files/vendor_ids032322.pdf\_1.pdf).
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
        @com.aliyun.core.annotation.NameInMap("AdminAccess")
        private String adminAccess;

        @com.aliyun.core.annotation.NameInMap("AppContentProtection")
        private String appContentProtection;

        @com.aliyun.core.annotation.NameInMap("AuthorizeAccessPolicyRules")
        private java.util.List < AuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        @com.aliyun.core.annotation.NameInMap("AuthorizeSecurityPolicyRules")
        private java.util.List < AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        @com.aliyun.core.annotation.NameInMap("CameraRedirect")
        private String cameraRedirect;

        @com.aliyun.core.annotation.NameInMap("ClientTypes")
        private java.util.List < ClientTypes> clientTypes;

        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        @com.aliyun.core.annotation.NameInMap("ColorEnhancement")
        private String colorEnhancement;

        @com.aliyun.core.annotation.NameInMap("CpuDownGradeDuration")
        private Integer cpuDownGradeDuration;

        @com.aliyun.core.annotation.NameInMap("CpuProcessors")
        private java.util.List < String > cpuProcessors;

        @com.aliyun.core.annotation.NameInMap("CpuProtectedMode")
        private String cpuProtectedMode;

        @com.aliyun.core.annotation.NameInMap("CpuRateLimit")
        private Integer cpuRateLimit;

        @com.aliyun.core.annotation.NameInMap("CpuSampleDuration")
        private Integer cpuSampleDuration;

        @com.aliyun.core.annotation.NameInMap("CpuSingleRateLimit")
        private Integer cpuSingleRateLimit;

        @com.aliyun.core.annotation.NameInMap("DeviceRedirects")
        private java.util.List < DeviceRedirects> deviceRedirects;

        @com.aliyun.core.annotation.NameInMap("DeviceRules")
        private java.util.List < DeviceRules> deviceRules;

        @com.aliyun.core.annotation.NameInMap("DisplayMode")
        private String displayMode;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("DomainResolveRule")
        private java.util.List < DomainResolveRule> domainResolveRule;

        @com.aliyun.core.annotation.NameInMap("DomainResolveRuleType")
        private String domainResolveRuleType;

        @com.aliyun.core.annotation.NameInMap("EdsCount")
        private Integer edsCount;

        @com.aliyun.core.annotation.NameInMap("EndUserApplyAdminCoordinate")
        private String endUserApplyAdminCoordinate;

        @com.aliyun.core.annotation.NameInMap("EndUserGroupCoordinate")
        private String endUserGroupCoordinate;

        @com.aliyun.core.annotation.NameInMap("GpuAcceleration")
        private String gpuAcceleration;

        @com.aliyun.core.annotation.NameInMap("Html5Access")
        private String html5Access;

        @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
        private String html5FileTransfer;

        @com.aliyun.core.annotation.NameInMap("InternetCommunicationProtocol")
        private String internetCommunicationProtocol;

        @com.aliyun.core.annotation.NameInMap("LocalDrive")
        private String localDrive;

        @com.aliyun.core.annotation.NameInMap("MaxReconnectTime")
        private Integer maxReconnectTime;

        @com.aliyun.core.annotation.NameInMap("MemoryDownGradeDuration")
        private Integer memoryDownGradeDuration;

        @com.aliyun.core.annotation.NameInMap("MemoryProcessors")
        private java.util.List < String > memoryProcessors;

        @com.aliyun.core.annotation.NameInMap("MemoryProtectedMode")
        private String memoryProtectedMode;

        @com.aliyun.core.annotation.NameInMap("MemoryRateLimit")
        private Integer memoryRateLimit;

        @com.aliyun.core.annotation.NameInMap("MemorySampleDuration")
        private Integer memorySampleDuration;

        @com.aliyun.core.annotation.NameInMap("MemorySingleRateLimit")
        private Integer memorySingleRateLimit;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetRedirect")
        private String netRedirect;

        @com.aliyun.core.annotation.NameInMap("NetRedirectRule")
        private java.util.List < NetRedirectRule> netRedirectRule;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupType")
        private String policyGroupType;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("PreemptLogin")
        private String preemptLogin;

        @com.aliyun.core.annotation.NameInMap("PreemptLoginUsers")
        private java.util.List < String > preemptLoginUsers;

        @com.aliyun.core.annotation.NameInMap("PrinterRedirection")
        private String printerRedirection;

        @com.aliyun.core.annotation.NameInMap("QualityEnhancement")
        private String qualityEnhancement;

        @com.aliyun.core.annotation.NameInMap("RecordContent")
        private String recordContent;

        @com.aliyun.core.annotation.NameInMap("RecordContentExpires")
        private Long recordContentExpires;

        @com.aliyun.core.annotation.NameInMap("Recording")
        private String recording;

        @com.aliyun.core.annotation.NameInMap("RecordingAudio")
        private String recordingAudio;

        @com.aliyun.core.annotation.NameInMap("RecordingDuration")
        private Integer recordingDuration;

        @com.aliyun.core.annotation.NameInMap("RecordingEndTime")
        private String recordingEndTime;

        @com.aliyun.core.annotation.NameInMap("RecordingExpires")
        private Long recordingExpires;

        @com.aliyun.core.annotation.NameInMap("RecordingFps")
        private Long recordingFps;

        @com.aliyun.core.annotation.NameInMap("RecordingStartTime")
        private String recordingStartTime;

        @com.aliyun.core.annotation.NameInMap("RecordingUserNotify")
        private String recordingUserNotify;

        @com.aliyun.core.annotation.NameInMap("RecordingUserNotifyMessage")
        private String recordingUserNotifyMessage;

        @com.aliyun.core.annotation.NameInMap("RemoteCoordinate")
        private String remoteCoordinate;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("ScopeValue")
        private java.util.List < String > scopeValue;

        @com.aliyun.core.annotation.NameInMap("SmoothEnhancement")
        private String smoothEnhancement;

        @com.aliyun.core.annotation.NameInMap("StreamingMode")
        private String streamingMode;

        @com.aliyun.core.annotation.NameInMap("TargetFps")
        private Integer targetFps;

        @com.aliyun.core.annotation.NameInMap("UsbRedirect")
        private String usbRedirect;

        @com.aliyun.core.annotation.NameInMap("UsbSupplyRedirectRule")
        private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule;

        @com.aliyun.core.annotation.NameInMap("VideoEncAvgKbps")
        private Integer videoEncAvgKbps;

        @com.aliyun.core.annotation.NameInMap("VideoEncMaxQP")
        private Integer videoEncMaxQP;

        @com.aliyun.core.annotation.NameInMap("VideoEncMinQP")
        private Integer videoEncMinQP;

        @com.aliyun.core.annotation.NameInMap("VideoEncPeakKbps")
        private Integer videoEncPeakKbps;

        @com.aliyun.core.annotation.NameInMap("VideoEncPolicy")
        private String videoEncPolicy;

        @com.aliyun.core.annotation.NameInMap("VideoRedirect")
        private String videoRedirect;

        @com.aliyun.core.annotation.NameInMap("VisualQuality")
        private String visualQuality;

        @com.aliyun.core.annotation.NameInMap("Watermark")
        private String watermark;

        @com.aliyun.core.annotation.NameInMap("WatermarkAntiCam")
        private String watermarkAntiCam;

        @com.aliyun.core.annotation.NameInMap("WatermarkColor")
        private Integer watermarkColor;

        @com.aliyun.core.annotation.NameInMap("WatermarkCustomText")
        private String watermarkCustomText;

        @com.aliyun.core.annotation.NameInMap("WatermarkDegree")
        private Double watermarkDegree;

        @com.aliyun.core.annotation.NameInMap("WatermarkFontSize")
        private Integer watermarkFontSize;

        @com.aliyun.core.annotation.NameInMap("WatermarkFontStyle")
        private String watermarkFontStyle;

        @com.aliyun.core.annotation.NameInMap("WatermarkPower")
        private String watermarkPower;

        @com.aliyun.core.annotation.NameInMap("WatermarkRowAmount")
        private Integer watermarkRowAmount;

        @com.aliyun.core.annotation.NameInMap("WatermarkSecurity")
        private String watermarkSecurity;

        @com.aliyun.core.annotation.NameInMap("WatermarkTransparency")
        private String watermarkTransparency;

        @com.aliyun.core.annotation.NameInMap("WatermarkTransparencyValue")
        private Integer watermarkTransparencyValue;

        @com.aliyun.core.annotation.NameInMap("WatermarkType")
        private String watermarkType;

        private DescribePolicyGroups(Builder builder) {
            this.adminAccess = builder.adminAccess;
            this.appContentProtection = builder.appContentProtection;
            this.authorizeAccessPolicyRules = builder.authorizeAccessPolicyRules;
            this.authorizeSecurityPolicyRules = builder.authorizeSecurityPolicyRules;
            this.cameraRedirect = builder.cameraRedirect;
            this.clientTypes = builder.clientTypes;
            this.clipboard = builder.clipboard;
            this.colorEnhancement = builder.colorEnhancement;
            this.cpuDownGradeDuration = builder.cpuDownGradeDuration;
            this.cpuProcessors = builder.cpuProcessors;
            this.cpuProtectedMode = builder.cpuProtectedMode;
            this.cpuRateLimit = builder.cpuRateLimit;
            this.cpuSampleDuration = builder.cpuSampleDuration;
            this.cpuSingleRateLimit = builder.cpuSingleRateLimit;
            this.deviceRedirects = builder.deviceRedirects;
            this.deviceRules = builder.deviceRules;
            this.displayMode = builder.displayMode;
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
            this.maxReconnectTime = builder.maxReconnectTime;
            this.memoryDownGradeDuration = builder.memoryDownGradeDuration;
            this.memoryProcessors = builder.memoryProcessors;
            this.memoryProtectedMode = builder.memoryProtectedMode;
            this.memoryRateLimit = builder.memoryRateLimit;
            this.memorySampleDuration = builder.memorySampleDuration;
            this.memorySingleRateLimit = builder.memorySingleRateLimit;
            this.name = builder.name;
            this.netRedirect = builder.netRedirect;
            this.netRedirectRule = builder.netRedirectRule;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupType = builder.policyGroupType;
            this.policyStatus = builder.policyStatus;
            this.preemptLogin = builder.preemptLogin;
            this.preemptLoginUsers = builder.preemptLoginUsers;
            this.printerRedirection = builder.printerRedirection;
            this.qualityEnhancement = builder.qualityEnhancement;
            this.recordContent = builder.recordContent;
            this.recordContentExpires = builder.recordContentExpires;
            this.recording = builder.recording;
            this.recordingAudio = builder.recordingAudio;
            this.recordingDuration = builder.recordingDuration;
            this.recordingEndTime = builder.recordingEndTime;
            this.recordingExpires = builder.recordingExpires;
            this.recordingFps = builder.recordingFps;
            this.recordingStartTime = builder.recordingStartTime;
            this.recordingUserNotify = builder.recordingUserNotify;
            this.recordingUserNotifyMessage = builder.recordingUserNotifyMessage;
            this.remoteCoordinate = builder.remoteCoordinate;
            this.scope = builder.scope;
            this.scopeValue = builder.scopeValue;
            this.smoothEnhancement = builder.smoothEnhancement;
            this.streamingMode = builder.streamingMode;
            this.targetFps = builder.targetFps;
            this.usbRedirect = builder.usbRedirect;
            this.usbSupplyRedirectRule = builder.usbSupplyRedirectRule;
            this.videoEncAvgKbps = builder.videoEncAvgKbps;
            this.videoEncMaxQP = builder.videoEncMaxQP;
            this.videoEncMinQP = builder.videoEncMinQP;
            this.videoEncPeakKbps = builder.videoEncPeakKbps;
            this.videoEncPolicy = builder.videoEncPolicy;
            this.videoRedirect = builder.videoRedirect;
            this.visualQuality = builder.visualQuality;
            this.watermark = builder.watermark;
            this.watermarkAntiCam = builder.watermarkAntiCam;
            this.watermarkColor = builder.watermarkColor;
            this.watermarkCustomText = builder.watermarkCustomText;
            this.watermarkDegree = builder.watermarkDegree;
            this.watermarkFontSize = builder.watermarkFontSize;
            this.watermarkFontStyle = builder.watermarkFontStyle;
            this.watermarkPower = builder.watermarkPower;
            this.watermarkRowAmount = builder.watermarkRowAmount;
            this.watermarkSecurity = builder.watermarkSecurity;
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
         * @return adminAccess
         */
        public String getAdminAccess() {
            return this.adminAccess;
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
         * @return colorEnhancement
         */
        public String getColorEnhancement() {
            return this.colorEnhancement;
        }

        /**
         * @return cpuDownGradeDuration
         */
        public Integer getCpuDownGradeDuration() {
            return this.cpuDownGradeDuration;
        }

        /**
         * @return cpuProcessors
         */
        public java.util.List < String > getCpuProcessors() {
            return this.cpuProcessors;
        }

        /**
         * @return cpuProtectedMode
         */
        public String getCpuProtectedMode() {
            return this.cpuProtectedMode;
        }

        /**
         * @return cpuRateLimit
         */
        public Integer getCpuRateLimit() {
            return this.cpuRateLimit;
        }

        /**
         * @return cpuSampleDuration
         */
        public Integer getCpuSampleDuration() {
            return this.cpuSampleDuration;
        }

        /**
         * @return cpuSingleRateLimit
         */
        public Integer getCpuSingleRateLimit() {
            return this.cpuSingleRateLimit;
        }

        /**
         * @return deviceRedirects
         */
        public java.util.List < DeviceRedirects> getDeviceRedirects() {
            return this.deviceRedirects;
        }

        /**
         * @return deviceRules
         */
        public java.util.List < DeviceRules> getDeviceRules() {
            return this.deviceRules;
        }

        /**
         * @return displayMode
         */
        public String getDisplayMode() {
            return this.displayMode;
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
         * @return maxReconnectTime
         */
        public Integer getMaxReconnectTime() {
            return this.maxReconnectTime;
        }

        /**
         * @return memoryDownGradeDuration
         */
        public Integer getMemoryDownGradeDuration() {
            return this.memoryDownGradeDuration;
        }

        /**
         * @return memoryProcessors
         */
        public java.util.List < String > getMemoryProcessors() {
            return this.memoryProcessors;
        }

        /**
         * @return memoryProtectedMode
         */
        public String getMemoryProtectedMode() {
            return this.memoryProtectedMode;
        }

        /**
         * @return memoryRateLimit
         */
        public Integer getMemoryRateLimit() {
            return this.memoryRateLimit;
        }

        /**
         * @return memorySampleDuration
         */
        public Integer getMemorySampleDuration() {
            return this.memorySampleDuration;
        }

        /**
         * @return memorySingleRateLimit
         */
        public Integer getMemorySingleRateLimit() {
            return this.memorySingleRateLimit;
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
         * @return qualityEnhancement
         */
        public String getQualityEnhancement() {
            return this.qualityEnhancement;
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
         * @return recordingUserNotify
         */
        public String getRecordingUserNotify() {
            return this.recordingUserNotify;
        }

        /**
         * @return recordingUserNotifyMessage
         */
        public String getRecordingUserNotifyMessage() {
            return this.recordingUserNotifyMessage;
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
         * @return smoothEnhancement
         */
        public String getSmoothEnhancement() {
            return this.smoothEnhancement;
        }

        /**
         * @return streamingMode
         */
        public String getStreamingMode() {
            return this.streamingMode;
        }

        /**
         * @return targetFps
         */
        public Integer getTargetFps() {
            return this.targetFps;
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
         * @return videoEncAvgKbps
         */
        public Integer getVideoEncAvgKbps() {
            return this.videoEncAvgKbps;
        }

        /**
         * @return videoEncMaxQP
         */
        public Integer getVideoEncMaxQP() {
            return this.videoEncMaxQP;
        }

        /**
         * @return videoEncMinQP
         */
        public Integer getVideoEncMinQP() {
            return this.videoEncMinQP;
        }

        /**
         * @return videoEncPeakKbps
         */
        public Integer getVideoEncPeakKbps() {
            return this.videoEncPeakKbps;
        }

        /**
         * @return videoEncPolicy
         */
        public String getVideoEncPolicy() {
            return this.videoEncPolicy;
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
         * @return watermarkAntiCam
         */
        public String getWatermarkAntiCam() {
            return this.watermarkAntiCam;
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
         * @return watermarkPower
         */
        public String getWatermarkPower() {
            return this.watermarkPower;
        }

        /**
         * @return watermarkRowAmount
         */
        public Integer getWatermarkRowAmount() {
            return this.watermarkRowAmount;
        }

        /**
         * @return watermarkSecurity
         */
        public String getWatermarkSecurity() {
            return this.watermarkSecurity;
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
            private String adminAccess; 
            private String appContentProtection; 
            private java.util.List < AuthorizeAccessPolicyRules> authorizeAccessPolicyRules; 
            private java.util.List < AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules; 
            private String cameraRedirect; 
            private java.util.List < ClientTypes> clientTypes; 
            private String clipboard; 
            private String colorEnhancement; 
            private Integer cpuDownGradeDuration; 
            private java.util.List < String > cpuProcessors; 
            private String cpuProtectedMode; 
            private Integer cpuRateLimit; 
            private Integer cpuSampleDuration; 
            private Integer cpuSingleRateLimit; 
            private java.util.List < DeviceRedirects> deviceRedirects; 
            private java.util.List < DeviceRules> deviceRules; 
            private String displayMode; 
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
            private Integer maxReconnectTime; 
            private Integer memoryDownGradeDuration; 
            private java.util.List < String > memoryProcessors; 
            private String memoryProtectedMode; 
            private Integer memoryRateLimit; 
            private Integer memorySampleDuration; 
            private Integer memorySingleRateLimit; 
            private String name; 
            private String netRedirect; 
            private java.util.List < NetRedirectRule> netRedirectRule; 
            private String policyGroupId; 
            private String policyGroupType; 
            private String policyStatus; 
            private String preemptLogin; 
            private java.util.List < String > preemptLoginUsers; 
            private String printerRedirection; 
            private String qualityEnhancement; 
            private String recordContent; 
            private Long recordContentExpires; 
            private String recording; 
            private String recordingAudio; 
            private Integer recordingDuration; 
            private String recordingEndTime; 
            private Long recordingExpires; 
            private Long recordingFps; 
            private String recordingStartTime; 
            private String recordingUserNotify; 
            private String recordingUserNotifyMessage; 
            private String remoteCoordinate; 
            private String scope; 
            private java.util.List < String > scopeValue; 
            private String smoothEnhancement; 
            private String streamingMode; 
            private Integer targetFps; 
            private String usbRedirect; 
            private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule; 
            private Integer videoEncAvgKbps; 
            private Integer videoEncMaxQP; 
            private Integer videoEncMinQP; 
            private Integer videoEncPeakKbps; 
            private String videoEncPolicy; 
            private String videoRedirect; 
            private String visualQuality; 
            private String watermark; 
            private String watermarkAntiCam; 
            private Integer watermarkColor; 
            private String watermarkCustomText; 
            private Double watermarkDegree; 
            private Integer watermarkFontSize; 
            private String watermarkFontStyle; 
            private String watermarkPower; 
            private Integer watermarkRowAmount; 
            private String watermarkSecurity; 
            private String watermarkTransparency; 
            private Integer watermarkTransparencyValue; 
            private String watermarkType; 

            /**
             * Indicates whether users have the administrator permissions after they connect to cloud desktops.
             * <p>
             * 
             * >  This parameter is in invitational preview and not available to the public.
             */
            public Builder adminAccess(String adminAccess) {
                this.adminAccess = adminAccess;
                return this;
            }

            /**
             * Indicates whether the anti-screenshot feature is enabled. Valid values:
             * <p>
             * 
             * *   on
             * *   off
             * 
             * Default value: off.
             */
            public Builder appContentProtection(String appContentProtection) {
                this.appContentProtection = appContentProtection;
                return this;
            }

            /**
             * The client CIDR blocks in a whitelist.
             */
            public Builder authorizeAccessPolicyRules(java.util.List < AuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
                this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
                return this;
            }

            /**
             * The security group rules.
             */
            public Builder authorizeSecurityPolicyRules(java.util.List < AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
                this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
                return this;
            }

            /**
             * Indicates whether the webcam redirection feature is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   off
             * *   on (default)
             */
            public Builder cameraRedirect(String cameraRedirect) {
                this.cameraRedirect = cameraRedirect;
                return this;
            }

            /**
             * The logon methods.
             */
            public Builder clientTypes(java.util.List < ClientTypes> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * The permissions on the clipboard.
             * <p>
             * 
             * Valid values:
             * 
             * *   read: One-way transfer is allowed.
             * *   readwrite: Two-way transfer is allowed.
             * *   off: Two-way transfer is not allowed.
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * ColorEnhancement.
             */
            public Builder colorEnhancement(String colorEnhancement) {
                this.colorEnhancement = colorEnhancement;
                return this;
            }

            /**
             * The CPU underclocking duration. Valid values: 30 to 120.
             */
            public Builder cpuDownGradeDuration(Integer cpuDownGradeDuration) {
                this.cpuDownGradeDuration = cpuDownGradeDuration;
                return this;
            }

            /**
             * The process whitelist that is not restricted by the CPU usage limit.
             */
            public Builder cpuProcessors(java.util.List < String > cpuProcessors) {
                this.cpuProcessors = cpuProcessors;
                return this;
            }

            /**
             * Indicates whether the switch for CPU protection mode is turned on. Valid values: on and off.
             */
            public Builder cpuProtectedMode(String cpuProtectedMode) {
                this.cpuProtectedMode = cpuProtectedMode;
                return this;
            }

            /**
             * The overall CPU utilization. Valid values: 70 to 90.
             */
            public Builder cpuRateLimit(Integer cpuRateLimit) {
                this.cpuRateLimit = cpuRateLimit;
                return this;
            }

            /**
             * The overall CPU sampling duration. Valid values: 10 to 60.
             */
            public Builder cpuSampleDuration(Integer cpuSampleDuration) {
                this.cpuSampleDuration = cpuSampleDuration;
                return this;
            }

            /**
             * The usage of a single CPU. Valid values: 70 to 100.
             */
            public Builder cpuSingleRateLimit(Integer cpuSingleRateLimit) {
                this.cpuSingleRateLimit = cpuSingleRateLimit;
                return this;
            }

            /**
             * DeviceRedirects.
             */
            public Builder deviceRedirects(java.util.List < DeviceRedirects> deviceRedirects) {
                this.deviceRedirects = deviceRedirects;
                return this;
            }

            /**
             * DeviceRules.
             */
            public Builder deviceRules(java.util.List < DeviceRules> deviceRules) {
                this.deviceRules = deviceRules;
                return this;
            }

            /**
             * DisplayMode.
             */
            public Builder displayMode(String displayMode) {
                this.displayMode = displayMode;
                return this;
            }

            /**
             * Indicates whether the access control for domain names is enabled. The domain names can contain wildcard characters (\*). Multiple domain names are separated by commas (,). Valid values:
             * <p>
             * 
             * *   off
             * *   on
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * The rule of domain name resolution.
             */
            public Builder domainResolveRule(java.util.List < DomainResolveRule> domainResolveRule) {
                this.domainResolveRule = domainResolveRule;
                return this;
            }

            /**
             * Indicates whether the switch for domain name resolution is turned on.
             * <p>
             * 
             * Valid values:
             * 
             * *   off
             * *   on
             */
            public Builder domainResolveRuleType(String domainResolveRuleType) {
                this.domainResolveRuleType = domainResolveRuleType;
                return this;
            }

            /**
             * The number of cloud desktops that are associated with the policy.\
             * <p>
             * This parameter is returned only for custom policies.
             */
            public Builder edsCount(Integer edsCount) {
                this.edsCount = edsCount;
                return this;
            }

            /**
             * Indicates whether the switch for end users to ask for assistance from the administrator is turned on. Valid values: on and off.
             */
            public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
                this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
                return this;
            }

            /**
             * Indicates whether the switch for stream collaboration between end users is turned on. Valid values: on and off.
             */
            public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
                this.endUserGroupCoordinate = endUserGroupCoordinate;
                return this;
            }

            /**
             * Indicates whether the image quality feature is enabled for Graphics cloud desktops. If you have high requirements for desktop performance and user experience, we recommend that you enable this feature. For example, you can enable this feature in professional graphic design scenarios.
             * <p>
             * 
             * Valid values:
             * 
             * *   off
             * *   on
             */
            public Builder gpuAcceleration(String gpuAcceleration) {
                this.gpuAcceleration = gpuAcceleration;
                return this;
            }

            /**
             * Indicates whether the access policy on HTML5 clients is allowed.
             * <p>
             * 
             * Valid values:
             * 
             * *   off (default)
             * *   on
             */
            public Builder html5Access(String html5Access) {
                this.html5Access = html5Access;
                return this;
            }

            /**
             * The file transfer policy for HTML5 clients.
             * <p>
             * 
             * Valid values:
             * 
             * *   all: Files can be uploaded and downloaded between your local computer and HTML5 clients.
             * *   download: Files on HTML5 clients can be downloaded to your local computer.
             * *   upload: Files on your local computer can be uploaded to HTML5 clients.
             * *   off (default): File transfer between HTML5 clients and your computer is disabled.
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * The protocol that is used for network communication. Valid values:
             * <p>
             * 
             * *   TCP: Only TCP can be used.
             * *   BOTH: TCP or UDP can be used. The system switches between TCP and UDP based on the actual network condition.
             * 
             * Default value: TCP.
             */
            public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
                this.internetCommunicationProtocol = internetCommunicationProtocol;
                return this;
            }

            /**
             * The permissions on local disk mapping.
             * <p>
             * 
             * Valid values:
             * 
             * *   read: read-only
             * *   readwrite: read and write
             * *   off: no permissions
             */
            public Builder localDrive(String localDrive) {
                this.localDrive = localDrive;
                return this;
            }

            /**
             * MaxReconnectTime.
             */
            public Builder maxReconnectTime(Integer maxReconnectTime) {
                this.maxReconnectTime = maxReconnectTime;
                return this;
            }

            /**
             * The duration required for underclocking memory by a single process. Valid values: 30 to 120.
             */
            public Builder memoryDownGradeDuration(Integer memoryDownGradeDuration) {
                this.memoryDownGradeDuration = memoryDownGradeDuration;
                return this;
            }

            /**
             * The whitelist of processes that are not restricted by the memory usage limit.
             */
            public Builder memoryProcessors(java.util.List < String > memoryProcessors) {
                this.memoryProcessors = memoryProcessors;
                return this;
            }

            /**
             * Indicates whether the switch for memory protection mode is turned on. Valid values: on and off.
             */
            public Builder memoryProtectedMode(String memoryProtectedMode) {
                this.memoryProtectedMode = memoryProtectedMode;
                return this;
            }

            /**
             * The overall memory usage. Valid values: 70 to 90.
             */
            public Builder memoryRateLimit(Integer memoryRateLimit) {
                this.memoryRateLimit = memoryRateLimit;
                return this;
            }

            /**
             * The overall sampling duration of memory statistics. Valid values: 30 to 60.
             */
            public Builder memorySampleDuration(Integer memorySampleDuration) {
                this.memorySampleDuration = memorySampleDuration;
                return this;
            }

            /**
             * The memory usage of a single process. Valid values: 30 to 60.
             */
            public Builder memorySingleRateLimit(Integer memorySingleRateLimit) {
                this.memorySingleRateLimit = memorySingleRateLimit;
                return this;
            }

            /**
             * The policy name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the network redirection feature is enabled. Valid values:
             * <p>
             * 
             * *   on
             * *   off
             * 
             * Default value: off.
             * 
             * >  This parameter is in invitational preview and not available to the public.
             */
            public Builder netRedirect(String netRedirect) {
                this.netRedirect = netRedirect;
                return this;
            }

            /**
             * The network redirection rule.
             * <p>
             * 
             * >  This parameter is in invitational preview and not available to the public.
             */
            public Builder netRedirectRule(java.util.List < NetRedirectRule> netRedirectRule) {
                this.netRedirectRule = netRedirectRule;
                return this;
            }

            /**
             * The policy ID.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * The policy type.
             * <p>
             * 
             * Valid values:
             * 
             * *   SYSTEM
             * *   CUSTOM
             */
            public Builder policyGroupType(String policyGroupType) {
                this.policyGroupType = policyGroupType;
                return this;
            }

            /**
             * The policy status.
             * <p>
             * 
             * Valid values:
             * 
             * *   AVAILABLE
             * *   CREATING
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * Indicates whether user preemption is allowed. The value is fixed to `off`, which indicates that user preemption is not allowed.
             */
            public Builder preemptLogin(String preemptLogin) {
                this.preemptLogin = preemptLogin;
                return this;
            }

            /**
             * The names of the users that are allowed to connect to the cloud desktop to which another user is logged on.
             */
            public Builder preemptLoginUsers(java.util.List < String > preemptLoginUsers) {
                this.preemptLoginUsers = preemptLoginUsers;
                return this;
            }

            /**
             * Indicates whether the printer redirection feature is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   off
             * *   on
             */
            public Builder printerRedirection(String printerRedirection) {
                this.printerRedirection = printerRedirection;
                return this;
            }

            /**
             * QualityEnhancement.
             */
            public Builder qualityEnhancement(String qualityEnhancement) {
                this.qualityEnhancement = qualityEnhancement;
                return this;
            }

            /**
             * Indicates whether the custom screen recording feature is enabled. Valid values:
             * <p>
             * 
             * *   on
             * *   off
             * 
             * Default value: off.
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * The period when the custom screen recording can be retained before expiration. Default value: 30 days.
             */
            public Builder recordContentExpires(Long recordContentExpires) {
                this.recordContentExpires = recordContentExpires;
                return this;
            }

            /**
             * Indicates whether the screen recording feature is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   ALLTIME: All operations that are performed by end users on cloud desktops are recorded. The recording starts immediately when end users connect to cloud desktops and ends after the end users disconnect from the cloud desktops.
             * *   PERIOD: The operations that are performed by end users on cloud desktops during a specified period of time are recorded. You must specify the start time and the end time of the recording.
             * *   OFF: The screen recording feature is disabled.
             */
            public Builder recording(String recording) {
                this.recording = recording;
                return this;
            }

            /**
             * Indicates whether to record audio or video data that is generated on the cloud desktop during screen recording. Valid values:
             * <p>
             * 
             * *   on: records audio and video data.
             * *   off: records only video data.
             */
            public Builder recordingAudio(String recordingAudio) {
                this.recordingAudio = recordingAudio;
                return this;
            }

            /**
             * This parameter is used with the Recording parameter to generate a screen recording file after you specify the duration of screen recording.
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * The time when the screen recording ended. The value is in the HH:MM:SS format. The value takes effect only when Recording is set to PERIOD.
             */
            public Builder recordingEndTime(String recordingEndTime) {
                this.recordingEndTime = recordingEndTime;
                return this;
            }

            /**
             * The period in which the screen recording audit is valid. Valid values: 15 to 180. Unit: day.
             */
            public Builder recordingExpires(Long recordingExpires) {
                this.recordingExpires = recordingExpires;
                return this;
            }

            /**
             * The frame rate of screen recording. Unit: fps. Valid values:
             * <p>
             * 
             * *   2
             * *   5
             * *   10
             * *   15
             */
            public Builder recordingFps(Long recordingFps) {
                this.recordingFps = recordingFps;
                return this;
            }

            /**
             * The time when the screen recording was started. The value is in the HH:MM:SS format. The value takes effect only when Recording is set to PERIOD.
             */
            public Builder recordingStartTime(String recordingStartTime) {
                this.recordingStartTime = recordingStartTime;
                return this;
            }

            /**
             * Indicates whether the client notification of screen recording is enabled. Valid values: on and off.
             */
            public Builder recordingUserNotify(String recordingUserNotify) {
                this.recordingUserNotify = recordingUserNotify;
                return this;
            }

            /**
             * The notification content of screen recording. By default, this parameter is left empty.
             */
            public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
                this.recordingUserNotifyMessage = recordingUserNotifyMessage;
                return this;
            }

            /**
             * The permissions on the keyboard and mouse to control the cloud desktop during remote assistance. Valid values:
             * <p>
             * 
             * *   fullControl: The keyboard and mouse are fully controlled.
             * *   optionalControl: By default, you do not have the permissions on the keyboard or mouse to control the cloud desktop during remote assistance. You can apply for the permissions.
             * *   disableControl: The keyboard and mouse are not controlled.
             */
            public Builder remoteCoordinate(String remoteCoordinate) {
                this.remoteCoordinate = remoteCoordinate;
                return this;
            }

            /**
             * The effective scope of the policy. Valid values:
             * <p>
             * 
             * *   GLOBAL: The policy takes effect globally.
             * *   IP: The policy takes effect based on IP addresses.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * This parameter is required when Scope is set to IP. This parameter takes effect when Scope is set to IP.
             */
            public Builder scopeValue(java.util.List < String > scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * SmoothEnhancement.
             */
            public Builder smoothEnhancement(String smoothEnhancement) {
                this.smoothEnhancement = smoothEnhancement;
                return this;
            }

            /**
             * StreamingMode.
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * TargetFps.
             */
            public Builder targetFps(Integer targetFps) {
                this.targetFps = targetFps;
                return this;
            }

            /**
             * Indicates whether the USB redirection feature is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   off
             * *   on
             */
            public Builder usbRedirect(String usbRedirect) {
                this.usbRedirect = usbRedirect;
                return this;
            }

            /**
             * The USB redirection rule.
             */
            public Builder usbSupplyRedirectRule(java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule) {
                this.usbSupplyRedirectRule = usbSupplyRedirectRule;
                return this;
            }

            /**
             * VideoEncAvgKbps.
             */
            public Builder videoEncAvgKbps(Integer videoEncAvgKbps) {
                this.videoEncAvgKbps = videoEncAvgKbps;
                return this;
            }

            /**
             * VideoEncMaxQP.
             */
            public Builder videoEncMaxQP(Integer videoEncMaxQP) {
                this.videoEncMaxQP = videoEncMaxQP;
                return this;
            }

            /**
             * VideoEncMinQP.
             */
            public Builder videoEncMinQP(Integer videoEncMinQP) {
                this.videoEncMinQP = videoEncMinQP;
                return this;
            }

            /**
             * VideoEncPeakKbps.
             */
            public Builder videoEncPeakKbps(Integer videoEncPeakKbps) {
                this.videoEncPeakKbps = videoEncPeakKbps;
                return this;
            }

            /**
             * VideoEncPolicy.
             */
            public Builder videoEncPolicy(String videoEncPolicy) {
                this.videoEncPolicy = videoEncPolicy;
                return this;
            }

            /**
             * Indicates whether the multimedia redirection feature is enabled. Valid values: on and off.
             */
            public Builder videoRedirect(String videoRedirect) {
                this.videoRedirect = videoRedirect;
                return this;
            }

            /**
             * The image display quality.
             * <p>
             * 
             * Valid values:
             * 
             * *   high: high-definition (HD)
             * *   low: fluent
             * *   medium (default): adaptive
             * *   lossless: no quality loss
             */
            public Builder visualQuality(String visualQuality) {
                this.visualQuality = visualQuality;
                return this;
            }

            /**
             * Indicates whether the watermarking feature is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   off
             * *   on
             */
            public Builder watermark(String watermark) {
                this.watermark = watermark;
                return this;
            }

            /**
             * Indicates whether the anti-screen photo feature is enabled for invisible watermarks. Valid values: on and off.
             */
            public Builder watermarkAntiCam(String watermarkAntiCam) {
                this.watermarkAntiCam = watermarkAntiCam;
                return this;
            }

            /**
             * The font color in red, green, and blue (RGB) of the watermark. Valid values: 0 to 16777215.
             */
            public Builder watermarkColor(Integer watermarkColor) {
                this.watermarkColor = watermarkColor;
                return this;
            }

            /**
             * This parameter is unavailable for public use.
             */
            public Builder watermarkCustomText(String watermarkCustomText) {
                this.watermarkCustomText = watermarkCustomText;
                return this;
            }

            /**
             * The slope of the watermark. Valid values: -10 to -30.
             */
            public Builder watermarkDegree(Double watermarkDegree) {
                this.watermarkDegree = watermarkDegree;
                return this;
            }

            /**
             * The font size of the watermark. Valid values: 10 to 20.
             */
            public Builder watermarkFontSize(Integer watermarkFontSize) {
                this.watermarkFontSize = watermarkFontSize;
                return this;
            }

            /**
             * The font style of the watermark. Valid values:
             * <p>
             * 
             * *   plain
             * *   bold
             */
            public Builder watermarkFontStyle(String watermarkFontStyle) {
                this.watermarkFontStyle = watermarkFontStyle;
                return this;
            }

            /**
             * The invisible watermark enhancement feature. Valid values: low, medium, and high.
             */
            public Builder watermarkPower(String watermarkPower) {
                this.watermarkPower = watermarkPower;
                return this;
            }

            /**
             * The number of watermark rows. This parameter is now invalid.
             */
            public Builder watermarkRowAmount(Integer watermarkRowAmount) {
                this.watermarkRowAmount = watermarkRowAmount;
                return this;
            }

            /**
             * Indicates whether the security priority for invisible watermarks is enabled. Valid values: on and off.
             */
            public Builder watermarkSecurity(String watermarkSecurity) {
                this.watermarkSecurity = watermarkSecurity;
                return this;
            }

            /**
             * The watermark transparency.
             * <p>
             * 
             * Valid values:
             * 
             * *   LIGHT
             * *   DARK
             * *   MIDDLE
             */
            public Builder watermarkTransparency(String watermarkTransparency) {
                this.watermarkTransparency = watermarkTransparency;
                return this;
            }

            /**
             * The watermark transparency. A greater value indicates that the watermark is less transparent. Valid values: 10 to 100.
             */
            public Builder watermarkTransparencyValue(Integer watermarkTransparencyValue) {
                this.watermarkTransparencyValue = watermarkTransparencyValue;
                return this;
            }

            /**
             * The watermark type.
             * <p>
             * 
             * Valid values:
             * 
             * *   HostName,EndUserId: The watermark is displayed in the following format: Rightmost 15 characters of the cloud desktop ID,Username.
             * *   EndUserId: The username is displayed.
             * *   EndUserId,HostName: The watermark is displayed in the following format: Username,Rightmost 15 characters of the cloud desktop ID.
             * *   HostName: The rightmost 15 characters of the cloud desktop ID are displayed.
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
