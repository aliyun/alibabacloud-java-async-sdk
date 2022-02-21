// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopClientIpVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopClientIpVisitResponseBody</p>
 */
public class DescribeDomainTopClientIpVisitResponseBody extends TeaModel {
    @NameInMap("ClientIpList")
    private java.util.List < ClientIpList> clientIpList;

    @NameInMap("RequestId")
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
         * ClientIpList.
         */
        public Builder clientIpList(java.util.List < ClientIpList> clientIpList) {
            this.clientIpList = clientIpList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Acc")
        private Long acc;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("Rank")
        private Integer rank;

        @NameInMap("Traffic")
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
             * Acc.
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * Rank.
             */
            public Builder rank(Integer rank) {
                this.rank = rank;
                return this;
            }

            /**
             * Traffic.
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
