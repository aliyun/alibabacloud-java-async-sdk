// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link Quota} extends {@link TeaModel}
 *
 * <p>Quota</p>
 */
public class Quota extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpuCores")
    private Integer cpuCores;

    @com.aliyun.core.annotation.NameInMap("memoryGB")
    private Integer memoryGB;

    @com.aliyun.core.annotation.NameInMap("tagValue")
    private String tagValue;

    private Quota(Builder builder) {
        this.cpuCores = builder.cpuCores;
        this.memoryGB = builder.memoryGB;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Quota create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuCores
     */
    public Integer getCpuCores() {
        return this.cpuCores;
    }

    /**
     * @return memoryGB
     */
    public Integer getMemoryGB() {
        return this.memoryGB;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder {
        private Integer cpuCores; 
        private Integer memoryGB; 
        private String tagValue; 

        private Builder() {
        } 

        private Builder(Quota model) {
            this.cpuCores = model.cpuCores;
            this.memoryGB = model.memoryGB;
            this.tagValue = model.tagValue;
        } 

        /**
         * <p>The vCPU quota limit. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder cpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }

        /**
         * <p>The memory quota limit. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder memoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }

        /**
         * <p>Team ID</p>
         * 
         * <strong>example:</strong>
         * <p>f79d6a95-abcd-47a8-9167-eccf0622a998</p>
         */
        public Builder tagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public Quota build() {
            return new Quota(this);
        } 

    } 

}
