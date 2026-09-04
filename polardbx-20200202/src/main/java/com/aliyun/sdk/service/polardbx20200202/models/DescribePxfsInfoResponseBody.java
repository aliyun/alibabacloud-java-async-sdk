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
 * {@link DescribePxfsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePxfsInfoResponseBody</p>
 */
public class DescribePxfsInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePxfsInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePxfsInfoResponseBody create() {
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

        private Builder(DescribePxfsInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>接口返回的业务数据。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>请求的唯一标识，可用于排查问题。</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePxfsInfoResponseBody build() {
            return new DescribePxfsInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePxfsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsInfoResponseBody</p>
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
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
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
     * {@link DescribePxfsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsInfoResponseBody</p>
     */
    public static class ConnAddrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("TlsEnabled")
        private Boolean tlsEnabled;

        @com.aliyun.core.annotation.NameInMap("Transport")
        private String transport;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private ConnAddrs(Builder builder) {
            this.connectionString = builder.connectionString;
            this.endpoint = builder.endpoint;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.tlsEnabled = builder.tlsEnabled;
            this.transport = builder.transport;
            this.type = builder.type;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
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
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return tlsEnabled
         */
        public Boolean getTlsEnabled() {
            return this.tlsEnabled;
        }

        /**
         * @return transport
         */
        public String getTransport() {
            return this.transport;
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

        public static final class Builder {
            private String connectionString; 
            private String endpoint; 
            private Integer port; 
            private String protocol; 
            private Boolean tlsEnabled; 
            private String transport; 
            private String type; 
            private String VPCId; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(ConnAddrs model) {
                this.connectionString = model.connectionString;
                this.endpoint = model.endpoint;
                this.port = model.port;
                this.protocol = model.protocol;
                this.tlsEnabled = model.tlsEnabled;
                this.transport = model.transport;
                this.type = model.type;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>客户端连接Agent文件服务使用的连接字符串。</p>
             * 
             * <strong>example:</strong>
             * <p>agent-files.example.com:12049</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>Agent文件服务的访问地址。</p>
             * 
             * <strong>example:</strong>
             * <p>agent-files.example.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>Agent文件服务的访问端口。</p>
             * 
             * <strong>example:</strong>
             * <p>12049</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>客户端访问Agent文件服务使用的协议。</p>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>客户端连接是否启用TLS。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tlsEnabled(Boolean tlsEnabled) {
                this.tlsEnabled = tlsEnabled;
                return this;
            }

            /**
             * <p>客户端连接使用的传输安全协议。</p>
             * 
             * <strong>example:</strong>
             * <p>TLS</p>
             */
            public Builder transport(String transport) {
                this.transport = transport;
                return this;
            }

            /**
             * <p>连接地址类型。</p>
             * 
             * <strong>example:</strong>
             * <p>Intranet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Agent文件服务所属专有网络的ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>Agent文件服务所属交换机的ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ConnAddrs build() {
                return new ConnAddrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePxfsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsInfoResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("PxfsInstanceId")
        private String pxfsInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instance(Builder builder) {
            this.classCode = builder.classCode;
            this.connAddrs = builder.connAddrs;
            this.createTime = builder.createTime;
            this.DBInstanceName = builder.DBInstanceName;
            this.instanceId = builder.instanceId;
            this.nodeCount = builder.nodeCount;
            this.pxfsInstanceId = builder.pxfsInstanceId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.version = builder.version;
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
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return pxfsInstanceId
         */
        public String getPxfsInstanceId() {
            return this.pxfsInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
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
            private Integer nodeCount; 
            private String pxfsInstanceId; 
            private String regionId; 
            private String status; 
            private Long storageSize; 
            private String storageType; 
            private String VPCId; 
            private String vSwitchId; 
            private String version; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.classCode = model.classCode;
                this.connAddrs = model.connAddrs;
                this.createTime = model.createTime;
                this.DBInstanceName = model.DBInstanceName;
                this.instanceId = model.instanceId;
                this.nodeCount = model.nodeCount;
                this.pxfsInstanceId = model.pxfsInstanceId;
                this.regionId = model.regionId;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.storageType = model.storageType;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.version = model.version;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Agent文件服务的节点规格代码。</p>
             * 
             * <strong>example:</strong>
             * <p>polarx.pxfs.x4.xlarge</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>Agent文件服务的连接地址列表。</p>
             */
            public Builder connAddrs(java.util.List<ConnAddrs> connAddrs) {
                this.connAddrs = connAddrs;
                return this;
            }

            /**
             * <p>资源的创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-03T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Agent文件服务关联的PolarDB-X实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-xxxxxxxx</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>Agent文件服务关联的PolarDB-X实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-xxxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Agent文件服务的节点数量。</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Agent文件服务实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>pxfs-xxxxxxxx</p>
             */
            public Builder pxfsInstanceId(String pxfsInstanceId) {
                this.pxfsInstanceId = pxfsInstanceId;
                return this;
            }

            /**
             * <p>Agent文件服务实例所属地域的ID。</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>当前资源状态。</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Agent文件服务的数据盘容量，单位为GiB。</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>Agent文件服务使用的存储类型。</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>Agent文件服务所属专有网络的ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>Agent文件服务所属交换机的ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>Agent文件服务当前运行版本。</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Agent文件服务实例所在可用区的ID。</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
     * {@link DescribePxfsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsInfoResponseBody</p>
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
             * <p>Agent文件服务实例的详细信息。</p>
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
