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
 * {@link ContainerResources} extends {@link TeaModel}
 *
 * <p>ContainerResources</p>
 */
public class ContainerResources extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    private ContainerResources(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerResources create() {
        return builder().build();
    }

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

    public static final class Builder {
        private Integer cpu; 
        private Integer memory; 

        private Builder() {
        } 

        private Builder(ContainerResources model) {
            this.cpu = model.cpu;
            this.memory = model.memory;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        public ContainerResources build() {
            return new ContainerResources(this);
        } 

    } 

}
