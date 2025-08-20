// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link QueryChatInstanceSessionsRequest} extends {@link RequestModel}
 *
 * <p>QueryChatInstanceSessionsRequest</p>
 */
public class QueryChatInstanceSessionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionIds")
    private java.util.List<String> sessionIds;

    private QueryChatInstanceSessionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sessionIds = builder.sessionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChatInstanceSessionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sessionIds
     */
    public java.util.List<String> getSessionIds() {
        return this.sessionIds;
    }

    public static final class Builder extends Request.Builder<QueryChatInstanceSessionsRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> sessionIds; 

        private Builder() {
            super();
        } 

        private Builder(QueryChatInstanceSessionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sessionIds = request.sessionIds;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * sessionIds.
         */
        public Builder sessionIds(java.util.List<String> sessionIds) {
            String sessionIdsShrink = shrink(sessionIds, "sessionIds", "json");
            this.putQueryParameter("sessionIds", sessionIdsShrink);
            this.sessionIds = sessionIds;
            return this;
        }

        @Override
        public QueryChatInstanceSessionsRequest build() {
            return new QueryChatInstanceSessionsRequest(this);
        } 

    } 

}
