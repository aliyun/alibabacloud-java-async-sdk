// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleJobParam} extends {@link TeaModel}
 *
 * <p>RescaleJobParam</p>
 */
public class RescaleJobParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobParallelism")
    private Long jobParallelism;

    @com.aliyun.core.annotation.NameInMap("vertexParallelism")
    private java.util.Map < String, ? > vertexParallelism;

    private RescaleJobParam(Builder builder) {
        this.jobParallelism = builder.jobParallelism;
        this.vertexParallelism = builder.vertexParallelism;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleJobParam create() {
        return builder().build();
    }

    /**
     * @return jobParallelism
     */
    public Long getJobParallelism() {
        return this.jobParallelism;
    }

    /**
     * @return vertexParallelism
     */
    public java.util.Map < String, ? > getVertexParallelism() {
        return this.vertexParallelism;
    }

    public static final class Builder {
        private Long jobParallelism; 
        private java.util.Map < String, ? > vertexParallelism; 

        /**
         * jobParallelism.
         */
        public Builder jobParallelism(Long jobParallelism) {
            this.jobParallelism = jobParallelism;
            return this;
        }

        /**
         * vertexParallelism.
         */
        public Builder vertexParallelism(java.util.Map < String, ? > vertexParallelism) {
            this.vertexParallelism = vertexParallelism;
            return this;
        }

        public RescaleJobParam build() {
            return new RescaleJobParam(this);
        } 

    } 

}
