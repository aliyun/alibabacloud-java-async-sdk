// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeServiceSignedUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceSignedUrlResponseBody</p>
 */
public class DescribeServiceSignedUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignedUrl")
    private String signedUrl;

    private DescribeServiceSignedUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.signedUrl = builder.signedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceSignedUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signedUrl
     */
    public String getSignedUrl() {
        return this.signedUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String signedUrl; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SignedUrl.
         */
        public Builder signedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }

        public DescribeServiceSignedUrlResponseBody build() {
            return new DescribeServiceSignedUrlResponseBody(this);
        } 

    } 

}
