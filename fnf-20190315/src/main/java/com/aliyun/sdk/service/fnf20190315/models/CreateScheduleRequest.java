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

    @Body
    @NameInMap("ScheduleName")
    @Validation(required = true)
    private String scheduleName;

    @Query
    @NameInMap("SignatureVersion")
    private String signatureVersion;

    private CreateScheduleRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.description = builder.description;
        this.enable = builder.enable;
        this.flowName = builder.flowName;
        this.payload = builder.payload;
        this.scheduleName = builder.scheduleName;
        this.signatureVersion = builder.signatureVersion;
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
     * @return scheduleName
     */
    public String getScheduleName() {
        return this.scheduleName;
    }

    /**
     * @return signatureVersion
     */
    public String getSignatureVersion() {
        return this.signatureVersion;
    }

    public static final class Builder extends Request.Builder<CreateScheduleRequest, Builder> {
        private String cronExpression; 
        private String description; 
        private Boolean enable; 
        private String flowName; 
        private String payload; 
        private String scheduleName; 
        private String signatureVersion; 

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
            this.scheduleName = request.scheduleName;
            this.signatureVersion = request.signatureVersion;
        } 

        /**
         * The CRON expression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putBodyParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * The description of the time-based schedule.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to enable the time-based schedule. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The name of the flow that is bound to the time-based schedule.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * The trigger message of the time-based schedule. Specify the value in the JSON format.
         */
        public Builder payload(String payload) {
            this.putBodyParameter("Payload", payload);
            this.payload = payload;
            return this;
        }

        /**
         * The name of the time-based schedule. Configure this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder scheduleName(String scheduleName) {
            this.putBodyParameter("ScheduleName", scheduleName);
            this.scheduleName = scheduleName;
            return this;
        }

        /**
         * SignatureVersion.
         */
        public Builder signatureVersion(String signatureVersion) {
            this.putQueryParameter("SignatureVersion", signatureVersion);
            this.signatureVersion = signatureVersion;
            return this;
        }

        @Override
        public CreateScheduleRequest build() {
            return new CreateScheduleRequest(this);
        } 

    } 

}
