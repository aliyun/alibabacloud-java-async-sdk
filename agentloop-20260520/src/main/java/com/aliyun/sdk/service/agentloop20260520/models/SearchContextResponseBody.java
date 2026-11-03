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
 * {@link SearchContextResponseBody} extends {@link TeaModel}
 *
 * <p>SearchContextResponseBody</p>
 */
public class SearchContextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("auditStatus")
    private String auditStatus;

    @com.aliyun.core.annotation.NameInMap("callId")
    private String callId;

    @com.aliyun.core.annotation.NameInMap("diagnostics")
    private java.util.Map<String, ?> diagnostics;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("recallEventId")
    private String recallEventId;

    @com.aliyun.core.annotation.NameInMap("relevance")
    private java.util.List<java.util.Map<String, ?>> relevance;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<java.util.Map<String, ?>> results;

    @com.aliyun.core.annotation.NameInMap("rewrittenQueries")
    private java.util.List<String> rewrittenQueries;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("strategyVersion")
    private String strategyVersion;

    private SearchContextResponseBody(Builder builder) {
        this.auditStatus = builder.auditStatus;
        this.callId = builder.callId;
        this.diagnostics = builder.diagnostics;
        this.mode = builder.mode;
        this.recallEventId = builder.recallEventId;
        this.relevance = builder.relevance;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.rewrittenQueries = builder.rewrittenQueries;
        this.status = builder.status;
        this.strategyVersion = builder.strategyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchContextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return diagnostics
     */
    public java.util.Map<String, ?> getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return recallEventId
     */
    public String getRecallEventId() {
        return this.recallEventId;
    }

    /**
     * @return relevance
     */
    public java.util.List<java.util.Map<String, ?>> getRelevance() {
        return this.relevance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<java.util.Map<String, ?>> getResults() {
        return this.results;
    }

    /**
     * @return rewrittenQueries
     */
    public java.util.List<String> getRewrittenQueries() {
        return this.rewrittenQueries;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strategyVersion
     */
    public String getStrategyVersion() {
        return this.strategyVersion;
    }

    public static final class Builder {
        private String auditStatus; 
        private String callId; 
        private java.util.Map<String, ?> diagnostics; 
        private String mode; 
        private String recallEventId; 
        private java.util.List<java.util.Map<String, ?>> relevance; 
        private String requestId; 
        private java.util.List<java.util.Map<String, ?>> results; 
        private java.util.List<String> rewrittenQueries; 
        private String status; 
        private String strategyVersion; 

        private Builder() {
        } 

        private Builder(SearchContextResponseBody model) {
            this.auditStatus = model.auditStatus;
            this.callId = model.callId;
            this.diagnostics = model.diagnostics;
            this.mode = model.mode;
            this.recallEventId = model.recallEventId;
            this.relevance = model.relevance;
            this.requestId = model.requestId;
            this.results = model.results;
            this.rewrittenQueries = model.rewrittenQueries;
            this.status = model.status;
            this.strategyVersion = model.strategyVersion;
        } 

        /**
         * <p>The audit write status. Valid values: ok and degraded.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder auditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * <p>The call ID for the multi-strategy recall of the experience store.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * <p>The diagnostics information for the current experience recall, including duration, model call volume, and filtering. The actual diagnostics items are determined by the running mode.</p>
         */
        public Builder diagnostics(java.util.Map<String, ?> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        /**
         * <p>The actual experience recall mode used for the current request. Valid values: direct, agentic, and hybrid.</p>
         * 
         * <strong>example:</strong>
         * <p>agentic</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The ID of the recall event. You can use this ID to call the GetContextStoreRecall operation to view audit details.</p>
         * 
         * <strong>example:</strong>
         * <p>0190f1c2-7d3e-7a1b-9c4d-2e5f6a7b8c9d</p>
         */
        public Builder recallEventId(String recallEventId) {
            this.recallEventId = recallEventId;
            return this;
        }

        /**
         * <p>The list of relevance judgment results for candidate experiences.</p>
         */
        public Builder relevance(java.util.List<java.util.Map<String, ?>> relevance) {
            this.relevance = relevance;
            return this;
        }

        /**
         * <p>The ID of the request. You can use this ID to locate the request for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of retrieval results, sorted by similarity in descending order.</p>
         */
        public Builder results(java.util.List<java.util.Map<String, ?>> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The list of rewritten queries generated based on the original retrieval query. The original query is not included.</p>
         */
        public Builder rewrittenQueries(java.util.List<String> rewrittenQueries) {
            this.rewrittenQueries = rewrittenQueries;
            return this;
        }

        /**
         * <p>The processing status of the current experience recall call. Valid values: success, degraded, failed, and error.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The strategy implementation version used for the current experience recall. This is used for auditing and result tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>experience-recall-20261031-v5</p>
         */
        public Builder strategyVersion(String strategyVersion) {
            this.strategyVersion = strategyVersion;
            return this;
        }

        public SearchContextResponseBody build() {
            return new SearchContextResponseBody(this);
        } 

    } 

}
