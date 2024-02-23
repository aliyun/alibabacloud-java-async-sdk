// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCallTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCallTaskRequest</p>
 */
public class CreateCallTaskRequest extends Request {
    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("Data")
    private String data;

    @Query
    @NameInMap("DataType")
    private String dataType;

    @Query
    @NameInMap("FireTime")
    private String fireTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Resource")
    private String resource;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("ScheduleType")
    private String scheduleType;

    @Query
    @NameInMap("StopTime")
    private String stopTime;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("TemplateCode")
    private String templateCode;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    private CreateCallTaskRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.fireTime = builder.fireTime;
        this.ownerId = builder.ownerId;
        this.resource = builder.resource;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.scheduleType = builder.scheduleType;
        this.stopTime = builder.stopTime;
        this.taskName = builder.taskName;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return fireTime
     */
    public String getFireTime() {
        return this.fireTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return stopTime
     */
    public String getStopTime() {
        return this.stopTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<CreateCallTaskRequest, Builder> {
        private String bizType; 
        private String data; 
        private String dataType; 
        private String fireTime; 
        private Long ownerId; 
        private String resource; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private String scheduleType; 
        private String stopTime; 
        private String taskName; 
        private String templateCode; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCallTaskRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.data = request.data;
            this.dataType = request.dataType;
            this.fireTime = request.fireTime;
            this.ownerId = request.ownerId;
            this.resource = request.resource;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.scheduleType = request.scheduleType;
            this.stopTime = request.stopTime;
            this.taskName = request.taskName;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
        } 

        /**
         * The type of the task template. Valid values:
         * <p>
         * 
         * *   **VMS_VOICE_TTS**: the text-to-speech (TTS) notification template.
         * *   **VMS_VOICE_CODE**: the voice notification template.
         * *   **VMS_TTS**: the voice verification code template.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * The called numbers.
         * <p>
         * 
         * *   If you set DataType to LIST, the value of Data is in the LIST format.
         * *   If you set DataType to JSON, the value of Data is in the JSON format.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The type of called numbers. Valid values:
         * <p>
         * 
         * *   **LIST**: the called numbers that are separated by commas (,).
         * *   **JSON**: a JSON-formatted list of called numbers with template parameters.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * This parameter is unavailable.
         */
        public Builder fireTime(String fireTime) {
            this.putQueryParameter("FireTime", fireTime);
            this.fireTime = fireTime;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The calling number. Only virtual numbers are supported.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The type of the calling number. Set the value to **LIST**.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * This parameter is unavailable.
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * This parameter is unavailable.
         */
        public Builder stopTime(String stopTime) {
            this.putQueryParameter("StopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        /**
         * The task name.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The template ID.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * The template name.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreateCallTaskRequest build() {
            return new CreateCallTaskRequest(this);
        } 

    } 

}
