// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoTrialLogsResponseBody</p>
 */
public class ListHpoTrialLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Detail")
    private java.util.Map < String, ? > detail;

    @NameInMap("Logs")
    private java.util.List < String > logs;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.Map < String, ? > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Logs.
         */
        public Builder logs(java.util.List < String > logs) {
            this.logs = logs;
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
         * TotalCount.
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
