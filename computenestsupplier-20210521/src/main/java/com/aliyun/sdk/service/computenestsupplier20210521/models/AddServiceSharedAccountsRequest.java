// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddServiceSharedAccountsRequest} extends {@link RequestModel}
 *
 * <p>AddServiceSharedAccountsRequest</p>
 */
public class AddServiceSharedAccountsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("SharedAccounts")
    @Validation(required = true)
    private java.util.List < SharedAccounts> sharedAccounts;

    @Query
    @NameInMap("Type")
    private String type;

    private AddServiceSharedAccountsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.sharedAccounts = builder.sharedAccounts;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddServiceSharedAccountsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return sharedAccounts
     */
    public java.util.List < SharedAccounts> getSharedAccounts() {
        return this.sharedAccounts;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddServiceSharedAccountsRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String serviceId; 
        private java.util.List < SharedAccounts> sharedAccounts; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddServiceSharedAccountsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.sharedAccounts = request.sharedAccounts;
            this.type = request.type;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * SharedAccounts.
         */
        public Builder sharedAccounts(java.util.List < SharedAccounts> sharedAccounts) {
            this.putQueryParameter("SharedAccounts", sharedAccounts);
            this.sharedAccounts = sharedAccounts;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddServiceSharedAccountsRequest build() {
            return new AddServiceSharedAccountsRequest(this);
        } 

    } 

    public static class SharedAccounts extends TeaModel {
        @NameInMap("Permission")
        @Validation(required = true)
        private String permission;

        @NameInMap("UserAliUid")
        @Validation(required = true)
        private String userAliUid;

        private SharedAccounts(Builder builder) {
            this.permission = builder.permission;
            this.userAliUid = builder.userAliUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedAccounts create() {
            return builder().build();
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        /**
         * @return userAliUid
         */
        public String getUserAliUid() {
            return this.userAliUid;
        }

        public static final class Builder {
            private String permission; 
            private String userAliUid; 

            /**
             * Permission.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * UserAliUid.
             */
            public Builder userAliUid(String userAliUid) {
                this.userAliUid = userAliUid;
                return this;
            }

            public SharedAccounts build() {
                return new SharedAccounts(this);
            } 

        } 

    }
}
