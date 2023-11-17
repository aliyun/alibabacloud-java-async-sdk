// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescriberPython3ScriptLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescriberPython3ScriptLogsResponseBody</p>
 */
public class DescriberPython3ScriptLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunResult")
    private String runResult;

    private DescriberPython3ScriptLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.runResult = builder.runResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescriberPython3ScriptLogsResponseBody create() {
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

        public DescriberPython3ScriptLogsResponseBody build() {
            return new DescriberPython3ScriptLogsResponseBody(this);
        } 

    } 

}
