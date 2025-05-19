// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListFeatureConsistencyCheckJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureConsistencyCheckJobsResponseBody</p>
 */
public class ListFeatureConsistencyCheckJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobs")
    private java.util.List<FeatureConsistencyCheckJobs> featureConsistencyCheckJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListFeatureConsistencyCheckJobsResponseBody(Builder builder) {
        this.featureConsistencyCheckJobs = builder.featureConsistencyCheckJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureConsistencyCheckJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureConsistencyCheckJobs
     */
    public java.util.List<FeatureConsistencyCheckJobs> getFeatureConsistencyCheckJobs() {
        return this.featureConsistencyCheckJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<FeatureConsistencyCheckJobs> featureConsistencyCheckJobs; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListFeatureConsistencyCheckJobsResponseBody model) {
            this.featureConsistencyCheckJobs = model.featureConsistencyCheckJobs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * FeatureConsistencyCheckJobs.
         */
        public Builder featureConsistencyCheckJobs(java.util.List<FeatureConsistencyCheckJobs> featureConsistencyCheckJobs) {
            this.featureConsistencyCheckJobs = featureConsistencyCheckJobs;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFeatureConsistencyCheckJobsResponseBody build() {
            return new ListFeatureConsistencyCheckJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFeatureConsistencyCheckJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeatureConsistencyCheckJobsResponseBody</p>
     */
    public static class FeatureConsistencyCheckJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
        private String featureConsistencyCheckJobConfigId;

        @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigName")
        private String featureConsistencyCheckJobConfigName;

        @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobId")
        private String featureConsistencyCheckJobId;

        @com.aliyun.core.annotation.NameInMap("GmtEndTime")
        private String gmtEndTime;

        @com.aliyun.core.annotation.NameInMap("GmtStartTime")
        private String gmtStartTime;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<String> logs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FeatureConsistencyCheckJobs(Builder builder) {
            this.config = builder.config;
            this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
            this.featureConsistencyCheckJobConfigName = builder.featureConsistencyCheckJobConfigName;
            this.featureConsistencyCheckJobId = builder.featureConsistencyCheckJobId;
            this.gmtEndTime = builder.gmtEndTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.logs = builder.logs;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureConsistencyCheckJobs create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return featureConsistencyCheckJobConfigId
         */
        public String getFeatureConsistencyCheckJobConfigId() {
            return this.featureConsistencyCheckJobConfigId;
        }

        /**
         * @return featureConsistencyCheckJobConfigName
         */
        public String getFeatureConsistencyCheckJobConfigName() {
            return this.featureConsistencyCheckJobConfigName;
        }

        /**
         * @return featureConsistencyCheckJobId
         */
        public String getFeatureConsistencyCheckJobId() {
            return this.featureConsistencyCheckJobId;
        }

        /**
         * @return gmtEndTime
         */
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return logs
         */
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String config; 
            private String featureConsistencyCheckJobConfigId; 
            private String featureConsistencyCheckJobConfigName; 
            private String featureConsistencyCheckJobId; 
            private String gmtEndTime; 
            private String gmtStartTime; 
            private java.util.List<String> logs; 
            private String status; 

            private Builder() {
            } 

            private Builder(FeatureConsistencyCheckJobs model) {
                this.config = model.config;
                this.featureConsistencyCheckJobConfigId = model.featureConsistencyCheckJobConfigId;
                this.featureConsistencyCheckJobConfigName = model.featureConsistencyCheckJobConfigName;
                this.featureConsistencyCheckJobId = model.featureConsistencyCheckJobId;
                this.gmtEndTime = model.gmtEndTime;
                this.gmtStartTime = model.gmtStartTime;
                this.logs = model.logs;
                this.status = model.status;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * FeatureConsistencyCheckJobConfigId.
             */
            public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
                this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
                return this;
            }

            /**
             * FeatureConsistencyCheckJobConfigName.
             */
            public Builder featureConsistencyCheckJobConfigName(String featureConsistencyCheckJobConfigName) {
                this.featureConsistencyCheckJobConfigName = featureConsistencyCheckJobConfigName;
                return this;
            }

            /**
             * FeatureConsistencyCheckJobId.
             */
            public Builder featureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
                this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
                return this;
            }

            /**
             * GmtEndTime.
             */
            public Builder gmtEndTime(String gmtEndTime) {
                this.gmtEndTime = gmtEndTime;
                return this;
            }

            /**
             * GmtStartTime.
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List<String> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FeatureConsistencyCheckJobs build() {
                return new FeatureConsistencyCheckJobs(this);
            } 

        } 

    }
}
