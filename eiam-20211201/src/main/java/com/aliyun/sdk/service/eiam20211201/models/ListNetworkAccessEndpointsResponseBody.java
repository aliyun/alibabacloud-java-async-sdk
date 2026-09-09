// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListNetworkAccessEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkAccessEndpointsResponseBody</p>
 */
public class ListNetworkAccessEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpoints")
    private java.util.List<NetworkAccessEndpoints> networkAccessEndpoints;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListNetworkAccessEndpointsResponseBody(Builder builder) {
        this.networkAccessEndpoints = builder.networkAccessEndpoints;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkAccessEndpointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAccessEndpoints
     */
    public java.util.List<NetworkAccessEndpoints> getNetworkAccessEndpoints() {
        return this.networkAccessEndpoints;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<NetworkAccessEndpoints> networkAccessEndpoints; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListNetworkAccessEndpointsResponseBody model) {
            this.networkAccessEndpoints = model.networkAccessEndpoints;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of network access endpoints.</p>
         */
        public Builder networkAccessEndpoints(java.util.List<NetworkAccessEndpoints> networkAccessEndpoints) {
            this.networkAccessEndpoints = networkAccessEndpoints;
            return this;
        }

        /**
         * <p>The pagination token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNetworkAccessEndpointsResponseBody build() {
            return new ListNetworkAccessEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkAccessEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkAccessEndpointsResponseBody</p>
     */
    public static class BackupVpcEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEgressPrivateIpAddresses")
        private java.util.List<String> backupEgressPrivateIpAddresses;

        @com.aliyun.core.annotation.NameInMap("BackupEgressPublicIpAddresses")
        private java.util.List<String> backupEgressPublicIpAddresses;

        @com.aliyun.core.annotation.NameInMap("BackupSecurityGroupId")
        private String backupSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("BackupVSwitchIds")
        private java.util.List<String> backupVSwitchIds;

        @com.aliyun.core.annotation.NameInMap("BackupVpcId")
        private String backupVpcId;

        @com.aliyun.core.annotation.NameInMap("BackupVpcRegionId")
        private String backupVpcRegionId;

        private BackupVpcEndpoint(Builder builder) {
            this.backupEgressPrivateIpAddresses = builder.backupEgressPrivateIpAddresses;
            this.backupEgressPublicIpAddresses = builder.backupEgressPublicIpAddresses;
            this.backupSecurityGroupId = builder.backupSecurityGroupId;
            this.backupVSwitchIds = builder.backupVSwitchIds;
            this.backupVpcId = builder.backupVpcId;
            this.backupVpcRegionId = builder.backupVpcRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupVpcEndpoint create() {
            return builder().build();
        }

        /**
         * @return backupEgressPrivateIpAddresses
         */
        public java.util.List<String> getBackupEgressPrivateIpAddresses() {
            return this.backupEgressPrivateIpAddresses;
        }

        /**
         * @return backupEgressPublicIpAddresses
         */
        public java.util.List<String> getBackupEgressPublicIpAddresses() {
            return this.backupEgressPublicIpAddresses;
        }

        /**
         * @return backupSecurityGroupId
         */
        public String getBackupSecurityGroupId() {
            return this.backupSecurityGroupId;
        }

        /**
         * @return backupVSwitchIds
         */
        public java.util.List<String> getBackupVSwitchIds() {
            return this.backupVSwitchIds;
        }

        /**
         * @return backupVpcId
         */
        public String getBackupVpcId() {
            return this.backupVpcId;
        }

        /**
         * @return backupVpcRegionId
         */
        public String getBackupVpcRegionId() {
            return this.backupVpcRegionId;
        }

        public static final class Builder {
            private java.util.List<String> backupEgressPrivateIpAddresses; 
            private java.util.List<String> backupEgressPublicIpAddresses; 
            private String backupSecurityGroupId; 
            private java.util.List<String> backupVSwitchIds; 
            private String backupVpcId; 
            private String backupVpcRegionId; 

            private Builder() {
            } 

            private Builder(BackupVpcEndpoint model) {
                this.backupEgressPrivateIpAddresses = model.backupEgressPrivateIpAddresses;
                this.backupEgressPublicIpAddresses = model.backupEgressPublicIpAddresses;
                this.backupSecurityGroupId = model.backupSecurityGroupId;
                this.backupVSwitchIds = model.backupVSwitchIds;
                this.backupVpcId = model.backupVpcId;
                this.backupVpcRegionId = model.backupVpcRegionId;
            } 

            /**
             * <p>The list of private egress IP addresses of the backup network access endpoint.</p>
             */
            public Builder backupEgressPrivateIpAddresses(java.util.List<String> backupEgressPrivateIpAddresses) {
                this.backupEgressPrivateIpAddresses = backupEgressPrivateIpAddresses;
                return this;
            }

            /**
             * <p>The list of public egress IP addresses of the backup network access endpoint.</p>
             */
            public Builder backupEgressPublicIpAddresses(java.util.List<String> backupEgressPublicIpAddresses) {
                this.backupEgressPublicIpAddresses = backupEgressPublicIpAddresses;
                return this;
            }

            /**
             * <p>The security group ID of the backup network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-examplexxx</p>
             */
            public Builder backupSecurityGroupId(String backupSecurityGroupId) {
                this.backupSecurityGroupId = backupSecurityGroupId;
                return this;
            }

            /**
             * <p>The list of vSwitches for the backup network access endpoint.</p>
             */
            public Builder backupVSwitchIds(java.util.List<String> backupVSwitchIds) {
                this.backupVSwitchIds = backupVSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID of the backup network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-examplexxx</p>
             */
            public Builder backupVpcId(String backupVpcId) {
                this.backupVpcId = backupVpcId;
                return this;
            }

            /**
             * <p>The region of the backup network access endpoint VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder backupVpcRegionId(String backupVpcRegionId) {
                this.backupVpcRegionId = backupVpcRegionId;
                return this;
            }

            public BackupVpcEndpoint build() {
                return new BackupVpcEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkAccessEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkAccessEndpointsResponseBody</p>
     */
    public static class NetworkAccessEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupVpcEndpoint")
        private BackupVpcEndpoint backupVpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointName")
        private String networkAccessEndpointName;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointType")
        private String networkAccessEndpointType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcRegionId")
        private String vpcRegionId;

        private NetworkAccessEndpoints(Builder builder) {
            this.backupVpcEndpoint = builder.backupVpcEndpoint;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.networkAccessEndpointId = builder.networkAccessEndpointId;
            this.networkAccessEndpointName = builder.networkAccessEndpointName;
            this.networkAccessEndpointType = builder.networkAccessEndpointType;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.vpcRegionId = builder.vpcRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAccessEndpoints create() {
            return builder().build();
        }

        /**
         * @return backupVpcEndpoint
         */
        public BackupVpcEndpoint getBackupVpcEndpoint() {
            return this.backupVpcEndpoint;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkAccessEndpointId
         */
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        /**
         * @return networkAccessEndpointName
         */
        public String getNetworkAccessEndpointName() {
            return this.networkAccessEndpointName;
        }

        /**
         * @return networkAccessEndpointType
         */
        public String getNetworkAccessEndpointType() {
            return this.networkAccessEndpointType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcRegionId
         */
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

        public static final class Builder {
            private BackupVpcEndpoint backupVpcEndpoint; 
            private Long createTime; 
            private String instanceId; 
            private String networkAccessEndpointId; 
            private String networkAccessEndpointName; 
            private String networkAccessEndpointType; 
            private String securityGroupId; 
            private String status; 
            private Long updateTime; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 
            private String vpcRegionId; 

            private Builder() {
            } 

            private Builder(NetworkAccessEndpoints model) {
                this.backupVpcEndpoint = model.backupVpcEndpoint;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.networkAccessEndpointId = model.networkAccessEndpointId;
                this.networkAccessEndpointName = model.networkAccessEndpointName;
                this.networkAccessEndpointType = model.networkAccessEndpointType;
                this.securityGroupId = model.securityGroupId;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
                this.vpcRegionId = model.vpcRegionId;
            } 

            /**
             * <p>The backup network access endpoint VPC configuration.</p>
             */
            public Builder backupVpcEndpoint(BackupVpcEndpoint backupVpcEndpoint) {
                this.backupVpcEndpoint = backupVpcEndpoint;
                return this;
            }

            /**
             * <p>The creation time of the network access endpoint. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The network access endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nae_examplexxx</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>The network access endpoint name. For example, the VPC access endpoint for a specific business.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC access endpoint for xx service</p>
             */
            public Builder networkAccessEndpointName(String networkAccessEndpointName) {
                this.networkAccessEndpointName = networkAccessEndpointName;
                return this;
            }

            /**
             * <p>The type of the network access endpoint. Valid values:</p>
             * <ul>
             * <li>shared: shared network access endpoint.</li>
             * <li>private: dedicated network access endpoint.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder networkAccessEndpointType(String networkAccessEndpointType) {
                this.networkAccessEndpointType = networkAccessEndpointType;
                return this;
            }

            /**
             * <p>The security group ID used by the dedicated network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-examplexxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The status of the network access endpoint. Valid values:</p>
             * <ul>
             * <li>pending: pending initialization.</li>
             * <li>creating: being created.</li>
             * <li>running: running.</li>
             * <li>deleting: being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last update time of the network access endpoint. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The list of vSwitches for the dedicated network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-examplexxx</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID of the dedicated network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-examplexxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The region of the VPC for the dedicated network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            public NetworkAccessEndpoints build() {
                return new NetworkAccessEndpoints(this);
            } 

        } 

    }
}
