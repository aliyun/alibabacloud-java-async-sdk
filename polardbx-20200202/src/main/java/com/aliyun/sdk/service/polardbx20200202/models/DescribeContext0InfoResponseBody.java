// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeContext0InfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContext0InfoResponseBody</p>
 */
public class DescribeContext0InfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContext0InfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContext0InfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeContext0InfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The parameter details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContext0InfoResponseBody build() {
            return new DescribeContext0InfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContext0InfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContext0InfoResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The authentication action.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The display name of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The owner ID of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The authentication principal type.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The encoded diagnostic message.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The type of missing permission.</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContext0InfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContext0InfoResponseBody</p>
     */
    public static class ConnAddrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private ConnAddrs(Builder builder) {
            this.connectionString = builder.connectionString;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.type = builder.type;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnAddrs create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String connectionString; 
            private String nodeType; 
            private Integer port; 
            private String type; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcInstanceId; 

            private Builder() {
            } 

            private Builder(ConnAddrs model) {
                this.connectionString = model.connectionString;
                this.nodeType = model.nodeType;
                this.port = model.port;
                this.type = model.type;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.vpcInstanceId = model.vpcInstanceId;
            } 

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-spsil01pww4hfz.polarx.singapore.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The target node type: service or dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The endpoint type.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-t4n4hf9xey7ea3lp4bwwx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-t4ny14pr37spmjsbv5dc2</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC-connected instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-spsil01pww4hfzjayd-cn-20251013180429</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public ConnAddrs build() {
                return new ConnAddrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContext0InfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContext0InfoResponseBody</p>
     */
    public static class ReplicaSetsConnAddrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private ReplicaSetsConnAddrs(Builder builder) {
            this.connectionString = builder.connectionString;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.type = builder.type;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaSetsConnAddrs create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String connectionString; 
            private String nodeType; 
            private Integer port; 
            private String type; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcInstanceId; 

            private Builder() {
            } 

            private Builder(ReplicaSetsConnAddrs model) {
                this.connectionString = model.connectionString;
                this.nodeType = model.nodeType;
                this.port = model.port;
                this.type = model.type;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.vpcInstanceId = model.vpcInstanceId;
            } 

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzrlz8e3khuaoz.polarx.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The target node type: service or dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>ReadWrite</strong>: Primary instance.</li>
             * <li><strong>ReadOnly</strong>: Read-only instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RemoveHeader</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1550umsomy2mw24vhwl</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zedp17pfss1133bvdizl</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC-connected instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbdw66evguopfcfvieoi</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public ReplicaSetsConnAddrs build() {
                return new ReplicaSetsConnAddrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContext0InfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContext0InfoResponseBody</p>
     */
    public static class ReplicaSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ConnAddrs")
        private java.util.List<ReplicaSetsConnAddrs> connAddrs;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ReplicaSets(Builder builder) {
            this.classCode = builder.classCode;
            this.connAddrs = builder.connAddrs;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.nodeCount = builder.nodeCount;
            this.nodeType = builder.nodeType;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaSets create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return connAddrs
         */
        public java.util.List<ReplicaSetsConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String classCode; 
            private java.util.List<ReplicaSetsConnAddrs> connAddrs; 
            private String createTime; 
            private String instanceId; 
            private Integer nodeCount; 
            private String nodeType; 
            private String status; 
            private String storageType; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ReplicaSets model) {
                this.classCode = model.classCode;
                this.connAddrs = model.connAddrs;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.nodeCount = model.nodeCount;
                this.nodeType = model.nodeType;
                this.status = model.status;
                this.storageType = model.storageType;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The instance specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>pg.x2.13large.2c</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             */
            public Builder connAddrs(java.util.List<ReplicaSetsConnAddrs> connAddrs) {
                this.connAddrs = connAddrs;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-28T02:01:13Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzrbqgiocrpu8a</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>The target node type: service or dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Running.</li>
             * <li><strong>1</strong>: Creating.</li>
             * <li><strong>2</strong>: Abnormal.</li>
             * <li><strong>3</strong>: Expired.</li>
             * <li><strong>4</strong>: Releasing.</li>
             * <li><strong>5</strong>: Released.</li>
             * <li><strong>6</strong>: Locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ReplicaSets build() {
                return new ReplicaSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContext0InfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContext0InfoResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ConnAddrs")
        private java.util.List<ConnAddrs> connAddrs;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("OpenSearchInstanceName")
        private String openSearchInstanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplicaSets")
        private java.util.List<ReplicaSets> replicaSets;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instance(Builder builder) {
            this.classCode = builder.classCode;
            this.connAddrs = builder.connAddrs;
            this.createTime = builder.createTime;
            this.DBInstanceName = builder.DBInstanceName;
            this.instanceId = builder.instanceId;
            this.minorVersion = builder.minorVersion;
            this.nodeCount = builder.nodeCount;
            this.openSearchInstanceName = builder.openSearchInstanceName;
            this.regionId = builder.regionId;
            this.replicaSets = builder.replicaSets;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return connAddrs
         */
        public java.util.List<ConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return openSearchInstanceName
         */
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicaSets
         */
        public java.util.List<ReplicaSets> getReplicaSets() {
            return this.replicaSets;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String classCode; 
            private java.util.List<ConnAddrs> connAddrs; 
            private String createTime; 
            private String DBInstanceName; 
            private String instanceId; 
            private String minorVersion; 
            private Integer nodeCount; 
            private String openSearchInstanceName; 
            private String regionId; 
            private java.util.List<ReplicaSets> replicaSets; 
            private String status; 
            private String storageType; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.classCode = model.classCode;
                this.connAddrs = model.connAddrs;
                this.createTime = model.createTime;
                this.DBInstanceName = model.DBInstanceName;
                this.instanceId = model.instanceId;
                this.minorVersion = model.minorVersion;
                this.nodeCount = model.nodeCount;
                this.openSearchInstanceName = model.openSearchInstanceName;
                this.regionId = model.regionId;
                this.replicaSets = model.replicaSets;
                this.status = model.status;
                this.storageType = model.storageType;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The instance specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.x2.large.2c</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The list of endpoints.</p>
             */
            public Builder connAddrs(java.util.List<ConnAddrs> connAddrs) {
                this.connAddrs = connAddrs;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-17T02:00:20Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The database instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzr9qzafkeury3</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-spsil01pww4hfz-mem</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Service 当前已确认的小版本完整 tag，未知时为空。</p>
             * 
             * <strong>example:</strong>
             * <p>polardb-2.6.0_release_contextdb-20261023</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>The PolarDB-X Search instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxs-********</p>
             */
            public Builder openSearchInstanceName(String openSearchInstanceName) {
                this.openSearchInstanceName = openSearchInstanceName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The endpoints of the nodes.</p>
             */
            public Builder replicaSets(java.util.List<ReplicaSets> replicaSets) {
                this.replicaSets = replicaSets;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>local_ssd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-t4n4hf9xey7ea3lp4bwwx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-t4ny14pr37spmjsbv5dc2</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContext0InfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContext0InfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private Instance instance;

        private Data(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public Instance getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private Instance instance; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instance = model.instance;
            } 

            /**
             * <p>The instance information.</p>
             */
            public Builder instance(Instance instance) {
                this.instance = instance;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
