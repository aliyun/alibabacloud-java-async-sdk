// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetStatisticsByVhostResponseBody} extends {@link TeaModel}
 *
 * <p>GetStatisticsByVhostResponseBody</p>
 */
public class GetStatisticsByVhostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStatisticsByVhostResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStatisticsByVhostResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStatisticsByVhostResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStatisticsByVhostResponseBody build() {
            return new GetStatisticsByVhostResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStatisticsByVhostResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatisticsByVhostResponseBody</p>
     */
    public static class ChannelStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AckQps")
        private Float ackQps;

        @com.aliyun.core.annotation.NameInMap("ConfirmQps")
        private Float confirmQps;

        @com.aliyun.core.annotation.NameInMap("DeliverQps")
        private Float deliverQps;

        @com.aliyun.core.annotation.NameInMap("GetQps")
        private Float getQps;

        @com.aliyun.core.annotation.NameInMap("Prefetch")
        private Integer prefetch;

        @com.aliyun.core.annotation.NameInMap("PublishQps")
        private Float publishQps;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("Unacked")
        private Integer unacked;

        @com.aliyun.core.annotation.NameInMap("Unconfirmed")
        private Integer unconfirmed;

        private ChannelStatistics(Builder builder) {
            this.ackQps = builder.ackQps;
            this.confirmQps = builder.confirmQps;
            this.deliverQps = builder.deliverQps;
            this.getQps = builder.getQps;
            this.prefetch = builder.prefetch;
            this.publishQps = builder.publishQps;
            this.state = builder.state;
            this.unacked = builder.unacked;
            this.unconfirmed = builder.unconfirmed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelStatistics create() {
            return builder().build();
        }

        /**
         * @return ackQps
         */
        public Float getAckQps() {
            return this.ackQps;
        }

        /**
         * @return confirmQps
         */
        public Float getConfirmQps() {
            return this.confirmQps;
        }

        /**
         * @return deliverQps
         */
        public Float getDeliverQps() {
            return this.deliverQps;
        }

        /**
         * @return getQps
         */
        public Float getGetQps() {
            return this.getQps;
        }

        /**
         * @return prefetch
         */
        public Integer getPrefetch() {
            return this.prefetch;
        }

        /**
         * @return publishQps
         */
        public Float getPublishQps() {
            return this.publishQps;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return unacked
         */
        public Integer getUnacked() {
            return this.unacked;
        }

        /**
         * @return unconfirmed
         */
        public Integer getUnconfirmed() {
            return this.unconfirmed;
        }

        public static final class Builder {
            private Float ackQps; 
            private Float confirmQps; 
            private Float deliverQps; 
            private Float getQps; 
            private Integer prefetch; 
            private Float publishQps; 
            private Integer state; 
            private Integer unacked; 
            private Integer unconfirmed; 

            private Builder() {
            } 

            private Builder(ChannelStatistics model) {
                this.ackQps = model.ackQps;
                this.confirmQps = model.confirmQps;
                this.deliverQps = model.deliverQps;
                this.getQps = model.getQps;
                this.prefetch = model.prefetch;
                this.publishQps = model.publishQps;
                this.state = model.state;
                this.unacked = model.unacked;
                this.unconfirmed = model.unconfirmed;
            } 

            /**
             * AckQps.
             */
            public Builder ackQps(Float ackQps) {
                this.ackQps = ackQps;
                return this;
            }

            /**
             * ConfirmQps.
             */
            public Builder confirmQps(Float confirmQps) {
                this.confirmQps = confirmQps;
                return this;
            }

            /**
             * DeliverQps.
             */
            public Builder deliverQps(Float deliverQps) {
                this.deliverQps = deliverQps;
                return this;
            }

            /**
             * GetQps.
             */
            public Builder getQps(Float getQps) {
                this.getQps = getQps;
                return this;
            }

            /**
             * Prefetch.
             */
            public Builder prefetch(Integer prefetch) {
                this.prefetch = prefetch;
                return this;
            }

            /**
             * PublishQps.
             */
            public Builder publishQps(Float publishQps) {
                this.publishQps = publishQps;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * Unacked.
             */
            public Builder unacked(Integer unacked) {
                this.unacked = unacked;
                return this;
            }

            /**
             * Unconfirmed.
             */
            public Builder unconfirmed(Integer unconfirmed) {
                this.unconfirmed = unconfirmed;
                return this;
            }

            public ChannelStatistics build() {
                return new ChannelStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStatisticsByVhostResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatisticsByVhostResponseBody</p>
     */
    public static class ChannelStatisticsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelStatistics")
        private java.util.List<ChannelStatistics> channelStatistics;

        private ChannelStatisticsList(Builder builder) {
            this.channelStatistics = builder.channelStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelStatisticsList create() {
            return builder().build();
        }

        /**
         * @return channelStatistics
         */
        public java.util.List<ChannelStatistics> getChannelStatistics() {
            return this.channelStatistics;
        }

        public static final class Builder {
            private java.util.List<ChannelStatistics> channelStatistics; 

            private Builder() {
            } 

            private Builder(ChannelStatisticsList model) {
                this.channelStatistics = model.channelStatistics;
            } 

            /**
             * ChannelStatistics.
             */
            public Builder channelStatistics(java.util.List<ChannelStatistics> channelStatistics) {
                this.channelStatistics = channelStatistics;
                return this;
            }

            public ChannelStatisticsList build() {
                return new ChannelStatisticsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStatisticsByVhostResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatisticsByVhostResponseBody</p>
     */
    public static class ConnectionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("ChannelNum")
        private Integer channelNum;

        @com.aliyun.core.annotation.NameInMap("ChannelStatisticsList")
        private ChannelStatisticsList channelStatisticsList;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("DeliverQps")
        private Float deliverQps;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("PublishQps")
        private Float publishQps;

        @com.aliyun.core.annotation.NameInMap("RemoteAddress")
        private String remoteAddress;

        @com.aliyun.core.annotation.NameInMap("SecurityTransport")
        private Boolean securityTransport;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        private ConnectionStatistics(Builder builder) {
            this.accessKey = builder.accessKey;
            this.channelNum = builder.channelNum;
            this.channelStatisticsList = builder.channelStatisticsList;
            this.connectionName = builder.connectionName;
            this.deliverQps = builder.deliverQps;
            this.protocol = builder.protocol;
            this.publishQps = builder.publishQps;
            this.remoteAddress = builder.remoteAddress;
            this.securityTransport = builder.securityTransport;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionStatistics create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return channelNum
         */
        public Integer getChannelNum() {
            return this.channelNum;
        }

        /**
         * @return channelStatisticsList
         */
        public ChannelStatisticsList getChannelStatisticsList() {
            return this.channelStatisticsList;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return deliverQps
         */
        public Float getDeliverQps() {
            return this.deliverQps;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return publishQps
         */
        public Float getPublishQps() {
            return this.publishQps;
        }

        /**
         * @return remoteAddress
         */
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        /**
         * @return securityTransport
         */
        public Boolean getSecurityTransport() {
            return this.securityTransport;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        public static final class Builder {
            private String accessKey; 
            private Integer channelNum; 
            private ChannelStatisticsList channelStatisticsList; 
            private String connectionName; 
            private Float deliverQps; 
            private String protocol; 
            private Float publishQps; 
            private String remoteAddress; 
            private Boolean securityTransport; 
            private Integer state; 

            private Builder() {
            } 

            private Builder(ConnectionStatistics model) {
                this.accessKey = model.accessKey;
                this.channelNum = model.channelNum;
                this.channelStatisticsList = model.channelStatisticsList;
                this.connectionName = model.connectionName;
                this.deliverQps = model.deliverQps;
                this.protocol = model.protocol;
                this.publishQps = model.publishQps;
                this.remoteAddress = model.remoteAddress;
                this.securityTransport = model.securityTransport;
                this.state = model.state;
            } 

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * ChannelNum.
             */
            public Builder channelNum(Integer channelNum) {
                this.channelNum = channelNum;
                return this;
            }

            /**
             * ChannelStatisticsList.
             */
            public Builder channelStatisticsList(ChannelStatisticsList channelStatisticsList) {
                this.channelStatisticsList = channelStatisticsList;
                return this;
            }

            /**
             * ConnectionName.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * DeliverQps.
             */
            public Builder deliverQps(Float deliverQps) {
                this.deliverQps = deliverQps;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * PublishQps.
             */
            public Builder publishQps(Float publishQps) {
                this.publishQps = publishQps;
                return this;
            }

            /**
             * RemoteAddress.
             */
            public Builder remoteAddress(String remoteAddress) {
                this.remoteAddress = remoteAddress;
                return this;
            }

            /**
             * SecurityTransport.
             */
            public Builder securityTransport(Boolean securityTransport) {
                this.securityTransport = securityTransport;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            public ConnectionStatistics build() {
                return new ConnectionStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStatisticsByVhostResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatisticsByVhostResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatistics")
        private java.util.List<ConnectionStatistics> connectionStatistics;

        private Data(Builder builder) {
            this.connectionStatistics = builder.connectionStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectionStatistics
         */
        public java.util.List<ConnectionStatistics> getConnectionStatistics() {
            return this.connectionStatistics;
        }

        public static final class Builder {
            private java.util.List<ConnectionStatistics> connectionStatistics; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connectionStatistics = model.connectionStatistics;
            } 

            /**
             * ConnectionStatistics.
             */
            public Builder connectionStatistics(java.util.List<ConnectionStatistics> connectionStatistics) {
                this.connectionStatistics = connectionStatistics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
