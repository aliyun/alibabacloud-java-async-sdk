// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link DescribeNisInspectionReportSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeNisInspectionReportSummaryRequest</p>
 */
public class DescribeNisInspectionReportSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionReportId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String inspectionReportId;

    private DescribeNisInspectionReportSummaryRequest(Builder builder) {
        super(builder);
        this.inspectionReportId = builder.inspectionReportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionReportSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionReportId
     */
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public static final class Builder extends Request.Builder<DescribeNisInspectionReportSummaryRequest, Builder> {
        private String inspectionReportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNisInspectionReportSummaryRequest request) {
            super(request);
            this.inspectionReportId = request.inspectionReportId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nir-38abb318b27b49cc9a01</p>
         */
        public Builder inspectionReportId(String inspectionReportId) {
            this.putQueryParameter("InspectionReportId", inspectionReportId);
            this.inspectionReportId = inspectionReportId;
            return this;
        }

        @Override
        public DescribeNisInspectionReportSummaryRequest build() {
            return new DescribeNisInspectionReportSummaryRequest(this);
        } 

    } 

}
