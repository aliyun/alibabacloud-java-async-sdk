// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
         * <p>The type of work being shared. Valid values:</p>
         * <ul>
         * <li>product: BI portal</li>
         * <li>dashboard: dashboard</li>
         * <li>worksheet: workbook</li>
         * <li>dashboardOfflineQuery: self-service data retrieval</li>
         * <li>Analysis: Ad hoc analysis</li>
         * <li>DATAFORM</li>
         * <li>SCREEN: Data dashboard</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6b407e50-e774-406b-9956-da2425c2****</p>
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
