// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodAIDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodAIDataResponseBody</p>
 */
public class DescribeVodAIDataResponseBody extends TeaModel {
    @NameInMap("AIData")
    private AIData AIData;

    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVodAIDataResponseBody(Builder builder) {
        this.AIData = builder.AIData;
        this.dataInterval = builder.dataInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodAIDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIData
     */
    public AIData getAIData() {
        return this.AIData;
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIData AIData; 
        private String dataInterval; 
        private String requestId; 

        /**
         * AIData.
         */
        public Builder AIData(AIData AIData) {
            this.AIData = AIData;
            return this;
        }

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodAIDataResponseBody build() {
            return new DescribeVodAIDataResponseBody(this);
        } 

    } 

    public static class DataItem extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private DataItem(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataItem create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataItem build() {
                return new DataItem(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataItem")
        private java.util.List < DataItem> dataItem;

        private Data(Builder builder) {
            this.dataItem = builder.dataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataItem
         */
        public java.util.List < DataItem> getDataItem() {
            return this.dataItem;
        }

        public static final class Builder {
            private java.util.List < DataItem> dataItem; 

            /**
             * DataItem.
             */
            public Builder dataItem(java.util.List < DataItem> dataItem) {
                this.dataItem = dataItem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class AIDataItem extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private AIDataItem(Builder builder) {
            this.data = builder.data;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIDataItem create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Data data; 
            private String timeStamp; 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public AIDataItem build() {
                return new AIDataItem(this);
            } 

        } 

    }
    public static class AIData extends TeaModel {
        @NameInMap("AIDataItem")
        private java.util.List < AIDataItem> AIDataItem;

        private AIData(Builder builder) {
            this.AIDataItem = builder.AIDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIData create() {
            return builder().build();
        }

        /**
         * @return AIDataItem
         */
        public java.util.List < AIDataItem> getAIDataItem() {
            return this.AIDataItem;
        }

        public static final class Builder {
            private java.util.List < AIDataItem> AIDataItem; 

            /**
             * AIDataItem.
             */
            public Builder AIDataItem(java.util.List < AIDataItem> AIDataItem) {
                this.AIDataItem = AIDataItem;
                return this;
            }

            public AIData build() {
                return new AIData(this);
            } 

        } 

    }
}
