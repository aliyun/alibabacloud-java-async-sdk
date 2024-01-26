// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20190522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReportRequest} extends {@link RequestModel}
 *
 * <p>GetReportRequest</p>
 */
public class GetReportRequest extends Request {
    @Query
    @NameInMap("ReportId")
    private Long reportId;

    private GetReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportRequest create() {
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

    public static final class Builder extends Request.Builder<GetReportRequest, Builder> {
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetReportRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * ReportId.
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetReportRequest build() {
            return new GetReportRequest(this);
        } 

    } 

}
