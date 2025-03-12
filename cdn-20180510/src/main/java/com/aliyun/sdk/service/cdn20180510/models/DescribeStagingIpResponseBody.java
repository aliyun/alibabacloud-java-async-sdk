// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeStagingIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStagingIpResponseBody</p>
 */
public class DescribeStagingIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IPV4s")
    private IPV4s IPV4s;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeStagingIpResponseBody(Builder builder) {
        this.IPV4s = builder.IPV4s;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStagingIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return IPV4s
     */
    public IPV4s getIPV4s() {
        return this.IPV4s;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IPV4s IPV4s; 
        private String requestId; 

        /**
         * <p>IPv4 addresses.</p>
         */
        public Builder IPV4s(IPV4s IPV4s) {
            this.IPV4s = IPV4s;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1B9E0E83-24AC-49F4-9EE0-BF5EB03E8381</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeStagingIpResponseBody build() {
            return new DescribeStagingIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStagingIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStagingIpResponseBody</p>
     */
    public static class IPV4s extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPV4")
        private java.util.List<String> IPV4;

        private IPV4s(Builder builder) {
            this.IPV4 = builder.IPV4;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPV4s create() {
            return builder().build();
        }

        /**
         * @return IPV4
         */
        public java.util.List<String> getIPV4() {
            return this.IPV4;
        }

        public static final class Builder {
            private java.util.List<String> IPV4; 

            /**
             * IPV4.
             */
            public Builder IPV4(java.util.List<String> IPV4) {
                this.IPV4 = IPV4;
                return this;
            }

            public IPV4s build() {
                return new IPV4s(this);
            } 

        } 

    }
}
