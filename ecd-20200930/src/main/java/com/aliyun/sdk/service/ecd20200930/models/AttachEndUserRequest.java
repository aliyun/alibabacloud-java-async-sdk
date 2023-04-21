// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEndUserRequest} extends {@link RequestModel}
 *
 * <p>AttachEndUserRequest</p>
 */
public class AttachEndUserRequest extends Request {
    @Query
    @NameInMap("AdDomain")
    private String adDomain;

    @Query
    @NameInMap("ClientType")
    @Validation(required = true)
    private Integer clientType;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserType")
    private String userType;

    private AttachEndUserRequest(Builder builder) {
        super(builder);
        this.adDomain = builder.adDomain;
        this.clientType = builder.clientType;
        this.deviceId = builder.deviceId;
        this.directoryId = builder.directoryId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEndUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adDomain
     */
    public String getAdDomain() {
        return this.adDomain;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<AttachEndUserRequest, Builder> {
        private String adDomain; 
        private Integer clientType; 
        private String deviceId; 
        private String directoryId; 
        private String endUserId; 
        private String regionId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(AttachEndUserRequest request) {
            super(request);
            this.adDomain = request.adDomain;
            this.clientType = request.clientType;
            this.deviceId = request.deviceId;
            this.directoryId = request.directoryId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.userType = request.userType;
        } 

        /**
         * The address of the Active Directory (AD) workspace.
         */
        public Builder adDomain(String adDomain) {
            this.putQueryParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * The type of the Alibaba Cloud Workspace client that runs on the device.
         * <p>
         * 
         * *   1: the hardware client
         * *   2: the software client
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * The ID of the device.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The account type of the user.
         * <p>
         * 
         * *   SIMPLE: the convenience user
         * *   AD: the AD user
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public AttachEndUserRequest build() {
            return new AttachEndUserRequest(this);
        } 

    } 

}
