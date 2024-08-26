// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNisInspectionReportRequest} extends {@link RequestModel}
 *
 * <p>DeleteNisInspectionReportRequest</p>
 */
public class DeleteNisInspectionReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionReportId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String inspectionReportId;

    private DeleteNisInspectionReportRequest(Builder builder) {
        super(builder);
        this.inspectionReportId = builder.inspectionReportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNisInspectionReportRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteNisInspectionReportRequest, Builder> {
        private String inspectionReportId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNisInspectionReportRequest request) {
            super(request);
            this.inspectionReportId = request.inspectionReportId;
        } 

        /**
         * InspectionReportId.
         */
        public Builder inspectionReportId(String inspectionReportId) {
            this.putQueryParameter("InspectionReportId", inspectionReportId);
            this.inspectionReportId = inspectionReportId;
            return this;
        }

        @Override
        public DeleteNisInspectionReportRequest build() {
            return new DeleteNisInspectionReportRequest(this);
        } 

    } 

}
