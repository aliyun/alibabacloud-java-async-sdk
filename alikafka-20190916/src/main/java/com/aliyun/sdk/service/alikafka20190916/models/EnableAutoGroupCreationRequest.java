// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAutoGroupCreationRequest} extends {@link RequestModel}
 *
 * <p>EnableAutoGroupCreationRequest</p>
 */
public class EnableAutoGroupCreationRequest extends Request {
    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private Boolean enable;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private EnableAutoGroupCreationRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAutoGroupCreationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
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

    public static final class Builder extends Request.Builder<EnableAutoGroupCreationRequest, Builder> {
        private Boolean enable; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableAutoGroupCreationRequest request) {
            super(request);
            this.enable = request.enable;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * Specify whether to enable the flexible group creation feature. Valid values:
         * <p>
         * 
         * *   **true**: enables the flexible group creation feature.
         * *   **false**: disabled the flexible group creation feature.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * You can call the [GetInstanceList](~~437663~~) operation to query instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public EnableAutoGroupCreationRequest build() {
            return new EnableAutoGroupCreationRequest(this);
        } 

    } 

}
