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
 * {@link ListWafRulesetsRequest} extends {@link RequestModel}
 *
 * <p>ListWafRulesetsRequest</p>
 */
public class ListWafRulesetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private QueryArgs queryArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private ListWafRulesetsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phase = builder.phase;
        this.queryArgs = builder.queryArgs;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafRulesetsRequest create() {
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
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return queryArgs
     */
    public QueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<ListWafRulesetsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String phase; 
        private QueryArgs queryArgs; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListWafRulesetsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phase = request.phase;
            this.queryArgs = request.queryArgs;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>Page number, specifying the current page number for paginated queries.</p>
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
         * <p>Page size, specifying the number of records per page for paginated queries.</p>
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
         * <p>WAF operation phase, specifying the rule set phase to query.</p>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>Query parameters, passed in JSON format, containing various filtering conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Site version.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public ListWafRulesetsRequest build() {
            return new ListWafRulesetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListWafRulesetsRequest} extends {@link TeaModel}
     *
     * <p>ListWafRulesetsRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnyLike")
        private String anyLike;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private Boolean desc;

        @com.aliyun.core.annotation.NameInMap("NameLike")
        private String nameLike;

        @com.aliyun.core.annotation.NameInMap("OrderBy")
        private String orderBy;

        private QueryArgs(Builder builder) {
            this.anyLike = builder.anyLike;
            this.desc = builder.desc;
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
         * @return anyLike
         */
        public String getAnyLike() {
            return this.anyLike;
        }

        /**
         * @return desc
         */
        public Boolean getDesc() {
            return this.desc;
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
            private String anyLike; 
            private Boolean desc; 
            private String nameLike; 
            private String orderBy; 

            private Builder() {
            } 

            private Builder(QueryArgs model) {
                this.anyLike = model.anyLike;
                this.desc = model.desc;
                this.nameLike = model.nameLike;
                this.orderBy = model.orderBy;
            } 

            /**
             * <p>Fuzzy search for rule set ID, rule set name, rule ID, and rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder anyLike(String anyLike) {
                this.anyLike = anyLike;
                return this;
            }

            /**
             * <p>Whether to sort in descending order.</p>
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>Fuzzy search for rule set name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder nameLike(String nameLike) {
                this.nameLike = nameLike;
                return this;
            }

            /**
             * <p>Specify the column to sort by.</p>
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
