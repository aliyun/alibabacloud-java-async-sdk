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
 * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyGroupsResponseBody</p>
 */
public class DescribePolicyGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("DescribePolicyGroups")
    private java.util.List<DescribePolicyGroups> describePolicyGroups;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolicyGroupsResponseBody(Builder builder) {
        this.count = builder.count;
        this.describePolicyGroups = builder.describePolicyGroups;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return describePolicyGroups
     */
    public java.util.List<DescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<DescribePolicyGroups> describePolicyGroups; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePolicyGroupsResponseBody model) {
            this.count = model.count;
            this.describePolicyGroups = model.describePolicyGroups;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The details of the cloud computer policies.</p>
         */
        public Builder describePolicyGroups(java.util.List<DescribePolicyGroups> describePolicyGroups) {
            this.describePolicyGroups = describePolicyGroups;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolicyGroupsResponseBody build() {
            return new DescribePolicyGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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
             * <p>The CIDR block that is allowed to access the client. The value is an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The remarks on the CIDR block that is allowed to access the client.</p>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>tcp: Transmission Control Protocol (TCP)</li>
             * <li>udp: User Datagram Protocol (UDP)</li>
             * <li>all: all protocols</li>
             * <li>gre: Generic Routing Encapsulation (GRE)</li>
             * <li>icmp: Internet Control Message Protocol (ICMP) for IPv4</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The authorization of the security group rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>drop: denies all access requests.</li>
             * <li>accept: accepts all requests.</li>
             * </ul>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>outflow: outbound</li>
             * <li>inflow: inbound</li>
             * </ul>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>html5: web client</li>
             * <li>android: Android client</li>
             * <li>windows: Windows client</li>
             * <li>ios: iOS client</li>
             * <li>macos: macOS client</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>Indicates whether end users are allowed to use a specific type of the client to connect to cloud computers.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>OFF</li>
             * <li>ON</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>printer</li>
             * <li>scanner</li>
             * <li>camera</li>
             * <li>adb: the Android Debug Bridge (ADB) device.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The redirection type. Valid values:</p>
             * <ul>
             * <li>usbRedirect</li>
             * <li>deviceRedirect</li>
             * <li>off: direction disabled.</li>
             * </ul>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>usbKey</li>
             * <li>other</li>
             * <li>graphicsTablet</li>
             * <li>printer</li>
             * <li>cardReader</li>
             * <li>scanner</li>
             * <li>storage</li>
             * <li>camera</li>
             * <li>adb</li>
             * <li>networkInterfaceCard: the NIC device.</li>
             * </ul>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>deviceRedirect</li>
             * <li>usbRedirect</li>
             * <li>off: redirection disabled.</li>
             * </ul>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether the domain name resolution rule is allowed.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>allow</li>
             * <li>block</li>
             * </ul>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>*.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether the rule is allowed.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>allow</li>
             * <li>block</li>
             * </ul>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>prc: process</li>
             * <li>domain: domain name</li>
             * </ul>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UsbSupplyRedirectRule model) {
                this.description = model.description;
                this.deviceClass = model.deviceClass;
                this.deviceSubclass = model.deviceSubclass;
                this.productId = model.productId;
                this.usbRedirectType = model.usbRedirectType;
                this.usbRuleType = model.usbRuleType;
                this.vendorId = model.vendorId;
            } 

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The device class. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0Eh</p>
             */
            public Builder deviceClass(String deviceClass) {
                this.deviceClass = deviceClass;
                return this;
            }

            /**
             * <p>The subclass of the device. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>xxh</p>
             */
            public Builder deviceSubclass(String deviceSubclass) {
                this.deviceSubclass = deviceSubclass;
                return this;
            }

            /**
             * <p>The product ID.</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>1: allowed</li>
             * <li>2: not allowed</li>
             * </ul>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>1: by device class</li>
             * <li>2: by device vendor</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRuleType(Long usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
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
     * {@link DescribePolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGroupsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("DeviceConnectHint")
        private String deviceConnectHint;

        @com.aliyun.core.annotation.NameInMap("DeviceRedirects")
        private java.util.List<DeviceRedirects> deviceRedirects;

        @com.aliyun.core.annotation.NameInMap("DeviceRules")
        private java.util.List<DeviceRules> deviceRules;

        @com.aliyun.core.annotation.NameInMap("DisplayMode")
        private String displayMode;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("DomainResolveRule")
        private java.util.List<DomainResolveRule> domainResolveRule;

        @com.aliyun.core.annotation.NameInMap("DomainResolveRuleType")
        private String domainResolveRuleType;

        @com.aliyun.core.annotation.NameInMap("EdsCount")
        private Integer edsCount;

        @com.aliyun.core.annotation.NameInMap("EndUserApplyAdminCoordinate")
        private String endUserApplyAdminCoordinate;

        @com.aliyun.core.annotation.NameInMap("EndUserGroupCoordinate")
        private String endUserGroupCoordinate;

        @com.aliyun.core.annotation.NameInMap("FileMigrate")
        private String fileMigrate;

        @com.aliyun.core.annotation.NameInMap("FileTransfer")
        private String fileTransfer;

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

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupType")
        private String policyGroupType;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("PreemptLogin")
        private String preemptLogin;

        @com.aliyun.core.annotation.NameInMap("PreemptLoginUsers")
        private java.util.List<String> preemptLoginUsers;

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

        @com.aliyun.core.annotation.NameInMap("ResetDesktop")
        private String resetDesktop;

        @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
        private Integer resolutionHeight;

        @com.aliyun.core.annotation.NameInMap("ResolutionModel")
        private String resolutionModel;

        @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
        private Integer resolutionWidth;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupCount")
        private Integer resourceGroupCount;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

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

        @com.aliyun.core.annotation.NameInMap("WatermarkTransparency")
        private String watermarkTransparency;

        @com.aliyun.core.annotation.NameInMap("WatermarkTransparencyValue")
        private Integer watermarkTransparencyValue;

        @com.aliyun.core.annotation.NameInMap("WatermarkType")
        private String watermarkType;

        @com.aliyun.core.annotation.NameInMap("WuyingKeeper")
        private String wuyingKeeper;

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
            this.deviceConnectHint = builder.deviceConnectHint;
            this.deviceRedirects = builder.deviceRedirects;
            this.deviceRules = builder.deviceRules;
            this.displayMode = builder.displayMode;
            this.domainList = builder.domainList;
            this.domainResolveRule = builder.domainResolveRule;
            this.domainResolveRuleType = builder.domainResolveRuleType;
            this.edsCount = builder.edsCount;
            this.endUserApplyAdminCoordinate = builder.endUserApplyAdminCoordinate;
            this.endUserGroupCoordinate = builder.endUserGroupCoordinate;
            this.fileMigrate = builder.fileMigrate;
            this.fileTransfer = builder.fileTransfer;
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
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupType = builder.policyGroupType;
            this.policyStatus = builder.policyStatus;
            this.preemptLogin = builder.preemptLogin;
            this.preemptLoginUsers = builder.preemptLoginUsers;
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
            this.resetDesktop = builder.resetDesktop;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionModel = builder.resolutionModel;
            this.resolutionWidth = builder.resolutionWidth;
            this.resourceGroupCount = builder.resourceGroupCount;
            this.resourceRegionId = builder.resourceRegionId;
            this.safeMenu = builder.safeMenu;
            this.scope = builder.scope;
            this.scopeValue = builder.scopeValue;
            this.smoothEnhancement = builder.smoothEnhancement;
            this.statusMonitor = builder.statusMonitor;
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
            this.wuyingKeeper = builder.wuyingKeeper;
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
         * @return deviceConnectHint
         */
        public String getDeviceConnectHint() {
            return this.deviceConnectHint;
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
         * @return fileMigrate
         */
        public String getFileMigrate() {
            return this.fileMigrate;
        }

        /**
         * @return fileTransfer
         */
        public String getFileTransfer() {
            return this.fileTransfer;
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
        public java.util.List<String> getPreemptLoginUsers() {
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
         * @return resetDesktop
         */
        public String getResetDesktop() {
            return this.resetDesktop;
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
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
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

        /**
         * @return wuyingKeeper
         */
        public String getWuyingKeeper() {
            return this.wuyingKeeper;
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
            private String deviceConnectHint; 
            private java.util.List<DeviceRedirects> deviceRedirects; 
            private java.util.List<DeviceRules> deviceRules; 
            private String displayMode; 
            private String domainList; 
            private java.util.List<DomainResolveRule> domainResolveRule; 
            private String domainResolveRuleType; 
            private Integer edsCount; 
            private String endUserApplyAdminCoordinate; 
            private String endUserGroupCoordinate; 
            private String fileMigrate; 
            private String fileTransfer; 
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
            private String policyGroupId; 
            private String policyGroupType; 
            private String policyStatus; 
            private String preemptLogin; 
            private java.util.List<String> preemptLoginUsers; 
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
            private String resetDesktop; 
            private Integer resolutionHeight; 
            private String resolutionModel; 
            private Integer resolutionWidth; 
            private Integer resourceGroupCount; 
            private String resourceRegionId; 
            private String safeMenu; 
            private String scope; 
            private java.util.List<String> scopeValue; 
            private String smoothEnhancement; 
            private String statusMonitor; 
            private String streamingMode; 
            private Integer targetFps; 
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
            private String watermarkTransparency; 
            private Integer watermarkTransparencyValue; 
            private String watermarkType; 
            private String wuyingKeeper; 
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
                this.deviceConnectHint = model.deviceConnectHint;
                this.deviceRedirects = model.deviceRedirects;
                this.deviceRules = model.deviceRules;
                this.displayMode = model.displayMode;
                this.domainList = model.domainList;
                this.domainResolveRule = model.domainResolveRule;
                this.domainResolveRuleType = model.domainResolveRuleType;
                this.edsCount = model.edsCount;
                this.endUserApplyAdminCoordinate = model.endUserApplyAdminCoordinate;
                this.endUserGroupCoordinate = model.endUserGroupCoordinate;
                this.fileMigrate = model.fileMigrate;
                this.fileTransfer = model.fileTransfer;
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
                this.policyGroupId = model.policyGroupId;
                this.policyGroupType = model.policyGroupType;
                this.policyStatus = model.policyStatus;
                this.preemptLogin = model.preemptLogin;
                this.preemptLoginUsers = model.preemptLoginUsers;
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
                this.resetDesktop = model.resetDesktop;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionModel = model.resolutionModel;
                this.resolutionWidth = model.resolutionWidth;
                this.resourceGroupCount = model.resourceGroupCount;
                this.resourceRegionId = model.resourceRegionId;
                this.safeMenu = model.safeMenu;
                this.scope = model.scope;
                this.scopeValue = model.scopeValue;
                this.smoothEnhancement = model.smoothEnhancement;
                this.statusMonitor = model.statusMonitor;
                this.streamingMode = model.streamingMode;
                this.targetFps = model.targetFps;
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
                this.watermarkTransparency = model.watermarkTransparency;
                this.watermarkTransparencyValue = model.watermarkTransparencyValue;
                this.watermarkType = model.watermarkType;
                this.wuyingKeeper = model.wuyingKeeper;
                this.wyAssistant = model.wyAssistant;
            } 

            /**
             * <p>Indicates whether end users are granted the administrator permissions.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
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
             * <p>Indicates whether the anti-screenshot feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off (default)</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder appContentProtection(String appContentProtection) {
                this.appContentProtection = appContentProtection;
                return this;
            }

            /**
             * <p>The client IP address whitelist. End users can access cloud computers only from the IP addresses in the whitelist.</p>
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
             * <p>Indicates whether the webcam redirection feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder cameraRedirect(String cameraRedirect) {
                this.cameraRedirect = cameraRedirect;
                return this;
            }

            /**
             * <p>The logon method control rules to limit the type of the Alibaba Cloud Workspace client used by end users to connect to cloud computers.</p>
             */
            public Builder clientTypes(java.util.List<ClientTypes> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * <p>The permissions on the clipboard.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>read: specifies one-way transfer. You can copy files only from local devices to cloud computers.</li>
             * <li>readwrite: specifies two-way transfer. You can copy files between local devices and cloud computers.</li>
             * <li>write: specifies one-way transfer. You can only copy files from cloud computers to local devices.</li>
             * <li>off: disables both one-way and two-way transfer. Files cannot be copied between local devices and cloud computers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * <p>Indicates whether the Color Enhancement switch is turned on in design and 3D scenarios.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
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
             * <p>The process whitelist that is not restricted by the CPU usage limit.</p>
             */
            public Builder cpuProcessors(java.util.List<String> cpuProcessors) {
                this.cpuProcessors = cpuProcessors;
                return this;
            }

            /**
             * <p>Indicates whether the CPU spike protection switch is turned on.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
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
             * <p>The number of cloud computers bound with this policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Integer desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The number of shared cloud computers bound with this policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopGroupCount(Integer desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * DeviceConnectHint.
             */
            public Builder deviceConnectHint(String deviceConnectHint) {
                this.deviceConnectHint = deviceConnectHint;
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
             * <p>The display mode.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>clientCustom: suitable for user-defined scenarios.</li>
             * <li>adminOffice: suitable for daily office scenarios.</li>
             * <li>adminDesign: suitable for 3D application scenarios.</li>
             * <li>adminCustom: administrator-customized scenarios</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>adminCustom</p>
             */
            public Builder displayMode(String displayMode) {
                this.displayMode = displayMode;
                return this;
            }

            /**
             * <p>Specifies whether to enable the access control for domain names. Domain names support wildcards (*). Separate multiple domain names with commas (,).</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>The domain name resolution rules.</p>
             */
            public Builder domainResolveRule(java.util.List<DomainResolveRule> domainResolveRule) {
                this.domainResolveRule = domainResolveRule;
                return this;
            }

            /**
             * <p>Indicates whether the switch for domain name resolution is turned on.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder domainResolveRuleType(String domainResolveRuleType) {
                this.domainResolveRuleType = domainResolveRuleType;
                return this;
            }

            /**
             * <p>The number of cloud computers that are associated with the policy. The number of cloud computers that are associated only with custom policies is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder edsCount(Integer edsCount) {
                this.edsCount = edsCount;
                return this;
            }

            /**
             * <p>Indicates whether the Contact Administrator for Help switch is turned on.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
                this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
                return this;
            }

            /**
             * <p>Indicates whether the User Stream Collaboration switch is turned on.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
                this.endUserGroupCoordinate = endUserGroupCoordinate;
                return this;
            }

            /**
             * FileMigrate.
             */
            public Builder fileMigrate(String fileMigrate) {
                this.fileMigrate = fileMigrate;
                return this;
            }

            /**
             * <p>Transfers files.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder fileTransfer(String fileTransfer) {
                this.fileTransfer = fileTransfer;
                return this;
            }

            /**
             * <p>Indicates whether the Image Quality Control feature is enabled. If you have high requirements on the performance and user experience in scenarios such as professional design, we recommend that you enable this feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder gpuAcceleration(String gpuAcceleration) {
                this.gpuAcceleration = gpuAcceleration;
                return this;
            }

            /**
             * <p>Specifies whether to allow web client access.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off (default)</li>
             * <li>on</li>
             * </ul>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>all: Files can be uploaded and downloaded between local computers and the web client.</li>
             * <li>download: Files on the web client can be downloaded to local computers.</li>
             * <li>upload: Files on local computers can be uploaded to the web client.</li>
             * <li>off (default): Files cannot be transferred between the web client and local computers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * <p>The protocol for network communication.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>TCP (default): TCP.</li>
             * <li>BOTH: TCP and UDP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BOTH</p>
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
             * <p>The permissions on local disk mapping.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>read: read-only. Local disk mapping is available on cloud computers. However, you can only read (copy) local files but cannot modify the files.</li>
             * <li>readwrite: read and write. Local disk mapping is available on cloud computers. You can read (copy) and write (modify) local files.</li>
             * <li>off (default): none.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder localDrive(String localDrive) {
                this.localDrive = localDrive;
                return this;
            }

            /**
             * <p>The maximum retry period for reconnecting to cloud computers when the cloud computers are disconnected due to none-human reasons. Valid values: 30 to 7200. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder maxReconnectTime(Integer maxReconnectTime) {
                this.maxReconnectTime = maxReconnectTime;
                return this;
            }

            /**
             * <p>The memory underclocking duration for a single process. Valid values: 30 to 120. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memoryDownGradeDuration(Integer memoryDownGradeDuration) {
                this.memoryDownGradeDuration = memoryDownGradeDuration;
                return this;
            }

            /**
             * <p>The whitelist of processes that are not restricted by the memory usage limit.</p>
             */
            public Builder memoryProcessors(java.util.List<String> memoryProcessors) {
                this.memoryProcessors = memoryProcessors;
                return this;
            }

            /**
             * <p>Indicates whether the memory spike protection switch is turned on.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
             * <p>The memory usage of a single process. Valid values: 30 to 60. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memorySingleRateLimit(Integer memorySingleRateLimit) {
                this.memorySingleRateLimit = memorySingleRateLimit;
                return this;
            }

            /**
             * <p>Specifies whether to display the restart button in the DesktopAssistant when the cloud computer is accessed from the Alibaba Cloud Workspace mobile clients (including the Android client and the iOS client).</p>
             * <blockquote>
             * <p>Mobile clients of V7.4 and higher versions required.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>off: not provided.</li>
             * <li>on: provided.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder mobileRestart(String mobileRestart) {
                this.mobileRestart = mobileRestart;
                return this;
            }

            /**
             * <p>Specifies whether to display the shut down button in the DesktopAssistant when the cloud computer is accessed from the Alibaba Cloud Workspace mobile clients (including the Android client and the iOS client).</p>
             * <blockquote>
             * <p>Mobile clients of V7.4 and higher versions required.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>off: not provided.</li>
             * <li>on: provided.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder mobileShutdown(String mobileShutdown) {
                this.mobileShutdown = mobileShutdown;
                return this;
            }

            /**
             * <p>The name of the cloud computer policy.</p>
             * 
             * <strong>example:</strong>
             * <p>testPolicyGroupName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the network redirection feature is enabled.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>off (default)</li>
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
             * <p>The network redirection rule.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
             * </blockquote>
             */
            public Builder netRedirectRule(java.util.List<NetRedirectRule> netRedirectRule) {
                this.netRedirectRule = netRedirectRule;
                return this;
            }

            /**
             * <p>The ID of the cloud computer policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-gx2x1dhsmthe9****</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The type of the cloud computer policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SYSTEM</li>
             * <li>CUSTOM</li>
             * </ul>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>AVAILABLE</li>
             * <li>CREATING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>The cloud computer preemption feature.</p>
             * <blockquote>
             * <p> To ensure user experience and data security, when a cloud computer is used by an end user, other end users cannot connect to the cloud computer. By default, this parameter is set to <code>off</code>, which cannot be modified.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>off: Preemption is not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder preemptLogin(String preemptLogin) {
                this.preemptLogin = preemptLogin;
                return this;
            }

            /**
             * <p>The usernames that can preempt to connect to the cloud computer.</p>
             */
            public Builder preemptLoginUsers(java.util.List<String> preemptLoginUsers) {
                this.preemptLoginUsers = preemptLoginUsers;
                return this;
            }

            /**
             * <p>Indicates whether the printer redirection feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder printerRedirection(String printerRedirection) {
                this.printerRedirection = printerRedirection;
                return this;
            }

            /**
             * <p>Indicates whether the Image Quality Enhancement switch is turned on for design and 3D scenarios.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder qualityEnhancement(String qualityEnhancement) {
                this.qualityEnhancement = qualityEnhancement;
                return this;
            }

            /**
             * <p>Indicates whether the custom screen recording feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off (default)</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * <p>The period when the custom screen recording can be retained before expiration. Default value: 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder recordContentExpires(Long recordContentExpires) {
                this.recordContentExpires = recordContentExpires;
                return this;
            }

            /**
             * <p>The recording duration since a target event is detected by the screen recording audit policy. Unit: Minute. Valid values: 10-60.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordEventDuration(Integer recordEventDuration) {
                this.recordEventDuration = recordEventDuration;
                return this;
            }

            /**
             * <p>The array of absolute paths of the monitored files in the screen recording audit policy.</p>
             */
            public Builder recordEventFilePaths(java.util.List<String> recordEventFilePaths) {
                this.recordEventFilePaths = recordEventFilePaths;
                return this;
            }

            /**
             * <p>The array of absolute paths of the monitored registry entries in the screen recording audit policy.</p>
             */
            public Builder recordEventRegisters(java.util.List<String> recordEventRegisters) {
                this.recordEventRegisters = recordEventRegisters;
                return this;
            }

            /**
             * <p>Indicates whether the screen recording feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>byaction_cmd_ft: enables the operation-triggered screen recording upon command execution and file transfer.</li>
             * <li>ALLTIME: enables the whole-process screen recording. That is, the recording starts when cloud computers are connected and ends when the cloud computers are disconnected.</li>
             * <li>PERIOD: enables the interval-based screen recording. You must specify an interval between the start time and end time of this type of recording.</li>
             * <li>byaction_commands: enables the operation-triggered screen recording upon command execution.</li>
             * <li>OFF: disables the screen recording feature.</li>
             * <li>byaction_file_transfer: enables the operation-triggered screen recording upon file transfer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OFF</p>
             */
            public Builder recording(String recording) {
                this.recording = recording;
                return this;
            }

            /**
             * <p>Indicates whether audio files generated from cloud computers are recorded.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off (default): records only video files.</li>
             * <li>on: records video and audio files.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder recordingAudio(String recordingAudio) {
                this.recordingAudio = recordingAudio;
                return this;
            }

            /**
             * <p>The file length of the screen recording. Unit: minutes. Screen recording files are split based on the specified file length and uploaded to Object Storage Service (OSS) buckets. When a screen recording file reaches 300 MB in size, the system preferentially performs rolling update for the file.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>10</li>
             * <li>20</li>
             * <li>30</li>
             * <li>60</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * <p>The time when the screen recording ended. The value is in the HH:MM:SS format. The value takes effect only when Recording is set to PERIOD.</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>2</li>
             * <li>5</li>
             * <li>10</li>
             * <li>15</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder recordingFps(Long recordingFps) {
                this.recordingFps = recordingFps;
                return this;
            }

            /**
             * <p>The time when the screen recording was started. The value is in the HH:MM:SS format. The value takes effect only when Recording is set to PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00:00</p>
             */
            public Builder recordingStartTime(String recordingStartTime) {
                this.recordingStartTime = recordingStartTime;
                return this;
            }

            /**
             * <p>Indicates whether the screen recording notification feature is enabled after end users log on to the Alibaba Cloud Workspace client.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder recordingUserNotify(String recordingUserNotify) {
                this.recordingUserNotify = recordingUserNotify;
                return this;
            }

            /**
             * <p>The notification content of screen recording. By default, this parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>Your desktop is being recorded</p>
             */
            public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
                this.recordingUserNotifyMessage = recordingUserNotifyMessage;
                return this;
            }

            /**
             * <p>The permissions on keyboard and mouse control during remote assistance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>optionalControl: By default, you are not granted the permissions. You can apply for the permissions.</li>
             * <li>fullControl: You are granted the full permissions.</li>
             * <li>disableControl: You are not granted the permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fullControl</p>
             */
            public Builder remoteCoordinate(String remoteCoordinate) {
                this.remoteCoordinate = remoteCoordinate;
                return this;
            }

            /**
             * <p>Resets the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder resetDesktop(String resetDesktop) {
                this.resetDesktop = resetDesktop;
                return this;
            }

            /**
             * ResolutionHeight.
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * ResolutionModel.
             */
            public Builder resolutionModel(String resolutionModel) {
                this.resolutionModel = resolutionModel;
                return this;
            }

            /**
             * ResolutionWidth.
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            /**
             * <p>The number of resource groups bound with this policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceGroupCount(Integer resourceGroupCount) {
                this.resourceGroupCount = resourceGroupCount;
                return this;
            }

            /**
             * <p>The region of the cloud computer policy.</p>
             * <blockquote>
             * <p>The value of a region-less policy is <code>center</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
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
             * <p>Valid values:</p>
             * <ul>
             * <li>IP: The policy takes effect based on the IP address.</li>
             * <li>GLOBAL: The policy takes effect globally.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GLOBAL</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>This parameter is required when the <code>Scope</code> parameter is set to <code>IP</code>.````</p>
             */
            public Builder scopeValue(java.util.List<String> scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * <p>Indicates whether the Smooth Enhancement switch is turned on.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder smoothEnhancement(String smoothEnhancement) {
                this.smoothEnhancement = smoothEnhancement;
                return this;
            }

            /**
             * <p>Specifies whether to provide the Metrics function in the DesktopAssistant. Valid values:</p>
             * <ul>
             * <li>off: not provided.</li>
             * <li>on: provided.</li>
             * </ul>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>intelligent: suitable for daily office scenarios (Intelligent Mode).</li>
             * <li>smooth: suitable for design and 3D application scenarios (Smooth Mode).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>smooth</p>
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * <p>The destination frame rate. Valid values: 10 to 60. Unit: fps.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder targetFps(Integer targetFps) {
                this.targetFps = targetFps;
                return this;
            }

            /**
             * <p>Indicates whether the USB redirection feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder usbRedirect(String usbRedirect) {
                this.usbRedirect = usbRedirect;
                return this;
            }

            /**
             * <p>The USB redirection rule.</p>
             */
            public Builder usbSupplyRedirectRule(java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule) {
                this.usbSupplyRedirectRule = usbSupplyRedirectRule;
                return this;
            }

            /**
             * <p>The average bitrate for video encoding. Valid values: 1000 to 50000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder videoEncAvgKbps(Integer videoEncAvgKbps) {
                this.videoEncAvgKbps = videoEncAvgKbps;
                return this;
            }

            /**
             * <p>The maximum quantizer parameter (QP) of video files. A larger QP value indicates worse video quality. Valid values: 0 to 51.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder videoEncMaxQP(Integer videoEncMaxQP) {
                this.videoEncMaxQP = videoEncMaxQP;
                return this;
            }

            /**
             * <p>The minimum quantizer parameter (QP) of video files. A smaller QP value indicates higher video quality. Valid values: 0 to 51.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder videoEncMinQP(Integer videoEncMinQP) {
                this.videoEncMinQP = videoEncMinQP;
                return this;
            }

            /**
             * <p>The peak bitrate for video encoding. Valid values: 1000 to 50000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder videoEncPeakKbps(Integer videoEncPeakKbps) {
                this.videoEncPeakKbps = videoEncPeakKbps;
                return this;
            }

            /**
             * <p>The video encoding feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>qualityFirst: The priority given to the image quality.</li>
             * <li>bandwidthFirst: The priority given to the bitrate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>qualityFirst</p>
             */
            public Builder videoEncPolicy(String videoEncPolicy) {
                this.videoEncPolicy = videoEncPolicy;
                return this;
            }

            /**
             * <p>Indicates whether the multimedia redirection feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder videoRedirect(String videoRedirect) {
                this.videoRedirect = videoRedirect;
                return this;
            }

            /**
             * <p>The image display quality.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>high: high-definition (HD)</li>
             * <li>low: fluent</li>
             * <li>medium (default): adaptive</li>
             * <li>lossless: no quality loss</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder visualQuality(String visualQuality) {
                this.visualQuality = visualQuality;
                return this;
            }

            /**
             * <p>The watermarking feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>blind: Invisible watermarks are applied.</li>
             * <li>off: The watermarking feature is disabled.</li>
             * <li>on: Visible watermarks are applied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder watermark(String watermark) {
                this.watermark = watermark;
                return this;
            }

            /**
             * <p>Indicates whether the anti-screen photo feature is enabled for invisible watermarks.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder watermarkAntiCam(String watermarkAntiCam) {
                this.watermarkAntiCam = watermarkAntiCam;
                return this;
            }

            /**
             * <p>The font color in red, green, and blue (RGB) of the watermark. Valid values: 0 to 16777215.</p>
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
             * <p>test</p>
             */
            public Builder watermarkCustomText(String watermarkCustomText) {
                this.watermarkCustomText = watermarkCustomText;
                return this;
            }

            /**
             * <p>The slope of the watermark. Valid values: -10 to -30.</p>
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
             * <p>The watermark font style.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>plain</li>
             * <li>bold</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>plain</p>
             */
            public Builder watermarkFontStyle(String watermarkFontStyle) {
                this.watermarkFontStyle = watermarkFontStyle;
                return this;
            }

            /**
             * <p>The watermark enhancement feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>high</li>
             * <li>low</li>
             * <li>medium</li>
             * </ul>
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
             * <blockquote>
             * <p> This parameter is not available for public use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder watermarkRowAmount(Integer watermarkRowAmount) {
                this.watermarkRowAmount = watermarkRowAmount;
                return this;
            }

            /**
             * <p>Indicates whether the security priority feature is enabled for invisible watermarks.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder watermarkSecurity(String watermarkSecurity) {
                this.watermarkSecurity = watermarkSecurity;
                return this;
            }

            /**
             * <p>The watermark transparency.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>LIGHT</li>
             * <li>DARK</li>
             * <li>MIDDLE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LIGHT</p>
             */
            public Builder watermarkTransparency(String watermarkTransparency) {
                this.watermarkTransparency = watermarkTransparency;
                return this;
            }

            /**
             * <p>The watermark transparency. A greater value indicates that the watermark is less transparent. Valid values: 10 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder watermarkTransparencyValue(Integer watermarkTransparencyValue) {
                this.watermarkTransparencyValue = watermarkTransparencyValue;
                return this;
            }

            /**
             * <p>The watermark content.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>EndUserId: the username.</li>
             * <li>Custom</li>
             * <li>DesktopIp: the IP address of the cloud computer.</li>
             * <li>ClientIp: the IP address of the Alibaba Cloud Workspace client.</li>
             * <li>HostName: the rightmost 15 digits of the cloud computer ID.</li>
             * <li>ClientTime: the current time displayed on the cloud computer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EndUserId</p>
             */
            public Builder watermarkType(String watermarkType) {
                this.watermarkType = watermarkType;
                return this;
            }

            /**
             * WuyingKeeper.
             */
            public Builder wuyingKeeper(String wuyingKeeper) {
                this.wuyingKeeper = wuyingKeeper;
                return this;
            }

            /**
             * <p>Specifies whether to provide the AI Assistant function in the DesktopAssistant when the cloud computer is accessed from the Alibaba Cloud Workspace desktop clients (including the Windows client and the macOS client).</p>
             * <blockquote>
             * <p>Desktop clients of V7.7 and higher versions required.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>off: the AI Aisstant function is not provided.</li>
             * <li>on: the AI Aisstant function is provided.</li>
             * </ul>
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
