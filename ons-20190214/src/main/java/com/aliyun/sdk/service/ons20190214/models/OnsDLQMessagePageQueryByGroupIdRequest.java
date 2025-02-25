// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsDLQMessagePageQueryByGroupIdRequest} extends {@link RequestModel}
 *
 * <p>OnsDLQMessagePageQueryByGroupIdRequest</p>
 */
public class OnsDLQMessagePageQueryByGroupIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
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
         * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds. If you specify a valid value for the <strong>TaskId</strong> parameter in the request, this parameter does not take effect. The system uses the value of the BeginTime parameter that you specified in the request when you created the specified query task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1570723200000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1. Valid values: 1 to 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds. If you specify a valid value for the <strong>TaskId</strong> parameter in the request, this parameter does not take effect. The system uses the value of the EndTime parameter that you specified in the request when you created the specified query task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1570809600000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the consumer group whose dead-letter messages you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_group_id</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the instance to which the dead-letter messages you want to query belong.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of dead-letter messages to return on each page. Valid values: 5 to 50. Default value: 20. If you specify a valid value for the <strong>TaskId</strong> parameter in the request, this parameter does not take effect. The system uses the value of the PageSize parameter that you specified in the request when you created the specified query task.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the query task. The first time you call this operation to query dead-letter messages that are sent to a specified consumer group within a specified time range, this parameter is not required. This parameter is required in subsequent queries for dead-letter messages on a specified page. You can obtain the task ID from the returned result of the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>0BC1310300002A9F000021E4D7A48346</p>
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
