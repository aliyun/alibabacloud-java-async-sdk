// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduinterpreting20240828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitEvaluationTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitEvaluationTaskRequest</p>
 */
public class SubmitEvaluationTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AudioUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audioUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaterialText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String materialText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OuterBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SuggestedAnswer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String suggestedAnswer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private SubmitEvaluationTaskRequest(Builder builder) {
        super(builder);
        this.audioUrl = builder.audioUrl;
        this.callbackUrl = builder.callbackUrl;
        this.materialText = builder.materialText;
        this.outerBizId = builder.outerBizId;
        this.suggestedAnswer = builder.suggestedAnswer;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEvaluationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioUrl
     */
    public String getAudioUrl() {
        return this.audioUrl;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return materialText
     */
    public String getMaterialText() {
        return this.materialText;
    }

    /**
     * @return outerBizId
     */
    public String getOuterBizId() {
        return this.outerBizId;
    }

    /**
     * @return suggestedAnswer
     */
    public String getSuggestedAnswer() {
        return this.suggestedAnswer;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SubmitEvaluationTaskRequest, Builder> {
        private String audioUrl; 
        private String callbackUrl; 
        private String materialText; 
        private String outerBizId; 
        private String suggestedAnswer; 
        private String text; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SubmitEvaluationTaskRequest request) {
            super(request);
            this.audioUrl = request.audioUrl;
            this.callbackUrl = request.callbackUrl;
            this.materialText = request.materialText;
            this.outerBizId = request.outerBizId;
            this.suggestedAnswer = request.suggestedAnswer;
            this.text = request.text;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xx.com/abc.mp3">http://xx.com/abc.mp3</a></p>
         */
        public Builder audioUrl(String audioUrl) {
            this.putBodyParameter("AudioUrl", audioUrl);
            this.audioUrl = audioUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://abc.edu.org.cn/en/callback">https://abc.edu.org.cn/en/callback</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putBodyParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>As flame of fire we gather, as skyful of stars we scatter.</p>
         */
        public Builder materialText(String materialText) {
            this.putBodyParameter("MaterialText", materialText);
            this.materialText = materialText;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>433c1361-0f6e-48fc-ad51</p>
         */
        public Builder outerBizId(String outerBizId) {
            this.putBodyParameter("OuterBizId", outerBizId);
            this.outerBizId = outerBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder suggestedAnswer(String suggestedAnswer) {
            this.putBodyParameter("SuggestedAnswer", suggestedAnswer);
            this.suggestedAnswer = suggestedAnswer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EN_TO_ZH</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SubmitEvaluationTaskRequest build() {
            return new SubmitEvaluationTaskRequest(this);
        } 

    } 

}
