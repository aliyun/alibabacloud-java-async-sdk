// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link OnKubeClusterResource} extends {@link TeaModel}
 *
 * <p>OnKubeClusterResource</p>
 */
public class OnKubeClusterResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private String cpu;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    private OnKubeClusterResource(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnKubeClusterResource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    public static final class Builder {
        private String cpu; 
        private String memory; 

        private Builder() {
        } 

        private Builder(OnKubeClusterResource model) {
            this.cpu = model.cpu;
            this.memory = model.memory;
        } 

        /**
         * Cpu.
         */
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public OnKubeClusterResource build() {
            return new OnKubeClusterResource(this);
        } 

    } 

}
