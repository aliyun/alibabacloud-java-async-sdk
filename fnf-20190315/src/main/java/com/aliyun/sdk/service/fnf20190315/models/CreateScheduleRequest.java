// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduleRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduleRequest</p>
 */
public class CreateScheduleRequest extends Request {
    @Body
    @NameInMap("CronExpression")
    @Validation(required = true)
    private String cronExpression;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Enable")
    private Boolean enable;

    @Body
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Body
    @NameInMap("Payload")
    private String payload;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("ScheduleName")
    @Validation(required = true)
    private String scheduleName;

    private CreateScheduleRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.description = builder.description;
        this.enable = builder.enable;
        this.flowName = builder.flowName;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
        this.scheduleName = builder.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleName
     */
    public String getScheduleName() {
        return this.scheduleName;
    }

    public static final class Builder extends Request.Builder<CreateScheduleRequest, Builder> {
        private String cronExpression; 
        private String description; 
        private Boolean enable; 
        private String flowName; 
        private String payload; 
        private String requestId; 
        private String scheduleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduleRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.description = request.description;
            this.enable = request.enable;
            this.flowName = request.flowName;
            this.payload = request.payload;
            this.requestId = request.requestId;
            this.scheduleName = request.scheduleName;
        } 

        /**
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putBodyParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(String payload) {
            this.putBodyParameter("Payload", payload);
            this.payload = payload;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * ScheduleName.
         */
        public Builder scheduleName(String scheduleName) {
            this.putBodyParameter("ScheduleName", scheduleName);
            this.scheduleName = scheduleName;
            return this;
        }

        @Override
        public CreateScheduleRequest build() {
            return new CreateScheduleRequest(this);
        } 

    } 

}
