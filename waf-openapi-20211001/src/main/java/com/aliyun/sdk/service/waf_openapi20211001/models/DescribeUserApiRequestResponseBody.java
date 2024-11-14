// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserApiRequestResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserApiRequestResponseBody</p>
 */
public class DescribeUserApiRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Requests")
    private java.util.List < Requests> requests;

    private DescribeUserApiRequestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.requests = builder.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserApiRequestResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requests
     */
    public java.util.List < Requests> getRequests() {
        return this.requests;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Requests> requests; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D13E4540-4432-5AD7-B216-6369512514F4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics.</p>
         */
        public Builder requests(java.util.List < Requests> requests) {
            this.requests = requests;
            return this;
        }

        public DescribeUserApiRequestResponseBody build() {
            return new DescribeUserApiRequestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserApiRequestResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserApiRequestResponseBody</p>
     */
    public static class Requests extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Requests(Builder builder) {
            this.count = builder.count;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Requests create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long count; 
            private String value; 

            /**
             * <p>The number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>76</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The type of the statistics. Valid values:</p>
             * <ul>
             * <li><strong>client_list</strong>: client</li>
             * <li><strong>ip</strong>: IP address</li>
             * <li><strong>region_id</strong> region</li>
             * <li><strong>country_id</strong>: country</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;client_list&quot;: [
             *         &quot;Unknown&quot;
             *     ],
             *     &quot;ip&quot;: &quot;47.92.113.***&quot;,
             *     &quot;region_id&quot;: &quot;110000&quot;,
             *     &quot;country_id&quot;: &quot;CN&quot;
             * }</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Requests build() {
                return new Requests(this);
            } 

        } 

    }
}
