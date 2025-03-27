// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAICoachTaskPageRequest} extends {@link RequestModel}
 *
 * <p>ListAICoachTaskPageRequest</p>
 */
public class ListAICoachTaskPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("studentId")
    private String studentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private ListAICoachTaskPageRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.studentId = builder.studentId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICoachTaskPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return studentId
     */
    public String getStudentId() {
        return this.studentId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListAICoachTaskPageRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private String studentId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListAICoachTaskPageRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.studentId = request.studentId;
            this.taskId = request.taskId;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * studentId.
         */
        public Builder studentId(String studentId) {
            this.putQueryParameter("studentId", studentId);
            this.studentId = studentId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListAICoachTaskPageRequest build() {
            return new ListAICoachTaskPageRequest(this);
        } 

    } 

}
