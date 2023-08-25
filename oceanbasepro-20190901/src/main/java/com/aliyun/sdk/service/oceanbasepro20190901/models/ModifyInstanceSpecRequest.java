// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("DiskSize")
    private Long diskSize;

    @Body
    @NameInMap("InstanceClass")
    private String instanceClass;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.diskSize = builder.diskSize;
        this.instanceClass = builder.instanceClass;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSpecRequest create() {
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
    public Long getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private String regionId; 
        private Long diskSize; 
        private String instanceClass; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.diskSize = request.diskSize;
            this.instanceClass = request.instanceClass;
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
         * DiskSize.
         */
        public Builder diskSize(Long diskSize) {
            this.putBodyParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.putBodyParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
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

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

}
