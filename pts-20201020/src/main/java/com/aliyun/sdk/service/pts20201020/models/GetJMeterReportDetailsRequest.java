// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetJMeterReportDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetJMeterReportDetailsRequest</p>
 */
public class GetJMeterReportDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    private GetJMeterReportDetailsRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterReportDetailsRequest create() {
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

    public static final class Builder extends Request.Builder<GetJMeterReportDetailsRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetJMeterReportDetailsRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>The report ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KS2YE3J2</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetJMeterReportDetailsRequest build() {
            return new GetJMeterReportDetailsRequest(this);
        } 

    } 

}
