// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPerRequestLogsInput} extends {@link TeaModel}
 *
 * <p>GetPerRequestLogsInput</p>
 */
public class GetPerRequestLogsInput extends TeaModel {
    @NameInMap("endTime")
    @Validation(required = true)
    private Long endTime;

    @NameInMap("errorType")
    private String errorType;

    @NameInMap("forwardLine")
    private Long forwardLine;

    @NameInMap("instanceID")
    private String instanceID;

    @NameInMap("isColdStart")
    private Boolean isColdStart;

    @NameInMap("requestID")
    @Validation(required = true)
    private String requestID;

    @NameInMap("startTime")
    @Validation(required = true)
    private Long startTime;

    @NameInMap("timestamp")
    private String timestamp;

    private GetPerRequestLogsInput(Builder builder) {
        this.endTime = builder.endTime;
        this.errorType = builder.errorType;
        this.forwardLine = builder.forwardLine;
        this.instanceID = builder.instanceID;
        this.isColdStart = builder.isColdStart;
        this.requestID = builder.requestID;
        this.startTime = builder.startTime;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPerRequestLogsInput create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return errorType
     */
    public String getErrorType() {
        return this.errorType;
    }

    /**
     * @return forwardLine
     */
    public Long getForwardLine() {
        return this.forwardLine;
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * @return isColdStart
     */
    public Boolean getIsColdStart() {
        return this.isColdStart;
    }

    /**
     * @return requestID
     */
    public String getRequestID() {
        return this.requestID;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long endTime; 
        private String errorType; 
        private Long forwardLine; 
        private String instanceID; 
        private Boolean isColdStart; 
        private String requestID; 
        private Long startTime; 
        private String timestamp; 

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * errorType.
         */
        public Builder errorType(String errorType) {
            this.errorType = errorType;
            return this;
        }

        /**
         * forwardLine.
         */
        public Builder forwardLine(Long forwardLine) {
            this.forwardLine = forwardLine;
            return this;
        }

        /**
         * instanceID.
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }

        /**
         * isColdStart.
         */
        public Builder isColdStart(Boolean isColdStart) {
            this.isColdStart = isColdStart;
            return this;
        }

        /**
         * requestID.
         */
        public Builder requestID(String requestID) {
            this.requestID = requestID;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public GetPerRequestLogsInput build() {
            return new GetPerRequestLogsInput(this);
        } 

    } 

}
