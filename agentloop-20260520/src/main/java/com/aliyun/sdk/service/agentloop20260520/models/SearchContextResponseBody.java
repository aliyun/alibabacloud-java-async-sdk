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

    @com.aliyun.core.annotation.NameInMap("recallEventId")
    private String recallEventId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<java.util.Map<String, ?>> results;

    private SearchContextResponseBody(Builder builder) {
        this.auditStatus = builder.auditStatus;
        this.recallEventId = builder.recallEventId;
        this.requestId = builder.requestId;
        this.results = builder.results;
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
     * @return recallEventId
     */
    public String getRecallEventId() {
        return this.recallEventId;
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

    public static final class Builder {
        private String auditStatus; 
        private String recallEventId; 
        private String requestId; 
        private java.util.List<java.util.Map<String, ?>> results; 

        private Builder() {
        } 

        private Builder(SearchContextResponseBody model) {
            this.auditStatus = model.auditStatus;
            this.recallEventId = model.recallEventId;
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * auditStatus.
         */
        public Builder auditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * recallEventId.
         */
        public Builder recallEventId(String recallEventId) {
            this.recallEventId = recallEventId;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate and troubleshoot issues.</p>
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

        public SearchContextResponseBody build() {
            return new SearchContextResponseBody(this);
        } 

    } 

}
