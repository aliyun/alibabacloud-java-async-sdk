// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteMembersRequest} extends {@link RequestModel}
 *
 * <p>InviteMembersRequest</p>
 */
public class InviteMembersRequest extends Request {
    @Body
    @NameInMap("AliUids")
    @Validation(required = true)
    private String aliUids;

    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    private InviteMembersRequest(Builder builder) {
        super(builder);
        this.aliUids = builder.aliUids;
        this.ledgerId = builder.ledgerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUids
     */
    public String getAliUids() {
        return this.aliUids;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    public static final class Builder extends Request.Builder<InviteMembersRequest, Builder> {
        private String aliUids; 
        private String ledgerId; 

        private Builder() {
            super();
        } 

        private Builder(InviteMembersRequest response) {
            super(response);
            this.aliUids = response.aliUids;
            this.ledgerId = response.ledgerId;
        } 

        /**
         * AliUids.
         */
        public Builder aliUids(String aliUids) {
            this.putBodyParameter("AliUids", aliUids);
            this.aliUids = aliUids;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putBodyParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        @Override
        public InviteMembersRequest build() {
            return new InviteMembersRequest(this);
        } 

    } 

}
