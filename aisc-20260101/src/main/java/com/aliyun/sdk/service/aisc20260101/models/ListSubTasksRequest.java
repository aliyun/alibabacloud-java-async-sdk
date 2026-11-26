// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link ListSubTasksRequest} extends {@link RequestModel}
 *
 * <p>ListSubTasksRequest</p>
 */
public class ListSubTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyRunning")
    private Boolean onlyRunning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootTaskId")
    private String rootTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private ListSubTasksRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.onlyRunning = builder.onlyRunning;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.rootTaskId = builder.rootTaskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return onlyRunning
     */
    public Boolean getOnlyRunning() {
        return this.onlyRunning;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return rootTaskId
     */
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ListSubTasksRequest, Builder> {
        private Integer currentPage; 
        private Boolean onlyRunning; 
        private Integer pageSize; 
        private Long resourceDirectoryAccountId; 
        private String rootTaskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ListSubTasksRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.onlyRunning = request.onlyRunning;
            this.pageSize = request.pageSize;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.rootTaskId = request.rootTaskId;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether to query only running subtasks. If you set this parameter to true, the system queries all running subtasks of the current tenant across root tasks. In this case, you do not need to specify RootTaskId.</p>
         */
        public Builder onlyRunning(Boolean onlyRunning) {
            this.putQueryParameter("OnlyRunning", onlyRunning);
            this.onlyRunning = onlyRunning;
            return this;
        }

        /**
         * <p>The page size.</p>
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
         * <p>The ID of the resource directory account.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The ID of the root task returned upon task submission.</p>
         * 
         * <strong>example:</strong>
         * <p>110146ac282314fe4f7cd11afc7540eb</p>
         */
        public Builder rootTaskId(String rootTaskId) {
            this.putQueryParameter("RootTaskId", rootTaskId);
            this.rootTaskId = rootTaskId;
            return this;
        }

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_CHECK</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ListSubTasksRequest build() {
            return new ListSubTasksRequest(this);
        } 

    } 

}
