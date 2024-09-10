// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVolDingdingMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVolDingdingMessageResponseBody</p>
 */
public class DescribeVolDingdingMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DingdingUrl")
    private String dingdingUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVolDingdingMessageResponseBody(Builder builder) {
        this.dingdingUrl = builder.dingdingUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVolDingdingMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return dingdingUrl
     */
    public String getDingdingUrl() {
        return this.dingdingUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dingdingUrl; 
        private String requestId; 

        /**
         * DingdingUrl.
         */
        public Builder dingdingUrl(String dingdingUrl) {
            this.dingdingUrl = dingdingUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVolDingdingMessageResponseBody build() {
            return new DescribeVolDingdingMessageResponseBody(this);
        } 

    } 

}
