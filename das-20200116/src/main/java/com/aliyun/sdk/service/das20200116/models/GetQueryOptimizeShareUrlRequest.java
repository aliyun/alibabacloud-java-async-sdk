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
 * {@link GetQueryOptimizeShareUrlRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeShareUrlRequest</p>
 */
public class GetQueryOptimizeShareUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Asc")
    private Boolean asc;

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
    private Boolean onlyOptimizedSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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
    private Long time;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private GetQueryOptimizeShareUrlRequest(Builder builder) {
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

    public static GetQueryOptimizeShareUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asc
     */
    public Boolean getAsc() {
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
    public Boolean getOnlyOptimizedSql() {
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
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Long getTime() {
        return this.time;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeShareUrlRequest, Builder> {
        private Boolean asc; 
        private String dbNames; 
        private String engine; 
        private String instanceIds; 
        private String keywords; 
        private String logicalOperator; 
        private Boolean onlyOptimizedSql; 
        private String orderBy; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String region; 
        private String rules; 
        private String sqlIds; 
        private String tagNames; 
        private Long time; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeShareUrlRequest request) {
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
         * <p>Specifies whether to sort the results in ascending order. Default value: <strong>true</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder asc(Boolean asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * <p>The names of the databases to be queried.</p>
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
         * <li><strong>MySQL</strong>: RDS MySQL</li>
         * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL</li>
         * <li><strong>PostgreSQL</strong>: RDS PostgreSQL</li>
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
         * <p>The instance IDs. Separate multiple instance IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The keywords in the SQL text. Separate multiple keywords with spaces.</p>
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
         * <p>The logical relationship between multiple keywords in the SQL text. Valid values:</p>
         * <ul>
         * <li><strong>or</strong>: The OR logical relationship.</li>
         * <li><strong>and</strong>: The AND logical relationship.</li>
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
         * <p>Specifies whether to query only the SQL statements that need to be optimized. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onlyOptimizedSql(Boolean onlyOptimizedSql) {
            this.putQueryParameter("OnlyOptimizedSql", onlyOptimizedSql);
            this.onlyOptimizedSql = onlyOptimizedSql;
            return this;
        }

        /**
         * <p>The field by which to sort the results. Default value: <strong>count</strong>. Valid values:</p>
         * <ul>
         * <li><strong>count</strong>: The number of executions.</li>
         * <li><strong>maxQueryTime</strong>: The maximum execution time.</li>
         * <li><strong>avgQueryTime</strong>: The average execution time.</li>
         * <li><strong>maxLockTime</strong>: The maximum lock wait time.</li>
         * <li><strong>avgLockTime</strong>: The average lock wait time.</li>
         * <li><strong>maxRowsExamined</strong>: The maximum number of scanned rows.</li>
         * <li><strong>avgRowsExamined</strong>: The average number of scanned rows.</li>
         * <li><strong>maxRowsSent</strong>: The maximum number of returned rows.</li>
         * <li><strong>avgRowsSent</strong>: The average number of returned rows.</li>
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
         * <p>The page number of the paging query. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The maximum number of records per page in a paging query. Default value: 10.</p>
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
         * <p>The region where the instance resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-china</strong>: The Chinese mainland.</li>
         * <li><strong>cn-hongkong</strong>: Hong Kong (China).</li>
         * <li><strong>ap-southeast-1</strong>: Singapore.</li>
         * </ul>
         * <p>This parameter is valid only when the <strong>InstanceIds</strong> request parameter is empty. If the <strong>InstanceIds</strong> request parameter is empty, data is retrieved based on the region specified by the <strong>Region</strong> parameter, and the default region is <strong>cn-china</strong>. If the <strong>InstanceIds</strong> request parameter is not empty, data is retrieved based on the region of the first instance specified in <strong>InstanceIds</strong>, regardless of the value of the <strong>Region</strong> parameter.</p>
         * <blockquote>
         * <p>For instances created in regions in the Chinese mainland, set this parameter to <strong>cn-china</strong>.</p>
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
         * <p>The rules to be filtered. Separate multiple rules with commas. For more information, see <a href="https://help.aliyun.com/document_detail/290038.html">Query Governance</a>.</p>
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
         * <p>The SQL template IDs. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query the SQL template IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>6068ce044e3dc9b903979672fb0b69df,d12515c015fc9f41a0778a9e1de0****</p>
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
         * <p>The date when the data is queried. The value is a UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1642953600000</p>
         */
        public Builder time(Long time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        /**
         * <p>The database account to be queried.</p>
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
        public GetQueryOptimizeShareUrlRequest build() {
            return new GetQueryOptimizeShareUrlRequest(this);
        } 

    } 

}
