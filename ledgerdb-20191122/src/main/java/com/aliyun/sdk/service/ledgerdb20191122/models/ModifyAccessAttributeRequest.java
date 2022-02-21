// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessAttributeRequest</p>
 */
public class ModifyAccessAttributeRequest extends Request {
    @Body
    @NameInMap("EnableOpenAccess")
    @Validation(required = true)
    private Boolean enableOpenAccess;

    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    private ModifyAccessAttributeRequest(Builder builder) {
        super(builder);
        this.enableOpenAccess = builder.enableOpenAccess;
        this.ledgerId = builder.ledgerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccessAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableOpenAccess
     */
    public Boolean getEnableOpenAccess() {
        return this.enableOpenAccess;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    public static final class Builder extends Request.Builder<ModifyAccessAttributeRequest, Builder> {
        private Boolean enableOpenAccess; 
        private String ledgerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccessAttributeRequest response) {
            super(response);
            this.enableOpenAccess = response.enableOpenAccess;
            this.ledgerId = response.ledgerId;
        } 

        /**
         * EnableOpenAccess.
         */
        public Builder enableOpenAccess(Boolean enableOpenAccess) {
            this.putBodyParameter("EnableOpenAccess", enableOpenAccess);
            this.enableOpenAccess = enableOpenAccess;
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
        public ModifyAccessAttributeRequest build() {
            return new ModifyAccessAttributeRequest(this);
        } 

    } 

}
