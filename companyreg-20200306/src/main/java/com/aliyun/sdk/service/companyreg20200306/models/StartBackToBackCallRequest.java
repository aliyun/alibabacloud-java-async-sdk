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
 * {@link StartBackToBackCallRequest} extends {@link RequestModel}
 *
 * <p>StartBackToBackCallRequest</p>
 */
public class StartBackToBackCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallCenterNumber")
    private String callCenterNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileKey")
    private String mobileKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long skillType;

    private StartBackToBackCallRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.callCenterNumber = builder.callCenterNumber;
        this.caller = builder.caller;
        this.mobileKey = builder.mobileKey;
        this.skillType = builder.skillType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBackToBackCallRequest create() {
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
     * @return callCenterNumber
     */
    public String getCallCenterNumber() {
        return this.callCenterNumber;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return mobileKey
     */
    public String getMobileKey() {
        return this.mobileKey;
    }

    /**
     * @return skillType
     */
    public Long getSkillType() {
        return this.skillType;
    }

    public static final class Builder extends Request.Builder<StartBackToBackCallRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String callCenterNumber; 
        private String caller; 
        private String mobileKey; 
        private Long skillType; 

        private Builder() {
            super();
        } 

        private Builder(StartBackToBackCallRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.callCenterNumber = request.callCenterNumber;
            this.caller = request.caller;
            this.mobileKey = request.mobileKey;
            this.skillType = request.skillType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20211203180209000001</p>
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
         * <p>test</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CallCenterNumber.
         */
        public Builder callCenterNumber(String callCenterNumber) {
            this.putQueryParameter("CallCenterNumber", callCenterNumber);
            this.callCenterNumber = callCenterNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13162828888</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * MobileKey.
         */
        public Builder mobileKey(String mobileKey) {
            this.putQueryParameter("MobileKey", mobileKey);
            this.mobileKey = mobileKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder skillType(Long skillType) {
            this.putQueryParameter("SkillType", skillType);
            this.skillType = skillType;
            return this;
        }

        @Override
        public StartBackToBackCallRequest build() {
            return new StartBackToBackCallRequest(this);
        } 

    } 

}
