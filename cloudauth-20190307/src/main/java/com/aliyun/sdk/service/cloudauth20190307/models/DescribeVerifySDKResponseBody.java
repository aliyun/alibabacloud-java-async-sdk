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
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SDK download URL. When not empty, it indicates that the generation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.xxx.com">https://www.xxx.com</a></p>
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
