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
 * {@link ModifyApsDatasoureRequest} extends {@link RequestModel}
 *
 * <p>ModifyApsDatasoureRequest</p>
 */
public class ModifyApsDatasoureRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceDescription")
    private String datasourceDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long datasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceName")
    private String datasourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KafkaInfo")
    private KafkaInfo kafkaInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LakehouseId")
    private LakehouseId lakehouseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolarDBMysqlInfo")
    private PolarDBMysqlInfo polarDBMysqlInfo;

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

    private ModifyApsDatasoureRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasourceDescription = builder.datasourceDescription;
        this.datasourceId = builder.datasourceId;
        this.datasourceName = builder.datasourceName;
        this.kafkaInfo = builder.kafkaInfo;
        this.lakehouseId = builder.lakehouseId;
        this.polarDBMysqlInfo = builder.polarDBMysqlInfo;
        this.rdsMysqlInfo = builder.rdsMysqlInfo;
        this.regionId = builder.regionId;
        this.slsInfo = builder.slsInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApsDatasoureRequest create() {
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
     * @return datasourceDescription
     */
    public String getDatasourceDescription() {
        return this.datasourceDescription;
    }

    /**
     * @return datasourceId
     */
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return datasourceName
     */
    public String getDatasourceName() {
        return this.datasourceName;
    }

    /**
     * @return kafkaInfo
     */
    public KafkaInfo getKafkaInfo() {
        return this.kafkaInfo;
    }

    /**
     * @return lakehouseId
     */
    public LakehouseId getLakehouseId() {
        return this.lakehouseId;
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

    public static final class Builder extends Request.Builder<ModifyApsDatasoureRequest, Builder> {
        private String DBClusterId; 
        private String datasourceDescription; 
        private Long datasourceId; 
        private String datasourceName; 
        private KafkaInfo kafkaInfo; 
        private LakehouseId lakehouseId; 
        private PolarDBMysqlInfo polarDBMysqlInfo; 
        private RdsMysqlInfo rdsMysqlInfo; 
        private String regionId; 
        private SlsInfo slsInfo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApsDatasoureRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasourceDescription = request.datasourceDescription;
            this.datasourceId = request.datasourceId;
            this.datasourceName = request.datasourceName;
            this.kafkaInfo = request.kafkaInfo;
            this.lakehouseId = request.lakehouseId;
            this.polarDBMysqlInfo = request.polarDBMysqlInfo;
            this.rdsMysqlInfo = request.rdsMysqlInfo;
            this.regionId = request.regionId;
            this.slsInfo = request.slsInfo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * <p>1</p>
         */
        public Builder datasourceId(Long datasourceId) {
            this.putBodyParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * DatasourceName.
         */
        public Builder datasourceName(String datasourceName) {
            this.putBodyParameter("DatasourceName", datasourceName);
            this.datasourceName = datasourceName;
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
        public Builder kafkaInfo(KafkaInfo kafkaInfo) {
            String kafkaInfoShrink = shrink(kafkaInfo, "KafkaInfo", "json");
            this.putBodyParameter("KafkaInfo", kafkaInfoShrink);
            this.kafkaInfo = kafkaInfo;
            return this;
        }

        /**
         * <p>Lakehouse ID。</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder lakehouseId(LakehouseId lakehouseId) {
            String lakehouseIdShrink = shrink(lakehouseId, "LakehouseId", "json");
            this.putBodyParameter("LakehouseId", lakehouseIdShrink);
            this.lakehouseId = lakehouseId;
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
        public ModifyApsDatasoureRequest build() {
            return new ModifyApsDatasoureRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>ModifyApsDatasoureRequest</p>
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
     * {@link ModifyApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>ModifyApsDatasoureRequest</p>
     */
    public static class LakehouseId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private String vswitch;

        private LakehouseId(Builder builder) {
            this.securityGroup = builder.securityGroup;
            this.vpcId = builder.vpcId;
            this.vswitch = builder.vswitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LakehouseId create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitch
         */
        public String getVswitch() {
            return this.vswitch;
        }

        public static final class Builder {
            private String securityGroup; 
            private String vpcId; 
            private String vswitch; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <p>vpc id。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-******</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * Vswitch.
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            public LakehouseId build() {
                return new LakehouseId(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>ModifyApsDatasoureRequest</p>
     */
    public static class PolarDBMysqlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private PolarDBMysqlInfo(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.password = builder.password;
            this.regionId = builder.regionId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolarDBMysqlInfo create() {
            return builder().build();
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String connectUrl; 
            private String password; 
            private String regionId; 
            private String userName; 

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
            public Builder password(String password) {
                this.password = password;
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
     * {@link ModifyApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>ModifyApsDatasoureRequest</p>
     */
    public static class RdsMysqlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private RdsMysqlInfo(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.password = builder.password;
            this.regionId = builder.regionId;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String connectUrl; 
            private String password; 
            private String regionId; 
            private String userName; 

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
            public Builder password(String password) {
                this.password = password;
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
     * {@link ModifyApsDatasoureRequest} extends {@link TeaModel}
     *
     * <p>ModifyApsDatasoureRequest</p>
     */
    public static class SlsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Across")
        private Boolean across;

        @com.aliyun.core.annotation.NameInMap("AcrossRole")
        private String acrossRole;

        @com.aliyun.core.annotation.NameInMap("AcrossUid")
        private String acrossUid;

        @com.aliyun.core.annotation.NameInMap("SourceRegionId")
        private String sourceRegionId;

        private SlsInfo(Builder builder) {
            this.across = builder.across;
            this.acrossRole = builder.acrossRole;
            this.acrossUid = builder.acrossUid;
            this.sourceRegionId = builder.sourceRegionId;
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
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public static final class Builder {
            private Boolean across; 
            private String acrossRole; 
            private String acrossUid; 
            private String sourceRegionId; 

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
             * SourceRegionId.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            public SlsInfo build() {
                return new SlsInfo(this);
            } 

        } 

    }
}
