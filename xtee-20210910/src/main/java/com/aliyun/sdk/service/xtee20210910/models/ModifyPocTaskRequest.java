// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPocTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyPocTaskRequest</p>
 */
public class ModifyPocTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessType")
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileType")
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModifyPocTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.accessType = builder.accessType;
        this.config = builder.config;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.reason = builder.reason;
        this.regId = builder.regId;
        this.serviceCode = builder.serviceCode;
        this.serviceName = builder.serviceName;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPocTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyPocTaskRequest, Builder> {
        private String lang; 
        private String accessType; 
        private String config; 
        private String fileName; 
        private String fileType; 
        private String fileUrl; 
        private String reason; 
        private String regId; 
        private String serviceCode; 
        private String serviceName; 
        private String taskId; 
        private String taskName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPocTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.accessType = request.accessType;
            this.config = request.config;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.fileUrl = request.fileUrl;
            this.reason = request.reason;
            this.regId = request.regId;
            this.serviceCode = request.serviceCode;
            this.serviceName = request.serviceName;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.type = request.type;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * accessType.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("accessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * config.
         */
        public Builder config(String config) {
            this.putQueryParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * fileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * fileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("fileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * serviceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("serviceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyPocTaskRequest build() {
            return new ModifyPocTaskRequest(this);
        } 

    } 

}
