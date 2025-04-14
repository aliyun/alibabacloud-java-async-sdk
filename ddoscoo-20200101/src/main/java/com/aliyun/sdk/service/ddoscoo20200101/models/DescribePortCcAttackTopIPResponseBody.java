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
 * {@link DescribePortCcAttackTopIPResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortCcAttackTopIPResponseBody</p>
 */
public class DescribePortCcAttackTopIPResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopIp")
    private java.util.List<TopIp> topIp;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TopIp> getTopIp() {
        return this.topIp;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TopIp> topIp; 

        private Builder() {
        } 

        private Builder(DescribePortCcAttackTopIPResponseBody model) {
            this.requestId = model.requestId;
            this.topIp = model.topIp;
        } 

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24F36D81-5E2D-52E5-9DB6-A3ED23CF271A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The top IP addresses from which most attacks are initiated.</p>
         */
        public Builder topIp(java.util.List<TopIp> topIp) {
            this.topIp = topIp;
            return this;
        }

        public DescribePortCcAttackTopIPResponseBody build() {
            return new DescribePortCcAttackTopIPResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortCcAttackTopIPResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortCcAttackTopIPResponseBody</p>
     */
    public static class TopIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaId")
        private String areaId;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
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

            private Builder() {
            } 

            private Builder(TopIp model) {
                this.areaId = model.areaId;
                this.pv = model.pv;
                this.srcIp = model.srcIp;
            } 

            /**
             * <p>The code of the location from which the attack is initiated. For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Codes of administrative regions in China and codes of countries and areas</a>. For example, <strong>110000</strong> indicates Beijing, China, and <strong>us</strong> indicates the United States.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * <p>The number of attacks from the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>33971</p>
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * <p>The source IP address of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>172.18.XX.XX</p>
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
