// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetTransferCalleePoolConfigRequest} extends {@link RequestModel}
 *
 * <p>SetTransferCalleePoolConfigRequest</p>
 */
public class SetTransferCalleePoolConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledRouteMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledRouteMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Details")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Details> details;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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

        private Builder(SetTransferCalleePoolConfigRequest request) {
            super(request);
            this.calledRouteMode = request.calledRouteMode;
            this.details = request.details;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.qualificationId = request.qualificationId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The call mode. Valid values:</p>
         * <ul>
         * <li><strong>roundRobin</strong></li>
         * <li><strong>random</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>roundRobin</p>
         */
        public Builder calledRouteMode(String calledRouteMode) {
            this.putQueryParameter("CalledRouteMode", calledRouteMode);
            this.calledRouteMode = calledRouteMode;
            return this;
        }

        /**
         * <p>The information about the phone numbers for transferring the call.</p>
         * <p>This parameter is required.</p>
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
         * <p>The phone number used for transferring the call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>400****</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The qualification ID. You can call the <a href="https://help.aliyun.com/document_detail/393548.html">GetHotlineQualificationByOrder</a> operation to obtain the qualification ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>190***</p>
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

    /**
     * 
     * {@link SetTransferCalleePoolConfigRequest} extends {@link TeaModel}
     *
     * <p>SetTransferCalleePoolConfigRequest</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Called")
        @com.aliyun.core.annotation.Validation(required = true)
        private String called;

        @com.aliyun.core.annotation.NameInMap("Caller")
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
             * <p>The called number.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>151****0000</p>
             */
            public Builder called(String called) {
                this.called = called;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>150****0000</p>
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
