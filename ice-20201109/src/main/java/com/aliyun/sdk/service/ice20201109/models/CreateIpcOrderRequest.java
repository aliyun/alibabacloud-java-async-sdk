// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateIpcOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateIpcOrderRequest</p>
 */
public class CreateIpcOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capability")
    private String capability;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    private CreateIpcOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.capability = builder.capability;
        this.deviceId = builder.deviceId;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpcOrderRequest create() {
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
     * @return capability
     */
    public String getCapability() {
        return this.capability;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<CreateIpcOrderRequest, Builder> {
        private String regionId; 
        private String capability; 
        private String deviceId; 
        private String period; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpcOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.capability = request.capability;
            this.deviceId = request.deviceId;
            this.period = request.period;
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
         * <p>The capability. Valid values:</p>
         * <ul>
         * <li>understand: Image understanding. Supports 300 image understanding tasks per day.</li>
         * <li>understand-reid: Image understanding with ReID. Supports 300 image understanding tasks per day.</li>
         * <li>search: Search. Supports 75 searches per day.</li>
         * <li>understand-search: Image understanding and search. Supports 300 image understanding tasks and 75 searches per day.</li>
         * <li>understand-reid-search: Image understanding with ReID and search. Supports 300 image understanding tasks and 75 searches per day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>understand</p>
         */
        public Builder capability(String capability) {
            this.putQueryParameter("Capability", capability);
            this.capability = capability;
            return this;
        }

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d123</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>The subscription period. Valid values:</p>
         * <ul>
         * <li>month: Monthly subscription, calculated as 30 days.</li>
         * <li>quarter: Quarterly subscription, calculated as 90 days.</li>
         * <li>year: Annual subscription, calculated as 365 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public CreateIpcOrderRequest build() {
            return new CreateIpcOrderRequest(this);
        } 

    } 

}
