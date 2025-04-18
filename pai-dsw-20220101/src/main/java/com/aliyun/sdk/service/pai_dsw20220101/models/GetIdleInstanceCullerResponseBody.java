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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetIdleInstanceCullerResponseBody model) {
            this.code = model.code;
            this.cpuPercentThreshold = model.cpuPercentThreshold;
            this.gpuPercentThreshold = model.gpuPercentThreshold;
            this.idleTimeInMinutes = model.idleTimeInMinutes;
            this.instanceId = model.instanceId;
            this.maxIdleTimeInMinutes = model.maxIdleTimeInMinutes;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. Valid values:</p>
         * <ul>
         * <li>InternalError: an internal error. All errors, except for parameter validation errors, are classified as internal errors.</li>
         * <li>ValidationError: a parameter validation error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ValidationError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The CPU utilization threshold. Unit: percentage. Valid values: 1 to 100. If the CPU utilization of the instance is lower than this threshold, the instance is considered idle.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder cpuPercentThreshold(Integer cpuPercentThreshold) {
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
            this.gpuPercentThreshold = gpuPercentThreshold;
            return this;
        }

        /**
         * <p>The time duration for which the instance is idle. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder idleTimeInMinutes(Integer idleTimeInMinutes) {
            this.idleTimeInMinutes = idleTimeInMinutes;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum time duration for which the instance is idle. Unit: minutes. If the time duration for which the instance is idle exceeds this value, the system automatically stops the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder maxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
            this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;XXX&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
