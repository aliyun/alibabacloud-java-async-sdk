// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortCcAttackTopIPResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortCcAttackTopIPResponseBody</p>
 */
public class DescribePortCcAttackTopIPResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TopIp")
    private java.util.List < TopIp> topIp;

    private DescribePortCcAttackTopIPResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topIp = builder.topIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortCcAttackTopIPResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topIp
     */
    public java.util.List < TopIp> getTopIp() {
        return this.topIp;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TopIp> topIp; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TopIp.
         */
        public Builder topIp(java.util.List < TopIp> topIp) {
            this.topIp = topIp;
            return this;
        }

        public DescribePortCcAttackTopIPResponseBody build() {
            return new DescribePortCcAttackTopIPResponseBody(this);
        } 

    } 

    public static class TopIp extends TeaModel {
        @NameInMap("AreaId")
        private String areaId;

        @NameInMap("Pv")
        private Long pv;

        @NameInMap("SrcIp")
        private String srcIp;

        private TopIp(Builder builder) {
            this.areaId = builder.areaId;
            this.pv = builder.pv;
            this.srcIp = builder.srcIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopIp create() {
            return builder().build();
        }

        /**
         * @return areaId
         */
        public String getAreaId() {
            return this.areaId;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        public static final class Builder {
            private String areaId; 
            private Long pv; 
            private String srcIp; 

            /**
             * AreaId.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * Pv.
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * SrcIp.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            public TopIp build() {
                return new TopIp(this);
            } 

        } 

    }
}
