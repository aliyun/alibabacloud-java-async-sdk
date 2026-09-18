// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link CancelAiCallDetailsRequest} extends {@link RequestModel}
 *
 * <p>CancelAiCallDetailsRequest</p>
 */
public class CancelAiCallDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetailIdList")
    private java.util.List<String> detailIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionType")
    private Long encryptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private java.util.List<String> phoneNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private CancelAiCallDetailsRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.detailIdList = builder.detailIdList;
        this.encryptionType = builder.encryptionType;
        this.ownerId = builder.ownerId;
        this.phoneNumbers = builder.phoneNumbers;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAiCallDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return detailIdList
     */
    public java.util.List<String> getDetailIdList() {
        return this.detailIdList;
    }

    /**
     * @return encryptionType
     */
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumbers
     */
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CancelAiCallDetailsRequest, Builder> {
        private String batchId; 
        private java.util.List<String> detailIdList; 
        private Long encryptionType; 
        private Long ownerId; 
        private java.util.List<String> phoneNumbers; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelAiCallDetailsRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.detailIdList = request.detailIdList;
            this.encryptionType = request.encryptionType;
            this.ownerId = request.ownerId;
            this.phoneNumbers = request.phoneNumbers;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The batch ID. This ID is returned when you import callee data. You can find the task batch ID on the <strong>Call Task Management</strong>&gt;<strong>Details</strong>&gt;<strong>Execution Record</strong> page, or use the import batch ID that is returned by the <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> API operation. If DetailIdList is specified, this parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>4253331213*****</p>
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>A list of detail IDs. If you specify this parameter, <code>BatchId</code> and <code>PhoneNumbers</code> are ignored.</p>
         */
        public Builder detailIdList(java.util.List<String> detailIdList) {
            String detailIdListShrink = shrink(detailIdList, "DetailIdList", "json");
            this.putQueryParameter("DetailIdList", detailIdListShrink);
            this.detailIdList = detailIdList;
            return this;
        }

        /**
         * EncryptionType.
         */
        public Builder encryptionType(Long encryptionType) {
            this.putQueryParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
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
         * <p>A list of phone numbers. This parameter takes effect only when <code>BatchId</code> is also specified.</p>
         */
        public Builder phoneNumbers(java.util.List<String> phoneNumbers) {
            String phoneNumbersShrink = shrink(phoneNumbers, "PhoneNumbers", "json");
            this.putQueryParameter("PhoneNumbers", phoneNumbersShrink);
            this.phoneNumbers = phoneNumbers;
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
         * <p>The task ID. You can view the task ID on the <strong>Call Task Management</strong> page or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2926799.html">QueryAiCallTaskPage</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>138************</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CancelAiCallDetailsRequest build() {
            return new CancelAiCallDetailsRequest(this);
        } 

    } 

}
