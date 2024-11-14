// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FinishAICoachTaskSessionRequest} extends {@link RequestModel}
 *
 * <p>FinishAICoachTaskSessionRequest</p>
 */
public class FinishAICoachTaskSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private FinishAICoachTaskSessionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishAICoachTaskSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<FinishAICoachTaskSessionRequest, Builder> {
        private String sessionId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(FinishAICoachTaskSessionRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.uid = request.uid;
        } 

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public FinishAICoachTaskSessionRequest build() {
            return new FinishAICoachTaskSessionRequest(this);
        } 

    } 

}
