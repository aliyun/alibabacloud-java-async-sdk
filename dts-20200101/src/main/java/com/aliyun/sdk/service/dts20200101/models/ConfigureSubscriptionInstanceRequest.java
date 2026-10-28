// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ConfigureSubscriptionInstanceRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSubscriptionInstanceRequest</p>
 */
public class ConfigureSubscriptionInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDataType")
    private SubscriptionDataType subscriptionDataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstance")
    private SubscriptionInstance subscriptionInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceName")
    private String subscriptionInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceNetworkType")
    private String subscriptionInstanceNetworkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubscriptionObject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionObject;

    private ConfigureSubscriptionInstanceRequest(Builder builder) {
        super(builder);
        this.sourceEndpoint = builder.sourceEndpoint;
        this.subscriptionDataType = builder.subscriptionDataType;
        this.subscriptionInstance = builder.subscriptionInstance;
        this.accountId = builder.accountId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
        this.subscriptionInstanceName = builder.subscriptionInstanceName;
        this.subscriptionInstanceNetworkType = builder.subscriptionInstanceNetworkType;
        this.subscriptionObject = builder.subscriptionObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSubscriptionInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return subscriptionDataType
     */
    public SubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    /**
     * @return subscriptionInstance
     */
    public SubscriptionInstance getSubscriptionInstance() {
        return this.subscriptionInstance;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    /**
     * @return subscriptionInstanceName
     */
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    /**
     * @return subscriptionInstanceNetworkType
     */
    public String getSubscriptionInstanceNetworkType() {
        return this.subscriptionInstanceNetworkType;
    }

    /**
     * @return subscriptionObject
     */
    public String getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static final class Builder extends Request.Builder<ConfigureSubscriptionInstanceRequest, Builder> {
        private SourceEndpoint sourceEndpoint; 
        private SubscriptionDataType subscriptionDataType; 
        private SubscriptionInstance subscriptionInstance; 
        private String accountId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subscriptionInstanceId; 
        private String subscriptionInstanceName; 
        private String subscriptionInstanceNetworkType; 
        private String subscriptionObject; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSubscriptionInstanceRequest request) {
            super(request);
            this.sourceEndpoint = request.sourceEndpoint;
            this.subscriptionDataType = request.subscriptionDataType;
            this.subscriptionInstance = request.subscriptionInstance;
            this.accountId = request.accountId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
            this.subscriptionInstanceName = request.subscriptionInstanceName;
            this.subscriptionInstanceNetworkType = request.subscriptionInstanceNetworkType;
            this.subscriptionObject = request.subscriptionObject;
        } 

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * SubscriptionDataType.
         */
        public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
            this.putQueryParameter("SubscriptionDataType", subscriptionDataType);
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }

        /**
         * SubscriptionInstance.
         */
        public Builder subscriptionInstance(SubscriptionInstance subscriptionInstance) {
            this.putQueryParameter("SubscriptionInstance", subscriptionInstance);
            this.subscriptionInstance = subscriptionInstance;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because it will be deprecated soon.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region where the change tracking instance resides. For more information, see
         * <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/49442.html">DescribeSubscriptionInstances</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtshp8n2ze4r5x****</p>
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        /**
         * <p>The name of the change tracking instance.</p>
         * <blockquote>
         * <p>Specify a descriptive name for easy identification. The name does not need to be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL change tracking</p>
         */
        public Builder subscriptionInstanceName(String subscriptionInstanceName) {
            this.putQueryParameter("SubscriptionInstanceName", subscriptionInstanceName);
            this.subscriptionInstanceName = subscriptionInstanceName;
            return this;
        }

        /**
         * <p>The network type of the change tracking instance. Set the value to <strong>vpc</strong>, which specifies a virtual private cloud (VPC).</p>
         * <blockquote>
         * <ul>
         * <li>If you specify this parameter, the change tracking instance is defined as a new version instance, and you must also correctly set the <strong>SubscriptionInstance.VPCId</strong> and <strong>SubscriptionInstance.VSwitchID</strong> parameters. If you do not specify this parameter, the change tracking instance is defined as a legacy instance.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Legacy change tracking instances support tracking data from self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and DRDS instances. New version change tracking instances support tracking data from self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder subscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
            this.putQueryParameter("SubscriptionInstanceNetworkType", subscriptionInstanceNetworkType);
            this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
            return this;
        }

        /**
         * <p>The objects to be tracked. The value is a JSON string and supports specific regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141902.html">Configure the objects to be tracked</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{     &quot;DBName&quot;: &quot;dtstestdata&quot; }]</p>
         */
        public Builder subscriptionObject(String subscriptionObject) {
            this.putBodyParameter("SubscriptionObject", subscriptionObject);
            this.subscriptionObject = subscriptionObject;
            return this;
        }

        @Override
        public ConfigureSubscriptionInstanceRequest build() {
            return new ConfigureSubscriptionInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigureSubscriptionInstanceRequest} extends {@link TeaModel}
     *
     * <p>ConfigureSubscriptionInstanceRequest</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("OwnerID")
        private String ownerID;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.ip = builder.ip;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.oracleSID = builder.oracleSID;
            this.ownerID = builder.ownerID;
            this.password = builder.password;
            this.port = builder.port;
            this.role = builder.role;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return ownerID
         */
        public String getOwnerID() {
            return this.ownerID;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String ip; 
            private String instanceID; 
            private String instanceType; 
            private String oracleSID; 
            private String ownerID; 
            private String password; 
            private String port; 
            private String role; 
            private String userName; 

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.databaseName = model.databaseName;
                this.ip = model.ip;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.oracleSID = model.oracleSID;
                this.ownerID = model.ownerID;
                this.password = model.password;
                this.port = model.port;
                this.role = model.role;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database to be tracked.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The endpoint of the source database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the source database is a self-managed database.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The instance ID of the source instance.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the source database is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1zc3iyqe3qw****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The instance type of the source database. Valid values:</p>
             * <ul>
             * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL.</li>
             * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
             * <li><strong>LocalInstance</strong>: a self-managed database with a public IP address.</li>
             * <li><strong>ECS</strong>: a self-managed database hosted on an ECS instance.</li>
             * <li><strong>Express</strong>: a self-managed database connected over an Express Connect circuit.</li>
             * <li><strong>CEN</strong>: a self-managed database connected over a Cloud Enterprise Network (CEN) instance.</li>
             * <li><strong>dg</strong>: a self-managed database connected over a database gateway.</li>
             * </ul>
             * <blockquote>
             * <p>Self-managed MySQL and Oracle databases are supported. You must call the <a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a> operation to configure the database type in advance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The system ID (SID) of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the source database is a self-managed Oracle database and the Oracle database is not a Real Application Clusters (RAC) instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the source instance.</p>
             * <blockquote>
             * <p>This parameter is available and required only when you configure change tracking across Alibaba Cloud accounts.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * <p>The password of the database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The service port number of the source database.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the source database is a self-managed database.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The RAM role that is authorized to access the source instance. If the source instance and the change tracking task belong to different Alibaba Cloud accounts, you must specify this parameter to authorize the Alibaba Cloud account that owns the change tracking task to access the source instance.</p>
             * <blockquote>
             * <p>For more information about the required permissions and authorization methods for the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The database account of the source instance.</p>
             * <blockquote>
             * <p>The required permissions vary based on the database to be tracked. For more information, see the corresponding configuration examples in <a href="https://help.aliyun.com/document_detail/145715.html">Overview of DTS change tracking solutions</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dtstestaccount</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigureSubscriptionInstanceRequest} extends {@link TeaModel}
     *
     * <p>ConfigureSubscriptionInstanceRequest</p>
     */
    public static class SubscriptionDataType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DDL")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean DDL;

        @com.aliyun.core.annotation.NameInMap("DML")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean DML;

        private SubscriptionDataType(Builder builder) {
            this.DDL = builder.DDL;
            this.DML = builder.DML;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return DDL
         */
        public Boolean getDDL() {
            return this.DDL;
        }

        /**
         * @return DML
         */
        public Boolean getDML() {
            return this.DML;
        }

        public static final class Builder {
            private Boolean DDL; 
            private Boolean DML; 

            private Builder() {
            } 

            private Builder(SubscriptionDataType model) {
                this.DDL = model.DDL;
                this.DML = model.DML;
            } 

            /**
             * <p>Specifies whether to track data definition language (DDL) operations. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes. This is the default value.</li>
             * <li><strong>false</strong>: no.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder DDL(Boolean DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * <p>Specifies whether to track data manipulation language (DML) operations. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes. This is the default value.</li>
             * <li><strong>false</strong>: no.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder DML(Boolean DML) {
                this.DML = DML;
                return this;
            }

            public SubscriptionDataType build() {
                return new SubscriptionDataType(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigureSubscriptionInstanceRequest} extends {@link TeaModel}
     *
     * <p>ConfigureSubscriptionInstanceRequest</p>
     */
    public static class SubscriptionInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private SubscriptionInstance(Builder builder) {
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionInstance create() {
            return builder().build();
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
            private String VPCId; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(SubscriptionInstance model) {
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The VPC ID of the change tracking instance.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>SubscriptionInstanceNetworkType</strong> is set to <strong>vpc</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1vwnn14rqpyiczj****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the change tracking instance.</p>
             * <blockquote>
             * <p>This parameter is available and required only when <strong>SubscriptionInstanceNetworkType</strong> is set to <strong>vpc</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp10df3mxae6lpmku****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public SubscriptionInstance build() {
                return new SubscriptionInstance(this);
            } 

        } 

    }
}
