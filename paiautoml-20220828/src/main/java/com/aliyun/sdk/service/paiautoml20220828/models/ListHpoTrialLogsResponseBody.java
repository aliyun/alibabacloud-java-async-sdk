// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoTrialLogsResponseBody</p>
 */
public class ListHpoTrialLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, ? > detail;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List < String > logs;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHpoTrialLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.logs = builder.logs;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoTrialLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, ? > getDetail() {
        return this.detail;
    }

    /**
     * @return logs
     */
    public java.util.List < String > getLogs() {
        return this.logs;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, ? > detail; 
        private java.util.List < String > logs; 
        private String message; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Extra error information.
         */
        public Builder detail(java.util.Map < String, ? > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * The log.
         */
        public Builder logs(java.util.List < String > logs) {
            this.logs = logs;
            return this;
        }

        /**
         * Error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHpoTrialLogsResponseBody build() {
            return new ListHpoTrialLogsResponseBody(this);
        } 

    } 

}
