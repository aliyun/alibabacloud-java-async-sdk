// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventSrcIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventSrcIpResponseBody</p>
 */
public class DescribeDDosEventSrcIpResponseBody extends TeaModel {
    @NameInMap("Ips")
    private java.util.List < Ips> ips;

    @NameInMap("RequestId")
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
         * Ips.
         */
        public Builder ips(java.util.List < Ips> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AreaId")
        private String areaId;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("SrcIp")
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
             * AreaId.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * SrcIp.
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
