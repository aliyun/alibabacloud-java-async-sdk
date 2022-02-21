// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineScanReportUrlRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineScanReportUrlRequest</p>
 */
public class GetPipelineScanReportUrlRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("reportPath")
    @Validation(required = true, maxLength = 1000)
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

        private Builder(GetPipelineScanReportUrlRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.reportPath = response.reportPath;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
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
