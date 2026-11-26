// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link GetAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentResponseBody</p>
 */
public class GetAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StopTime")
    private String stopTime;

    private GetAgentResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.stopTime = builder.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentResponseBody create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stopTime
     */
    public String getStopTime() {
        return this.stopTime;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private String stopTime; 

        private Builder() {
        } 

        private Builder(GetAgentResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.stopTime = model.stopTime;
        } 

        /**
         * <p>Status message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Start timestamp, in Unix time, measured in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751513144838</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Agent status. Valid values: 0 (not started), 1 (starting), 2 (running), 3 (stopping), 4 (stopped), or 5 (failed).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>End timestamp, in Unix time, measured in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751513144838</p>
         */
        public Builder stopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }

        public GetAgentResponseBody build() {
            return new GetAgentResponseBody(this);
        } 

    } 

}
