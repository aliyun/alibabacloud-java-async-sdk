// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportUserDocumentRequest} extends {@link RequestModel}
 *
 * <p>ImportUserDocumentRequest</p>
 */
public class ImportUserDocumentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("FileStoreId")
    @Validation(required = true)
    private Long fileStoreId;

    @Query
    @NameInMap("OssPath")
    @Validation(required = true)
    private String ossPath;

    @Query
    @NameInMap("StoreId")
    @Validation(required = true)
    private Long storeId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ImportUserDocumentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.fileName = builder.fileName;
        this.fileStoreId = builder.fileStoreId;
        this.ossPath = builder.ossPath;
        this.storeId = builder.storeId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportUserDocumentRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileStoreId
     */
    public Long getFileStoreId() {
        return this.fileStoreId;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return storeId
     */
    public Long getStoreId() {
        return this.storeId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ImportUserDocumentRequest, Builder> {
        private String agentKey; 
        private String fileName; 
        private Long fileStoreId; 
        private String ossPath; 
        private Long storeId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ImportUserDocumentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.fileName = request.fileName;
            this.fileStoreId = request.fileStoreId;
            this.ossPath = request.ossPath;
            this.storeId = request.storeId;
            this.userId = request.userId;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileStoreId.
         */
        public Builder fileStoreId(Long fileStoreId) {
            this.putQueryParameter("FileStoreId", fileStoreId);
            this.fileStoreId = fileStoreId;
            return this;
        }

        /**
         * OssPath.
         */
        public Builder ossPath(String ossPath) {
            this.putQueryParameter("OssPath", ossPath);
            this.ossPath = ossPath;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(Long storeId) {
            this.putQueryParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ImportUserDocumentRequest build() {
            return new ImportUserDocumentRequest(this);
        } 

    } 

}
