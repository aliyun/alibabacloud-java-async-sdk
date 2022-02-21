// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMemberRequest} extends {@link RequestModel}
 *
 * <p>EnableMemberRequest</p>
 */
public class EnableMemberRequest extends Request {
    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Body
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    private EnableMemberRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
        this.memberId = builder.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableMemberRequest create() {
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

    public static final class Builder extends Request.Builder<EnableMemberRequest, Builder> {
        private String ledgerId; 
        private String memberId; 

        private Builder() {
            super();
        } 

        private Builder(EnableMemberRequest response) {
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
        public EnableMemberRequest build() {
            return new EnableMemberRequest(this);
        } 

    } 

}
