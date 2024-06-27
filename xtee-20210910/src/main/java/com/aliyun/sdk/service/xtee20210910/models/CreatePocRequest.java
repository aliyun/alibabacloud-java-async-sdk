// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePocRequest} extends {@link RequestModel}
 *
 * <p>CreatePocRequest</p>
 */
public class CreatePocRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configStr")
    private String configStr;

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
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private CreatePocRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.configStr = builder.configStr;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.regId = builder.regId;
        this.serviceCode = builder.serviceCode;
        this.serviceName = builder.serviceName;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePocRequest create() {
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
     * @return configStr
     */
    public String getConfigStr() {
        return this.configStr;
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreatePocRequest, Builder> {
        private String lang; 
        private String configStr; 
        private String fileName; 
        private String fileType; 
        private String fileUrl; 
        private String regId; 
        private String serviceCode; 
        private String serviceName; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePocRequest request) {
            super(request);
            this.lang = request.lang;
            this.configStr = request.configStr;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.fileUrl = request.fileUrl;
            this.regId = request.regId;
            this.serviceCode = request.serviceCode;
            this.serviceName = request.serviceName;
            this.taskName = request.taskName;
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
         * configStr.
         */
        public Builder configStr(String configStr) {
            this.putQueryParameter("configStr", configStr);
            this.configStr = configStr;
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
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreatePocRequest build() {
            return new CreatePocRequest(this);
        } 

    } 

}
