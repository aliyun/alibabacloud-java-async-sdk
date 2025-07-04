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
 * {@link ModifyBEClusterAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyBEClusterAttributeRequest</p>
 */
public class ModifyBEClusterAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceAttributeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceAttributeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private ModifyBEClusterAttributeRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBInstanceId = builder.DBInstanceId;
        this.instanceAttributeType = builder.instanceAttributeType;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBEClusterAttributeRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return instanceAttributeType
     */
    public String getInstanceAttributeType() {
        return this.instanceAttributeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<ModifyBEClusterAttributeRequest, Builder> {
        private String DBClusterId; 
        private String DBInstanceId; 
        private String instanceAttributeType; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBEClusterAttributeRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBInstanceId = request.DBInstanceId;
            this.instanceAttributeType = request.instanceAttributeType;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.value = request.value;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-xxxb9f2w-be</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
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
         * <p>The attribute type of the instance. Set this parameter to DBInstanceDescription.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>MaintainTime</li>
         * <li>DBInstanceDescription</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DBInstanceDescription</p>
         */
        public Builder instanceAttributeType(String instanceAttributeType) {
            this.putQueryParameter("InstanceAttributeType", instanceAttributeType);
            this.instanceAttributeType = instanceAttributeType;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The new name of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public ModifyBEClusterAttributeRequest build() {
            return new ModifyBEClusterAttributeRequest(this);
        } 

    } 

}
