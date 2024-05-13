// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportInterveneFileAsyncRequest} extends {@link RequestModel}
 *
 * <p>ImportInterveneFileAsyncRequest</p>
 */
public class ImportInterveneFileAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocName")
    private String docName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    private ImportInterveneFileAsyncRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.docName = builder.docName;
        this.fileKey = builder.fileKey;
        this.fileUrl = builder.fileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportInterveneFileAsyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    public static final class Builder extends Request.Builder<ImportInterveneFileAsyncRequest, Builder> {
        private String agentKey; 
        private String docName; 
        private String fileKey; 
        private String fileUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportInterveneFileAsyncRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.docName = request.docName;
            this.fileKey = request.fileKey;
            this.fileUrl = request.fileUrl;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DocName.
         */
        public Builder docName(String docName) {
            this.putBodyParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        @Override
        public ImportInterveneFileAsyncRequest build() {
            return new ImportInterveneFileAsyncRequest(this);
        } 

    } 

}
