// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentTracingJudgeRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentTracingJudgeRequest</p>
 */
public class QueryIncidentTracingJudgeRequest extends Request {
    @Body
    @NameInMap("IncidentId")
    @Validation(required = true)
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
         * The ID of the event that you want to query.
         * <p>
         * 
         * >  You can call the [DescribeCloudSiemEvents](~~2621307~~) operation to query the event ID.
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
