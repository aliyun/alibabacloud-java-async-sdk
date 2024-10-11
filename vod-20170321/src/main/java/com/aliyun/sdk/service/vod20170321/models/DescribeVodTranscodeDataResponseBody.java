// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The interval at which the data was queried. Valid values:</p>
         * <ul>
         * <li><strong>hour</strong></li>
         * <li><strong>day</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-****-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The transcoding statistics returned.</p>
         */
        public Builder transcodeData(TranscodeData transcodeData) {
            this.transcodeData = transcodeData;
            return this;
        }

        public DescribeVodTranscodeDataResponseBody build() {
            return new DescribeVodTranscodeDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodTranscodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTranscodeDataResponseBody</p>
     */
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
             * <p>The transcoding specification. Valid values:</p>
             * <ul>
             * <li><strong>Audio</strong>: audio transcoding</li>
             * <li><strong>Segmentation</strong>: container format conversion</li>
             * <li><strong>H264.LD, H264.SD, H264.HD, H264.2K, H264.4K, and more</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>H264.SD</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The transcoding duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
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
    /**
     * 
     * {@link DescribeVodTranscodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTranscodeDataResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeVodTranscodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTranscodeDataResponseBody</p>
     */
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
             * <p>The statistics on transcoding of different specifications.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-01T16:00:00Z</p>
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
    /**
     * 
     * {@link DescribeVodTranscodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTranscodeDataResponseBody</p>
     */
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
