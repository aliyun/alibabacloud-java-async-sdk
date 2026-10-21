// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListDataConnectorsRequest} extends {@link RequestModel}
 *
 * <p>ListDataConnectorsRequest</p>
 */
public class ListDataConnectorsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConnectorIds")
    private java.util.List<String> dataConnectorIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConnectorName")
    private String dataConnectorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConnectorStatus")
    private String dataConnectorStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConnectorType")
    private String dataConnectorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestDataSourceId")
    private String destDataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlsIngestionJobName")
    private String slsIngestionJobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcDataType")
    private String srcDataType;

    private ListDataConnectorsRequest(Builder builder) {
        super(builder);
        this.dataConnectorIds = builder.dataConnectorIds;
        this.dataConnectorName = builder.dataConnectorName;
        this.dataConnectorStatus = builder.dataConnectorStatus;
        this.dataConnectorType = builder.dataConnectorType;
        this.destDataSourceId = builder.destDataSourceId;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderField = builder.orderField;
        this.orderType = builder.orderType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.slsIngestionJobName = builder.slsIngestionJobName;
        this.srcDataType = builder.srcDataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataConnectorsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataConnectorIds
     */
    public java.util.List<String> getDataConnectorIds() {
        return this.dataConnectorIds;
    }

    /**
     * @return dataConnectorName
     */
    public String getDataConnectorName() {
        return this.dataConnectorName;
    }

    /**
     * @return dataConnectorStatus
     */
    public String getDataConnectorStatus() {
        return this.dataConnectorStatus;
    }

    /**
     * @return dataConnectorType
     */
    public String getDataConnectorType() {
        return this.dataConnectorType;
    }

    /**
     * @return destDataSourceId
     */
    public String getDestDataSourceId() {
        return this.destDataSourceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return slsIngestionJobName
     */
    public String getSlsIngestionJobName() {
        return this.slsIngestionJobName;
    }

    /**
     * @return srcDataType
     */
    public String getSrcDataType() {
        return this.srcDataType;
    }

    public static final class Builder extends Request.Builder<ListDataConnectorsRequest, Builder> {
        private java.util.List<String> dataConnectorIds; 
        private String dataConnectorName; 
        private String dataConnectorStatus; 
        private String dataConnectorType; 
        private String destDataSourceId; 
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderField; 
        private String orderType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private String slsIngestionJobName; 
        private String srcDataType; 

        private Builder() {
            super();
        } 

        private Builder(ListDataConnectorsRequest request) {
            super(request);
            this.dataConnectorIds = request.dataConnectorIds;
            this.dataConnectorName = request.dataConnectorName;
            this.dataConnectorStatus = request.dataConnectorStatus;
            this.dataConnectorType = request.dataConnectorType;
            this.destDataSourceId = request.destDataSourceId;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderField = request.orderField;
            this.orderType = request.orderType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.slsIngestionJobName = request.slsIngestionJobName;
            this.srcDataType = request.srcDataType;
        } 

        /**
         * <p>The list of collector IDs.</p>
         */
        public Builder dataConnectorIds(java.util.List<String> dataConnectorIds) {
            String dataConnectorIdsShrink = shrink(dataConnectorIds, "DataConnectorIds", "json");
            this.putBodyParameter("DataConnectorIds", dataConnectorIdsShrink);
            this.dataConnectorIds = dataConnectorIds;
            return this;
        }

        /**
         * <p>The collector name.</p>
         * 
         * <strong>example:</strong>
         * <p>SAS-CTDR-2026070210****</p>
         */
        public Builder dataConnectorName(String dataConnectorName) {
            this.putBodyParameter("DataConnectorName", dataConnectorName);
            this.dataConnectorName = dataConnectorName;
            return this;
        }

        /**
         * <p>The collector status. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled (default): Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder dataConnectorStatus(String dataConnectorStatus) {
            this.putBodyParameter("DataConnectorStatus", dataConnectorStatus);
            this.dataConnectorStatus = dataConnectorStatus;
            return this;
        }

        /**
         * <p>The collector type. Valid values:</p>
         * <ul>
         * <li>oss</li>
         * <li>s3</li>
         * <li>kafka</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>s3</p>
         */
        public Builder dataConnectorType(String dataConnectorType) {
            this.putBodyParameter("DataConnectorType", dataConnectorType);
            this.dataConnectorType = dataConnectorType;
            return this;
        }

        /**
         * <p>The destination data source ID. This parameter is required only for synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-5sfe68t122pxnti1cjpl</p>
         */
        public Builder destDataSourceId(String destDataSourceId) {
            this.putBodyParameter("DestDataSourceId", destDataSourceId);
            this.destDataSourceId = destDataSourceId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required. If you do not specify this parameter, the service returns a 400 error: &quot;The specified Lang can not be empty.&quot; Explicitly pass a language code.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If a next page exists, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort field. Currently, only sorting by updateTime is supported. If OrderField is empty, the default order returned by the database is used.</p>
         * 
         * <strong>example:</strong>
         * <p>Id</p>
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>asc: ascending order.</li>
         * <li>desc (default): descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder orderType(String orderType) {
            this.putBodyParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page. Default value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center resides. Specify the management center region based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets reside outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service (SLS) data import job for the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>ingest-oss-dc-1a2b3c4d5e6f7a8****</p>
         */
        public Builder slsIngestionJobName(String slsIngestionJobName) {
            this.putBodyParameter("SlsIngestionJobName", slsIngestionJobName);
            this.slsIngestionJobName = slsIngestionJobName;
            return this;
        }

        /**
         * <p>The source data type.</p>
         * 
         * <strong>example:</strong>
         * <p>s3</p>
         */
        public Builder srcDataType(String srcDataType) {
            this.putBodyParameter("SrcDataType", srcDataType);
            this.srcDataType = srcDataType;
            return this;
        }

        @Override
        public ListDataConnectorsRequest build() {
            return new ListDataConnectorsRequest(this);
        } 

    } 

}
