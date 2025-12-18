// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetInstanceGroupInspectReportDetailRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceGroupInspectReportDetailRequest</p>
 */
public class GetInstanceGroupInspectReportDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    private GetInstanceGroupInspectReportDetailRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceGroupInspectReportDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetInstanceGroupInspectReportDetailRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceGroupInspectReportDetailRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13f52040-5a6e-42c3-bb84-051f5d6d****</p>
         */
        public Builder reportId(String reportId) {
            this.putBodyParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetInstanceGroupInspectReportDetailRequest build() {
            return new GetInstanceGroupInspectReportDetailRequest(this);
        } 

    } 

}
