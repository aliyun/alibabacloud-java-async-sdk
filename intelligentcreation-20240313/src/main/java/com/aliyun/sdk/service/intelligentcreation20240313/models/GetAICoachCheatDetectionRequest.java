// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachCheatDetectionRequest} extends {@link RequestModel}
 *
 * <p>GetAICoachCheatDetectionRequest</p>
 */
public class GetAICoachCheatDetectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private GetAICoachCheatDetectionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachCheatDetectionRequest create() {
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

    public static final class Builder extends Request.Builder<GetAICoachCheatDetectionRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAICoachCheatDetectionRequest request) {
            super(request);
            this.sessionId = request.sessionId;
        } 

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetAICoachCheatDetectionRequest build() {
            return new GetAICoachCheatDetectionRequest(this);
        } 

    } 

}
