// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarAgentSessionStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarAgentSessionStatusRequest</p>
 */
public class DescribePolarAgentSessionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private DescribePolarAgentSessionStatusRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarAgentSessionStatusRequest create() {
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DescribePolarAgentSessionStatusRequest, Builder> {
        private String sessionId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarAgentSessionStatusRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.source = request.source;
        } 

        /**
         * <p>The session ID, which is used to identify a visitor&quot;s session and maintain context information. Usage notes: You can obtain this ID by calling the GetPolarAgent API and retrieving the SessionId field from the response. Note that GetPolarAgent requires Signature Version 3.0 and the SSE protocol. The ID must be in the standard UUID format, such as 1e28530a-0da2-c475-5f16-5b1b8b9a73c9.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1e28530a-0da2-c475-5f16-5b1b8b9a73c9</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The product source. Valid values: polardb-console.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb-console</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DescribePolarAgentSessionStatusRequest build() {
            return new DescribePolarAgentSessionStatusRequest(this);
        } 

    } 

}
