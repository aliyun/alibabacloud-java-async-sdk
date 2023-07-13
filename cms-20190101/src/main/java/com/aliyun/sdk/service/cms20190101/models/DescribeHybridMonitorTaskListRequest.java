// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridMonitorTaskListRequest</p>
 */
public class DescribeHybridMonitorTaskListRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("IncludeAliyunTask")
    private Boolean includeAliyunTask;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TargetUserId")
    private Long targetUserId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    private DescribeHybridMonitorTaskListRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.includeAliyunTask = builder.includeAliyunTask;
        this.keyword = builder.keyword;
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.targetUserId = builder.targetUserId;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorTaskListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return includeAliyunTask
     */
    public Boolean getIncludeAliyunTask() {
        return this.includeAliyunTask;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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
     * @return targetUserId
     */
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeHybridMonitorTaskListRequest, Builder> {
        private String groupId; 
        private Boolean includeAliyunTask; 
        private String keyword; 
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long targetUserId; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridMonitorTaskListRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.includeAliyunTask = request.includeAliyunTask;
            this.keyword = request.keyword;
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.targetUserId = request.targetUserId;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
        } 

        /**
         * The additional information of the instance.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The timestamp when the metric import task was created.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder includeAliyunTask(Boolean includeAliyunTask) {
            this.putQueryParameter("IncludeAliyunTask", includeAliyunTask);
            this.includeAliyunTask = includeAliyunTask;
            return this;
        }

        /**
         * The conditions that are used to filter logs imported from Log Service.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
         * <p>
         * 
         * *   namespace: the namespace of the Alibaba Cloud service.
         * *   metric_list: the metrics of the Alibaba Cloud service.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeHybridMonitorTaskList**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The keyword that is used to search for metric import tasks.
         */
        public Builder targetUserId(Long targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * The type of the metric import task. Valid values:
         * <p>
         * 
         * *   aliyun_fc: metric import tasks for Alibaba Cloud services
         * *   aliyun_sls: metrics for logs imported from Log Service
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The interval at which the CloudMonitor agent collects host monitoring data. Valid values:
         * <p>
         * 
         * *   15
         * *   30
         * *   60
         * 
         * Unit: seconds.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeHybridMonitorTaskListRequest build() {
            return new DescribeHybridMonitorTaskListRequest(this);
        } 

    } 

}
