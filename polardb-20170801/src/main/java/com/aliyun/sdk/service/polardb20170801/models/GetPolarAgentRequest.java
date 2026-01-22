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
 * {@link GetPolarAgentRequest} extends {@link RequestModel}
 *
 * <p>GetPolarAgentRequest</p>
 */
public class GetPolarAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private GetPolarAgentRequest(Builder builder) {
        super(builder);
        this.extraInfo = builder.extraInfo;
        this.query = builder.query;
        this.sessionId = builder.sessionId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolarAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
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

    public static final class Builder extends Request.Builder<GetPolarAgentRequest, Builder> {
        private String extraInfo; 
        private String query; 
        private String sessionId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetPolarAgentRequest request) {
            super(request);
            this.extraInfo = request.extraInfo;
            this.query = request.query;
            this.sessionId = request.sessionId;
            this.source = request.source;
        } 

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c4d242f3-c909-4846-91d9-f84c238a9820</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SessionId.
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
        public GetPolarAgentRequest build() {
            return new GetPolarAgentRequest(this);
        } 

    } 

}
