// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260622.models;

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
 * {@link GetSessionContentRequest} extends {@link RequestModel}
 *
 * <p>GetSessionContentRequest</p>
 */
public class GetSessionContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private GetSessionContentRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionContentRequest create() {
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

    public static final class Builder extends Request.Builder<GetSessionContentRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSessionContentRequest request) {
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
        public GetSessionContentRequest build() {
            return new GetSessionContentRequest(this);
        } 

    } 

}
