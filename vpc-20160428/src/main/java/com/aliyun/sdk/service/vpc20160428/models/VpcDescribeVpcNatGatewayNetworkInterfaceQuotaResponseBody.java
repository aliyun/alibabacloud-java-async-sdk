// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody</p>
 */
public class VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody extends TeaModel {
    @NameInMap("Quota")
    private Long quota;

    @NameInMap("RequestId")
    private String requestId;

    private VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return quota
     */
    public Long getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long quota; 
        private String requestId; 

        /**
         * The number of endpoints that can be created.
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody build() {
            return new VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody(this);
        } 

    } 

}
