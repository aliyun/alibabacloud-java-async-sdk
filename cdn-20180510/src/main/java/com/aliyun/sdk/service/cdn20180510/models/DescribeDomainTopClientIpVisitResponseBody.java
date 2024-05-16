// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * A list of client IP addresses.
         */
        public Builder clientIpList(java.util.List < ClientIpList> clientIpList) {
            this.clientIpList = clientIpList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopClientIpVisitResponseBody build() {
            return new DescribeDomainTopClientIpVisitResponseBody(this);
        } 

    } 

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
             * The total number of requests.
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * The client IP address returned. Only IPv4 addressed are supported.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The ranking of the client IP address returned.
             */
            public Builder rank(Integer rank) {
                this.rank = rank;
                return this;
            }

            /**
             * The total amount of network traffic consumed. Unit: bytes.
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
