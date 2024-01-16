// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPython3ScriptResponseBody} extends {@link TeaModel}
 *
 * <p>RunPython3ScriptResponseBody</p>
 */
public class RunPython3ScriptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunResult")
    private String runResult;

    private RunPython3ScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.runResult = builder.runResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPython3ScriptResponseBody create() {
        return builder().build();
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

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The execution result of the Python3 script.
         */
        public Builder runResult(String runResult) {
            this.runResult = runResult;
            return this;
        }

        public RunPython3ScriptResponseBody build() {
            return new RunPython3ScriptResponseBody(this);
        } 

    } 

}
