// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAcceleratorAutoRenewAttributeRequest</p>
 */
public class UpdateAcceleratorAutoRenewAttributeRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RenewalStatus")
    private String renewalStatus;

    private UpdateAcceleratorAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.clientToken = builder.clientToken;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.renewalStatus = builder.renewalStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAcceleratorAutoRenewAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public static final class Builder extends Request.Builder<UpdateAcceleratorAutoRenewAttributeRequest, Builder> {
        private String acceleratorId; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String clientToken; 
        private String name; 
        private String regionId; 
        private String renewalStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAcceleratorAutoRenewAttributeRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.autoRenew = response.autoRenew;
            this.autoRenewDuration = response.autoRenewDuration;
            this.clientToken = response.clientToken;
            this.name = response.name;
            this.regionId = response.regionId;
            this.renewalStatus = response.renewalStatus;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewDuration.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * RenewalStatus.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        @Override
        public UpdateAcceleratorAutoRenewAttributeRequest build() {
            return new UpdateAcceleratorAutoRenewAttributeRequest(this);
        } 

    } 

}
