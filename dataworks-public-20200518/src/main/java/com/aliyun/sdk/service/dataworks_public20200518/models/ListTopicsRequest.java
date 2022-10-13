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
    @Validation(required = true)
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
         * BeginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TopicStatuses.
         */
        public Builder topicStatuses(String topicStatuses) {
            this.putBodyParameter("TopicStatuses", topicStatuses);
            this.topicStatuses = topicStatuses;
            return this;
        }

        /**
         * TopicTypes.
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
