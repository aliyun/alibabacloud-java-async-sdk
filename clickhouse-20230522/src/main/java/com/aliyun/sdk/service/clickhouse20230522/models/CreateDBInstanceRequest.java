// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiZone")
    private java.util.List < MultiZone> multiZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private String scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private String scaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.multiZone = builder.multiZone;
        this.regionId = builder.regionId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return multiZone
     */
    public java.util.List < MultiZone> getMultiZone() {
        return this.multiZone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private String clientToken; 
        private String DBInstanceDescription; 
        private String engine; 
        private String engineVersion; 
        private java.util.List < MultiZone> multiZone; 
        private String regionId; 
        private String scaleMax; 
        private String scaleMin; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.multiZone = request.multiZone;
            this.regionId = request.regionId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBInstanceDescription.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * MultiZone.
         */
        public Builder multiZone(java.util.List < MultiZone> multiZone) {
            String multiZoneShrink = shrink(multiZone, "MultiZone", "json");
            this.putQueryParameter("MultiZone", multiZoneShrink);
            this.multiZone = multiZone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * ScaleMax.
         */
        public Builder scaleMax(String scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * ScaleMin.
         */
        public Builder scaleMin(String scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6xmupdn7v6ui9f****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
    public static class MultiZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private MultiZone(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiZone create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < String > vSwitchIds; 
            private String zoneId; 

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MultiZone build() {
                return new MultiZone(this);
            } 

        } 

    }
}
