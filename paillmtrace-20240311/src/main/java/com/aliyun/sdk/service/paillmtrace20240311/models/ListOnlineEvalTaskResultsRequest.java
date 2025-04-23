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
 * {@link ListOnlineEvalTaskResultsRequest} extends {@link RequestModel}
 *
 * <p>ListOnlineEvalTaskResultsRequest</p>
 */
public class ListOnlineEvalTaskResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationId")
    private String evaluationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MostRecentResultsOnly")
    private Boolean mostRecentResultsOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceIds")
    private java.util.List<String> traceIds;

    private ListOnlineEvalTaskResultsRequest(Builder builder) {
        super(builder);
        this.evaluationId = builder.evaluationId;
        this.mostRecentResultsOnly = builder.mostRecentResultsOnly;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.traceIds = builder.traceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnlineEvalTaskResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluationId
     */
    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * @return mostRecentResultsOnly
     */
    public Boolean getMostRecentResultsOnly() {
        return this.mostRecentResultsOnly;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return traceIds
     */
    public java.util.List<String> getTraceIds() {
        return this.traceIds;
    }

    public static final class Builder extends Request.Builder<ListOnlineEvalTaskResultsRequest, Builder> {
        private String evaluationId; 
        private Boolean mostRecentResultsOnly; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> traceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListOnlineEvalTaskResultsRequest request) {
            super(request);
            this.evaluationId = request.evaluationId;
            this.mostRecentResultsOnly = request.mostRecentResultsOnly;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.traceIds = request.traceIds;
        } 

        /**
         * EvaluationId.
         */
        public Builder evaluationId(String evaluationId) {
            this.putQueryParameter("EvaluationId", evaluationId);
            this.evaluationId = evaluationId;
            return this;
        }

        /**
         * MostRecentResultsOnly.
         */
        public Builder mostRecentResultsOnly(Boolean mostRecentResultsOnly) {
            this.putQueryParameter("MostRecentResultsOnly", mostRecentResultsOnly);
            this.mostRecentResultsOnly = mostRecentResultsOnly;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TraceIds.
         */
        public Builder traceIds(java.util.List<String> traceIds) {
            String traceIdsShrink = shrink(traceIds, "TraceIds", "simple");
            this.putQueryParameter("TraceIds", traceIdsShrink);
            this.traceIds = traceIds;
            return this;
        }

        @Override
        public ListOnlineEvalTaskResultsRequest build() {
            return new ListOnlineEvalTaskResultsRequest(this);
        } 

    } 

}
