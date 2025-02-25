// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridMonitorTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridMonitorTaskListRequest</p>
 */
public class DescribeHybridMonitorTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeAliyunTask")
    private Boolean includeAliyunTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private Long targetUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
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
         * <p>The ID of the application group.</p>
         * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Specifies whether the returned result includes metric import tasks for Alibaba Cloud services. Valid values:</p>
         * <ul>
         * <li>true (default): The returned result includes metric import tasks for Alibaba Cloud services.</li>
         * <li>false: The returned result excludes metric import tasks for Alibaba Cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeAliyunTask(Boolean includeAliyunTask) {
            this.putQueryParameter("IncludeAliyunTask", includeAliyunTask);
            this.includeAliyunTask = includeAliyunTask;
            return this;
        }

        /**
         * <p>The keyword that is used for the search.</p>
         * 
         * <strong>example:</strong>
         * <p>task</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>For information about how to obtain the name of a namespace, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Pages start from page 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the member account.</p>
         * <blockquote>
         * <p>This parameter is required only if you use a management account to call this operation to delete the metric import tasks that belong to a member in a resource directory. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        public Builder targetUserId(Long targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * <p>The ID of the metric import task.</p>
         * 
         * <strong>example:</strong>
         * <p>36****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The type of the metric import task. Valid values:</p>
         * <ul>
         * <li>aliyun_fc: metric import tasks for Alibaba Cloud services</li>
         * <li>aliyun_sls: metrics for logs imported from Log Service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun_fc</p>
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
