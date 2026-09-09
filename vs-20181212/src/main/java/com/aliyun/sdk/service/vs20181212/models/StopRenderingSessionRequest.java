// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link StopRenderingSessionRequest} extends {@link RequestModel}
 *
 * <p>StopRenderingSessionRequest</p>
 */
public class StopRenderingSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private StopRenderingSessionRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.projectId = builder.projectId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopRenderingSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
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

    public static final class Builder extends Request.Builder<StopRenderingSessionRequest, Builder> {
        private String clientId; 
        private String projectId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(StopRenderingSessionRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.projectId = request.projectId;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>Unique ID of the end customer. Specify either SessionId or ClientId.</p>
         * 
         * <strong>example:</strong>
         * <p>04c30850-1d91-4da1-b811-66d0ee94af7d</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>Project ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Session ID. Specify either SessionId or ClientId.</p>
         * 
         * <strong>example:</strong>
         * <p>session-i205217481741918129226</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public StopRenderingSessionRequest build() {
            return new StopRenderingSessionRequest(this);
        } 

    } 

}
