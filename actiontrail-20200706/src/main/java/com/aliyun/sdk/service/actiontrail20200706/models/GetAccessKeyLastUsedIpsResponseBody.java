// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetAccessKeyLastUsedIpsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedIpsResponseBody</p>
 */
public class GetAccessKeyLastUsedIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ips")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Ips> ips;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private GetAccessKeyLastUsedIpsResponseBody(Builder builder) {
        this.ips = builder.ips;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedIpsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ips
     */
    public java.util.List<Ips> getIps() {
        return this.ips;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Ips> ips; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAccessKeyLastUsedIpsResponseBody model) {
            this.ips = model.ips;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IP addresses.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ips(java.util.List<Ips> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedIpsResponseBody build() {
            return new GetAccessKeyLastUsedIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessKeyLastUsedIpsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessKeyLastUsedIpsResponseBody</p>
     */
    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("UsedTimestamp")
        private Long usedTimestamp;

        private Ips(Builder builder) {
            this.detail = builder.detail;
            this.ip = builder.ip;
            this.source = builder.source;
            this.usedTimestamp = builder.usedTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return usedTimestamp
         */
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

        public static final class Builder {
            private String detail; 
            private String ip; 
            private String source; 
            private Long usedTimestamp; 

            private Builder() {
            } 

            private Builder(Ips model) {
                this.detail = model.detail;
                this.ip = model.ip;
                this.source = model.source;
                this.usedTimestamp = model.usedTimestamp;
            } 

            /**
             * <p>The event details.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
             *   &quot;eventVersion&quot;: 1,
             *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
             *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
             *   &quot;eventType&quot;: &quot;ApiCall&quot;,
             *   &quot;userIdentity&quot;: {
             *     &quot;accountId&quot;: &quot;104758519118****&quot;,
             *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
             *     &quot;type&quot;: &quot;ram-user&quot;,
             *     &quot;userName&quot;: &quot;alice&quot;
             *   },
             *   &quot;serviceName&quot;: &quot;Ecs&quot;,
             *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
             *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
             *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
             *   &quot;isGlobal&quot;: false,
             *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
             *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
             * }</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p><code>10.10.**.**</code></p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The event source.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Internal: other events.</li>
             * <li>ManagementEvent: management events.</li>
             * <li>DataEvent: data events.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManagementEvent</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The timestamp when the IP address was used. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1657247532000</p>
             */
            public Builder usedTimestamp(Long usedTimestamp) {
                this.usedTimestamp = usedTimestamp;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
}
