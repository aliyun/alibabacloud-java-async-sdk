// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEndUserRequest} extends {@link RequestModel}
 *
 * <p>AttachEndUserRequest</p>
 */
public class AttachEndUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
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
         * The address of the Active Directory (AD) office network.
         */
        public Builder adDomain(String adDomain) {
            this.putQueryParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * The type of the client.
         * <p>
         * 
         * Valid values:
         * 
         * *   1: hardware client.
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * The serial number (SN) of the hardware client.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * The ID of the convenient office network.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the user that you want to bind to the hardware client.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by WUYING Workspace.
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
         * Valid values:
         * 
         * *   AD: enterprise AD account.
         * *   SIMPLE: convenience account
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
