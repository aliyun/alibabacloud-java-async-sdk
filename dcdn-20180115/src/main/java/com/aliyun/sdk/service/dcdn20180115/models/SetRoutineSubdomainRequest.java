// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRoutineSubdomainRequest} extends {@link RequestModel}
 *
 * <p>SetRoutineSubdomainRequest</p>
 */
public class SetRoutineSubdomainRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Body
    @NameInMap("Subdomains")
    @Validation(required = true)
    private java.util.Map < String, ? > subdomains;

    private SetRoutineSubdomainRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.subdomains = builder.subdomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRoutineSubdomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return subdomains
     */
    public java.util.Map < String, ? > getSubdomains() {
        return this.subdomains;
    }

    public static final class Builder extends Request.Builder<SetRoutineSubdomainRequest, Builder> {
        private Long ownerId; 
        private java.util.Map < String, ? > subdomains; 

        private Builder() {
            super();
        } 

        private Builder(SetRoutineSubdomainRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.subdomains = response.subdomains;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Subdomains.
         */
        public Builder subdomains(java.util.Map < String, ? > subdomains) {
            this.putBodyParameter("Subdomains", subdomains);
            this.subdomains = subdomains;
            return this;
        }

        @Override
        public SetRoutineSubdomainRequest build() {
            return new SetRoutineSubdomainRequest(this);
        } 

    } 

}
