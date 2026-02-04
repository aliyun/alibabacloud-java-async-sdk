// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link LlmSmartCallRequest} extends {@link RequestModel}
 *
 * <p>LlmSmartCallRequest</p>
 */
public class LlmSmartCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptParam")
    private String promptParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenesCode")
    private String scenesCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillType")
    private Integer skillType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWordParam")
    private String startWordParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    private LlmSmartCallRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.callerNumber = builder.callerNumber;
        this.productCode = builder.productCode;
        this.promptParam = builder.promptParam;
        this.scenesCode = builder.scenesCode;
        this.skillType = builder.skillType;
        this.startWordParam = builder.startWordParam;
        this.tenantCode = builder.tenantCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmSmartCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return promptParam
     */
    public String getPromptParam() {
        return this.promptParam;
    }

    /**
     * @return scenesCode
     */
    public String getScenesCode() {
        return this.scenesCode;
    }

    /**
     * @return skillType
     */
    public Integer getSkillType() {
        return this.skillType;
    }

    /**
     * @return startWordParam
     */
    public String getStartWordParam() {
        return this.startWordParam;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    public static final class Builder extends Request.Builder<LlmSmartCallRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String callerNumber; 
        private String productCode; 
        private String promptParam; 
        private String scenesCode; 
        private Integer skillType; 
        private String startWordParam; 
        private String tenantCode; 

        private Builder() {
            super();
        } 

        private Builder(LlmSmartCallRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.callerNumber = request.callerNumber;
            this.productCode = request.productCode;
            this.promptParam = request.promptParam;
            this.scenesCode = request.scenesCode;
            this.skillType = request.skillType;
            this.startWordParam = request.startWordParam;
            this.tenantCode = request.tenantCode;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CallerNumber.
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * PromptParam.
         */
        public Builder promptParam(String promptParam) {
            this.putQueryParameter("PromptParam", promptParam);
            this.promptParam = promptParam;
            return this;
        }

        /**
         * ScenesCode.
         */
        public Builder scenesCode(String scenesCode) {
            this.putQueryParameter("ScenesCode", scenesCode);
            this.scenesCode = scenesCode;
            return this;
        }

        /**
         * SkillType.
         */
        public Builder skillType(Integer skillType) {
            this.putQueryParameter("SkillType", skillType);
            this.skillType = skillType;
            return this;
        }

        /**
         * StartWordParam.
         */
        public Builder startWordParam(String startWordParam) {
            this.putQueryParameter("StartWordParam", startWordParam);
            this.startWordParam = startWordParam;
            return this;
        }

        /**
         * TenantCode.
         */
        public Builder tenantCode(String tenantCode) {
            this.putQueryParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        @Override
        public LlmSmartCallRequest build() {
            return new LlmSmartCallRequest(this);
        } 

    } 

}
