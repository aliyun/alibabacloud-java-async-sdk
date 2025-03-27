// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

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
 * {@link DescribeCapResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapResponseBody</p>
 */
public class DescribeCapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapUrl")
    private CapUrl capUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCapResponseBody(Builder builder) {
        this.capUrl = builder.capUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capUrl
     */
    public CapUrl getCapUrl() {
        return this.capUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CapUrl capUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCapResponseBody model) {
            this.capUrl = model.capUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The download link to the traffic data that is captured when a DDoS attack event occurs.</p>
         */
        public Builder capUrl(CapUrl capUrl) {
            this.capUrl = capUrl;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C728D7E9-9A39-52E0-966B-5C33118BDBB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCapResponseBody build() {
            return new DescribeCapResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCapResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapResponseBody</p>
     */
    public static class CapUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CapUrl(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapUrl create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(CapUrl model) {
                this.url = model.url;
            } 

            /**
             * <p>The download link to the traffic data.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://beaver-pack****.oss-cn-hangzhou.aliyuncs.com/ddos-2021112511-121.89.XX.XX.cap?Expires=1637824408&OSSAccessKeyId=LTAIXu2lJhw3****&Signature=KKSzOMSUajtwcqfqxkU1nK69d4">http://beaver-pack****.oss-cn-hangzhou.aliyuncs.com/ddos-2021112511-121.89.XX.XX.cap?Expires=1637824408&amp;OSSAccessKeyId=LTAIXu2lJhw3****&amp;Signature=KKSzOMSUajtwcqfqxkU1nK69d4</a>****</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CapUrl build() {
                return new CapUrl(this);
            } 

        } 

    }
}
