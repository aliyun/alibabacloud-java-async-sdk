// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIncidentTracingJudgeRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentTracingJudgeRequest</p>
 */
public class QueryIncidentTracingJudgeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incidentId;

    private QueryIncidentTracingJudgeRequest(Builder builder) {
        super(builder);
        this.incidentId = builder.incidentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentTracingJudgeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    public static final class Builder extends Request.Builder<QueryIncidentTracingJudgeRequest, Builder> {
        private String incidentId; 

        private Builder() {
            super();
        } 

        private Builder(QueryIncidentTracingJudgeRequest request) {
            super(request);
            this.incidentId = request.incidentId;
        } 

        /**
         * <p>The ID of the event that you want to query.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2621307.html">DescribeCloudSiemEvents</a> operation to query the event ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d1d7a612-0dc2-413a-aa8e-9c7c88d8d12a</p>
         */
        public Builder incidentId(String incidentId) {
            this.putBodyParameter("IncidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        @Override
        public QueryIncidentTracingJudgeRequest build() {
            return new QueryIncidentTracingJudgeRequest(this);
        } 

    } 

}
