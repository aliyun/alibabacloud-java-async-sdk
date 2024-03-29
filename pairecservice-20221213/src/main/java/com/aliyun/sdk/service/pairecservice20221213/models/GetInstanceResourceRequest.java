// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResourceRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceResourceRequest</p>
 */
public class GetInstanceResourceRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetInstanceResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceId = builder.resourceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResourceRequest create() {
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

    public static final class Builder extends Request.Builder<GetInstanceResourceRequest, Builder> {
        private String instanceId; 
        private String resourceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceResourceRequest request) {
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
        public GetInstanceResourceRequest build() {
            return new GetInstanceResourceRequest(this);
        } 

    } 

}
