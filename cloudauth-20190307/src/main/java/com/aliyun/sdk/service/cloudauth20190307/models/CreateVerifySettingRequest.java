// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CreateVerifySettingRequest} extends {@link RequestModel}
 *
 * <p>CreateVerifySettingRequest</p>
 */
public class CreateVerifySettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GuideStep")
    private Boolean guideStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyStep")
    private Boolean privacyStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultStep")
    private Boolean resultStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Solution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String solution;

    private CreateVerifySettingRequest(Builder builder) {
        super(builder);
        this.bizName = builder.bizName;
        this.bizType = builder.bizType;
        this.guideStep = builder.guideStep;
        this.privacyStep = builder.privacyStep;
        this.resultStep = builder.resultStep;
        this.solution = builder.solution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVerifySettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return guideStep
     */
    public Boolean getGuideStep() {
        return this.guideStep;
    }

    /**
     * @return privacyStep
     */
    public Boolean getPrivacyStep() {
        return this.privacyStep;
    }

    /**
     * @return resultStep
     */
    public Boolean getResultStep() {
        return this.resultStep;
    }

    /**
     * @return solution
     */
    public String getSolution() {
        return this.solution;
    }

    public static final class Builder extends Request.Builder<CreateVerifySettingRequest, Builder> {
        private String bizName; 
        private String bizType; 
        private Boolean guideStep; 
        private Boolean privacyStep; 
        private Boolean resultStep; 
        private String solution; 

        private Builder() {
            super();
        } 

        private Builder(CreateVerifySettingRequest request) {
            super(request);
            this.bizName = request.bizName;
            this.bizType = request.bizType;
            this.guideStep = request.guideStep;
            this.privacyStep = request.privacyStep;
            this.resultStep = request.resultStep;
            this.solution = request.solution;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizName(String bizName) {
            this.putQueryParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UserRegister</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * GuideStep.
         */
        public Builder guideStep(Boolean guideStep) {
            this.putQueryParameter("GuideStep", guideStep);
            this.guideStep = guideStep;
            return this;
        }

        /**
         * PrivacyStep.
         */
        public Builder privacyStep(Boolean privacyStep) {
            this.putQueryParameter("PrivacyStep", privacyStep);
            this.privacyStep = privacyStep;
            return this;
        }

        /**
         * ResultStep.
         */
        public Builder resultStep(Boolean resultStep) {
            this.putQueryParameter("ResultStep", resultStep);
            this.resultStep = resultStep;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RPBasic</p>
         */
        public Builder solution(String solution) {
            this.putQueryParameter("Solution", solution);
            this.solution = solution;
            return this;
        }

        @Override
        public CreateVerifySettingRequest build() {
            return new CreateVerifySettingRequest(this);
        } 

    } 

}
