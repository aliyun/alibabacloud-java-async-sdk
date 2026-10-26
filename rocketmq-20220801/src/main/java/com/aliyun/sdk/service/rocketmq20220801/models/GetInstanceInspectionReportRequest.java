// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetInstanceInspectionReportRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceInspectionReportRequest</p>
 */
public class GetInstanceInspectionReportRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("reportId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String reportId;

    private GetInstanceInspectionReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceInspectionReportRequest create() {
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

    public static final class Builder extends Request.Builder<GetInstanceInspectionReportRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceInspectionReportRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>irpt-example</p>
         */
        public Builder reportId(String reportId) {
            this.putPathParameter("reportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetInstanceInspectionReportRequest build() {
            return new GetInstanceInspectionReportRequest(this);
        } 

    } 

}
