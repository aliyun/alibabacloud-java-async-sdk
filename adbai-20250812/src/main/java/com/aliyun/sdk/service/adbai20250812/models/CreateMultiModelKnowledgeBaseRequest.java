// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link CreateMultiModelKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>CreateMultiModelKnowledgeBaseRequest</p>
 */
public class CreateMultiModelKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdbInstanceName")
    private String adbInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbClusterAcu")
    private Integer dbClusterAcu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LakeStorageBucketName")
    private String lakeStorageBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAcuMax")
    private Integer resourceAcuMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAcuMin")
    private Integer resourceAcuMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateMultiModelKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.adbInstanceName = builder.adbInstanceName;
        this.DBClusterId = builder.DBClusterId;
        this.dbClusterAcu = builder.dbClusterAcu;
        this.lakeStorageBucketName = builder.lakeStorageBucketName;
        this.regionId = builder.regionId;
        this.resourceAcuMax = builder.resourceAcuMax;
        this.resourceAcuMin = builder.resourceAcuMin;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiModelKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adbInstanceName
     */
    public String getAdbInstanceName() {
        return this.adbInstanceName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dbClusterAcu
     */
    public Integer getDbClusterAcu() {
        return this.dbClusterAcu;
    }

    /**
     * @return lakeStorageBucketName
     */
    public String getLakeStorageBucketName() {
        return this.lakeStorageBucketName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceAcuMax
     */
    public Integer getResourceAcuMax() {
        return this.resourceAcuMax;
    }

    /**
     * @return resourceAcuMin
     */
    public Integer getResourceAcuMin() {
        return this.resourceAcuMin;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateMultiModelKnowledgeBaseRequest, Builder> {
        private String adbInstanceName; 
        private String DBClusterId; 
        private Integer dbClusterAcu; 
        private String lakeStorageBucketName; 
        private String regionId; 
        private Integer resourceAcuMax; 
        private Integer resourceAcuMin; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultiModelKnowledgeBaseRequest request) {
            super(request);
            this.adbInstanceName = request.adbInstanceName;
            this.DBClusterId = request.DBClusterId;
            this.dbClusterAcu = request.dbClusterAcu;
            this.lakeStorageBucketName = request.lakeStorageBucketName;
            this.regionId = request.regionId;
            this.resourceAcuMax = request.resourceAcuMax;
            this.resourceAcuMin = request.resourceAcuMin;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AdbInstanceName.
         */
        public Builder adbInstanceName(String adbInstanceName) {
            this.putQueryParameter("AdbInstanceName", adbInstanceName);
            this.adbInstanceName = adbInstanceName;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DbClusterAcu.
         */
        public Builder dbClusterAcu(Integer dbClusterAcu) {
            this.putQueryParameter("DbClusterAcu", dbClusterAcu);
            this.dbClusterAcu = dbClusterAcu;
            return this;
        }

        /**
         * LakeStorageBucketName.
         */
        public Builder lakeStorageBucketName(String lakeStorageBucketName) {
            this.putQueryParameter("LakeStorageBucketName", lakeStorageBucketName);
            this.lakeStorageBucketName = lakeStorageBucketName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceAcuMax.
         */
        public Builder resourceAcuMax(Integer resourceAcuMax) {
            this.putQueryParameter("ResourceAcuMax", resourceAcuMax);
            this.resourceAcuMax = resourceAcuMax;
            return this;
        }

        /**
         * ResourceAcuMin.
         */
        public Builder resourceAcuMin(Integer resourceAcuMin) {
            this.putQueryParameter("ResourceAcuMin", resourceAcuMin);
            this.resourceAcuMin = resourceAcuMin;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
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
        public CreateMultiModelKnowledgeBaseRequest build() {
            return new CreateMultiModelKnowledgeBaseRequest(this);
        } 

    } 

}
