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
         * cpuCores.
         */
        public Builder cpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }

        /**
         * memoryGB.
         */
        public Builder memoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }

        /**
         * tagValue.
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
