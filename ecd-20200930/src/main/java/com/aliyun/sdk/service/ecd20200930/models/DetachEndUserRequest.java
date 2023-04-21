// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachEndUserRequest} extends {@link RequestModel}
 *
 * <p>DetachEndUserRequest</p>
 */
public class DetachEndUserRequest extends Request {
    @Query
    @NameInMap("AdDomain")
    private String adDomain;

    @Query
    @NameInMap("ClientType")
    @Validation(required = true)
    private String clientType;

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
    @NameInMap("Region")
    private String region;

    private DetachEndUserRequest(Builder builder) {
        super(builder);
        this.adDomain = builder.adDomain;
        this.clientType = builder.clientType;
        this.deviceId = builder.deviceId;
        this.directoryId = builder.directoryId;
        this.endUserId = builder.endUserId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachEndUserRequest create() {
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
    public String getClientType() {
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<DetachEndUserRequest, Builder> {
        private String adDomain; 
        private String clientType; 
        private String deviceId; 
        private String directoryId; 
        private String endUserId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DetachEndUserRequest request) {
            super(request);
            this.adDomain = request.adDomain;
            this.clientType = request.clientType;
            this.deviceId = request.deviceId;
            this.directoryId = request.directoryId;
            this.endUserId = request.endUserId;
            this.region = request.region;
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
         * The type of the Alibaba Cloud Workspace client. 1: the hardware client 2: the software client
         */
        public Builder clientType(String clientType) {
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
         * The ID of the user that is bound to the client.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public DetachEndUserRequest build() {
            return new DetachEndUserRequest(this);
        } 

    } 

}
