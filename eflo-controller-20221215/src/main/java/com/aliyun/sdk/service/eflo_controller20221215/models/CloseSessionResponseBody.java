// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CloseSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CloseSessionResponseBody</p>
 */
public class CloseSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private CloseSessionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String requestId; 
        private String sessionId; 
        private String state; 

        private Builder() {
        } 

        private Builder(CloseSessionResponseBody model) {
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.state = model.state;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>07AA3A1F-321E-50D8-B834-88C411331C94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i206495551737511455528</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>ClosingActive</p>
         * 
         * <strong>example:</strong>
         * <p>Inactive</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public CloseSessionResponseBody build() {
            return new CloseSessionResponseBody(this);
        } 

    } 

}
