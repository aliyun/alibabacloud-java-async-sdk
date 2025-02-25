// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSortScriptFileRequest} extends {@link RequestModel}
 *
 * <p>SaveSortScriptFileRequest</p>
 */
public class SaveSortScriptFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scriptName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private SaveSortScriptFileRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.scriptName = builder.scriptName;
        this.appVersionId = builder.appVersionId;
        this.fileName = builder.fileName;
        this.content = builder.content;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSortScriptFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<SaveSortScriptFileRequest, Builder> {
        private String appGroupIdentity; 
        private String scriptName; 
        private String appVersionId; 
        private String fileName; 
        private String content; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(SaveSortScriptFileRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.scriptName = request.scriptName;
            this.appVersionId = request.appVersionId;
            this.fileName = request.fileName;
            this.content = request.content;
            this.version = request.version;
        } 

        /**
         * The name or ID of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The name of the script whose content you want to update.
         */
        public Builder scriptName(String scriptName) {
            this.putPathParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * The version number of the application.
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * The file name.
         */
        public Builder fileName(String fileName) {
            this.putPathParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The script content that is encoded in the Base64 format.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * The version number of the script content.
         */
        public Builder version(Integer version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public SaveSortScriptFileRequest build() {
            return new SaveSortScriptFileRequest(this);
        } 

    } 

}
