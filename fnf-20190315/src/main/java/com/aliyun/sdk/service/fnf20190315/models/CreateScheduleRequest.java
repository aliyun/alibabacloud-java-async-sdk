// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link CreateScheduleRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduleRequest</p>
 */
public class CreateScheduleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cronExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Payload")
    private String payload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureVersion")
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
         * <p>The CRON expression.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 * * * * *</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putBodyParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The description of the time-based schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the time-based schedule. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The name of the workflow that is associated with the time-based schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The trigger message of the time-based schedule. Specify the value in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        public Builder payload(String payload) {
            this.putBodyParameter("Payload", payload);
            this.payload = payload;
            return this;
        }

        /**
         * <p>The name of the time-based schedule. The name must meet the following conventions:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must start with a letter or an underscore (_).</li>
         * <li>It is case-sensitive.</li>
         * <li>The name must be 1 to 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testScheduleName</p>
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
