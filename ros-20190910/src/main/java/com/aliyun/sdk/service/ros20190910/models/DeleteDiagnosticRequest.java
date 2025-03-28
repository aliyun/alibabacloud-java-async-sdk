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
 * {@link DeleteDiagnosticRequest} extends {@link RequestModel}
 *
 * <p>DeleteDiagnosticRequest</p>
 */
public class DeleteDiagnosticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    private DeleteDiagnosticRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDiagnosticRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDiagnosticRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDiagnosticRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>The report ID. You can troubleshoot issues based on the report.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-56a0e30bf9854b00****</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DeleteDiagnosticRequest build() {
            return new DeleteDiagnosticRequest(this);
        } 

    } 

}
