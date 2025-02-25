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
 * {@link CreateApsDatasoureRequest} extends {@link RequestModel}
 *
 * <p>CreateApsDatasoureRequest</p>
 */
public class CreateApsDatasoureRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatabricksInfo")
    private DatabricksInfo databricksInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceDescription")
    private String datasourceDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HiveInfo")
    private HiveInfo hiveInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KafkaInfo")
    private KafkaInfo kafkaInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolarDBMysqlInfo")
    private PolarDBMysqlInfo polarDBMysqlInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolarDBXInfo")
    private PolarDBXInfo polarDBXInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RdsMysqlInfo")
    private RdsMysqlInfo rdsMysqlInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlsInfo")
    private SlsInfo slsInfo;

    private CreateApsDatasoureRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.databricksInfo = builder.databricksInfo;
        this.datasourceDescription = builder.datasourceDescription;
        this.datasourceName = builder.datasourceName;
        this.datasourceType = builder.datasourceType;
        this.hiveInfo = builder.hiveInfo;
        this.kafkaInfo = builder.kafkaInfo;
        this.mode = builder.mode;
        this.polarDBMysqlInfo = builder.polarDBMysqlInfo;
        this.polarDBXInfo = builder.polarDBXInfo;
        this.rdsMysqlInfo = builder.rdsMysqlInfo;
        this.regionId = builder.regionId;
        this.slsInfo = builder.slsInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApsDatasoureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return polarDBMysqlInfo
     */
    public PolarDBMysqlInfo getPolarDBMysqlInfo() {
        return this.polarDBMysqlInfo;
    }

    /**
     * @return polarDBXInfo
     */
    public PolarDBXInfo getPolarDBXInfo() {
        return this.polarDBXInfo;
    }

    /**
     * @return rdsMysqlInfo
     */
    public RdsMysqlInfo getRdsMysqlInfo() {
        return this.rdsMysqlInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slsInfo
     */
    public SlsInfo getSlsInfo() {
        return this.slsInfo;
    }

    public static final class Builder extends Request.Builder<CreateApsDatasoureRequest, Builder> {
        private String DBClusterId; 
        private DatabricksInfo databricksInfo; 
        private String datasourceDescription; 
        private String datasourceName; 
        private String datasourceType; 
        private HiveInfo hiveInfo; 
        private KafkaInfo kafkaInfo; 
        private String mode; 
        private PolarDBMysqlInfo polarDBMysqlInfo; 
        private PolarDBXInfo polarDBXInfo; 
        private RdsMysqlInfo rdsMysqlInfo; 
        private String regionId; 
        private SlsInfo slsInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateApsDatasoureRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.databricksInfo = request.databricksInfo;
            this.datasourceDescription = request.datasourceDescription;
            this.datasourceName = request.datasourceName;
            this.datasourceType = request.datasourceType;
            this.hiveInfo = request.hiveInfo;
            this.kafkaInfo = request.kafkaInfo;
            this.mode = request.mode;
            this.polarDBMysqlInfo = request.polarDBMysqlInfo;
            this.polarDBXInfo = request.polarDBXInfo;
            this.rdsMysqlInfo = request.rdsMysqlInfo;
            this.regionId = request.regionId;
            this.slsInfo = request.slsInfo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-xxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DatabricksInfo.
         */
        public Builder databricksInfo(DatabricksInfo databricksInfo) {
            String databricksInfoShrink = shrink(databricksInfo, "DatabricksInfo", "json");
            this.putBodyParameter("DatabricksInfo", databricksInfoShrink);
            this.databricksInfo = databricksInfo;
            return this;
        }

        /**
         * DatasourceDescription.
         */
        public Builder datasourceDescription(String datasourceDescription) {
            this.putBodyParameter("DatasourceDescription", datasourceDescription);
            this.datasourceDescription = datasourceDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-******</p>
         */
        public Builder datasourceName(String datasourceName) {
            this.putBodyParameter("DatasourceName", datasourceName);
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KAFKA</p>
         */
        public Builder datasourceType(String datasourceType) {
            this.putBodyParameter("DatasourceType", datasourceType);
            this.datasourceType = datasourceType;
            return this;
        }

        /**
         * HiveInfo.
         */
        public Builder hiveInfo(HiveInfo hiveInfo) {
            String hiveInfoShrink = shrink(hiveInfo, "HiveInfo", "json");
            this.putBodyParameter("HiveInfo", hiveInfoShrink);
            this.hiveInfo = hiveInfo;
            return this;
        }

        /**
         * KafkaInfo.
         */
        public Builder kafkaInfo(KafkaInfo kafkaInfo) {
            String kafkaInfoShrink = shrink(kafkaInfo, "KafkaInfo", "json");
            this.putBodyParameter("KafkaInfo", kafkaInfoShrink);
            this.kafkaInfo = kafkaInfo;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * PolarDBMysqlInfo.
         */
        public Builder polarDBMysqlInfo(PolarDBMysqlInfo polarDBMysqlInfo) {
            String polarDBMysqlInfoShrink = shrink(polarDBMysqlInfo, "PolarDBMysqlInfo", "json");
            this.putBodyParameter("PolarDBMysqlInfo", polarDBMysqlInfoShrink);
            this.polarDBMysqlInfo = polarDBMysqlInfo;
            return this;
        }

        /**
         * PolarDBXInfo.
         */
        public Builder polarDBXInfo(PolarDBXInfo polarDBXInfo) {
            String polarDBXInfoShrink = shrink(polarDBXInfo, "PolarDBXInfo", "json");
            this.putBodyParameter("PolarDBXInfo", polarDBXInfoShrink);
            this.polarDBXInfo = polarDBXInfo;
            return this;
        }

        /**
         * RdsMysqlInfo.
         */
        public Builder rdsMysqlInfo(RdsMysqlInfo rdsMysqlInfo) {
            String rdsMysqlInfoShrink = shrink(rdsMysqlInfo, "RdsMysqlInfo", "json");
            this.putBodyParameter("RdsMysqlInfo", rdsMysqlInfoShrink);
            this.rdsMysqlInfo = rdsMysqlInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SlsInfo.
         */
        public Builder slsInfo(SlsInfo slsInfo) {
            String slsInfoShrink = shrink(slsInfo, "SlsInfo", "json");
            this.putBodyParameter("SlsInfo", slsInfoShrink);
            this.slsInfo = slsInfo;
            return this;
        }

        @Override
        public CreateApsDatasoureRequest build() {
            return new CreateApsDatasoureRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>CreateApsDatasoureRequest</p>
     */
    public static class DatabricksInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("WorkspaceURL")
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

            /**
             * AccessToken.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * WorkspaceURL.
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
     * {@link CreateApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>CreateApsDatasoureRequest</p>
     */
    public static class HiveInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("HostConfig")
        private String hostConfig;

        @com.aliyun.core.annotation.NameInMap("MetaStoreUri")
        private String metaStoreUri;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private String vswitch;

        private HiveInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.hostConfig = builder.hostConfig;
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
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return hostConfig
         */
        public String getHostConfig() {
            return this.hostConfig;
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
            private String clusterId; 
            private String hostConfig; 
            private String metaStoreUri; 
            private String securityGroup; 
            private String vswitch; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * HostConfig.
             */
            public Builder hostConfig(String hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * MetaStoreUri.
             */
            public Builder metaStoreUri(String metaStoreUri) {
                this.metaStoreUri = metaStoreUri;
                return this;
            }

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * Vswitch.
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
     * {@link CreateApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>CreateApsDatasoureRequest</p>
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

            /**
             * KafkaClusterId.
             */
            public Builder kafkaClusterId(String kafkaClusterId) {
                this.kafkaClusterId = kafkaClusterId;
                return this;
            }

            /**
             * KafkaTopic.
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
     * {@link CreateApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>CreateApsDatasoureRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

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
            this.password = builder.password;
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
         * @return password
         */
        public String getPassword() {
            return this.password;
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
            private String password; 
            private String regionId; 
            private String securityGroup; 
            private String userName; 

            /**
             * Across.
             */
            public Builder across(Boolean across) {
                this.across = across;
                return this;
            }

            /**
             * AcrossRole.
             */
            public Builder acrossRole(String acrossRole) {
                this.acrossRole = acrossRole;
                return this;
            }

            /**
             * AcrossUid.
             */
            public Builder acrossUid(String acrossUid) {
                this.acrossUid = acrossUid;
                return this;
            }

            /**
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * UserName.
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
     * {@link CreateApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>CreateApsDatasoureRequest</p>
     */
    public static class PolarDBXInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private PolarDBXInfo(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolarDBXInfo create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public PolarDBXInfo build() {
                return new PolarDBXInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>CreateApsDatasoureRequest</p>
     */
    public static class RdsMysqlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private RdsMysqlInfo(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.instanceId = builder.instanceId;
            this.password = builder.password;
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
         * @return password
         */
        public String getPassword() {
            return this.password;
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
            private String password; 
            private String regionId; 
            private String securityGroup; 
            private String userName; 

            /**
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * UserName.
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
     * {@link CreateApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>CreateApsDatasoureRequest</p>
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

            /**
             * Across.
             */
            public Builder across(Boolean across) {
                this.across = across;
                return this;
            }

            /**
             * AcrossRole.
             */
            public Builder acrossRole(String acrossRole) {
                this.acrossRole = acrossRole;
                return this;
            }

            /**
             * AcrossUid.
             */
            public Builder acrossUid(String acrossUid) {
                this.acrossUid = acrossUid;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * SourceRegionId.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * <p>sls logstore。</p>
             * 
             * <strong>example:</strong>
             * <p>test-store</p>
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
}
