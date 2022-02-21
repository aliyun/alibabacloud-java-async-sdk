// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>GrantServiceLinkedRoleRequest</p>
 */
public class GrantServiceLinkedRoleRequest extends Request {
    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    private GrantServiceLinkedRoleRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantServiceLinkedRoleRequest create() {
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

    public static final class Builder extends Request.Builder<GrantServiceLinkedRoleRequest, Builder> {
        private String ledgerId; 

        private Builder() {
            super();
        } 

        private Builder(GrantServiceLinkedRoleRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
        } 

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putQueryParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        @Override
        public GrantServiceLinkedRoleRequest build() {
            return new GrantServiceLinkedRoleRequest(this);
        } 

    } 

}
