// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.captcha20230305.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyIntelligentCaptchaRequest} extends {@link RequestModel}
 *
 * <p>VerifyIntelligentCaptchaRequest</p>
 */
public class VerifyIntelligentCaptchaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CaptchaVerifyParam")
    private String captchaVerifyParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    private VerifyIntelligentCaptchaRequest(Builder builder) {
        super(builder);
        this.captchaVerifyParam = builder.captchaVerifyParam;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyIntelligentCaptchaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captchaVerifyParam
     */
    public String getCaptchaVerifyParam() {
        return this.captchaVerifyParam;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<VerifyIntelligentCaptchaRequest, Builder> {
        private String captchaVerifyParam; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyIntelligentCaptchaRequest request) {
            super(request);
            this.captchaVerifyParam = request.captchaVerifyParam;
            this.sceneId = request.sceneId;
        } 

        /**
         * CaptchaVerifyParam.
         */
        public Builder captchaVerifyParam(String captchaVerifyParam) {
            this.putBodyParameter("CaptchaVerifyParam", captchaVerifyParam);
            this.captchaVerifyParam = captchaVerifyParam;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public VerifyIntelligentCaptchaRequest build() {
            return new VerifyIntelligentCaptchaRequest(this);
        } 

    } 

}
