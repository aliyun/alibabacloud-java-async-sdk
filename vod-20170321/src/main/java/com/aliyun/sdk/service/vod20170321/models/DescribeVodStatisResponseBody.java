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
 * {@link DescribeVodStatisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodStatisResponseBody</p>
 */
public class DescribeVodStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CdnData")
    private CdnData cdnData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageData")
    private StorageData storageData;

    @com.aliyun.core.annotation.NameInMap("TranscodeData")
    private TranscodeData transcodeData;

    private DescribeVodStatisResponseBody(Builder builder) {
        this.cdnData = builder.cdnData;
        this.requestId = builder.requestId;
        this.storageData = builder.storageData;
        this.transcodeData = builder.transcodeData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdnData
     */
    public CdnData getCdnData() {
        return this.cdnData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageData
     */
    public StorageData getStorageData() {
        return this.storageData;
    }

    /**
     * @return transcodeData
     */
    public TranscodeData getTranscodeData() {
        return this.transcodeData;
    }

    public static final class Builder {
        private CdnData cdnData; 
        private String requestId; 
        private StorageData storageData; 
        private TranscodeData transcodeData; 

        private Builder() {
        } 

        private Builder(DescribeVodStatisResponseBody model) {
            this.cdnData = model.cdnData;
            this.requestId = model.requestId;
            this.storageData = model.storageData;
            this.transcodeData = model.transcodeData;
        } 

        /**
         * CdnData.
         */
        public Builder cdnData(CdnData cdnData) {
            this.cdnData = cdnData;
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
         * StorageData.
         */
        public Builder storageData(StorageData storageData) {
            this.storageData = storageData;
            return this;
        }

        /**
         * TranscodeData.
         */
        public Builder transcodeData(TranscodeData transcodeData) {
            this.transcodeData = transcodeData;
            return this;
        }

        public DescribeVodStatisResponseBody build() {
            return new DescribeVodStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodStatisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodStatisResponseBody</p>
     */
    public static class CdnData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Float bps;

        @com.aliyun.core.annotation.NameInMap("Traffic")
        private Long traffic;

        private CdnData(Builder builder) {
            this.bps = builder.bps;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdnData create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Float getBps() {
            return this.bps;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Float bps; 
            private Long traffic; 

            private Builder() {
            } 

            private Builder(CdnData model) {
                this.bps = model.bps;
                this.traffic = model.traffic;
            } 

            /**
             * Bps.
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            public CdnData build() {
                return new CdnData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodStatisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodStatisResponseBody</p>
     */
    public static class StorageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Traffic")
        private Long traffic;

        private StorageData(Builder builder) {
            this.size = builder.size;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageData create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Long size; 
            private Long traffic; 

            private Builder() {
            } 

            private Builder(StorageData model) {
                this.size = model.size;
                this.traffic = model.traffic;
            } 

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            public StorageData build() {
                return new StorageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodStatisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodStatisResponseBody</p>
     */
    public static class TranscodeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        private TranscodeData(Builder builder) {
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeData create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private Long duration; 

            private Builder() {
            } 

            private Builder(TranscodeData model) {
                this.duration = model.duration;
            } 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            public TranscodeData build() {
                return new TranscodeData(this);
            } 

        } 

    }
}
