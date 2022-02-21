// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLedgerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyLedgerAttributeRequest</p>
 */
public class ModifyLedgerAttributeRequest extends Request {
    @Body
    @NameInMap("LedgerDescription")
    private String ledgerDescription;

    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Body
    @NameInMap("LedgerName")
    private String ledgerName;

    private ModifyLedgerAttributeRequest(Builder builder) {
        super(builder);
        this.ledgerDescription = builder.ledgerDescription;
        this.ledgerId = builder.ledgerId;
        this.ledgerName = builder.ledgerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLedgerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ledgerDescription
     */
    public String getLedgerDescription() {
        return this.ledgerDescription;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return ledgerName
     */
    public String getLedgerName() {
        return this.ledgerName;
    }

    public static final class Builder extends Request.Builder<ModifyLedgerAttributeRequest, Builder> {
        private String ledgerDescription; 
        private String ledgerId; 
        private String ledgerName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLedgerAttributeRequest response) {
            super(response);
            this.ledgerDescription = response.ledgerDescription;
            this.ledgerId = response.ledgerId;
            this.ledgerName = response.ledgerName;
        } 

        /**
         * LedgerDescription.
         */
        public Builder ledgerDescription(String ledgerDescription) {
            this.putBodyParameter("LedgerDescription", ledgerDescription);
            this.ledgerDescription = ledgerDescription;
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

        /**
         * LedgerName.
         */
        public Builder ledgerName(String ledgerName) {
            this.putBodyParameter("LedgerName", ledgerName);
            this.ledgerName = ledgerName;
            return this;
        }

        @Override
        public ModifyLedgerAttributeRequest build() {
            return new ModifyLedgerAttributeRequest(this);
        } 

    } 

}
