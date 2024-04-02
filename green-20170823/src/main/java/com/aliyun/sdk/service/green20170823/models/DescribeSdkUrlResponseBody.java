// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSdkUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSdkUrlResponseBody</p>
 */
public class DescribeSdkUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SdkUrl")
    private String sdkUrl;

    private DescribeSdkUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdkUrl = builder.sdkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdkUrlResponseBody create() {
        return builder().build();
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

        public DescribeSdkUrlResponseBody build() {
            return new DescribeSdkUrlResponseBody(this);
        } 

    } 

}
