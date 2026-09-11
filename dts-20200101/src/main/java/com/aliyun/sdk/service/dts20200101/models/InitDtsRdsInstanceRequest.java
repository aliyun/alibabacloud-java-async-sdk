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
 * {@link InitDtsRdsInstanceRequest} extends {@link RequestModel}
 *
 * <p>InitDtsRdsInstanceRequest</p>
 */
public class InitDtsRdsInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointCenId")
    private String endpointCenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointInstanceId")
    private String endpointInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointInstanceType")
    private String endpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointRegion")
    private String endpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private InitDtsRdsInstanceRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.endpointCenId = builder.endpointCenId;
        this.endpointInstanceId = builder.endpointInstanceId;
        this.endpointInstanceType = builder.endpointInstanceType;
        this.endpointRegion = builder.endpointRegion;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitDtsRdsInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return endpointCenId
     */
    public String getEndpointCenId() {
        return this.endpointCenId;
    }

    /**
     * @return endpointInstanceId
     */
    public String getEndpointInstanceId() {
        return this.endpointInstanceId;
    }

    /**
     * @return endpointInstanceType
     */
    public String getEndpointInstanceType() {
        return this.endpointInstanceType;
    }

    /**
     * @return endpointRegion
     */
    public String getEndpointRegion() {
        return this.endpointRegion;
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

    public static final class Builder extends Request.Builder<InitDtsRdsInstanceRequest, Builder> {
        private String dtsInstanceId; 
        private String endpointCenId; 
        private String endpointInstanceId; 
        private String endpointInstanceType; 
        private String endpointRegion; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(InitDtsRdsInstanceRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.endpointCenId = request.endpointCenId;
            this.endpointInstanceId = request.endpointInstanceId;
            this.endpointInstanceType = request.endpointInstanceType;
            this.endpointRegion = request.endpointRegion;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The instance ID of the synchronization node.</p>
         * 
         * <strong>example:</strong>
         * <p>dtszvxa4qmot6p****</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The instance ID of the CEN instance. This parameter is required if the unit node is a self-managed MySQL database connected through CEN.</p>
         * <blockquote>
         * <p>You must specify either this parameter or the ApsaraDB RDS for MySQL-related parameters (<strong>EndpointRegion</strong> and <strong>EndpointInstanceId</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cen-9kqshqum*******</p>
         */
        public Builder endpointCenId(String endpointCenId) {
            this.putQueryParameter("EndpointCenId", endpointCenId);
            this.endpointCenId = endpointCenId;
            return this;
        }

        /**
         * <p>The instance ID of the ApsaraDB RDS for MySQL instance. This parameter is required if the unit node is an ApsaraDB RDS for MySQL instance.</p>
         * <blockquote>
         * <ul>
         * <li>You must also specify the <strong>EndpointRegion</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You must specify either this parameter or <strong>EndpointCenId</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1162kryivb8****</p>
         */
        public Builder endpointInstanceId(String endpointInstanceId) {
            this.putQueryParameter("EndpointInstanceId", endpointInstanceId);
            this.endpointInstanceId = endpointInstanceId;
            return this;
        }

        /**
         * <p>The instance type of the unit node. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>CEN</strong>: self-managed MySQL database connected through CEN.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder endpointInstanceType(String endpointInstanceType) {
            this.putQueryParameter("EndpointInstanceType", endpointInstanceType);
            this.endpointInstanceType = endpointInstanceType;
            return this;
        }

        /**
         * <p>The region in which the ApsaraDB RDS for MySQL instance resides. This parameter is required if the unit node is an ApsaraDB RDS for MySQL instance.</p>
         * <blockquote>
         * <ul>
         * <li>You must also specify the <strong>EndpointInstanceId</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You must specify either this parameter or <strong>EndpointCenId</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder endpointRegion(String endpointRegion) {
            this.putQueryParameter("EndpointRegion", endpointRegion);
            this.endpointRegion = endpointRegion;
            return this;
        }

        /**
         * <p>The region in which the active geo-redundancy database cluster resides.</p>
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
         * <p>The ID of the resource group. This is a global parameter and does not need to be specified for this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>资源组ID，全局参数，当前API无需传入。</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public InitDtsRdsInstanceRequest build() {
            return new InitDtsRdsInstanceRequest(this);
        } 

    } 

}
