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
 * {@link StartTrafficControlTargetRequest} extends {@link RequestModel}
 *
 * <p>StartTrafficControlTargetRequest</p>
 */
public class StartTrafficControlTargetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    private String trafficControlTargetId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private StartTrafficControlTargetRequest(Builder builder) {
        super(builder);
        this.trafficControlTargetId = builder.trafficControlTargetId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTrafficControlTargetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trafficControlTargetId
     */
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
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

    public static final class Builder extends Request.Builder<StartTrafficControlTargetRequest, Builder> {
        private String trafficControlTargetId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartTrafficControlTargetRequest request) {
            super(request);
            this.trafficControlTargetId = request.trafficControlTargetId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * TrafficControlTargetId.
         */
        public Builder trafficControlTargetId(String trafficControlTargetId) {
            this.putPathParameter("TrafficControlTargetId", trafficControlTargetId);
            this.trafficControlTargetId = trafficControlTargetId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StartTrafficControlTargetRequest build() {
            return new StartTrafficControlTargetRequest(this);
        } 

    } 

}
