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
 * {@link GetReportFromTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetReportFromTemplateRequest</p>
 */
public class GetReportFromTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportTemplateId;

    private GetReportFromTemplateRequest(Builder builder) {
        super(builder);
        this.reportTemplateId = builder.reportTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportFromTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportTemplateId
     */
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    public static final class Builder extends Request.Builder<GetReportFromTemplateRequest, Builder> {
        private String reportTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(GetReportFromTemplateRequest request) {
            super(request);
            this.reportTemplateId = request.reportTemplateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crt-xxx</p>
         */
        public Builder reportTemplateId(String reportTemplateId) {
            this.putQueryParameter("ReportTemplateId", reportTemplateId);
            this.reportTemplateId = reportTemplateId;
            return this;
        }

        @Override
        public GetReportFromTemplateRequest build() {
            return new GetReportFromTemplateRequest(this);
        } 

    } 

}
