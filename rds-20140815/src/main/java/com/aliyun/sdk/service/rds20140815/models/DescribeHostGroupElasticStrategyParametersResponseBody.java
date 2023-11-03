// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostGroupElasticStrategyParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostGroupElasticStrategyParametersResponseBody</p>
 */
public class DescribeHostGroupElasticStrategyParametersResponseBody extends TeaModel {
    @NameInMap("CpuShar")
    private Integer cpuShar;

    @NameInMap("CpuZoom")
    private Integer cpuZoom;

    @NameInMap("IopsZoom")
    private Integer iopsZoom;

    @NameInMap("MaxConnZoom")
    private Integer maxConnZoom;

    @NameInMap("MemoryZoom")
    private Integer memoryZoom;

    @NameInMap("RequestId")
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

        /**
         * The current CPU usage rate of the instance.
         */
        public Builder cpuShar(Integer cpuShar) {
            this.cpuShar = cpuShar;
            return this;
        }

        /**
         * The CPU usage of the instance.
         */
        public Builder cpuZoom(Integer cpuZoom) {
            this.cpuZoom = cpuZoom;
            return this;
        }

        /**
         * Number of IO requests.
         */
        public Builder iopsZoom(Integer iopsZoom) {
            this.iopsZoom = iopsZoom;
            return this;
        }

        /**
         * The maximum number of concurrent connections for instance specifications.
         */
        public Builder maxConnZoom(Integer maxConnZoom) {
            this.maxConnZoom = maxConnZoom;
            return this;
        }

        /**
         * The total amount of memory for instances in the current exclusive cluster.
         */
        public Builder memoryZoom(Integer memoryZoom) {
            this.memoryZoom = memoryZoom;
            return this;
        }

        /**
         * The request ID.
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
