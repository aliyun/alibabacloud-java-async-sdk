// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessagePageQueryByTopicRequest} extends {@link RequestModel}
 *
 * <p>OnsMessagePageQueryByTopicRequest</p>
 */
public class OnsMessagePageQueryByTopicRequest extends Request {
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
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsMessagePageQueryByTopicRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsMessagePageQueryByTopicRequest create() {
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

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsMessagePageQueryByTopicRequest, Builder> {
        private Long beginTime; 
        private Integer currentPage; 
        private Long endTime; 
        private String instanceId; 
        private Integer pageSize; 
        private String taskId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsMessagePageQueryByTopicRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
            this.topic = request.topic;
        } 

        /**
         * The beginning of the time range to query. Set the value to a UNIX timestamp that represents the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. If you specify a valid value for the **TaskId** parameter in the request, this parameter does not take effect. The system uses the value of the BeginTime parameter that you specified in the request when you created the specified query task.
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
         * The end of the time range to query. Set the value to a UNIX timestamp that represents the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. If you specify a valid value for the **TaskId** parameter in the request, this parameter does not take effect. The system uses the value of the EndTime parameter that you specified in the request when you created the specified query task.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the instance where the message that you want to query resides.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 5 to 50. Default value: 20. If you specify a valid value for the **TaskId** parameter in the request, this parameter does not take effect. The system uses the value of the PageSize parameter that you specified in the request for creating the query task.
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

        /**
         * The topic in which the messages you want to query are stored.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsMessagePageQueryByTopicRequest build() {
            return new OnsMessagePageQueryByTopicRequest(this);
        } 

    } 

}
