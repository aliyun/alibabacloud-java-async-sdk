// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSiteMonitorListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorListRequest</p>
 */
public class DescribeSiteMonitorListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskState")
    private String taskState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
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
         * <p>The keyword to be matched.</p>
         * <blockquote>
         * <p> You can search for tasks by name or address. Fuzzy search is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>site</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
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
         * <p>The ID of the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>a1ecd34a-8157-44d9-b060-14950837****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>1: The task is enabled.</li>
         * <li>2: The task is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskState(String taskState) {
            this.putQueryParameter("TaskState", taskState);
            this.taskState = taskState;
            return this;
        }

        /**
         * <p>The protocol that is used by the site monitoring task. Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
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
