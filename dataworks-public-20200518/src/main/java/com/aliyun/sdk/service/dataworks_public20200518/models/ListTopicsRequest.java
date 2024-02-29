// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTopicsRequest} extends {@link RequestModel}
 *
 * <p>ListTopicsRequest</p>
 */
public class ListTopicsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BeginTime")
    @Validation(required = true)
    private String beginTime;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("InstanceId")
    private Long instanceId;

    @Body
    @NameInMap("NodeId")
    private Long nodeId;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 30, minimum = 1)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("TopicStatuses")
    private String topicStatuses;

    @Body
    @NameInMap("TopicTypes")
    private String topicTypes;

    private ListTopicsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.topicStatuses = builder.topicStatuses;
        this.topicTypes = builder.topicTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTopicsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
     * @return topicStatuses
     */
    public String getTopicStatuses() {
        return this.topicStatuses;
    }

    /**
     * @return topicTypes
     */
    public String getTopicTypes() {
        return this.topicTypes;
    }

    public static final class Builder extends Request.Builder<ListTopicsRequest, Builder> {
        private String regionId; 
        private String beginTime; 
        private String endTime; 
        private Long instanceId; 
        private Long nodeId; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String topicStatuses; 
        private String topicTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListTopicsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.topicStatuses = request.topicStatuses;
            this.topicTypes = request.topicTypes;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\"T\"HH:mm:ssZ format. The time must be in UTC.
         */
        public Builder beginTime(String beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\"T\"HH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the node instance that triggers the events. You can configure either this parameter or the NodeId parameter.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the node that triggers the events. You can configure either this parameter or the InstanceId parameter.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the owner of the events.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The number of the page to return. Valid values: 1 to 30. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of the events. Valid values: IGNORE, NEW, FIXING, and RECOVER. The value IGNORE indicates that the events are ignored. The value NEW indicates that the events are new events. The value FIXING indicates that the events are being processed. The value RECOVER indicates that the events are processed. You can specify multiple states. Separate them with commas (,).
         */
        public Builder topicStatuses(String topicStatuses) {
            this.putBodyParameter("TopicStatuses", topicStatuses);
            this.topicStatuses = topicStatuses;
            return this;
        }

        /**
         * The types of the events. Valid values: SLOW and ERROR. The value SLOW indicates that the running duration of the node in the current scheduling cycle is significantly longer than the average running duration of the node in previous scheduling cycles. The value ERROR indicates that the node fails to run. You can specify multiple types. Separate them with commas (,).
         */
        public Builder topicTypes(String topicTypes) {
            this.putBodyParameter("TopicTypes", topicTypes);
            this.topicTypes = topicTypes;
            return this;
        }

        @Override
        public ListTopicsRequest build() {
            return new ListTopicsRequest(this);
        } 

    } 

}
