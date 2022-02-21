// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotColdKnowledgesRequest} extends {@link RequestModel}
 *
 * <p>ListBotColdKnowledgesRequest</p>
 */
public class ListBotColdKnowledgesRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("RobotInstanceId")
    @Validation(required = true)
    private String robotInstanceId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private ListBotColdKnowledgesRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.robotInstanceId = builder.robotInstanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBotColdKnowledgesRequest create() {
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

    public static final class Builder extends Request.Builder<ListBotColdKnowledgesRequest, Builder> {
        private String endTime; 
        private Integer limit; 
        private String robotInstanceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListBotColdKnowledgesRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.limit = response.limit;
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
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
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
        public ListBotColdKnowledgesRequest build() {
            return new ListBotColdKnowledgesRequest(this);
        } 

    } 

}
