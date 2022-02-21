// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRestoreTaskRequest} extends {@link RequestModel}
 *
 * <p>StartRestoreTaskRequest</p>
 */
public class StartRestoreTaskRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RestoreTaskId")
    @Validation(required = true)
    private String restoreTaskId;

    private StartRestoreTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return restoreTaskId
     */
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    public static final class Builder extends Request.Builder<StartRestoreTaskRequest, Builder> {
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private String restoreTaskId; 

        private Builder() {
            super();
        } 

        private Builder(StartRestoreTaskRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.restoreTaskId = response.restoreTaskId;
        } 

        /**
         * ClientToken.
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RestoreTaskId.
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
