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
 * {@link ListListsRequest} extends {@link RequestModel}
 *
 * <p>ListListsRequest</p>
 */
public class ListListsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private QueryArgs queryArgs;

    private ListListsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryArgs = builder.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListsRequest create() {
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

    public static final class Builder extends Request.Builder<ListListsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private QueryArgs queryArgs; 

        private Builder() {
            super();
        } 

        private Builder(ListListsRequest request) {
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
         * <p>The query arguments in the JSON format, which contain filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>ListLists</p>
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        @Override
        public ListListsRequest build() {
            return new ListListsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListListsRequest} extends {@link TeaModel}
     *
     * <p>ListListsRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private Boolean desc;

        @com.aliyun.core.annotation.NameInMap("DescriptionLike")
        private String descriptionLike;

        @com.aliyun.core.annotation.NameInMap("IdLike")
        private String idLike;

        @com.aliyun.core.annotation.NameInMap("ItemLike")
        private String itemLike;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("NameItemLike")
        private String nameItemLike;

        @com.aliyun.core.annotation.NameInMap("NameLike")
        private String nameLike;

        @com.aliyun.core.annotation.NameInMap("OrderBy")
        private String orderBy;

        private QueryArgs(Builder builder) {
            this.desc = builder.desc;
            this.descriptionLike = builder.descriptionLike;
            this.idLike = builder.idLike;
            this.itemLike = builder.itemLike;
            this.kind = builder.kind;
            this.nameItemLike = builder.nameItemLike;
            this.nameLike = builder.nameLike;
            this.orderBy = builder.orderBy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public Boolean getDesc() {
            return this.desc;
        }

        /**
         * @return descriptionLike
         */
        public String getDescriptionLike() {
            return this.descriptionLike;
        }

        /**
         * @return idLike
         */
        public String getIdLike() {
            return this.idLike;
        }

        /**
         * @return itemLike
         */
        public String getItemLike() {
            return this.itemLike;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return nameItemLike
         */
        public String getNameItemLike() {
            return this.nameItemLike;
        }

        /**
         * @return nameLike
         */
        public String getNameLike() {
            return this.nameLike;
        }

        /**
         * @return orderBy
         */
        public String getOrderBy() {
            return this.orderBy;
        }

        public static final class Builder {
            private Boolean desc; 
            private String descriptionLike; 
            private String idLike; 
            private String itemLike; 
            private String kind; 
            private String nameItemLike; 
            private String nameLike; 
            private String orderBy; 

            /**
             * <p>Specifies whether to sort the returned data in descending order.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The list description for fuzzy search.</p>
             * 
             * <strong>example:</strong>
             * <p>a custom list</p>
             */
            public Builder descriptionLike(String descriptionLike) {
                this.descriptionLike = descriptionLike;
                return this;
            }

            /**
             * <p>The list ID for fuzzy search.</p>
             * 
             * <strong>example:</strong>
             * <p>40000001</p>
             */
            public Builder idLike(String idLike) {
                this.idLike = idLike;
                return this;
            }

            /**
             * <p>The list content for fuzzy search.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.1</p>
             */
            public Builder itemLike(String itemLike) {
                this.itemLike = itemLike;
                return this;
            }

            /**
             * <p>The type of the custom list.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The list name and content for fuzzy search.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.1</p>
             */
            public Builder nameItemLike(String nameItemLike) {
                this.nameItemLike = nameItemLike;
                return this;
            }

            /**
             * <p>The list name for fuzzy search.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder nameLike(String nameLike) {
                this.nameLike = nameLike;
                return this;
            }

            /**
             * <p>The column by which you want to sort the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder orderBy(String orderBy) {
                this.orderBy = orderBy;
                return this;
            }

            public QueryArgs build() {
                return new QueryArgs(this);
            } 

        } 

    }
}
