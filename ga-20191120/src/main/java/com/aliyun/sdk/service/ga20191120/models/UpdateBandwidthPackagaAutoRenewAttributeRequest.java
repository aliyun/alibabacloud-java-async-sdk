// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBandwidthPackagaAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateBandwidthPackagaAutoRenewAttributeRequest</p>
 */
public class UpdateBandwidthPackagaAutoRenewAttributeRequest extends Request {
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
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RenewalStatus")
    private String renewalStatus;

    private UpdateBandwidthPackagaAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.renewalStatus = builder.renewalStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBandwidthPackagaAutoRenewAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpdateBandwidthPackagaAutoRenewAttributeRequest, Builder> {
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String clientToken; 
        private String instanceId; 
        private String name; 
        private String regionId; 
        private String renewalStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBandwidthPackagaAutoRenewAttributeRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.autoRenewDuration = request.autoRenewDuration;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.renewalStatus = request.renewalStatus;
        } 

        /**
         * Specifies whether to enable auto-renewal. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         * 
         * >  You must specify **AutoRenew** or **RenewalStatus**.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal duration. Unit: months. Valid values: **1** to **12**.
         * <p>
         * 
         * > This parameter takes effect only if **AutoRenew** is set to **true**.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the bandwidth plan.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the bandwidth plan.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The auto-renewal status of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **AutoRenewal**: The bandwidth plan is automatically renewed.
         * *   **Normal**: You must manually renew the bandwidth plan.
         * *   **NotRenewal**: The bandwidth plan is not renewed after it expires. The system sends only a non-renewal reminder three days before the expiration date. To renew a bandwidth plan for which you set RenewalStatus to NotRenewal, you can change the value of RenewalStatus from NotRenewal to Normal, and then manually renew the bandwidth plan. You can also set RenewalStatus to **AutoRenewal**.
         * > *   You must specify **AutoRenew** or **RenewalStatus**.
         * > *   **RenewalStatus** takes precedence over **AutoRenew**. If you do not specify **RenewalStatus**, **AutoRenew** is used.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        @Override
        public UpdateBandwidthPackagaAutoRenewAttributeRequest build() {
            return new UpdateBandwidthPackagaAutoRenewAttributeRequest(this);
        } 

    } 

}
