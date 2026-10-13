// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListTongyiChatHistorysRequest} extends {@link RequestModel}
 *
 * <p>ListTongyiChatHistorysRequest</p>
 */
public class ListTongyiChatHistorysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private ListTongyiChatHistorysRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.robotInstanceId = builder.robotInstanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTongyiChatHistorysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return robotInstanceId
     */
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListTongyiChatHistorysRequest, Builder> {
        private String agentKey; 
        private String endTime; 
        private Integer limit; 
        private String robotInstanceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListTongyiChatHistorysRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.robotInstanceId = request.robotInstanceId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The key of the business space. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the primary account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The end time of the query. The time is in the yyyy-MM-dd HH:mm:ss format, such as 2024-04-01 08:00:00.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-01 08:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of data entries. Default value: 30. Maximum value: 500.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The ID of the robot instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-7QuUfaqMQe</p>
         */
        public Builder robotInstanceId(String robotInstanceId) {
            this.putQueryParameter("RobotInstanceId", robotInstanceId);
            this.robotInstanceId = robotInstanceId;
            return this;
        }

        /**
         * <p>The start time of the query. The time is in the yyyy-MM-dd HH:mm:ss format, such as 2024-04-01 00:00:00.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-01 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListTongyiChatHistorysRequest build() {
            return new ListTongyiChatHistorysRequest(this);
        } 

    } 

}
