// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterEventsRequest</p>
 */
public class DescribeClusterEventsRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("page_number")
    private Long pageNumber;

    @Query
    @NameInMap("page_size")
    private Long pageSize;

    @Query
    @NameInMap("task_id")
    private String taskId;

    private DescribeClusterEventsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterEventsRequest, Builder> {
        private String clusterId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterEventsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 50. Default value: 50.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the query task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeClusterEventsRequest build() {
            return new DescribeClusterEventsRequest(this);
        } 

    } 

}
