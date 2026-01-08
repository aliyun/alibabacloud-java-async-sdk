// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddAddressRecoverSuspendRequest} extends {@link RequestModel}
 *
 * <p>AddAddressRecoverSuspendRequest</p>
 */
public class AddAddressRecoverSuspendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditRecord")
    private AuditRecord auditRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestType")
    private String requestType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AddAddressRecoverSuspendRequest(Builder builder) {
        super(builder);
        this.auditRecord = builder.auditRecord;
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.requestType = builder.requestType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAddressRecoverSuspendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditRecord
     */
    public AuditRecord getAuditRecord() {
        return this.auditRecord;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requestType
     */
    public String getRequestType() {
        return this.requestType;
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

    public static final class Builder extends Request.Builder<AddAddressRecoverSuspendRequest, Builder> {
        private AuditRecord auditRecord; 
        private String custSpaceId; 
        private Long ownerId; 
        private String requestType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AddAddressRecoverSuspendRequest request) {
            super(request);
            this.auditRecord = request.auditRecord;
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.requestType = request.requestType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AuditRecord.
         */
        public Builder auditRecord(AuditRecord auditRecord) {
            String auditRecordShrink = shrink(auditRecord, "AuditRecord", "json");
            this.putQueryParameter("AuditRecord", auditRecordShrink);
            this.auditRecord = auditRecord;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
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
         * RequestType.
         */
        public Builder requestType(String requestType) {
            this.putQueryParameter("RequestType", requestType);
            this.requestType = requestType;
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
        public AddAddressRecoverSuspendRequest build() {
            return new AddAddressRecoverSuspendRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddAddressRecoverSuspendRequest} extends {@link TeaModel}
     *
     * <p>AddAddressRecoverSuspendRequest</p>
     */
    public static class AuditRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyReason")
        private String applyReason;

        @com.aliyun.core.annotation.NameInMap("MessageDestinationCountry")
        private java.util.List<String> messageDestinationCountry;

        @com.aliyun.core.annotation.NameInMap("MessageDestinationInternationalCountry")
        private java.util.List<String> messageDestinationInternationalCountry;

        @com.aliyun.core.annotation.NameInMap("RecoveryDate")
        private String recoveryDate;

        @com.aliyun.core.annotation.NameInMap("SuspensionDate")
        private String suspensionDate;

        private AuditRecord(Builder builder) {
            this.applyReason = builder.applyReason;
            this.messageDestinationCountry = builder.messageDestinationCountry;
            this.messageDestinationInternationalCountry = builder.messageDestinationInternationalCountry;
            this.recoveryDate = builder.recoveryDate;
            this.suspensionDate = builder.suspensionDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditRecord create() {
            return builder().build();
        }

        /**
         * @return applyReason
         */
        public String getApplyReason() {
            return this.applyReason;
        }

        /**
         * @return messageDestinationCountry
         */
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        /**
         * @return messageDestinationInternationalCountry
         */
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        /**
         * @return recoveryDate
         */
        public String getRecoveryDate() {
            return this.recoveryDate;
        }

        /**
         * @return suspensionDate
         */
        public String getSuspensionDate() {
            return this.suspensionDate;
        }

        public static final class Builder {
            private String applyReason; 
            private java.util.List<String> messageDestinationCountry; 
            private java.util.List<String> messageDestinationInternationalCountry; 
            private String recoveryDate; 
            private String suspensionDate; 

            private Builder() {
            } 

            private Builder(AuditRecord model) {
                this.applyReason = model.applyReason;
                this.messageDestinationCountry = model.messageDestinationCountry;
                this.messageDestinationInternationalCountry = model.messageDestinationInternationalCountry;
                this.recoveryDate = model.recoveryDate;
                this.suspensionDate = model.suspensionDate;
            } 

            /**
             * ApplyReason.
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * MessageDestinationCountry.
             */
            public Builder messageDestinationCountry(java.util.List<String> messageDestinationCountry) {
                this.messageDestinationCountry = messageDestinationCountry;
                return this;
            }

            /**
             * MessageDestinationInternationalCountry.
             */
            public Builder messageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
                this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
                return this;
            }

            /**
             * RecoveryDate.
             */
            public Builder recoveryDate(String recoveryDate) {
                this.recoveryDate = recoveryDate;
                return this;
            }

            /**
             * SuspensionDate.
             */
            public Builder suspensionDate(String suspensionDate) {
                this.suspensionDate = suspensionDate;
                return this;
            }

            public AuditRecord build() {
                return new AuditRecord(this);
            } 

        } 

    }
}
