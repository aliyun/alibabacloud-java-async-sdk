// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTransferCalleePoolConfigRequest} extends {@link RequestModel}
 *
 * <p>SetTransferCalleePoolConfigRequest</p>
 */
public class SetTransferCalleePoolConfigRequest extends Request {
    @Query
    @NameInMap("CalledRouteMode")
    @Validation(required = true)
    private String calledRouteMode;

    @Query
    @NameInMap("Details")
    @Validation(required = true)
    private java.util.List < Details> details;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("QualificationId")
    @Validation(required = true)
    private String qualificationId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SetTransferCalleePoolConfigRequest(Builder builder) {
        super(builder);
        this.calledRouteMode = builder.calledRouteMode;
        this.details = builder.details;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.qualificationId = builder.qualificationId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTransferCalleePoolConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledRouteMode
     */
    public String getCalledRouteMode() {
        return this.calledRouteMode;
    }

    /**
     * @return details
     */
    public java.util.List < Details> getDetails() {
        return this.details;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return qualificationId
     */
    public String getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<SetTransferCalleePoolConfigRequest, Builder> {
        private String calledRouteMode; 
        private java.util.List < Details> details; 
        private Long ownerId; 
        private String phoneNumber; 
        private String qualificationId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SetTransferCalleePoolConfigRequest response) {
            super(response);
            this.calledRouteMode = response.calledRouteMode;
            this.details = response.details;
            this.ownerId = response.ownerId;
            this.phoneNumber = response.phoneNumber;
            this.qualificationId = response.qualificationId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * CalledRouteMode.
         */
        public Builder calledRouteMode(String calledRouteMode) {
            this.putQueryParameter("CalledRouteMode", calledRouteMode);
            this.calledRouteMode = calledRouteMode;
            return this;
        }

        /**
         * Details.
         */
        public Builder details(java.util.List < Details> details) {
            this.putQueryParameter("Details", details);
            this.details = details;
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
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * QualificationId.
         */
        public Builder qualificationId(String qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public SetTransferCalleePoolConfigRequest build() {
            return new SetTransferCalleePoolConfigRequest(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("Called")
        @Validation(required = true)
        private String called;

        @NameInMap("Caller")
        private String caller;

        private Details(Builder builder) {
            this.called = builder.called;
            this.caller = builder.caller;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return called
         */
        public String getCalled() {
            return this.called;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        public static final class Builder {
            private String called; 
            private String caller; 

            /**
             * Called.
             */
            public Builder called(String called) {
                this.called = called;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
