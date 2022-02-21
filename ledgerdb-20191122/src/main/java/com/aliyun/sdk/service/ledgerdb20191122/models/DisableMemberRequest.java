// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableMemberRequest} extends {@link RequestModel}
 *
 * <p>DisableMemberRequest</p>
 */
public class DisableMemberRequest extends Request {
    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Body
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    private DisableMemberRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
        this.memberId = builder.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableMemberRequest create() {
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

    public static final class Builder extends Request.Builder<DisableMemberRequest, Builder> {
        private String ledgerId; 
        private String memberId; 

        private Builder() {
            super();
        } 

        private Builder(DisableMemberRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
            this.memberId = response.memberId;
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

        @Override
        public DisableMemberRequest build() {
            return new DisableMemberRequest(this);
        } 

    } 

}
