// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendWebsiteFeedbackRequest} extends {@link RequestModel}
 *
 * <p>SendWebsiteFeedbackRequest</p>
 */
public class SendWebsiteFeedbackRequest extends Request {
    @Query
    @NameInMap("Feedback")
    @Validation(required = true)
    private String feedback;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Urls")
    @Validation(required = true)
    private String urls;

    private SendWebsiteFeedbackRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.urls = builder.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendWebsiteFeedbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return urls
     */
    public String getUrls() {
        return this.urls;
    }

    public static final class Builder extends Request.Builder<SendWebsiteFeedbackRequest, Builder> {
        private String feedback; 
        private String lang; 
        private String sourceIp; 
        private String urls; 

        private Builder() {
            super();
        } 

        private Builder(SendWebsiteFeedbackRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.urls = request.urls;
        } 

        /**
         * Feedback.
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Urls.
         */
        public Builder urls(String urls) {
            this.putQueryParameter("Urls", urls);
            this.urls = urls;
            return this;
        }

        @Override
        public SendWebsiteFeedbackRequest build() {
            return new SendWebsiteFeedbackRequest(this);
        } 

    } 

}
