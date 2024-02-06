// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAutoRenewAttributeRequest</p>
 */
public class ModifyInstanceAutoRenewAttributeRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    @Validation(required = true)
    private String autoRenew;

    @Query
    @NameInMap("Duration")
    private String duration;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RenewalStatus")
    private String renewalStatus;

    private ModifyInstanceAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.duration = builder.duration;
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
        this.renewalStatus = builder.renewalStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceAutoRenewAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceAutoRenewAttributeRequest, Builder> {
        private String autoRenew; 
        private String duration; 
        private String instanceIds; 
        private String ownerId; 
        private String renewalStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAutoRenewAttributeRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.duration = request.duration;
            this.instanceIds = request.instanceIds;
            this.ownerId = request.ownerId;
            this.renewalStatus = request.renewalStatus;
        } 

        /**
         * Specifies whether to enable the auto-renewal feature. Valid values: **True and False**. Default value: False.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the instance. Unit: months. Valid values: 1 to 9 and 12. This parameter is required if the AutoRenew parameter is set to true.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The IDs of the instances. Separate IDs with semicolons (;).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Specifies whether to renew the instance. The **RenewalStatus** parameter has a higher priority than the **AutoRenew** parameter. If you do not specify **RenewalStatus**, the **AutoRenew** parameter is used by default.
         * <p>
         * 
         * *   AutoRenewal: Auto-renewal is enabled for the instance.
         * *   Normal: Auto-renewal is disabled for the instance.
         * *   NotRenewal: The instance is not renewed.
         * 
         * The system no longer sends an expiration notification but sends only a renewal notification three days before the instance expires. To renew the instance, you can change the value of this parameter from NotRenewal to Normal and then manually renew the instance, or change the value of this parameter from NotRenewal to AutoRenewal.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        @Override
        public ModifyInstanceAutoRenewAttributeRequest build() {
            return new ModifyInstanceAutoRenewAttributeRequest(this);
        } 

    } 

}
