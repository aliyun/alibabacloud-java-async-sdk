// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatabaseAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatabaseAccountRequest</p>
 */
public class DeleteDatabaseAccountRequest extends Request {
    @Query
    @NameInMap("DatabaseAccountId")
    @Validation(required = true)
    private String databaseAccountId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteDatabaseAccountRequest(Builder builder) {
        super(builder);
        this.databaseAccountId = builder.databaseAccountId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatabaseAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccountId
     */
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDatabaseAccountRequest, Builder> {
        private String databaseAccountId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatabaseAccountRequest request) {
            super(request);
            this.databaseAccountId = request.databaseAccountId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * DatabaseAccountId.
         */
        public Builder databaseAccountId(String databaseAccountId) {
            this.putQueryParameter("DatabaseAccountId", databaseAccountId);
            this.databaseAccountId = databaseAccountId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDatabaseAccountRequest build() {
            return new DeleteDatabaseAccountRequest(this);
        } 

    } 

}
