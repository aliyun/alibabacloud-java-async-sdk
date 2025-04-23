// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTasksRequest</p>
 */
public class ListTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Archived")
    private Boolean archived;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 999, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
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
         * <p>Specifies whether to display the response history of the asynchronous API operation. Valid values:</p>
         * <ul>
         * <li>true: displays the current response and response history of the asynchronous API operation.</li>
         * <li>false: displays only the current response of the asynchronous API operation. If no tasks are running, <code>[]</code> is returned.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> If you specify the TaskId parameter, the Archived parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder archived(Boolean archived) {
            this.putQueryParameter("Archived", archived);
            this.archived = archived;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Valid values: 1 to 999.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 50.</p>
         * <p>Default value: 10.</p>
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
         * <p>The task ID. You can call the following asynchronous API operations to obtain the task ID.</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/87100.html">CreateCluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/200345.html">StartCluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/200346.html">StopCluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/87110.html">DeleteCluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/87147.html">AddNodes</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/87159.html">StartNodes</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/87158.html">ResetNodes</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/87160.html">StopNodes</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/87155.html">DeleteNodes</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
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
