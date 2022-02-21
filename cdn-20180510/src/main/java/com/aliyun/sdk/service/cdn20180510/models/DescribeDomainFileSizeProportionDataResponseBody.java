// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainFileSizeProportionDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainFileSizeProportionDataResponseBody</p>
 */
public class DescribeDomainFileSizeProportionDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("FileSizeProportionDataInterval")
    private FileSizeProportionDataInterval fileSizeProportionDataInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainFileSizeProportionDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.fileSizeProportionDataInterval = builder.fileSizeProportionDataInterval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainFileSizeProportionDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fileSizeProportionDataInterval
     */
    public FileSizeProportionDataInterval getFileSizeProportionDataInterval() {
        return this.fileSizeProportionDataInterval;
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
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private FileSizeProportionDataInterval fileSizeProportionDataInterval; 
        private String requestId; 
        private String startTime; 

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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
         * FileSizeProportionDataInterval.
         */
        public Builder fileSizeProportionDataInterval(FileSizeProportionDataInterval fileSizeProportionDataInterval) {
            this.fileSizeProportionDataInterval = fileSizeProportionDataInterval;
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

        public DescribeDomainFileSizeProportionDataResponseBody build() {
            return new DescribeDomainFileSizeProportionDataResponseBody(this);
        } 

    } 

    public static class FileSizeProportionData extends TeaModel {
        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("Proportion")
        private String proportion;

        private FileSizeProportionData(Builder builder) {
            this.fileSize = builder.fileSize;
            this.proportion = builder.proportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSizeProportionData create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return proportion
         */
        public String getProportion() {
            return this.proportion;
        }

        public static final class Builder {
            private String fileSize; 
            private String proportion; 

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Proportion.
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            public FileSizeProportionData build() {
                return new FileSizeProportionData(this);
            } 

        } 

    }
    public static class Value extends TeaModel {
        @NameInMap("FileSizeProportionData")
        private java.util.List < FileSizeProportionData> fileSizeProportionData;

        private Value(Builder builder) {
            this.fileSizeProportionData = builder.fileSizeProportionData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return fileSizeProportionData
         */
        public java.util.List < FileSizeProportionData> getFileSizeProportionData() {
            return this.fileSizeProportionData;
        }

        public static final class Builder {
            private java.util.List < FileSizeProportionData> fileSizeProportionData; 

            /**
             * FileSizeProportionData.
             */
            public Builder fileSizeProportionData(java.util.List < FileSizeProportionData> fileSizeProportionData) {
                this.fileSizeProportionData = fileSizeProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    public static class UsageData extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Value")
        private Value value;

        private UsageData(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return value
         */
        public Value getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private Value value; 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Value value) {
                this.value = value;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
    public static class FileSizeProportionDataInterval extends TeaModel {
        @NameInMap("UsageData")
        private java.util.List < UsageData> usageData;

        private FileSizeProportionDataInterval(Builder builder) {
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSizeProportionDataInterval create() {
            return builder().build();
        }

        /**
         * @return usageData
         */
        public java.util.List < UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List < UsageData> usageData; 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List < UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public FileSizeProportionDataInterval build() {
                return new FileSizeProportionDataInterval(this);
            } 

        } 

    }
}
