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
 * {@link GetAICoachTaskSessionResourceUsageRequest} extends {@link RequestModel}
 *
 * <p>GetAICoachTaskSessionResourceUsageRequest</p>
 */
public class GetAICoachTaskSessionResourceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private GetAICoachTaskSessionResourceUsageRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachTaskSessionResourceUsageRequest create() {
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

    public static final class Builder extends Request.Builder<GetAICoachTaskSessionResourceUsageRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAICoachTaskSessionResourceUsageRequest request) {
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
        public GetAICoachTaskSessionResourceUsageRequest build() {
            return new GetAICoachTaskSessionResourceUsageRequest(this);
        } 

    } 

}
