// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInsightsAnalysisResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInsightsAnalysisResultResponseBody</p>
 */
public class DescribeNetworkInsightsAnalysisResultResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("Destination")
    private String destination;

    @NameInMap("DestinationIp")
    private String destinationIp;

    @NameInMap("DestinationPort")
    private String destinationPort;

    @NameInMap("DestinationType")
    private String destinationType;

    @NameInMap("NetworkInsightsAnalysisComponents")
    private NetworkInsightsAnalysisComponents networkInsightsAnalysisComponents;

    @NameInMap("NetworkInsightsAnalysisId")
    private String networkInsightsAnalysisId;

    @NameInMap("NetworkInsightsPathId")
    private String networkInsightsPathId;

    @NameInMap("NetworkPathFound")
    private String networkPathFound;

    @NameInMap("Protocol")
    private String protocol;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Source")
    private String source;

    @NameInMap("SourceIp")
    private String sourceIp;

    @NameInMap("SourceType")
    private String sourceType;

    @NameInMap("Status")
    private String status;

    private DescribeNetworkInsightsAnalysisResultResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.destination = builder.destination;
        this.destinationIp = builder.destinationIp;
        this.destinationPort = builder.destinationPort;
        this.destinationType = builder.destinationType;
        this.networkInsightsAnalysisComponents = builder.networkInsightsAnalysisComponents;
        this.networkInsightsAnalysisId = builder.networkInsightsAnalysisId;
        this.networkInsightsPathId = builder.networkInsightsPathId;
        this.networkPathFound = builder.networkPathFound;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInsightsAnalysisResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return destinationIp
     */
    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * @return destinationPort
     */
    public String getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return networkInsightsAnalysisComponents
     */
    public NetworkInsightsAnalysisComponents getNetworkInsightsAnalysisComponents() {
        return this.networkInsightsAnalysisComponents;
    }

    /**
     * @return networkInsightsAnalysisId
     */
    public String getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    /**
     * @return networkInsightsPathId
     */
    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    /**
     * @return networkPathFound
     */
    public String getNetworkPathFound() {
        return this.networkPathFound;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String creationTime; 
        private String destination; 
        private String destinationIp; 
        private String destinationPort; 
        private String destinationType; 
        private NetworkInsightsAnalysisComponents networkInsightsAnalysisComponents; 
        private String networkInsightsAnalysisId; 
        private String networkInsightsPathId; 
        private String networkPathFound; 
        private String protocol; 
        private String requestId; 
        private String source; 
        private String sourceIp; 
        private String sourceType; 
        private String status; 

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * DestinationIp.
         */
        public Builder destinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }

        /**
         * DestinationPort.
         */
        public Builder destinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        /**
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        /**
         * NetworkInsightsAnalysisComponents.
         */
        public Builder networkInsightsAnalysisComponents(NetworkInsightsAnalysisComponents networkInsightsAnalysisComponents) {
            this.networkInsightsAnalysisComponents = networkInsightsAnalysisComponents;
            return this;
        }

        /**
         * NetworkInsightsAnalysisId.
         */
        public Builder networkInsightsAnalysisId(String networkInsightsAnalysisId) {
            this.networkInsightsAnalysisId = networkInsightsAnalysisId;
            return this;
        }

        /**
         * NetworkInsightsPathId.
         */
        public Builder networkInsightsPathId(String networkInsightsPathId) {
            this.networkInsightsPathId = networkInsightsPathId;
            return this;
        }

        /**
         * NetworkPathFound.
         */
        public Builder networkPathFound(String networkPathFound) {
            this.networkPathFound = networkPathFound;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeNetworkInsightsAnalysisResultResponseBody build() {
            return new DescribeNetworkInsightsAnalysisResultResponseBody(this);
        } 

    } 

    public static class NetworkAclEntry extends TeaModel {
        @NameInMap("Direction")
        private String direction;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclId")
        private String networkAclId;

        @NameInMap("NetworkAclName")
        private String networkAclName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("VpcId")
        private String vpcId;

        private NetworkAclEntry(Builder builder) {
            this.direction = builder.direction;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclId = builder.networkAclId;
            this.networkAclName = builder.networkAclName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAclEntry create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclId
         */
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        /**
         * @return networkAclName
         */
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String direction; 
            private String networkAclEntryId; 
            private String networkAclId; 
            private String networkAclName; 
            private String policy; 
            private String port; 
            private String protocol; 
            private String sourceCidrIp; 
            private String vpcId; 

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * NetworkAclEntryId.
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * NetworkAclId.
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * NetworkAclName.
             */
            public Builder networkAclName(String networkAclName) {
                this.networkAclName = networkAclName;
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
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkAclEntry build() {
                return new NetworkAclEntry(this);
            } 

        } 

    }
    public static class RelativeGroupIds extends TeaModel {
        @NameInMap("RelativeGroupId")
        private java.util.List < String > relativeGroupId;

        private RelativeGroupIds(Builder builder) {
            this.relativeGroupId = builder.relativeGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelativeGroupIds create() {
            return builder().build();
        }

        /**
         * @return relativeGroupId
         */
        public java.util.List < String > getRelativeGroupId() {
            return this.relativeGroupId;
        }

        public static final class Builder {
            private java.util.List < String > relativeGroupId; 

            /**
             * RelativeGroupId.
             */
            public Builder relativeGroupId(java.util.List < String > relativeGroupId) {
                this.relativeGroupId = relativeGroupId;
                return this;
            }

            public RelativeGroupIds build() {
                return new RelativeGroupIds(this);
            } 

        } 

    }
    public static class SecurityGroupAcl extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("DestGroupId")
        private String destGroupId;

        @NameInMap("DestPortRange")
        private String destPortRange;

        @NameInMap("InnerAccessPolicy")
        private String innerAccessPolicy;

        @NameInMap("NicType")
        private String nicType;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        private SecurityGroupAcl(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.destGroupId = builder.destGroupId;
            this.destPortRange = builder.destPortRange;
            this.innerAccessPolicy = builder.innerAccessPolicy;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupAcl create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destCidrIp
         */
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        /**
         * @return destGroupId
         */
        public String getDestGroupId() {
            return this.destGroupId;
        }

        /**
         * @return destPortRange
         */
        public String getDestPortRange() {
            return this.destPortRange;
        }

        /**
         * @return innerAccessPolicy
         */
        public String getInnerAccessPolicy() {
            return this.innerAccessPolicy;
        }

        /**
         * @return nicType
         */
        public String getNicType() {
            return this.nicType;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String destCidrIp; 
            private String destGroupId; 
            private String destPortRange; 
            private String innerAccessPolicy; 
            private String nicType; 
            private String policy; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * DestCidrIp.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * DestGroupId.
             */
            public Builder destGroupId(String destGroupId) {
                this.destGroupId = destGroupId;
                return this;
            }

            /**
             * DestPortRange.
             */
            public Builder destPortRange(String destPortRange) {
                this.destPortRange = destPortRange;
                return this;
            }

            /**
             * InnerAccessPolicy.
             */
            public Builder innerAccessPolicy(String innerAccessPolicy) {
                this.innerAccessPolicy = innerAccessPolicy;
                return this;
            }

            /**
             * NicType.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
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
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public SecurityGroupAcl build() {
                return new SecurityGroupAcl(this);
            } 

        } 

    }
    public static class TopProcesses extends TeaModel {
        @NameInMap("TopProcess")
        private java.util.List < String > topProcess;

        private TopProcesses(Builder builder) {
            this.topProcess = builder.topProcess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopProcesses create() {
            return builder().build();
        }

        /**
         * @return topProcess
         */
        public java.util.List < String > getTopProcess() {
            return this.topProcess;
        }

        public static final class Builder {
            private java.util.List < String > topProcess; 

            /**
             * TopProcess.
             */
            public Builder topProcess(java.util.List < String > topProcess) {
                this.topProcess = topProcess;
                return this;
            }

            public TopProcesses build() {
                return new TopProcesses(this);
            } 

        } 

    }
    public static class Explanations extends TeaModel {
        @NameInMap("ActualIP")
        private String actualIP;

        @NameInMap("ActualPort")
        private Long actualPort;

        @NameInMap("ExpectIP")
        private String expectIP;

        @NameInMap("ExpectPort")
        private Long expectPort;

        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Header")
        private String header;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("MissingFiles")
        private String missingFiles;

        @NameInMap("Netmask")
        private String netmask;

        @NameInMap("NetworkAclEntry")
        private NetworkAclEntry networkAclEntry;

        @NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @NameInMap("Port")
        private Long port;

        @NameInMap("ProcessName")
        private String processName;

        @NameInMap("RelativeGroupIds")
        private RelativeGroupIds relativeGroupIds;

        @NameInMap("Rule")
        private String rule;

        @NameInMap("SecurityGroupAcl")
        private SecurityGroupAcl securityGroupAcl;

        @NameInMap("TopProcesses")
        private TopProcesses topProcesses;

        @NameInMap("UsePercent")
        private String usePercent;

        private Explanations(Builder builder) {
            this.actualIP = builder.actualIP;
            this.actualPort = builder.actualPort;
            this.expectIP = builder.expectIP;
            this.expectPort = builder.expectPort;
            this.expireDate = builder.expireDate;
            this.groupId = builder.groupId;
            this.header = builder.header;
            this.ip = builder.ip;
            this.missingFiles = builder.missingFiles;
            this.netmask = builder.netmask;
            this.networkAclEntry = builder.networkAclEntry;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.port = builder.port;
            this.processName = builder.processName;
            this.relativeGroupIds = builder.relativeGroupIds;
            this.rule = builder.rule;
            this.securityGroupAcl = builder.securityGroupAcl;
            this.topProcesses = builder.topProcesses;
            this.usePercent = builder.usePercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Explanations create() {
            return builder().build();
        }

        /**
         * @return actualIP
         */
        public String getActualIP() {
            return this.actualIP;
        }

        /**
         * @return actualPort
         */
        public Long getActualPort() {
            return this.actualPort;
        }

        /**
         * @return expectIP
         */
        public String getExpectIP() {
            return this.expectIP;
        }

        /**
         * @return expectPort
         */
        public Long getExpectPort() {
            return this.expectPort;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return header
         */
        public String getHeader() {
            return this.header;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return missingFiles
         */
        public String getMissingFiles() {
            return this.missingFiles;
        }

        /**
         * @return netmask
         */
        public String getNetmask() {
            return this.netmask;
        }

        /**
         * @return networkAclEntry
         */
        public NetworkAclEntry getNetworkAclEntry() {
            return this.networkAclEntry;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return relativeGroupIds
         */
        public RelativeGroupIds getRelativeGroupIds() {
            return this.relativeGroupIds;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return securityGroupAcl
         */
        public SecurityGroupAcl getSecurityGroupAcl() {
            return this.securityGroupAcl;
        }

        /**
         * @return topProcesses
         */
        public TopProcesses getTopProcesses() {
            return this.topProcesses;
        }

        /**
         * @return usePercent
         */
        public String getUsePercent() {
            return this.usePercent;
        }

        public static final class Builder {
            private String actualIP; 
            private Long actualPort; 
            private String expectIP; 
            private Long expectPort; 
            private String expireDate; 
            private String groupId; 
            private String header; 
            private String ip; 
            private String missingFiles; 
            private String netmask; 
            private NetworkAclEntry networkAclEntry; 
            private String networkInterfaceName; 
            private Long port; 
            private String processName; 
            private RelativeGroupIds relativeGroupIds; 
            private String rule; 
            private SecurityGroupAcl securityGroupAcl; 
            private TopProcesses topProcesses; 
            private String usePercent; 

            /**
             * ActualIP.
             */
            public Builder actualIP(String actualIP) {
                this.actualIP = actualIP;
                return this;
            }

            /**
             * ActualPort.
             */
            public Builder actualPort(Long actualPort) {
                this.actualPort = actualPort;
                return this;
            }

            /**
             * ExpectIP.
             */
            public Builder expectIP(String expectIP) {
                this.expectIP = expectIP;
                return this;
            }

            /**
             * ExpectPort.
             */
            public Builder expectPort(Long expectPort) {
                this.expectPort = expectPort;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(String header) {
                this.header = header;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * MissingFiles.
             */
            public Builder missingFiles(String missingFiles) {
                this.missingFiles = missingFiles;
                return this;
            }

            /**
             * Netmask.
             */
            public Builder netmask(String netmask) {
                this.netmask = netmask;
                return this;
            }

            /**
             * NetworkAclEntry.
             */
            public Builder networkAclEntry(NetworkAclEntry networkAclEntry) {
                this.networkAclEntry = networkAclEntry;
                return this;
            }

            /**
             * NetworkInterfaceName.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * RelativeGroupIds.
             */
            public Builder relativeGroupIds(RelativeGroupIds relativeGroupIds) {
                this.relativeGroupIds = relativeGroupIds;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * SecurityGroupAcl.
             */
            public Builder securityGroupAcl(SecurityGroupAcl securityGroupAcl) {
                this.securityGroupAcl = securityGroupAcl;
                return this;
            }

            /**
             * TopProcesses.
             */
            public Builder topProcesses(TopProcesses topProcesses) {
                this.topProcesses = topProcesses;
                return this;
            }

            /**
             * UsePercent.
             */
            public Builder usePercent(String usePercent) {
                this.usePercent = usePercent;
                return this;
            }

            public Explanations build() {
                return new Explanations(this);
            } 

        } 

    }
    public static class CategoryItem extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Explanations")
        private Explanations explanations;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("Reachable")
        private String reachable;

        private CategoryItem(Builder builder) {
            this.code = builder.code;
            this.explanations = builder.explanations;
            this.itemName = builder.itemName;
            this.reachable = builder.reachable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryItem create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return explanations
         */
        public Explanations getExplanations() {
            return this.explanations;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return reachable
         */
        public String getReachable() {
            return this.reachable;
        }

        public static final class Builder {
            private String code; 
            private Explanations explanations; 
            private String itemName; 
            private String reachable; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Explanations.
             */
            public Builder explanations(Explanations explanations) {
                this.explanations = explanations;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * Reachable.
             */
            public Builder reachable(String reachable) {
                this.reachable = reachable;
                return this;
            }

            public CategoryItem build() {
                return new CategoryItem(this);
            } 

        } 

    }
    public static class CategoryItems extends TeaModel {
        @NameInMap("CategoryItem")
        private java.util.List < CategoryItem> categoryItem;

        private CategoryItems(Builder builder) {
            this.categoryItem = builder.categoryItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryItems create() {
            return builder().build();
        }

        /**
         * @return categoryItem
         */
        public java.util.List < CategoryItem> getCategoryItem() {
            return this.categoryItem;
        }

        public static final class Builder {
            private java.util.List < CategoryItem> categoryItem; 

            /**
             * CategoryItem.
             */
            public Builder categoryItem(java.util.List < CategoryItem> categoryItem) {
                this.categoryItem = categoryItem;
                return this;
            }

            public CategoryItems build() {
                return new CategoryItems(this);
            } 

        } 

    }
    public static class DiagnoseCategory extends TeaModel {
        @NameInMap("CategoryItems")
        private CategoryItems categoryItems;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("Reachable")
        private String reachable;

        private DiagnoseCategory(Builder builder) {
            this.categoryItems = builder.categoryItems;
            this.categoryName = builder.categoryName;
            this.reachable = builder.reachable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseCategory create() {
            return builder().build();
        }

        /**
         * @return categoryItems
         */
        public CategoryItems getCategoryItems() {
            return this.categoryItems;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return reachable
         */
        public String getReachable() {
            return this.reachable;
        }

        public static final class Builder {
            private CategoryItems categoryItems; 
            private String categoryName; 
            private String reachable; 

            /**
             * CategoryItems.
             */
            public Builder categoryItems(CategoryItems categoryItems) {
                this.categoryItems = categoryItems;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Reachable.
             */
            public Builder reachable(String reachable) {
                this.reachable = reachable;
                return this;
            }

            public DiagnoseCategory build() {
                return new DiagnoseCategory(this);
            } 

        } 

    }
    public static class DiagnoseCategories extends TeaModel {
        @NameInMap("DiagnoseCategory")
        private java.util.List < DiagnoseCategory> diagnoseCategory;

        private DiagnoseCategories(Builder builder) {
            this.diagnoseCategory = builder.diagnoseCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseCategories create() {
            return builder().build();
        }

        /**
         * @return diagnoseCategory
         */
        public java.util.List < DiagnoseCategory> getDiagnoseCategory() {
            return this.diagnoseCategory;
        }

        public static final class Builder {
            private java.util.List < DiagnoseCategory> diagnoseCategory; 

            /**
             * DiagnoseCategory.
             */
            public Builder diagnoseCategory(java.util.List < DiagnoseCategory> diagnoseCategory) {
                this.diagnoseCategory = diagnoseCategory;
                return this;
            }

            public DiagnoseCategories build() {
                return new DiagnoseCategories(this);
            } 

        } 

    }
    public static class NetworkInsightsAnalysisComponentNetworkAclEntry extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DestinationCidrIp")
        private String destinationCidrIp;

        @NameInMap("Direction")
        private String direction;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @NameInMap("NetworkAclId")
        private String networkAclId;

        @NameInMap("NetworkAclName")
        private String networkAclName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("VpcId")
        private String vpcId;

        private NetworkInsightsAnalysisComponentNetworkAclEntry(Builder builder) {
            this.creationTime = builder.creationTime;
            this.destinationCidrIp = builder.destinationCidrIp;
            this.direction = builder.direction;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.networkAclId = builder.networkAclId;
            this.networkAclName = builder.networkAclName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsAnalysisComponentNetworkAclEntry create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return destinationCidrIp
         */
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclEntryName
         */
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        /**
         * @return networkAclId
         */
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        /**
         * @return networkAclName
         */
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String creationTime; 
            private String destinationCidrIp; 
            private String direction; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String networkAclId; 
            private String networkAclName; 
            private String policy; 
            private String port; 
            private String protocol; 
            private String sourceCidrIp; 
            private String vpcId; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DestinationCidrIp.
             */
            public Builder destinationCidrIp(String destinationCidrIp) {
                this.destinationCidrIp = destinationCidrIp;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * NetworkAclEntryId.
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * NetworkAclEntryName.
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * NetworkAclId.
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * NetworkAclName.
             */
            public Builder networkAclName(String networkAclName) {
                this.networkAclName = networkAclName;
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
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkInsightsAnalysisComponentNetworkAclEntry build() {
                return new NetworkInsightsAnalysisComponentNetworkAclEntry(this);
            } 

        } 

    }
    public static class NetworkInsightsAnalysisComponentRelativeGroupIds extends TeaModel {
        @NameInMap("RelativeGroupId")
        private java.util.List < String > relativeGroupId;

        private NetworkInsightsAnalysisComponentRelativeGroupIds(Builder builder) {
            this.relativeGroupId = builder.relativeGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsAnalysisComponentRelativeGroupIds create() {
            return builder().build();
        }

        /**
         * @return relativeGroupId
         */
        public java.util.List < String > getRelativeGroupId() {
            return this.relativeGroupId;
        }

        public static final class Builder {
            private java.util.List < String > relativeGroupId; 

            /**
             * RelativeGroupId.
             */
            public Builder relativeGroupId(java.util.List < String > relativeGroupId) {
                this.relativeGroupId = relativeGroupId;
                return this;
            }

            public NetworkInsightsAnalysisComponentRelativeGroupIds build() {
                return new NetworkInsightsAnalysisComponentRelativeGroupIds(this);
            } 

        } 

    }
    public static class NetworkInsightsAnalysisComponentSecurityGroupAcl extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("DestGroupId")
        private String destGroupId;

        @NameInMap("DestGroupName")
        private String destGroupName;

        @NameInMap("DestPortRange")
        private String destPortRange;

        @NameInMap("Direction")
        private String direction;

        @NameInMap("InnerAccessPolicy")
        private String innerAccessPolicy;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @NameInMap("NicType")
        private String nicType;

        @NameInMap("PermissionDescription")
        private String permissionDescription;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourceGroupId")
        private String sourceGroupId;

        @NameInMap("SourceGroupName")
        private String sourceGroupName;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        private NetworkInsightsAnalysisComponentSecurityGroupAcl(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.destGroupId = builder.destGroupId;
            this.destGroupName = builder.destGroupName;
            this.destPortRange = builder.destPortRange;
            this.direction = builder.direction;
            this.innerAccessPolicy = builder.innerAccessPolicy;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.nicType = builder.nicType;
            this.permissionDescription = builder.permissionDescription;
            this.policy = builder.policy;
            this.priority = builder.priority;
            this.securityGroupId = builder.securityGroupId;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourceGroupId = builder.sourceGroupId;
            this.sourceGroupName = builder.sourceGroupName;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsAnalysisComponentSecurityGroupAcl create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destCidrIp
         */
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        /**
         * @return destGroupId
         */
        public String getDestGroupId() {
            return this.destGroupId;
        }

        /**
         * @return destGroupName
         */
        public String getDestGroupName() {
            return this.destGroupName;
        }

        /**
         * @return destPortRange
         */
        public String getDestPortRange() {
            return this.destPortRange;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return innerAccessPolicy
         */
        public String getInnerAccessPolicy() {
            return this.innerAccessPolicy;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return ipv6DestCidrIp
         */
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        /**
         * @return ipv6SourceCidrIp
         */
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        /**
         * @return nicType
         */
        public String getNicType() {
            return this.nicType;
        }

        /**
         * @return permissionDescription
         */
        public String getPermissionDescription() {
            return this.permissionDescription;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return sourceGroupId
         */
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        /**
         * @return sourceGroupName
         */
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String destCidrIp; 
            private String destGroupId; 
            private String destGroupName; 
            private String destPortRange; 
            private String direction; 
            private String innerAccessPolicy; 
            private String ipProtocol; 
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String nicType; 
            private String permissionDescription; 
            private String policy; 
            private String priority; 
            private String securityGroupId; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourceGroupName; 
            private String sourcePortRange; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * DestCidrIp.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * DestGroupId.
             */
            public Builder destGroupId(String destGroupId) {
                this.destGroupId = destGroupId;
                return this;
            }

            /**
             * DestGroupName.
             */
            public Builder destGroupName(String destGroupName) {
                this.destGroupName = destGroupName;
                return this;
            }

            /**
             * DestPortRange.
             */
            public Builder destPortRange(String destPortRange) {
                this.destPortRange = destPortRange;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * InnerAccessPolicy.
             */
            public Builder innerAccessPolicy(String innerAccessPolicy) {
                this.innerAccessPolicy = innerAccessPolicy;
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
             * Ipv6DestCidrIp.
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * Ipv6SourceCidrIp.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * NicType.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * PermissionDescription.
             */
            public Builder permissionDescription(String permissionDescription) {
                this.permissionDescription = permissionDescription;
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
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * SourceGroupId.
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * SourceGroupName.
             */
            public Builder sourceGroupName(String sourceGroupName) {
                this.sourceGroupName = sourceGroupName;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public NetworkInsightsAnalysisComponentSecurityGroupAcl build() {
                return new NetworkInsightsAnalysisComponentSecurityGroupAcl(this);
            } 

        } 

    }
    public static class NetworkInsightsAnalysisComponent extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("DiagnoseCategories")
        private DiagnoseCategories diagnoseCategories;

        @NameInMap("Message")
        private String message;

        @NameInMap("NetworkAclEntry")
        private NetworkInsightsAnalysisComponentNetworkAclEntry networkAclEntry;

        @NameInMap("Reachable")
        private String reachable;

        @NameInMap("RelativeGroupIds")
        private NetworkInsightsAnalysisComponentRelativeGroupIds relativeGroupIds;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SecurityGroupAcl")
        private NetworkInsightsAnalysisComponentSecurityGroupAcl securityGroupAcl;

        @NameInMap("Sequence")
        private Integer sequence;

        private NetworkInsightsAnalysisComponent(Builder builder) {
            this.code = builder.code;
            this.diagnoseCategories = builder.diagnoseCategories;
            this.message = builder.message;
            this.networkAclEntry = builder.networkAclEntry;
            this.reachable = builder.reachable;
            this.relativeGroupIds = builder.relativeGroupIds;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.securityGroupAcl = builder.securityGroupAcl;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsAnalysisComponent create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return diagnoseCategories
         */
        public DiagnoseCategories getDiagnoseCategories() {
            return this.diagnoseCategories;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return networkAclEntry
         */
        public NetworkInsightsAnalysisComponentNetworkAclEntry getNetworkAclEntry() {
            return this.networkAclEntry;
        }

        /**
         * @return reachable
         */
        public String getReachable() {
            return this.reachable;
        }

        /**
         * @return relativeGroupIds
         */
        public NetworkInsightsAnalysisComponentRelativeGroupIds getRelativeGroupIds() {
            return this.relativeGroupIds;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return securityGroupAcl
         */
        public NetworkInsightsAnalysisComponentSecurityGroupAcl getSecurityGroupAcl() {
            return this.securityGroupAcl;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private String code; 
            private DiagnoseCategories diagnoseCategories; 
            private String message; 
            private NetworkInsightsAnalysisComponentNetworkAclEntry networkAclEntry; 
            private String reachable; 
            private NetworkInsightsAnalysisComponentRelativeGroupIds relativeGroupIds; 
            private String resourceId; 
            private String resourceType; 
            private NetworkInsightsAnalysisComponentSecurityGroupAcl securityGroupAcl; 
            private Integer sequence; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DiagnoseCategories.
             */
            public Builder diagnoseCategories(DiagnoseCategories diagnoseCategories) {
                this.diagnoseCategories = diagnoseCategories;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * NetworkAclEntry.
             */
            public Builder networkAclEntry(NetworkInsightsAnalysisComponentNetworkAclEntry networkAclEntry) {
                this.networkAclEntry = networkAclEntry;
                return this;
            }

            /**
             * Reachable.
             */
            public Builder reachable(String reachable) {
                this.reachable = reachable;
                return this;
            }

            /**
             * RelativeGroupIds.
             */
            public Builder relativeGroupIds(NetworkInsightsAnalysisComponentRelativeGroupIds relativeGroupIds) {
                this.relativeGroupIds = relativeGroupIds;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SecurityGroupAcl.
             */
            public Builder securityGroupAcl(NetworkInsightsAnalysisComponentSecurityGroupAcl securityGroupAcl) {
                this.securityGroupAcl = securityGroupAcl;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            public NetworkInsightsAnalysisComponent build() {
                return new NetworkInsightsAnalysisComponent(this);
            } 

        } 

    }
    public static class NetworkInsightsAnalysisComponents extends TeaModel {
        @NameInMap("NetworkInsightsAnalysisComponent")
        private java.util.List < NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponent;

        private NetworkInsightsAnalysisComponents(Builder builder) {
            this.networkInsightsAnalysisComponent = builder.networkInsightsAnalysisComponent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsAnalysisComponents create() {
            return builder().build();
        }

        /**
         * @return networkInsightsAnalysisComponent
         */
        public java.util.List < NetworkInsightsAnalysisComponent> getNetworkInsightsAnalysisComponent() {
            return this.networkInsightsAnalysisComponent;
        }

        public static final class Builder {
            private java.util.List < NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponent; 

            /**
             * NetworkInsightsAnalysisComponent.
             */
            public Builder networkInsightsAnalysisComponent(java.util.List < NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponent) {
                this.networkInsightsAnalysisComponent = networkInsightsAnalysisComponent;
                return this;
            }

            public NetworkInsightsAnalysisComponents build() {
                return new NetworkInsightsAnalysisComponents(this);
            } 

        } 

    }
}
