// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApiGroupVpcWhitelistResponseBody model) {
            this.requestId = model.requestId;
            this.vpcIds = model.vpcIds;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ016</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp11w979o2s9rcr962w25</p>
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
