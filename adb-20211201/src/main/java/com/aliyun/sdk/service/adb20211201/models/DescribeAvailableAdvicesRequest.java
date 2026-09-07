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
 * {@link DescribeAvailableAdvicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableAdvicesRequest</p>
 */
public class DescribeAvailableAdvicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdviceDate")
    private Long adviceDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdviceType")
    private String adviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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

    private DescribeAvailableAdvicesRequest(Builder builder) {
        super(builder);
        this.adviceDate = builder.adviceDate;
        this.adviceType = builder.adviceType;
        this.DBClusterId = builder.DBClusterId;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.schemaTableName = builder.schemaTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableAdvicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adviceDate
     */
    public Long getAdviceDate() {
        return this.adviceDate;
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

    public static final class Builder extends Request.Builder<DescribeAvailableAdvicesRequest, Builder> {
        private Long adviceDate; 
        private String adviceType; 
        private String DBClusterId; 
        private String keyword; 
        private String lang; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String schemaTableName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableAdvicesRequest request) {
            super(request);
            this.adviceDate = request.adviceDate;
            this.adviceType = request.adviceType;
            this.DBClusterId = request.DBClusterId;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.schemaTableName = request.schemaTableName;
        } 

        /**
         * <p>The date when the advice was generated, in the <code>yyyyMMdd</code> format.</p>
         * <blockquote>
         * <p>Advice is generated daily. To query for advice, specify a date at least one day before the current date. For example, if you query on June 27, 2024, set this parameter to <code>20240626</code> or an earlier date.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20221124</p>
         */
        public Builder adviceDate(Long adviceDate) {
            this.putQueryParameter("AdviceDate", adviceDate);
            this.adviceDate = adviceDate;
            return this;
        }

        /**
         * <p>The type of advice. Valid values:</p>
         * <ul>
         * <li><p><strong>INDEX</strong>: index optimization.</p>
         * </li>
         * <li><p><strong>TIERING</strong>: hot and cold data tiering.</p>
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
         * <p>am-bp198m028ih55****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The keyword for a fuzzy search on table names.</p>
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
         * <p>The display language for the advice. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Simplified Chinese (default).</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * <li><p><strong>ja</strong>: Japanese.</p>
         * </li>
         * <li><p><strong>zh-tw</strong>: Traditional Chinese.</p>
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
         * <p>Specifies the sort order for the results. The value is a JSON string. Example: <code>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. The JSON string contains the following key-value pairs:</p>
         * <ul>
         * <li><p><code>Field</code>: the field to sort by. Valid values:</p>
         * <ul>
         * <li><p><code>SchemaName</code>: the database name.</p>
         * </li>
         * <li><p><code>TableName</code>: the table name.</p>
         * </li>
         * <li><p><code>Benefit</code>: the expected benefit.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>Type</code>: the sort order. Valid values:</p>
         * <ul>
         * <li><p><code>Asc</code>: ascending order.</p>
         * </li>
         * <li><p><code>Desc</code>: descending order.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>By default, results are sorted by expected benefit in descending order.</p>
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
         * <p>The number of entries per page. Valid values:</p>
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
         * <p>A concatenation of the database name and the table name.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch.lineitem</p>
         */
        public Builder schemaTableName(String schemaTableName) {
            this.putQueryParameter("SchemaTableName", schemaTableName);
            this.schemaTableName = schemaTableName;
            return this;
        }

        @Override
        public DescribeAvailableAdvicesRequest build() {
            return new DescribeAvailableAdvicesRequest(this);
        } 

    } 

}
