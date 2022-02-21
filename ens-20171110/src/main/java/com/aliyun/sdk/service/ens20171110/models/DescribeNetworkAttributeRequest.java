// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkAttributeRequest</p>
 */
public class DescribeNetworkAttributeRequest extends Request {
    @Query
    @NameInMap("NetworkId")
    @Validation(required = true)
    private String networkId;

    private DescribeNetworkAttributeRequest(Builder builder) {
        super(builder);
        this.networkId = builder.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkAttributeRequest, Builder> {
        private String networkId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkAttributeRequest response) {
            super(response);
            this.networkId = response.networkId;
        } 

        /**
         * NetworkId.
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        @Override
        public DescribeNetworkAttributeRequest build() {
            return new DescribeNetworkAttributeRequest(this);
        } 

    } 

}
