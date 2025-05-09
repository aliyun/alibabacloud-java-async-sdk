// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeImagePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePermissionResponseBody</p>
 */
public class DescribeImagePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUids")
    private java.util.List<String> aliUids;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUids
     */
    public java.util.List<String> getAliUids() {
        return this.aliUids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> aliUids; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImagePermissionResponseBody model) {
            this.aliUids = model.aliUids;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the Alibaba Cloud accounts with which the image is shared.</p>
         */
        public Builder aliUids(java.util.List<String> aliUids) {
            this.aliUids = aliUids;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
