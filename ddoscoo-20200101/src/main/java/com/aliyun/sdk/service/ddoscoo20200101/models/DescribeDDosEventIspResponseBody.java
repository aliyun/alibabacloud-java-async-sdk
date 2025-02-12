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
 * {@link DescribeDDosEventIspResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventIspResponseBody</p>
 */
public class DescribeDDosEventIspResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Isps")
    private java.util.List<Isps> isps;

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
    public java.util.List<Isps> getIsps() {
        return this.isps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Isps> isps; 
        private String requestId; 

        /**
         * <p>The ISPs for the volumetric attack.</p>
         */
        public Builder isps(java.util.List<Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C4A3BCD1-4A32-4342-941A-4745AE69508C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventIspResponseBody build() {
            return new DescribeDDosEventIspResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDosEventIspResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDosEventIspResponseBody</p>
     */
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
             * <p>The number of request packets that were sent from the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>230</p>
             */
            public Builder inPkts(Long inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            /**
             * <p>The code of the ISP. Valid values:</p>
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
             * <p>1000323</p>
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
