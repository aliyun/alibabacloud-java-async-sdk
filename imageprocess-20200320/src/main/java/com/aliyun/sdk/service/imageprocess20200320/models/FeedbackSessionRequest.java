// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageprocess20200320.models;

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
 * {@link FeedbackSessionRequest} extends {@link RequestModel}
 *
 * <p>FeedbackSessionRequest</p>
 */
public class FeedbackSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Feedback")
    @com.aliyun.core.annotation.Validation(required = true)
    private String feedback;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private FeedbackSessionRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackSessionRequest create() {
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<FeedbackSessionRequest, Builder> {
        private String feedback; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackSessionRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder feedback(String feedback) {
            this.putBodyParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>69675e9ddaea4b1ca8b9ddbafd02edc2</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public FeedbackSessionRequest build() {
            return new FeedbackSessionRequest(this);
        } 

    } 

}
