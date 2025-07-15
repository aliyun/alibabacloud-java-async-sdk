// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveProducerUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveProducerUsageDataResponseBody</p>
 */
public class DescribeLiveProducerUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillProducerData")
    private BillProducerData billProducerData;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveProducerUsageDataResponseBody(Builder builder) {
        this.billProducerData = builder.billProducerData;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveProducerUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billProducerData
     */
    public BillProducerData getBillProducerData() {
        return this.billProducerData;
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
        private BillProducerData billProducerData; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLiveProducerUsageDataResponseBody model) {
            this.billProducerData = model.billProducerData;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The production studio usage data.</p>
         */
        public Builder billProducerData(BillProducerData billProducerData) {
            this.billProducerData = billProducerData;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range for which the data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-31T15:59:59Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveProducerUsageDataResponseBody build() {
            return new DescribeLiveProducerUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveProducerUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveProducerUsageDataResponseBody</p>
     */
    public static class BillProducerDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("OutputHdDuration")
        private Long outputHdDuration;

        @com.aliyun.core.annotation.NameInMap("OutputLdDuration")
        private Long outputLdDuration;

        @com.aliyun.core.annotation.NameInMap("OutputSdDuration")
        private Long outputSdDuration;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TranHdDuration")
        private Long tranHdDuration;

        @com.aliyun.core.annotation.NameInMap("TranLdDuration")
        private Long tranLdDuration;

        @com.aliyun.core.annotation.NameInMap("TranSdDuration")
        private Long tranSdDuration;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BillProducerDataItem(Builder builder) {
            this.domainName = builder.domainName;
            this.instance = builder.instance;
            this.outputHdDuration = builder.outputHdDuration;
            this.outputLdDuration = builder.outputLdDuration;
            this.outputSdDuration = builder.outputSdDuration;
            this.region = builder.region;
            this.timeStamp = builder.timeStamp;
            this.tranHdDuration = builder.tranHdDuration;
            this.tranLdDuration = builder.tranLdDuration;
            this.tranSdDuration = builder.tranSdDuration;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillProducerDataItem create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return outputHdDuration
         */
        public Long getOutputHdDuration() {
            return this.outputHdDuration;
        }

        /**
         * @return outputLdDuration
         */
        public Long getOutputLdDuration() {
            return this.outputLdDuration;
        }

        /**
         * @return outputSdDuration
         */
        public Long getOutputSdDuration() {
            return this.outputSdDuration;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return tranHdDuration
         */
        public Long getTranHdDuration() {
            return this.tranHdDuration;
        }

        /**
         * @return tranLdDuration
         */
        public Long getTranLdDuration() {
            return this.tranLdDuration;
        }

        /**
         * @return tranSdDuration
         */
        public Long getTranSdDuration() {
            return this.tranSdDuration;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domainName; 
            private String instance; 
            private Long outputHdDuration; 
            private Long outputLdDuration; 
            private Long outputSdDuration; 
            private String region; 
            private String timeStamp; 
            private Long tranHdDuration; 
            private Long tranLdDuration; 
            private Long tranSdDuration; 
            private String type; 

            private Builder() {
            } 

            private Builder(BillProducerDataItem model) {
                this.domainName = model.domainName;
                this.instance = model.instance;
                this.outputHdDuration = model.outputHdDuration;
                this.outputLdDuration = model.outputLdDuration;
                this.outputSdDuration = model.outputSdDuration;
                this.region = model.region;
                this.timeStamp = model.timeStamp;
                this.tranHdDuration = model.tranHdDuration;
                this.tranLdDuration = model.tranLdDuration;
                this.tranSdDuration = model.tranSdDuration;
                this.type = model.type;
            } 

            /**
             * <p>The domain name. If domain is specified by the SplitBy parameter, the usage data is returned based on different domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The production studio instance. If instance is specified by the SplitBy parameter, the usage data is returned based on different production studio instances.</p>
             * 
             * <strong>example:</strong>
             * <p>a17d0184-462d-4630-b2a6-8c26dde2****</p>
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>The duration of high definition streaming. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder outputHdDuration(Long outputHdDuration) {
                this.outputHdDuration = outputHdDuration;
                return this;
            }

            /**
             * <p>The duration of low definition streaming. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder outputLdDuration(Long outputLdDuration) {
                this.outputLdDuration = outputLdDuration;
                return this;
            }

            /**
             * <p>The duration of standard definition streaming. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder outputSdDuration(Long outputSdDuration) {
                this.outputSdDuration = outputSdDuration;
                return this;
            }

            /**
             * <p>The region. If region is specified by the SplitBy parameter, the usage data is returned based on different regions.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-30T00:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The duration of high definition transcoding. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>6777</p>
             */
            public Builder tranHdDuration(Long tranHdDuration) {
                this.tranHdDuration = tranHdDuration;
                return this;
            }

            /**
             * <p>The duration of low definition transcoding. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder tranLdDuration(Long tranLdDuration) {
                this.tranLdDuration = tranLdDuration;
                return this;
            }

            /**
             * <p>The duration of standard definition transcoding. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>666</p>
             */
            public Builder tranSdDuration(Long tranSdDuration) {
                this.tranSdDuration = tranSdDuration;
                return this;
            }

            /**
             * <p>The type of the production studio. If type is specified by the SplitBy parameter, the usage data is returned based on different types of production studios.</p>
             * 
             * <strong>example:</strong>
             * <p>slidelive</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BillProducerDataItem build() {
                return new BillProducerDataItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveProducerUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveProducerUsageDataResponseBody</p>
     */
    public static class BillProducerData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillProducerDataItem")
        private java.util.List<BillProducerDataItem> billProducerDataItem;

        private BillProducerData(Builder builder) {
            this.billProducerDataItem = builder.billProducerDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillProducerData create() {
            return builder().build();
        }

        /**
         * @return billProducerDataItem
         */
        public java.util.List<BillProducerDataItem> getBillProducerDataItem() {
            return this.billProducerDataItem;
        }

        public static final class Builder {
            private java.util.List<BillProducerDataItem> billProducerDataItem; 

            private Builder() {
            } 

            private Builder(BillProducerData model) {
                this.billProducerDataItem = model.billProducerDataItem;
            } 

            /**
             * BillProducerDataItem.
             */
            public Builder billProducerDataItem(java.util.List<BillProducerDataItem> billProducerDataItem) {
                this.billProducerDataItem = billProducerDataItem;
                return this;
            }

            public BillProducerData build() {
                return new BillProducerData(this);
            } 

        } 

    }
}
