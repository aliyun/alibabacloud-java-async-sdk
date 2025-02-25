// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainTopClientIpVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopClientIpVisitResponseBody</p>
 */
public class DescribeDomainTopClientIpVisitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientIpList")
    private java.util.List < ClientIpList> clientIpList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainTopClientIpVisitResponseBody(Builder builder) {
        this.clientIpList = builder.clientIpList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopClientIpVisitResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientIpList
     */
    public java.util.List < ClientIpList> getClientIpList() {
        return this.clientIpList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClientIpList> clientIpList; 
        private String requestId; 

        /**
         * <p>A list of client IP addresses.</p>
         */
        public Builder clientIpList(java.util.List < ClientIpList> clientIpList) {
            this.clientIpList = clientIpList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopClientIpVisitResponseBody build() {
            return new DescribeDomainTopClientIpVisitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTopClientIpVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTopClientIpVisitResponseBody</p>
     */
    public static class ClientIpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Long acc;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Rank")
        private Integer rank;

        @com.aliyun.core.annotation.NameInMap("Traffic")
        private Long traffic;

        private ClientIpList(Builder builder) {
            this.acc = builder.acc;
            this.clientIp = builder.clientIp;
            this.rank = builder.rank;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientIpList create() {
            return builder().build();
        }

        /**
         * @return acc
         */
        public Long getAcc() {
            return this.acc;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return rank
         */
        public Integer getRank() {
            return this.rank;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Long acc; 
            private String clientIp; 
            private Integer rank; 
            private Long traffic; 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * <p>The client IP address returned. Only IPv4 addressed are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.xxx</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The ranking of the client IP address returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rank(Integer rank) {
                this.rank = rank;
                return this;
            }

            /**
             * <p>The total amount of network traffic consumed. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            public ClientIpList build() {
                return new ClientIpList(this);
            } 

        } 

    }
}
