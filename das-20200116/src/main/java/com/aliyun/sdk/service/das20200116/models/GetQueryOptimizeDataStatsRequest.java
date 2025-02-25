// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetQueryOptimizeDataStatsRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeDataStatsRequest</p>
 */
public class GetQueryOptimizeDataStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Asc")
    private String asc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbNames")
    private String dbNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private String keywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalOperator")
    private String logicalOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyOptimizedSql")
    private String onlyOptimizedSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    private String rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlIds")
    private String sqlIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagNames")
    private String tagNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String time;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

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
        this.region = builder.region;
        this.rules = builder.rules;
        this.sqlIds = builder.sqlIds;
        this.tagNames = builder.tagNames;
        this.time = builder.time;
        this.user = builder.user;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
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
        private String region; 
        private String rules; 
        private String sqlIds; 
        private String tagNames; 
        private String time; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeDataStatsRequest request) {
            super(request);
            this.asc = request.asc;
            this.dbNames = request.dbNames;
            this.engine = request.engine;
            this.instanceIds = request.instanceIds;
            this.keywords = request.keywords;
            this.logicalOperator = request.logicalOperator;
            this.onlyOptimizedSql = request.onlyOptimizedSql;
            this.orderBy = request.orderBy;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.rules = request.rules;
            this.sqlIds = request.sqlIds;
            this.tagNames = request.tagNames;
            this.time = request.time;
            this.user = request.user;
        } 

        /**
         * <p>Specifies whether to sort the returned entries in ascending order. Default value: <strong>true</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sorts the returned entries in ascending order.</li>
         * <li><strong>false</strong>: does not sort the returned entries in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder asc(String asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * <p>The name of the database to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb01</p>
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
            return this;
        }

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PolarDBMySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The instance IDs. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The keywords of the SQL template. Separate multiple keywords with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>select update</p>
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>The logical relationship between multiple keywords. Valid values:</p>
         * <ul>
         * <li><strong>or</strong></li>
         * <li><strong>and</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        public Builder logicalOperator(String logicalOperator) {
            this.putQueryParameter("LogicalOperator", logicalOperator);
            this.logicalOperator = logicalOperator;
            return this;
        }

        /**
         * <p>Specifies whether to query only SQL templates that need to be optimized. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: queries only SQL templates that need to be optimized.</li>
         * <li><strong>false</strong>: does not query only SQL statements that need to be optimized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder onlyOptimizedSql(String onlyOptimizedSql) {
            this.putQueryParameter("OnlyOptimizedSql", onlyOptimizedSql);
            this.onlyOptimizedSql = onlyOptimizedSql;
            return this;
        }

        /**
         * <p>The field by which to sort the returned entries. Default value: <strong>count</strong>. Valid values:</p>
         * <ul>
         * <li><strong>count</strong>: the number of executions.</li>
         * <li><strong>maxQueryTime</strong>: the longest execution time.</li>
         * <li><strong>avgQueryTime</strong>: the average execution time.</li>
         * <li><strong>maxLockTime</strong>: the longest lock wait time.</li>
         * <li><strong>avgLockTime</strong>: the longest lock wait time.</li>
         * <li><strong>maxRowsExamined</strong>: the largest number of scanned rows.</li>
         * <li><strong>avgRowsExamined</strong>: the average number of scanned rows.</li>
         * <li><strong>maxRowsSent</strong>: the largest number of returned rows.</li>
         * <li><strong>avgRowsSent</strong>: the average number of returned rows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region in which the instance resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-china</strong>: Chinese mainland</li>
         * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * </ul>
         * <p>This parameter takes effect only if <strong>InstanceIds</strong> is left empty. If you leave <strong>InstanceIds</strong> empty, the system obtains data from the region set by <strong>Region</strong>. By default, Region is set to <strong>cn-china</strong>. If you specify <strong>InstanceIds</strong>, <strong>Region</strong> does not take effect and the system obtains data from the region in which the first specified instance resides.****</p>
         * <blockquote>
         * <p> Set this parameter to <strong>cn-china</strong> for the instances that are created in the regions in the Chinese mainland.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-china</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The tags that are used to filter SQL templates. Separate multiple tags with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/290038.html">Query governance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DAS_NOT_IMPORTANT</p>
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The SQL template ID. You can query the ID of a template by calling the <a href="https://help.aliyun.com/document_detail/405235.html">GetQueryOptimizeExecErrorStats</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
         */
        public Builder sqlIds(String sqlIds) {
            this.putQueryParameter("SqlIds", sqlIds);
            this.sqlIds = sqlIds;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder tagNames(String tagNames) {
            this.putQueryParameter("TagNames", tagNames);
            this.tagNames = tagNames;
            return this;
        }

        /**
         * <p>The time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1642953600000</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        /**
         * <p>The account of the database to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public GetQueryOptimizeDataStatsRequest build() {
            return new GetQueryOptimizeDataStatsRequest(this);
        } 

    } 

}
