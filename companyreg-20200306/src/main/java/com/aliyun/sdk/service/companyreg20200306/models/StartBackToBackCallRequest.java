// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBackToBackCallRequest} extends {@link RequestModel}
 *
 * <p>StartBackToBackCallRequest</p>
 */
public class StartBackToBackCallRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("CallCenterNumber")
    private String callCenterNumber;

    @Query
    @NameInMap("Caller")
    @Validation(required = true)
    private String caller;

    @Query
    @NameInMap("MobileKey")
    private String mobileKey;

    @Query
    @NameInMap("SkillType")
    @Validation(required = true)
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
         * CallCenterNumber.
         */
        public Builder callCenterNumber(String callCenterNumber) {
            this.putQueryParameter("CallCenterNumber", callCenterNumber);
            this.callCenterNumber = callCenterNumber;
            return this;
        }

        /**
         * Caller.
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
         * SkillType.
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
