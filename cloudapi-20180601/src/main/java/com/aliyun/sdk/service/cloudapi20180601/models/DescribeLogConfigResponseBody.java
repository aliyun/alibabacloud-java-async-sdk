// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogConfigResponseBody</p>
 */
public class DescribeLogConfigResponseBody extends TeaModel {
    @NameInMap("LogInfos")
    private LogInfos logInfos;

    @NameInMap("RequestId")
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

        /**
         * LogInfos.
         */
        public Builder logInfos(LogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogConfigResponseBody build() {
            return new DescribeLogConfigResponseBody(this);
        } 

    } 

    public static class LogInfo extends TeaModel {
        @NameInMap("LogType")
        private String logType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SlsLogStore")
        private String slsLogStore;

        @NameInMap("SlsProject")
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

            /**
             * LogType.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SlsLogStore.
             */
            public Builder slsLogStore(String slsLogStore) {
                this.slsLogStore = slsLogStore;
                return this;
            }

            /**
             * SlsProject.
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
    public static class LogInfos extends TeaModel {
        @NameInMap("LogInfo")
        private java.util.List < LogInfo> logInfo;

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
        public java.util.List < LogInfo> getLogInfo() {
            return this.logInfo;
        }

        public static final class Builder {
            private java.util.List < LogInfo> logInfo; 

            /**
             * LogInfo.
             */
            public Builder logInfo(java.util.List < LogInfo> logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            public LogInfos build() {
                return new LogInfos(this);
            } 

        } 

    }
}
