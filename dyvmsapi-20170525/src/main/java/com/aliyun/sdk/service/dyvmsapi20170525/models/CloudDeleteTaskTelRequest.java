// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudDeleteTaskTelRequest} extends {@link RequestModel}
 *
 * <p>CloudDeleteTaskTelRequest</p>
 */
public class CloudDeleteTaskTelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    private Long fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tels")
    private String tels;

    private CloudDeleteTaskTelRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.tels = builder.tels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudDeleteTaskTelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return tels
     */
    public String getTels() {
        return this.tels;
    }

    public static final class Builder extends Request.Builder<CloudDeleteTaskTelRequest, Builder> {
        private Long enterpriseId; 
        private Long fileId; 
        private String fileName; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long status; 
        private Long taskId; 
        private String tels; 

        private Builder() {
            super();
        } 

        private Builder(CloudDeleteTaskTelRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.fileId = request.fileId;
            this.fileName = request.fileName;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.taskId = request.taskId;
            this.tels = request.tels;
        } 

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>批次Id</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>批次名称；按照名称删除会删除最近添加的批次</p>
         * 
         * <strong>example:</strong>
         * <p>test_1</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>号码状态；0:未呼叫 1:已呼叫</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>任务Id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>电话号码；支持多个，多个号码用英文逗号&quot;,&quot;分隔；任务在运行中，号码也会被删除，最多支持10W个号码；支持加密号码删除，加密号码传参时需URL Encode</p>
         * 
         * <strong>example:</strong>
         * <p>18360957135</p>
         */
        public Builder tels(String tels) {
            this.putQueryParameter("Tels", tels);
            this.tels = tels;
            return this;
        }

        @Override
        public CloudDeleteTaskTelRequest build() {
            return new CloudDeleteTaskTelRequest(this);
        } 

    } 

}
