// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainRecordUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainRecordUsageDataResponseBody</p>
 */
public class DescribeLiveDomainRecordUsageDataResponseBody extends TeaModel {
    @NameInMap("RecordUsageData")
    private RecordUsageData recordUsageData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainRecordUsageDataResponseBody(Builder builder) {
        this.recordUsageData = builder.recordUsageData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainRecordUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordUsageData
     */
    public RecordUsageData getRecordUsageData() {
        return this.recordUsageData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordUsageData recordUsageData; 
        private String requestId; 

        /**
         * RecordUsageData.
         */
        public Builder recordUsageData(RecordUsageData recordUsageData) {
            this.recordUsageData = recordUsageData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainRecordUsageDataResponseBody build() {
            return new DescribeLiveDomainRecordUsageDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Type")
        private String type;

        private DataModule(Builder builder) {
            this.count = builder.count;
            this.domain = builder.domain;
            this.duration = builder.duration;
            this.timeStamp = builder.timeStamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long count; 
            private String domain; 
            private Long duration; 
            private String timeStamp; 
            private String type; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class RecordUsageData extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private RecordUsageData(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordUsageData create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public RecordUsageData build() {
                return new RecordUsageData(this);
            } 

        } 

    }
}
