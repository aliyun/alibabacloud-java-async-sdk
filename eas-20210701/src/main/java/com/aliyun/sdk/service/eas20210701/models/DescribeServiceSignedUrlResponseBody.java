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
     * @return signedUrl
     */
    public String getSignedUrl() {
        return this.signedUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String signedUrl; 

        private Builder() {
        } 

        private Builder(DescribeServiceSignedUrlResponseBody model) {
            this.requestId = model.requestId;
            this.signedUrl = model.signedUrl;
        } 

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
         * <p>The service URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://foo-115**.console.cn-hangzhou.eas.pai-ml.com?expire=1735202661&signature=ey">https://foo-115**.console.cn-hangzhou.eas.pai-ml.com?expire=1735202661&amp;signature=ey</a>*******</p>
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
