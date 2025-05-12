// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenterPolicyListResponseBody</p>
 */
public class DescribeCenterPolicyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DescribePolicyGroups")
    private java.util.List<DescribePolicyGroups> describePolicyGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenterPolicyListResponseBody(Builder builder) {
        this.describePolicyGroups = builder.describePolicyGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenterPolicyListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return describePolicyGroups
     */
    public java.util.List<DescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DescribePolicyGroups> describePolicyGroups; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCenterPolicyListResponseBody model) {
            this.describePolicyGroups = model.describePolicyGroups;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cloud computer policies.</p>
         */
        public Builder describePolicyGroups(java.util.List<DescribePolicyGroups> describePolicyGroups) {
            this.describePolicyGroups = describePolicyGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenterPolicyListResponseBody build() {
            return new DescribeCenterPolicyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AuthorizeAccessPolicyRules model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
            } 

            /**
             * <p>The client CIDR block from which end users can connect to cloud computers. The value is an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The remarks on the client CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AuthorizeSecurityPolicyRules model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
                this.ipProtocol = model.ipProtocol;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.priority = model.priority;
                this.type = model.type;
            } 

            /**
             * <p>The object to which the security group rule applies. The value is an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the security group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The protocol type of the security group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The authorization policy of the security group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The port range of the security group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the security group rule. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The direction of the security group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>inflow</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ClientTypes model) {
                this.clientType = model.clientType;
                this.status = model.status;
            } 

            /**
             * <p>The client type.</p>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>Indicates whether a specific client type can connect to cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DeviceRedirects model) {
                this.deviceType = model.deviceType;
                this.redirectType = model.redirectType;
            } 

            /**
             * <p>The peripheral type.</p>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The redirection type.</p>
             * 
             * <strong>example:</strong>
             * <p>usbRedirect</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("Platforms")
        private String platforms;

        @com.aliyun.core.annotation.NameInMap("RedirectType")
        private String redirectType;

        private DeviceRules(Builder builder) {
            this.deviceName = builder.deviceName;
            this.devicePid = builder.devicePid;
            this.deviceType = builder.deviceType;
            this.deviceVid = builder.deviceVid;
            this.optCommand = builder.optCommand;
            this.platforms = builder.platforms;
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
         * @return platforms
         */
        public String getPlatforms() {
            return this.platforms;
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
            private String platforms; 
            private String redirectType; 

            private Builder() {
            } 

            private Builder(DeviceRules model) {
                this.deviceName = model.deviceName;
                this.devicePid = model.devicePid;
                this.deviceType = model.deviceType;
                this.deviceVid = model.deviceVid;
                this.optCommand = model.optCommand;
                this.platforms = model.platforms;
                this.redirectType = model.redirectType;
            } 

            /**
             * <p>The device name.</p>
             * 
             * <strong>example:</strong>
             * <p>sandisk</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The product ID (PID).</p>
             * 
             * <strong>example:</strong>
             * <p>0x55b1</p>
             */
            public Builder devicePid(String devicePid) {
                this.devicePid = devicePid;
                return this;
            }

            /**
             * <p>The peripheral type.</p>
             * 
             * <strong>example:</strong>
             * <p>storage</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0x0781</p>
             */
            public Builder deviceVid(String deviceVid) {
                this.deviceVid = deviceVid;
                return this;
            }

            /**
             * <p>The link optimization command.</p>
             * 
             * <strong>example:</strong>
             * <p>2:0</p>
             */
            public Builder optCommand(String optCommand) {
                this.optCommand = optCommand;
                return this;
            }

            /**
             * Platforms.
             */
            public Builder platforms(String platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * <p>The redirection type.</p>
             * 
             * <strong>example:</strong>
             * <p>usbRedirect</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DomainResolveRule model) {
                this.description = model.description;
                this.domain = model.domain;
                this.policy = model.policy;
            } 

            /**
             * <p>The policy description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The resolution policy.</p>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NetRedirectRule model) {
                this.domain = model.domain;
                this.policy = model.policy;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The redirection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
    public static class UsbSupplyRedirectRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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
            private String productId; 
            private Long usbRedirectType; 
            private Long usbRuleType; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(UsbSupplyRedirectRule model) {
                this.description = model.description;
                this.productId = model.productId;
                this.usbRedirectType = model.usbRedirectType;
                this.usbRuleType = model.usbRuleType;
                this.vendorId = model.vendorId;
            } 

            /**
             * <p>The rule description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The product ID (PID).</p>
             * 
             * <strong>example:</strong>
             * <p>08**</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>Indicates whether USB redirection is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRedirectType(Long usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * <p>The type of the USB redirection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRuleType(Long usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>04**</p>
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
    /**
     * 
     * {@link DescribeCenterPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenterPolicyListResponseBody</p>
     */
    public static class DescribePolicyGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminAccess")
        private String adminAccess;

        @com.aliyun.core.annotation.NameInMap("AppContentProtection")
        private String appContentProtection;

        @com.aliyun.core.annotation.NameInMap("AuthorizeAccessPolicyRules")
        private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        @com.aliyun.core.annotation.NameInMap("AuthorizeSecurityPolicyRules")
        private java.util.List<AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        @com.aliyun.core.annotation.NameInMap("CameraRedirect")
        private String cameraRedirect;

        @com.aliyun.core.annotation.NameInMap("ClientTypes")
        private java.util.List<ClientTypes> clientTypes;

        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        @com.aliyun.core.annotation.NameInMap("ColorEnhancement")
        private String colorEnhancement;

        @com.aliyun.core.annotation.NameInMap("CpuDownGradeDuration")
        private Integer cpuDownGradeDuration;

        @com.aliyun.core.annotation.NameInMap("CpuProcessors")
        private java.util.List<String> cpuProcessors;

        @com.aliyun.core.annotation.NameInMap("CpuProtectedMode")
        private String cpuProtectedMode;

        @com.aliyun.core.annotation.NameInMap("CpuRateLimit")
        private Integer cpuRateLimit;

        @com.aliyun.core.annotation.NameInMap("CpuSampleDuration")
        private Integer cpuSampleDuration;

        @com.aliyun.core.annotation.NameInMap("CpuSingleRateLimit")
        private Integer cpuSingleRateLimit;

        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private Integer desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupCount")
        private Integer desktopGroupCount;

        @com.aliyun.core.annotation.NameInMap("DeviceRedirects")
        private java.util.List<DeviceRedirects> deviceRedirects;

        @com.aliyun.core.annotation.NameInMap("DeviceRules")
        private java.util.List<DeviceRules> deviceRules;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSession")
        private String disconnectKeepSession;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSessionTime")
        private Integer disconnectKeepSessionTime;

        @com.aliyun.core.annotation.NameInMap("DisplayMode")
        private String displayMode;

        @com.aliyun.core.annotation.NameInMap("DomainRegisterValue")
        private String domainRegisterValue;

        @com.aliyun.core.annotation.NameInMap("DomainResolveRule")
        private java.util.List<DomainResolveRule> domainResolveRule;

        @com.aliyun.core.annotation.NameInMap("DomainResolveRuleType")
        private String domainResolveRuleType;

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

        @com.aliyun.core.annotation.NameInMap("InternetPrinter")
        private String internetPrinter;

        @com.aliyun.core.annotation.NameInMap("LocalDrive")
        private String localDrive;

        @com.aliyun.core.annotation.NameInMap("MaxReconnectTime")
        private Integer maxReconnectTime;

        @com.aliyun.core.annotation.NameInMap("MemoryDownGradeDuration")
        private Integer memoryDownGradeDuration;

        @com.aliyun.core.annotation.NameInMap("MemoryProcessors")
        private java.util.List<String> memoryProcessors;

        @com.aliyun.core.annotation.NameInMap("MemoryProtectedMode")
        private String memoryProtectedMode;

        @com.aliyun.core.annotation.NameInMap("MemoryRateLimit")
        private Integer memoryRateLimit;

        @com.aliyun.core.annotation.NameInMap("MemorySampleDuration")
        private Integer memorySampleDuration;

        @com.aliyun.core.annotation.NameInMap("MemorySingleRateLimit")
        private Integer memorySingleRateLimit;

        @com.aliyun.core.annotation.NameInMap("MobileRestart")
        private String mobileRestart;

        @com.aliyun.core.annotation.NameInMap("MobileShutdown")
        private String mobileShutdown;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetRedirect")
        private String netRedirect;

        @com.aliyun.core.annotation.NameInMap("NetRedirectRule")
        private java.util.List<NetRedirectRule> netRedirectRule;

        @com.aliyun.core.annotation.NameInMap("NoOperationDisconnect")
        private String noOperationDisconnect;

        @com.aliyun.core.annotation.NameInMap("NoOperationDisconnectTime")
        private Integer noOperationDisconnectTime;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupType")
        private String policyGroupType;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("PrinterRedirection")
        private String printerRedirection;

        @com.aliyun.core.annotation.NameInMap("QualityEnhancement")
        private String qualityEnhancement;

        @com.aliyun.core.annotation.NameInMap("RecordContent")
        private String recordContent;

        @com.aliyun.core.annotation.NameInMap("RecordContentExpires")
        private Long recordContentExpires;

        @com.aliyun.core.annotation.NameInMap("RecordEventDuration")
        private Integer recordEventDuration;

        @com.aliyun.core.annotation.NameInMap("RecordEventFilePaths")
        private java.util.List<String> recordEventFilePaths;

        @com.aliyun.core.annotation.NameInMap("RecordEventRegisters")
        private java.util.List<String> recordEventRegisters;

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

        @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
        private Integer resolutionHeight;

        @com.aliyun.core.annotation.NameInMap("ResolutionModel")
        private String resolutionModel;

        @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
        private Integer resolutionWidth;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupCount")
        private Integer resourceGroupCount;

        @com.aliyun.core.annotation.NameInMap("SafeMenu")
        private String safeMenu;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("ScopeValue")
        private java.util.List<String> scopeValue;

        @com.aliyun.core.annotation.NameInMap("SmoothEnhancement")
        private String smoothEnhancement;

        @com.aliyun.core.annotation.NameInMap("StatusMonitor")
        private String statusMonitor;

        @com.aliyun.core.annotation.NameInMap("StreamingMode")
        private String streamingMode;

        @com.aliyun.core.annotation.NameInMap("TargetFps")
        private Integer targetFps;

        @com.aliyun.core.annotation.NameInMap("Taskbar")
        private String taskbar;

        @com.aliyun.core.annotation.NameInMap("UsbRedirect")
        private String usbRedirect;

        @com.aliyun.core.annotation.NameInMap("UsbSupplyRedirectRule")
        private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule;

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

        @com.aliyun.core.annotation.NameInMap("WatermarkTransparencyValue")
        private Integer watermarkTransparencyValue;

        @com.aliyun.core.annotation.NameInMap("WatermarkType")
        private String watermarkType;

        @com.aliyun.core.annotation.NameInMap("WyAssistant")
        private String wyAssistant;

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
            this.desktopCount = builder.desktopCount;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.deviceRedirects = builder.deviceRedirects;
            this.deviceRules = builder.deviceRules;
            this.disconnectKeepSession = builder.disconnectKeepSession;
            this.disconnectKeepSessionTime = builder.disconnectKeepSessionTime;
            this.displayMode = builder.displayMode;
            this.domainRegisterValue = builder.domainRegisterValue;
            this.domainResolveRule = builder.domainResolveRule;
            this.domainResolveRuleType = builder.domainResolveRuleType;
            this.endUserApplyAdminCoordinate = builder.endUserApplyAdminCoordinate;
            this.endUserGroupCoordinate = builder.endUserGroupCoordinate;
            this.gpuAcceleration = builder.gpuAcceleration;
            this.html5Access = builder.html5Access;
            this.html5FileTransfer = builder.html5FileTransfer;
            this.internetCommunicationProtocol = builder.internetCommunicationProtocol;
            this.internetPrinter = builder.internetPrinter;
            this.localDrive = builder.localDrive;
            this.maxReconnectTime = builder.maxReconnectTime;
            this.memoryDownGradeDuration = builder.memoryDownGradeDuration;
            this.memoryProcessors = builder.memoryProcessors;
            this.memoryProtectedMode = builder.memoryProtectedMode;
            this.memoryRateLimit = builder.memoryRateLimit;
            this.memorySampleDuration = builder.memorySampleDuration;
            this.memorySingleRateLimit = builder.memorySingleRateLimit;
            this.mobileRestart = builder.mobileRestart;
            this.mobileShutdown = builder.mobileShutdown;
            this.name = builder.name;
            this.netRedirect = builder.netRedirect;
            this.netRedirectRule = builder.netRedirectRule;
            this.noOperationDisconnect = builder.noOperationDisconnect;
            this.noOperationDisconnectTime = builder.noOperationDisconnectTime;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupType = builder.policyGroupType;
            this.policyStatus = builder.policyStatus;
            this.printerRedirection = builder.printerRedirection;
            this.qualityEnhancement = builder.qualityEnhancement;
            this.recordContent = builder.recordContent;
            this.recordContentExpires = builder.recordContentExpires;
            this.recordEventDuration = builder.recordEventDuration;
            this.recordEventFilePaths = builder.recordEventFilePaths;
            this.recordEventRegisters = builder.recordEventRegisters;
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
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionModel = builder.resolutionModel;
            this.resolutionWidth = builder.resolutionWidth;
            this.resourceGroupCount = builder.resourceGroupCount;
            this.safeMenu = builder.safeMenu;
            this.scope = builder.scope;
            this.scopeValue = builder.scopeValue;
            this.smoothEnhancement = builder.smoothEnhancement;
            this.statusMonitor = builder.statusMonitor;
            this.streamingMode = builder.streamingMode;
            this.targetFps = builder.targetFps;
            this.taskbar = builder.taskbar;
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
            this.watermarkTransparencyValue = builder.watermarkTransparencyValue;
            this.watermarkType = builder.watermarkType;
            this.wyAssistant = builder.wyAssistant;
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
        public java.util.List<AuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        /**
         * @return authorizeSecurityPolicyRules
         */
        public java.util.List<AuthorizeSecurityPolicyRules> getAuthorizeSecurityPolicyRules() {
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
        public java.util.List<ClientTypes> getClientTypes() {
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
        public java.util.List<String> getCpuProcessors() {
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
         * @return desktopCount
         */
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopGroupCount
         */
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        /**
         * @return deviceRedirects
         */
        public java.util.List<DeviceRedirects> getDeviceRedirects() {
            return this.deviceRedirects;
        }

        /**
         * @return deviceRules
         */
        public java.util.List<DeviceRules> getDeviceRules() {
            return this.deviceRules;
        }

        /**
         * @return disconnectKeepSession
         */
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        /**
         * @return disconnectKeepSessionTime
         */
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        /**
         * @return displayMode
         */
        public String getDisplayMode() {
            return this.displayMode;
        }

        /**
         * @return domainRegisterValue
         */
        public String getDomainRegisterValue() {
            return this.domainRegisterValue;
        }

        /**
         * @return domainResolveRule
         */
        public java.util.List<DomainResolveRule> getDomainResolveRule() {
            return this.domainResolveRule;
        }

        /**
         * @return domainResolveRuleType
         */
        public String getDomainResolveRuleType() {
            return this.domainResolveRuleType;
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
         * @return internetPrinter
         */
        public String getInternetPrinter() {
            return this.internetPrinter;
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
        public java.util.List<String> getMemoryProcessors() {
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
         * @return mobileRestart
         */
        public String getMobileRestart() {
            return this.mobileRestart;
        }

        /**
         * @return mobileShutdown
         */
        public String getMobileShutdown() {
            return this.mobileShutdown;
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
        public java.util.List<NetRedirectRule> getNetRedirectRule() {
            return this.netRedirectRule;
        }

        /**
         * @return noOperationDisconnect
         */
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        /**
         * @return noOperationDisconnectTime
         */
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
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
         * @return recordEventDuration
         */
        public Integer getRecordEventDuration() {
            return this.recordEventDuration;
        }

        /**
         * @return recordEventFilePaths
         */
        public java.util.List<String> getRecordEventFilePaths() {
            return this.recordEventFilePaths;
        }

        /**
         * @return recordEventRegisters
         */
        public java.util.List<String> getRecordEventRegisters() {
            return this.recordEventRegisters;
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
         * @return resolutionHeight
         */
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        /**
         * @return resolutionModel
         */
        public String getResolutionModel() {
            return this.resolutionModel;
        }

        /**
         * @return resolutionWidth
         */
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        /**
         * @return resourceGroupCount
         */
        public Integer getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        /**
         * @return safeMenu
         */
        public String getSafeMenu() {
            return this.safeMenu;
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
        public java.util.List<String> getScopeValue() {
            return this.scopeValue;
        }

        /**
         * @return smoothEnhancement
         */
        public String getSmoothEnhancement() {
            return this.smoothEnhancement;
        }

        /**
         * @return statusMonitor
         */
        public String getStatusMonitor() {
            return this.statusMonitor;
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
         * @return taskbar
         */
        public String getTaskbar() {
            return this.taskbar;
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
        public java.util.List<UsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
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

        /**
         * @return wyAssistant
         */
        public String getWyAssistant() {
            return this.wyAssistant;
        }

        public static final class Builder {
            private String adminAccess; 
            private String appContentProtection; 
            private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules; 
            private java.util.List<AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules; 
            private String cameraRedirect; 
            private java.util.List<ClientTypes> clientTypes; 
            private String clipboard; 
            private String colorEnhancement; 
            private Integer cpuDownGradeDuration; 
            private java.util.List<String> cpuProcessors; 
            private String cpuProtectedMode; 
            private Integer cpuRateLimit; 
            private Integer cpuSampleDuration; 
            private Integer cpuSingleRateLimit; 
            private Integer desktopCount; 
            private Integer desktopGroupCount; 
            private java.util.List<DeviceRedirects> deviceRedirects; 
            private java.util.List<DeviceRules> deviceRules; 
            private String disconnectKeepSession; 
            private Integer disconnectKeepSessionTime; 
            private String displayMode; 
            private String domainRegisterValue; 
            private java.util.List<DomainResolveRule> domainResolveRule; 
            private String domainResolveRuleType; 
            private String endUserApplyAdminCoordinate; 
            private String endUserGroupCoordinate; 
            private String gpuAcceleration; 
            private String html5Access; 
            private String html5FileTransfer; 
            private String internetCommunicationProtocol; 
            private String internetPrinter; 
            private String localDrive; 
            private Integer maxReconnectTime; 
            private Integer memoryDownGradeDuration; 
            private java.util.List<String> memoryProcessors; 
            private String memoryProtectedMode; 
            private Integer memoryRateLimit; 
            private Integer memorySampleDuration; 
            private Integer memorySingleRateLimit; 
            private String mobileRestart; 
            private String mobileShutdown; 
            private String name; 
            private String netRedirect; 
            private java.util.List<NetRedirectRule> netRedirectRule; 
            private String noOperationDisconnect; 
            private Integer noOperationDisconnectTime; 
            private String policyGroupId; 
            private String policyGroupType; 
            private String policyStatus; 
            private String printerRedirection; 
            private String qualityEnhancement; 
            private String recordContent; 
            private Long recordContentExpires; 
            private Integer recordEventDuration; 
            private java.util.List<String> recordEventFilePaths; 
            private java.util.List<String> recordEventRegisters; 
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
            private Integer resolutionHeight; 
            private String resolutionModel; 
            private Integer resolutionWidth; 
            private Integer resourceGroupCount; 
            private String safeMenu; 
            private String scope; 
            private java.util.List<String> scopeValue; 
            private String smoothEnhancement; 
            private String statusMonitor; 
            private String streamingMode; 
            private Integer targetFps; 
            private String taskbar; 
            private String usbRedirect; 
            private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule; 
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
            private Integer watermarkTransparencyValue; 
            private String watermarkType; 
            private String wyAssistant; 

            private Builder() {
            } 

            private Builder(DescribePolicyGroups model) {
                this.adminAccess = model.adminAccess;
                this.appContentProtection = model.appContentProtection;
                this.authorizeAccessPolicyRules = model.authorizeAccessPolicyRules;
                this.authorizeSecurityPolicyRules = model.authorizeSecurityPolicyRules;
                this.cameraRedirect = model.cameraRedirect;
                this.clientTypes = model.clientTypes;
                this.clipboard = model.clipboard;
                this.colorEnhancement = model.colorEnhancement;
                this.cpuDownGradeDuration = model.cpuDownGradeDuration;
                this.cpuProcessors = model.cpuProcessors;
                this.cpuProtectedMode = model.cpuProtectedMode;
                this.cpuRateLimit = model.cpuRateLimit;
                this.cpuSampleDuration = model.cpuSampleDuration;
                this.cpuSingleRateLimit = model.cpuSingleRateLimit;
                this.desktopCount = model.desktopCount;
                this.desktopGroupCount = model.desktopGroupCount;
                this.deviceRedirects = model.deviceRedirects;
                this.deviceRules = model.deviceRules;
                this.disconnectKeepSession = model.disconnectKeepSession;
                this.disconnectKeepSessionTime = model.disconnectKeepSessionTime;
                this.displayMode = model.displayMode;
                this.domainRegisterValue = model.domainRegisterValue;
                this.domainResolveRule = model.domainResolveRule;
                this.domainResolveRuleType = model.domainResolveRuleType;
                this.endUserApplyAdminCoordinate = model.endUserApplyAdminCoordinate;
                this.endUserGroupCoordinate = model.endUserGroupCoordinate;
                this.gpuAcceleration = model.gpuAcceleration;
                this.html5Access = model.html5Access;
                this.html5FileTransfer = model.html5FileTransfer;
                this.internetCommunicationProtocol = model.internetCommunicationProtocol;
                this.internetPrinter = model.internetPrinter;
                this.localDrive = model.localDrive;
                this.maxReconnectTime = model.maxReconnectTime;
                this.memoryDownGradeDuration = model.memoryDownGradeDuration;
                this.memoryProcessors = model.memoryProcessors;
                this.memoryProtectedMode = model.memoryProtectedMode;
                this.memoryRateLimit = model.memoryRateLimit;
                this.memorySampleDuration = model.memorySampleDuration;
                this.memorySingleRateLimit = model.memorySingleRateLimit;
                this.mobileRestart = model.mobileRestart;
                this.mobileShutdown = model.mobileShutdown;
                this.name = model.name;
                this.netRedirect = model.netRedirect;
                this.netRedirectRule = model.netRedirectRule;
                this.noOperationDisconnect = model.noOperationDisconnect;
                this.noOperationDisconnectTime = model.noOperationDisconnectTime;
                this.policyGroupId = model.policyGroupId;
                this.policyGroupType = model.policyGroupType;
                this.policyStatus = model.policyStatus;
                this.printerRedirection = model.printerRedirection;
                this.qualityEnhancement = model.qualityEnhancement;
                this.recordContent = model.recordContent;
                this.recordContentExpires = model.recordContentExpires;
                this.recordEventDuration = model.recordEventDuration;
                this.recordEventFilePaths = model.recordEventFilePaths;
                this.recordEventRegisters = model.recordEventRegisters;
                this.recording = model.recording;
                this.recordingAudio = model.recordingAudio;
                this.recordingDuration = model.recordingDuration;
                this.recordingEndTime = model.recordingEndTime;
                this.recordingExpires = model.recordingExpires;
                this.recordingFps = model.recordingFps;
                this.recordingStartTime = model.recordingStartTime;
                this.recordingUserNotify = model.recordingUserNotify;
                this.recordingUserNotifyMessage = model.recordingUserNotifyMessage;
                this.remoteCoordinate = model.remoteCoordinate;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionModel = model.resolutionModel;
                this.resolutionWidth = model.resolutionWidth;
                this.resourceGroupCount = model.resourceGroupCount;
                this.safeMenu = model.safeMenu;
                this.scope = model.scope;
                this.scopeValue = model.scopeValue;
                this.smoothEnhancement = model.smoothEnhancement;
                this.statusMonitor = model.statusMonitor;
                this.streamingMode = model.streamingMode;
                this.targetFps = model.targetFps;
                this.taskbar = model.taskbar;
                this.usbRedirect = model.usbRedirect;
                this.usbSupplyRedirectRule = model.usbSupplyRedirectRule;
                this.videoEncAvgKbps = model.videoEncAvgKbps;
                this.videoEncMaxQP = model.videoEncMaxQP;
                this.videoEncMinQP = model.videoEncMinQP;
                this.videoEncPeakKbps = model.videoEncPeakKbps;
                this.videoEncPolicy = model.videoEncPolicy;
                this.videoRedirect = model.videoRedirect;
                this.visualQuality = model.visualQuality;
                this.watermark = model.watermark;
                this.watermarkAntiCam = model.watermarkAntiCam;
                this.watermarkColor = model.watermarkColor;
                this.watermarkCustomText = model.watermarkCustomText;
                this.watermarkDegree = model.watermarkDegree;
                this.watermarkFontSize = model.watermarkFontSize;
                this.watermarkFontStyle = model.watermarkFontStyle;
                this.watermarkPower = model.watermarkPower;
                this.watermarkRowAmount = model.watermarkRowAmount;
                this.watermarkSecurity = model.watermarkSecurity;
                this.watermarkTransparencyValue = model.watermarkTransparencyValue;
                this.watermarkType = model.watermarkType;
                this.wyAssistant = model.wyAssistant;
            } 

            /**
             * <p>Indicates whether the admin permissions are granted to end users.</p>
             * <blockquote>
             * <p> This parameter is in private preview and only available to specific users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder adminAccess(String adminAccess) {
                this.adminAccess = adminAccess;
                return this;
            }

            /**
             * <p>Indicates whether anti-screenshot is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder appContentProtection(String appContentProtection) {
                this.appContentProtection = appContentProtection;
                return this;
            }

            /**
             * <p>The client IP address whitelists.</p>
             */
            public Builder authorizeAccessPolicyRules(java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
                this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
                return this;
            }

            /**
             * <p>The security group rules.</p>
             */
            public Builder authorizeSecurityPolicyRules(java.util.List<AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
                this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
                return this;
            }

            /**
             * <p>Indicates whether on-premises webcam redirection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder cameraRedirect(String cameraRedirect) {
                this.cameraRedirect = cameraRedirect;
                return this;
            }

            /**
             * <p>The logon method control rules.</p>
             */
            public Builder clientTypes(java.util.List<ClientTypes> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * <p>The read/write permissions on the clipboard.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * <p>Indicates whether color enhancement is enabled for design and 3D applications.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder colorEnhancement(String colorEnhancement) {
                this.colorEnhancement = colorEnhancement;
                return this;
            }

            /**
             * <p>The CPU underclocking duration. Valid values: 30 to 120. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder cpuDownGradeDuration(Integer cpuDownGradeDuration) {
                this.cpuDownGradeDuration = cpuDownGradeDuration;
                return this;
            }

            /**
             * <p>The CPU processors.</p>
             */
            public Builder cpuProcessors(java.util.List<String> cpuProcessors) {
                this.cpuProcessors = cpuProcessors;
                return this;
            }

            /**
             * <p>The CPU spike protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder cpuProtectedMode(String cpuProtectedMode) {
                this.cpuProtectedMode = cpuProtectedMode;
                return this;
            }

            /**
             * <p>The overall CPU usage. Valid values: 70 to 90. Unit: percentage (%).</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuRateLimit(Integer cpuRateLimit) {
                this.cpuRateLimit = cpuRateLimit;
                return this;
            }

            /**
             * <p>The overall CPU sampling duration. Valid values: 10 to 60. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpuSampleDuration(Integer cpuSampleDuration) {
                this.cpuSampleDuration = cpuSampleDuration;
                return this;
            }

            /**
             * <p>The single-CPU usage. Valid values: 70 to 100. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuSingleRateLimit(Integer cpuSingleRateLimit) {
                this.cpuSingleRateLimit = cpuSingleRateLimit;
                return this;
            }

            /**
             * <p>The number of cloud computers that are associated with the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Integer desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The number of cloud computer shares that are associated with the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopGroupCount(Integer desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * <p>The device redirection rules.</p>
             */
            public Builder deviceRedirects(java.util.List<DeviceRedirects> deviceRedirects) {
                this.deviceRedirects = deviceRedirects;
                return this;
            }

            /**
             * <p>The custom peripheral rules.</p>
             */
            public Builder deviceRules(java.util.List<DeviceRules> deviceRules) {
                this.deviceRules = deviceRules;
                return this;
            }

            /**
             * <p>Indicates whether the session is retained after disconnection.</p>
             * <blockquote>
             * <p> This parameter applies only to cloud application policies.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>persistent</p>
             */
            public Builder disconnectKeepSession(String disconnectKeepSession) {
                this.disconnectKeepSession = disconnectKeepSession;
                return this;
            }

            /**
             * <p>The retention period of the session after disconnection. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter applies only to cloud application policies.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder disconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
                this.disconnectKeepSessionTime = disconnectKeepSessionTime;
                return this;
            }

            /**
             * <p>The display mode.</p>
             * 
             * <strong>example:</strong>
             * <p>adminCustom</p>
             */
            public Builder displayMode(String displayMode) {
                this.displayMode = displayMode;
                return this;
            }

            /**
             * <p>The field where the domain resolution policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder domainRegisterValue(String domainRegisterValue) {
                this.domainRegisterValue = domainRegisterValue;
                return this;
            }

            /**
             * <p>The domain resolution policies.</p>
             */
            public Builder domainResolveRule(java.util.List<DomainResolveRule> domainResolveRule) {
                this.domainResolveRule = domainResolveRule;
                return this;
            }

            /**
             * <p>Indicates whether domain name resolution is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder domainResolveRuleType(String domainResolveRuleType) {
                this.domainResolveRuleType = domainResolveRuleType;
                return this;
            }

            /**
             * <p>Indicates whether end users are allowed to request administrator help.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
                this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
                return this;
            }

            /**
             * <p>Indicates whether end users in the same office network can share cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
                this.endUserGroupCoordinate = endUserGroupCoordinate;
                return this;
            }

            /**
             * <p>Indicates whether image quality control is enabled. For optimal computer performance and user experience in professional design scenarios, we recommend enabling this feature.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder gpuAcceleration(String gpuAcceleration) {
                this.gpuAcceleration = gpuAcceleration;
                return this;
            }

            /**
             * <p>The web client access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder html5Access(String html5Access) {
                this.html5Access = html5Access;
                return this;
            }

            /**
             * <p>The file transfer feature on the web client.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * <p>The network communication protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
                this.internetCommunicationProtocol = internetCommunicationProtocol;
                return this;
            }

            /**
             * InternetPrinter.
             */
            public Builder internetPrinter(String internetPrinter) {
                this.internetPrinter = internetPrinter;
                return this;
            }

            /**
             * <p>The read/write permissions on the on-premises drive.</p>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder localDrive(String localDrive) {
                this.localDrive = localDrive;
                return this;
            }

            /**
             * <p>The maximum duration to retry reconnecting to cloud computers after an unexpected disconnection (non-human causes). Valid values: 30 to 7200. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder maxReconnectTime(Integer maxReconnectTime) {
                this.maxReconnectTime = maxReconnectTime;
                return this;
            }

            /**
             * <p>The memory underclocking duration per process. Valid values: 30 to 120. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memoryDownGradeDuration(Integer memoryDownGradeDuration) {
                this.memoryDownGradeDuration = memoryDownGradeDuration;
                return this;
            }

            /**
             * <p>The memory processors.</p>
             */
            public Builder memoryProcessors(java.util.List<String> memoryProcessors) {
                this.memoryProcessors = memoryProcessors;
                return this;
            }

            /**
             * <p>The memory spike protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder memoryProtectedMode(String memoryProtectedMode) {
                this.memoryProtectedMode = memoryProtectedMode;
                return this;
            }

            /**
             * <p>The overall memory usage. Valid values: 70 to 90. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder memoryRateLimit(Integer memoryRateLimit) {
                this.memoryRateLimit = memoryRateLimit;
                return this;
            }

            /**
             * <p>The overall memory sampling duration. Valid values: 30 to 60. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memorySampleDuration(Integer memorySampleDuration) {
                this.memorySampleDuration = memorySampleDuration;
                return this;
            }

            /**
             * <p>The memory usage per process. Valid values: 30 to 60. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memorySingleRateLimit(Integer memorySingleRateLimit) {
                this.memorySingleRateLimit = memorySingleRateLimit;
                return this;
            }

            /**
             * <p>Indicates whether the Restart button is displayed in the DesktopAssistant menu when end users connect to cloud computers from Android clients.</p>
             * <blockquote>
             * <p> This feature applies to only mobile clients of version 7.4.0 or later.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder mobileRestart(String mobileRestart) {
                this.mobileRestart = mobileRestart;
                return this;
            }

            /**
             * <p>Indicates whether the Stop button is displayed in the DesktopAssistant menu when end users connect to cloud computers from Android clients.</p>
             * <blockquote>
             * <p> This feature applies to only mobile clients of version 7.4.0 or later.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder mobileShutdown(String mobileShutdown) {
                this.mobileShutdown = mobileShutdown;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>testPolicyGroupName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network redirection policy.</p>
             * <blockquote>
             * <p> This parameter is in private preview and only available to specific users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder netRedirect(String netRedirect) {
                this.netRedirect = netRedirect;
                return this;
            }

            /**
             * <p>The network redirection policies.</p>
             * <blockquote>
             * <p> This parameter is in private preview and only available to specific users.</p>
             * </blockquote>
             */
            public Builder netRedirectRule(java.util.List<NetRedirectRule> netRedirectRule) {
                this.netRedirectRule = netRedirectRule;
                return this;
            }

            /**
             * <p>Indicates whether a disconnection is enforced upon inactivity.</p>
             * <blockquote>
             * <p> This parameter applies only to cloud application policies.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder noOperationDisconnect(String noOperationDisconnect) {
                this.noOperationDisconnect = noOperationDisconnect;
                return this;
            }

            /**
             * <p>The duration of disconnection after inactivity. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter applies only to cloud application policies.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder noOperationDisconnectTime(Integer noOperationDisconnectTime) {
                this.noOperationDisconnectTime = noOperationDisconnectTime;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-gx2x1dhsmthe9****</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder policyGroupType(String policyGroupType) {
                this.policyGroupType = policyGroupType;
                return this;
            }

            /**
             * <p>The status of the cloud computer policy.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>The printer redirection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder printerRedirection(String printerRedirection) {
                this.printerRedirection = printerRedirection;
                return this;
            }

            /**
             * <p>Indicates whether image quality enhancement is enabled for design and 3D applications.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder qualityEnhancement(String qualityEnhancement) {
                this.qualityEnhancement = qualityEnhancement;
                return this;
            }

            /**
             * <p>Indicates whether custom screen recording is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * <p>The duration for which custom screen recordings are kept before they expire. Default value: 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder recordContentExpires(Long recordContentExpires) {
                this.recordContentExpires = recordContentExpires;
                return this;
            }

            /**
             * <p>The duration of screen recording after the specified event is detected. Unit: minutes. Valid values: 10 to 60.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordEventDuration(Integer recordEventDuration) {
                this.recordEventDuration = recordEventDuration;
                return this;
            }

            /**
             * <p>The absolute paths to screen recording files.</p>
             */
            public Builder recordEventFilePaths(java.util.List<String> recordEventFilePaths) {
                this.recordEventFilePaths = recordEventFilePaths;
                return this;
            }

            /**
             * <p>The absolute paths to screen recording registries.</p>
             */
            public Builder recordEventRegisters(java.util.List<String> recordEventRegisters) {
                this.recordEventRegisters = recordEventRegisters;
                return this;
            }

            /**
             * <p>Indicates whether screen recording is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder recording(String recording) {
                this.recording = recording;
                return this;
            }

            /**
             * <p>Indicates whether audio files generated on cloud computers are recorded.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder recordingAudio(String recordingAudio) {
                this.recordingAudio = recordingAudio;
                return this;
            }

            /**
             * <p>The length of the screen recording file. Unit: minutes. Screen recording files are split by the specified length and uploaded to OSS buckets. Once a file reaches 300 MB, the system prioritizes rolling updates for that file.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * <p>The end time of screen recording. The value is in the HH:MM:SS format. The value is meaningful only when you set Recording to period.</p>
             * 
             * <strong>example:</strong>
             * <p>08:59:00</p>
             */
            public Builder recordingEndTime(String recordingEndTime) {
                this.recordingEndTime = recordingEndTime;
                return this;
            }

            /**
             * <p>The retention period of the screen recording file. Valid values: 1 to 180. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder recordingExpires(Long recordingExpires) {
                this.recordingExpires = recordingExpires;
                return this;
            }

            /**
             * <p>The frame rate of screen recording. Unit: fps.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder recordingFps(Long recordingFps) {
                this.recordingFps = recordingFps;
                return this;
            }

            /**
             * <p>The start time of screen recording. The value is in the HH:MM:SS format. The value is meaningful only when you set Recording to period.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00:00</p>
             */
            public Builder recordingStartTime(String recordingStartTime) {
                this.recordingStartTime = recordingStartTime;
                return this;
            }

            /**
             * <p>Indicates whether to notify end users when screen recording is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder recordingUserNotify(String recordingUserNotify) {
                this.recordingUserNotify = recordingUserNotify;
                return this;
            }

            /**
             * <p>The notification sent to end users when screen recording is enabled.</p>
             */
            public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
                this.recordingUserNotifyMessage = recordingUserNotifyMessage;
                return this;
            }

            /**
             * <p>The keyboard and mouse control permissions during remote assistance.</p>
             * 
             * <strong>example:</strong>
             * <p>fullControl</p>
             */
            public Builder remoteCoordinate(String remoteCoordinate) {
                this.remoteCoordinate = remoteCoordinate;
                return this;
            }

            /**
             * <p>The height of the resolution. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * <p>The resolution type.</p>
             * 
             * <strong>example:</strong>
             * <p>adaptive</p>
             */
            public Builder resolutionModel(String resolutionModel) {
                this.resolutionModel = resolutionModel;
                return this;
            }

            /**
             * <p>The width of the resolution. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            /**
             * <p>The number of resource groups that are associated with the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceGroupCount(Integer resourceGroupCount) {
                this.resourceGroupCount = resourceGroupCount;
                return this;
            }

            /**
             * SafeMenu.
             */
            public Builder safeMenu(String safeMenu) {
                this.safeMenu = safeMenu;
                return this;
            }

            /**
             * <p>The effective scope of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>GLOBAL</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The effective scopes specified by CIDR blocks.</p>
             */
            public Builder scopeValue(java.util.List<String> scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * <p>Indicates whether smoothness enhancement is enabled for daily office use.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder smoothEnhancement(String smoothEnhancement) {
                this.smoothEnhancement = smoothEnhancement;
                return this;
            }

            /**
             * <p>Indicates whether the metric status entry is displayed in the DesktopAssistant menu.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder statusMonitor(String statusMonitor) {
                this.statusMonitor = statusMonitor;
                return this;
            }

            /**
             * <p>The streaming mode.</p>
             * 
             * <strong>example:</strong>
             * <p>smooth</p>
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * <p>The target frame rate. Valid values: 10 to 60. Unit: fps.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder targetFps(Integer targetFps) {
                this.targetFps = targetFps;
                return this;
            }

            /**
             * <p>Indicates whether the application taskbar is displayed.</p>
             * <blockquote>
             * <p> This parameter applies only to cloud application policies.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder taskbar(String taskbar) {
                this.taskbar = taskbar;
                return this;
            }

            /**
             * <p>The USB redirection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder usbRedirect(String usbRedirect) {
                this.usbRedirect = usbRedirect;
                return this;
            }

            /**
             * <p>The USB redirection rules.</p>
             */
            public Builder usbSupplyRedirectRule(java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule) {
                this.usbSupplyRedirectRule = usbSupplyRedirectRule;
                return this;
            }

            /**
             * <p>The average bitrate for video encoding. Unit: Kbit/s. Valid values: 1000 to 50000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder videoEncAvgKbps(Integer videoEncAvgKbps) {
                this.videoEncAvgKbps = videoEncAvgKbps;
                return this;
            }

            /**
             * <p>The maximum QP for video files. Higher QP values result in lower video quality. Valid values: 0 to 51.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder videoEncMaxQP(Integer videoEncMaxQP) {
                this.videoEncMaxQP = videoEncMaxQP;
                return this;
            }

            /**
             * <p>The minimum quantizer parameter (QP) for video files. A lower QP means better video quality. Valid values: 0 to 51.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder videoEncMinQP(Integer videoEncMinQP) {
                this.videoEncMinQP = videoEncMinQP;
                return this;
            }

            /**
             * <p>The peak bitrate for video encoding. Unit: Kbit/s. Valid values: 1000 to 50000.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder videoEncPeakKbps(Integer videoEncPeakKbps) {
                this.videoEncPeakKbps = videoEncPeakKbps;
                return this;
            }

            /**
             * <p>The video encoding policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qualityFirst</p>
             */
            public Builder videoEncPolicy(String videoEncPolicy) {
                this.videoEncPolicy = videoEncPolicy;
                return this;
            }

            /**
             * <p>Indicates whether multimedia redirection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder videoRedirect(String videoRedirect) {
                this.videoRedirect = videoRedirect;
                return this;
            }

            /**
             * <p>The image quality policy.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder visualQuality(String visualQuality) {
                this.visualQuality = visualQuality;
                return this;
            }

            /**
             * <p>The watermark policy.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder watermark(String watermark) {
                this.watermark = watermark;
                return this;
            }

            /**
             * <p>Indicates whether anti-screen capture is enabled for invisible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder watermarkAntiCam(String watermarkAntiCam) {
                this.watermarkAntiCam = watermarkAntiCam;
                return this;
            }

            /**
             * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder watermarkColor(Integer watermarkColor) {
                this.watermarkColor = watermarkColor;
                return this;
            }

            /**
             * <p>If you set <code>WatermarkType</code> to <code>custom</code>, you must also specify <code>WatermarkCustomText</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>custom-watermark</p>
             */
            public Builder watermarkCustomText(String watermarkCustomText) {
                this.watermarkCustomText = watermarkCustomText;
                return this;
            }

            /**
             * <p>The watermark rotation. Valid values: -10 to -30.</p>
             * 
             * <strong>example:</strong>
             * <p>-10</p>
             */
            public Builder watermarkDegree(Double watermarkDegree) {
                this.watermarkDegree = watermarkDegree;
                return this;
            }

            /**
             * <p>The font size of the watermark. Valid values: 10 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder watermarkFontSize(Integer watermarkFontSize) {
                this.watermarkFontSize = watermarkFontSize;
                return this;
            }

            /**
             * <p>The font style of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>plain</p>
             */
            public Builder watermarkFontStyle(String watermarkFontStyle) {
                this.watermarkFontStyle = watermarkFontStyle;
                return this;
            }

            /**
             * <p>The enhancement level for invisible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder watermarkPower(String watermarkPower) {
                this.watermarkPower = watermarkPower;
                return this;
            }

            /**
             * <p>The number of watermark rows.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder watermarkRowAmount(Integer watermarkRowAmount) {
                this.watermarkRowAmount = watermarkRowAmount;
                return this;
            }

            /**
             * <p>Indicates whether security priority is enabled for invisible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder watermarkSecurity(String watermarkSecurity) {
                this.watermarkSecurity = watermarkSecurity;
                return this;
            }

            /**
             * <p>The watermark transparency. A higher value means the watermark is less transparent. Valid values: 10 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder watermarkTransparencyValue(Integer watermarkTransparencyValue) {
                this.watermarkTransparencyValue = watermarkTransparencyValue;
                return this;
            }

            /**
             * <p>The watermark type.</p>
             * 
             * <strong>example:</strong>
             * <p>EndUserId</p>
             */
            public Builder watermarkType(String watermarkType) {
                this.watermarkType = watermarkType;
                return this;
            }

            /**
             * <p>Indicates whether the Xiaoying AI Assistant entry is displayed in the DesktopAssistant menu.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder wyAssistant(String wyAssistant) {
                this.wyAssistant = wyAssistant;
                return this;
            }

            public DescribePolicyGroups build() {
                return new DescribePolicyGroups(this);
            } 

        } 

    }
}
