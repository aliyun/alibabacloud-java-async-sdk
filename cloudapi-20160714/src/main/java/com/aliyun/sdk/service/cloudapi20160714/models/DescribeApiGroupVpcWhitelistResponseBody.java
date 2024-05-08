// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupVpcWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupVpcWhitelistResponseBody</p>
 */
public class DescribeApiGroupVpcWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcIds")
    private String vpcIds;

    private DescribeApiGroupVpcWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcIds = builder.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGroupVpcWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcIds
     */
    public String getVpcIds() {
        return this.vpcIds;
    }

    public static final class Builder {
        private String requestId; 
        private String vpcIds; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder vpcIds(String vpcIds) {
            this.vpcIds = vpcIds;
            return this;
        }

        public DescribeApiGroupVpcWhitelistResponseBody build() {
            return new DescribeApiGroupVpcWhitelistResponseBody(this);
        } 

    } 

}
