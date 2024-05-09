// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventIspResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventIspResponseBody</p>
 */
public class DescribeDDosEventIspResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Isps")
    private java.util.List < Isps> isps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDDosEventIspResponseBody(Builder builder) {
        this.isps = builder.isps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventIspResponseBody create() {
        return builder().build();
    }

    /**
     * @return isps
     */
    public java.util.List < Isps> getIsps() {
        return this.isps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Isps> isps; 
        private String requestId; 

        /**
         * An array that consists of the ISPs for the volumetric attack.
         */
        public Builder isps(java.util.List < Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventIspResponseBody build() {
            return new DescribeDDosEventIspResponseBody(this);
        } 

    } 

    public static class Isps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InPkts")
        private Long inPkts;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        private Isps(Builder builder) {
            this.inPkts = builder.inPkts;
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isps create() {
            return builder().build();
        }

        /**
         * @return inPkts
         */
        public Long getInPkts() {
            return this.inPkts;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private Long inPkts; 
            private String isp; 

            /**
             * The number of request packets that were sent from the ISP.
             */
            public Builder inPkts(Long inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            /**
             * The code of the ISP. Valid values:
             * <p>
             * 
             * *   **100017**: China Telecom
             * *   **100026**: China Unicom
             * *   **100025**: China Mobile
             * *   **100027**: China Education and Research Network
             * *   **100020**: China Mobile Tietong
             * *   **1000143**: Dr.Peng Telecom & Media Group
             * *   **100080**: Beijing Gehua CATV Network
             * *   **1000139**: National Radio and Television Administration
             * *   **100023**: Oriental Cable Network
             * *   **100063**: Founder Broadband
             * *   **1000337**: China Internet Exchange
             * *   **100021**: 21Vianet Group
             * *   **1000333**: Wasu Media Holding
             * *   **100093**: Wangsu Science & Technology
             * *   **1000401**: Tencent
             * *   **100099**: Baidu
             * *   **1000323**: Alibaba Cloud
             * *   **100098**: Alibaba
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            public Isps build() {
                return new Isps(this);
            } 

        } 

    }
}
