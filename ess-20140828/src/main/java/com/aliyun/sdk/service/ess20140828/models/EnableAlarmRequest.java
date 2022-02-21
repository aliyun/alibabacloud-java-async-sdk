// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAlarmRequest} extends {@link RequestModel}
 *
 * <p>EnableAlarmRequest</p>
 */
public class EnableAlarmRequest extends Request {
    @Query
    @NameInMap("AlarmTaskId")
    @Validation(required = true)
    private String alarmTaskId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private EnableAlarmRequest(Builder builder) {
        super(builder);
        this.alarmTaskId = builder.alarmTaskId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmTaskId
     */
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<EnableAlarmRequest, Builder> {
        private String alarmTaskId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(EnableAlarmRequest response) {
            super(response);
            this.alarmTaskId = response.alarmTaskId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
        } 

        /**
         * AlarmTaskId.
         */
        public Builder alarmTaskId(String alarmTaskId) {
            this.putQueryParameter("AlarmTaskId", alarmTaskId);
            this.alarmTaskId = alarmTaskId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        @Override
        public EnableAlarmRequest build() {
            return new EnableAlarmRequest(this);
        } 

    } 

}
