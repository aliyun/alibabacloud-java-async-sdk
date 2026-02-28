// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobDocument")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobFile")
    private java.util.Map<String, ?> jobFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RolloutConfig")
    private java.util.Map<String, ?> rolloutConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTime")
    private Long scheduledTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> targetConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutConfig")
    private java.util.Map<String, ?> timeoutConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobDocument = builder.jobDocument;
        this.jobFile = builder.jobFile;
        this.jobName = builder.jobName;
        this.rolloutConfig = builder.rolloutConfig;
        this.scheduledTime = builder.scheduledTime;
        this.targetConfig = builder.targetConfig;
        this.timeoutConfig = builder.timeoutConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobDocument
     */
    public String getJobDocument() {
        return this.jobDocument;
    }

    /**
     * @return jobFile
     */
    public java.util.Map<String, ?> getJobFile() {
        return this.jobFile;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return rolloutConfig
     */
    public java.util.Map<String, ?> getRolloutConfig() {
        return this.rolloutConfig;
    }

    /**
     * @return scheduledTime
     */
    public Long getScheduledTime() {
        return this.scheduledTime;
    }

    /**
     * @return targetConfig
     */
    public java.util.Map<String, ?> getTargetConfig() {
        return this.targetConfig;
    }

    /**
     * @return timeoutConfig
     */
    public java.util.Map<String, ?> getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private String description; 
        private String iotInstanceId; 
        private String jobDocument; 
        private java.util.Map<String, ?> jobFile; 
        private String jobName; 
        private java.util.Map<String, ?> rolloutConfig; 
        private Long scheduledTime; 
        private java.util.Map<String, ?> targetConfig; 
        private java.util.Map<String, ?> timeoutConfig; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.jobDocument = request.jobDocument;
            this.jobFile = request.jobFile;
            this.jobName = request.jobName;
            this.rolloutConfig = request.rolloutConfig;
            this.scheduledTime = request.scheduledTime;
            this.targetConfig = request.targetConfig;
            this.timeoutConfig = request.timeoutConfig;
            this.type = request.type;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;serviceIdentifier&quot;: &quot;test_service&quot;, &quot;params&quot;: { &quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot; } }</p>
         */
        public Builder jobDocument(String jobDocument) {
            this.putQueryParameter("JobDocument", jobDocument);
            this.jobDocument = jobDocument;
            return this;
        }

        /**
         * JobFile.
         */
        public Builder jobFile(java.util.Map<String, ?> jobFile) {
            String jobFileShrink = shrink(jobFile, "JobFile", "json");
            this.putQueryParameter("JobFile", jobFileShrink);
            this.jobFile = jobFile;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oneJob</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * RolloutConfig.
         */
        public Builder rolloutConfig(java.util.Map<String, ?> rolloutConfig) {
            String rolloutConfigShrink = shrink(rolloutConfig, "RolloutConfig", "json");
            this.putQueryParameter("RolloutConfig", rolloutConfigShrink);
            this.rolloutConfig = rolloutConfig;
            return this;
        }

        /**
         * ScheduledTime.
         */
        public Builder scheduledTime(Long scheduledTime) {
            this.putQueryParameter("ScheduledTime", scheduledTime);
            this.scheduledTime = scheduledTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;targetType&quot;:&quot;PRODUCT_KEY&quot;,&quot;targetProduct&quot;:&quot;a1j***3d&quot;}</p>
         */
        public Builder targetConfig(java.util.Map<String, ?> targetConfig) {
            String targetConfigShrink = shrink(targetConfig, "TargetConfig", "json");
            this.putQueryParameter("TargetConfig", targetConfigShrink);
            this.targetConfig = targetConfig;
            return this;
        }

        /**
         * TimeoutConfig.
         */
        public Builder timeoutConfig(java.util.Map<String, ?> timeoutConfig) {
            String timeoutConfigShrink = shrink(timeoutConfig, "TimeoutConfig", "json");
            this.putQueryParameter("TimeoutConfig", timeoutConfigShrink);
            this.timeoutConfig = timeoutConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INVOKE_SERVICE</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

}
