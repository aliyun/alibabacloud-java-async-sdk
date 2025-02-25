// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceResourceRequest</p>
 */
public class DeleteInstanceResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteInstanceResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceId = builder.resourceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceResourceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteInstanceResourceRequest, Builder> {
        private String instanceId; 
        private String resourceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceResourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceId = request.resourceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteInstanceResourceRequest build() {
            return new DeleteInstanceResourceRequest(this);
        } 

    } 

}
