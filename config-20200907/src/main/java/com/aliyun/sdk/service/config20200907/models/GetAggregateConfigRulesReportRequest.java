// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateConfigRulesReportRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateConfigRulesReportRequest</p>
 */
public class GetAggregateConfigRulesReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    private GetAggregateConfigRulesReportRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRulesReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<GetAggregateConfigRulesReportRequest, Builder> {
        private String aggregatorId; 
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateConfigRulesReportRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.reportId = request.reportId;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the compliance evaluation report.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-88176457e0d900c9****</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetAggregateConfigRulesReportRequest build() {
            return new GetAggregateConfigRulesReportRequest(this);
        } 

    } 

}
