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
 * {@link DescribeFaultReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeFaultReportRequest</p>
 */
public class DescribeFaultReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    private DescribeFaultReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultReportRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeFaultReportRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFaultReportRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>The report ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100184932123</p>
         */
        public Builder reportId(String reportId) {
            this.putBodyParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DescribeFaultReportRequest build() {
            return new DescribeFaultReportRequest(this);
        } 

    } 

}
