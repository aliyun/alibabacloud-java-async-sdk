// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateTriggerRequest</p>
 */
public class CreateTriggerRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("invocationRole")
    private String invocationRole;

    @Body
    @NameInMap("qualifier")
    private String qualifier;

    @Body
    @NameInMap("sourceArn")
    private String sourceArn;

    @Body
    @NameInMap("triggerConfig")
    @Validation(required = true)
    private String triggerConfig;

    @Body
    @NameInMap("triggerName")
    @Validation(required = true)
    private String triggerName;

    @Body
    @NameInMap("triggerType")
    @Validation(required = true)
    private String triggerType;

    private CreateTriggerRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.description = builder.description;
        this.invocationRole = builder.invocationRole;
        this.qualifier = builder.qualifier;
        this.sourceArn = builder.sourceArn;
        this.triggerConfig = builder.triggerConfig;
        this.triggerName = builder.triggerName;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return invocationRole
     */
    public String getInvocationRole() {
        return this.invocationRole;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder<CreateTriggerRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String description; 
        private String invocationRole; 
        private String qualifier; 
        private String sourceArn; 
        private String triggerConfig; 
        private String triggerName; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTriggerRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.functionName = request.functionName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.description = request.description;
            this.invocationRole = request.invocationRole;
            this.qualifier = request.qualifier;
            this.sourceArn = request.sourceArn;
            this.triggerConfig = request.triggerConfig;
            this.triggerName = request.triggerName;
            this.triggerType = request.triggerType;
        } 

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The name of the function.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time when the request is initiated on the client. The format of the value is: **EEE,d MMM yyyy HH:mm:ss GMT**.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The custom request ID.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The description of the trigger.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The role that is used by the event source such as OSS to invoke the function. For more information, see [Overview](~~53102~~).
         */
        public Builder invocationRole(String invocationRole) {
            this.putBodyParameter("invocationRole", invocationRole);
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * The version or alias of the service.
         */
        public Builder qualifier(String qualifier) {
            this.putBodyParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the event source for the trigger.
         */
        public Builder sourceArn(String sourceArn) {
            this.putBodyParameter("sourceArn", sourceArn);
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:
         * <p>
         * 
         * *   OSS trigger: [OSSTriggerConfig](javascript:void\(0\)).
         * *   Log Service trigger: [LogTriggerConfig](javascript:void\(0\)).
         * *   Time trigger: [TimeTriggerConfig](javascript:void\(0\)).
         * *   HTTP trigger: [HTTPTriggerConfig](javascript:void\(0\)).
         * *   Tablestore trigger: Specify the **SourceArn** parameter and leave this parameter empty.
         * *   Alibaba Cloud CDN event trigger: [CDNEventsTriggerConfig](javascript:void\(0\)).
         * *   MNS topic trigger: [MnsTopicTriggerConfig](javascript:void\(0\)).
         */
        public Builder triggerConfig(String triggerConfig) {
            this.putBodyParameter("triggerConfig", triggerConfig);
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * The name of the trigger. The name contains only letters, digits, hyphens (-), and underscores (\_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).
         */
        public Builder triggerName(String triggerName) {
            this.putBodyParameter("triggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * The type of the trigger. Valid values:
         * <p>
         * 
         * *   **oss**: OSS event trigger. For more information, see [Overview](~~62922~~).
         * *   **log**: Log Service trigger. For more information, see [Overview](~~84386~~).
         * *   **timer**: time trigger. For more information, see [Overview](~~68172~~).
         * *   **http**: HTTP trigger. For more information, see [Overview](~~71229~~).
         * *   **tablestore**: Tablestore trigger. For more information, see [Overview](~~100092~~).
         * *   **cdn_events**: CDN event trigger. For more information, see [Overview](~~73333~~).
         * *   **mns_topic**: MNS topic trigger. For more information, see [Overview](~~97032~~).
         */
        public Builder triggerType(String triggerType) {
            this.putBodyParameter("triggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public CreateTriggerRequest build() {
            return new CreateTriggerRequest(this);
        } 

    } 

}
