// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDetectPornDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDetectPornDataResponseBody</p>
 */
public class DescribeLiveDetectPornDataResponseBody extends TeaModel {
    @NameInMap("DetectPornData")
    private DetectPornData detectPornData;

    @NameInMap("RequestId")
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

        /**
         * DetectPornData.
         */
        public Builder detectPornData(DetectPornData detectPornData) {
            this.detectPornData = detectPornData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDetectPornDataResponseBody build() {
            return new DescribeLiveDetectPornDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("App")
        private String app;

        @NameInMap("Count")
        private Long count;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Fee")
        private String fee;

        @NameInMap("Region")
        private String region;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Stream")
        private String stream;

        @NameInMap("TimeStamp")
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

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

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
             * Fee.
             */
            public Builder fee(String fee) {
                this.fee = fee;
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
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Stream.
             */
            public Builder stream(String stream) {
                this.stream = stream;
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
    public static class DetectPornData extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

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

            public DetectPornData build() {
                return new DetectPornData(this);
            } 

        } 

    }
}
