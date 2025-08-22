// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnReportListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnReportListRequest</p>
 */
public class DescribeDcdnReportListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    private DescribeDcdnReportListRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnReportListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnReportListRequest, Builder> {
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnReportListRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * <p>The ID of the operations report that you want to query. If you do not specify an ID, all operations reports are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DescribeDcdnReportListRequest build() {
            return new DescribeDcdnReportListRequest(this);
        } 

    } 

}
