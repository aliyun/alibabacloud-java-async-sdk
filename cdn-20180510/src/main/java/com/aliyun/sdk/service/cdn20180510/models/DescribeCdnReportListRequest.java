// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnReportListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnReportListRequest</p>
 */
public class DescribeCdnReportListRequest extends Request {
    @Query
    @NameInMap("ReportId")
    private Long reportId;

    private DescribeCdnReportListRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnReportListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCdnReportListRequest, Builder> {
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnReportListRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * The ID of the operations report that you want to query. If you do not specify an ID, all operations reports are queried.
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DescribeCdnReportListRequest build() {
            return new DescribeCdnReportListRequest(this);
        } 

    } 

}
