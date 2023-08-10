// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSortScriptFileRequest} extends {@link RequestModel}
 *
 * <p>SaveSortScriptFileRequest</p>
 */
public class SaveSortScriptFileRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("scriptName")
    @Validation(required = true)
    private String scriptName;

    @Path
    @NameInMap("appVersionId")
    @Validation(required = true)
    private String appVersionId;

    @Path
    @NameInMap("fileName")
    @Validation(required = true)
    private String fileName;

    @Body
    @NameInMap("content")
    private String content;

    @Body
    @NameInMap("version")
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
         * \"\"1111\"\"
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * \"\"11111\"\"
         */
        public Builder scriptName(String scriptName) {
            this.putPathParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * \"\"111111\"\"
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putPathParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * version.
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
