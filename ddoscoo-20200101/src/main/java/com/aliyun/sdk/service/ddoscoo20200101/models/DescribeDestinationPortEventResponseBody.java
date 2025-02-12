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
 * {@link DescribeDestinationPortEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDestinationPortEventResponseBody</p>
 */
public class DescribeDestinationPortEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortList")
    private java.util.List<PortList> portList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDestinationPortEventResponseBody(Builder builder) {
        this.portList = builder.portList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDestinationPortEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return portList
     */
    public java.util.List<PortList> getPortList() {
        return this.portList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PortList> portList; 
        private String requestId; 

        /**
         * <p>The ports.</p>
         */
        public Builder portList(java.util.List<PortList> portList) {
            this.portList = portList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E7F6B2C-03F2-462F-9076-B782CF0DD502</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDestinationPortEventResponseBody build() {
            return new DescribeDestinationPortEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDestinationPortEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDestinationPortEventResponseBody</p>
     */
    public static class PortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstPort")
        private String dstPort;

        @com.aliyun.core.annotation.NameInMap("InPkts")
        private Long inPkts;

        private PortList(Builder builder) {
            this.dstPort = builder.dstPort;
            this.inPkts = builder.inPkts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortList create() {
            return builder().build();
        }

        /**
         * @return dstPort
         */
        public String getDstPort() {
            return this.dstPort;
        }

        /**
         * @return inPkts
         */
        public Long getInPkts() {
            return this.inPkts;
        }

        public static final class Builder {
            private String dstPort; 
            private Long inPkts; 

            /**
             * <p>The destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder dstPort(String dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * <p>The number of request packets received by the destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>8760950</p>
             */
            public Builder inPkts(Long inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            public PortList build() {
                return new PortList(this);
            } 

        } 

    }
}
