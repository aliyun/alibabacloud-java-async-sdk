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
 * {@link CloseChatInstanceSessionsRequest} extends {@link RequestModel}
 *
 * <p>CloseChatInstanceSessionsRequest</p>
 */
public class CloseChatInstanceSessionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionIds")
    private java.util.List<String> sessionIds;

    private CloseChatInstanceSessionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sessionIds = builder.sessionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseChatInstanceSessionsRequest create() {
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

    public static final class Builder extends Request.Builder<CloseChatInstanceSessionsRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> sessionIds; 

        private Builder() {
            super();
        } 

        private Builder(CloseChatInstanceSessionsRequest request) {
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
            this.putBodyParameter("sessionIds", sessionIdsShrink);
            this.sessionIds = sessionIds;
            return this;
        }

        @Override
        public CloseChatInstanceSessionsRequest build() {
            return new CloseChatInstanceSessionsRequest(this);
        } 

    } 

}
