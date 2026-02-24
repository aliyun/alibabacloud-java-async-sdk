// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ChatBIFileUploadRequest} extends {@link RequestModel}
 *
 * <p>ChatBIFileUploadRequest</p>
 */
public class ChatBIFileUploadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthMessage")
    private String authMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    private ChatBIFileUploadRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.fileName = builder.fileName;
        this.instanceName = builder.instanceName;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIFileUploadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authMessage
     */
    public String getAuthMessage() {
        return this.authMessage;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<ChatBIFileUploadRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String fileName; 
        private String instanceName; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIFileUploadRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.fileName = request.fileName;
            this.instanceName = request.instanceName;
            this.sourceRegionId = request.sourceRegionId;
        } 

        /**
         * AuthMessage.
         */
        public Builder authMessage(String authMessage) {
            this.putQueryParameter("AuthMessage", authMessage);
            this.authMessage = authMessage;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public ChatBIFileUploadRequest build() {
            return new ChatBIFileUploadRequest(this);
        } 

    } 

}
