// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOssScanConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteOssScanConfigRequest</p>
 */
public class DeleteOssScanConfigRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    private DeleteOssScanConfigRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOssScanConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteOssScanConfigRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOssScanConfigRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the policy.
         * <p>
         * 
         * >  You can call the [ListOssScanConfig](~~ListOssScanConfig~~) operation to query the IDs of rules.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteOssScanConfigRequest build() {
            return new DeleteOssScanConfigRequest(this);
        } 

    } 

}
