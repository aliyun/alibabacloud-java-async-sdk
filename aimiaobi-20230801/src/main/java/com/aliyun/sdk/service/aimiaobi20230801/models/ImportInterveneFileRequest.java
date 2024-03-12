// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportInterveneFileRequest} extends {@link RequestModel}
 *
 * <p>ImportInterveneFileRequest</p>
 */
public class ImportInterveneFileRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("DocName")
    private String docName;

    @Body
    @NameInMap("FileKey")
    private String fileKey;

    @Body
    @NameInMap("FileUrl")
    private String fileUrl;

    private ImportInterveneFileRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.docName = builder.docName;
        this.fileKey = builder.fileKey;
        this.fileUrl = builder.fileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportInterveneFileRequest create() {
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

    public static final class Builder extends Request.Builder<ImportInterveneFileRequest, Builder> {
        private String agentKey; 
        private String docName; 
        private String fileKey; 
        private String fileUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportInterveneFileRequest request) {
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
        public ImportInterveneFileRequest build() {
            return new ImportInterveneFileRequest(this);
        } 

    } 

}
