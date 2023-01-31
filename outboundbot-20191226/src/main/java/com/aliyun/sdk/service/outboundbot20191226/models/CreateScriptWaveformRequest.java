// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScriptWaveformRequest} extends {@link RequestModel}
 *
 * <p>CreateScriptWaveformRequest</p>
 */
public class CreateScriptWaveformRequest extends Request {
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
    @NameInMap("ScriptContent")
    @Validation(required = true)
    private String scriptContent;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private CreateScriptWaveformRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
        this.scriptContent = builder.scriptContent;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptWaveformRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return scriptContent
     */
    public String getScriptContent() {
        return this.scriptContent;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<CreateScriptWaveformRequest, Builder> {
        private String fileId; 
        private String fileName; 
        private String instanceId; 
        private String scriptContent; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(CreateScriptWaveformRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.fileName = request.fileName;
            this.instanceId = request.instanceId;
            this.scriptContent = request.scriptContent;
            this.scriptId = request.scriptId;
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
         * ScriptContent.
         */
        public Builder scriptContent(String scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
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
        public CreateScriptWaveformRequest build() {
            return new CreateScriptWaveformRequest(this);
        } 

    } 

}
