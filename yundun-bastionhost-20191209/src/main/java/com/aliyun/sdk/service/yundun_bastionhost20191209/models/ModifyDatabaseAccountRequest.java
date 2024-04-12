// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseAccountRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseAccountRequest</p>
 */
public class ModifyDatabaseAccountRequest extends Request {
    @Query
    @NameInMap("DatabaseAccountId")
    @Validation(required = true)
    private String databaseAccountId;

    @Query
    @NameInMap("DatabaseAccountName")
    private String databaseAccountName;

    @Query
    @NameInMap("DatabaseSchema")
    private String databaseSchema;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyDatabaseAccountRequest(Builder builder) {
        super(builder);
        this.databaseAccountId = builder.databaseAccountId;
        this.databaseAccountName = builder.databaseAccountName;
        this.databaseSchema = builder.databaseSchema;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseAccountRequest create() {
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
     * @return databaseAccountName
     */
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    /**
     * @return databaseSchema
     */
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDatabaseAccountRequest, Builder> {
        private String databaseAccountId; 
        private String databaseAccountName; 
        private String databaseSchema; 
        private String instanceId; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseAccountRequest request) {
            super(request);
            this.databaseAccountId = request.databaseAccountId;
            this.databaseAccountName = request.databaseAccountName;
            this.databaseSchema = request.databaseSchema;
            this.instanceId = request.instanceId;
            this.password = request.password;
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
         * DatabaseAccountName.
         */
        public Builder databaseAccountName(String databaseAccountName) {
            this.putQueryParameter("DatabaseAccountName", databaseAccountName);
            this.databaseAccountName = databaseAccountName;
            return this;
        }

        /**
         * DatabaseSchema.
         */
        public Builder databaseSchema(String databaseSchema) {
            this.putQueryParameter("DatabaseSchema", databaseSchema);
            this.databaseSchema = databaseSchema;
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
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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
        public ModifyDatabaseAccountRequest build() {
            return new ModifyDatabaseAccountRequest(this);
        } 

    } 

}
