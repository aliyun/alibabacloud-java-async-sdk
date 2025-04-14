// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDDosEventSrcIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventSrcIpResponseBody</p>
 */
public class DescribeDDosEventSrcIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ips")
    private java.util.List<Ips> ips;

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Ips> ips; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDDosEventSrcIpResponseBody model) {
            this.ips = model.ips;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of information about the source IP address of the volumetric attack.</p>
         */
        public Builder ips(java.util.List<Ips> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>38A0224E-FDBC-4733-A362-B391827FC1E9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventSrcIpResponseBody build() {
            return new DescribeDDosEventSrcIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDosEventSrcIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDosEventSrcIpResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Ips model) {
                this.areaId = model.areaId;
                this.isp = model.isp;
                this.srcIp = model.srcIp;
            } 

            /**
             * <p>The code or ID of the source region. For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Codes of administrative regions in China and codes of countries and areas</a>. For example, <strong>110000</strong> indicates Beijing, China, and <strong>us</strong> indicates the United States.</p>
             * 
             * <strong>example:</strong>
             * <p>110000</p>
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) for the volumetric attack. Valid values:</p>
             * <ul>
             * <li><strong>100017</strong>: China Telecom</li>
             * <li><strong>100026</strong>: China Unicom</li>
             * <li><strong>100025</strong>: China Mobile</li>
             * <li><strong>100027</strong>: China Education and Research Network</li>
             * <li><strong>100020</strong>: China Mobile Tietong</li>
             * <li><strong>1000143</strong>: Dr.Peng Telecom &amp; Media Group</li>
             * <li><strong>100080</strong>: Beijing Gehua CATV Network</li>
             * <li><strong>1000139</strong>: National Radio and Television Administration</li>
             * <li><strong>100023</strong>: Oriental Cable Network</li>
             * <li><strong>100063</strong>: Founder Broadband</li>
             * <li><strong>1000337</strong>: China Internet Exchange</li>
             * <li><strong>100021</strong>: 21Vianet Group</li>
             * <li><strong>1000333</strong>: Wasu Media Holding</li>
             * <li><strong>100093</strong>: Wangsu Science &amp; Technology</li>
             * <li><strong>1000401</strong>: Tencent</li>
             * <li><strong>100099</strong>: Baidu</li>
             * <li><strong>1000323</strong>: Alibaba Cloud</li>
             * <li><strong>100098</strong>: Alibaba</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100026</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The source IP address of the volumetric attack.</p>
             * 
             * <strong>example:</strong>
             * <p>218.<em><strong>.</strong></em>.24</p>
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
