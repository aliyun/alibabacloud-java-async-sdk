// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link ListOnlineEvalTaskResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOnlineEvalTaskResultsResponseBody</p>
 */
public class ListOnlineEvalTaskResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EvaluationResults")
    private java.util.List<String> evaluationResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOnlineEvalTaskResultsResponseBody(Builder builder) {
        this.code = builder.code;
        this.evaluationResults = builder.evaluationResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnlineEvalTaskResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return evaluationResults
     */
    public java.util.List<String> getEvaluationResults() {
        return this.evaluationResults;
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
        private java.util.List<String> evaluationResults; 
        private String message; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListOnlineEvalTaskResultsResponseBody model) {
            this.code = model.code;
            this.evaluationResults = model.evaluationResults;
            this.message = model.message;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EvaluationResults.
         */
        public Builder evaluationResults(java.util.List<String> evaluationResults) {
            this.evaluationResults = evaluationResults;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>22BA9A5A-E3D8-5B4C-90FC-F33F6E5853F8</p>
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

        public ListOnlineEvalTaskResultsResponseBody build() {
            return new ListOnlineEvalTaskResultsResponseBody(this);
        } 

    } 

}
