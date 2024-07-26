// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHttpApisRequest} extends {@link RequestModel}
 *
 * <p>ListHttpApisRequest</p>
 */
public class ListHttpApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("publishedOnly")
    private Boolean publishedOnly;

    private ListHttpApisRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publishedOnly = builder.publishedOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHttpApisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publishedOnly
     */
    public Boolean getPublishedOnly() {
        return this.publishedOnly;
    }

    public static final class Builder extends Request.Builder<ListHttpApisRequest, Builder> {
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean publishedOnly; 

        private Builder() {
            super();
        } 

        private Builder(ListHttpApisRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.publishedOnly = request.publishedOnly;
        } 

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * publishedOnly.
         */
        public Builder publishedOnly(Boolean publishedOnly) {
            this.putQueryParameter("publishedOnly", publishedOnly);
            this.publishedOnly = publishedOnly;
            return this;
        }

        @Override
        public ListHttpApisRequest build() {
            return new ListHttpApisRequest(this);
        } 

    } 

}
