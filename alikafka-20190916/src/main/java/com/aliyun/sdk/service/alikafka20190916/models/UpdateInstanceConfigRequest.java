// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceConfigRequest</p>
 */
public class UpdateInstanceConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateInstanceConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
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

    public static final class Builder extends Request.Builder<UpdateInstanceConfigRequest, Builder> {
        private String config; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceConfigRequest request) {
            super(request);
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateInstanceConfigRequest build() {
            return new UpdateInstanceConfigRequest(this);
        } 

    } 

}
