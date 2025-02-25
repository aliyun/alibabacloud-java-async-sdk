// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceTestTaskLogsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceTestTaskLogsRequest</p>
 */
public class ListServiceTestTaskLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ListServiceTestTaskLogsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sortOrder = builder.sortOrder;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceTestTaskLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListServiceTestTaskLogsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String sortOrder; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceTestTaskLogsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sortOrder = request.sortOrder;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Sort Order. Possible values:</p>
         * <ul>
         * <li><p>Ascending: Ascending order</p>
         * </li>
         * <li><p>Descending (default value): Descending order</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ascending</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>stt-568c2c5a687a409b977e</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListServiceTestTaskLogsRequest build() {
            return new ListServiceTestTaskLogsRequest(this);
        } 

    } 

}
