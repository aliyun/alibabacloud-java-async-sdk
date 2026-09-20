// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link DescribeNetworkLayerInterceptsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkLayerInterceptsResponseBody</p>
 */
public class DescribeNetworkLayerInterceptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InterceptionRecordCount")
    private Long interceptionRecordCount;

    @com.aliyun.core.annotation.NameInMap("InterceptionRecords")
    private java.util.List<InterceptionRecords> interceptionRecords;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCnt")
    private String totalCnt;

    private DescribeNetworkLayerInterceptsResponseBody(Builder builder) {
        this.interceptionRecordCount = builder.interceptionRecordCount;
        this.interceptionRecords = builder.interceptionRecords;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkLayerInterceptsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return interceptionRecordCount
     */
    public Long getInterceptionRecordCount() {
        return this.interceptionRecordCount;
    }

    /**
     * @return interceptionRecords
     */
    public java.util.List<InterceptionRecords> getInterceptionRecords() {
        return this.interceptionRecords;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCnt
     */
    public String getTotalCnt() {
        return this.totalCnt;
    }

    public static final class Builder {
        private Long interceptionRecordCount; 
        private java.util.List<InterceptionRecords> interceptionRecords; 
        private String requestId; 
        private String totalCnt; 

        private Builder() {
        } 

        private Builder(DescribeNetworkLayerInterceptsResponseBody model) {
            this.interceptionRecordCount = model.interceptionRecordCount;
            this.interceptionRecords = model.interceptionRecords;
            this.requestId = model.requestId;
            this.totalCnt = model.totalCnt;
        } 

        /**
         * <p>The number of interception log records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder interceptionRecordCount(Long interceptionRecordCount) {
            this.interceptionRecordCount = interceptionRecordCount;
            return this;
        }

        /**
         * <p>The interception record details.</p>
         */
        public Builder interceptionRecords(java.util.List<InterceptionRecords> interceptionRecords) {
            this.interceptionRecords = interceptionRecords;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of interception log entries that match the current filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        public Builder totalCnt(String totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        public DescribeNetworkLayerInterceptsResponseBody build() {
            return new DescribeNetworkLayerInterceptsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkLayerInterceptsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkLayerInterceptsResponseBody</p>
     */
    public static class InterceptionRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationIp")
        private String destinationIp;

        @com.aliyun.core.annotation.NameInMap("DestinationPort")
        private String destinationPort;

        @com.aliyun.core.annotation.NameInMap("InterceptAction")
        private String interceptAction;

        @com.aliyun.core.annotation.NameInMap("InterceptCount")
        private Long interceptCount;

        @com.aliyun.core.annotation.NameInMap("InterceptEndTime")
        private Long interceptEndTime;

        @com.aliyun.core.annotation.NameInMap("InterceptModule")
        private String interceptModule;

        @com.aliyun.core.annotation.NameInMap("InterceptStartTime")
        private Long interceptStartTime;

        @com.aliyun.core.annotation.NameInMap("NetworkProtocol")
        private String networkProtocol;

        @com.aliyun.core.annotation.NameInMap("ProtocolNumber")
        private String protocolNumber;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private String sourcePort;

        private InterceptionRecords(Builder builder) {
            this.destinationIp = builder.destinationIp;
            this.destinationPort = builder.destinationPort;
            this.interceptAction = builder.interceptAction;
            this.interceptCount = builder.interceptCount;
            this.interceptEndTime = builder.interceptEndTime;
            this.interceptModule = builder.interceptModule;
            this.interceptStartTime = builder.interceptStartTime;
            this.networkProtocol = builder.networkProtocol;
            this.protocolNumber = builder.protocolNumber;
            this.sourceIp = builder.sourceIp;
            this.sourcePort = builder.sourcePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterceptionRecords create() {
            return builder().build();
        }

        /**
         * @return destinationIp
         */
        public String getDestinationIp() {
            return this.destinationIp;
        }

        /**
         * @return destinationPort
         */
        public String getDestinationPort() {
            return this.destinationPort;
        }

        /**
         * @return interceptAction
         */
        public String getInterceptAction() {
            return this.interceptAction;
        }

        /**
         * @return interceptCount
         */
        public Long getInterceptCount() {
            return this.interceptCount;
        }

        /**
         * @return interceptEndTime
         */
        public Long getInterceptEndTime() {
            return this.interceptEndTime;
        }

        /**
         * @return interceptModule
         */
        public String getInterceptModule() {
            return this.interceptModule;
        }

        /**
         * @return interceptStartTime
         */
        public Long getInterceptStartTime() {
            return this.interceptStartTime;
        }

        /**
         * @return networkProtocol
         */
        public String getNetworkProtocol() {
            return this.networkProtocol;
        }

        /**
         * @return protocolNumber
         */
        public String getProtocolNumber() {
            return this.protocolNumber;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return sourcePort
         */
        public String getSourcePort() {
            return this.sourcePort;
        }

        public static final class Builder {
            private String destinationIp; 
            private String destinationPort; 
            private String interceptAction; 
            private Long interceptCount; 
            private Long interceptEndTime; 
            private String interceptModule; 
            private Long interceptStartTime; 
            private String networkProtocol; 
            private String protocolNumber; 
            private String sourceIp; 
            private String sourcePort; 

            private Builder() {
            } 

            private Builder(InterceptionRecords model) {
                this.destinationIp = model.destinationIp;
                this.destinationPort = model.destinationPort;
                this.interceptAction = model.interceptAction;
                this.interceptCount = model.interceptCount;
                this.interceptEndTime = model.interceptEndTime;
                this.interceptModule = model.interceptModule;
                this.interceptStartTime = model.interceptStartTime;
                this.networkProtocol = model.networkProtocol;
                this.protocolNumber = model.protocolNumber;
                this.sourceIp = model.sourceIp;
                this.sourcePort = model.sourcePort;
            } 

            /**
             * <p>The destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.254.56.252</p>
             */
            public Builder destinationIp(String destinationIp) {
                this.destinationIp = destinationIp;
                return this;
            }

            /**
             * <p>The destination port in the interception log.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder destinationPort(String destinationPort) {
                this.destinationPort = destinationPort;
                return this;
            }

            /**
             * <p>The interception action.</p>
             * 
             * <strong>example:</strong>
             * <p>drop</p>
             */
            public Builder interceptAction(String interceptAction) {
                this.interceptAction = interceptAction;
                return this;
            }

            /**
             * <p>The number of interceptions within the specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interceptCount(Long interceptCount) {
                this.interceptCount = interceptCount;
                return this;
            }

            /**
             * <p>The interception end time.</p>
             * <blockquote>
             * <p>The value is a Unix/POSIX timestamp. Unit: seconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1778830500</p>
             */
            public Builder interceptEndTime(Long interceptEndTime) {
                this.interceptEndTime = interceptEndTime;
                return this;
            }

            /**
             * <p>The packet interception module.</p>
             * 
             * <strong>example:</strong>
             * <p>dip_blacklist</p>
             */
            public Builder interceptModule(String interceptModule) {
                this.interceptModule = interceptModule;
                return this;
            }

            /**
             * <p>The interception start time.</p>
             * <blockquote>
             * <p>The value is a Unix/POSIX timestamp. Unit: seconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1778830500</p>
             */
            public Builder interceptStartTime(Long interceptStartTime) {
                this.interceptStartTime = interceptStartTime;
                return this;
            }

            /**
             * <p>The network protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder networkProtocol(String networkProtocol) {
                this.networkProtocol = networkProtocol;
                return this;
            }

            /**
             * <p>The network protocol number. This is a standard network protocol number.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder protocolNumber(String protocolNumber) {
                this.protocolNumber = protocolNumber;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>183.224.38.37</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * <p>The source port in the interception log.</p>
             * 
             * <strong>example:</strong>
             * <p>9998</p>
             */
            public Builder sourcePort(String sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            public InterceptionRecords build() {
                return new InterceptionRecords(this);
            } 

        } 

    }
}
