// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link StartRestoreTaskRequest} extends {@link RequestModel}
 *
 * <p>StartRestoreTaskRequest</p>
 */
public class StartRestoreTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreTaskId;

    private StartRestoreTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.restoreTaskId = builder.restoreTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRestoreTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return restoreTaskId
     */
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    public static final class Builder extends Request.Builder<StartRestoreTaskRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String ownerId; 
        private String restoreTaskId; 

        private Builder() {
            super();
        } 

        private Builder(StartRestoreTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.restoreTaskId = request.restoreTaskId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the restore task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s102h7rfXXXX</p>
         */
        public Builder restoreTaskId(String restoreTaskId) {
            this.putQueryParameter("RestoreTaskId", restoreTaskId);
            this.restoreTaskId = restoreTaskId;
            return this;
        }

        @Override
        public StartRestoreTaskRequest build() {
            return new StartRestoreTaskRequest(this);
        } 

    } 

}
