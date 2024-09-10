// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizeReportConfigDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomizeReportConfigDetailRequest</p>
 */
public class DescribeCustomizeReportConfigDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeCustomizeReportConfigDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.reportId = builder.reportId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeReportConfigDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeCustomizeReportConfigDetailRequest, Builder> {
        private String lang; 
        private Long reportId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomizeReportConfigDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.reportId = request.reportId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the report.\
         * <p>
         * You can call the [DescribeCustomizeReportList](~~271655~~) operation to query the ID.
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeCustomizeReportConfigDetailRequest build() {
            return new DescribeCustomizeReportConfigDetailRequest(this);
        } 

    } 

}
