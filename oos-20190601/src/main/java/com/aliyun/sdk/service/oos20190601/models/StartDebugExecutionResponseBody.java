// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link StartDebugExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartDebugExecutionResponseBody</p>
 */
public class StartDebugExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionId")
    private String executionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartDebugExecutionResponseBody(Builder builder) {
        this.executionId = builder.executionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDebugExecutionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String executionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(StartDebugExecutionResponseBody model) {
            this.executionId = model.executionId;
            this.requestId = model.requestId;
        } 

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartDebugExecutionResponseBody build() {
            return new StartDebugExecutionResponseBody(this);
        } 

    } 

}
