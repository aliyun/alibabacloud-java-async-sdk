// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RpcDataUploadResponseBody} extends {@link TeaModel}
 *
 * <p>RpcDataUploadResponseBody</p>
 */
public class RpcDataUploadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("headers")
    private java.util.Map < String, ? > headers;

    @NameInMap("params")
    private java.util.Map < String, ? > params;

    @NameInMap("speed")
    private String speed;

    @NameInMap("totalBytes")
    private Long totalBytes;

    @NameInMap("totalTime")
    private Long totalTime;

    @NameInMap("url")
    private String url;


    private RpcDataUploadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.headers = builder.headers;
        this.params = builder.params;
        this.speed = builder.speed;
        this.totalBytes = builder.totalBytes;
        this.totalTime = builder.totalTime;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcDataUploadResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return headers
     */
    public java.util.Map < String, ? > getHeaders() {
        return this.headers;
    }

    /**
     * @return params
     */
    public java.util.Map < String, ? > getParams() {
        return this.params;
    }

    /**
     * @return speed
     */
    public String getSpeed() {
        return this.speed;
    }

    /**
     * @return totalBytes
     */
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    /**
     * @return totalTime
     */
    public Long getTotalTime() {
        return this.totalTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > headers; 
        private java.util.Map < String, ? > params; 
        private String speed; 
        private Long totalBytes; 
        private Long totalTime; 
        private String url; 

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, ? > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>params.</p>
         */
        public Builder params(java.util.Map < String, ? > params) {
            this.params = params;
            return this;
        }

        /**
         * <p>speed.</p>
         */
        public Builder speed(String speed) {
            this.speed = speed;
            return this;
        }

        /**
         * <p>totalBytes.</p>
         */
        public Builder totalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }

        /**
         * <p>totalTime.</p>
         */
        public Builder totalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }

        /**
         * <p>url.</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public RpcDataUploadResponseBody build() {
            return new RpcDataUploadResponseBody(this);
        } 

    } 

}
