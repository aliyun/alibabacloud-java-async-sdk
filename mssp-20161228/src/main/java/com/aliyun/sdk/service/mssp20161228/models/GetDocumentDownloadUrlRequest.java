// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetDocumentDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentDownloadUrlRequest</p>
 */
public class GetDocumentDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    private GetDocumentDownloadUrlRequest(Builder builder) {
        super(builder);
        this.fileKey = builder.fileKey;
        this.id = builder.id;
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<GetDocumentDownloadUrlRequest, Builder> {
        private String fileKey; 
        private Long id; 
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentDownloadUrlRequest request) {
            super(request);
            this.fileKey = request.fileKey;
            this.id = request.id;
            this.reportType = request.reportType;
        } 

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * <p>Document management ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>175815</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Report type.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder reportType(String reportType) {
            this.putBodyParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public GetDocumentDownloadUrlRequest build() {
            return new GetDocumentDownloadUrlRequest(this);
        } 

    } 

}
