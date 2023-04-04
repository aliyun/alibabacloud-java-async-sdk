// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RealLimitRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RealLimitRequest</p>
 */
public class ConfigLayer4RealLimitRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LimitValue")
    @Validation(required = true)
    private Long limitValue;

    private ConfigLayer4RealLimitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.limitValue = builder.limitValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RealLimitRequest create() {
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
     * @return limitValue
     */
    public Long getLimitValue() {
        return this.limitValue;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RealLimitRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Long limitValue; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RealLimitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.limitValue = request.limitValue;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LimitValue.
         */
        public Builder limitValue(Long limitValue) {
            this.putQueryParameter("LimitValue", limitValue);
            this.limitValue = limitValue;
            return this;
        }

        @Override
        public ConfigLayer4RealLimitRequest build() {
            return new ConfigLayer4RealLimitRequest(this);
        } 

    } 

}
