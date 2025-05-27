// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeCloudSiemEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudSiemEventsRequest</p>
 */
public class DescribeCloudSiemEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetId")
    private String assetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityUuid")
    private String entityUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThreadLevel")
    private java.util.List<String> threadLevel;

    private DescribeCloudSiemEventsRequest(Builder builder) {
        super(builder);
        this.assetId = builder.assetId;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.entityUuid = builder.entityUuid;
        this.eventName = builder.eventName;
        this.incidentUuid = builder.incidentUuid;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.threadLevel = builder.threadLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return entityUuid
     */
    public String getEntityUuid() {
        return this.entityUuid;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
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

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return threadLevel
     */
    public java.util.List<String> getThreadLevel() {
        return this.threadLevel;
    }

    public static final class Builder extends Request.Builder<DescribeCloudSiemEventsRequest, Builder> {
        private String assetId; 
        private Integer currentPage; 
        private Long endTime; 
        private String entityUuid; 
        private String eventName; 
        private String incidentUuid; 
        private String order; 
        private String orderField; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private Long startTime; 
        private Integer status; 
        private java.util.List<String> threadLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudSiemEventsRequest request) {
            super(request);
            this.assetId = request.assetId;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.entityUuid = request.entityUuid;
            this.eventName = request.eventName;
            this.incidentUuid = request.incidentUuid;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.threadLevel = request.threadLevel;
        } 

        /**
         * <p>The ID of the asset that is associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>6c740667-80b2-476d-8924-2e706feb****</p>
         */
        public Builder assetId(String assetId) {
            this.putBodyParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577808000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EntityUuid.
         */
        public Builder entityUuid(String entityUuid) {
            this.putBodyParameter("EntityUuid", entityUuid);
            this.entityUuid = entityUuid;
            return this;
        }

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS unusual log in</p>
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>desc: descending order</li>
         * <li>asc: ascending order</li>
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
         * <p>The sort field. Valid values:</p>
         * <ul>
         * <li>GmtModified: sorts the events by creation time. This is the default value.</li>
         * <li>ThreatScore: sorts the events by risk score.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ThreatScore</p>
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
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
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
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
         * <p>The ID of the account that you switch from the management account.</p>
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
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
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
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577808000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>0: unhandled</li>
         * <li>1: handling</li>
         * <li>5: handling failed</li>
         * <li>10: handled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The risk levels of the events. The value is a JSON array. Valid values:</p>
         * <ul>
         * <li>serious: high</li>
         * <li>suspicious: medium</li>
         * <li>remind: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;serious&quot;,&quot;suspicious&quot;,&quot;remind&quot;]</p>
         */
        public Builder threadLevel(java.util.List<String> threadLevel) {
            this.putBodyParameter("ThreadLevel", threadLevel);
            this.threadLevel = threadLevel;
            return this;
        }

        @Override
        public DescribeCloudSiemEventsRequest build() {
            return new DescribeCloudSiemEventsRequest(this);
        } 

    } 

}
