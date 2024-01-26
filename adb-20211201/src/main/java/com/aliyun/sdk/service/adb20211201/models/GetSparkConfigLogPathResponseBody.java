// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkConfigLogPathResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkConfigLogPathResponseBody</p>
 */
public class GetSparkConfigLogPathResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSparkConfigLogPathResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkConfigLogPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The queried Spark log configuration.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkConfigLogPathResponseBody build() {
            return new GetSparkConfigLogPathResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DefaultLogPath")
        private String defaultLogPath;

        @NameInMap("IsLogPathExists")
        private Boolean isLogPathExists;

        @NameInMap("ModifiedTimestamp")
        private String modifiedTimestamp;

        @NameInMap("ModifiedUid")
        private String modifiedUid;

        @NameInMap("RecordedLogPath")
        private String recordedLogPath;

        private Data(Builder builder) {
            this.defaultLogPath = builder.defaultLogPath;
            this.isLogPathExists = builder.isLogPathExists;
            this.modifiedTimestamp = builder.modifiedTimestamp;
            this.modifiedUid = builder.modifiedUid;
            this.recordedLogPath = builder.recordedLogPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return defaultLogPath
         */
        public String getDefaultLogPath() {
            return this.defaultLogPath;
        }

        /**
         * @return isLogPathExists
         */
        public Boolean getIsLogPathExists() {
            return this.isLogPathExists;
        }

        /**
         * @return modifiedTimestamp
         */
        public String getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        /**
         * @return modifiedUid
         */
        public String getModifiedUid() {
            return this.modifiedUid;
        }

        /**
         * @return recordedLogPath
         */
        public String getRecordedLogPath() {
            return this.recordedLogPath;
        }

        public static final class Builder {
            private String defaultLogPath; 
            private Boolean isLogPathExists; 
            private String modifiedTimestamp; 
            private String modifiedUid; 
            private String recordedLogPath; 

            /**
             * The default log path.
             */
            public Builder defaultLogPath(String defaultLogPath) {
                this.defaultLogPath = defaultLogPath;
                return this;
            }

            /**
             * Indicates whether a log path exists.
             */
            public Builder isLogPathExists(Boolean isLogPathExists) {
                this.isLogPathExists = isLogPathExists;
                return this;
            }

            /**
             * The last modification time.
             */
            public Builder modifiedTimestamp(String modifiedTimestamp) {
                this.modifiedTimestamp = modifiedTimestamp;
                return this;
            }

            /**
             * The account ID of the modifier.
             */
            public Builder modifiedUid(String modifiedUid) {
                this.modifiedUid = modifiedUid;
                return this;
            }

            /**
             * The recorded log path.
             */
            public Builder recordedLogPath(String recordedLogPath) {
                this.recordedLogPath = recordedLogPath;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
