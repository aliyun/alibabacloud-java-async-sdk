// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDocumentPageRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentPageRequest</p>
 */
public class GetDocumentPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveredBy")
    private String deliveredBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentName")
    private String documentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentType")
    private String documentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportType;

    private GetDocumentPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deliveredBy = builder.deliveredBy;
        this.documentName = builder.documentName;
        this.documentType = builder.documentType;
        this.pageSize = builder.pageSize;
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deliveredBy
     */
    public String getDeliveredBy() {
        return this.deliveredBy;
    }

    /**
     * @return documentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * @return documentType
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<GetDocumentPageRequest, Builder> {
        private Integer currentPage; 
        private String deliveredBy; 
        private String documentName; 
        private String documentType; 
        private Integer pageSize; 
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentPageRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deliveredBy = request.deliveredBy;
            this.documentName = request.documentName;
            this.documentType = request.documentType;
            this.pageSize = request.pageSize;
            this.reportType = request.reportType;
        } 

        /**
         * <p>Current page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Delivered by.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder deliveredBy(String deliveredBy) {
            this.putBodyParameter("DeliveredBy", deliveredBy);
            this.deliveredBy = deliveredBy;
            return this;
        }

        /**
         * <p>Document name.</p>
         * 
         * <strong>example:</strong>
         * <p>季度报告</p>
         */
        public Builder documentName(String documentName) {
            this.putBodyParameter("DocumentName", documentName);
            this.documentName = documentName;
            return this;
        }

        /**
         * <p>Document type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder documentType(String documentType) {
            this.putBodyParameter("DocumentType", documentType);
            this.documentType = documentType;
            return this;
        }

        /**
         * <p>Page size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Report type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportType(String reportType) {
            this.putBodyParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public GetDocumentPageRequest build() {
            return new GetDocumentPageRequest(this);
        } 

    } 

}
