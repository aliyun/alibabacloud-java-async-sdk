// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsTrendTopicInputTpsResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTrendTopicInputTpsResponseBody</p>
 */
public class OnsTrendTopicInputTpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OnsTrendTopicInputTpsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTrendTopicInputTpsResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E213AD8A-0730-4B3D-A35A-340DA47D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTrendTopicInputTpsResponseBody build() {
            return new OnsTrendTopicInputTpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsTrendTopicInputTpsResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTrendTopicInputTpsResponseBody</p>
     */
    public static class StatsDataDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        private StatsDataDo(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatsDataDo create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Float y; 

            /**
             * <p>The X axis. The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1570852800000</p>
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y axis. This parameter indicates the TPS for message publishing or the number of messages that are published.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public StatsDataDo build() {
                return new StatsDataDo(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsTrendTopicInputTpsResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTrendTopicInputTpsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatsDataDo")
        private java.util.List < StatsDataDo> statsDataDo;

        private Records(Builder builder) {
            this.statsDataDo = builder.statsDataDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return statsDataDo
         */
        public java.util.List < StatsDataDo> getStatsDataDo() {
            return this.statsDataDo;
        }

        public static final class Builder {
            private java.util.List < StatsDataDo> statsDataDo; 

            /**
             * StatsDataDo.
             */
            public Builder statsDataDo(java.util.List < StatsDataDo> statsDataDo) {
                this.statsDataDo = statsDataDo;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsTrendTopicInputTpsResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTrendTopicInputTpsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Records")
        private Records records;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("XUnit")
        private String xUnit;

        @com.aliyun.core.annotation.NameInMap("YUnit")
        private String yUnit;

        private Data(Builder builder) {
            this.records = builder.records;
            this.title = builder.title;
            this.xUnit = builder.xUnit;
            this.yUnit = builder.yUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return records
         */
        public Records getRecords() {
            return this.records;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return xUnit
         */
        public String getXUnit() {
            return this.xUnit;
        }

        /**
         * @return yUnit
         */
        public String getYUnit() {
            return this.yUnit;
        }

        public static final class Builder {
            private Records records; 
            private String title; 
            private String xUnit; 
            private String yUnit; 

            /**
             * <p>The data set returned based on sampling period.</p>
             */
            public Builder records(Records records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_111111111111_DOxxxxxx%test trend of received messages</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The unit of the timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>time</p>
             */
            public Builder xUnit(String xUnit) {
                this.xUnit = xUnit;
                return this;
            }

            /**
             * <p>The unit of the Y axis.</p>
             * 
             * <strong>example:</strong>
             * <p>msg</p>
             */
            public Builder yUnit(String yUnit) {
                this.yUnit = yUnit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
