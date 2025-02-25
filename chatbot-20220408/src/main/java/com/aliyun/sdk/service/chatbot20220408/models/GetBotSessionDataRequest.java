// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBotSessionDataRequest} extends {@link RequestModel}
 *
 * <p>GetBotSessionDataRequest</p>
 */
public class GetBotSessionDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private GetBotSessionDataRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.endTime = builder.endTime;
        this.robotInstanceId = builder.robotInstanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBotSessionDataRequest create() {
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

    public static final class Builder extends Request.Builder<GetBotSessionDataRequest, Builder> {
        private String agentKey; 
        private String endTime; 
        private String robotInstanceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetBotSessionDataRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.endTime = request.endTime;
            this.robotInstanceId = request.robotInstanceId;
            this.startTime = request.startTime;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20240605</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20240505</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetBotSessionDataRequest build() {
            return new GetBotSessionDataRequest(this);
        } 

    } 

}
