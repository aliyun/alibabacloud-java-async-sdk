// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseInstanceRequest</p>
 */
public class ReleaseInstanceRequest extends Request {
    @Query
    @NameInMap("ForceDeleteInstance")
    private Boolean forceDeleteInstance;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ReleaseInstanceRequest(Builder builder) {
        super(builder);
        this.forceDeleteInstance = builder.forceDeleteInstance;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDeleteInstance
     */
    public Boolean getForceDeleteInstance() {
        return this.forceDeleteInstance;
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

    public static final class Builder extends Request.Builder<ReleaseInstanceRequest, Builder> {
        private Boolean forceDeleteInstance; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseInstanceRequest request) {
            super(request);
            this.forceDeleteInstance = request.forceDeleteInstance;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The returned message.
         */
        public Builder forceDeleteInstance(Boolean forceDeleteInstance) {
            this.putQueryParameter("ForceDeleteInstance", forceDeleteInstance);
            this.forceDeleteInstance = forceDeleteInstance;
            return this;
        }

        /**
         * Specifies whether to immediately release the physical resources of the instance. Valid values:
         * <p>
         * 
         * *   **true**: The physical resources of the instance are immediately released.
         * *   **false**: The physical resources of the instance are retained for a period of time before they are released.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ReleaseInstanceRequest build() {
            return new ReleaseInstanceRequest(this);
        } 

    } 

}
