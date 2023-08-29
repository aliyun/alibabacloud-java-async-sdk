// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainIpaConnDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainIpaConnDataResponseBody</p>
 */
public class DescribeDcdnDomainIpaConnDataResponseBody extends TeaModel {
    @NameInMap("ConnectionDataPerInterval")
    private ConnectionDataPerInterval connectionDataPerInterval;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainIpaConnDataResponseBody(Builder builder) {
        this.connectionDataPerInterval = builder.connectionDataPerInterval;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainIpaConnDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionDataPerInterval
     */
    public ConnectionDataPerInterval getConnectionDataPerInterval() {
        return this.connectionDataPerInterval;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private ConnectionDataPerInterval connectionDataPerInterval; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        /**
         * The number of user connections at each time interval.
         */
        public Builder connectionDataPerInterval(ConnectionDataPerInterval connectionDataPerInterval) {
            this.connectionDataPerInterval = connectionDataPerInterval;
            return this;
        }

        /**
         * The end of the time range during which data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainIpaConnDataResponseBody build() {
            return new DescribeDcdnDomainIpaConnDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Connections")
        private Long connections;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.connections = builder.connections;
            this.domain = builder.domain;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public Long getConnections() {
            return this.connections;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long connections; 
            private String domain; 
            private String timeStamp; 

            /**
             * The number of IPA user connections.
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The timestamp of the data returned.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class ConnectionDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private ConnectionDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public ConnectionDataPerInterval build() {
                return new ConnectionDataPerInterval(this);
            } 

        } 

    }
}
