// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link ResourceSpec} extends {@link TeaModel}
 *
 * <p>ResourceSpec</p>
 */
public class ResourceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Double cpu;

    @com.aliyun.core.annotation.NameInMap("memory")
    private String memory;

    private ResourceSpec(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceSpec create() {
        return builder().build();
    }

    /**
     * @return cpu
     */
    public Double getCpu() {
        return this.cpu;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    public static final class Builder {
        private Double cpu; 
        private String memory; 

        /**
         * cpu.
         */
        public Builder cpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public ResourceSpec build() {
            return new ResourceSpec(this);
        } 

    } 

}
