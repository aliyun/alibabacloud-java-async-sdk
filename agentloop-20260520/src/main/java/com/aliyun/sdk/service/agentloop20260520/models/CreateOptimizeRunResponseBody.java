// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateOptimizeRunResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOptimizeRunResponseBody</p>
 */
public class CreateOptimizeRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("optimizeRun")
    private java.util.Map<String, ?> optimizeRun;

    @com.aliyun.core.annotation.NameInMap("optimizeRunId")
    private String optimizeRunId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateOptimizeRunResponseBody(Builder builder) {
        this.optimizeRun = builder.optimizeRun;
        this.optimizeRunId = builder.optimizeRunId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOptimizeRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return optimizeRun
     */
    public java.util.Map<String, ?> getOptimizeRun() {
        return this.optimizeRun;
    }

    /**
     * @return optimizeRunId
     */
    public String getOptimizeRunId() {
        return this.optimizeRunId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> optimizeRun; 
        private String optimizeRunId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateOptimizeRunResponseBody model) {
            this.optimizeRun = model.optimizeRun;
            this.optimizeRunId = model.optimizeRunId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the created run. You can call the GetOptimizeRun operation to query the subsequent status.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;optimizeRunId&quot;:&quot;opr-20261014&quot;,&quot;status&quot;:&quot;Pending&quot;}</p>
         */
        public Builder optimizeRun(java.util.Map<String, ?> optimizeRun) {
            this.optimizeRun = optimizeRun;
            return this;
        }

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>opr-20261014</p>
         */
        public Builder optimizeRunId(String optimizeRunId) {
            this.optimizeRunId = optimizeRunId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOptimizeRunResponseBody build() {
            return new CreateOptimizeRunResponseBody(this);
        } 

    } 

}
