// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetDiagnosticRequest} extends {@link RequestModel}
 *
 * <p>GetDiagnosticRequest</p>
 */
public class GetDiagnosticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    private GetDiagnosticRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnosticRequest create() {
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

    public static final class Builder extends Request.Builder<GetDiagnosticRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetDiagnosticRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>The ID of the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-d540def087714890****</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetDiagnosticRequest build() {
            return new GetDiagnosticRequest(this);
        } 

    } 

}
