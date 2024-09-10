// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReportExportRequest} extends {@link RequestModel}
 *
 * <p>DescribeReportExportRequest</p>
 */
public class DescribeReportExportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long exportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeReportExportRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReportExportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportId
     */
    public Long getExportId() {
        return this.exportId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeReportExportRequest, Builder> {
        private Long exportId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReportExportRequest request) {
            super(request);
            this.exportId = request.exportId;
            this.lang = request.lang;
        } 

        /**
         * The ID of the export task.
         * <p>
         * 
         * >  You can call the [ExportCustomizeReport](~~2842677~~) operation to query the ID.
         */
        public Builder exportId(Long exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
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

        @Override
        public DescribeReportExportRequest build() {
            return new DescribeReportExportRequest(this);
        } 

    } 

}
