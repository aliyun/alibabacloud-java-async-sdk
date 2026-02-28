// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetInstanceRecordConfigRequest} extends {@link RequestModel}
 *
 * <p>SetInstanceRecordConfigRequest</p>
 */
public class SetInstanceRecordConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpirationDays")
    private Integer expirationDays;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordStorageTarget")
    private String recordStorageTarget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    private SetInstanceRecordConfigRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.expirationDays = builder.expirationDays;
        this.instanceId = builder.instanceId;
        this.recordStorageTarget = builder.recordStorageTarget;
        this.regionId = builder.regionId;
        this.resourceRegionId = builder.resourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstanceRecordConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return expirationDays
     */
    public Integer getExpirationDays() {
        return this.expirationDays;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return recordStorageTarget
     */
    public String getRecordStorageTarget() {
        return this.recordStorageTarget;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public static final class Builder extends Request.Builder<SetInstanceRecordConfigRequest, Builder> {
        private Boolean enabled; 
        private Integer expirationDays; 
        private String instanceId; 
        private String recordStorageTarget; 
        private String regionId; 
        private String resourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(SetInstanceRecordConfigRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.expirationDays = request.expirationDays;
            this.instanceId = request.instanceId;
            this.recordStorageTarget = request.recordStorageTarget;
            this.regionId = request.regionId;
            this.resourceRegionId = request.resourceRegionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * ExpirationDays.
         */
        public Builder expirationDays(Integer expirationDays) {
            this.putBodyParameter("ExpirationDays", expirationDays);
            this.expirationDays = expirationDays;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RecordStorageTarget.
         */
        public Builder recordStorageTarget(String recordStorageTarget) {
            this.putBodyParameter("RecordStorageTarget", recordStorageTarget);
            this.recordStorageTarget = recordStorageTarget;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putBodyParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        @Override
        public SetInstanceRecordConfigRequest build() {
            return new SetInstanceRecordConfigRequest(this);
        } 

    } 

}
