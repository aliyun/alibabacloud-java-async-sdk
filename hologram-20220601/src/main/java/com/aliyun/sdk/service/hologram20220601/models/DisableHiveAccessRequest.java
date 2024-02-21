// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableHiveAccessRequest} extends {@link RequestModel}
 *
 * <p>DisableHiveAccessRequest</p>
 */
public class DisableHiveAccessRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DisableHiveAccessRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableHiveAccessRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DisableHiveAccessRequest, Builder> {
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisableHiveAccessRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
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

        @Override
        public DisableHiveAccessRequest build() {
            return new DisableHiveAccessRequest(this);
        } 

    } 

}
