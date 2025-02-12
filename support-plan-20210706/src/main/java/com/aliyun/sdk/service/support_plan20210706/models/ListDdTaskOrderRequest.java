// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

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
 * {@link ListDdTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>ListDdTaskOrderRequest</p>
 */
public class ListDdTaskOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateRealName")
    private String createRealName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsUrgent")
    private Boolean isUrgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private ListDdTaskOrderRequest(Builder builder) {
        super(builder);
        this.createRealName = builder.createRealName;
        this.endTime = builder.endTime;
        this.isUrgent = builder.isUrgent;
        this.openGroupId = builder.openGroupId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDdTaskOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createRealName
     */
    public String getCreateRealName() {
        return this.createRealName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isUrgent
     */
    public Boolean getIsUrgent() {
        return this.isUrgent;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder extends Request.Builder<ListDdTaskOrderRequest, Builder> {
        private String createRealName; 
        private String endTime; 
        private Boolean isUrgent; 
        private String openGroupId; 
        private Long pageNo; 
        private Long pageSize; 
        private String startTime; 
        private String taskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListDdTaskOrderRequest request) {
            super(request);
            this.createRealName = request.createRealName;
            this.endTime = request.endTime;
            this.isUrgent = request.isUrgent;
            this.openGroupId = request.openGroupId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.taskStatus = request.taskStatus;
        } 

        /**
         * <p>createRealName</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        public Builder createRealName(String createRealName) {
            this.putQueryParameter("CreateRealName", createRealName);
            this.createRealName = createRealName;
            return this;
        }

        /**
         * <p>endTime</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-20 14:09:16</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IsUrgent.
         */
        public Builder isUrgent(Boolean isUrgent) {
            this.putQueryParameter("IsUrgent", isUrgent);
            this.isUrgent = isUrgent;
            return this;
        }

        /**
         * <p>openGroupId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAWNN14N</p>
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * <p>pageNo</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>pageSize</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>startTime</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-01 14:09:11</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>taskStatus</p>
         * 
         * <strong>example:</strong>
         * <p>dealingNode</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        @Override
        public ListDdTaskOrderRequest build() {
            return new ListDdTaskOrderRequest(this);
        } 

    } 

}
