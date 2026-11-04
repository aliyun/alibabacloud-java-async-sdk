// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsRequest</p>
 */
public class DescribeEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    private String appInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MemberEniIp")
    private String memberEniIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private DescribeEventsRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.appInstanceId = builder.appInstanceId;
        this.bizRegionId = builder.bizRegionId;
        this.endTime = builder.endTime;
        this.eventId = builder.eventId;
        this.eventType = builder.eventType;
        this.maxResults = builder.maxResults;
        this.memberEniIp = builder.memberEniIp;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.startTime = builder.startTime;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memberEniIp
     */
    public String getMemberEniIp() {
        return this.memberEniIp;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeEventsRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceGroupName; 
        private String appInstanceId; 
        private String bizRegionId; 
        private String endTime; 
        private String eventId; 
        private String eventType; 
        private Integer maxResults; 
        private String memberEniIp; 
        private String nextToken; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String startTime; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventsRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.appInstanceId = request.appInstanceId;
            this.bizRegionId = request.bizRegionId;
            this.endTime = request.endTime;
            this.eventId = request.eventId;
            this.eventType = request.eventType;
            this.maxResults = request.maxResults;
            this.memberEniIp = request.memberEniIp;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.startTime = request.startTime;
            this.userId = request.userId;
        } 

        /**
         * <p>The delivery group ID, which is used to accurately filter events of the delivery group. If you do not specify this parameter, events are not filtered by delivery group. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the value.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The delivery group name. If the name consists only of letters, digits, underscores, or hyphens, events are filtered by name prefix. If the name contains spaces or other special characters, events are filtered by the exact value. If you do not specify this parameter, events are not filtered by name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D workstation group</p>
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putBodyParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>The application instance ID, which is used to accurately filter events associated with the instance. If you do not specify this parameter, events are not filtered by application instance. To obtain the value, first call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the delivery group ID, and then use the ID as <code>AppInstanceGroupId</code> to call <a href="~~ListAppInstances~~">ListAppInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-azn3kmwruh1vl****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The business region ID of the event, which is used for accurate filtering. If you do not specify this parameter, events are not filtered by business region. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the value.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The end time of the query. <strong>Required</strong>. The format is the same as <code>StartTime</code>. We recommend that you always include the time zone offset. The query includes this time, and the end time cannot be earlier than <code>StartTime</code>. A time range later than the call time does not generate future events.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-29T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event ID, which is used to accurately query a single event. If you do not specify this parameter, events are not filtered by event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-9ciijz60n4xsv****</p>
         */
        public Builder eventId(String eventId) {
            this.putBodyParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The event type identifier, which is used to accurately filter events. Different products may generate different types. This operation does not limit fixed enumerations. You should use the queried <code>EventList.EventType</code> as the filter value.</p>
         * 
         * <strong>example:</strong>
         * <p>SessionDisconnected</p>
         */
        public Builder eventType(String eventType) {
            this.putBodyParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The compatibility field. The current version does not read this parameter. Use <code>PageSize</code> to control the number of records on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The private IP address of the member elastic network interface (ENI) of the cloud resource, which is used to accurately filter related events. If you do not specify this parameter, events are not filtered by IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.10</p>
         */
        public Builder memberEniIp(String memberEniIp) {
            this.putBodyParameter("MemberEniIp", memberEniIp);
            this.memberEniIp = memberEniIp;
            return this;
        }

        /**
         * <p>The compatibility field. The current version does not read this parameter and does not support token-based pagination. Use <code>PageNumber</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>unused</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The office network ID, which is used to accurately filter events generated within the office network. If you do not specify this parameter, events are not filtered by office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-123456****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putBodyParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The page number to query. Pages start from <code>1</code>. Default value: 1. This parameter is used together with <code>PageSize</code>.</p>
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
         * <p>The number of events to return on each page. Default value: 10. The current operation does not declare a fixed upper limit. We recommend that you set a reasonable positive integer based on your actual needs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type. The value is not case-sensitive. If you specify other values, the request fails. If you do not specify this parameter, events are not filtered by product type. Only the following public product values are supported:</p>
         * <ul>
         * <li><code>CloudApp</code>: Wuying Cloud Application.</li>
         * <li><code>CloudBrowser</code>: Cloud Browser.</li>
         * <li><code>WuyingServer</code>: Enterprise Edition workstation.</li>
         * <li><code>WuyingWorkstation</code>: Personal Edition Linggou container workstation.</li>
         * <li><code>WuyingWorkstationTeam</code>: Linggou Team Edition container workstation.</li>
         * <li><code>WuyingWorkstationBusiness</code>: Linggou Dedicated Edition container workstation.</li>
         * <li><code>AndroidCloud</code>: Cloud Phone.</li>
         * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The start time of the query. <strong>Required</strong>. Specify the time in the ISO 8601 format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss</code>. You can include three-digit milliseconds and use <code>Z</code> or <code>±HH:mm</code> to specify the time zone. We recommend that you always include the time zone offset. The query includes this time, and the start time must be earlier than or equal to <code>EndTime</code>. The service only retains and retrieves events within 30 days before the call time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-28T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The end user ID, which is used to accurately filter events generated by the user. If you do not specify this parameter, events are not filtered by user.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeEventsRequest build() {
            return new DescribeEventsRequest(this);
        } 

    } 

}
