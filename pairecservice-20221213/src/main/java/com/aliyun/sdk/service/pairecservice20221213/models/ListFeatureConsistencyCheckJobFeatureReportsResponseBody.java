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
 * {@link ListFeatureConsistencyCheckJobFeatureReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureConsistencyCheckJobFeatureReportsResponseBody</p>
 */
public class ListFeatureConsistencyCheckJobFeatureReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataPath")
    private String dataPath;

    @com.aliyun.core.annotation.NameInMap("OssPath")
    private String ossPath;

    @com.aliyun.core.annotation.NameInMap("ReportsOfFeatureDiff")
    private java.util.List<ReportsOfFeatureDiff> reportsOfFeatureDiff;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFeatureConsistencyCheckJobFeatureReportsResponseBody(Builder builder) {
        this.dataPath = builder.dataPath;
        this.ossPath = builder.ossPath;
        this.reportsOfFeatureDiff = builder.reportsOfFeatureDiff;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureConsistencyCheckJobFeatureReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return reportsOfFeatureDiff
     */
    public java.util.List<ReportsOfFeatureDiff> getReportsOfFeatureDiff() {
        return this.reportsOfFeatureDiff;
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
        private java.util.List<ReportsOfFeatureDiff> reportsOfFeatureDiff; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFeatureConsistencyCheckJobFeatureReportsResponseBody model) {
            this.dataPath = model.dataPath;
            this.ossPath = model.ossPath;
            this.reportsOfFeatureDiff = model.reportsOfFeatureDiff;
            this.requestId = model.requestId;
        } 

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
         * ReportsOfFeatureDiff.
         */
        public Builder reportsOfFeatureDiff(java.util.List<ReportsOfFeatureDiff> reportsOfFeatureDiff) {
            this.reportsOfFeatureDiff = reportsOfFeatureDiff;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFeatureConsistencyCheckJobFeatureReportsResponseBody build() {
            return new ListFeatureConsistencyCheckJobFeatureReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFeatureConsistencyCheckJobFeatureReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeatureConsistencyCheckJobFeatureReportsResponseBody</p>
     */
    public static class ReportsOfFeatureDiff extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("LogItemId")
        private String logItemId;

        @com.aliyun.core.annotation.NameInMap("LogRequestId")
        private String logRequestId;

        @com.aliyun.core.annotation.NameInMap("LogUserId")
        private String logUserId;

        @com.aliyun.core.annotation.NameInMap("OfflineValue")
        private String offlineValue;

        @com.aliyun.core.annotation.NameInMap("OnlineValue")
        private String onlineValue;

        private ReportsOfFeatureDiff(Builder builder) {
            this.featureName = builder.featureName;
            this.logItemId = builder.logItemId;
            this.logRequestId = builder.logRequestId;
            this.logUserId = builder.logUserId;
            this.offlineValue = builder.offlineValue;
            this.onlineValue = builder.onlineValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportsOfFeatureDiff create() {
            return builder().build();
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
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
         * @return offlineValue
         */
        public String getOfflineValue() {
            return this.offlineValue;
        }

        /**
         * @return onlineValue
         */
        public String getOnlineValue() {
            return this.onlineValue;
        }

        public static final class Builder {
            private String featureName; 
            private String logItemId; 
            private String logRequestId; 
            private String logUserId; 
            private String offlineValue; 
            private String onlineValue; 

            private Builder() {
            } 

            private Builder(ReportsOfFeatureDiff model) {
                this.featureName = model.featureName;
                this.logItemId = model.logItemId;
                this.logRequestId = model.logRequestId;
                this.logUserId = model.logUserId;
                this.offlineValue = model.offlineValue;
                this.onlineValue = model.onlineValue;
            } 

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

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
             * OfflineValue.
             */
            public Builder offlineValue(String offlineValue) {
                this.offlineValue = offlineValue;
                return this;
            }

            /**
             * OnlineValue.
             */
            public Builder onlineValue(String onlineValue) {
                this.onlineValue = onlineValue;
                return this;
            }

            public ReportsOfFeatureDiff build() {
                return new ReportsOfFeatureDiff(this);
            } 

        } 

    }
}
