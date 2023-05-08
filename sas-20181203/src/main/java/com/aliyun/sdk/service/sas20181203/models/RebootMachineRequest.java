// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootMachineRequest} extends {@link RequestModel}
 *
 * <p>RebootMachineRequest</p>
 */
public class RebootMachineRequest extends Request {
    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private RebootMachineRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootMachineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<RebootMachineRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(RebootMachineRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public RebootMachineRequest build() {
            return new RebootMachineRequest(this);
        } 

    } 

}
