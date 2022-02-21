// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlgorithmsByPageRequest} extends {@link RequestModel}
 *
 * <p>ListAlgorithmsByPageRequest</p>
 */
public class ListAlgorithmsByPageRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("NamePattern")
    private String namePattern;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    private ListAlgorithmsByPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.namePattern = builder.namePattern;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlgorithmsByPageRequest create() {
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
     * @return namePattern
     */
    public String getNamePattern() {
        return this.namePattern;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListAlgorithmsByPageRequest, Builder> {
        private Integer currentPage; 
        private String namePattern; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAlgorithmsByPageRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.namePattern = response.namePattern;
            this.pageSize = response.pageSize;
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
         * NamePattern.
         */
        public Builder namePattern(String namePattern) {
            this.putQueryParameter("NamePattern", namePattern);
            this.namePattern = namePattern;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListAlgorithmsByPageRequest build() {
            return new ListAlgorithmsByPageRequest(this);
        } 

    } 

}
