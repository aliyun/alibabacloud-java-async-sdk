// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDrmUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDrmUsageDataResponseBody</p>
 */
public class DescribeLiveDrmUsageDataResponseBody extends TeaModel {
    @NameInMap("DrmUsageData")
    private DrmUsageData drmUsageData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDrmUsageDataResponseBody(Builder builder) {
        this.drmUsageData = builder.drmUsageData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDrmUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return drmUsageData
     */
    public DrmUsageData getDrmUsageData() {
        return this.drmUsageData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DrmUsageData drmUsageData; 
        private String requestId; 

        /**
         * DrmUsageData.
         */
        public Builder drmUsageData(DrmUsageData drmUsageData) {
            this.drmUsageData = drmUsageData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDrmUsageDataResponseBody build() {
            return new DescribeLiveDrmUsageDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("DrmType")
        private String drmType;

        @NameInMap("Region")
        private String region;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.count = builder.count;
            this.domain = builder.domain;
            this.drmType = builder.drmType;
            this.region = builder.region;
            this.timeStamp = builder.timeStamp;
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
         * @return drmType
         */
        public String getDrmType() {
            return this.drmType;
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

        public static final class Builder {
            private Long count; 
            private String domain; 
            private String drmType; 
            private String region; 
            private String timeStamp; 

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
             * DrmType.
             */
            public Builder drmType(String drmType) {
                this.drmType = drmType;
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

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class DrmUsageData extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private DrmUsageData(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrmUsageData create() {
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

            public DrmUsageData build() {
                return new DrmUsageData(this);
            } 

        } 

    }
}
