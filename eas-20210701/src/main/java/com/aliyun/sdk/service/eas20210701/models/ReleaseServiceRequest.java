// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
         * <p>The ID of the region where the service is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name. For more information about how to query the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The traffic state. Valid values:</p>
         * <ul>
         * <li>standalone: independent traffic.</li>
         * <li>grouping: grouped traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>grouping</p>
         */
        public Builder trafficState(String trafficState) {
            this.putBodyParameter("TrafficState", trafficState);
            this.trafficState = trafficState;
            return this;
        }

        /**
         * <p>The weight of the service. Valid values: [-1, 1000].</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
