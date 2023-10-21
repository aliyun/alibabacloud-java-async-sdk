// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorListRequest</p>
 */
public class DescribeSiteMonitorListRequest extends Request {
    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TaskState")
    private String taskState;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    private DescribeSiteMonitorListRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
        this.taskState = builder.taskState;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
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
     * @return taskState
     */
    public String getTaskState() {
        return this.taskState;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeSiteMonitorListRequest, Builder> {
        private String keyword; 
        private Integer page; 
        private Integer pageSize; 
        private String taskId; 
        private String taskState; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteMonitorListRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
            this.taskState = request.taskState;
            this.taskType = request.taskType;
        } 

        /**
         * The keyword to be matched.
         * <p>
         * 
         * >  You can search for tasks by name or address. Fuzzy search is supported.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the site monitoring task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The status of the task. Valid values:
         * <p>
         * 
         * *   1: The task is enabled.
         * *   2: The task is disabled.
         */
        public Builder taskState(String taskState) {
            this.putQueryParameter("TaskState", taskState);
            this.taskState = taskState;
            return this;
        }

        /**
         * The protocol that is used by the site monitoring task. Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeSiteMonitorListRequest build() {
            return new DescribeSiteMonitorListRequest(this);
        } 

    } 

}
