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
 * {@link SplitTrafficControlTargetRequest} extends {@link RequestModel}
 *
 * <p>SplitTrafficControlTargetRequest</p>
 */
public class SplitTrafficControlTargetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    private String trafficControlTargetId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SetPoints")
    private java.util.List<Long> setPoints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SetValues")
    private java.util.List<Long> setValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimePoints")
    private java.util.List<Long> timePoints;

    private SplitTrafficControlTargetRequest(Builder builder) {
        super(builder);
        this.trafficControlTargetId = builder.trafficControlTargetId;
        this.regionId = builder.regionId;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.setPoints = builder.setPoints;
        this.setValues = builder.setValues;
        this.timePoints = builder.timePoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SplitTrafficControlTargetRequest create() {
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
     * @return setPoints
     */
    public java.util.List<Long> getSetPoints() {
        return this.setPoints;
    }

    /**
     * @return setValues
     */
    public java.util.List<Long> getSetValues() {
        return this.setValues;
    }

    /**
     * @return timePoints
     */
    public java.util.List<Long> getTimePoints() {
        return this.timePoints;
    }

    public static final class Builder extends Request.Builder<SplitTrafficControlTargetRequest, Builder> {
        private String trafficControlTargetId; 
        private String regionId; 
        private String environment; 
        private String instanceId; 
        private java.util.List<Long> setPoints; 
        private java.util.List<Long> setValues; 
        private java.util.List<Long> timePoints; 

        private Builder() {
            super();
        } 

        private Builder(SplitTrafficControlTargetRequest request) {
            super(request);
            this.trafficControlTargetId = request.trafficControlTargetId;
            this.regionId = request.regionId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.setPoints = request.setPoints;
            this.setValues = request.setValues;
            this.timePoints = request.timePoints;
        } 

        /**
         * <p>The ID of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li><p><code>Pre</code>: pre-production environment.</p>
         * </li>
         * <li><p><code>Prod</code>: production environment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         */
        public Builder setPoints(java.util.List<Long> setPoints) {
            this.putBodyParameter("SetPoints", setPoints);
            this.setPoints = setPoints;
            return this;
        }

        /**
         * <p>The target values that correspond to the time intervals defined by the <code>TimePoints</code> parameter.</p>
         */
        public Builder setValues(java.util.List<Long> setValues) {
            this.putBodyParameter("SetValues", setValues);
            this.setValues = setValues;
            return this;
        }

        /**
         * <p>The time points that define the traffic-splitting intervals.</p>
         */
        public Builder timePoints(java.util.List<Long> timePoints) {
            this.putBodyParameter("TimePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        @Override
        public SplitTrafficControlTargetRequest build() {
            return new SplitTrafficControlTargetRequest(this);
        } 

    } 

}
