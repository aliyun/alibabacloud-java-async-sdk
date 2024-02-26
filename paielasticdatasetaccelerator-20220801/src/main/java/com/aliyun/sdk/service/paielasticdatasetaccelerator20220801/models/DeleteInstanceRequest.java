// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteInstanceRequest, Builder> {
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
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

        @Override
        public DeleteInstanceRequest build() {
            return new DeleteInstanceRequest(this);
        } 

    } 

}
