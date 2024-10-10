// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWafRulesRequest} extends {@link RequestModel}
 *
 * <p>ListWafRulesRequest</p>
 */
public class ListWafRulesRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private ListWafRulesRequest(Builder builder) {
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

    public static ListWafRulesRequest create() {
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

    public static final class Builder extends Request.Builder<ListWafRulesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String phase; 
        private QueryArgs queryArgs; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListWafRulesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phase = request.phase;
            this.queryArgs = request.queryArgs;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
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
         * Phase.
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
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

        /**
         * <p>This parameter is required.</p>
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
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public ListWafRulesRequest build() {
            return new ListWafRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListWafRulesRequest} extends {@link TeaModel}
     *
     * <p>ListWafRulesRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private Boolean desc;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdNameLike")
        private String idNameLike;

        @com.aliyun.core.annotation.NameInMap("NameLike")
        private String nameLike;

        @com.aliyun.core.annotation.NameInMap("OrderBy")
        private String orderBy;

        @com.aliyun.core.annotation.NameInMap("RulesetId")
        private Long rulesetId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private QueryArgs(Builder builder) {
            this.desc = builder.desc;
            this.id = builder.id;
            this.idNameLike = builder.idNameLike;
            this.nameLike = builder.nameLike;
            this.orderBy = builder.orderBy;
            this.rulesetId = builder.rulesetId;
            this.status = builder.status;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idNameLike
         */
        public String getIdNameLike() {
            return this.idNameLike;
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

        /**
         * @return rulesetId
         */
        public Long getRulesetId() {
            return this.rulesetId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean desc; 
            private Long id; 
            private String idNameLike; 
            private String nameLike; 
            private String orderBy; 
            private Long rulesetId; 
            private String status; 

            /**
             * Desc.
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdNameLike.
             */
            public Builder idNameLike(String idNameLike) {
                this.idNameLike = idNameLike;
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

            /**
             * RulesetId.
             */
            public Builder rulesetId(Long rulesetId) {
                this.rulesetId = rulesetId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QueryArgs build() {
                return new QueryArgs(this);
            } 

        } 

    }
}
