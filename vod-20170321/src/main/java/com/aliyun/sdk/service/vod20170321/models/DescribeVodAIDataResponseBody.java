// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodAIDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodAIDataResponseBody</p>
 */
public class DescribeVodAIDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIData")
    private AIData AIData;

    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVodAIDataResponseBody model) {
            this.AIData = model.AIData;
            this.dataInterval = model.dataInterval;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics on video AI.</p>
         */
        public Builder AIData(AIData AIData) {
            this.AIData = AIData;
            return this;
        }

        /**
         * <p>The time granularity at which the data was queried. Valid values:</p>
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

        public DescribeVodAIDataResponseBody build() {
            return new DescribeVodAIDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodAIDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodAIDataResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DataItem model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The type of video AI. Valid values:</p>
             * <ul>
             * <li><strong>AIVideoCensor</strong>: automated review</li>
             * <li><strong>AIVideoFPShot</strong>: media fingerprinting</li>
             * <li><strong>AIVideoTag</strong>: smart tagging</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AIVideoCensor</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The processing duration. Unit: seconds.</p>
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
     * {@link DescribeVodAIDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodAIDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataItem")
        private java.util.List<DataItem> dataItem;

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
        public java.util.List<DataItem> getDataItem() {
            return this.dataItem;
        }

        public static final class Builder {
            private java.util.List<DataItem> dataItem; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataItem = model.dataItem;
            } 

            /**
             * DataItem.
             */
            public Builder dataItem(java.util.List<DataItem> dataItem) {
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
     * {@link DescribeVodAIDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodAIDataResponseBody</p>
     */
    public static class AIDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(AIDataItem model) {
                this.data = model.data;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The statistics on video AI of each type.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-01T13:00:00Z</p>
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
    /**
     * 
     * {@link DescribeVodAIDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodAIDataResponseBody</p>
     */
    public static class AIData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIDataItem")
        private java.util.List<AIDataItem> AIDataItem;

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
        public java.util.List<AIDataItem> getAIDataItem() {
            return this.AIDataItem;
        }

        public static final class Builder {
            private java.util.List<AIDataItem> AIDataItem; 

            private Builder() {
            } 

            private Builder(AIData model) {
                this.AIDataItem = model.AIDataItem;
            } 

            /**
             * AIDataItem.
             */
            public Builder AIDataItem(java.util.List<AIDataItem> AIDataItem) {
                this.AIDataItem = AIDataItem;
                return this;
            }

            public AIData build() {
                return new AIData(this);
            } 

        } 

    }
}
