// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link SendCustomizeReportRequest} extends {@link RequestModel}
 *
 * <p>SendCustomizeReportRequest</p>
 */
public class SendCustomizeReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportId;

    private SendCustomizeReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCustomizeReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<SendCustomizeReportRequest, Builder> {
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(SendCustomizeReportRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>The ID of the security report.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public SendCustomizeReportRequest build() {
            return new SendCustomizeReportRequest(this);
        } 

    } 

}
