// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBotSessionDataRequest} extends {@link RequestModel}
 *
 * <p>GetBotSessionDataRequest</p>
 */
public class GetBotSessionDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("RobotInstanceId")
    @Validation(required = true)
    private String robotInstanceId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private GetBotSessionDataRequest(Builder builder) {
        super(builder);
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
        private String endTime; 
        private String robotInstanceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetBotSessionDataRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.robotInstanceId = response.robotInstanceId;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * RobotInstanceId.
         */
        public Builder robotInstanceId(String robotInstanceId) {
            this.putQueryParameter("RobotInstanceId", robotInstanceId);
            this.robotInstanceId = robotInstanceId;
            return this;
        }

        /**
         * StartTime.
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
