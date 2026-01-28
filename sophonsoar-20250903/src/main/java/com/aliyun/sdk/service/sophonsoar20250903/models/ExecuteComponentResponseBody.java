// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link ExecuteComponentResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteComponentResponseBody</p>
 */
public class ExecuteComponentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunResult")
    private String runResult;

    private ExecuteComponentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.runResult = builder.runResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteComponentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runResult
     */
    public String getRunResult() {
        return this.runResult;
    }

    public static final class Builder {
        private String requestId; 
        private String runResult; 

        private Builder() {
        } 

        private Builder(ExecuteComponentResponseBody model) {
            this.requestId = model.requestId;
            this.runResult = model.runResult;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RunResult.
         */
        public Builder runResult(String runResult) {
            this.runResult = runResult;
            return this;
        }

        public ExecuteComponentResponseBody build() {
            return new ExecuteComponentResponseBody(this);
        } 

    } 

}
