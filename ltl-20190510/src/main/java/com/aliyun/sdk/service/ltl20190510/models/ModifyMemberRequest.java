// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMemberRequest} extends {@link RequestModel}
 *
 * <p>ModifyMemberRequest</p>
 */
public class ModifyMemberRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("MemberContact")
    @Validation(required = true)
    private String memberContact;

    @Query
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    @Query
    @NameInMap("MemberName")
    @Validation(required = true)
    private String memberName;

    @Query
    @NameInMap("MemberPhone")
    @Validation(required = true)
    private String memberPhone;

    @Query
    @NameInMap("MemberUid")
    @Validation(required = true)
    private String memberUid;

    @Query
    @NameInMap("Remark")
    private String remark;

    private ModifyMemberRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.memberContact = builder.memberContact;
        this.memberId = builder.memberId;
        this.memberName = builder.memberName;
        this.memberPhone = builder.memberPhone;
        this.memberUid = builder.memberUid;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return memberContact
     */
    public String getMemberContact() {
        return this.memberContact;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return memberPhone
     */
    public String getMemberPhone() {
        return this.memberPhone;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ModifyMemberRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String memberContact; 
        private String memberId; 
        private String memberName; 
        private String memberPhone; 
        private String memberUid; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMemberRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.memberContact = request.memberContact;
            this.memberId = request.memberId;
            this.memberName = request.memberName;
            this.memberPhone = request.memberPhone;
            this.memberUid = request.memberUid;
            this.remark = request.remark;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * MemberContact.
         */
        public Builder memberContact(String memberContact) {
            this.putQueryParameter("MemberContact", memberContact);
            this.memberContact = memberContact;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MemberName.
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * MemberPhone.
         */
        public Builder memberPhone(String memberPhone) {
            this.putQueryParameter("MemberPhone", memberPhone);
            this.memberPhone = memberPhone;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
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
        public ModifyMemberRequest build() {
            return new ModifyMemberRequest(this);
        } 

    } 

}
