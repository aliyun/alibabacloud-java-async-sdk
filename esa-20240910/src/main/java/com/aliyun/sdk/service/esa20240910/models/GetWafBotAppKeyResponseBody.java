// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetWafBotAppKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetWafBotAppKeyResponseBody</p>
 */
public class GetWafBotAppKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetWafBotAppKeyResponseBody(Builder builder) {
        this.appKey = builder.appKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafBotAppKeyResponseBody create() {
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
         * <p>The application key.</p>
         * 
         * <strong>example:</strong>
         * <p>example_appkey</p>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWafBotAppKeyResponseBody build() {
            return new GetWafBotAppKeyResponseBody(this);
        } 

    } 

}
