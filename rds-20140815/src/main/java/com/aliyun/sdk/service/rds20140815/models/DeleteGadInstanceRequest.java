// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DeleteGadInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGadInstanceRequest</p>
 */
public class DeleteGadInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GadInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gadInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DeleteGadInstanceRequest(Builder builder) {
        super(builder);
        this.gadInstanceName = builder.gadInstanceName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGadInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gadInstanceName
     */
    public String getGadInstanceName() {
        return this.gadInstanceName;
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

    public static final class Builder extends Request.Builder<DeleteGadInstanceRequest, Builder> {
        private String gadInstanceName; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGadInstanceRequest request) {
            super(request);
            this.gadInstanceName = request.gadInstanceName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the global active database cluster. You can call the GadInstanceName operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gad-rm-bp1npi2j8********</p>
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * <p>The region ID of the central node of the global active database cluster. The central node refers to the primary node. You can call the DescribeGadInstances operation to query the region ID.</p>
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
         * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DeleteGadInstanceRequest build() {
            return new DeleteGadInstanceRequest(this);
        } 

    } 

}
