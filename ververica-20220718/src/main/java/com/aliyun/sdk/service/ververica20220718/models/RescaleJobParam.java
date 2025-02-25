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
 * {@link RescaleJobParam} extends {@link TeaModel}
 *
 * <p>RescaleJobParam</p>
 */
public class RescaleJobParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobParallelism")
    private Long jobParallelism;

    private RescaleJobParam(Builder builder) {
        this.jobParallelism = builder.jobParallelism;
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

    public static final class Builder {
        private Long jobParallelism; 

        /**
         * jobParallelism.
         */
        public Builder jobParallelism(Long jobParallelism) {
            this.jobParallelism = jobParallelism;
            return this;
        }

        public RescaleJobParam build() {
            return new RescaleJobParam(this);
        } 

    } 

}
