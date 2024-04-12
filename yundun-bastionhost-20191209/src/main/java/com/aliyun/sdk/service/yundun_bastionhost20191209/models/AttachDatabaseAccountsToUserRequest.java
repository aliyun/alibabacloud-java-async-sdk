// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDatabaseAccountsToUserRequest} extends {@link RequestModel}
 *
 * <p>AttachDatabaseAccountsToUserRequest</p>
 */
public class AttachDatabaseAccountsToUserRequest extends Request {
    @Query
    @NameInMap("Databases")
    private java.util.List < Databases> databases;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private AttachDatabaseAccountsToUserRequest(Builder builder) {
        super(builder);
        this.databases = builder.databases;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDatabaseAccountsToUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databases
     */
    public java.util.List < Databases> getDatabases() {
        return this.databases;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AttachDatabaseAccountsToUserRequest, Builder> {
        private java.util.List < Databases> databases; 
        private String instanceId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDatabaseAccountsToUserRequest request) {
            super(request);
            this.databases = request.databases;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * Databases.
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.putQueryParameter("Databases", databases);
            this.databases = databases;
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

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AttachDatabaseAccountsToUserRequest build() {
            return new AttachDatabaseAccountsToUserRequest(this);
        } 

    } 

    public static class Databases extends TeaModel {
        @NameInMap("DatabaseAccountIds")
        private java.util.List < String > databaseAccountIds;

        @NameInMap("DatabaseId")
        private String databaseId;

        private Databases(Builder builder) {
            this.databaseAccountIds = builder.databaseAccountIds;
            this.databaseId = builder.databaseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return databaseAccountIds
         */
        public java.util.List < String > getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        public static final class Builder {
            private java.util.List < String > databaseAccountIds; 
            private String databaseId; 

            /**
             * DatabaseAccountIds.
             */
            public Builder databaseAccountIds(java.util.List < String > databaseAccountIds) {
                this.databaseAccountIds = databaseAccountIds;
                return this;
            }

            /**
             * DatabaseId.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
