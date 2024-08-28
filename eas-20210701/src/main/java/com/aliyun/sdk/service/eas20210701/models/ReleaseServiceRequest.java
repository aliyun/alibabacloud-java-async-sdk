// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseServiceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseServiceRequest</p>
 */
public class ReleaseServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficState")
    private String trafficState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private ReleaseServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.trafficState = builder.trafficState;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return trafficState
     */
    public String getTrafficState() {
        return this.trafficState;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<ReleaseServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String trafficState; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.trafficState = request.trafficState;
            this.weight = request.weight;
        } 

        /**
         * The ID of the region where the service is deployed.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The service name. For more information about how to query the service name, see [ListServices](~~412109~~).
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The traffic state. Valid values:
         * <p>
         * 
         * *   standalone: independent traffic.
         * *   grouping: grouped traffic.
         */
        public Builder trafficState(String trafficState) {
            this.putBodyParameter("TrafficState", trafficState);
            this.trafficState = trafficState;
            return this;
        }

        /**
         * The weight of the canary release. Valid values: 0 to 100.
         */
        public Builder weight(Integer weight) {
            this.putBodyParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public ReleaseServiceRequest build() {
            return new ReleaseServiceRequest(this);
        } 

    } 

}
