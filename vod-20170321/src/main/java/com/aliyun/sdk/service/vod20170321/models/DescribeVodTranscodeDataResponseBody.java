// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodTranscodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodTranscodeDataResponseBody</p>
 */
public class DescribeVodTranscodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeData")
    private TranscodeData transcodeData;

    private DescribeVodTranscodeDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.requestId = builder.requestId;
        this.transcodeData = builder.transcodeData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodTranscodeDataResponseBody create() {
        return builder().build();
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

    /**
     * @return transcodeData
     */
    public TranscodeData getTranscodeData() {
        return this.transcodeData;
    }

    public static final class Builder {
        private String dataInterval; 
        private String requestId; 
        private TranscodeData transcodeData; 

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

        /**
         * TranscodeData.
         */
        public Builder transcodeData(TranscodeData transcodeData) {
            this.transcodeData = transcodeData;
            return this;
        }

        public DescribeVodTranscodeDataResponseBody build() {
            return new DescribeVodTranscodeDataResponseBody(this);
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
    public static class TranscodeDataItem extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private TranscodeDataItem(Builder builder) {
            this.data = builder.data;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeDataItem create() {
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

            public TranscodeDataItem build() {
                return new TranscodeDataItem(this);
            } 

        } 

    }
    public static class TranscodeData extends TeaModel {
        @NameInMap("TranscodeDataItem")
        private java.util.List < TranscodeDataItem> transcodeDataItem;

        private TranscodeData(Builder builder) {
            this.transcodeDataItem = builder.transcodeDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeData create() {
            return builder().build();
        }

        /**
         * @return transcodeDataItem
         */
        public java.util.List < TranscodeDataItem> getTranscodeDataItem() {
            return this.transcodeDataItem;
        }

        public static final class Builder {
            private java.util.List < TranscodeDataItem> transcodeDataItem; 

            /**
             * TranscodeDataItem.
             */
            public Builder transcodeDataItem(java.util.List < TranscodeDataItem> transcodeDataItem) {
                this.transcodeDataItem = transcodeDataItem;
                return this;
            }

            public TranscodeData build() {
                return new TranscodeData(this);
            } 

        } 

    }
}
