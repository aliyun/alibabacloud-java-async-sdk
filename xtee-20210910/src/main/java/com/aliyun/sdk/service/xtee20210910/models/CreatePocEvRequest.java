// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePocEvRequest} extends {@link RequestModel}
 *
 * <p>CreatePocEvRequest</p>
 */
public class CreatePocEvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateFormat")
    private String dateFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreatePocEvRequest(Builder builder) {
        super(builder);
        this.dateFormat = builder.dateFormat;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.serviceCode = builder.serviceCode;
        this.serviceName = builder.serviceName;
        this.tab = builder.tab;
        this.taskName = builder.taskName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePocEvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dateFormat
     */
    public String getDateFormat() {
        return this.dateFormat;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return tab
     */
    public String getTab() {
        return this.tab;
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

    public static final class Builder extends Request.Builder<CreatePocEvRequest, Builder> {
        private String dateFormat; 
        private String fileName; 
        private String fileType; 
        private String fileUrl; 
        private String lang; 
        private String regId; 
        private String serviceCode; 
        private String serviceName; 
        private String tab; 
        private String taskName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePocEvRequest request) {
            super(request);
            this.dateFormat = request.dateFormat;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.fileUrl = request.fileUrl;
            this.lang = request.lang;
            this.regId = request.regId;
            this.serviceCode = request.serviceCode;
            this.serviceName = request.serviceName;
            this.tab = request.tab;
            this.taskName = request.taskName;
            this.type = request.type;
        } 

        /**
         * DateFormat.
         */
        public Builder dateFormat(String dateFormat) {
            this.putQueryParameter("DateFormat", dateFormat);
            this.dateFormat = dateFormat;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
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
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreatePocEvRequest build() {
            return new CreatePocEvRequest(this);
        } 

    } 

}
