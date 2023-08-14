// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIdleInstanceCullerRequest} extends {@link RequestModel}
 *
 * <p>CreateIdleInstanceCullerRequest</p>
 */
public class CreateIdleInstanceCullerRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("CpuPercentThreshold")
    private Integer cpuPercentThreshold;

    @Body
    @NameInMap("GpuPercentThreshold")
    private Integer gpuPercentThreshold;

    @Body
    @NameInMap("MaxIdleTimeInMinutes")
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * CpuPercentThreshold.
         */
        public Builder cpuPercentThreshold(Integer cpuPercentThreshold) {
            this.putBodyParameter("CpuPercentThreshold", cpuPercentThreshold);
            this.cpuPercentThreshold = cpuPercentThreshold;
            return this;
        }

        /**
         * GpuPercentThreshold.
         */
        public Builder gpuPercentThreshold(Integer gpuPercentThreshold) {
            this.putBodyParameter("GpuPercentThreshold", gpuPercentThreshold);
            this.gpuPercentThreshold = gpuPercentThreshold;
            return this;
        }

        /**
         * MaxIdleTimeInMinutes.
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
