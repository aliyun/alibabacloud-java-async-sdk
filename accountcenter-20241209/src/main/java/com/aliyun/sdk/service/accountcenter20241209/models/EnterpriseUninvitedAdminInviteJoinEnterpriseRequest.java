// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseUninvitedAdminInviteJoinEnterpriseRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseUninvitedAdminInviteJoinEnterpriseRequest</p>
 */
public class EnterpriseUninvitedAdminInviteJoinEnterpriseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcId")
    private String ecId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InviteePk")
    private String inviteePk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LeId")
    private String leId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NbId")
    private String nbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private EnterpriseUninvitedAdminInviteJoinEnterpriseRequest(Builder builder) {
        super(builder);
        this.ecId = builder.ecId;
        this.encryptTicket = builder.encryptTicket;
        this.inviteePk = builder.inviteePk;
        this.leId = builder.leId;
        this.nbId = builder.nbId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseUninvitedAdminInviteJoinEnterpriseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecId
     */
    public String getEcId() {
        return this.ecId;
    }

    /**
     * @return encryptTicket
     */
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    /**
     * @return inviteePk
     */
    public String getInviteePk() {
        return this.inviteePk;
    }

    /**
     * @return leId
     */
    public String getLeId() {
        return this.leId;
    }

    /**
     * @return nbId
     */
    public String getNbId() {
        return this.nbId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<EnterpriseUninvitedAdminInviteJoinEnterpriseRequest, Builder> {
        private String ecId; 
        private String encryptTicket; 
        private String inviteePk; 
        private String leId; 
        private String nbId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseUninvitedAdminInviteJoinEnterpriseRequest request) {
            super(request);
            this.ecId = request.ecId;
            this.encryptTicket = request.encryptTicket;
            this.inviteePk = request.inviteePk;
            this.leId = request.leId;
            this.nbId = request.nbId;
            this.remark = request.remark;
        } 

        /**
         * EcId.
         */
        public Builder ecId(String ecId) {
            this.putQueryParameter("EcId", ecId);
            this.ecId = ecId;
            return this;
        }

        /**
         * EncryptTicket.
         */
        public Builder encryptTicket(String encryptTicket) {
            this.putQueryParameter("EncryptTicket", encryptTicket);
            this.encryptTicket = encryptTicket;
            return this;
        }

        /**
         * InviteePk.
         */
        public Builder inviteePk(String inviteePk) {
            this.putQueryParameter("InviteePk", inviteePk);
            this.inviteePk = inviteePk;
            return this;
        }

        /**
         * LeId.
         */
        public Builder leId(String leId) {
            this.putQueryParameter("LeId", leId);
            this.leId = leId;
            return this;
        }

        /**
         * NbId.
         */
        public Builder nbId(String nbId) {
            this.putQueryParameter("NbId", nbId);
            this.nbId = nbId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public EnterpriseUninvitedAdminInviteJoinEnterpriseRequest build() {
            return new EnterpriseUninvitedAdminInviteJoinEnterpriseRequest(this);
        } 

    } 

}
