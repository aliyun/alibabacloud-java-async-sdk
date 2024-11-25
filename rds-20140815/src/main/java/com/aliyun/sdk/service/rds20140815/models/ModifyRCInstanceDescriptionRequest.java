// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRCInstanceDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCInstanceDescriptionRequest</p>
 */
public class ModifyRCInstanceDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceDescription")
    private String instanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRCInstanceDescriptionRequest(Builder builder) {
        super(builder);
        this.instanceDescription = builder.instanceDescription;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
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

    public static final class Builder extends Request.Builder<ModifyRCInstanceDescriptionRequest, Builder> {
        private String instanceDescription; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceDescriptionRequest request) {
            super(request);
            this.instanceDescription = request.instanceDescription;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
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
        public ModifyRCInstanceDescriptionRequest build() {
            return new ModifyRCInstanceDescriptionRequest(this);
        } 

    } 

}
