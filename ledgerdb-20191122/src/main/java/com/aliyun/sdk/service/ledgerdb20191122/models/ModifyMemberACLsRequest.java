// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMemberACLsRequest} extends {@link RequestModel}
 *
 * <p>ModifyMemberACLsRequest</p>
 */
public class ModifyMemberACLsRequest extends Request {
    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Body
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    @Body
    @NameInMap("Role")
    @Validation(required = true)
    private String role;

    private ModifyMemberACLsRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
        this.memberId = builder.memberId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMemberACLsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder extends Request.Builder<ModifyMemberACLsRequest, Builder> {
        private String ledgerId; 
        private String memberId; 
        private String role; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMemberACLsRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
            this.memberId = response.memberId;
            this.role = response.role;
        } 

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putBodyParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putBodyParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putBodyParameter("Role", role);
            this.role = role;
            return this;
        }

        @Override
        public ModifyMemberACLsRequest build() {
            return new ModifyMemberACLsRequest(this);
        } 

    } 

}
