// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ModifyMaintainableTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyMaintainableTimeRequest</p>
 */
public class ModifyMaintainableTimeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainableTimePeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainableTimePeriod;

    private ModifyMaintainableTimeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.maintainableTimePeriod = builder.maintainableTimePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMaintainableTimeRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maintainableTimePeriod
     */
    public String getMaintainableTimePeriod() {
        return this.maintainableTimePeriod;
    }

    public static final class Builder extends Request.Builder<ModifyMaintainableTimeRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String maintainableTimePeriod; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMaintainableTimeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.maintainableTimePeriod = request.maintainableTimePeriod;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00-09:00</p>
         */
        public Builder maintainableTimePeriod(String maintainableTimePeriod) {
            this.putQueryParameter("MaintainableTimePeriod", maintainableTimePeriod);
            this.maintainableTimePeriod = maintainableTimePeriod;
            return this;
        }

        @Override
        public ModifyMaintainableTimeRequest build() {
            return new ModifyMaintainableTimeRequest(this);
        } 

    } 

}
