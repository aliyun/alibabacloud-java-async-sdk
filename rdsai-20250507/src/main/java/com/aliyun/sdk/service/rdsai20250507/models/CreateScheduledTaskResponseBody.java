// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateScheduledTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScheduledTaskResponseBody</p>
 */
public class CreateScheduledTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScheduledId")
    private String scheduledId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateScheduledTaskResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scheduledId = builder.scheduledId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledTaskResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduledId
     */
    public String getScheduledId() {
        return this.scheduledId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String scheduledId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateScheduledTaskResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.scheduledId = model.scheduledId;
            this.success = model.success;
        } 

        /**
         * <p>The returned message.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D984FD38-6C2D-55DF-B0D7-8BCAC2E1F8C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scheduled inspection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
         */
        public Builder scheduledId(String scheduledId) {
            this.scheduledId = scheduledId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateScheduledTaskResponseBody build() {
            return new CreateScheduledTaskResponseBody(this);
        } 

    } 

}
