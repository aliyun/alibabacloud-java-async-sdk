// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Date format type</p>
         * 
         * <strong>example:</strong>
         * <p>yyyyMMdd</p>
         */
        public Builder dateFormat(String dateFormat) {
            this.putQueryParameter("DateFormat", dateFormat);
            this.dateFormat = dateFormat;
            return this;
        }

        /**
         * <p>File name.</p>
         * <blockquote>
         * <p>The file name must end with txt or sql. For example, test.txt, test.sql.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test.csv</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>File type</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>File URL.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/cpoc/953c883cde33b2e21d722eb661d26375/测试文件模板-通用.csv</p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Service code.</p>
         * 
         * <strong>example:</strong>
         * <p>anti_fraud_v2</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>Scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>er-log-s3</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>Access type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF_CONSOLE</p>
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
