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
 * {@link CreateExperimentRunResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExperimentRunResponseBody</p>
 */
public class CreateExperimentRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("recordId")
    private String recordId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreateExperimentRunResponseBody(Builder builder) {
        this.message = builder.message;
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String message; 
        private String recordId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateExperimentRunResponseBody model) {
            this.message = model.message;
            this.recordId = model.recordId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Experiment created, execution started</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The experiment record ID. For online experiments, the ID is typically in the format exp-run-{uuid32}. For offline experiments, the ID may also be a standard UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-run-f6d419b0ed3d43a7b585948a55efc07b</p>
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019F89B5-1B07-3BB3-A32E-F5B007029E9C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The experiment record status. The value is typically pending after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateExperimentRunResponseBody build() {
            return new CreateExperimentRunResponseBody(this);
        } 

    } 

}
