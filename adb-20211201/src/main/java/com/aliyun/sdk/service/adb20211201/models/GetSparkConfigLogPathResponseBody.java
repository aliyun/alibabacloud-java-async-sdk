// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetSparkConfigLogPathResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkConfigLogPathResponseBody</p>
 */
public class GetSparkConfigLogPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetSparkConfigLogPathResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried Spark log configuration.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1919-xxx-ssdfsdff</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkConfigLogPathResponseBody build() {
            return new GetSparkConfigLogPathResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSparkConfigLogPathResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkConfigLogPathResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultLogPath")
        private String defaultLogPath;

        @com.aliyun.core.annotation.NameInMap("IsLogPathExists")
        private Boolean isLogPathExists;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimestamp")
        private String modifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("ModifiedUid")
        private String modifiedUid;

        @com.aliyun.core.annotation.NameInMap("RecordedLogPath")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.defaultLogPath = model.defaultLogPath;
                this.isLogPathExists = model.isLogPathExists;
                this.modifiedTimestamp = model.modifiedTimestamp;
                this.modifiedUid = model.modifiedUid;
                this.recordedLogPath = model.recordedLogPath;
            } 

            /**
             * <p>The default log path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://aliyun-oa-adb-spark-1111-oss-cn-hanghzou/spark-logs</p>
             */
            public Builder defaultLogPath(String defaultLogPath) {
                this.defaultLogPath = defaultLogPath;
                return this;
            }

            /**
             * <p>Indicates whether a log path exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isLogPathExists(Boolean isLogPathExists) {
                this.isLogPathExists = isLogPathExists;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1675654361000</p>
             */
            public Builder modifiedTimestamp(String modifiedTimestamp) {
                this.modifiedTimestamp = modifiedTimestamp;
                return this;
            }

            /**
             * <p>The account ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>10130223128xxx</p>
             */
            public Builder modifiedUid(String modifiedUid) {
                this.modifiedUid = modifiedUid;
                return this;
            }

            /**
             * <p>The recorded log path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test/spark-logs/</p>
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
