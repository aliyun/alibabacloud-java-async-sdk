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
 * {@link DescribeLiveDetectPornDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDetectPornDataResponseBody</p>
 */
public class DescribeLiveDetectPornDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectPornData")
    private DetectPornData detectPornData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDetectPornDataResponseBody(Builder builder) {
        this.detectPornData = builder.detectPornData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDetectPornDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectPornData
     */
    public DetectPornData getDetectPornData() {
        return this.detectPornData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DetectPornData detectPornData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveDetectPornDataResponseBody model) {
            this.detectPornData = model.detectPornData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The bandwidth data returned at each interval.</p>
         */
        public Builder detectPornData(DetectPornData detectPornData) {
            this.detectPornData = detectPornData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDetectPornDataResponseBody build() {
            return new DescribeLiveDetectPornDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDetectPornDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDetectPornDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Fee")
        private String fee;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private String stream;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.app = builder.app;
            this.count = builder.count;
            this.domain = builder.domain;
            this.fee = builder.fee;
            this.region = builder.region;
            this.scene = builder.scene;
            this.stream = builder.stream;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
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
         * @return fee
         */
        public String getFee() {
            return this.fee;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return stream
         */
        public String getStream() {
            return this.stream;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String app; 
            private Long count; 
            private String domain; 
            private String fee; 
            private String region; 
            private String scene; 
            private String stream; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.app = model.app;
                this.count = model.count;
                this.domain = model.domain;
                this.fee = model.fee;
                this.region = model.region;
                this.scene = model.scene;
                this.stream = model.stream;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * <p>The number of reviewed images.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether a quota of free image scanning is available. Valid values:</p>
             * <ul>
             * <li><strong>free</strong></li>
             * <li><strong>charge</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>free</p>
             */
            public Builder fee(String fee) {
                this.fee = fee;
                return this;
            }

            /**
             * <p>The region in which the domain name resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The moderation scenario. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong> (default): pornography</li>
             * <li><strong>terrorism</strong>: terrorism or politically sensitive content</li>
             * <li><strong>ad</strong>: ad violation</li>
             * <li><strong>live</strong>: undesirable scene</li>
             * <li><strong>logo</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder stream(String stream) {
                this.stream = stream;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T15:00:05Z</p>
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
     * {@link DescribeLiveDetectPornDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDetectPornDataResponseBody</p>
     */
    public static class DetectPornData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private DetectPornData(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectPornData create() {
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

            private Builder(DetectPornData model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public DetectPornData build() {
                return new DetectPornData(this);
            } 

        } 

    }
}
