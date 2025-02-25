// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateTrafficControlTaskCodeRequest} extends {@link RequestModel}
 *
 * <p>GenerateTrafficControlTaskCodeRequest</p>
 */
public class GenerateTrafficControlTaskCodeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private GenerateTrafficControlTaskCodeRequest(Builder builder) {
        super(builder);
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTrafficControlTaskCodeRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateTrafficControlTaskCodeRequest, Builder> {
        private String trafficControlTaskId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTrafficControlTaskCodeRequest request) {
            super(request);
            this.trafficControlTaskId = request.trafficControlTaskId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * TrafficControlTaskId.
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.putPathParameter("TrafficControlTaskId", trafficControlTaskId);
            this.trafficControlTaskId = trafficControlTaskId;
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
        public GenerateTrafficControlTaskCodeRequest build() {
            return new GenerateTrafficControlTaskCodeRequest(this);
        } 

    } 

}
