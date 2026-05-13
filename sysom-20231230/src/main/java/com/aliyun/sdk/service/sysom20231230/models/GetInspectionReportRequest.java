// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetInspectionReportRequest} extends {@link RequestModel}
 *
 * <p>GetInspectionReportRequest</p>
 */
public class GetInspectionReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reportId")
    private String reportId;

    private GetInspectionReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInspectionReportRequest create() {
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

    public static final class Builder extends Request.Builder<GetInspectionReportRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetInspectionReportRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * reportId.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("reportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetInspectionReportRequest build() {
            return new GetInspectionReportRequest(this);
        } 

    } 

}
