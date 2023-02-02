// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsDLQMessagePageQueryByGroupIdRequest} extends {@link RequestModel}
 *
 * <p>OnsDLQMessagePageQueryByGroupIdRequest</p>
 */
public class OnsDLQMessagePageQueryByGroupIdRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private OnsDLQMessagePageQueryByGroupIdRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsDLQMessagePageQueryByGroupIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<OnsDLQMessagePageQueryByGroupIdRequest, Builder> {
        private Long beginTime; 
        private Integer currentPage; 
        private Long endTime; 
        private String groupId; 
        private String instanceId; 
        private Integer pageSize; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(OnsDLQMessagePageQueryByGroupIdRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
        } 

        /**
         * The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds. If you specify a valid value for the **TaskId** parameter in the request, this parameter does not take effect. The system uses the value of the BeginTime parameter that you specified in the request when you created the specified query task.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Valid values: 1 to 50.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds. If you specify a valid value for the **TaskId** parameter in the request, this parameter does not take effect. The system uses the value of the EndTime parameter that you specified in the request when you created the specified query task.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the consumer group whose dead-letter messages you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the dead-letter messages you want to query belong.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of dead-letter messages to return on each page. Valid values: 5 to 50. Default value: 20. If you specify a valid value for the **TaskId** parameter in the request, this parameter does not take effect. The system uses the value of the PageSize parameter that you specified in the request when you created the specified query task.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the query task. The first time you call this operation to query dead-letter messages that are sent to a specified consumer group within a specified time range, this parameter is not required. This parameter is required in subsequent queries for dead-letter messages on a specified page. You can obtain the task ID from the returned result of the first query.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public OnsDLQMessagePageQueryByGroupIdRequest build() {
            return new OnsDLQMessagePageQueryByGroupIdRequest(this);
        } 

    } 

}
