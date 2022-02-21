// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNamespaceDataRequest} extends {@link RequestModel}
 *
 * <p>GetNamespaceDataRequest</p>
 */
public class GetNamespaceDataRequest extends Request {
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
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetNamespaceDataRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountType = builder.accountType;
        this.authType = builder.authType;
        this.deviceId = builder.deviceId;
        this.deviceIdType = builder.deviceIdType;
        this.namespace = builder.namespace;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNamespaceDataRequest create() {
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

    public static final class Builder extends Request.Builder<GetNamespaceDataRequest, Builder> {
        private String accountId; 
        private String accountType; 
        private String authType; 
        private String deviceId; 
        private String deviceIdType; 
        private String namespace; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetNamespaceDataRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.accountType = response.accountType;
            this.authType = response.authType;
            this.deviceId = response.deviceId;
            this.deviceIdType = response.deviceIdType;
            this.namespace = response.namespace;
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
        public GetNamespaceDataRequest build() {
            return new GetNamespaceDataRequest(this);
        } 

    } 

}
