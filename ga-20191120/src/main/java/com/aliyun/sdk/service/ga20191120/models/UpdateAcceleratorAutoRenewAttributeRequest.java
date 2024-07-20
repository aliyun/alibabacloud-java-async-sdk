// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAcceleratorAutoRenewAttributeRequest</p>
 */
public class UpdateAcceleratorAutoRenewAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalStatus")
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

        private Builder(UpdateAcceleratorAutoRenewAttributeRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.autoRenew = request.autoRenew;
            this.autoRenewDuration = request.autoRenewDuration;
            this.clientToken = request.clientToken;
            this.name = request.name;
            this.regionId = request.regionId;
            this.renewalStatus = request.renewalStatus;
        } 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the GA instance. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         * 
         * >  **AutoRenew** and **RenewalStatus** cannot be left empty at the same time.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal duration. Unit: month.
         * <p>
         * 
         * Valid values: **1** to **12**.
         * 
         * >  This parameter takes effect only if you set **AutoRenew** to **true**.
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
         * The name of the GA instance.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies how to renew the GA instance. Valid values:
         * <p>
         * 
         * *   **AutoRenewal**: The system automatically renews the GA instance.
         * *   **Normal**: You must manually renew the GA instance.
         * *   **NotRenewal**: The GA instance is not renewed after the instance expires. The system sends only a non-renewal reminder three days before the expiration date. The system no longer reminds you to renew the GA instance. To renew a GA instance whose RenewalStatus is set to NotRenewal, change the value of RenewalStatus from NotRenewal to **Normal**, and then manually renew the instance. You can also set RenewalStatus to **AutoRenewal**.
         * 
         * > 
         * 
         * *   **AutoRenew** and **RenewalStatus** cannot be left empty at the same time.
         * 
         * *   **RenewalStatus** takes precedence over **AutoRenew**. By default, if you do not specify **RenewalStatus**, **AutoRenew** is used.
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
