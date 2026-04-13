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
 * {@link DeleteSessionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSessionRequest</p>
 */
public class DeleteSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private DeleteSessionRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSessionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSessionRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSessionRequest request) {
            super(request);
            this.sessionId = request.sessionId;
        } 

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DeleteSessionRequest build() {
            return new DeleteSessionRequest(this);
        } 

    } 

}
