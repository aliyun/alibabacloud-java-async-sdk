// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeQpsDataResponseBody</p>
 */
public class DescribeDomainRealTimeQpsDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainRealTimeQpsDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealTimeQpsDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data entries returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainRealTimeQpsDataResponseBody build() {
            return new DescribeDomainRealTimeQpsDataResponseBody(this);
        } 

    } 

    public static class QpsModel extends TeaModel {
        @NameInMap("Qps")
        private Float qps;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private QpsModel(Builder builder) {
            this.qps = builder.qps;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QpsModel create() {
            return builder().build();
        }

        /**
         * @return qps
         */
        public Float getQps() {
            return this.qps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Float qps; 
            private String timeStamp; 

            /**
             * The number of queries per second.
             */
            public Builder qps(Float qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The timestamp of the data returned. The time follows the yyyy-MM-ddTHH:mm:ssZ format in the ISO 8601 standard and is in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public QpsModel build() {
                return new QpsModel(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("QpsModel")
        private java.util.List < QpsModel> qpsModel;

        private Data(Builder builder) {
            this.qpsModel = builder.qpsModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return qpsModel
         */
        public java.util.List < QpsModel> getQpsModel() {
            return this.qpsModel;
        }

        public static final class Builder {
            private java.util.List < QpsModel> qpsModel; 

            /**
             * QpsModel.
             */
            public Builder qpsModel(java.util.List < QpsModel> qpsModel) {
                this.qpsModel = qpsModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
