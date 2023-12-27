// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppKeyResponseBody</p>
 */
public class DescribeAppKeyResponseBody extends TeaModel {
    @NameInMap("AppKey")
    private String appKey;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppKeyResponseBody(Builder builder) {
        this.appKey = builder.appKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppKeyResponseBody create() {
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
         * AppKey。
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppKeyResponseBody build() {
            return new DescribeAppKeyResponseBody(this);
        } 

    } 

}
