// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveStandbyInstanceRequest} extends {@link RequestModel}
 *
 * <p>RemoveStandbyInstanceRequest</p>
 */
public class RemoveStandbyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Forced")
    private Boolean forced;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInstanceId;

    private RemoveStandbyInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.forced = builder.forced;
        this.instanceId = builder.instanceId;
        this.targetInstanceId = builder.targetInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveStandbyInstanceRequest create() {
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
     * @return forced
     */
    public Boolean getForced() {
        return this.forced;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public static final class Builder extends Request.Builder<RemoveStandbyInstanceRequest, Builder> {
        private String regionId; 
        private Boolean forced; 
        private String instanceId; 
        private String targetInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveStandbyInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.forced = request.forced;
            this.instanceId = request.instanceId;
            this.targetInstanceId = request.targetInstanceId;
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
         * Forced.
         */
        public Builder forced(Boolean forced) {
            this.putBodyParameter("Forced", forced);
            this.forced = forced;
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
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putBodyParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        @Override
        public RemoveStandbyInstanceRequest build() {
            return new RemoveStandbyInstanceRequest(this);
        } 

    } 

}
