// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryShareListRequest} extends {@link RequestModel}
 *
 * <p>QueryShareListRequest</p>
 */
public class QueryShareListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The type of work being shared. Valid values:
         * <p>
         * 
         * *   product: BI portal
         * *   dashboard: dashboard
         * *   worksheet: workbook
         * *   dashboardOfflineQuery: self-service data retrieval
         * *   Analysis: Ad hoc analysis
         * *   DATAFORM
         * *   SCREEN: Data dashboard
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
