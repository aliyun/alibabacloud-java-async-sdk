// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushBindRequest} extends {@link RequestModel}
 *
 * <p>PushBindRequest</p>
 */
public class PushBindRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("DeliveryToken")
    @Validation(required = true)
    private String deliveryToken;

    @Body
    @NameInMap("OsType")
    @Validation(required = true, maximum = 100)
    private Integer osType;

    @Body
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private PushBindRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.deliveryToken = builder.deliveryToken;
        this.osType = builder.osType;
        this.phoneNumber = builder.phoneNumber;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushBindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return deliveryToken
     */
    public String getDeliveryToken() {
        return this.deliveryToken;
    }

    /**
     * @return osType
     */
    public Integer getOsType() {
        return this.osType;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PushBindRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String deliveryToken; 
        private Integer osType; 
        private String phoneNumber; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PushBindRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.deliveryToken = request.deliveryToken;
            this.osType = request.osType;
            this.phoneNumber = request.phoneNumber;
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DeliveryToken.
         */
        public Builder deliveryToken(String deliveryToken) {
            this.putBodyParameter("DeliveryToken", deliveryToken);
            this.deliveryToken = deliveryToken;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(Integer osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PushBindRequest build() {
            return new PushBindRequest(this);
        } 

    } 

}
