// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListInstanceResourceTablesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceResourceTablesRequest</p>
 */
public class ListInstanceResourceTablesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxcomputeSchema")
    private String maxcomputeSchema;

    private ListInstanceResourceTablesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceId = builder.resourceId;
        this.regionId = builder.regionId;
        this.maxcomputeSchema = builder.maxcomputeSchema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResourceTablesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return maxcomputeSchema
     */
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

    public static final class Builder extends Request.Builder<ListInstanceResourceTablesRequest, Builder> {
        private String instanceId; 
        private String resourceId; 
        private String regionId; 
        private String maxcomputeSchema; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceResourceTablesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceId = request.resourceId;
            this.regionId = request.regionId;
            this.maxcomputeSchema = request.maxcomputeSchema;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * MaxcomputeSchema.
         */
        public Builder maxcomputeSchema(String maxcomputeSchema) {
            this.putQueryParameter("MaxcomputeSchema", maxcomputeSchema);
            this.maxcomputeSchema = maxcomputeSchema;
            return this;
        }

        @Override
        public ListInstanceResourceTablesRequest build() {
            return new ListInstanceResourceTablesRequest(this);
        } 

    } 

}
