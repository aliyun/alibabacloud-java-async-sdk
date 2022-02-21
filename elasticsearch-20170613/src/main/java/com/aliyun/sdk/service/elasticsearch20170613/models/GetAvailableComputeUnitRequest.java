// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailableComputeUnitRequest} extends {@link RequestModel}
 *
 * <p>GetAvailableComputeUnitRequest</p>
 */
public class GetAvailableComputeUnitRequest extends Request {
    @Path
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private GetAvailableComputeUnitRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailableComputeUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetAvailableComputeUnitRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetAvailableComputeUnitRequest response) {
            super(response);
            this.id = response.id;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetAvailableComputeUnitRequest build() {
            return new GetAvailableComputeUnitRequest(this);
        } 

    } 

}
