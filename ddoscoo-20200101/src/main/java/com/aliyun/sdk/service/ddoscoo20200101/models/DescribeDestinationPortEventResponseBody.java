// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDestinationPortEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDestinationPortEventResponseBody</p>
 */
public class DescribeDestinationPortEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortList")
    private java.util.List < PortList> portList;

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
    public java.util.List < PortList> getPortList() {
        return this.portList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PortList> portList; 
        private String requestId; 

        /**
         * PortList.
         */
        public Builder portList(java.util.List < PortList> portList) {
            this.portList = portList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDestinationPortEventResponseBody build() {
            return new DescribeDestinationPortEventResponseBody(this);
        } 

    } 

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
             * DstPort.
             */
            public Builder dstPort(String dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * InPkts.
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
