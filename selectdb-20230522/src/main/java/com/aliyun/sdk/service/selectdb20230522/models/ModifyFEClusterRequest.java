// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link ModifyFEClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyFEClusterRequest</p>
 */
public class ModifyFEClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FEClassCode")
    private String FEClassCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FEClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String FEClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FENodeCount")
    private String FENodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyFEClusterRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.FEClassCode = builder.FEClassCode;
        this.FEClusterId = builder.FEClusterId;
        this.FENodeCount = builder.FENodeCount;
        this.product = builder.product;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFEClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return FEClassCode
     */
    public String getFEClassCode() {
        return this.FEClassCode;
    }

    /**
     * @return FEClusterId
     */
    public String getFEClusterId() {
        return this.FEClusterId;
    }

    /**
     * @return FENodeCount
     */
    public String getFENodeCount() {
        return this.FENodeCount;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyFEClusterRequest, Builder> {
        private String DBInstanceId; 
        private String FEClassCode; 
        private String FEClusterId; 
        private String FENodeCount; 
        private String product; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFEClusterRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.FEClassCode = request.FEClassCode;
            this.FEClusterId = request.FEClusterId;
            this.FENodeCount = request.FENodeCount;
            this.product = request.product;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The specifications of the FE cluster. Valid values:</p>
         * <ul>
         * <li><p>selectdb_fe.xlarge16: 4 cores and 16 GB.</p>
         * </li>
         * <li><p>selectdb_fe.2xlarge16: 8 cores and 32 GB.</p>
         * </li>
         * <li><p>selectdb_fe.4xlarge16: 16 cores and 64 GB.</p>
         * </li>
         * <li><p>selectdb_fe.8xlarge16: 32 cores and 128 GB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>selectdb_fe.2xlarge16</p>
         */
        public Builder FEClassCode(String FEClassCode) {
            this.putQueryParameter("FEClassCode", FEClassCode);
            this.FEClassCode = FEClassCode;
            return this;
        }

        /**
         * <p>The FE cluster ID. Default value: {instance ID}-fe.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****-fe</p>
         */
        public Builder FEClusterId(String FEClusterId) {
            this.putQueryParameter("FEClusterId", FEClusterId);
            this.FEClusterId = FEClusterId;
            return this;
        }

        /**
         * <p>The number of nodes in the FE cluster. The value must be an odd number. Valid values for locally redundant instances: 1 to 11. Valid values for zone-redundant instances: 3 to 11.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder FENodeCount(String FENodeCount) {
            this.putQueryParameter("FENodeCount", FENodeCount);
            this.FENodeCount = FENodeCount;
            return this;
        }

        /**
         * <p>The product ID. Default value: selectdb.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyFEClusterRequest build() {
            return new ModifyFEClusterRequest(this);
        } 

    } 

}
