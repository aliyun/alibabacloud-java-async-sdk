// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStreamURLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamURLResponseBody</p>
 */
public class DescribeStreamURLResponseBody extends TeaModel {
    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Url")
    private String url;

    private DescribeStreamURLResponseBody(Builder builder) {
        this.expireTime = builder.expireTime;
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamURLResponseBody create() {
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

        public DescribeStreamURLResponseBody build() {
            return new DescribeStreamURLResponseBody(this);
        } 

    } 

}
