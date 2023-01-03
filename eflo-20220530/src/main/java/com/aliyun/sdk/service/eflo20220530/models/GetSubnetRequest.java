// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubnetRequest} extends {@link RequestModel}
 *
 * <p>GetSubnetRequest</p>
 */
public class GetSubnetRequest extends Request {
    @Body
    @NameInMap("SubnetId")
    private String subnetId;

    private GetSubnetRequest(Builder builder) {
        super(builder);
        this.subnetId = builder.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubnetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static final class Builder extends Request.Builder<GetSubnetRequest, Builder> {
        private String subnetId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubnetRequest request) {
            super(request);
            this.subnetId = request.subnetId;
        } 

        /**
         * Subnet ID
         */
        public Builder subnetId(String subnetId) {
            this.putBodyParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        @Override
        public GetSubnetRequest build() {
            return new GetSubnetRequest(this);
        } 

    } 

}
