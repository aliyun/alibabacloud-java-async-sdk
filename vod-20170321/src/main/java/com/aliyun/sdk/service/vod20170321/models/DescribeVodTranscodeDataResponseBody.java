// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodTranscodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodTranscodeDataResponseBody</p>
 */
public class DescribeVodTranscodeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeData")
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
         * The interval at which the data was queried. Valid values:
         * <p>
         * 
         * *   **hour**
         * *   **day**
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The transcoding statistics returned.
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
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The transcoding specification. Valid values:
             * <p>
             * 
             * *   **Audio**: audio transcoding
             * *   **Segmentation**: container format conversion
             * *   **H264.LD, H264.SD, H264.HD, H264.2K, H264.4K, and more**
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The transcoding duration. Unit: seconds.
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
        @com.aliyun.core.annotation.NameInMap("DataItem")
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
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * The statistics on transcoding of different specifications.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * The timestamp of the returned data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
        @com.aliyun.core.annotation.NameInMap("TranscodeDataItem")
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
