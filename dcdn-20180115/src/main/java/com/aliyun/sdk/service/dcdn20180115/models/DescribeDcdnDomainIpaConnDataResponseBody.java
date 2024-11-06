// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainIpaConnDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainIpaConnDataResponseBody</p>
 */
public class DescribeDcdnDomainIpaConnDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionDataPerInterval")
    private ConnectionDataPerInterval connectionDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The number of user connections at each time interval.</p>
         */
        public Builder connectionDataPerInterval(ConnectionDataPerInterval connectionDataPerInterval) {
            this.connectionDataPerInterval = connectionDataPerInterval;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-02-22T15:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A2A1EEF8-043E-43A1-807C-BEAC18EA1807</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-02-21T15:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnDomainIpaConnDataResponseBody build() {
            return new DescribeDcdnDomainIpaConnDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainIpaConnDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainIpaConnDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The number of IPA user connections.</p>
             * 
             * <strong>example:</strong>
             * <p>189095</p>
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example1.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-21T15:00:00+08:00</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainIpaConnDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainIpaConnDataResponseBody</p>
     */
    public static class ConnectionDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
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
