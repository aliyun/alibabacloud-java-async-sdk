// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateLakeStorageRequest} extends {@link RequestModel}
 *
 * <p>CreateLakeStorageRequest</p>
 */
public class CreateLakeStorageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List<Permissions> permissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateLakeStorageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.permissions = builder.permissions;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLakeStorageRequest create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return permissions
     */
    public java.util.List<Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateLakeStorageRequest, Builder> {
        private String clientToken; 
        private String DBClusterId; 
        private String description; 
        private java.util.List<Permissions> permissions; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLakeStorageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.permissions = request.permissions;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL cluster with which you want to associate the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The description of the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The permissions that you want to grant on the lake storage to the Alibaba Cloud account besides the permissions that are automatically granted to the Resource Access Management (RAM) user or the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            String permissionsShrink = shrink(permissions, "Permissions", "json");
            this.putBodyParameter("Permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateLakeStorageRequest build() {
            return new CreateLakeStorageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLakeStorageRequest} extends {@link TeaModel}
     *
     * <p>CreateLakeStorageRequest</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Read")
        private Boolean read;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Write")
        private Boolean write;

        private Permissions(Builder builder) {
            this.account = builder.account;
            this.read = builder.read;
            this.type = builder.type;
            this.write = builder.write;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return read
         */
        public Boolean getRead() {
            return this.read;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return write
         */
        public Boolean getWrite() {
            return this.write;
        }

        public static final class Builder {
            private String account; 
            private Boolean read; 
            private String type; 
            private Boolean write; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.account = model.account;
                this.read = model.read;
                this.type = model.type;
                this.write = model.write;
            } 

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The read permissions.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder read(Boolean read) {
                this.read = read;
                return this;
            }

            /**
             * <p>The account type.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The write permissions.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder write(Boolean write) {
                this.write = write;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
