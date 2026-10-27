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
 * {@link DescribeOpenSearchTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenSearchTopologyResponseBody</p>
 */
public class DescribeOpenSearchTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenSearchTopologyResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenSearchTopologyResponseBody create() {
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

        private Builder(DescribeOpenSearchTopologyResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenSearchTopologyResponseBody build() {
            return new DescribeOpenSearchTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenSearchTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchTopologyResponseBody</p>
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
             * <p>NoPermissionType</p>
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
     * {@link DescribeOpenSearchTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchTopologyResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("IsLeader")
        private Boolean isLeader;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Nodes(Builder builder) {
            this.availabilityZone = builder.availabilityZone;
            this.cpu = builder.cpu;
            this.host = builder.host;
            this.isLeader = builder.isLeader;
            this.memoryGB = builder.memoryGB;
            this.nodeId = builder.nodeId;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return availabilityZone
         */
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return isLeader
         */
        public Boolean getIsLeader() {
            return this.isLeader;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String availabilityZone; 
            private Integer cpu; 
            private String host; 
            private Boolean isLeader; 
            private Integer memoryGB; 
            private String nodeId; 
            private String role; 
            private String status; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.availabilityZone = model.availabilityZone;
                this.cpu = model.cpu;
                this.host = model.host;
                this.isLeader = model.isLeader;
                this.memoryGB = model.memoryGB;
                this.nodeId = model.nodeId;
                this.role = model.role;
                this.status = model.status;
            } 

            /**
             * <p>The zone.</p>
             * 
             * <strong>example:</strong>
             * <p>t1222576965886205</p>
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * <p>The total number of CPU cores in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The Origin Domain Name that you configured in the DCDN console, including IPv4 addresses, IPv6 addresses, common domain names, and OSS domain names.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com">https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Indicates whether the current node is the primary node.</p>
             */
            public Builder isLeader(Boolean isLeader) {
                this.isLeader = isLeader;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-c-jf0pivh2dt</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The role of a node in the three-node RDS cluster. Valid values:</p>
             * <ul>
             * <li><strong>leader</strong>: primary node</li>
             * <li><strong>follower</strong>: secondary node</li>
             * <li><strong>logger</strong>: logger node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polarx_cn</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Running</li>
             * <li><strong>1</strong>: Creating</li>
             * <li><strong>2</strong>: Abnormal</li>
             * <li><strong>3</strong>: Expired</li>
             * <li><strong>4</strong>: Releasing</li>
             * <li><strong>5</strong>: Released</li>
             * <li><strong>6</strong>: Locked</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchTopologyResponseBody</p>
     */
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReplicaCount")
        private Integer replicaCount;

        @com.aliyun.core.annotation.NameInMap("StorageTotalGB")
        private Integer storageTotalGB;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Storage(Builder builder) {
            this.replicaCount = builder.replicaCount;
            this.storageTotalGB = builder.storageTotalGB;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return replicaCount
         */
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        /**
         * @return storageTotalGB
         */
        public Integer getStorageTotalGB() {
            return this.storageTotalGB;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private Integer replicaCount; 
            private Integer storageTotalGB; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(Storage model) {
                this.replicaCount = model.replicaCount;
                this.storageTotalGB = model.storageTotalGB;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The number of secondary nodes in the primary zone.</p>
             * <blockquote>
             * <p>The <strong>ReplicaCount</strong> and <strong>SlaveReplicaCount</strong> parameters apply only to cloud-native instances. If the instance uses the cluster architecture, these parameters indicate the number of secondary nodes of a <strong>single shard</strong> in the primary and secondary zones.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replicaCount(Integer replicaCount) {
                this.replicaCount = replicaCount;
                return this;
            }

            /**
             * <p>The total storage capacity of the node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder storageTotalGB(Integer storageTotalGB) {
                this.storageTotalGB = storageTotalGB;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchTopologyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Storage storage;

        private Data(Builder builder) {
            this.nodes = builder.nodes;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return storage
         */
        public Storage getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 
            private Storage storage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nodes = model.nodes;
                this.storage = model.storage;
            } 

            /**
             * <p>The node IDs.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The configuration of the automatic storage scaling feature for the instance.</p>
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
