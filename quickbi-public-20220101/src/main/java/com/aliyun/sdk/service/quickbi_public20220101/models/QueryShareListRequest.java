// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryShareListRequest} extends {@link RequestModel}
 *
 * <p>QueryShareListRequest</p>
 */
public class QueryShareListRequest extends Request {
    @Query
    @NameInMap("ReportId")
    @Validation(required = true)
    private String reportId;

    private QueryShareListRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShareListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<QueryShareListRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(QueryShareListRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public QueryShareListRequest build() {
            return new QueryShareListRequest(this);
        } 

    } 

}
