// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotListConversationChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>KopilotListConversationChatMessagesRequest</p>
 */
public class KopilotListConversationChatMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeTurnId")
    private Integer beforeTurnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskCursor")
    private String taskCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskPageSize")
    private Integer taskPageSize;

    private KopilotListConversationChatMessagesRequest(Builder builder) {
        super(builder);
        this.beforeTurnId = builder.beforeTurnId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.taskCursor = builder.taskCursor;
        this.taskPageSize = builder.taskPageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotListConversationChatMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beforeTurnId
     */
    public Integer getBeforeTurnId() {
        return this.beforeTurnId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return taskCursor
     */
    public String getTaskCursor() {
        return this.taskCursor;
    }

    /**
     * @return taskPageSize
     */
    public Integer getTaskPageSize() {
        return this.taskPageSize;
    }

    public static final class Builder extends Request.Builder<KopilotListConversationChatMessagesRequest, Builder> {
        private Integer beforeTurnId; 
        private Integer pageSize; 
        private String regionId; 
        private String sessionId; 
        private String taskCursor; 
        private Integer taskPageSize; 

        private Builder() {
            super();
        } 

        private Builder(KopilotListConversationChatMessagesRequest request) {
            super(request);
            this.beforeTurnId = request.beforeTurnId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.taskCursor = request.taskCursor;
            this.taskPageSize = request.taskPageSize;
        } 

        /**
         * <p>The cursor.</p>
         * <blockquote>
         * <p>If this parameter is not specified, the last pageSize turn IDs are returned. If this parameter is specified, the turn IDs before the specified turn ID are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        public Builder beforeTurnId(Integer beforeTurnId) {
            this.putQueryParameter("BeforeTurnId", beforeTurnId);
            this.beforeTurnId = beforeTurnId;
            return this;
        }

        /**
         * <p>The page size.</p>
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
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e356c91c-8220-425c-9d86-********</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The pagination cursor. Do not specify this parameter for the first query. For subsequent queries, pass in the value of Data.ScheduledTaskInfo.NextTaskCursor from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder taskCursor(String taskCursor) {
            this.putQueryParameter("TaskCursor", taskCursor);
            this.taskCursor = taskCursor;
            return this;
        }

        /**
         * <p>The number of scheduled tasks per page. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder taskPageSize(Integer taskPageSize) {
            this.putQueryParameter("TaskPageSize", taskPageSize);
            this.taskPageSize = taskPageSize;
            return this;
        }

        @Override
        public KopilotListConversationChatMessagesRequest build() {
            return new KopilotListConversationChatMessagesRequest(this);
        } 

    } 

}
