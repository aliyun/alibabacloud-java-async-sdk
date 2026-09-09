// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDeviceURLResponseBody model) {
            this.expireTime = model.expireTime;
            this.requestId = model.requestId;
            this.url = model.url;
        } 

        /**
         * <p>URL expiration time.<br>
         * UNIX timestamp, in seconds.<br></p>
         * 
         * <strong>example:</strong>
         * <p>1639130258</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Stream URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://demo.aliyundoc.com/live/live001?auth_key=1639130258-0-0-b2b04fe85ece6*****a6b1a42bc7e</p>
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
