// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetDocumentSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentSummaryRequest</p>
 */
public class GetDocumentSummaryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    private GetDocumentSummaryRequest(Builder builder) {
        super(builder);
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<GetDocumentSummaryRequest, Builder> {
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentSummaryRequest request) {
            super(request);
            this.reportType = request.reportType;
        } 

        /**
         * <p>Type of service report.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportType(String reportType) {
            this.putBodyParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public GetDocumentSummaryRequest build() {
            return new GetDocumentSummaryRequest(this);
        } 

    } 

}
