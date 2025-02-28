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
 * {@link ListFeatureConsistencyCheckJobScoreReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureConsistencyCheckJobScoreReportsResponseBody</p>
 */
public class ListFeatureConsistencyCheckJobScoreReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataPath")
    private String dataPath;

    @com.aliyun.core.annotation.NameInMap("OssPath")
    private String ossPath;

    @com.aliyun.core.annotation.NameInMap("ReportsOfScoreDiff")
    private java.util.List<ReportsOfScoreDiff> reportsOfScoreDiff;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFeatureConsistencyCheckJobScoreReportsResponseBody(Builder builder) {
        this.dataPath = builder.dataPath;
        this.ossPath = builder.ossPath;
        this.reportsOfScoreDiff = builder.reportsOfScoreDiff;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureConsistencyCheckJobScoreReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataPath
     */
    public String getDataPath() {
        return this.dataPath;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return reportsOfScoreDiff
     */
    public java.util.List<ReportsOfScoreDiff> getReportsOfScoreDiff() {
        return this.reportsOfScoreDiff;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataPath; 
        private String ossPath; 
        private java.util.List<ReportsOfScoreDiff> reportsOfScoreDiff; 
        private String requestId; 

        /**
         * DataPath.
         */
        public Builder dataPath(String dataPath) {
            this.dataPath = dataPath;
            return this;
        }

        /**
         * OssPath.
         */
        public Builder ossPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }

        /**
         * ReportsOfScoreDiff.
         */
        public Builder reportsOfScoreDiff(java.util.List<ReportsOfScoreDiff> reportsOfScoreDiff) {
            this.reportsOfScoreDiff = reportsOfScoreDiff;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFeatureConsistencyCheckJobScoreReportsResponseBody build() {
            return new ListFeatureConsistencyCheckJobScoreReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFeatureConsistencyCheckJobScoreReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeatureConsistencyCheckJobScoreReportsResponseBody</p>
     */
    public static class ReportsOfScoreDiff extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogItemId")
        private String logItemId;

        @com.aliyun.core.annotation.NameInMap("LogRequestId")
        private String logRequestId;

        @com.aliyun.core.annotation.NameInMap("LogUserId")
        private String logUserId;

        @com.aliyun.core.annotation.NameInMap("ScoreDiff")
        private String scoreDiff;

        @com.aliyun.core.annotation.NameInMap("ScoreDiffDetail")
        private String scoreDiffDetail;

        private ReportsOfScoreDiff(Builder builder) {
            this.logItemId = builder.logItemId;
            this.logRequestId = builder.logRequestId;
            this.logUserId = builder.logUserId;
            this.scoreDiff = builder.scoreDiff;
            this.scoreDiffDetail = builder.scoreDiffDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportsOfScoreDiff create() {
            return builder().build();
        }

        /**
         * @return logItemId
         */
        public String getLogItemId() {
            return this.logItemId;
        }

        /**
         * @return logRequestId
         */
        public String getLogRequestId() {
            return this.logRequestId;
        }

        /**
         * @return logUserId
         */
        public String getLogUserId() {
            return this.logUserId;
        }

        /**
         * @return scoreDiff
         */
        public String getScoreDiff() {
            return this.scoreDiff;
        }

        /**
         * @return scoreDiffDetail
         */
        public String getScoreDiffDetail() {
            return this.scoreDiffDetail;
        }

        public static final class Builder {
            private String logItemId; 
            private String logRequestId; 
            private String logUserId; 
            private String scoreDiff; 
            private String scoreDiffDetail; 

            /**
             * LogItemId.
             */
            public Builder logItemId(String logItemId) {
                this.logItemId = logItemId;
                return this;
            }

            /**
             * LogRequestId.
             */
            public Builder logRequestId(String logRequestId) {
                this.logRequestId = logRequestId;
                return this;
            }

            /**
             * LogUserId.
             */
            public Builder logUserId(String logUserId) {
                this.logUserId = logUserId;
                return this;
            }

            /**
             * ScoreDiff.
             */
            public Builder scoreDiff(String scoreDiff) {
                this.scoreDiff = scoreDiff;
                return this;
            }

            /**
             * ScoreDiffDetail.
             */
            public Builder scoreDiffDetail(String scoreDiffDetail) {
                this.scoreDiffDetail = scoreDiffDetail;
                return this;
            }

            public ReportsOfScoreDiff build() {
                return new ReportsOfScoreDiff(this);
            } 

        } 

    }
}
