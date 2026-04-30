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
 * {@link RemovePolarClawMCPServerRequest} extends {@link RequestModel}
 *
 * <p>RemovePolarClawMCPServerRequest</p>
 */
public class RemovePolarClawMCPServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverName;

    private RemovePolarClawMCPServerRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.serverName = builder.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePolarClawMCPServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return serverName
     */
    public String getServerName() {
        return this.serverName;
    }

    public static final class Builder extends Request.Builder<RemovePolarClawMCPServerRequest, Builder> {
        private String applicationId; 
        private String serverName; 

        private Builder() {
            super();
        } 

        private Builder(RemovePolarClawMCPServerRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.serverName = request.serverName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-v1</p>
         */
        public Builder serverName(String serverName) {
            this.putQueryParameter("ServerName", serverName);
            this.serverName = serverName;
            return this;
        }

        @Override
        public RemovePolarClawMCPServerRequest build() {
            return new RemovePolarClawMCPServerRequest(this);
        } 

    } 

}
