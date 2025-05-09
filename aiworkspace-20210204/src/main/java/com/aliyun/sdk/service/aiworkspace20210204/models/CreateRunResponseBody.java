// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateRunResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRunResponseBody</p>
 */
public class CreateRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RunId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateRunResponseBody(Builder builder) {
        this.runId = builder.runId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String runId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRunResponseBody model) {
            this.runId = model.runId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>run-1meoz7VJd2C6f****</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ADF6D849-*****-7E7030F0CE53</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRunResponseBody build() {
            return new CreateRunResponseBody(this);
        } 

    } 

}
