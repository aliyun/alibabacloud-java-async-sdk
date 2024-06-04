// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIdleInstanceCullerResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdleInstanceCullerResponseBody</p>
 */
public class GetIdleInstanceCullerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CpuPercentThreshold")
    private Integer cpuPercentThreshold;

    @com.aliyun.core.annotation.NameInMap("GpuPercentThreshold")
    private Integer gpuPercentThreshold;

    @com.aliyun.core.annotation.NameInMap("IdleTimeInMinutes")
    private Integer idleTimeInMinutes;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("MaxIdleTimeInMinutes")
    private Integer maxIdleTimeInMinutes;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetIdleInstanceCullerResponseBody(Builder builder) {
        this.code = builder.code;
        this.cpuPercentThreshold = builder.cpuPercentThreshold;
        this.gpuPercentThreshold = builder.gpuPercentThreshold;
        this.idleTimeInMinutes = builder.idleTimeInMinutes;
        this.instanceId = builder.instanceId;
        this.maxIdleTimeInMinutes = builder.maxIdleTimeInMinutes;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdleInstanceCullerResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return idleTimeInMinutes
     */
    public Integer getIdleTimeInMinutes() {
        return this.idleTimeInMinutes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxIdleTimeInMinutes
     */
    public Integer getMaxIdleTimeInMinutes() {
        return this.maxIdleTimeInMinutes;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer cpuPercentThreshold; 
        private Integer gpuPercentThreshold; 
        private Integer idleTimeInMinutes; 
        private String instanceId; 
        private Integer maxIdleTimeInMinutes; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CpuPercentThreshold.
         */
        public Builder cpuPercentThreshold(Integer cpuPercentThreshold) {
            this.cpuPercentThreshold = cpuPercentThreshold;
            return this;
        }

        /**
         * GpuPercentThreshold.
         */
        public Builder gpuPercentThreshold(Integer gpuPercentThreshold) {
            this.gpuPercentThreshold = gpuPercentThreshold;
            return this;
        }

        /**
         * IdleTimeInMinutes.
         */
        public Builder idleTimeInMinutes(Integer idleTimeInMinutes) {
            this.idleTimeInMinutes = idleTimeInMinutes;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxIdleTimeInMinutes.
         */
        public Builder maxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
            this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetIdleInstanceCullerResponseBody build() {
            return new GetIdleInstanceCullerResponseBody(this);
        } 

    } 

}
