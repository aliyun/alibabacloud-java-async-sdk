// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link StopNodeDiagnosticRequest} extends {@link RequestModel}
 *
 * <p>StopNodeDiagnosticRequest</p>
 */
public class StopNodeDiagnosticRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    private StopNodeDiagnosticRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopNodeDiagnosticRequest create() {
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

    public static final class Builder extends Request.Builder<StopNodeDiagnosticRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(StopNodeDiagnosticRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>The report ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15678327322</p>
         */
        public Builder reportId(String reportId) {
            this.putBodyParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public StopNodeDiagnosticRequest build() {
            return new StopNodeDiagnosticRequest(this);
        } 

    } 

}
