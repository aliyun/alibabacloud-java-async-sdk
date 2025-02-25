// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link PushUserGameProcessRequest} extends {@link RequestModel}
 *
 * <p>PushUserGameProcessRequest</p>
 */
public class PushUserGameProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentStepId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentStepId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private java.util.Map<String, ?> extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    private PushUserGameProcessRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.bizId = builder.bizId;
        this.currentStepId = builder.currentStepId;
        this.extInfo = builder.extInfo;
        this.processId = builder.processId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushUserGameProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return currentStepId
     */
    public String getCurrentStepId() {
        return this.currentStepId;
    }

    /**
     * @return extInfo
     */
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PushUserGameProcessRequest, Builder> {
        private String accountType; 
        private String bizId; 
        private String currentStepId; 
        private java.util.Map<String, ?> extInfo; 
        private String processId; 
        private String thirdPartyUserId; 
        private java.util.Map<String, ?> body; 

        private Builder() {
            super();
        } 

        private Builder(PushUserGameProcessRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.bizId = request.bizId;
            this.currentStepId = request.currentStepId;
            this.extInfo = request.extInfo;
            this.processId = request.processId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.body = request.body;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder currentStepId(String currentStepId) {
            this.putQueryParameter("CurrentStepId", currentStepId);
            this.currentStepId = currentStepId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(java.util.Map<String, ?> extInfo) {
            String extInfoShrink = shrink(extInfo, "ExtInfo", "json");
            this.putBodyParameter("ExtInfo", extInfoShrink);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6734******4397953</p>
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22******343</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map<String, ?> body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public PushUserGameProcessRequest build() {
            return new PushUserGameProcessRequest(this);
        } 

    } 

}
