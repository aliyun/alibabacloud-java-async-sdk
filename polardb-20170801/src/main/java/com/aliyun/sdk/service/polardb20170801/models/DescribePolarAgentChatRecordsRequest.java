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
 * {@link DescribePolarAgentChatRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarAgentChatRecordsRequest</p>
 */
public class DescribePolarAgentChatRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private DescribePolarAgentChatRecordsRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarAgentChatRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePolarAgentChatRecordsRequest, Builder> {
        private String sessionId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarAgentChatRecordsRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.source = request.source;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1e28530a0da2c4755f165b1b8b9a73c9</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DescribePolarAgentChatRecordsRequest build() {
            return new DescribePolarAgentChatRecordsRequest(this);
        } 

    } 

}
