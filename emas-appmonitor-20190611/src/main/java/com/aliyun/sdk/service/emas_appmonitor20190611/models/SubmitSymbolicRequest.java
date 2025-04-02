// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link SubmitSymbolicRequest} extends {@link RequestModel}
 *
 * <p>SubmitSymbolicRequest</p>
 */
public class SubmitSymbolicRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildId")
    private String buildId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    @com.aliyun.core.annotation.Validation(required = true)
    private String os;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private SubmitSymbolicRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appVersion = builder.appVersion;
        this.buildId = builder.buildId;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.fileType = builder.fileType;
        this.os = builder.os;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSymbolicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return buildId
     */
    public String getBuildId() {
        return this.buildId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<SubmitSymbolicRequest, Builder> {
        private Long appKey; 
        private String appVersion; 
        private String buildId; 
        private String fileName; 
        private String filePath; 
        private String fileType; 
        private String os; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSymbolicRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.appVersion = request.appVersion;
            this.buildId = request.buildId;
            this.fileName = request.fileName;
            this.filePath = request.filePath;
            this.fileType = request.fileType;
            this.os = request.os;
            this.uuid = request.uuid;
        } 

        /**
         * <p>appKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24781204</p>
         */
        public Builder appKey(Long appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * BuildId.
         */
        public Builder buildId(String buildId) {
            this.putBodyParameter("BuildId", buildId);
            this.buildId = buildId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_so.zip</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24781204@android/1743506690915-app_so.zip</p>
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_SO</p>
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>uuid</p>
         * 
         * <strong>example:</strong>
         * <p>abcf4a4b-158c-4a0b-b81c-262785d84c4f</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public SubmitSymbolicRequest build() {
            return new SubmitSymbolicRequest(this);
        } 

    } 

}
