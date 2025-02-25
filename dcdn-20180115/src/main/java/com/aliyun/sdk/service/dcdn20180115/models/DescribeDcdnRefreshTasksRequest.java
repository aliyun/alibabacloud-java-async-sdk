// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnRefreshTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnRefreshTasksRequest</p>
 */
public class DescribeDcdnRefreshTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectPath")
    private String objectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 42949672)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribeDcdnRefreshTasksRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.objectPath = builder.objectPath;
        this.objectType = builder.objectType;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRefreshTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return objectPath
     */
    public String getObjectPath() {
        return this.objectPath;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnRefreshTasksRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String objectPath; 
        private String objectType; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private String startTime; 
        private String status; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnRefreshTasksRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.objectPath = request.objectPath;
            this.objectType = request.objectType;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
            this.startTime = request.startTime;
            this.status = request.status;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-01-01T12:13:20Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The path of the object. The path is used as a condition for exact matching.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/examplefile.txt">http://example.com/examplefile.txt</a></p>
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
            return this;
        }

        /**
         * <p>The type of the task.</p>
         * <ul>
         * <li><strong>file</strong>: URL-based refresh</li>
         * <li><strong>directory</strong>: directory-based refresh</li>
         * <li><strong>preload</strong>: URL-based prefetch</li>
         * </ul>
         * <p>If you set <strong>DomainName</strong> or <strong>Status</strong>, you must also set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-01T12:12:20Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li><strong>Complete</strong>: The task is complete.</li>
         * <li><strong>Refreshing</strong>: The task is in progress.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the task. A task ID is assigned when you create a refresh or prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>704225667</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeDcdnRefreshTasksRequest build() {
            return new DescribeDcdnRefreshTasksRequest(this);
        } 

    } 

}
