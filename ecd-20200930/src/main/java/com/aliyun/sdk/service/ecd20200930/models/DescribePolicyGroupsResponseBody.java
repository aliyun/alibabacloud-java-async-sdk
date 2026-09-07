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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
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
         * <p>The token for the next query. If NextToken is empty, no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the current page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for a paged query.<br>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
             * <p>The client access IP CIDR block. The value is an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the client access IP CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>Corporate office network</p>
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
             * <p>The target of the security group rule. The value is an IPv4 CIDR block.</p>
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
             * <p>Allow access to the internal R&amp;D environment</p>
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
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>Specifies whether a specific type of client is allowed to connect to cloud desktops.</p>
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
             * <li>usbRedirect: USB redirection.</li>
             * <li>deviceRedirect: device redirection.</li>
             * <li>off: disabled.</li>
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
             * <p>The product ID.</p>
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
             * <p>The vendor ID. See <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
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
             * <p>The platform types to which the device rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
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
             * <p>The policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test rule</p>
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
             * <p>The policy content.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The policy type.</p>
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
    public static class RecordEventLevels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private RecordEventLevels(Builder builder) {
            this.eventLevel = builder.eventLevel;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordEventLevels create() {
            return builder().build();
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventLevel; 
            private String eventType; 

            private Builder() {
            } 

            private Builder(RecordEventLevels model) {
                this.eventLevel = model.eventLevel;
                this.eventType = model.eventType;
            } 

            /**
             * <p>The event level.</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>StartApplication</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public RecordEventLevels build() {
                return new RecordEventLevels(this);
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
             * <p>Test rule</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The device class. This parameter is required when <code>usbRuleType</code> is set to 1. See <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0Eh</p>
             */
            public Builder deviceClass(String deviceClass) {
                this.deviceClass = deviceClass;
                return this;
            }

            /**
             * <p>The device subclass. This parameter is required when <code>usbRuleType</code> is set to 1. See <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
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
             * <p>The USB redirection type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRedirectType(Long usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * <p>The USB redirection rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRuleType(Long usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * <p>The vendor ID. See <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
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
        @com.aliyun.core.annotation.NameInMap("AcademicProxy")
        private String academicProxy;

        @com.aliyun.core.annotation.NameInMap("AdminAccess")
        private String adminAccess;

        @com.aliyun.core.annotation.NameInMap("AdminKeyboardOnFullScreen")
        private String adminKeyboardOnFullScreen;

        @com.aliyun.core.annotation.NameInMap("AdminKeyboardOnWindows")
        private String adminKeyboardOnWindows;

        @com.aliyun.core.annotation.NameInMap("AppContentProtection")
        private String appContentProtection;

        @com.aliyun.core.annotation.NameInMap("AuthorizeAccessPolicyRules")
        private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        @com.aliyun.core.annotation.NameInMap("AuthorizeSecurityPolicyRules")
        private java.util.List<AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        @com.aliyun.core.annotation.NameInMap("AutoReconnect")
        private String autoReconnect;

        @com.aliyun.core.annotation.NameInMap("CameraRedirect")
        private String cameraRedirect;

        @com.aliyun.core.annotation.NameInMap("ClientControlMenu")
        private String clientControlMenu;

        @com.aliyun.core.annotation.NameInMap("ClientCreateSnapshot")
        private String clientCreateSnapshot;

        @com.aliyun.core.annotation.NameInMap("ClientHibernate")
        private String clientHibernate;

        @com.aliyun.core.annotation.NameInMap("ClientRestart")
        private String clientRestart;

        @com.aliyun.core.annotation.NameInMap("ClientShutdown")
        private String clientShutdown;

        @com.aliyun.core.annotation.NameInMap("ClientTypes")
        private java.util.List<ClientTypes> clientTypes;

        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        @com.aliyun.core.annotation.NameInMap("ColorEnhancement")
        private String colorEnhancement;

        @com.aliyun.core.annotation.NameInMap("CpdDriveClipboard")
        private String cpdDriveClipboard;

        @com.aliyun.core.annotation.NameInMap("CpuDownGradeDuration")
        private Integer cpuDownGradeDuration;

        @com.aliyun.core.annotation.NameInMap("CpuOverload")
        private String cpuOverload;

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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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

        @com.aliyun.core.annotation.NameInMap("DiskOverload")
        private String diskOverload;

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

        @com.aliyun.core.annotation.NameInMap("EndUserCount")
        private String endUserCount;

        @com.aliyun.core.annotation.NameInMap("EndUserGroupCoordinate")
        private String endUserGroupCoordinate;

        @com.aliyun.core.annotation.NameInMap("ExternalDrive")
        private String externalDrive;

        @com.aliyun.core.annotation.NameInMap("FileMigrate")
        private String fileMigrate;

        @com.aliyun.core.annotation.NameInMap("FileTransfer")
        private String fileTransfer;

        @com.aliyun.core.annotation.NameInMap("FileTransferAddress")
        private String fileTransferAddress;

        @com.aliyun.core.annotation.NameInMap("FileTransferInSize")
        private Integer fileTransferInSize;

        @com.aliyun.core.annotation.NameInMap("FileTransferInUnit")
        private String fileTransferInUnit;

        @com.aliyun.core.annotation.NameInMap("FileTransferOutSize")
        private Integer fileTransferOutSize;

        @com.aliyun.core.annotation.NameInMap("FileTransferOutUnit")
        private String fileTransferOutUnit;

        @com.aliyun.core.annotation.NameInMap("FileTransferSizeLimit")
        private String fileTransferSizeLimit;

        @com.aliyun.core.annotation.NameInMap("FileTransferSpeed")
        private String fileTransferSpeed;

        @com.aliyun.core.annotation.NameInMap("FileTransferSpeedLocation")
        private String fileTransferSpeedLocation;

        @com.aliyun.core.annotation.NameInMap("GpuAcceleration")
        private String gpuAcceleration;

        @com.aliyun.core.annotation.NameInMap("HoverConfigMsg")
        private String hoverConfigMsg;

        @com.aliyun.core.annotation.NameInMap("HoverHibernate")
        private String hoverHibernate;

        @com.aliyun.core.annotation.NameInMap("HoverRestart")
        private String hoverRestart;

        @com.aliyun.core.annotation.NameInMap("HoverShutdown")
        private String hoverShutdown;

        @com.aliyun.core.annotation.NameInMap("Html5Access")
        private String html5Access;

        @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
        private String html5FileTransfer;

        @com.aliyun.core.annotation.NameInMap("InternetCommunicationProtocol")
        private String internetCommunicationProtocol;

        @com.aliyun.core.annotation.NameInMap("InternetPrinter")
        private String internetPrinter;

        @com.aliyun.core.annotation.NameInMap("KeyboardControl")
        private String keyboardControl;

        @com.aliyun.core.annotation.NameInMap("LocalDrive")
        private String localDrive;

        @com.aliyun.core.annotation.NameInMap("MaxReconnectTime")
        private Integer maxReconnectTime;

        @com.aliyun.core.annotation.NameInMap("MemoryDownGradeDuration")
        private Integer memoryDownGradeDuration;

        @com.aliyun.core.annotation.NameInMap("MemoryOverload")
        private String memoryOverload;

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

        @com.aliyun.core.annotation.NameInMap("MobileSafeMenu")
        private String mobileSafeMenu;

        @com.aliyun.core.annotation.NameInMap("MobileShutdown")
        private String mobileShutdown;

        @com.aliyun.core.annotation.NameInMap("MobileWuyingKeeper")
        private String mobileWuyingKeeper;

        @com.aliyun.core.annotation.NameInMap("MobileWyAssistant")
        private String mobileWyAssistant;

        @com.aliyun.core.annotation.NameInMap("ModelLibrary")
        private String modelLibrary;

        @com.aliyun.core.annotation.NameInMap("MultiScreen")
        private String multiScreen;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetRedirect")
        private String netRedirect;

        @com.aliyun.core.annotation.NameInMap("NetRedirectRule")
        private java.util.List<NetRedirectRule> netRedirectRule;

        @com.aliyun.core.annotation.NameInMap("NetworkPrinter")
        private String networkPrinter;

        @com.aliyun.core.annotation.NameInMap("OrganizationCount")
        private String organizationCount;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupType")
        private String policyGroupType;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("PortProxy")
        private String portProxy;

        @com.aliyun.core.annotation.NameInMap("PreemptLogin")
        private String preemptLogin;

        @com.aliyun.core.annotation.NameInMap("PreemptLoginUsers")
        private java.util.List<String> preemptLoginUsers;

        @com.aliyun.core.annotation.NameInMap("PrinterAlert")
        private String printerAlert;

        @com.aliyun.core.annotation.NameInMap("PrinterAlertContent")
        private String printerAlertContent;

        @com.aliyun.core.annotation.NameInMap("PrinterAlertTitle")
        private String printerAlertTitle;

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

        @com.aliyun.core.annotation.NameInMap("RecordEventFileExts")
        private java.util.List<String> recordEventFileExts;

        @com.aliyun.core.annotation.NameInMap("RecordEventFilePaths")
        private java.util.List<String> recordEventFilePaths;

        @com.aliyun.core.annotation.NameInMap("RecordEventLevels")
        private java.util.List<RecordEventLevels> recordEventLevels;

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

        @com.aliyun.core.annotation.NameInMap("ResolutionDpi")
        private Integer resolutionDpi;

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

        @com.aliyun.core.annotation.NameInMap("ScreenDisplayMode")
        private String screenDisplayMode;

        @com.aliyun.core.annotation.NameInMap("SmoothEnhancement")
        private String smoothEnhancement;

        @com.aliyun.core.annotation.NameInMap("StatusMonitor")
        private String statusMonitor;

        @com.aliyun.core.annotation.NameInMap("StreamingMode")
        private String streamingMode;

        @com.aliyun.core.annotation.NameInMap("TargetFps")
        private Integer targetFps;

        @com.aliyun.core.annotation.NameInMap("ThreeScreen")
        private String threeScreen;

        @com.aliyun.core.annotation.NameInMap("UsbRedirect")
        private String usbRedirect;

        @com.aliyun.core.annotation.NameInMap("UsbSupplyRedirectRule")
        private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule;

        @com.aliyun.core.annotation.NameInMap("UseTime")
        private String useTime;

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

        @com.aliyun.core.annotation.NameInMap("WatermarkShadow")
        private String watermarkShadow;

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
            this.academicProxy = builder.academicProxy;
            this.adminAccess = builder.adminAccess;
            this.adminKeyboardOnFullScreen = builder.adminKeyboardOnFullScreen;
            this.adminKeyboardOnWindows = builder.adminKeyboardOnWindows;
            this.appContentProtection = builder.appContentProtection;
            this.authorizeAccessPolicyRules = builder.authorizeAccessPolicyRules;
            this.authorizeSecurityPolicyRules = builder.authorizeSecurityPolicyRules;
            this.autoReconnect = builder.autoReconnect;
            this.cameraRedirect = builder.cameraRedirect;
            this.clientControlMenu = builder.clientControlMenu;
            this.clientCreateSnapshot = builder.clientCreateSnapshot;
            this.clientHibernate = builder.clientHibernate;
            this.clientRestart = builder.clientRestart;
            this.clientShutdown = builder.clientShutdown;
            this.clientTypes = builder.clientTypes;
            this.clipboard = builder.clipboard;
            this.colorEnhancement = builder.colorEnhancement;
            this.cpdDriveClipboard = builder.cpdDriveClipboard;
            this.cpuDownGradeDuration = builder.cpuDownGradeDuration;
            this.cpuOverload = builder.cpuOverload;
            this.cpuProcessors = builder.cpuProcessors;
            this.cpuProtectedMode = builder.cpuProtectedMode;
            this.cpuRateLimit = builder.cpuRateLimit;
            this.cpuSampleDuration = builder.cpuSampleDuration;
            this.cpuSingleRateLimit = builder.cpuSingleRateLimit;
            this.description = builder.description;
            this.desktopCount = builder.desktopCount;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.deviceConnectHint = builder.deviceConnectHint;
            this.deviceRedirects = builder.deviceRedirects;
            this.deviceRules = builder.deviceRules;
            this.diskOverload = builder.diskOverload;
            this.displayMode = builder.displayMode;
            this.domainList = builder.domainList;
            this.domainResolveRule = builder.domainResolveRule;
            this.domainResolveRuleType = builder.domainResolveRuleType;
            this.edsCount = builder.edsCount;
            this.endUserApplyAdminCoordinate = builder.endUserApplyAdminCoordinate;
            this.endUserCount = builder.endUserCount;
            this.endUserGroupCoordinate = builder.endUserGroupCoordinate;
            this.externalDrive = builder.externalDrive;
            this.fileMigrate = builder.fileMigrate;
            this.fileTransfer = builder.fileTransfer;
            this.fileTransferAddress = builder.fileTransferAddress;
            this.fileTransferInSize = builder.fileTransferInSize;
            this.fileTransferInUnit = builder.fileTransferInUnit;
            this.fileTransferOutSize = builder.fileTransferOutSize;
            this.fileTransferOutUnit = builder.fileTransferOutUnit;
            this.fileTransferSizeLimit = builder.fileTransferSizeLimit;
            this.fileTransferSpeed = builder.fileTransferSpeed;
            this.fileTransferSpeedLocation = builder.fileTransferSpeedLocation;
            this.gpuAcceleration = builder.gpuAcceleration;
            this.hoverConfigMsg = builder.hoverConfigMsg;
            this.hoverHibernate = builder.hoverHibernate;
            this.hoverRestart = builder.hoverRestart;
            this.hoverShutdown = builder.hoverShutdown;
            this.html5Access = builder.html5Access;
            this.html5FileTransfer = builder.html5FileTransfer;
            this.internetCommunicationProtocol = builder.internetCommunicationProtocol;
            this.internetPrinter = builder.internetPrinter;
            this.keyboardControl = builder.keyboardControl;
            this.localDrive = builder.localDrive;
            this.maxReconnectTime = builder.maxReconnectTime;
            this.memoryDownGradeDuration = builder.memoryDownGradeDuration;
            this.memoryOverload = builder.memoryOverload;
            this.memoryProcessors = builder.memoryProcessors;
            this.memoryProtectedMode = builder.memoryProtectedMode;
            this.memoryRateLimit = builder.memoryRateLimit;
            this.memorySampleDuration = builder.memorySampleDuration;
            this.memorySingleRateLimit = builder.memorySingleRateLimit;
            this.mobileRestart = builder.mobileRestart;
            this.mobileSafeMenu = builder.mobileSafeMenu;
            this.mobileShutdown = builder.mobileShutdown;
            this.mobileWuyingKeeper = builder.mobileWuyingKeeper;
            this.mobileWyAssistant = builder.mobileWyAssistant;
            this.modelLibrary = builder.modelLibrary;
            this.multiScreen = builder.multiScreen;
            this.name = builder.name;
            this.netRedirect = builder.netRedirect;
            this.netRedirectRule = builder.netRedirectRule;
            this.networkPrinter = builder.networkPrinter;
            this.organizationCount = builder.organizationCount;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupType = builder.policyGroupType;
            this.policyStatus = builder.policyStatus;
            this.portProxy = builder.portProxy;
            this.preemptLogin = builder.preemptLogin;
            this.preemptLoginUsers = builder.preemptLoginUsers;
            this.printerAlert = builder.printerAlert;
            this.printerAlertContent = builder.printerAlertContent;
            this.printerAlertTitle = builder.printerAlertTitle;
            this.printerRedirection = builder.printerRedirection;
            this.qualityEnhancement = builder.qualityEnhancement;
            this.recordContent = builder.recordContent;
            this.recordContentExpires = builder.recordContentExpires;
            this.recordEventDuration = builder.recordEventDuration;
            this.recordEventFileExts = builder.recordEventFileExts;
            this.recordEventFilePaths = builder.recordEventFilePaths;
            this.recordEventLevels = builder.recordEventLevels;
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
            this.resolutionDpi = builder.resolutionDpi;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionModel = builder.resolutionModel;
            this.resolutionWidth = builder.resolutionWidth;
            this.resourceGroupCount = builder.resourceGroupCount;
            this.resourceRegionId = builder.resourceRegionId;
            this.safeMenu = builder.safeMenu;
            this.scope = builder.scope;
            this.scopeValue = builder.scopeValue;
            this.screenDisplayMode = builder.screenDisplayMode;
            this.smoothEnhancement = builder.smoothEnhancement;
            this.statusMonitor = builder.statusMonitor;
            this.streamingMode = builder.streamingMode;
            this.targetFps = builder.targetFps;
            this.threeScreen = builder.threeScreen;
            this.usbRedirect = builder.usbRedirect;
            this.usbSupplyRedirectRule = builder.usbSupplyRedirectRule;
            this.useTime = builder.useTime;
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
            this.watermarkShadow = builder.watermarkShadow;
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
         * @return academicProxy
         */
        public String getAcademicProxy() {
            return this.academicProxy;
        }

        /**
         * @return adminAccess
         */
        public String getAdminAccess() {
            return this.adminAccess;
        }

        /**
         * @return adminKeyboardOnFullScreen
         */
        public String getAdminKeyboardOnFullScreen() {
            return this.adminKeyboardOnFullScreen;
        }

        /**
         * @return adminKeyboardOnWindows
         */
        public String getAdminKeyboardOnWindows() {
            return this.adminKeyboardOnWindows;
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
         * @return autoReconnect
         */
        public String getAutoReconnect() {
            return this.autoReconnect;
        }

        /**
         * @return cameraRedirect
         */
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        /**
         * @return clientControlMenu
         */
        public String getClientControlMenu() {
            return this.clientControlMenu;
        }

        /**
         * @return clientCreateSnapshot
         */
        public String getClientCreateSnapshot() {
            return this.clientCreateSnapshot;
        }

        /**
         * @return clientHibernate
         */
        public String getClientHibernate() {
            return this.clientHibernate;
        }

        /**
         * @return clientRestart
         */
        public String getClientRestart() {
            return this.clientRestart;
        }

        /**
         * @return clientShutdown
         */
        public String getClientShutdown() {
            return this.clientShutdown;
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
         * @return cpdDriveClipboard
         */
        public String getCpdDriveClipboard() {
            return this.cpdDriveClipboard;
        }

        /**
         * @return cpuDownGradeDuration
         */
        public Integer getCpuDownGradeDuration() {
            return this.cpuDownGradeDuration;
        }

        /**
         * @return cpuOverload
         */
        public String getCpuOverload() {
            return this.cpuOverload;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return diskOverload
         */
        public String getDiskOverload() {
            return this.diskOverload;
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
         * @return endUserCount
         */
        public String getEndUserCount() {
            return this.endUserCount;
        }

        /**
         * @return endUserGroupCoordinate
         */
        public String getEndUserGroupCoordinate() {
            return this.endUserGroupCoordinate;
        }

        /**
         * @return externalDrive
         */
        public String getExternalDrive() {
            return this.externalDrive;
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
         * @return fileTransferAddress
         */
        public String getFileTransferAddress() {
            return this.fileTransferAddress;
        }

        /**
         * @return fileTransferInSize
         */
        public Integer getFileTransferInSize() {
            return this.fileTransferInSize;
        }

        /**
         * @return fileTransferInUnit
         */
        public String getFileTransferInUnit() {
            return this.fileTransferInUnit;
        }

        /**
         * @return fileTransferOutSize
         */
        public Integer getFileTransferOutSize() {
            return this.fileTransferOutSize;
        }

        /**
         * @return fileTransferOutUnit
         */
        public String getFileTransferOutUnit() {
            return this.fileTransferOutUnit;
        }

        /**
         * @return fileTransferSizeLimit
         */
        public String getFileTransferSizeLimit() {
            return this.fileTransferSizeLimit;
        }

        /**
         * @return fileTransferSpeed
         */
        public String getFileTransferSpeed() {
            return this.fileTransferSpeed;
        }

        /**
         * @return fileTransferSpeedLocation
         */
        public String getFileTransferSpeedLocation() {
            return this.fileTransferSpeedLocation;
        }

        /**
         * @return gpuAcceleration
         */
        public String getGpuAcceleration() {
            return this.gpuAcceleration;
        }

        /**
         * @return hoverConfigMsg
         */
        public String getHoverConfigMsg() {
            return this.hoverConfigMsg;
        }

        /**
         * @return hoverHibernate
         */
        public String getHoverHibernate() {
            return this.hoverHibernate;
        }

        /**
         * @return hoverRestart
         */
        public String getHoverRestart() {
            return this.hoverRestart;
        }

        /**
         * @return hoverShutdown
         */
        public String getHoverShutdown() {
            return this.hoverShutdown;
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
         * @return keyboardControl
         */
        public String getKeyboardControl() {
            return this.keyboardControl;
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
         * @return memoryOverload
         */
        public String getMemoryOverload() {
            return this.memoryOverload;
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
         * @return mobileSafeMenu
         */
        public String getMobileSafeMenu() {
            return this.mobileSafeMenu;
        }

        /**
         * @return mobileShutdown
         */
        public String getMobileShutdown() {
            return this.mobileShutdown;
        }

        /**
         * @return mobileWuyingKeeper
         */
        public String getMobileWuyingKeeper() {
            return this.mobileWuyingKeeper;
        }

        /**
         * @return mobileWyAssistant
         */
        public String getMobileWyAssistant() {
            return this.mobileWyAssistant;
        }

        /**
         * @return modelLibrary
         */
        public String getModelLibrary() {
            return this.modelLibrary;
        }

        /**
         * @return multiScreen
         */
        public String getMultiScreen() {
            return this.multiScreen;
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
         * @return networkPrinter
         */
        public String getNetworkPrinter() {
            return this.networkPrinter;
        }

        /**
         * @return organizationCount
         */
        public String getOrganizationCount() {
            return this.organizationCount;
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
         * @return portProxy
         */
        public String getPortProxy() {
            return this.portProxy;
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
         * @return printerAlert
         */
        public String getPrinterAlert() {
            return this.printerAlert;
        }

        /**
         * @return printerAlertContent
         */
        public String getPrinterAlertContent() {
            return this.printerAlertContent;
        }

        /**
         * @return printerAlertTitle
         */
        public String getPrinterAlertTitle() {
            return this.printerAlertTitle;
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
         * @return recordEventFileExts
         */
        public java.util.List<String> getRecordEventFileExts() {
            return this.recordEventFileExts;
        }

        /**
         * @return recordEventFilePaths
         */
        public java.util.List<String> getRecordEventFilePaths() {
            return this.recordEventFilePaths;
        }

        /**
         * @return recordEventLevels
         */
        public java.util.List<RecordEventLevels> getRecordEventLevels() {
            return this.recordEventLevels;
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
         * @return resolutionDpi
         */
        public Integer getResolutionDpi() {
            return this.resolutionDpi;
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
         * @return screenDisplayMode
         */
        public String getScreenDisplayMode() {
            return this.screenDisplayMode;
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
         * @return threeScreen
         */
        public String getThreeScreen() {
            return this.threeScreen;
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
         * @return useTime
         */
        public String getUseTime() {
            return this.useTime;
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
         * @return watermarkShadow
         */
        public String getWatermarkShadow() {
            return this.watermarkShadow;
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
            private String academicProxy; 
            private String adminAccess; 
            private String adminKeyboardOnFullScreen; 
            private String adminKeyboardOnWindows; 
            private String appContentProtection; 
            private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules; 
            private java.util.List<AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules; 
            private String autoReconnect; 
            private String cameraRedirect; 
            private String clientControlMenu; 
            private String clientCreateSnapshot; 
            private String clientHibernate; 
            private String clientRestart; 
            private String clientShutdown; 
            private java.util.List<ClientTypes> clientTypes; 
            private String clipboard; 
            private String colorEnhancement; 
            private String cpdDriveClipboard; 
            private Integer cpuDownGradeDuration; 
            private String cpuOverload; 
            private java.util.List<String> cpuProcessors; 
            private String cpuProtectedMode; 
            private Integer cpuRateLimit; 
            private Integer cpuSampleDuration; 
            private Integer cpuSingleRateLimit; 
            private String description; 
            private Integer desktopCount; 
            private Integer desktopGroupCount; 
            private String deviceConnectHint; 
            private java.util.List<DeviceRedirects> deviceRedirects; 
            private java.util.List<DeviceRules> deviceRules; 
            private String diskOverload; 
            private String displayMode; 
            private String domainList; 
            private java.util.List<DomainResolveRule> domainResolveRule; 
            private String domainResolveRuleType; 
            private Integer edsCount; 
            private String endUserApplyAdminCoordinate; 
            private String endUserCount; 
            private String endUserGroupCoordinate; 
            private String externalDrive; 
            private String fileMigrate; 
            private String fileTransfer; 
            private String fileTransferAddress; 
            private Integer fileTransferInSize; 
            private String fileTransferInUnit; 
            private Integer fileTransferOutSize; 
            private String fileTransferOutUnit; 
            private String fileTransferSizeLimit; 
            private String fileTransferSpeed; 
            private String fileTransferSpeedLocation; 
            private String gpuAcceleration; 
            private String hoverConfigMsg; 
            private String hoverHibernate; 
            private String hoverRestart; 
            private String hoverShutdown; 
            private String html5Access; 
            private String html5FileTransfer; 
            private String internetCommunicationProtocol; 
            private String internetPrinter; 
            private String keyboardControl; 
            private String localDrive; 
            private Integer maxReconnectTime; 
            private Integer memoryDownGradeDuration; 
            private String memoryOverload; 
            private java.util.List<String> memoryProcessors; 
            private String memoryProtectedMode; 
            private Integer memoryRateLimit; 
            private Integer memorySampleDuration; 
            private Integer memorySingleRateLimit; 
            private String mobileRestart; 
            private String mobileSafeMenu; 
            private String mobileShutdown; 
            private String mobileWuyingKeeper; 
            private String mobileWyAssistant; 
            private String modelLibrary; 
            private String multiScreen; 
            private String name; 
            private String netRedirect; 
            private java.util.List<NetRedirectRule> netRedirectRule; 
            private String networkPrinter; 
            private String organizationCount; 
            private String policyGroupId; 
            private String policyGroupType; 
            private String policyStatus; 
            private String portProxy; 
            private String preemptLogin; 
            private java.util.List<String> preemptLoginUsers; 
            private String printerAlert; 
            private String printerAlertContent; 
            private String printerAlertTitle; 
            private String printerRedirection; 
            private String qualityEnhancement; 
            private String recordContent; 
            private Long recordContentExpires; 
            private Integer recordEventDuration; 
            private java.util.List<String> recordEventFileExts; 
            private java.util.List<String> recordEventFilePaths; 
            private java.util.List<RecordEventLevels> recordEventLevels; 
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
            private Integer resolutionDpi; 
            private Integer resolutionHeight; 
            private String resolutionModel; 
            private Integer resolutionWidth; 
            private Integer resourceGroupCount; 
            private String resourceRegionId; 
            private String safeMenu; 
            private String scope; 
            private java.util.List<String> scopeValue; 
            private String screenDisplayMode; 
            private String smoothEnhancement; 
            private String statusMonitor; 
            private String streamingMode; 
            private Integer targetFps; 
            private String threeScreen; 
            private String usbRedirect; 
            private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule; 
            private String useTime; 
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
            private String watermarkShadow; 
            private String watermarkTransparency; 
            private Integer watermarkTransparencyValue; 
            private String watermarkType; 
            private String wuyingKeeper; 
            private String wyAssistant; 

            private Builder() {
            } 

            private Builder(DescribePolicyGroups model) {
                this.academicProxy = model.academicProxy;
                this.adminAccess = model.adminAccess;
                this.adminKeyboardOnFullScreen = model.adminKeyboardOnFullScreen;
                this.adminKeyboardOnWindows = model.adminKeyboardOnWindows;
                this.appContentProtection = model.appContentProtection;
                this.authorizeAccessPolicyRules = model.authorizeAccessPolicyRules;
                this.authorizeSecurityPolicyRules = model.authorizeSecurityPolicyRules;
                this.autoReconnect = model.autoReconnect;
                this.cameraRedirect = model.cameraRedirect;
                this.clientControlMenu = model.clientControlMenu;
                this.clientCreateSnapshot = model.clientCreateSnapshot;
                this.clientHibernate = model.clientHibernate;
                this.clientRestart = model.clientRestart;
                this.clientShutdown = model.clientShutdown;
                this.clientTypes = model.clientTypes;
                this.clipboard = model.clipboard;
                this.colorEnhancement = model.colorEnhancement;
                this.cpdDriveClipboard = model.cpdDriveClipboard;
                this.cpuDownGradeDuration = model.cpuDownGradeDuration;
                this.cpuOverload = model.cpuOverload;
                this.cpuProcessors = model.cpuProcessors;
                this.cpuProtectedMode = model.cpuProtectedMode;
                this.cpuRateLimit = model.cpuRateLimit;
                this.cpuSampleDuration = model.cpuSampleDuration;
                this.cpuSingleRateLimit = model.cpuSingleRateLimit;
                this.description = model.description;
                this.desktopCount = model.desktopCount;
                this.desktopGroupCount = model.desktopGroupCount;
                this.deviceConnectHint = model.deviceConnectHint;
                this.deviceRedirects = model.deviceRedirects;
                this.deviceRules = model.deviceRules;
                this.diskOverload = model.diskOverload;
                this.displayMode = model.displayMode;
                this.domainList = model.domainList;
                this.domainResolveRule = model.domainResolveRule;
                this.domainResolveRuleType = model.domainResolveRuleType;
                this.edsCount = model.edsCount;
                this.endUserApplyAdminCoordinate = model.endUserApplyAdminCoordinate;
                this.endUserCount = model.endUserCount;
                this.endUserGroupCoordinate = model.endUserGroupCoordinate;
                this.externalDrive = model.externalDrive;
                this.fileMigrate = model.fileMigrate;
                this.fileTransfer = model.fileTransfer;
                this.fileTransferAddress = model.fileTransferAddress;
                this.fileTransferInSize = model.fileTransferInSize;
                this.fileTransferInUnit = model.fileTransferInUnit;
                this.fileTransferOutSize = model.fileTransferOutSize;
                this.fileTransferOutUnit = model.fileTransferOutUnit;
                this.fileTransferSizeLimit = model.fileTransferSizeLimit;
                this.fileTransferSpeed = model.fileTransferSpeed;
                this.fileTransferSpeedLocation = model.fileTransferSpeedLocation;
                this.gpuAcceleration = model.gpuAcceleration;
                this.hoverConfigMsg = model.hoverConfigMsg;
                this.hoverHibernate = model.hoverHibernate;
                this.hoverRestart = model.hoverRestart;
                this.hoverShutdown = model.hoverShutdown;
                this.html5Access = model.html5Access;
                this.html5FileTransfer = model.html5FileTransfer;
                this.internetCommunicationProtocol = model.internetCommunicationProtocol;
                this.internetPrinter = model.internetPrinter;
                this.keyboardControl = model.keyboardControl;
                this.localDrive = model.localDrive;
                this.maxReconnectTime = model.maxReconnectTime;
                this.memoryDownGradeDuration = model.memoryDownGradeDuration;
                this.memoryOverload = model.memoryOverload;
                this.memoryProcessors = model.memoryProcessors;
                this.memoryProtectedMode = model.memoryProtectedMode;
                this.memoryRateLimit = model.memoryRateLimit;
                this.memorySampleDuration = model.memorySampleDuration;
                this.memorySingleRateLimit = model.memorySingleRateLimit;
                this.mobileRestart = model.mobileRestart;
                this.mobileSafeMenu = model.mobileSafeMenu;
                this.mobileShutdown = model.mobileShutdown;
                this.mobileWuyingKeeper = model.mobileWuyingKeeper;
                this.mobileWyAssistant = model.mobileWyAssistant;
                this.modelLibrary = model.modelLibrary;
                this.multiScreen = model.multiScreen;
                this.name = model.name;
                this.netRedirect = model.netRedirect;
                this.netRedirectRule = model.netRedirectRule;
                this.networkPrinter = model.networkPrinter;
                this.organizationCount = model.organizationCount;
                this.policyGroupId = model.policyGroupId;
                this.policyGroupType = model.policyGroupType;
                this.policyStatus = model.policyStatus;
                this.portProxy = model.portProxy;
                this.preemptLogin = model.preemptLogin;
                this.preemptLoginUsers = model.preemptLoginUsers;
                this.printerAlert = model.printerAlert;
                this.printerAlertContent = model.printerAlertContent;
                this.printerAlertTitle = model.printerAlertTitle;
                this.printerRedirection = model.printerRedirection;
                this.qualityEnhancement = model.qualityEnhancement;
                this.recordContent = model.recordContent;
                this.recordContentExpires = model.recordContentExpires;
                this.recordEventDuration = model.recordEventDuration;
                this.recordEventFileExts = model.recordEventFileExts;
                this.recordEventFilePaths = model.recordEventFilePaths;
                this.recordEventLevels = model.recordEventLevels;
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
                this.resolutionDpi = model.resolutionDpi;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionModel = model.resolutionModel;
                this.resolutionWidth = model.resolutionWidth;
                this.resourceGroupCount = model.resourceGroupCount;
                this.resourceRegionId = model.resourceRegionId;
                this.safeMenu = model.safeMenu;
                this.scope = model.scope;
                this.scopeValue = model.scopeValue;
                this.screenDisplayMode = model.screenDisplayMode;
                this.smoothEnhancement = model.smoothEnhancement;
                this.statusMonitor = model.statusMonitor;
                this.streamingMode = model.streamingMode;
                this.targetFps = model.targetFps;
                this.threeScreen = model.threeScreen;
                this.usbRedirect = model.usbRedirect;
                this.usbSupplyRedirectRule = model.usbSupplyRedirectRule;
                this.useTime = model.useTime;
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
                this.watermarkShadow = model.watermarkShadow;
                this.watermarkTransparency = model.watermarkTransparency;
                this.watermarkTransparencyValue = model.watermarkTransparencyValue;
                this.watermarkType = model.watermarkType;
                this.wuyingKeeper = model.wuyingKeeper;
                this.wyAssistant = model.wyAssistant;
            } 

            /**
             * <p>Specifies whether the academic proxy feature is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder academicProxy(String academicProxy) {
                this.academicProxy = academicProxy;
                return this;
            }

            /**
             * <p>Indicates whether the user has administrator permissions after connecting to the cloud computer.</p>
             * <blockquote>
             * <p>This feature is in invitational preview and is not publicly available.</p>
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
             * <p>Specifies whether the administrator keyboard control in full-screen mode is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder adminKeyboardOnFullScreen(String adminKeyboardOnFullScreen) {
                this.adminKeyboardOnFullScreen = adminKeyboardOnFullScreen;
                return this;
            }

            /**
             * <p>Specifies whether the administrator keyboard control within the Windows system is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder adminKeyboardOnWindows(String adminKeyboardOnWindows) {
                this.adminKeyboardOnWindows = adminKeyboardOnWindows;
                return this;
            }

            /**
             * <p>Specifies whether the screenshot prevention feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder appContentProtection(String appContentProtection) {
                this.appContentProtection = appContentProtection;
                return this;
            }

            /**
             * <p>The client IP whitelist. Only IP addresses within the whitelisted CIDR blocks can access cloud desktops.</p>
             */
            public Builder authorizeAccessPolicyRules(java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
                this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
                return this;
            }

            /**
             * <p>The list of security group rules.</p>
             */
            public Builder authorizeSecurityPolicyRules(java.util.List<AuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
                this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
                return this;
            }

            /**
             * <p>The client auto-reconnect configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder autoReconnect(String autoReconnect) {
                this.autoReconnect = autoReconnect;
                return this;
            }

            /**
             * <p>Specifies whether local camera redirection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder cameraRedirect(String cameraRedirect) {
                this.cameraRedirect = cameraRedirect;
                return this;
            }

            /**
             * <p>The client control menu display switch. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder clientControlMenu(String clientControlMenu) {
                this.clientControlMenu = clientControlMenu;
                return this;
            }

            /**
             * <p>Specifies whether the client custom snapshot creation feature is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clientCreateSnapshot(String clientCreateSnapshot) {
                this.clientCreateSnapshot = clientCreateSnapshot;
                return this;
            }

            /**
             * <p>Specifies whether the hibernate option in the client menu is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clientHibernate(String clientHibernate) {
                this.clientHibernate = clientHibernate;
                return this;
            }

            /**
             * <p>Specifies whether the restart option in the client menu is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clientRestart(String clientRestart) {
                this.clientRestart = clientRestart;
                return this;
            }

            /**
             * <p>Specifies whether the shutdown option in the client menu is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clientShutdown(String clientShutdown) {
                this.clientShutdown = clientShutdown;
                return this;
            }

            /**
             * <p>The logon method control list. Specifies which client types are allowed to access cloud desktops.</p>
             */
            public Builder clientTypes(java.util.List<ClientTypes> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * <p>The clipboard permission.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * <p>Indicates whether color enhancement is enabled for common scenarios of design and 3D applications.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder colorEnhancement(String colorEnhancement) {
                this.colorEnhancement = colorEnhancement;
                return this;
            }

            /**
             * <p>Specifies whether the local drive clipboard feature is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder cpdDriveClipboard(String cpdDriveClipboard) {
                this.cpdDriveClipboard = cpdDriveClipboard;
                return this;
            }

            /**
             * <p>The CPU throttling duration. Valid values: 30 to 120. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder cpuDownGradeDuration(Integer cpuDownGradeDuration) {
                this.cpuDownGradeDuration = cpuDownGradeDuration;
                return this;
            }

            /**
             * <p>Specifies whether CPU overload protection is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder cpuOverload(String cpuOverload) {
                this.cpuOverload = cpuOverload;
                return this;
            }

            /**
             * <p>The whitelist of processes that are not subject to CPU usage limits.</p>
             */
            public Builder cpuProcessors(java.util.List<String> cpuProcessors) {
                this.cpuProcessors = cpuProcessors;
                return this;
            }

            /**
             * <p>Specifies whether to enable CPU protection mode.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder cpuProtectedMode(String cpuProtectedMode) {
                this.cpuProtectedMode = cpuProtectedMode;
                return this;
            }

            /**
             * <p>The overall CPU usage percentage. Valid values: 70 to 90.</p>
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
             * <p>The single-core CPU usage percentage. Valid values: 70 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuSingleRateLimit(Integer cpuSingleRateLimit) {
                this.cpuSingleRateLimit = cpuSingleRateLimit;
                return this;
            }

            /**
             * <p>The description of the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>newDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of cloud computers associated with the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Integer desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The number of cloud computer pools associated with the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopGroupCount(Integer desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * <p>The peripheral connection hint control.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder deviceConnectHint(String deviceConnectHint) {
                this.deviceConnectHint = deviceConnectHint;
                return this;
            }

            /**
             * <p>The list of device redirection rules.</p>
             */
            public Builder deviceRedirects(java.util.List<DeviceRedirects> deviceRedirects) {
                this.deviceRedirects = deviceRedirects;
                return this;
            }

            /**
             * <p>The list of custom peripheral rules.</p>
             */
            public Builder deviceRules(java.util.List<DeviceRules> deviceRules) {
                this.deviceRules = deviceRules;
                return this;
            }

            /**
             * <p>Specifies whether disk overload protection is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder diskOverload(String diskOverload) {
                this.diskOverload = diskOverload;
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
             * <p>The access domain name permission control. Domain names support wildcards (\*). Separate multiple domain names with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>The domain name resolution policy list.</p>
             */
            public Builder domainResolveRule(java.util.List<DomainResolveRule> domainResolveRule) {
                this.domainResolveRule = domainResolveRule;
                return this;
            }

            /**
             * <p>The switch for the domain name resolution policy.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder domainResolveRuleType(String domainResolveRuleType) {
                this.domainResolveRuleType = domainResolveRuleType;
                return this;
            }

            /**
             * <p>The total number of cloud computers and cloud computer pools associated with this policy. This value is returned only for custom policies.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder edsCount(Integer edsCount) {
                this.edsCount = edsCount;
                return this;
            }

            /**
             * <p>Specifies whether to enable the feature that allows users to request administrator assistance.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
                this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
                return this;
            }

            /**
             * <p>The number of associated end users.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder endUserCount(String endUserCount) {
                this.endUserCount = endUserCount;
                return this;
            }

            /**
             * <p>Specifies whether to enable stream collaboration between users.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
                this.endUserGroupCoordinate = endUserGroupCoordinate;
                return this;
            }

            /**
             * <p>Specifies whether the use of external storage devices is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder externalDrive(String externalDrive) {
                this.externalDrive = externalDrive;
                return this;
            }

            /**
             * <p>The file migration setting.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder fileMigrate(String fileMigrate) {
                this.fileMigrate = fileMigrate;
                return this;
            }

            /**
             * <p>The file transfer setting.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder fileTransfer(String fileTransfer) {
                this.fileTransfer = fileTransfer;
                return this;
            }

            /**
             * <p>The service address for the file transfer feature.</p>
             * 
             * <strong>example:</strong>
             * <p>filetransfer.example.com</p>
             */
            public Builder fileTransferAddress(String fileTransferAddress) {
                this.fileTransferAddress = fileTransferAddress;
                return this;
            }

            /**
             * <p>The file size limit for a single file transfer to the cloud desktop. Use this parameter together with the inbound unit parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder fileTransferInSize(Integer fileTransferInSize) {
                this.fileTransferInSize = fileTransferInSize;
                return this;
            }

            /**
             * <p>The unit for the file size limit of a single file transfer to the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder fileTransferInUnit(String fileTransferInUnit) {
                this.fileTransferInUnit = fileTransferInUnit;
                return this;
            }

            /**
             * <p>The file size limit for a single file transfer from the cloud desktop. Use this parameter together with the outbound unit parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder fileTransferOutSize(Integer fileTransferOutSize) {
                this.fileTransferOutSize = fileTransferOutSize;
                return this;
            }

            /**
             * <p>The unit for the file size limit of a single file transfer from the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder fileTransferOutUnit(String fileTransferOutUnit) {
                this.fileTransferOutUnit = fileTransferOutUnit;
                return this;
            }

            /**
             * <p>Specifies whether the file transfer size limit is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder fileTransferSizeLimit(String fileTransferSizeLimit) {
                this.fileTransferSizeLimit = fileTransferSizeLimit;
                return this;
            }

            /**
             * <p>The file transfer speed level.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder fileTransferSpeed(String fileTransferSpeed) {
                this.fileTransferSpeed = fileTransferSpeed;
                return this;
            }

            /**
             * <p>The location where the file transfer speed configured on the client takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>client</p>
             */
            public Builder fileTransferSpeedLocation(String fileTransferSpeedLocation) {
                this.fileTransferSpeedLocation = fileTransferSpeedLocation;
                return this;
            }

            /**
             * <p>Specifies whether the image quality policy is enabled for GPU-accelerated cloud desktops. Enable this policy when high performance and user experience are required, such as in professional design scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder gpuAcceleration(String gpuAcceleration) {
                this.gpuAcceleration = gpuAcceleration;
                return this;
            }

            /**
             * <p>Specifies whether the floating ball configuration message prompt is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder hoverConfigMsg(String hoverConfigMsg) {
                this.hoverConfigMsg = hoverConfigMsg;
                return this;
            }

            /**
             * <p>Specifies whether the hibernate button on the floating ball is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder hoverHibernate(String hoverHibernate) {
                this.hoverHibernate = hoverHibernate;
                return this;
            }

            /**
             * <p>Specifies whether the restart button on the floating ball is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder hoverRestart(String hoverRestart) {
                this.hoverRestart = hoverRestart;
                return this;
            }

            /**
             * <p>Specifies whether the shutdown button on the floating ball is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder hoverShutdown(String hoverShutdown) {
                this.hoverShutdown = hoverShutdown;
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
             * <p>The file transfer policy for the web client.</p>
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
             * <p>BOTH</p>
             */
            public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
                this.internetCommunicationProtocol = internetCommunicationProtocol;
                return this;
            }

            /**
             * <p>The network printer feature switch. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder internetPrinter(String internetPrinter) {
                this.internetPrinter = internetPrinter;
                return this;
            }

            /**
             * <p>Specifies whether the keyboard control on the floating ball is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder keyboardControl(String keyboardControl) {
                this.keyboardControl = keyboardControl;
                return this;
            }

            /**
             * <p>The local drive mapping permission.</p>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder localDrive(String localDrive) {
                this.localDrive = localDrive;
                return this;
            }

            /**
             * <p>The maximum reconnection retry time when the cloud computer is disconnected due to external reasons. Valid values: 30 to 7200. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder maxReconnectTime(Integer maxReconnectTime) {
                this.maxReconnectTime = maxReconnectTime;
                return this;
            }

            /**
             * <p>The memory throttling duration of a single process. Valid values: 30 to 120. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memoryDownGradeDuration(Integer memoryDownGradeDuration) {
                this.memoryDownGradeDuration = memoryDownGradeDuration;
                return this;
            }

            /**
             * <p>Specifies whether memory overload protection is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder memoryOverload(String memoryOverload) {
                this.memoryOverload = memoryOverload;
                return this;
            }

            /**
             * <p>The whitelist of processes that are not subject to memory usage limits.</p>
             */
            public Builder memoryProcessors(java.util.List<String> memoryProcessors) {
                this.memoryProcessors = memoryProcessors;
                return this;
            }

            /**
             * <p>Specifies whether to enable memory protection mode.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder memoryProtectedMode(String memoryProtectedMode) {
                this.memoryProtectedMode = memoryProtectedMode;
                return this;
            }

            /**
             * <p>The overall memory usage percentage. Valid values: 70 to 90.</p>
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
             * <p>The memory usage percentage of a single process. Valid values: 30 to 60.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memorySingleRateLimit(Integer memorySingleRateLimit) {
                this.memorySingleRateLimit = memorySingleRateLimit;
                return this;
            }

            /**
             * <p>Specifies whether the restart button is provided in the cloud computer floating ball when connecting to a cloud computer from a mobile client (including Android and iOS clients).</p>
             * <blockquote>
             * <p>This applies only to mobile clients of V7.4 or later.</p>
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
             * <p>Specifies whether the Windows security control feature is enabled on mobile clients.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder mobileSafeMenu(String mobileSafeMenu) {
                this.mobileSafeMenu = mobileSafeMenu;
                return this;
            }

            /**
             * <p>Specifies whether the shutdown button is provided in the cloud computer floating ball when connecting to a cloud computer from a mobile client (including Android and iOS clients).</p>
             * <blockquote>
             * <p>This applies only to mobile clients of V7.4 or later.</p>
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
             * <p>Specifies whether the WUYING Keeper feature is enabled on mobile clients.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder mobileWuyingKeeper(String mobileWuyingKeeper) {
                this.mobileWuyingKeeper = mobileWuyingKeeper;
                return this;
            }

            /**
             * <p>Specifies whether the WUYING Assistant feature is enabled on mobile clients.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder mobileWyAssistant(String mobileWyAssistant) {
                this.mobileWyAssistant = mobileWyAssistant;
                return this;
            }

            /**
             * <p>Specifies whether the model library feature is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder modelLibrary(String modelLibrary) {
                this.modelLibrary = modelLibrary;
                return this;
            }

            /**
             * <p>Specifies whether the multi-screen display feature is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder multiScreen(String multiScreen) {
                this.multiScreen = multiScreen;
                return this;
            }

            /**
             * <p>The Policy Name of the cloud computer policy.</p>
             * 
             * <strong>example:</strong>
             * <p>testPolicyGroupName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network redirection setting.</p>
             * <blockquote>
             * <p>This feature is in invitational preview and is not publicly available.</p>
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
             * <p>The network redirection policy list.</p>
             * <blockquote>
             * <p>This feature is in invitational preview and is not publicly available.</p>
             * </blockquote>
             */
            public Builder netRedirectRule(java.util.List<NetRedirectRule> netRedirectRule) {
                this.netRedirectRule = netRedirectRule;
                return this;
            }

            /**
             * <p>The network printer feature switch. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder networkPrinter(String networkPrinter) {
                this.networkPrinter = networkPrinter;
                return this;
            }

            /**
             * <p>The number of associated organizations.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder organizationCount(String organizationCount) {
                this.organizationCount = organizationCount;
                return this;
            }

            /**
             * <p>The cloud computer policy ID.</p>
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
             * <p>Specifies whether the port proxy feature is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder portProxy(String portProxy) {
                this.portProxy = portProxy;
                return this;
            }

            /**
             * <p>The preemption policy for the cloud computer.</p>
             * <blockquote>
             * <p>To ensure the user experience and data security of end users who are using cloud computers, preemption among multiple users is not allowed. This means the configuration is set to <code>off</code> by default and cannot be modified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder preemptLogin(String preemptLogin) {
                this.preemptLogin = preemptLogin;
                return this;
            }

            /**
             * <p>The usernames of users who can preempt cloud desktops.</p>
             */
            public Builder preemptLoginUsers(java.util.List<String> preemptLoginUsers) {
                this.preemptLoginUsers = preemptLoginUsers;
                return this;
            }

            /**
             * <p>The printer pop-up alert setting. Valid values:</p>
             * <ul>
             * <li>default: Default value.</li>
             * <li>off: Disabled.</li>
             * <li>custom: Custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder printerAlert(String printerAlert) {
                this.printerAlert = printerAlert;
                return this;
            }

            /**
             * <p>The content of the printer pop-up alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Print Content</p>
             */
            public Builder printerAlertContent(String printerAlertContent) {
                this.printerAlertContent = printerAlertContent;
                return this;
            }

            /**
             * <p>The title of the printer pop-up alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Print Title</p>
             */
            public Builder printerAlertTitle(String printerAlertTitle) {
                this.printerAlertTitle = printerAlertTitle;
                return this;
            }

            /**
             * <p>The printer redirection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder printerRedirection(String printerRedirection) {
                this.printerRedirection = printerRedirection;
                return this;
            }

            /**
             * <p>Specifies whether image quality enhancement is enabled for design and 3D common scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder qualityEnhancement(String qualityEnhancement) {
                this.qualityEnhancement = qualityEnhancement;
                return this;
            }

            /**
             * <p>Specifies whether custom screen recording is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * <p>The expiration time of custom screen recording files. Default value: 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder recordContentExpires(Long recordContentExpires) {
                this.recordContentExpires = recordContentExpires;
                return this;
            }

            /**
             * <p>The recording duration after an event is detected in screen recording audit. Unit: minutes. Valid values: 10 to 60.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordEventDuration(Integer recordEventDuration) {
                this.recordEventDuration = recordEventDuration;
                return this;
            }

            /**
             * <p>The file extensions for screen recording events.</p>
             */
            public Builder recordEventFileExts(java.util.List<String> recordEventFileExts) {
                this.recordEventFileExts = recordEventFileExts;
                return this;
            }

            /**
             * <p>The list of absolute paths for file monitoring in screen recording audit.</p>
             */
            public Builder recordEventFilePaths(java.util.List<String> recordEventFilePaths) {
                this.recordEventFilePaths = recordEventFilePaths;
                return this;
            }

            /**
             * <p>The screen recording event level settings.</p>
             */
            public Builder recordEventLevels(java.util.List<RecordEventLevels> recordEventLevels) {
                this.recordEventLevels = recordEventLevels;
                return this;
            }

            /**
             * <p>The list of absolute paths for registry monitoring in screen recording audit.</p>
             */
            public Builder recordEventRegisters(java.util.List<String> recordEventRegisters) {
                this.recordEventRegisters = recordEventRegisters;
                return this;
            }

            /**
             * <p>Specifies whether screen recording is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>OFF</p>
             */
            public Builder recording(String recording) {
                this.recording = recording;
                return this;
            }

            /**
             * <p>The option for recording cloud computer audio.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder recordingAudio(String recordingAudio) {
                this.recordingAudio = recordingAudio;
                return this;
            }

            /**
             * <p>The duration of a screen recording file, in minutes. Recording files are automatically split and uploaded to the storage space based on the duration you specify. When a file reaches 300 MB, it is rolled over first.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * <p>The screen recording end time in the format of HH:MM:SS. This parameter is meaningful only when Recording is set to PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>08:59:00</p>
             */
            public Builder recordingEndTime(String recordingEndTime) {
                this.recordingEndTime = recordingEndTime;
                return this;
            }

            /**
             * <p>The retention period of screen recording files. Valid values: 1 to 180. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder recordingExpires(Long recordingExpires) {
                this.recordingExpires = recordingExpires;
                return this;
            }

            /**
             * <p>The screen recording frame rate. Unit: FPS (frames per second).</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder recordingFps(Long recordingFps) {
                this.recordingFps = recordingFps;
                return this;
            }

            /**
             * <p>The screen recording start time in the format of HH:MM:SS. This parameter is meaningful only when Recording is set to PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00:00</p>
             */
            public Builder recordingStartTime(String recordingStartTime) {
                this.recordingStartTime = recordingStartTime;
                return this;
            }

            /**
             * <p>The client notification feature for screen recording.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder recordingUserNotify(String recordingUserNotify) {
                this.recordingUserNotify = recordingUserNotify;
                return this;
            }

            /**
             * <p>The notification content for the screen recording client. Leave this parameter empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>Your cloud computer is being recorded</p>
             */
            public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
                this.recordingUserNotifyMessage = recordingUserNotifyMessage;
                return this;
            }

            /**
             * <p>The keyboard and mouse control permission for remote assistance.</p>
             * 
             * <strong>example:</strong>
             * <p>fullControl</p>
             */
            public Builder remoteCoordinate(String remoteCoordinate) {
                this.remoteCoordinate = remoteCoordinate;
                return this;
            }

            /**
             * <p>The setting for resetting the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder resetDesktop(String resetDesktop) {
                this.resetDesktop = resetDesktop;
                return this;
            }

            /**
             * <p>The DPI value of the screen resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder resolutionDpi(Integer resolutionDpi) {
                this.resolutionDpi = resolutionDpi;
                return this;
            }

            /**
             * <p>The height of the resolution. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud computers: 480 to 4096.</p>
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
             * <p>The width of the resolution. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud computers: 640 to 4096.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            /**
             * <p>The number of resource groups associated with the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceGroupCount(Integer resourceGroupCount) {
                this.resourceGroupCount = resourceGroupCount;
                return this;
            }

            /**
             * <p>The region to which the cloud computer policy belongs.</p>
             * <blockquote>
             * <p>If the policy is a region-independent policy, this value is <code>center</code>.</p>
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
             * <p>The security center shortcut key switch. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
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
             * <p>This parameter is required when <code>Scope</code> is set to <code>IP</code>. This parameter takes effect only when <code>Scope</code> is set to <code>IP</code>.</p>
             */
            public Builder scopeValue(java.util.List<String> scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * <p>The screen display mode.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder screenDisplayMode(String screenDisplayMode) {
                this.screenDisplayMode = screenDisplayMode;
                return this;
            }

            /**
             * <p>Specifies whether smoothness enhancement is enabled for daily office scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder smoothEnhancement(String smoothEnhancement) {
                this.smoothEnhancement = smoothEnhancement;
                return this;
            }

            /**
             * <p>Specifies whether the status monitoring entry is provided in the cloud computer floating ball.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder statusMonitor(String statusMonitor) {
                this.statusMonitor = statusMonitor;
                return this;
            }

            /**
             * <p>The streaming mode for scenario adaptation.</p>
             * 
             * <strong>example:</strong>
             * <p>smooth</p>
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * <p>The target frame rate. Valid values: 10 to 60.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder targetFps(Integer targetFps) {
                this.targetFps = targetFps;
                return this;
            }

            /**
             * <p>Specifies whether the three-screen feature is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder threeScreen(String threeScreen) {
                this.threeScreen = threeScreen;
                return this;
            }

            /**
             * <p>The USB redirection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
             * <p>Specifies whether the usage duration display on the floating ball is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder useTime(String useTime) {
                this.useTime = useTime;
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
             * <p>The maximum QP for video encoding, which represents the lowest image quality. Valid values: 0 to 51.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder videoEncMaxQP(Integer videoEncMaxQP) {
                this.videoEncMaxQP = videoEncMaxQP;
                return this;
            }

            /**
             * <p>The minimum QP for video encoding, which represents the highest quality. Valid values: 0 to 51.</p>
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
             * <p>The multimedia redirection setting.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder videoRedirect(String videoRedirect) {
                this.videoRedirect = videoRedirect;
                return this;
            }

            /**
             * <p>The image display quality policy.</p>
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
             * <p>The anti-camera capture feature for invisible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder watermarkAntiCam(String watermarkAntiCam) {
                this.watermarkAntiCam = watermarkAntiCam;
                return this;
            }

            /**
             * <p>The watermark font color. Valid values: 0 to 16777215.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder watermarkColor(Integer watermarkColor) {
                this.watermarkColor = watermarkColor;
                return this;
            }

            /**
             * <p>If the <code>WatermarkType</code> parameter is set to <code>custom</code>, you must also specify the custom text content by using the <code>WatermarkCustomText</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>custom-watermark</p>
             */
            public Builder watermarkCustomText(String watermarkCustomText) {
                this.watermarkCustomText = watermarkCustomText;
                return this;
            }

            /**
             * <p>The watermark tilt angle. Valid values: -10 to -30.</p>
             * 
             * <strong>example:</strong>
             * <p>-10</p>
             */
            public Builder watermarkDegree(Double watermarkDegree) {
                this.watermarkDegree = watermarkDegree;
                return this;
            }

            /**
             * <p>The watermark font size. Valid values: 10 to 20.</p>
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
             * 
             * <strong>example:</strong>
             * <p>plain</p>
             */
            public Builder watermarkFontStyle(String watermarkFontStyle) {
                this.watermarkFontStyle = watermarkFontStyle;
                return this;
            }

            /**
             * <p>The enhancement feature for invisible watermarks.</p>
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
             * <p>This parameter is not yet available for use.</p>
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
             * <p>The security-first rule for invisible watermarks.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder watermarkSecurity(String watermarkSecurity) {
                this.watermarkSecurity = watermarkSecurity;
                return this;
            }

            /**
             * <p>Specifies whether the watermark shadow effect is enabled. Valid values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder watermarkShadow(String watermarkShadow) {
                this.watermarkShadow = watermarkShadow;
                return this;
            }

            /**
             * <p>The transparency level of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>LIGHT</p>
             */
            public Builder watermarkTransparency(String watermarkTransparency) {
                this.watermarkTransparency = watermarkTransparency;
                return this;
            }

            /**
             * <p>The watermark transparency. A larger value indicates lower transparency. Valid values: 10 to 100.</p>
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
             * <p>The WUYING Keeper switch.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder wuyingKeeper(String wuyingKeeper) {
                this.wuyingKeeper = wuyingKeeper;
                return this;
            }

            /**
             * <p>Specifies whether the WUYING AI Assistant entry is provided in the cloud computer floating ball.</p>
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
