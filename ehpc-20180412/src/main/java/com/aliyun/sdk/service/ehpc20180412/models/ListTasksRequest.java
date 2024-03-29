// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTasksRequest</p>
 */
public class ListTasksRequest extends Request {
    @Query
    @NameInMap("Archived")
    private Boolean archived;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private ListTasksRequest(Builder builder) {
        super(builder);
        this.archived = builder.archived;
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return archived
     */
    public Boolean getArchived() {
        return this.archived;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListTasksRequest, Builder> {
        private Boolean archived; 
        private String clusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListTasksRequest request) {
            super(request);
            this.archived = request.archived;
            this.clusterId = request.clusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
        } 

        /**
         * Specifies whether to display the response history of the asynchronous API operation. Valid values:
         * <p>
         * 
         * *   true: displays the current response and response history of the asynchronous API operation.
         * *   false: displays only the current response of the asynchronous API operation. If no tasks are running, `[]` is returned.
         * 
         * Default value: false
         * 
         * >  If you specify the TaskId parameter, the Archived parameter is invalid.
         */
        public Builder archived(Boolean archived) {
            this.putQueryParameter("Archived", archived);
            this.archived = archived;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to obtain the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Valid values: 1 to 999.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 50.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the task. You can call the following asynchronous API operations to obtain the task ID.
         * <p>
         * 
         * *   [CreateCluster](~~87100~~)
         * *   [StartCluster](~~200345~~)
         * *   [StopCluster](~~200346~~)
         * *   [DeleteCluster](~~87110~~)
         * *   [AddNodes](~~87147~~)
         * *   [StartNodes](~~87159~~)
         * *   [ResetNodes](~~87158~~)
         * *   [StopNodes](~~87160~~)
         * *   [DeleteNodes](~~87155~~)
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListTasksRequest build() {
            return new ListTasksRequest(this);
        } 

    } 

}
