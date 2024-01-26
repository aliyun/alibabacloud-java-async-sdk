// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20190522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportResponseBody</p>
 */
public class GetReportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshot")
    private String snapshot;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Summary")
    private String summary;

    private GetReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.snapshot = builder.snapshot;
        this.success = builder.success;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return snapshot
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String snapshot; 
        private Boolean success; 
        private String summary; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Snapshot.
         */
        public Builder snapshot(String snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public GetReportResponseBody build() {
            return new GetReportResponseBody(this);
        } 

    } 

}
