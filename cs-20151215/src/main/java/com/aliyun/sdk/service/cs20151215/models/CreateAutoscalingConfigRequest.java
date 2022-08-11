// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoscalingConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoscalingConfigRequest</p>
 */
public class CreateAutoscalingConfigRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("cool_down_duration")
    private String coolDownDuration;

    @Body
    @NameInMap("expander")
    private String expander;

    @Body
    @NameInMap("gpu_utilization_threshold")
    private String gpuUtilizationThreshold;

    @Body
    @NameInMap("scale_down_enabled")
    private Boolean scaleDownEnabled;

    @Body
    @NameInMap("scan_interval")
    private String scanInterval;

    @Body
    @NameInMap("unneeded_duration")
    private String unneededDuration;

    @Body
    @NameInMap("utilization_threshold")
    private String utilizationThreshold;

    private CreateAutoscalingConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.coolDownDuration = builder.coolDownDuration;
        this.expander = builder.expander;
        this.gpuUtilizationThreshold = builder.gpuUtilizationThreshold;
        this.scaleDownEnabled = builder.scaleDownEnabled;
        this.scanInterval = builder.scanInterval;
        this.unneededDuration = builder.unneededDuration;
        this.utilizationThreshold = builder.utilizationThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoscalingConfigRequest create() {
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
     * @return coolDownDuration
     */
    public String getCoolDownDuration() {
        return this.coolDownDuration;
    }

    /**
     * @return expander
     */
    public String getExpander() {
        return this.expander;
    }

    /**
     * @return gpuUtilizationThreshold
     */
    public String getGpuUtilizationThreshold() {
        return this.gpuUtilizationThreshold;
    }

    /**
     * @return scaleDownEnabled
     */
    public Boolean getScaleDownEnabled() {
        return this.scaleDownEnabled;
    }

    /**
     * @return scanInterval
     */
    public String getScanInterval() {
        return this.scanInterval;
    }

    /**
     * @return unneededDuration
     */
    public String getUnneededDuration() {
        return this.unneededDuration;
    }

    /**
     * @return utilizationThreshold
     */
    public String getUtilizationThreshold() {
        return this.utilizationThreshold;
    }

    public static final class Builder extends Request.Builder<CreateAutoscalingConfigRequest, Builder> {
        private String clusterId; 
        private String coolDownDuration; 
        private String expander; 
        private String gpuUtilizationThreshold; 
        private Boolean scaleDownEnabled; 
        private String scanInterval; 
        private String unneededDuration; 
        private String utilizationThreshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoscalingConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.coolDownDuration = request.coolDownDuration;
            this.expander = request.expander;
            this.gpuUtilizationThreshold = request.gpuUtilizationThreshold;
            this.scaleDownEnabled = request.scaleDownEnabled;
            this.scanInterval = request.scanInterval;
            this.unneededDuration = request.unneededDuration;
            this.utilizationThreshold = request.utilizationThreshold;
        } 

        /**
         * 集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 静默时间，扩容出的节点，在静默时间过后，方可进入缩容判断
         */
        public Builder coolDownDuration(String coolDownDuration) {
            this.putBodyParameter("cool_down_duration", coolDownDuration);
            this.coolDownDuration = coolDownDuration;
            return this;
        }

        /**
         * 节点池扩容顺序策略
         */
        public Builder expander(String expander) {
            this.putBodyParameter("expander", expander);
            this.expander = expander;
            return this;
        }

        /**
         * GPU缩容阈值，节点上 Request 的资源与总资源量的比值
         */
        public Builder gpuUtilizationThreshold(String gpuUtilizationThreshold) {
            this.putBodyParameter("gpu_utilization_threshold", gpuUtilizationThreshold);
            this.gpuUtilizationThreshold = gpuUtilizationThreshold;
            return this;
        }

        /**
         * 是否允许缩容
         */
        public Builder scaleDownEnabled(Boolean scaleDownEnabled) {
            this.putBodyParameter("scale_down_enabled", scaleDownEnabled);
            this.scaleDownEnabled = scaleDownEnabled;
            return this;
        }

        /**
         * 弹性灵敏度，判断伸缩的间隔时间
         */
        public Builder scanInterval(String scanInterval) {
            this.putBodyParameter("scan_interval", scanInterval);
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * 缩容触发时延，节点缩容时需要连续满足触发时延所设定的时间，方可进行缩容
         */
        public Builder unneededDuration(String unneededDuration) {
            this.putBodyParameter("unneeded_duration", unneededDuration);
            this.unneededDuration = unneededDuration;
            return this;
        }

        /**
         * 缩容阈值，节点上 Request 的资源与总资源量的比值
         */
        public Builder utilizationThreshold(String utilizationThreshold) {
            this.putBodyParameter("utilization_threshold", utilizationThreshold);
            this.utilizationThreshold = utilizationThreshold;
            return this;
        }

        @Override
        public CreateAutoscalingConfigRequest build() {
            return new CreateAutoscalingConfigRequest(this);
        } 

    } 

}
