// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRevokeCertificateRequest} extends {@link RequestModel}
 *
 * <p>ListRevokeCertificateRequest</p>
 */
public class ListRevokeCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private ListRevokeCertificateRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRevokeCertificateRequest create() {
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
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListRevokeCertificateRequest, Builder> {
        private Integer currentPage; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListRevokeCertificateRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.showSize = request.showSize;
        } 

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of revoked certificates to return on each page. Default value: **20**.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListRevokeCertificateRequest build() {
            return new ListRevokeCertificateRequest(this);
        } 

    } 

}
