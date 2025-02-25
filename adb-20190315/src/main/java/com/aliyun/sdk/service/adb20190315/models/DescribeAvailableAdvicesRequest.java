// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The date when the suggestion is generated. Specify the date in the yyyyMMdd format. The date must be in UTC.</p>
         * <blockquote>
         * <p> Suggestions are generated after analysis after midnight every day. You must specify a date that is at least one day earlier than the current date. For example, if the current date is 20240627, you must specify 20240626 or an earlier date.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The type of the suggestion. Valid values:</p>
         * <ul>
         * <li><strong>INDEX</strong>: index optimization.</li>
         * <li><strong>TIERING</strong>: hot and cold data optimization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Index</p>
         */
        public Builder adviceType(String adviceType) {
            this.putQueryParameter("AdviceType", adviceType);
            this.adviceType = adviceType;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of Data Warehouse Edition (V3.0) clusters.</p>
         * </blockquote>
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
         * <p>The keyword that is used to query information by table name.</p>
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
         * <p>The display language of the suggestion. Default value: zh. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: simplified Chinese</li>
         * <li><strong>en</strong>: English</li>
         * <li><strong>ja</strong>: Japanese</li>
         * <li><strong>zh-tw</strong>: traditional Chinese</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The order by which to sort query results. Specify the parameter value in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
         * <ul>
         * <li><p><code>Field</code> specifies the field by which to sort the query results. Valid values:</p>
         * <ul>
         * <li><code>SchemaName</code>: the name of the database.</li>
         * <li><code>TableName</code>: the name of the table.</li>
         * <li><code>Benefit</code>: the expected benefits of the applied optimization suggestion.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code> specifies the sorting order. Valid values:</p>
         * <ul>
         * <li><code>Asc</code>: ascending order.</li>
         * <li><code>Desc</code>: descending order.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the query results are sorted in descending order based on the Benefit field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;Benefit&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries to return on each page. Default value: 30. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The name of the table in the <strong>DatabaseName.TableName</strong> format.</p>
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
