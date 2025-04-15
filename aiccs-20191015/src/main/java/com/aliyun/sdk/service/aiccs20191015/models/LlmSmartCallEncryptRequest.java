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
 * {@link LlmSmartCallEncryptRequest} extends {@link RequestModel}
 *
 * <p>LlmSmartCallEncryptRequest</p>
 */
public class LlmSmartCallEncryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptCalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptCalledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptParam")
    private java.util.Map<String, ?> promptParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWordParam")
    private java.util.Map<String, ?> startWordParam;

    private LlmSmartCallEncryptRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
        this.callerNumber = builder.callerNumber;
        this.encryptCalledNumber = builder.encryptCalledNumber;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.promptParam = builder.promptParam;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startWordParam = builder.startWordParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmSmartCallEncryptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCode
     */
    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return encryptCalledNumber
     */
    public String getEncryptCalledNumber() {
        return this.encryptCalledNumber;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return promptParam
     */
    public java.util.Map<String, ?> getPromptParam() {
        return this.promptParam;
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
     * @return startWordParam
     */
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

    public static final class Builder extends Request.Builder<LlmSmartCallEncryptRequest, Builder> {
        private String applicationCode; 
        private String callerNumber; 
        private String encryptCalledNumber; 
        private String outId; 
        private Long ownerId; 
        private java.util.Map<String, ?> promptParam; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.Map<String, ?> startWordParam; 

        private Builder() {
            super();
        } 

        private Builder(LlmSmartCallEncryptRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
            this.callerNumber = request.callerNumber;
            this.encryptCalledNumber = request.encryptCalledNumber;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.promptParam = request.promptParam;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startWordParam = request.startWordParam;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADDFA32145</p>
         */
        public Builder applicationCode(String applicationCode) {
            this.putQueryParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADDFA32145</p>
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>140432432432243</p>
         */
        public Builder encryptCalledNumber(String encryptCalledNumber) {
            this.putQueryParameter("EncryptCalledNumber", encryptCalledNumber);
            this.encryptCalledNumber = encryptCalledNumber;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * PromptParam.
         */
        public Builder promptParam(java.util.Map<String, ?> promptParam) {
            String promptParamShrink = shrink(promptParam, "PromptParam", "json");
            this.putQueryParameter("PromptParam", promptParamShrink);
            this.promptParam = promptParam;
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
         * StartWordParam.
         */
        public Builder startWordParam(java.util.Map<String, ?> startWordParam) {
            String startWordParamShrink = shrink(startWordParam, "StartWordParam", "json");
            this.putQueryParameter("StartWordParam", startWordParamShrink);
            this.startWordParam = startWordParam;
            return this;
        }

        @Override
        public LlmSmartCallEncryptRequest build() {
            return new LlmSmartCallEncryptRequest(this);
        } 

    } 

}
