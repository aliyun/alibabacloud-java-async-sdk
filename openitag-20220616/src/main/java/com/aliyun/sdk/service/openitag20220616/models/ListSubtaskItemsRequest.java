// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubtaskItemsRequest} extends {@link RequestModel}
 *
 * <p>ListSubtaskItemsRequest</p>
 */
public class ListSubtaskItemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SubtaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subtaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
    private Integer pageSize;

    private ListSubtaskItemsRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskID = builder.taskID;
        this.subtaskId = builder.subtaskId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubtaskItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return taskID
     */
    public String getTaskID() {
        return this.taskID;
    }

    /**
     * @return subtaskId
     */
    public String getSubtaskId() {
        return this.subtaskId;
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

    public static final class Builder extends Request.Builder<ListSubtaskItemsRequest, Builder> {
        private String tenantId; 
        private String taskID; 
        private String subtaskId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSubtaskItemsRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskID = request.taskID;
            this.subtaskId = request.subtaskId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TaskID.
         */
        public Builder taskID(String taskID) {
            this.putPathParameter("TaskID", taskID);
            this.taskID = taskID;
            return this;
        }

        /**
         * SubtaskId.
         */
        public Builder subtaskId(String subtaskId) {
            this.putPathParameter("SubtaskId", subtaskId);
            this.subtaskId = subtaskId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListSubtaskItemsRequest build() {
            return new ListSubtaskItemsRequest(this);
        } 

    } 

}
