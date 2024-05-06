// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkerResourceRequest} extends {@link RequestModel}
 *
 * <p>ListWorkerResourceRequest</p>
 */
public class ListWorkerResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProduct")
    private String cloudProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListWorkerResourceRequest(Builder builder) {
        super(builder);
        this.cloudProduct = builder.cloudProduct;
        this.currentPage = builder.currentPage;
        this.jobId = builder.jobId;
        this.showSize = builder.showSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkerResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudProduct
     */
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListWorkerResourceRequest, Builder> {
        private String cloudProduct; 
        private Integer currentPage; 
        private Long jobId; 
        private Integer showSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkerResourceRequest request) {
            super(request);
            this.cloudProduct = request.cloudProduct;
            this.currentPage = request.currentPage;
            this.jobId = request.jobId;
            this.showSize = request.showSize;
            this.status = request.status;
        } 

        /**
         * CloudProduct.
         */
        public Builder cloudProduct(String cloudProduct) {
            this.putQueryParameter("CloudProduct", cloudProduct);
            this.cloudProduct = cloudProduct;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListWorkerResourceRequest build() {
            return new ListWorkerResourceRequest(this);
        } 

    } 

}
