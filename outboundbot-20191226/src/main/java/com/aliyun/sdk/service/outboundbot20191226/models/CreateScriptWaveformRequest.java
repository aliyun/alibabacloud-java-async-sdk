// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateScriptWaveformRequest} extends {@link RequestModel}
 *
 * <p>CreateScriptWaveformRequest</p>
 */
public class CreateScriptWaveformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the recording file.</p>
         * <blockquote>
         * <p>Obtain this ID from the Folder parameter of the GetJobDataUploadParams operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6f91885fa24b4c408d8f4eb392fd8ae6</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The name of the recording file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>faaf8508-9542-4ac4-84a2-0ddcbb5f79a6 (2).json</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2bfa5ae4-7185-4227-a3b8-328f26f11be1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The text of the script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>您好，您昨晚在李佳琦直播间下单的娜薇诗椰子水二代精华2支装还未付款，超时未支付会自动关闭订单，活动错过不再有奥。</p>
         */
        public Builder scriptContent(String scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
            return this;
        }

        /**
         * <p>Scenario ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
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
