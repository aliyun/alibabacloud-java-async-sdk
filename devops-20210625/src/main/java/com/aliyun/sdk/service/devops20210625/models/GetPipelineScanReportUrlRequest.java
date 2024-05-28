// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineScanReportUrlRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineScanReportUrlRequest</p>
 */
public class GetPipelineScanReportUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reportPath")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1000)
    private String reportPath;

    private GetPipelineScanReportUrlRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.reportPath = builder.reportPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineScanReportUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return reportPath
     */
    public String getReportPath() {
        return this.reportPath;
    }

    public static final class Builder extends Request.Builder<GetPipelineScanReportUrlRequest, Builder> {
        private String organizationId; 
        private String reportPath; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineScanReportUrlRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.reportPath = request.reportPath;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * reportPath.
         */
        public Builder reportPath(String reportPath) {
            this.putBodyParameter("reportPath", reportPath);
            this.reportPath = reportPath;
            return this;
        }

        @Override
        public GetPipelineScanReportUrlRequest build() {
            return new GetPipelineScanReportUrlRequest(this);
        } 

    } 

}
