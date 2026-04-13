// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link GetSessionRequest} extends {@link RequestModel}
 *
 * <p>GetSessionRequest</p>
 */
public class GetSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private GetSessionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionRequest create() {
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

    public static final class Builder extends Request.Builder<GetSessionRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSessionRequest request) {
            super(request);
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>se-weg******wcw</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetSessionRequest build() {
            return new GetSessionRequest(this);
        } 

    } 

}
