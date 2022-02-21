// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeDataStatsRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeDataStatsRequest</p>
 */
public class GetQueryOptimizeDataStatsRequest extends Request {
    @Query
    @NameInMap("Asc")
    private String asc;

    @Query
    @NameInMap("DbNames")
    private String dbNames;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Keywords")
    private String keywords;

    @Query
    @NameInMap("LogicalOperator")
    private String logicalOperator;

    @Query
    @NameInMap("OnlyOptimizedSql")
    private String onlyOptimizedSql;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNo")
    private String pageNo;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("Rules")
    private String rules;

    @Query
    @NameInMap("SqlIds")
    private String sqlIds;

    @Query
    @NameInMap("TagNames")
    private String tagNames;

    @Query
    @NameInMap("Time")
    @Validation(required = true)
    private String time;

    private GetQueryOptimizeDataStatsRequest(Builder builder) {
        super(builder);
        this.asc = builder.asc;
        this.dbNames = builder.dbNames;
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.keywords = builder.keywords;
        this.logicalOperator = builder.logicalOperator;
        this.onlyOptimizedSql = builder.onlyOptimizedSql;
        this.orderBy = builder.orderBy;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.rules = builder.rules;
        this.sqlIds = builder.sqlIds;
        this.tagNames = builder.tagNames;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeDataStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asc
     */
    public String getAsc() {
        return this.asc;
    }

    /**
     * @return dbNames
     */
    public String getDbNames() {
        return this.dbNames;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return logicalOperator
     */
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    /**
     * @return onlyOptimizedSql
     */
    public String getOnlyOptimizedSql() {
        return this.onlyOptimizedSql;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    /**
     * @return sqlIds
     */
    public String getSqlIds() {
        return this.sqlIds;
    }

    /**
     * @return tagNames
     */
    public String getTagNames() {
        return this.tagNames;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeDataStatsRequest, Builder> {
        private String asc; 
        private String dbNames; 
        private String engine; 
        private String instanceIds; 
        private String keywords; 
        private String logicalOperator; 
        private String onlyOptimizedSql; 
        private String orderBy; 
        private String pageNo; 
        private String pageSize; 
        private String rules; 
        private String sqlIds; 
        private String tagNames; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeDataStatsRequest response) {
            super(response);
            this.asc = response.asc;
            this.dbNames = response.dbNames;
            this.engine = response.engine;
            this.instanceIds = response.instanceIds;
            this.keywords = response.keywords;
            this.logicalOperator = response.logicalOperator;
            this.onlyOptimizedSql = response.onlyOptimizedSql;
            this.orderBy = response.orderBy;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.rules = response.rules;
            this.sqlIds = response.sqlIds;
            this.tagNames = response.tagNames;
            this.time = response.time;
        } 

        /**
         * Asc.
         */
        public Builder asc(String asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * DbNames.
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * LogicalOperator.
         */
        public Builder logicalOperator(String logicalOperator) {
            this.putQueryParameter("LogicalOperator", logicalOperator);
            this.logicalOperator = logicalOperator;
            return this;
        }

        /**
         * OnlyOptimizedSql.
         */
        public Builder onlyOptimizedSql(String onlyOptimizedSql) {
            this.putQueryParameter("OnlyOptimizedSql", onlyOptimizedSql);
            this.onlyOptimizedSql = onlyOptimizedSql;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * SqlIds.
         */
        public Builder sqlIds(String sqlIds) {
            this.putQueryParameter("SqlIds", sqlIds);
            this.sqlIds = sqlIds;
            return this;
        }

        /**
         * TagNames.
         */
        public Builder tagNames(String tagNames) {
            this.putQueryParameter("TagNames", tagNames);
            this.tagNames = tagNames;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public GetQueryOptimizeDataStatsRequest build() {
            return new GetQueryOptimizeDataStatsRequest(this);
        } 

    } 

}
