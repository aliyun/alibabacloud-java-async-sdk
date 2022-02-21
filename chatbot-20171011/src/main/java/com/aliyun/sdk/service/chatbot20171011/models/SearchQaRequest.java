// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchQaRequest} extends {@link RequestModel}
 *
 * <p>SearchQaRequest</p>
 */
public class SearchQaRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("UserQuerys")
    private String userQuerys;

    private SearchQaRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.userQuerys = builder.userQuerys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchQaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return userQuerys
     */
    public String getUserQuerys() {
        return this.userQuerys;
    }

    public static final class Builder extends Request.Builder<SearchQaRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String userQuerys; 

        private Builder() {
            super();
        } 

        private Builder(SearchQaRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.userQuerys = response.userQuerys;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        /**
         * UserQuerys.
         */
        public Builder userQuerys(String userQuerys) {
            this.putQueryParameter("UserQuerys", userQuerys);
            this.userQuerys = userQuerys;
            return this;
        }

        @Override
        public SearchQaRequest build() {
            return new SearchQaRequest(this);
        } 

    } 

}
