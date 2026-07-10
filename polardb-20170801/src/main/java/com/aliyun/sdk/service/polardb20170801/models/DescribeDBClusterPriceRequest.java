// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterPriceRequest</p>
 */
public class DescribeDBClusterPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationCategory")
    private String creationCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeIds")
    private java.util.List<String> DBNodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeNum")
    private Integer DBNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodes")
    private java.util.List<DBNodes> DBNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotStandbyCluster")
    private String hotStandbyCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private String provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessType")
    private String serverlessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageChargeType")
    private String storageChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    private String storageSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeDBClusterPriceRequest(Builder builder) {
        super(builder);
        this.creationCategory = builder.creationCategory;
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBNodeIds = builder.DBNodeIds;
        this.DBNodeNum = builder.DBNodeNum;
        this.DBNodes = builder.DBNodes;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.hotStandbyCluster = builder.hotStandbyCluster;
        this.modifyType = builder.modifyType;
        this.orderType = builder.orderType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.provisionedIops = builder.provisionedIops;
        this.regionId = builder.regionId;
        this.serverlessType = builder.serverlessType;
        this.storageChargeType = builder.storageChargeType;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.usedTime = builder.usedTime;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationCategory
     */
    public String getCreationCategory() {
        return this.creationCategory;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBNodeIds
     */
    public java.util.List<String> getDBNodeIds() {
        return this.DBNodeIds;
    }

    /**
     * @return DBNodeNum
     */
    public Integer getDBNodeNum() {
        return this.DBNodeNum;
    }

    /**
     * @return DBNodes
     */
    public java.util.List<DBNodes> getDBNodes() {
        return this.DBNodes;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return hotStandbyCluster
     */
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return provisionedIops
     */
    public String getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serverlessType
     */
    public String getServerlessType() {
        return this.serverlessType;
    }

    /**
     * @return storageChargeType
     */
    public String getStorageChargeType() {
        return this.storageChargeType;
    }

    /**
     * @return storageSpace
     */
    public String getStorageSpace() {
        return this.storageSpace;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeDBClusterPriceRequest, Builder> {
        private String creationCategory; 
        private String DBClusterId; 
        private String DBNodeClass; 
        private java.util.List<String> DBNodeIds; 
        private Integer DBNodeNum; 
        private java.util.List<DBNodes> DBNodes; 
        private String DBType; 
        private String DBVersion; 
        private String hotStandbyCluster; 
        private String modifyType; 
        private String orderType; 
        private String payType; 
        private String period; 
        private String provisionedIops; 
        private String regionId; 
        private String serverlessType; 
        private String storageChargeType; 
        private String storageSpace; 
        private String storageType; 
        private String usedTime; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterPriceRequest request) {
            super(request);
            this.creationCategory = request.creationCategory;
            this.DBClusterId = request.DBClusterId;
            this.DBNodeClass = request.DBNodeClass;
            this.DBNodeIds = request.DBNodeIds;
            this.DBNodeNum = request.DBNodeNum;
            this.DBNodes = request.DBNodes;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.hotStandbyCluster = request.hotStandbyCluster;
            this.modifyType = request.modifyType;
            this.orderType = request.orderType;
            this.payType = request.payType;
            this.period = request.period;
            this.provisionedIops = request.provisionedIops;
            this.regionId = request.regionId;
            this.serverlessType = request.serverlessType;
            this.storageChargeType = request.storageChargeType;
            this.storageSpace = request.storageSpace;
            this.storageType = request.storageType;
            this.usedTime = request.usedTime;
            this.zoneId = request.zoneId;
        } 

        /**
         * CreationCategory.
         */
        public Builder creationCategory(String creationCategory) {
            this.putQueryParameter("CreationCategory", creationCategory);
            this.creationCategory = creationCategory;
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
         * DBNodeClass.
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * DBNodeIds.
         */
        public Builder DBNodeIds(java.util.List<String> DBNodeIds) {
            this.putQueryParameter("DBNodeIds", DBNodeIds);
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * DBNodeNum.
         */
        public Builder DBNodeNum(Integer DBNodeNum) {
            this.putQueryParameter("DBNodeNum", DBNodeNum);
            this.DBNodeNum = DBNodeNum;
            return this;
        }

        /**
         * DBNodes.
         */
        public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
            String DBNodesShrink = shrink(DBNodes, "DBNodes", "json");
            this.putQueryParameter("DBNodes", DBNodesShrink);
            this.DBNodes = DBNodes;
            return this;
        }

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * DBVersion.
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * HotStandbyCluster.
         */
        public Builder hotStandbyCluster(String hotStandbyCluster) {
            this.putQueryParameter("HotStandbyCluster", hotStandbyCluster);
            this.hotStandbyCluster = hotStandbyCluster;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * ProvisionedIops.
         */
        public Builder provisionedIops(String provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
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
         * ServerlessType.
         */
        public Builder serverlessType(String serverlessType) {
            this.putQueryParameter("ServerlessType", serverlessType);
            this.serverlessType = serverlessType;
            return this;
        }

        /**
         * StorageChargeType.
         */
        public Builder storageChargeType(String storageChargeType) {
            this.putQueryParameter("StorageChargeType", storageChargeType);
            this.storageChargeType = storageChargeType;
            return this;
        }

        /**
         * StorageSpace.
         */
        public Builder storageSpace(String storageSpace) {
            this.putQueryParameter("StorageSpace", storageSpace);
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * UsedTime.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
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
        public DescribeDBClusterPriceRequest build() {
            return new DescribeDBClusterPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPriceRequest</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        private DBNodes(Builder builder) {
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeId = builder.DBNodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodes create() {
            return builder().build();
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public static final class Builder {
            private String DBNodeClass; 
            private String DBNodeId; 

            private Builder() {
            } 

            private Builder(DBNodes model) {
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeId = model.DBNodeId;
            } 

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeId.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            public DBNodes build() {
                return new DBNodes(this);
            } 

        } 

    }
}
