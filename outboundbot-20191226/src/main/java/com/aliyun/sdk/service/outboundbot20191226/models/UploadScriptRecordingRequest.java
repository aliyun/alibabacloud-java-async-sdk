// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadScriptRecordingRequest} extends {@link RequestModel}
 *
 * <p>UploadScriptRecordingRequest</p>
 */
public class UploadScriptRecordingRequest extends Request {
    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private UploadScriptRecordingRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadScriptRecordingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<UploadScriptRecordingRequest, Builder> {
        private String content; 
        private String fileId; 
        private String fileName; 
        private String instanceId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(UploadScriptRecordingRequest request) {
            super(request);
            this.content = request.content;
            this.fileId = request.fileId;
            this.fileName = request.fileName;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public UploadScriptRecordingRequest build() {
            return new UploadScriptRecordingRequest(this);
        } 

    } 

}
