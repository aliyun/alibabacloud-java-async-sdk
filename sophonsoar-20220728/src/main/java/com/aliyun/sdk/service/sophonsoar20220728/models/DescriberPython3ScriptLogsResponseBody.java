// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescriberPython3ScriptLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescriberPython3ScriptLogsResponseBody</p>
 */
public class DescriberPython3ScriptLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunResult")
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

        private Builder(DescriberPython3ScriptLogsResponseBody model) {
            this.requestId = model.requestId;
            this.runResult = model.runResult;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D22D8A0C-6E86-57B2-A142-929184122AB1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The operational logs of the Python3 script.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;logs&quot;: [
         *         {
         *             &quot;message&quot;: &quot;function input is {}&quot;
         *         }
         *     ]
         * }</p>
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
