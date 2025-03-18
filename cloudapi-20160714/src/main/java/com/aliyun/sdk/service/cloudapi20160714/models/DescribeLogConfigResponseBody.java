// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogConfigResponseBody</p>
 */
public class DescribeLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogInfos")
    private LogInfos logInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogConfigResponseBody(Builder builder) {
        this.logInfos = builder.logInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logInfos
     */
    public LogInfos getLogInfos() {
        return this.logInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LogInfos logInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLogConfigResponseBody model) {
            this.logInfos = model.logInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Info of the log config.</p>
         */
        public Builder logInfos(LogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E3BC2706-ABDB-5B64-A12F-08DFD9E3F339</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogConfigResponseBody build() {
            return new DescribeLogConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogConfigResponseBody</p>
     */
    public static class LogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SlsLogStore")
        private String slsLogStore;

        @com.aliyun.core.annotation.NameInMap("SlsProject")
        private String slsProject;

        private LogInfo(Builder builder) {
            this.logType = builder.logType;
            this.regionId = builder.regionId;
            this.slsLogStore = builder.slsLogStore;
            this.slsProject = builder.slsProject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfo create() {
            return builder().build();
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return slsLogStore
         */
        public String getSlsLogStore() {
            return this.slsLogStore;
        }

        /**
         * @return slsProject
         */
        public String getSlsProject() {
            return this.slsProject;
        }

        public static final class Builder {
            private String logType; 
            private String regionId; 
            private String slsLogStore; 
            private String slsProject; 

            private Builder() {
            } 

            private Builder(LogInfo model) {
                this.logType = model.logType;
                this.regionId = model.regionId;
                this.slsLogStore = model.slsLogStore;
                this.slsProject = model.slsProject;
            } 

            /**
             * <p>The log type.</p>
             * 
             * <strong>example:</strong>
             * <p>PROVIDER</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The region ID of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the Logstore in Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>slsstore</p>
             */
            public Builder slsLogStore(String slsLogStore) {
                this.slsLogStore = slsLogStore;
                return this;
            }

            /**
             * <p>The name of the Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>slsproject</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            public LogInfo build() {
                return new LogInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogConfigResponseBody</p>
     */
    public static class LogInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogInfo")
        private java.util.List<LogInfo> logInfo;

        private LogInfos(Builder builder) {
            this.logInfo = builder.logInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfos create() {
            return builder().build();
        }

        /**
         * @return logInfo
         */
        public java.util.List<LogInfo> getLogInfo() {
            return this.logInfo;
        }

        public static final class Builder {
            private java.util.List<LogInfo> logInfo; 

            private Builder() {
            } 

            private Builder(LogInfos model) {
                this.logInfo = model.logInfo;
            } 

            /**
             * LogInfo.
             */
            public Builder logInfo(java.util.List<LogInfo> logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            public LogInfos build() {
                return new LogInfos(this);
            } 

        } 

    }
}
