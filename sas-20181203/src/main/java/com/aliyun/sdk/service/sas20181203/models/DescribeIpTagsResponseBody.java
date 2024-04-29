// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpTagsResponseBody</p>
 */
public class DescribeIpTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private DescribeIpTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String requestId; 
        private String tags; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tags that are added to the IP address.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public DescribeIpTagsResponseBody build() {
            return new DescribeIpTagsResponseBody(this);
        } 

    } 

}
