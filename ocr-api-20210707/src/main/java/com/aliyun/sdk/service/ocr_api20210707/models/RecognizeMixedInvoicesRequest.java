// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMixedInvoicesRequest} extends {@link RequestModel}
 *
 * <p>RecognizeMixedInvoicesRequest</p>
 */
public class RecognizeMixedInvoicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergePdfPages")
    private Boolean mergePdfPages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeMixedInvoicesRequest(Builder builder) {
        super(builder);
        this.mergePdfPages = builder.mergePdfPages;
        this.pageNo = builder.pageNo;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeMixedInvoicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mergePdfPages
     */
    public Boolean getMergePdfPages() {
        return this.mergePdfPages;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RecognizeMixedInvoicesRequest, Builder> {
        private Boolean mergePdfPages; 
        private Integer pageNo; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeMixedInvoicesRequest request) {
            super(request);
            this.mergePdfPages = request.mergePdfPages;
            this.pageNo = request.pageNo;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * MergePdfPages.
         */
        public Builder mergePdfPages(Boolean mergePdfPages) {
            this.putQueryParameter("MergePdfPages", mergePdfPages);
            this.mergePdfPages = mergePdfPages;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RecognizeMixedInvoicesRequest build() {
            return new RecognizeMixedInvoicesRequest(this);
        } 

    } 

}
