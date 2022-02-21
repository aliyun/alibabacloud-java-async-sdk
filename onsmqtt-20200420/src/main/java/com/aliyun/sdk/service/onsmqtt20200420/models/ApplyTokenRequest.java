// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyTokenRequest} extends {@link RequestModel}
 *
 * <p>ApplyTokenRequest</p>
 */
public class ApplyTokenRequest extends Request {
    @Query
    @NameInMap("Actions")
    @Validation(required = true)
    private String actions;

    @Query
    @NameInMap("ExpireTime")
    @Validation(required = true)
    private Long expireTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Resources")
    @Validation(required = true)
    private String resources;

    private ApplyTokenRequest(Builder builder) {
        super(builder);
        this.actions = builder.actions;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public String getActions() {
        return this.actions;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
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

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<ApplyTokenRequest, Builder> {
        private String actions; 
        private Long expireTime; 
        private String instanceId; 
        private String regionId; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(ApplyTokenRequest response) {
            super(response);
            this.actions = response.actions;
            this.expireTime = response.expireTime;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.resources = response.resources;
        } 

        /**
         * Actions.
         */
        public Builder actions(String actions) {
            this.putQueryParameter("Actions", actions);
            this.actions = actions;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public ApplyTokenRequest build() {
            return new ApplyTokenRequest(this);
        } 

    } 

}
