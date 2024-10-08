// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
         * QueryArgs.
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
             * Desc.
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * DescriptionLike.
             */
            public Builder descriptionLike(String descriptionLike) {
                this.descriptionLike = descriptionLike;
                return this;
            }

            /**
             * IdLike.
             */
            public Builder idLike(String idLike) {
                this.idLike = idLike;
                return this;
            }

            /**
             * ItemLike.
             */
            public Builder itemLike(String itemLike) {
                this.itemLike = itemLike;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * NameItemLike.
             */
            public Builder nameItemLike(String nameItemLike) {
                this.nameItemLike = nameItemLike;
                return this;
            }

            /**
             * NameLike.
             */
            public Builder nameLike(String nameLike) {
                this.nameLike = nameLike;
                return this;
            }

            /**
             * OrderBy.
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
