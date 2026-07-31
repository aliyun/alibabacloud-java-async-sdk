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
 * {@link InterruptRequest} extends {@link RequestModel}
 *
 * <p>InterruptRequest</p>
 */
public class InterruptRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private InterruptRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InterruptRequest create() {
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

    public static final class Builder extends Request.Builder<InterruptRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(InterruptRequest request) {
            super(request);
            this.sessionId = request.sessionId;
        } 

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public InterruptRequest build() {
            return new InterruptRequest(this);
        } 

    } 

}
