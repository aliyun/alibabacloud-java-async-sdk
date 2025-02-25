// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Description")
    @Validation(maxLength = 1024)
    private String description;

    @Body
    @NameInMap("MaxSlot")
    private String maxSlot;

    @Body
    @NameInMap("Name")
    @Validation(maxLength = 64)
    private String name;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.description = builder.description;
        this.maxSlot = builder.maxSlot;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return maxSlot
     */
    public String getMaxSlot() {
        return this.maxSlot;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String description; 
        private String maxSlot; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.description = request.description;
            this.maxSlot = request.maxSlot;
            this.name = request.name;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MaxSlot.
         */
        public Builder maxSlot(String maxSlot) {
            this.putBodyParameter("MaxSlot", maxSlot);
            this.maxSlot = maxSlot;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
