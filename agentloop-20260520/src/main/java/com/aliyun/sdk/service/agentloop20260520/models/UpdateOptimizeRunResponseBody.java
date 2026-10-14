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
 * {@link UpdateOptimizeRunResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOptimizeRunResponseBody</p>
 */
public class UpdateOptimizeRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("optimizeRunId")
    private String optimizeRunId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateOptimizeRunResponseBody(Builder builder) {
        this.optimizeRunId = builder.optimizeRunId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOptimizeRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String optimizeRunId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateOptimizeRunResponseBody model) {
            this.optimizeRunId = model.optimizeRunId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the execution instance.</p>
         * 
         * <strong>example:</strong>
         * <p>or-20260812-0001</p>
         */
        public Builder optimizeRunId(String optimizeRunId) {
            this.optimizeRunId = optimizeRunId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateOptimizeRunResponseBody build() {
            return new UpdateOptimizeRunResponseBody(this);
        } 

    } 

}
