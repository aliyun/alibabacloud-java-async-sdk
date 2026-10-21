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
 * {@link ListDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourcesRequest</p>
 */
public class ListDataSourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceFrom")
    private String dataSourceFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceIds")
    private java.util.List<String> dataSourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceStatus")
    private String dataSourceStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceStoreStatus")
    private String dataSourceStoreStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceTemplateIds")
    private java.util.List<String> dataSourceTemplateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogProjectName")
    private String logProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserIds")
    private java.util.List<Long> logUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ListDataSourcesRequest(Builder builder) {
        super(builder);
        this.dataSourceFrom = builder.dataSourceFrom;
        this.dataSourceIds = builder.dataSourceIds;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceStatus = builder.dataSourceStatus;
        this.dataSourceStoreStatus = builder.dataSourceStoreStatus;
        this.dataSourceTemplateIds = builder.dataSourceTemplateIds;
        this.dataSourceType = builder.dataSourceType;
        this.lang = builder.lang;
        this.logProjectName = builder.logProjectName;
        this.logRegionId = builder.logRegionId;
        this.logStoreName = builder.logStoreName;
        this.logUserIds = builder.logUserIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceFrom
     */
    public String getDataSourceFrom() {
        return this.dataSourceFrom;
    }

    /**
     * @return dataSourceIds
     */
    public java.util.List<String> getDataSourceIds() {
        return this.dataSourceIds;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceStatus
     */
    public String getDataSourceStatus() {
        return this.dataSourceStatus;
    }

    /**
     * @return dataSourceStoreStatus
     */
    public String getDataSourceStoreStatus() {
        return this.dataSourceStoreStatus;
    }

    /**
     * @return dataSourceTemplateIds
     */
    public java.util.List<String> getDataSourceTemplateIds() {
        return this.dataSourceTemplateIds;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logProjectName
     */
    public String getLogProjectName() {
        return this.logProjectName;
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return logUserIds
     */
    public java.util.List<Long> getLogUserIds() {
        return this.logUserIds;
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
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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

    public static final class Builder extends Request.Builder<ListDataSourcesRequest, Builder> {
        private String dataSourceFrom; 
        private java.util.List<String> dataSourceIds; 
        private String dataSourceName; 
        private String dataSourceStatus; 
        private String dataSourceStoreStatus; 
        private java.util.List<String> dataSourceTemplateIds; 
        private String dataSourceType; 
        private String lang; 
        private String logProjectName; 
        private String logRegionId; 
        private String logStoreName; 
        private java.util.List<Long> logUserIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String orderField; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourcesRequest request) {
            super(request);
            this.dataSourceFrom = request.dataSourceFrom;
            this.dataSourceIds = request.dataSourceIds;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceStatus = request.dataSourceStatus;
            this.dataSourceStoreStatus = request.dataSourceStoreStatus;
            this.dataSourceTemplateIds = request.dataSourceTemplateIds;
            this.dataSourceType = request.dataSourceType;
            this.lang = request.lang;
            this.logProjectName = request.logProjectName;
            this.logRegionId = request.logRegionId;
            this.logStoreName = request.logStoreName;
            this.logUserIds = request.logUserIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The data source origin. Valid values:</p>
         * <ul>
         * <li>center</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        public Builder dataSourceFrom(String dataSourceFrom) {
            this.putBodyParameter("DataSourceFrom", dataSourceFrom);
            this.dataSourceFrom = dataSourceFrom;
            return this;
        }

        /**
         * <p>The list of data source IDs.</p>
         */
        public Builder dataSourceIds(java.util.List<String> dataSourceIds) {
            String dataSourceIdsShrink = shrink(dataSourceIds, "DataSourceIds", "simple");
            this.putBodyParameter("DataSourceIds", dataSourceIdsShrink);
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_waf_alert_log</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The data source status. Valid values:</p>
         * <ul>
         * <li>unconfigured</li>
         * <li>normal</li>
         * <li>abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unconfigured</p>
         */
        public Builder dataSourceStatus(String dataSourceStatus) {
            this.putBodyParameter("DataSourceStatus", dataSourceStatus);
            this.dataSourceStatus = dataSourceStatus;
            return this;
        }

        /**
         * <p>The Logstore status. Valid values:</p>
         * <ul>
         * <li>normal</li>
         * <li>abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder dataSourceStoreStatus(String dataSourceStoreStatus) {
            this.putBodyParameter("DataSourceStoreStatus", dataSourceStoreStatus);
            this.dataSourceStoreStatus = dataSourceStoreStatus;
            return this;
        }

        /**
         * <p>The list of data source template IDs.</p>
         */
        public Builder dataSourceTemplateIds(java.util.List<String> dataSourceTemplateIds) {
            String dataSourceTemplateIdsShrink = shrink(dataSourceTemplateIds, "DataSourceTemplateIds", "simple");
            this.putBodyParameter("DataSourceTemplateIds", dataSourceTemplateIdsShrink);
            this.dataSourceTemplateIds = dataSourceTemplateIds;
            return this;
        }

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>preset</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
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
         * <p>The Simple Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
         */
        public Builder logProjectName(String logProjectName) {
            this.putBodyParameter("LogProjectName", logProjectName);
            this.logProjectName = logProjectName;
            return this;
        }

        /**
         * <p>The log storage region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder logRegionId(String logRegionId) {
            this.putBodyParameter("LogRegionId", logRegionId);
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * <p>The Simple Log Service Logstore name.</p>
         * 
         * <strong>example:</strong>
         * <p>audit-activity</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The list of data ingestion user IDs.</p>
         */
        public Builder logUserIds(java.util.List<Long> logUserIds) {
            String logUserIdsShrink = shrink(logUserIds, "LogUserIds", "simple");
            this.putBodyParameter("LogUserIds", logUserIdsShrink);
            this.logUserIds = logUserIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
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
         * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
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
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>desc</li>
         * <li>asc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The field used for sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateTime</p>
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets are located outside China.</li>
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
         * <p>The user ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public ListDataSourcesRequest build() {
            return new ListDataSourcesRequest(this);
        } 

    } 

}
