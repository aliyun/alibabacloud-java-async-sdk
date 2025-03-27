// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link StopAvatarSessionRequest} extends {@link RequestModel}
 *
 * <p>StopAvatarSessionRequest</p>
 */
public class StopAvatarSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private StopAvatarSessionRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAvatarSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<StopAvatarSessionRequest, Builder> {
        private String projectId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(StopAvatarSessionRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.sessionId = request.sessionId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public StopAvatarSessionRequest build() {
            return new StopAvatarSessionRequest(this);
        } 

    } 

}
