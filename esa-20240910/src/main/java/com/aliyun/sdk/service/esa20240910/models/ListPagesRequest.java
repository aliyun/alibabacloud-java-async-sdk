// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListPagesRequest} extends {@link RequestModel}
 *
 * <p>ListPagesRequest</p>
 */
public class ListPagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private QueryArgs queryArgs;

    private ListPagesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryArgs = builder.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPagesRequest create() {
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
     * @return queryArgs
     */
    public QueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public static final class Builder extends Request.Builder<ListPagesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private QueryArgs queryArgs; 

        private Builder() {
            super();
        } 

        private Builder(ListPagesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryArgs = request.queryArgs;
        } 

        /**
         * <p>The page number. Valid values: <strong>1 to 100000</strong>. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryArgs.
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        @Override
        public ListPagesRequest build() {
            return new ListPagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPagesRequest} extends {@link TeaModel}
     *
     * <p>ListPagesRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameDescriptionLike")
        private String nameDescriptionLike;

        private QueryArgs(Builder builder) {
            this.nameDescriptionLike = builder.nameDescriptionLike;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
            return builder().build();
        }

        /**
         * @return nameDescriptionLike
         */
        public String getNameDescriptionLike() {
            return this.nameDescriptionLike;
        }

        public static final class Builder {
            private String nameDescriptionLike; 

            private Builder() {
            } 

            private Builder(QueryArgs model) {
                this.nameDescriptionLike = model.nameDescriptionLike;
            } 

            /**
             * NameDescriptionLike.
             */
            public Builder nameDescriptionLike(String nameDescriptionLike) {
                this.nameDescriptionLike = nameDescriptionLike;
                return this;
            }

            public QueryArgs build() {
                return new QueryArgs(this);
            } 

        } 

    }
}
