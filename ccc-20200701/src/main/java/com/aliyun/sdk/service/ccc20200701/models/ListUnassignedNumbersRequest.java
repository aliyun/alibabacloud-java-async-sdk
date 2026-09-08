// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListUnassignedNumbersRequest} extends {@link RequestModel}
 *
 * <p>ListUnassignedNumbersRequest</p>
 */
public class ListUnassignedNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    private ListUnassignedNumbersRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchPattern = builder.searchPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnassignedNumbersRequest create() {
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
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public static final class Builder extends Request.Builder<ListUnassignedNumbersRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 

        private Builder() {
            super();
        } 

        private Builder(ListUnassignedNumbersRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
        } 

        /**
         * <p>Page number for paging, ranging from 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Performs Fuzzy Matching based on the number. This parameter is optional and defaults to empty. An empty value indicates no filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>0833</p>
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        @Override
        public ListUnassignedNumbersRequest build() {
            return new ListUnassignedNumbersRequest(this);
        } 

    } 

}
