// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSVpcResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRDSVpcResponseBody</p>
 */
public class DescribeRDSVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeRDSVpcResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDSVpcResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String requestId; 
        private String vpcId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeRDSVpcResponseBody build() {
            return new DescribeRDSVpcResponseBody(this);
        } 

    } 

}
