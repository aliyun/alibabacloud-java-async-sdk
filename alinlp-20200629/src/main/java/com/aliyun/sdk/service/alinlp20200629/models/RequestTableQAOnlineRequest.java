// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestTableQAOnlineRequest} extends {@link RequestModel}
 *
 * <p>RequestTableQAOnlineRequest</p>
 */
public class RequestTableQAOnlineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BotId")
    private String botId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Question")
    private String question;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    private RequestTableQAOnlineRequest(Builder builder) {
        super(builder);
        this.botId = builder.botId;
        this.params = builder.params;
        this.question = builder.question;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestTableQAOnlineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return botId
     */
    public String getBotId() {
        return this.botId;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<RequestTableQAOnlineRequest, Builder> {
        private String botId; 
        private String params; 
        private String question; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(RequestTableQAOnlineRequest request) {
            super(request);
            this.botId = request.botId;
            this.params = request.params;
            this.question = request.question;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * BotId.
         */
        public Builder botId(String botId) {
            this.putBodyParameter("BotId", botId);
            this.botId = botId;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(String question) {
            this.putBodyParameter("Question", question);
            this.question = question;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public RequestTableQAOnlineRequest build() {
            return new RequestTableQAOnlineRequest(this);
        } 

    } 

}
