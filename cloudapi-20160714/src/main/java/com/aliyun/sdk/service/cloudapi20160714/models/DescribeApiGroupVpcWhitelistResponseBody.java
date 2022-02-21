// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupVpcWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupVpcWhitelistResponseBody</p>
 */
public class DescribeApiGroupVpcWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcIds")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpcIds.
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
