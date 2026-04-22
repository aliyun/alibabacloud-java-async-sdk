// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link MarkOssV2ResultRequest} extends {@link RequestModel}
 *
 * <p>MarkOssV2ResultRequest</p>
 */
public class MarkOssV2ResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeType")
    private String freezeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestIds")
    private String requestIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private MarkOssV2ResultRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.freezeType = builder.freezeType;
        this.operation = builder.operation;
        this.requestIds = builder.requestIds;
        this.startDate = builder.startDate;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkOssV2ResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return freezeType
     */
    public String getFreezeType() {
        return this.freezeType;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return requestIds
     */
    public String getRequestIds() {
        return this.requestIds;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<MarkOssV2ResultRequest, Builder> {
        private String endDate; 
        private String freezeType; 
        private String operation; 
        private String requestIds; 
        private String startDate; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(MarkOssV2ResultRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.freezeType = request.freezeType;
            this.operation = request.operation;
            this.requestIds = request.requestIds;
            this.startDate = request.startDate;
            this.taskName = request.taskName;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * FreezeType.
         */
        public Builder freezeType(String freezeType) {
            this.putQueryParameter("FreezeType", freezeType);
            this.freezeType = freezeType;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * RequestIds.
         */
        public Builder requestIds(String requestIds) {
            this.putQueryParameter("RequestIds", requestIds);
            this.requestIds = requestIds;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public MarkOssV2ResultRequest build() {
            return new MarkOssV2ResultRequest(this);
        } 

    } 

}
