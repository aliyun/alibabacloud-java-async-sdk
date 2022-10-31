// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveProducerUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveProducerUsageDataResponseBody</p>
 */
public class DescribeLiveProducerUsageDataResponseBody extends TeaModel {
    @NameInMap("BillProducerData")
    private BillProducerData billProducerData;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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

        /**
         * BillProducerData.
         */
        public Builder billProducerData(BillProducerData billProducerData) {
            this.billProducerData = billProducerData;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveProducerUsageDataResponseBody build() {
            return new DescribeLiveProducerUsageDataResponseBody(this);
        } 

    } 

    public static class BillProducerDataItem extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Instance")
        private String instance;

        @NameInMap("OutputHdDuration")
        private Long outputHdDuration;

        @NameInMap("OutputLdDuration")
        private Long outputLdDuration;

        @NameInMap("OutputSdDuration")
        private Long outputSdDuration;

        @NameInMap("Region")
        private String region;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("TranHdDuration")
        private Long tranHdDuration;

        @NameInMap("TranLdDuration")
        private Long tranLdDuration;

        @NameInMap("TranSdDuration")
        private Long tranSdDuration;

        @NameInMap("Type")
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

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * OutputHdDuration.
             */
            public Builder outputHdDuration(Long outputHdDuration) {
                this.outputHdDuration = outputHdDuration;
                return this;
            }

            /**
             * OutputLdDuration.
             */
            public Builder outputLdDuration(Long outputLdDuration) {
                this.outputLdDuration = outputLdDuration;
                return this;
            }

            /**
             * OutputSdDuration.
             */
            public Builder outputSdDuration(Long outputSdDuration) {
                this.outputSdDuration = outputSdDuration;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * TranHdDuration.
             */
            public Builder tranHdDuration(Long tranHdDuration) {
                this.tranHdDuration = tranHdDuration;
                return this;
            }

            /**
             * TranLdDuration.
             */
            public Builder tranLdDuration(Long tranLdDuration) {
                this.tranLdDuration = tranLdDuration;
                return this;
            }

            /**
             * TranSdDuration.
             */
            public Builder tranSdDuration(Long tranSdDuration) {
                this.tranSdDuration = tranSdDuration;
                return this;
            }

            /**
             * Type.
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
    public static class BillProducerData extends TeaModel {
        @NameInMap("BillProducerDataItem")
        private java.util.List < BillProducerDataItem> billProducerDataItem;

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
        public java.util.List < BillProducerDataItem> getBillProducerDataItem() {
            return this.billProducerDataItem;
        }

        public static final class Builder {
            private java.util.List < BillProducerDataItem> billProducerDataItem; 

            /**
             * BillProducerDataItem.
             */
            public Builder billProducerDataItem(java.util.List < BillProducerDataItem> billProducerDataItem) {
                this.billProducerDataItem = billProducerDataItem;
                return this;
            }

            public BillProducerData build() {
                return new BillProducerData(this);
            } 

        } 

    }
}
