// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileStoreUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetFileStoreUploadPolicyRequest</p>
 */
public class GetFileStoreUploadPolicyRequest extends Request {
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
    private Long fileStoreId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GetFileStoreUploadPolicyRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.fileName = builder.fileName;
        this.fileStoreId = builder.fileStoreId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileStoreUploadPolicyRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetFileStoreUploadPolicyRequest, Builder> {
        private String agentKey; 
        private String fileName; 
        private Long fileStoreId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetFileStoreUploadPolicyRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.fileName = request.fileName;
            this.fileStoreId = request.fileStoreId;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetFileStoreUploadPolicyRequest build() {
            return new GetFileStoreUploadPolicyRequest(this);
        } 

    } 

}
