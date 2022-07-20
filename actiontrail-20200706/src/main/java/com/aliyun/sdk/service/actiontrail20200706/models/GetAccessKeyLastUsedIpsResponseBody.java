// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedIpsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedIpsResponseBody</p>
 */
public class GetAccessKeyLastUsedIpsResponseBody extends TeaModel {
    @NameInMap("Ips")
    @Validation(required = true)
    private java.util.List < Ips> ips;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
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

    /**
     * @return ips
     */
    public java.util.List < Ips> getIps() {
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
        private java.util.List < Ips> ips; 
        private String nextToken; 
        private String requestId; 

        /**
         * Ips.
         */
        public Builder ips(java.util.List < Ips> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedIpsResponseBody build() {
            return new GetAccessKeyLastUsedIpsResponseBody(this);
        } 

    } 

    public static class Ips extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Source")
        private String source;

        @NameInMap("UsedTimestamp")
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

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * UsedTimestamp.
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
