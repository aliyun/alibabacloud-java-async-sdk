// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAppliedAdvicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppliedAdvicesRequest</p>
 */
public class DescribeAppliedAdvicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdviceType")
    private String adviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaTableName")
    private String schemaTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeAppliedAdvicesRequest(Builder builder) {
        super(builder);
        this.adviceType = builder.adviceType;
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.schemaTableName = builder.schemaTableName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppliedAdvicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adviceType
     */
    public String getAdviceType() {
        return this.adviceType;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schemaTableName
     */
    public String getSchemaTableName() {
        return this.schemaTableName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeAppliedAdvicesRequest, Builder> {
        private String adviceType; 
        private String DBClusterId; 
        private Long endTime; 
        private String keyword; 
        private String lang; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String schemaTableName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppliedAdvicesRequest request) {
            super(request);
            this.adviceType = request.adviceType;
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.schemaTableName = request.schemaTableName;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The type of the advice. Valid values:</p>
         * <ul>
         * <li><p><strong>INDEX</strong>: index optimization</p>
         * </li>
         * <li><p><strong>TIERING</strong>: hot/cold data optimization</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INDEX</p>
         */
        public Builder adviceType(String adviceType) {
            this.putQueryParameter("AdviceType", adviceType);
            this.adviceType = adviceType;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-uf6g8w25jacm7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end date of the query. The date is in the <code>yyyyMMdd</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>20220824</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The keyword for the query. Fuzzy match by table name is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>you_table_name</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The language of the query results. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
         * <li><p><strong>ja</strong>: Japanese</p>
         * </li>
         * <li><p><strong>zh-tw</strong>: Traditional Chinese</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The order by which to sort the query results. The value is a JSON string. Example: <code>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Fields:</p>
         * <ul>
         * <li><p><code>Field</code>: The field by which to sort the results. Valid values:</p>
         * <ul>
         * <li><p><code>SchemaName</code>: the database name</p>
         * </li>
         * <li><p><code>TableName</code>: the table name</p>
         * </li>
         * <li><p><code>JobStatus</code>: the status of the build job for the table</p>
         * </li>
         * <li><p><code>SubmitTime</code>: the time when the advice was submitted</p>
         * </li>
         * <li><p><code>Benefit</code>: the estimated benefit</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>Type</code>: The sort order. Valid values:</p>
         * <ul>
         * <li><p><code>Asc</code>: ascending</p>
         * </li>
         * <li><p><code>Desc</code>: descending</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you do not set this parameter, the query results are sorted by advice submission time in descending order.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Field\&quot;:\&quot;AdviceType\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong> (default)</p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the database and table. Format: <strong>database.table</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch.lineitem</p>
         */
        public Builder schemaTableName(String schemaTableName) {
            this.putQueryParameter("SchemaTableName", schemaTableName);
            this.schemaTableName = schemaTableName;
            return this;
        }

        /**
         * <p>The start date of the query. The date is in the <code>yyyyMMdd</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>20220811</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeAppliedAdvicesRequest build() {
            return new DescribeAppliedAdvicesRequest(this);
        } 

    } 

}
