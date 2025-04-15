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
 * {@link DescribeResourceGroupSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceGroupSpecRequest</p>
 */
public class DescribeResourceGroupSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupType;

    private DescribeResourceGroupSpecRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.resourceGroupType = builder.resourceGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceGroupSpecRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupType
     */
    public String getResourceGroupType() {
        return this.resourceGroupType;
    }

    public static final class Builder extends Request.Builder<DescribeResourceGroupSpecRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private String resourceGroupType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceGroupSpecRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.resourceGroupType = request.resourceGroupType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-8vbo40tl1dxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ai</p>
         */
        public Builder resourceGroupType(String resourceGroupType) {
            this.putQueryParameter("ResourceGroupType", resourceGroupType);
            this.resourceGroupType = resourceGroupType;
            return this;
        }

        @Override
        public DescribeResourceGroupSpecRequest build() {
            return new DescribeResourceGroupSpecRequest(this);
        } 

    } 

}
