// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteMemberRequest</p>
 */
public class DeleteMemberRequest extends Request {
    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Query
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    private DeleteMemberRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
        this.memberId = builder.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMemberRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMemberRequest, Builder> {
        private String ledgerId; 
        private String memberId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMemberRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
            this.memberId = response.memberId;
        } 

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putQueryParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
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

        @Override
        public DeleteMemberRequest build() {
            return new DeleteMemberRequest(this);
        } 

    } 

}
