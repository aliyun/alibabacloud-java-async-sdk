// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceDataRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceDataRequest</p>
 */
public class UpdateNamespaceDataRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("AuthType")
    @Validation(required = true)
    private String authType;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("DeviceIdType")
    private String deviceIdType;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NewData")
    @Validation(required = true)
    private String newData;

    @Query
    @NameInMap("OldData")
    @Validation(required = true)
    private String oldData;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateNamespaceDataRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountType = builder.accountType;
        this.authType = builder.authType;
        this.deviceId = builder.deviceId;
        this.deviceIdType = builder.deviceIdType;
        this.namespace = builder.namespace;
        this.newData = builder.newData;
        this.oldData = builder.oldData;
        this.path = builder.path;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceIdType
     */
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return newData
     */
    public String getNewData() {
        return this.newData;
    }

    /**
     * @return oldData
     */
    public String getOldData() {
        return this.oldData;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceDataRequest, Builder> {
        private String accountId; 
        private String accountType; 
        private String authType; 
        private String deviceId; 
        private String deviceIdType; 
        private String namespace; 
        private String newData; 
        private String oldData; 
        private String path; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceDataRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.accountType = response.accountType;
            this.authType = response.authType;
            this.deviceId = response.deviceId;
            this.deviceIdType = response.deviceIdType;
            this.namespace = response.namespace;
            this.newData = response.newData;
            this.oldData = response.oldData;
            this.path = response.path;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceIdType.
         */
        public Builder deviceIdType(String deviceIdType) {
            this.putQueryParameter("DeviceIdType", deviceIdType);
            this.deviceIdType = deviceIdType;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NewData.
         */
        public Builder newData(String newData) {
            this.putQueryParameter("NewData", newData);
            this.newData = newData;
            return this;
        }

        /**
         * OldData.
         */
        public Builder oldData(String oldData) {
            this.putQueryParameter("OldData", oldData);
            this.oldData = oldData;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public UpdateNamespaceDataRequest build() {
            return new UpdateNamespaceDataRequest(this);
        } 

    } 

}
