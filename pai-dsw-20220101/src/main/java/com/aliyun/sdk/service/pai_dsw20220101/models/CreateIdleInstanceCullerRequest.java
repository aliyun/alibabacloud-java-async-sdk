// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link CreateIdleInstanceCullerRequest} extends {@link RequestModel}
 *
 * <p>CreateIdleInstanceCullerRequest</p>
 */
public class CreateIdleInstanceCullerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CpuPercentThreshold")
    private Integer cpuPercentThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GpuPercentThreshold")
    private Integer gpuPercentThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxIdleTimeInMinutes")
    private Integer maxIdleTimeInMinutes;

    private CreateIdleInstanceCullerRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.cpuPercentThreshold = builder.cpuPercentThreshold;
        this.gpuPercentThreshold = builder.gpuPercentThreshold;
        this.maxIdleTimeInMinutes = builder.maxIdleTimeInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdleInstanceCullerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return cpuPercentThreshold
     */
    public Integer getCpuPercentThreshold() {
        return this.cpuPercentThreshold;
    }

    /**
     * @return gpuPercentThreshold
     */
    public Integer getGpuPercentThreshold() {
        return this.gpuPercentThreshold;
    }

    /**
     * @return maxIdleTimeInMinutes
     */
    public Integer getMaxIdleTimeInMinutes() {
        return this.maxIdleTimeInMinutes;
    }

    public static final class Builder extends Request.Builder<CreateIdleInstanceCullerRequest, Builder> {
        private String instanceId; 
        private Integer cpuPercentThreshold; 
        private Integer gpuPercentThreshold; 
        private Integer maxIdleTimeInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(CreateIdleInstanceCullerRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.cpuPercentThreshold = request.cpuPercentThreshold;
            this.gpuPercentThreshold = request.gpuPercentThreshold;
            this.maxIdleTimeInMinutes = request.maxIdleTimeInMinutes;
        } 

        /**
         * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/470439.html">ListInstances</a> to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The CPU utilization threshold. Unit: percentage. Valid values: 1 to 100. If the CPU utilization of the instance is lower than this threshold, the instance is considered idle.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder cpuPercentThreshold(Integer cpuPercentThreshold) {
            this.putBodyParameter("CpuPercentThreshold", cpuPercentThreshold);
            this.cpuPercentThreshold = cpuPercentThreshold;
            return this;
        }

        /**
         * <p>The GPU utilization threshold. Unit: percentage. Valid values: 1 to 100. This parameter takes effect only if the instance is of the GPU instance type. If both CPU and GPU utilization is lower than the thresholds, the instance is considered idle.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder gpuPercentThreshold(Integer gpuPercentThreshold) {
            this.putBodyParameter("GpuPercentThreshold", gpuPercentThreshold);
            this.gpuPercentThreshold = gpuPercentThreshold;
            return this;
        }

        /**
         * <p>The maximum time duration for which the instance is idle. Unit: minutes. If the time duration for which the instance is idle exceeds this value, the system automatically stops the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder maxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
            this.putBodyParameter("MaxIdleTimeInMinutes", maxIdleTimeInMinutes);
            this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
            return this;
        }

        @Override
        public CreateIdleInstanceCullerRequest build() {
            return new CreateIdleInstanceCullerRequest(this);
        } 

    } 

}
