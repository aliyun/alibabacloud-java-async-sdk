// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloseAICoachTaskSessionRequest} extends {@link RequestModel}
 *
 * <p>CloseAICoachTaskSessionRequest</p>
 */
public class CloseAICoachTaskSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private CloseAICoachTaskSessionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseAICoachTaskSessionRequest create() {
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

    public static final class Builder extends Request.Builder<CloseAICoachTaskSessionRequest, Builder> {
        private String sessionId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(CloseAICoachTaskSessionRequest request) {
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
        public CloseAICoachTaskSessionRequest build() {
            return new CloseAICoachTaskSessionRequest(this);
        } 

    } 

}
