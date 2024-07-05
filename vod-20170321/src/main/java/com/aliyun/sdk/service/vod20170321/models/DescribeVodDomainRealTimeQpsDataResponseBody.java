// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainRealTimeQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainRealTimeQpsDataResponseBody</p>
 */
public class DescribeVodDomainRealTimeQpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainRealTimeQpsDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainRealTimeQpsDataResponseBody create() {
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
         * The returned data.
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

        public DescribeVodDomainRealTimeQpsDataResponseBody build() {
            return new DescribeVodDomainRealTimeQpsDataResponseBody(this);
        } 

    } 

    public static class QpsModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Qps")
        private Float qps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * The timestamp of the returned data. The time follows the ISO 8601 standard. The time is displayed in UTC.
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
        @com.aliyun.core.annotation.NameInMap("QpsModel")
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
