// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseInstanceRequest</p>
 */
public class ReleaseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDeleteInstance")
    private Boolean forceDeleteInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * Specifies whether to immediately release the physical resources of the instance. Valid values:
         * <p>
         * 
         * *   **true**: The physical resources of the instance are immediately released.
         * *   **false**: The physical resources of the instance are retained for a period of time before they are released.
         */
        public Builder forceDeleteInstance(Boolean forceDeleteInstance) {
            this.putQueryParameter("ForceDeleteInstance", forceDeleteInstance);
            this.forceDeleteInstance = forceDeleteInstance;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the instance.
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
