// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunPython3ScriptResponseBody} extends {@link TeaModel}
 *
 * <p>RunPython3ScriptResponseBody</p>
 */
public class RunPython3ScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunResult")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F210521C-D9BF-5264-8369-83EDDC617DB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution result of the Python3 script.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;requestUuid&quot;: &quot;fe240b98-27b1-4a36-aec1-550b894318d9&quot;,
         *     &quot;content&quot;: {
         *         &quot;resultData&quot;: [],
         *         &quot;success&quot;: true
         *     }
         * }</p>
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
