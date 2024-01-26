// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20190522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAliwareReportRequest} extends {@link RequestModel}
 *
 * <p>GetAliwareReportRequest</p>
 */
public class GetAliwareReportRequest extends Request {
    @Query
    @NameInMap("ReportId")
    private Long reportId;

    private GetAliwareReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliwareReportRequest create() {
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

    public static final class Builder extends Request.Builder<GetAliwareReportRequest, Builder> {
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetAliwareReportRequest request) {
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
        public GetAliwareReportRequest build() {
            return new GetAliwareReportRequest(this);
        } 

    } 

}
