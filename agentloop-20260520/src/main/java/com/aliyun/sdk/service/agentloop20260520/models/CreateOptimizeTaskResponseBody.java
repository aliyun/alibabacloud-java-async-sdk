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
 * {@link CreateOptimizeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOptimizeTaskResponseBody</p>
 */
public class CreateOptimizeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateOptimizeTaskResponseBody(Builder builder) {
        this.optimizeTaskName = builder.optimizeTaskName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOptimizeTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return optimizeTaskName
     */
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String optimizeTaskName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateOptimizeTaskResponseBody model) {
            this.optimizeTaskName = model.optimizeTaskName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The name of the optimization task.</p>
         * 
         * <strong>example:</strong>
         * <p>efficiency-analysis</p>
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.optimizeTaskName = optimizeTaskName;
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

        public CreateOptimizeTaskResponseBody build() {
            return new CreateOptimizeTaskResponseBody(this);
        } 

    } 

}
