// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateTriggerRequest</p>
 */
public class UpdateTriggerRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("triggerName")
    @Validation(required = true)
    private String triggerName;

    @Host
    @NameInMap("AccountID")
    private String accountID;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Code-Checksum")
    private String xFcCodeChecksum;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Invocation-Type")
    private String xFcInvocationType;

    @Header
    @NameInMap("X-Fc-Log-Type")
    private String xFcLogType;

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
    @NameInMap("triggerConfig")
    private String triggerConfig;

    private UpdateTriggerRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.triggerName = builder.triggerName;
        this.accountID = builder.accountID;
        this.ifMatch = builder.ifMatch;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
        this.xFcTraceId = builder.xFcTraceId;
        this.description = builder.description;
        this.invocationRole = builder.invocationRole;
        this.qualifier = builder.qualifier;
        this.triggerConfig = builder.triggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTriggerRequest create() {
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
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return accountID
     */
    public String getAccountID() {
        return this.accountID;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcCodeChecksum
     */
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcInvocationType
     */
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    /**
     * @return xFcLogType
     */
    public String getXFcLogType() {
        return this.xFcLogType;
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
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public static final class Builder extends Request.Builder<UpdateTriggerRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String triggerName; 
        private String accountID; 
        private String ifMatch; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcInvocationType; 
        private String xFcLogType; 
        private String xFcTraceId; 
        private String description; 
        private String invocationRole; 
        private String qualifier; 
        private String triggerConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTriggerRequest response) {
            super(response);
            this.serviceName = response.serviceName;
            this.functionName = response.functionName;
            this.triggerName = response.triggerName;
            this.accountID = response.accountID;
            this.ifMatch = response.ifMatch;
            this.xFcAccountId = response.xFcAccountId;
            this.xFcCodeChecksum = response.xFcCodeChecksum;
            this.xFcDate = response.xFcDate;
            this.xFcInvocationType = response.xFcInvocationType;
            this.xFcLogType = response.xFcLogType;
            this.xFcTraceId = response.xFcTraceId;
            this.description = response.description;
            this.invocationRole = response.invocationRole;
            this.qualifier = response.qualifier;
            this.triggerConfig = response.triggerConfig;
        } 

        /**
         * service名称
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * function名称
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * trigger名称
         */
        public Builder triggerName(String triggerName) {
            this.putPathParameter("triggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * AccountID.
         */
        public Builder accountID(String accountID) {
            this.putHostParameter("AccountID", accountID);
            this.accountID = accountID;
            return this;
        }

        /**
         * 用于确保实际更改的资源和期望更改的资源是一致的，该值来自Create，Get和Update API的响应
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Code-Checksum.
         */
        public Builder xFcCodeChecksum(String xFcCodeChecksum) {
            this.putHeaderParameter("X-Fc-Code-Checksum", xFcCodeChecksum);
            this.xFcCodeChecksum = xFcCodeChecksum;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Invocation-Type.
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * X-Fc-Log-Type.
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * event source，如OSS，使用该role去invoke function
         */
        public Builder invocationRole(String invocationRole) {
            this.putBodyParameter("invocationRole", invocationRole);
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * service版本
         */
        public Builder qualifier(String qualifier) {
            this.putBodyParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * trigger配置，针对不同的trigger类型，trigger配置会有所不同	
         */
        public Builder triggerConfig(String triggerConfig) {
            this.putBodyParameter("triggerConfig", triggerConfig);
            this.triggerConfig = triggerConfig;
            return this;
        }

        @Override
        public UpdateTriggerRequest build() {
            return new UpdateTriggerRequest(this);
        } 

    } 

}
