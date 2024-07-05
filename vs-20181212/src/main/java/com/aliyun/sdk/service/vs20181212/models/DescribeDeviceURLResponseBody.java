// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceURLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceURLResponseBody</p>
 */
public class DescribeDeviceURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DescribeDeviceURLResponseBody(Builder builder) {
        this.expireTime = builder.expireTime;
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private Long expireTime; 
        private String requestId; 
        private String url; 

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DescribeDeviceURLResponseBody build() {
            return new DescribeDeviceURLResponseBody(this);
        } 

    } 

}
