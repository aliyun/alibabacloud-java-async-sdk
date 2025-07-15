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
 * {@link DescribeLiveDrmUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDrmUsageDataResponseBody</p>
 */
public class DescribeLiveDrmUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DrmUsageData")
    private DrmUsageData drmUsageData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveDrmUsageDataResponseBody model) {
            this.drmUsageData = model.drmUsageData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The usage of the DRM encryption service at each time interval.</p>
         */
        public Builder drmUsageData(DrmUsageData drmUsageData) {
            this.drmUsageData = drmUsageData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91FC2D9D-B042-4634-8A5C-7B8E7482C22D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDrmUsageDataResponseBody build() {
            return new DescribeLiveDrmUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDrmUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDrmUsageDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DrmType")
        private String drmType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.count = model.count;
                this.domain = model.domain;
                this.drmType = model.drmType;
                this.region = model.region;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The number of times DRM-encrypted live streams are requested.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The domain name. If the value of SplitBy includes domain, the returned data is grouped by domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The DRM type. If the value of SplitBy includes drm_type, the returned data is grouped by DRM type.</p>
             * 
             * <strong>example:</strong>
             * <p>Widevine</p>
             */
            public Builder drmType(String drmType) {
                this.drmType = drmType;
                return this;
            }

            /**
             * <p>The ID of the region. If the value of SplitBy includes region, the returned data is grouped by region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-01T16:00:00Z</p>
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
    /**
     * 
     * {@link DescribeLiveDrmUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDrmUsageDataResponseBody</p>
     */
    public static class DrmUsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

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
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            private Builder() {
            } 

            private Builder(DrmUsageData model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public DrmUsageData build() {
                return new DrmUsageData(this);
            } 

        } 

    }
}
