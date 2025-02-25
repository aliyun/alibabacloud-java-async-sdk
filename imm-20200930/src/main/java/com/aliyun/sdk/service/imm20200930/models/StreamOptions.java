// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link StreamOptions} extends {@link TeaModel}
 *
 * <p>StreamOptions</p>
 */
public class StreamOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IncrementalOutput")
    private Boolean incrementalOutput;

    private StreamOptions(Builder builder) {
        this.incrementalOutput = builder.incrementalOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StreamOptions create() {
        return builder().build();
    }

    /**
     * @return incrementalOutput
     */
    public Boolean getIncrementalOutput() {
        return this.incrementalOutput;
    }

    public static final class Builder {
        private Boolean incrementalOutput; 

        /**
         * IncrementalOutput.
         */
        public Builder incrementalOutput(Boolean incrementalOutput) {
            this.incrementalOutput = incrementalOutput;
            return this;
        }

        public StreamOptions build() {
            return new StreamOptions(this);
        } 

    } 

}
