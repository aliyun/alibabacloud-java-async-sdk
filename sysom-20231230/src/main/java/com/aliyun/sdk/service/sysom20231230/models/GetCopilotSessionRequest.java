// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetCopilotSessionRequest} extends {@link RequestModel}
 *
 * <p>GetCopilotSessionRequest</p>
 */
public class GetCopilotSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String sessionId;

    private GetCopilotSessionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCopilotSessionRequest create() {
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

    public static final class Builder extends Request.Builder<GetCopilotSessionRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCopilotSessionRequest request) {
            super(request);
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>sessionId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c356bc310e4345c3a602a2912322ad21</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetCopilotSessionRequest build() {
            return new GetCopilotSessionRequest(this);
        } 

    } 

}
