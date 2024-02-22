// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResourceTableRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceResourceTableRequest</p>
 */
public class GetInstanceResourceTableRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Path
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetInstanceResourceTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceId = builder.resourceId;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResourceTableRequest create() {
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetInstanceResourceTableRequest, Builder> {
        private String instanceId; 
        private String resourceId; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceResourceTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceId = request.resourceId;
            this.tableName = request.tableName;
            this.regionId = request.regionId;
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("TableName", tableName);
            this.tableName = tableName;
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

        @Override
        public GetInstanceResourceTableRequest build() {
            return new GetInstanceResourceTableRequest(this);
        } 

    } 

}
