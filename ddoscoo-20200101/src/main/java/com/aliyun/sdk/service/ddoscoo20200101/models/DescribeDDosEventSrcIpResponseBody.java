// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventSrcIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventSrcIpResponseBody</p>
 */
public class DescribeDDosEventSrcIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ips")
    private java.util.List < Ips> ips;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDDosEventSrcIpResponseBody(Builder builder) {
        this.ips = builder.ips;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventSrcIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return ips
     */
    public java.util.List < Ips> getIps() {
        return this.ips;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Ips> ips; 
        private String requestId; 

        /**
         * An array that consists of information about the source IP address of the volumetric attack.
         */
        public Builder ips(java.util.List < Ips> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventSrcIpResponseBody build() {
            return new DescribeDDosEventSrcIpResponseBody(this);
        } 

    } 

    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaId")
        private String areaId;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        private Ips(Builder builder) {
            this.areaId = builder.areaId;
            this.isp = builder.isp;
            this.srcIp = builder.srcIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return areaId
         */
        public String getAreaId() {
            return this.areaId;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        public static final class Builder {
            private String areaId; 
            private String isp; 
            private String srcIp; 

            /**
             * The code or ID of the source region. For more information, see [Codes of administrative regions in China and codes of countries and areas](~~167926~~). For example, **110000** indicates Beijing, China, and **us** indicates the United States.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * The Internet service provider (ISP) for the volumetric attack. Valid values:
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

            /**
             * The source IP address of the volumetric attack.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
}
