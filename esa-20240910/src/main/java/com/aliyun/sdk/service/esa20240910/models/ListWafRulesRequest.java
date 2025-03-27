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
    @com.aliyun.core.annotation.NameInMap("RulesetId")
    private Long rulesetId;

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
        this.rulesetId = builder.rulesetId;
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
     * @return rulesetId
     */
    public Long getRulesetId() {
        return this.rulesetId;
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
        private Long rulesetId; 
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
            this.rulesetId = request.rulesetId;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>Query page number, used for pagination.</p>
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
         * <p>Query page size, used for pagination.</p>
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
         * <p>WAF rule type. Values:</p>
         * <ul>
         * <li>http_anti_scan: Scan protection</li>
         * <li>http_bot: Bots</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>Query filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * RulesetId.
         */
        public Builder rulesetId(Long rulesetId) {
            this.putQueryParameter("RulesetId", rulesetId);
            this.rulesetId = rulesetId;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
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
        @com.aliyun.core.annotation.NameInMap("ConfigValueLike")
        private String configValueLike;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private QueryArgs(Builder builder) {
            this.configValueLike = builder.configValueLike;
            this.desc = builder.desc;
            this.id = builder.id;
            this.idNameLike = builder.idNameLike;
            this.nameLike = builder.nameLike;
            this.orderBy = builder.orderBy;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
            return builder().build();
        }

        /**
         * @return configValueLike
         */
        public String getConfigValueLike() {
            return this.configValueLike;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String configValueLike; 
            private Boolean desc; 
            private Long id; 
            private String idNameLike; 
            private String nameLike; 
            private String orderBy; 
            private String status; 

            private Builder() {
            } 

            private Builder(QueryArgs model) {
                this.configValueLike = model.configValueLike;
                this.desc = model.desc;
                this.id = model.id;
                this.idNameLike = model.idNameLike;
                this.nameLike = model.nameLike;
                this.orderBy = model.orderBy;
                this.status = model.status;
            } 

            /**
             * <p>Fuzzy search for values in IP access control.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder configValueLike(String configValueLike) {
                this.configValueLike = configValueLike;
                return this;
            }

            /**
             * <p>Whether to reverse the sorting result.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>Exact query for WAF rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Fuzzy query for WAF rule ID or name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder idNameLike(String idNameLike) {
                this.idNameLike = idNameLike;
                return this;
            }

            /**
             * <p>Fuzzy query for WAF rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder nameLike(String nameLike) {
                this.nameLike = nameLike;
                return this;
            }

            /**
             * <p>Sort the returned list by the specified column.</p>
             * 
             * <strong>example:</strong>
             * <p>position</p>
             */
            public Builder orderBy(String orderBy) {
                this.orderBy = orderBy;
                return this;
            }

            /**
             * <p>Exact query for WAF rule status.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
