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
 * {@link ListSliderCaptchaPagesRequest} extends {@link RequestModel}
 *
 * <p>ListSliderCaptchaPagesRequest</p>
 */
public class ListSliderCaptchaPagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private QueryArgs queryArgs;

    private ListSliderCaptchaPagesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryArgs = builder.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSliderCaptchaPagesRequest create() {
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

    public static final class Builder extends Request.Builder<ListSliderCaptchaPagesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private QueryArgs queryArgs; 

        private Builder() {
            super();
        } 

        private Builder(ListSliderCaptchaPagesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryArgs = request.queryArgs;
        } 

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The filter parameters.</p>
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        @Override
        public ListSliderCaptchaPagesRequest build() {
            return new ListSliderCaptchaPagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSliderCaptchaPagesRequest} extends {@link TeaModel}
     *
     * <p>ListSliderCaptchaPagesRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameLike")
        private String nameLike;

        private QueryArgs(Builder builder) {
            this.nameLike = builder.nameLike;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
            return builder().build();
        }

        /**
         * @return nameLike
         */
        public String getNameLike() {
            return this.nameLike;
        }

        public static final class Builder {
            private String nameLike; 

            private Builder() {
            } 

            private Builder(QueryArgs model) {
                this.nameLike = model.nameLike;
            } 

            /**
             * <p>The fuzzy search keyword for the name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder nameLike(String nameLike) {
                this.nameLike = nameLike;
                return this;
            }

            public QueryArgs build() {
                return new QueryArgs(this);
            } 

        } 

    }
}
