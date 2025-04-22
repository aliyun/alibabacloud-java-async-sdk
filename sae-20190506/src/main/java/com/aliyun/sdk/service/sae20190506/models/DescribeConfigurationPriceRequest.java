// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeConfigurationPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigurationPriceRequest</p>
 */
public class DescribeConfigurationPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
    private String newSaeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workload")
    private String workload;

    private DescribeConfigurationPriceRequest(Builder builder) {
        super(builder);
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.newSaeVersion = builder.newSaeVersion;
        this.resourceType = builder.resourceType;
        this.workload = builder.workload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigurationPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return newSaeVersion
     */
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return workload
     */
    public String getWorkload() {
        return this.workload;
    }

    public static final class Builder extends Request.Builder<DescribeConfigurationPriceRequest, Builder> {
        private Integer cpu; 
        private Integer memory; 
        private String newSaeVersion; 
        private String resourceType; 
        private String workload; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigurationPriceRequest request) {
            super(request);
            this.cpu = request.cpu;
            this.memory = request.memory;
            this.newSaeVersion = request.newSaeVersion;
            this.resourceType = request.resourceType;
            this.workload = request.workload;
        } 

        /**
         * <p>The CPU specifications that are required for each instance. Unit: millicores. This parameter cannot be set to 0. Valid values:</p>
         * <ul>
         * <li><strong>500</strong></li>
         * <li><strong>1000</strong></li>
         * <li><strong>2000</strong></li>
         * <li><strong>4000</strong></li>
         * <li><strong>8000</strong></li>
         * <li><strong>12000</strong></li>
         * <li><strong>16000</strong></li>
         * <li><strong>32000</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The memory size that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
         * <ul>
         * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
         * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 2000.</li>
         * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
         * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8,000.</li>
         * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
         * <li>This parameter is set to <strong>24576</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
         * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
         * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * NewSaeVersion.
         */
        public Builder newSaeVersion(String newSaeVersion) {
            this.putQueryParameter("NewSaeVersion", newSaeVersion);
            this.newSaeVersion = newSaeVersion;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>Scenarios:</p>
         * <ul>
         * <li>Web</li>
         * <li>micro_service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
         */
        public Builder workload(String workload) {
            this.putQueryParameter("Workload", workload);
            this.workload = workload;
            return this;
        }

        @Override
        public DescribeConfigurationPriceRequest build() {
            return new DescribeConfigurationPriceRequest(this);
        } 

    } 

}
