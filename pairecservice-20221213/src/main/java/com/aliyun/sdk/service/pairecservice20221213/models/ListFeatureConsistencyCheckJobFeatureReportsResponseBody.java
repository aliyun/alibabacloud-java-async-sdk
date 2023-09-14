// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureConsistencyCheckJobFeatureReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureConsistencyCheckJobFeatureReportsResponseBody</p>
 */
public class ListFeatureConsistencyCheckJobFeatureReportsResponseBody extends TeaModel {
    @NameInMap("DataPath")
    private String dataPath;

    @NameInMap("OssPath")
    private String ossPath;

    @NameInMap("ReportsOfFeatureDiff")
    private java.util.List < ReportsOfFeatureDiff> reportsOfFeatureDiff;

    @NameInMap("RequestId")
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
    public java.util.List < ReportsOfFeatureDiff> getReportsOfFeatureDiff() {
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
        private java.util.List < ReportsOfFeatureDiff> reportsOfFeatureDiff; 
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
         * ReportsOfFeatureDiff.
         */
        public Builder reportsOfFeatureDiff(java.util.List < ReportsOfFeatureDiff> reportsOfFeatureDiff) {
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

    public static class ReportsOfFeatureDiff extends TeaModel {
        @NameInMap("FeatureName")
        private String featureName;

        @NameInMap("LogItemId")
        private String logItemId;

        @NameInMap("LogRequestId")
        private String logRequestId;

        @NameInMap("LogUserId")
        private String logUserId;

        @NameInMap("OfflineValue")
        private String offlineValue;

        @NameInMap("OnlineValue")
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
