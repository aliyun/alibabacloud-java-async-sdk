// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetTrafficControlTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTrafficControlTaskRequest</p>
 */
public class GetTrafficControlTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficControlTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlTargetFilter")
    private String controlTargetFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private GetTrafficControlTaskRequest(Builder builder) {
        super(builder);
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.controlTargetFilter = builder.controlTargetFilter;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficControlTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    /**
     * @return controlTargetFilter
     */
    public String getControlTargetFilter() {
        return this.controlTargetFilter;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetTrafficControlTaskRequest, Builder> {
        private String trafficControlTaskId; 
        private String controlTargetFilter; 
        private String environment; 
        private String instanceId; 
        private String regionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetTrafficControlTaskRequest request) {
            super(request);
            this.trafficControlTaskId = request.trafficControlTaskId;
            this.controlTargetFilter = request.controlTargetFilter;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.putPathParameter("TrafficControlTaskId", trafficControlTaskId);
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }

        /**
         * ControlTargetFilter.
         */
        public Builder controlTargetFilter(String controlTargetFilter) {
            this.putQueryParameter("ControlTargetFilter", controlTargetFilter);
            this.controlTargetFilter = controlTargetFilter;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
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

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetTrafficControlTaskRequest build() {
            return new GetTrafficControlTaskRequest(this);
        } 

    } 

}
