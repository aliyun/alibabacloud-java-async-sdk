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

        private Builder(ModifyInstanceAutoRenewAttributeRequest response) {
            super(response);
            this.autoRenew = response.autoRenew;
            this.duration = response.duration;
            this.instanceIds = response.instanceIds;
            this.ownerId = response.ownerId;
            this.renewalStatus = response.renewalStatus;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceIds.
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
         * RenewalStatus.
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
