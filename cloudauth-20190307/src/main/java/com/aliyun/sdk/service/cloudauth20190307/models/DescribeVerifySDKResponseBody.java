// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifySDKResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifySDKResponseBody</p>
 */
public class DescribeVerifySDKResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SdkUrl")
    private String sdkUrl;

    private DescribeVerifySDKResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdkUrl = builder.sdkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifySDKResponseBody create() {
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
     * @return sdkUrl
     */
    public String getSdkUrl() {
        return this.sdkUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String sdkUrl; 

        private Builder() {
        } 

        private Builder(DescribeVerifySDKResponseBody model) {
            this.requestId = model.requestId;
            this.sdkUrl = model.sdkUrl;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SdkUrl.
         */
        public Builder sdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }

        public DescribeVerifySDKResponseBody build() {
            return new DescribeVerifySDKResponseBody(this);
        } 

    } 

}
