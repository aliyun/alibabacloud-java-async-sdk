// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsDatasourceResponseBody</p>
 */
public class DescribeApsDatasourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApsDatasource")
    private ApsDatasource apsDatasource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApsDatasourceResponseBody(Builder builder) {
        this.apsDatasource = builder.apsDatasource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsDatasourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apsDatasource
     */
    public ApsDatasource getApsDatasource() {
        return this.apsDatasource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApsDatasource apsDatasource; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApsDatasourceResponseBody model) {
            this.apsDatasource = model.apsDatasource;
            this.requestId = model.requestId;
        } 

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder apsDatasource(ApsDatasource apsDatasource) {
            this.apsDatasource = apsDatasource;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>******-<strong>D8-5</strong><em>-A</em>**-****587</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApsDatasourceResponseBody build() {
            return new DescribeApsDatasourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourceResponseBody</p>
     */
    public static class DatabricksInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("workspaceURL")
        private String workspaceURL;

        private DatabricksInfo(Builder builder) {
            this.accessToken = builder.accessToken;
            this.workspaceURL = builder.workspaceURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabricksInfo create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return workspaceURL
         */
        public String getWorkspaceURL() {
            return this.workspaceURL;
        }

        public static final class Builder {
            private String accessToken; 
            private String workspaceURL; 

            private Builder() {
            } 

            private Builder(DatabricksInfo model) {
                this.accessToken = model.accessToken;
                this.workspaceURL = model.workspaceURL;
            } 

            /**
             * <p>The token that is used to access Databricks.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>The URL of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder workspaceURL(String workspaceURL) {
                this.workspaceURL = workspaceURL;
                return this;
            }

            public DatabricksInfo build() {
                return new DatabricksInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourceResponseBody</p>
     */
    public static class HiveInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmrClusterId")
        private String emrClusterId;

        @com.aliyun.core.annotation.NameInMap("MetaStoreUri")
        private String metaStoreUri;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private String vswitch;

        private HiveInfo(Builder builder) {
            this.emrClusterId = builder.emrClusterId;
            this.metaStoreUri = builder.metaStoreUri;
            this.securityGroup = builder.securityGroup;
            this.vswitch = builder.vswitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HiveInfo create() {
            return builder().build();
        }

        /**
         * @return emrClusterId
         */
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        /**
         * @return metaStoreUri
         */
        public String getMetaStoreUri() {
            return this.metaStoreUri;
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return vswitch
         */
        public String getVswitch() {
            return this.vswitch;
        }

        public static final class Builder {
            private String emrClusterId; 
            private String metaStoreUri; 
            private String securityGroup; 
            private String vswitch; 

            private Builder() {
            } 

            private Builder(HiveInfo model) {
                this.emrClusterId = model.emrClusterId;
                this.metaStoreUri = model.metaStoreUri;
                this.securityGroup = model.securityGroup;
                this.vswitch = model.vswitch;
            } 

            /**
             * <p>The ID of the E-MapReduce (EMR) cluster.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder emrClusterId(String emrClusterId) {
                this.emrClusterId = emrClusterId;
                return this;
            }

            /**
             * <p>The URL of the Hive Metastore.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder metaStoreUri(String metaStoreUri) {
                this.metaStoreUri = metaStoreUri;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-******</p>
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-******</p>
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            public HiveInfo build() {
                return new HiveInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourceResponseBody</p>
     */
    public static class KafkaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KafkaClusterId")
        private String kafkaClusterId;

        @com.aliyun.core.annotation.NameInMap("KafkaTopic")
        private String kafkaTopic;

        private KafkaInfo(Builder builder) {
            this.kafkaClusterId = builder.kafkaClusterId;
            this.kafkaTopic = builder.kafkaTopic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KafkaInfo create() {
            return builder().build();
        }

        /**
         * @return kafkaClusterId
         */
        public String getKafkaClusterId() {
            return this.kafkaClusterId;
        }

        /**
         * @return kafkaTopic
         */
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

        public static final class Builder {
            private String kafkaClusterId; 
            private String kafkaTopic; 

            private Builder() {
            } 

            private Builder(KafkaInfo model) {
                this.kafkaClusterId = model.kafkaClusterId;
                this.kafkaTopic = model.kafkaTopic;
            } 

            /**
             * <p>The ID of the Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder kafkaClusterId(String kafkaClusterId) {
                this.kafkaClusterId = kafkaClusterId;
                return this;
            }

            /**
             * <p>The topic of the Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;value&quot;: &quot;hongxian_test&quot;}]</p>
             */
            public Builder kafkaTopic(String kafkaTopic) {
                this.kafkaTopic = kafkaTopic;
                return this;
            }

            public KafkaInfo build() {
                return new KafkaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourceResponseBody</p>
     */
    public static class PolarDBMysqlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Across")
        private Boolean across;

        @com.aliyun.core.annotation.NameInMap("AcrossRole")
        private String acrossRole;

        @com.aliyun.core.annotation.NameInMap("AcrossUid")
        private String acrossUid;

        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private PolarDBMysqlInfo(Builder builder) {
            this.across = builder.across;
            this.acrossRole = builder.acrossRole;
            this.acrossUid = builder.acrossUid;
            this.connectUrl = builder.connectUrl;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.securityGroup = builder.securityGroup;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolarDBMysqlInfo create() {
            return builder().build();
        }

        /**
         * @return across
         */
        public Boolean getAcross() {
            return this.across;
        }

        /**
         * @return acrossRole
         */
        public String getAcrossRole() {
            return this.acrossRole;
        }

        /**
         * @return acrossUid
         */
        public String getAcrossUid() {
            return this.acrossUid;
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Boolean across; 
            private String acrossRole; 
            private String acrossUid; 
            private String connectUrl; 
            private String instanceId; 
            private String regionId; 
            private String securityGroup; 
            private String userName; 

            private Builder() {
            } 

            private Builder(PolarDBMysqlInfo model) {
                this.across = model.across;
                this.acrossRole = model.acrossRole;
                this.acrossUid = model.acrossUid;
                this.connectUrl = model.connectUrl;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.securityGroup = model.securityGroup;
                this.userName = model.userName;
            } 

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder across(Boolean across) {
                this.across = across;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder acrossRole(String acrossRole) {
                this.acrossRole = acrossRole;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder acrossUid(String acrossUid) {
                this.acrossUid = acrossUid;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public PolarDBMysqlInfo build() {
                return new PolarDBMysqlInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourceResponseBody</p>
     */
    public static class RdsMysqlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private RdsMysqlInfo(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.securityGroup = builder.securityGroup;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsMysqlInfo create() {
            return builder().build();
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String connectUrl; 
            private String instanceId; 
            private String regionId; 
            private String securityGroup; 
            private String userName; 

            private Builder() {
            } 

            private Builder(RdsMysqlInfo model) {
                this.connectUrl = model.connectUrl;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.securityGroup = model.securityGroup;
                this.userName = model.userName;
            } 

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public RdsMysqlInfo build() {
                return new RdsMysqlInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourceResponseBody</p>
     */
    public static class SlsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Across")
        private Boolean across;

        @com.aliyun.core.annotation.NameInMap("AcrossRole")
        private String acrossRole;

        @com.aliyun.core.annotation.NameInMap("AcrossUid")
        private String acrossUid;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("SourceRegionId")
        private String sourceRegionId;

        @com.aliyun.core.annotation.NameInMap("Store")
        private String store;

        private SlsInfo(Builder builder) {
            this.across = builder.across;
            this.acrossRole = builder.acrossRole;
            this.acrossUid = builder.acrossUid;
            this.project = builder.project;
            this.sourceRegionId = builder.sourceRegionId;
            this.store = builder.store;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsInfo create() {
            return builder().build();
        }

        /**
         * @return across
         */
        public Boolean getAcross() {
            return this.across;
        }

        /**
         * @return acrossRole
         */
        public String getAcrossRole() {
            return this.acrossRole;
        }

        /**
         * @return acrossUid
         */
        public String getAcrossUid() {
            return this.acrossUid;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        /**
         * @return store
         */
        public String getStore() {
            return this.store;
        }

        public static final class Builder {
            private Boolean across; 
            private String acrossRole; 
            private String acrossUid; 
            private String project; 
            private String sourceRegionId; 
            private String store; 

            private Builder() {
            } 

            private Builder(SlsInfo model) {
                this.across = model.across;
                this.acrossRole = model.acrossRole;
                this.acrossUid = model.acrossUid;
                this.project = model.project;
                this.sourceRegionId = model.sourceRegionId;
                this.store = model.store;
            } 

            /**
             * <p>Indicates whether the data source is a cross-account resource. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder across(Boolean across) {
                this.across = across;
                return this;
            }

            /**
             * <p>The name of the cross-account role.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder acrossRole(String acrossRole) {
                this.acrossRole = acrossRole;
                return this;
            }

            /**
             * <p>The cross-account UID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder acrossUid(String acrossUid) {
                this.acrossUid = acrossUid;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * <p>The name of the SLS Logstore.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder store(String store) {
                this.store = store;
                return this;
            }

            public SlsInfo build() {
                return new SlsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApsDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourceResponseBody</p>
     */
    public static class ApsDatasource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DatabricksInfo")
        private DatabricksInfo databricksInfo;

        @com.aliyun.core.annotation.NameInMap("DatasourceDescription")
        private String datasourceDescription;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        private String datasourceType;

        @com.aliyun.core.annotation.NameInMap("HiveInfo")
        private HiveInfo hiveInfo;

        @com.aliyun.core.annotation.NameInMap("KafkaInfo")
        private KafkaInfo kafkaInfo;

        @com.aliyun.core.annotation.NameInMap("PolarDBMysqlInfo")
        private PolarDBMysqlInfo polarDBMysqlInfo;

        @com.aliyun.core.annotation.NameInMap("RdsMysqlInfo")
        private RdsMysqlInfo rdsMysqlInfo;

        @com.aliyun.core.annotation.NameInMap("SlsInfo")
        private SlsInfo slsInfo;

        private ApsDatasource(Builder builder) {
            this.createTime = builder.createTime;
            this.DBClusterId = builder.DBClusterId;
            this.databricksInfo = builder.databricksInfo;
            this.datasourceDescription = builder.datasourceDescription;
            this.datasourceName = builder.datasourceName;
            this.datasourceType = builder.datasourceType;
            this.hiveInfo = builder.hiveInfo;
            this.kafkaInfo = builder.kafkaInfo;
            this.polarDBMysqlInfo = builder.polarDBMysqlInfo;
            this.rdsMysqlInfo = builder.rdsMysqlInfo;
            this.slsInfo = builder.slsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApsDatasource create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return databricksInfo
         */
        public DatabricksInfo getDatabricksInfo() {
            return this.databricksInfo;
        }

        /**
         * @return datasourceDescription
         */
        public String getDatasourceDescription() {
            return this.datasourceDescription;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return hiveInfo
         */
        public HiveInfo getHiveInfo() {
            return this.hiveInfo;
        }

        /**
         * @return kafkaInfo
         */
        public KafkaInfo getKafkaInfo() {
            return this.kafkaInfo;
        }

        /**
         * @return polarDBMysqlInfo
         */
        public PolarDBMysqlInfo getPolarDBMysqlInfo() {
            return this.polarDBMysqlInfo;
        }

        /**
         * @return rdsMysqlInfo
         */
        public RdsMysqlInfo getRdsMysqlInfo() {
            return this.rdsMysqlInfo;
        }

        /**
         * @return slsInfo
         */
        public SlsInfo getSlsInfo() {
            return this.slsInfo;
        }

        public static final class Builder {
            private String createTime; 
            private String DBClusterId; 
            private DatabricksInfo databricksInfo; 
            private String datasourceDescription; 
            private String datasourceName; 
            private String datasourceType; 
            private HiveInfo hiveInfo; 
            private KafkaInfo kafkaInfo; 
            private PolarDBMysqlInfo polarDBMysqlInfo; 
            private RdsMysqlInfo rdsMysqlInfo; 
            private SlsInfo slsInfo; 

            private Builder() {
            } 

            private Builder(ApsDatasource model) {
                this.createTime = model.createTime;
                this.DBClusterId = model.DBClusterId;
                this.databricksInfo = model.databricksInfo;
                this.datasourceDescription = model.datasourceDescription;
                this.datasourceName = model.datasourceName;
                this.datasourceType = model.datasourceType;
                this.hiveInfo = model.hiveInfo;
                this.kafkaInfo = model.kafkaInfo;
                this.polarDBMysqlInfo = model.polarDBMysqlInfo;
                this.rdsMysqlInfo = model.rdsMysqlInfo;
                this.slsInfo = model.slsInfo;
            } 

            /**
             * <p>The time when the data source was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-12T15:03:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-******</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The information about Databricks.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder databricksInfo(DatabricksInfo databricksInfo) {
                this.databricksInfo = databricksInfo;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder datasourceDescription(String datasourceDescription) {
                this.datasourceDescription = datasourceDescription;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka-2024***</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>KAFKA</p>
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * <p>The information about the Hive data source.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder hiveInfo(HiveInfo hiveInfo) {
                this.hiveInfo = hiveInfo;
                return this;
            }

            /**
             * <p>The information about the Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder kafkaInfo(KafkaInfo kafkaInfo) {
                this.kafkaInfo = kafkaInfo;
                return this;
            }

            /**
             * <p>The parameter is no longer supported.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder polarDBMysqlInfo(PolarDBMysqlInfo polarDBMysqlInfo) {
                this.polarDBMysqlInfo = polarDBMysqlInfo;
                return this;
            }

            /**
             * <p>The parameter is no longer supported.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder rdsMysqlInfo(RdsMysqlInfo rdsMysqlInfo) {
                this.rdsMysqlInfo = rdsMysqlInfo;
                return this;
            }

            /**
             * <p>The Simple Log Service (SLS) project.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder slsInfo(SlsInfo slsInfo) {
                this.slsInfo = slsInfo;
                return this;
            }

            public ApsDatasource build() {
                return new ApsDatasource(this);
            } 

        } 

    }
}
