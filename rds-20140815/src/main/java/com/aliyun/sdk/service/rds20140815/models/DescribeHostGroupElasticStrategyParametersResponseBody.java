// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeHostGroupElasticStrategyParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostGroupElasticStrategyParametersResponseBody</p>
 */
public class DescribeHostGroupElasticStrategyParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CpuShar")
    private Integer cpuShar;

    @com.aliyun.core.annotation.NameInMap("CpuZoom")
    private Integer cpuZoom;

    @com.aliyun.core.annotation.NameInMap("IopsZoom")
    private Integer iopsZoom;

    @com.aliyun.core.annotation.NameInMap("MaxConnZoom")
    private Integer maxConnZoom;

    @com.aliyun.core.annotation.NameInMap("MemoryZoom")
    private Integer memoryZoom;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHostGroupElasticStrategyParametersResponseBody(Builder builder) {
        this.cpuShar = builder.cpuShar;
        this.cpuZoom = builder.cpuZoom;
        this.iopsZoom = builder.iopsZoom;
        this.maxConnZoom = builder.maxConnZoom;
        this.memoryZoom = builder.memoryZoom;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostGroupElasticStrategyParametersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuShar
     */
    public Integer getCpuShar() {
        return this.cpuShar;
    }

    /**
     * @return cpuZoom
     */
    public Integer getCpuZoom() {
        return this.cpuZoom;
    }

    /**
     * @return iopsZoom
     */
    public Integer getIopsZoom() {
        return this.iopsZoom;
    }

    /**
     * @return maxConnZoom
     */
    public Integer getMaxConnZoom() {
        return this.maxConnZoom;
    }

    /**
     * @return memoryZoom
     */
    public Integer getMemoryZoom() {
        return this.memoryZoom;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer cpuShar; 
        private Integer cpuZoom; 
        private Integer iopsZoom; 
        private Integer maxConnZoom; 
        private Integer memoryZoom; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHostGroupElasticStrategyParametersResponseBody model) {
            this.cpuShar = model.cpuShar;
            this.cpuZoom = model.cpuZoom;
            this.iopsZoom = model.iopsZoom;
            this.maxConnZoom = model.maxConnZoom;
            this.memoryZoom = model.memoryZoom;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The CPU utilization of the instance. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder cpuShar(Integer cpuShar) {
            this.cpuShar = cpuShar;
            return this;
        }

        /**
         * <p>The number of CPU cores used by the instance. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder cpuZoom(Integer cpuZoom) {
            this.cpuZoom = cpuZoom;
            return this;
        }

        /**
         * <p>The number of I/O requests.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder iopsZoom(Integer iopsZoom) {
            this.iopsZoom = iopsZoom;
            return this;
        }

        /**
         * <p>The maximum number of concurrent connections supported by the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxConnZoom(Integer maxConnZoom) {
            this.maxConnZoom = maxConnZoom;
            return this;
        }

        /**
         * <p>The total memory size of the instance in the dedicated cluster. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder memoryZoom(Integer memoryZoom) {
            this.memoryZoom = memoryZoom;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60F9A12A-16B8-4728-B099-4CA38D32C31C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHostGroupElasticStrategyParametersResponseBody build() {
            return new DescribeHostGroupElasticStrategyParametersResponseBody(this);
        } 

    } 

}
