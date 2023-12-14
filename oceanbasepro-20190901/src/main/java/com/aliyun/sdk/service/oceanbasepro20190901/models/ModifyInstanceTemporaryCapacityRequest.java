// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceTemporaryCapacityRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceTemporaryCapacityRequest</p>
 */
public class ModifyInstanceTemporaryCapacityRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DiskSize")
    private String diskSize;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Spec")
    @Validation(required = true)
    private String spec;

    private ModifyInstanceTemporaryCapacityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.diskSize = builder.diskSize;
        this.instanceId = builder.instanceId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTemporaryCapacityRequest create() {
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
     * @return diskSize
     */
    public String getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceTemporaryCapacityRequest, Builder> {
        private String regionId; 
        private String diskSize; 
        private String instanceId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTemporaryCapacityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.diskSize = request.diskSize;
            this.instanceId = request.instanceId;
            this.spec = request.spec;
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
         * DiskSize.
         */
        public Builder diskSize(String diskSize) {
            this.putBodyParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public ModifyInstanceTemporaryCapacityRequest build() {
            return new ModifyInstanceTemporaryCapacityRequest(this);
        } 

    } 

}
