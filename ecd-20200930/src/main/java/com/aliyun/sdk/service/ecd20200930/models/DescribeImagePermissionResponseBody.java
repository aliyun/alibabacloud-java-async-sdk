// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePermissionResponseBody</p>
 */
public class DescribeImagePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUids")
    private java.util.List < String > aliUids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImagePermissionResponseBody(Builder builder) {
        this.aliUids = builder.aliUids;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagePermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUids
     */
    public java.util.List < String > getAliUids() {
        return this.aliUids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > aliUids; 
        private String requestId; 

        /**
         * The IDs of the Alibaba Cloud accounts with which the image is shared.
         */
        public Builder aliUids(java.util.List < String > aliUids) {
            this.aliUids = aliUids;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImagePermissionResponseBody build() {
            return new DescribeImagePermissionResponseBody(this);
        } 

    } 

}
