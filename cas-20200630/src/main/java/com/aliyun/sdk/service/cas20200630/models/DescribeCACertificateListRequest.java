// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCACertificateListRequest</p>
 */
public class DescribeCACertificateListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ShowSize")
    private Integer showSize;

    private DescribeCACertificateListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCACertificateListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCACertificateListRequest, Builder> {
        private Integer currentPage; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCACertificateListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.showSize = request.showSize;
        } 

        /**
         * The number of CA certificates to return on each page. Default value: **20**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The object.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public DescribeCACertificateListRequest build() {
            return new DescribeCACertificateListRequest(this);
        } 

    } 

}
