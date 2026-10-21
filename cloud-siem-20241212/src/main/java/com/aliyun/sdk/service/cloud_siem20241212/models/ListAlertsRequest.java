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
 * {@link ListAlertsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertsRequest</p>
 */
public class ListAlertsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private java.util.List<String> alertLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUuid")
    private String alertUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

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
    @com.aliyun.core.annotation.NameInMap("OrderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderFieldName")
    private String orderFieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryCondition")
    private String queryCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryViewId")
    private String queryViewId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListAlertsRequest(Builder builder) {
        super(builder);
        this.alertLevel = builder.alertLevel;
        this.alertUuid = builder.alertUuid;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderDirection = builder.orderDirection;
        this.orderFieldName = builder.orderFieldName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryCondition = builder.queryCondition;
        this.queryViewId = builder.queryViewId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevel
     */
    public java.util.List<String> getAlertLevel() {
        return this.alertLevel;
    }

    /**
     * @return alertUuid
     */
    public String getAlertUuid() {
        return this.alertUuid;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return orderFieldName
     */
    public String getOrderFieldName() {
        return this.orderFieldName;
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
     * @return queryCondition
     */
    public String getQueryCondition() {
        return this.queryCondition;
    }

    /**
     * @return queryViewId
     */
    public String getQueryViewId() {
        return this.queryViewId;
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
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAlertsRequest, Builder> {
        private java.util.List<String> alertLevel; 
        private String alertUuid; 
        private Long endTime; 
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderDirection; 
        private String orderFieldName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryCondition; 
        private String queryViewId; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertsRequest request) {
            super(request);
            this.alertLevel = request.alertLevel;
            this.alertUuid = request.alertUuid;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderDirection = request.orderDirection;
            this.orderFieldName = request.orderFieldName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryCondition = request.queryCondition;
            this.queryViewId = request.queryViewId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The threat level of the alert. Valid values:</p>
         * <ul>
         * <li>5: Critical.</li>
         * <li>4: High.</li>
         * <li>3: Medium.</li>
         * <li>2: Low.</li>
         * <li>1: Informational.</li>
         * </ul>
         */
        public Builder alertLevel(java.util.List<String> alertLevel) {
            this.putBodyParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * <p>The ID of the alert that is associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        public Builder alertUuid(String alertUuid) {
            this.putBodyParameter("AlertUuid", alertUuid);
            this.alertUuid = alertUuid;
            return this;
        }

        /**
         * <p>The end time of the alert. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1766801904000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</p>
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
         * <p>The maximum number of entries to return.</p>
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
         * <p>The pagination token. You do not need to specify this parameter for the first request or if no more results exist. If more results exist, set this parameter to the NextToken value returned in the previous API call.</p>
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
         * <li><strong>asc</strong> (default): ascending order.</li>
         * <li><strong>desc</strong>: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The field used for sorting. Valid values:</p>
         * <ul>
         * <li>GmtCreate: creation time.</li>
         * <li>GmtModified: last modified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtModified</p>
         */
        public Builder orderFieldName(String orderFieldName) {
            this.putBodyParameter("OrderFieldName", orderFieldName);
            this.orderFieldName = orderFieldName;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query filter condition in JSON format. Valid values:</p>
         * <ul>
         * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</code>: The 100 queries with the longest execution duration.</li>
         * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: Completed queries.</li>
         * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>: Running queries.</li>
         * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;30&quot;,&quot;Max&quot;:&quot;50&quot;}</code>: Custom execution duration queries. You can specify the minimum and maximum execution duration. <strong>Min</strong> specifies the minimum execution duration. <strong>Max</strong> specifies the maximum execution duration. Unit: milliseconds (ms).<ul>
         * <li>If only <strong>Min</strong> is specified, queries with an execution duration greater than this value are returned.</li>
         * <li>If only <strong>Max</strong> is specified, queries with an execution duration less than this value are returned.</li>
         * <li>If both <strong>Min</strong> and <strong>Max</strong> are specified, queries with an execution duration greater than or equal to <strong>Min</strong> and less than or equal to <strong>Max</strong> are returned.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;:\&quot;cost\&quot;,\&quot;Max\&quot;:\&quot;200\&quot;}</p>
         */
        public Builder queryCondition(String queryCondition) {
            this.putBodyParameter("QueryCondition", queryCondition);
            this.queryCondition = queryCondition;
            return this;
        }

        /**
         * <p>The unique identifier of the query view.</p>
         * 
         * <strong>example:</strong>
         * <p>qv-a1b2c3d4e5f6g7****</p>
         */
        public Builder queryViewId(String queryViewId) {
            this.putBodyParameter("QueryViewId", queryViewId);
            this.queryViewId = queryViewId;
            return this;
        }

        /**
         * <p>The region where the threat detection and response data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland or Hong Kong (China).</li>
         * <li>ap-southeast-1: Your assets reside in regions outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the member accounts in the resource directory.</p>
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
         * <p>The view type. Valid values:</p>
         * <ul>
         * <li>0: the view of the current Alibaba Cloud account.</li>
         * <li>1: the view of all accounts in the enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The time when the alert first occurred. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1759198980000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAlertsRequest build() {
            return new ListAlertsRequest(this);
        } 

    } 

}
