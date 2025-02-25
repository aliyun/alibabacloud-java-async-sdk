// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafBotAppKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafBotAppKeyResponseBody</p>
 */
public class DescribeDcdnWafBotAppKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafBotAppKeyResponseBody(Builder builder) {
        this.appKey = builder.appKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafBotAppKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appKey; 
        private String requestId; 

        /**
         * <p>The SDK authentication key for the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>examp1eapp_key_xxxiuMWTX4Gw</p>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2542B96-B535-5BF9-8EEE-1CF11B20CCA8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafBotAppKeyResponseBody build() {
            return new DescribeDcdnWafBotAppKeyResponseBody(this);
        } 

    } 

}
