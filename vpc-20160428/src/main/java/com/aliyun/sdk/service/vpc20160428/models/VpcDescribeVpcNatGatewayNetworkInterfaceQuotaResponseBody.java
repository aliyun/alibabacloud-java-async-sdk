// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody</p>
 */
public class VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Long quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody model) {
            this.quota = model.quota;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of endpoints that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>611CB80C-B6A9-43DB-9E38-0B0AC3D9B58F</p>
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
