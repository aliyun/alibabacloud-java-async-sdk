// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Detail} extends {@link TeaModel}
 *
 * <p>Detail</p>
 */
public class Detail extends TeaModel {
    @NameInMap("AppType")
    private String appType;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("Data")
    private String data;

    @NameInMap("DurationInMillis")
    private Long durationInMillis;

    @NameInMap("EstimateExecutionCpuTimeInSeconds")
    private Long estimateExecutionCpuTimeInSeconds;

    @NameInMap("LastAttemptId")
    private String lastAttemptId;

    @NameInMap("LastUpdatedTimeInMillis")
    private Long lastUpdatedTimeInMillis;

    @NameInMap("LogRootPath")
    private String logRootPath;

    @NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @NameInMap("StartedTimeInMillis")
    private Long startedTimeInMillis;

    @NameInMap("SubmittedTimeInMillis")
    private Long submittedTimeInMillis;

    @NameInMap("TerminatedTimeInMillis")
    private Long terminatedTimeInMillis;

    @NameInMap("WebUiAddress")
    private String webUiAddress;

    private Detail(Builder builder) {
        this.appType = builder.appType;
        this.DBClusterId = builder.DBClusterId;
        this.data = builder.data;
        this.durationInMillis = builder.durationInMillis;
        this.estimateExecutionCpuTimeInSeconds = builder.estimateExecutionCpuTimeInSeconds;
        this.lastAttemptId = builder.lastAttemptId;
        this.lastUpdatedTimeInMillis = builder.lastUpdatedTimeInMillis;
        this.logRootPath = builder.logRootPath;
        this.resourceGroupName = builder.resourceGroupName;
        this.startedTimeInMillis = builder.startedTimeInMillis;
        this.submittedTimeInMillis = builder.submittedTimeInMillis;
        this.terminatedTimeInMillis = builder.terminatedTimeInMillis;
        this.webUiAddress = builder.webUiAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Detail create() {
        return builder().build();
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return durationInMillis
     */
    public Long getDurationInMillis() {
        return this.durationInMillis;
    }

    /**
     * @return estimateExecutionCpuTimeInSeconds
     */
    public Long getEstimateExecutionCpuTimeInSeconds() {
        return this.estimateExecutionCpuTimeInSeconds;
    }

    /**
     * @return lastAttemptId
     */
    public String getLastAttemptId() {
        return this.lastAttemptId;
    }

    /**
     * @return lastUpdatedTimeInMillis
     */
    public Long getLastUpdatedTimeInMillis() {
        return this.lastUpdatedTimeInMillis;
    }

    /**
     * @return logRootPath
     */
    public String getLogRootPath() {
        return this.logRootPath;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return startedTimeInMillis
     */
    public Long getStartedTimeInMillis() {
        return this.startedTimeInMillis;
    }

    /**
     * @return submittedTimeInMillis
     */
    public Long getSubmittedTimeInMillis() {
        return this.submittedTimeInMillis;
    }

    /**
     * @return terminatedTimeInMillis
     */
    public Long getTerminatedTimeInMillis() {
        return this.terminatedTimeInMillis;
    }

    /**
     * @return webUiAddress
     */
    public String getWebUiAddress() {
        return this.webUiAddress;
    }

    public static final class Builder {
        private String appType; 
        private String DBClusterId; 
        private String data; 
        private Long durationInMillis; 
        private Long estimateExecutionCpuTimeInSeconds; 
        private String lastAttemptId; 
        private Long lastUpdatedTimeInMillis; 
        private String logRootPath; 
        private String resourceGroupName; 
        private Long startedTimeInMillis; 
        private Long submittedTimeInMillis; 
        private Long terminatedTimeInMillis; 
        private String webUiAddress; 

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * DurationInMillis.
         */
        public Builder durationInMillis(Long durationInMillis) {
            this.durationInMillis = durationInMillis;
            return this;
        }

        /**
         * EstimateExecutionCpuTimeInSeconds.
         */
        public Builder estimateExecutionCpuTimeInSeconds(Long estimateExecutionCpuTimeInSeconds) {
            this.estimateExecutionCpuTimeInSeconds = estimateExecutionCpuTimeInSeconds;
            return this;
        }

        /**
         * LastAttemptId.
         */
        public Builder lastAttemptId(String lastAttemptId) {
            this.lastAttemptId = lastAttemptId;
            return this;
        }

        /**
         * LastUpdatedTimeInMillis.
         */
        public Builder lastUpdatedTimeInMillis(Long lastUpdatedTimeInMillis) {
            this.lastUpdatedTimeInMillis = lastUpdatedTimeInMillis;
            return this;
        }

        /**
         * LogRootPath.
         */
        public Builder logRootPath(String logRootPath) {
            this.logRootPath = logRootPath;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * StartedTimeInMillis.
         */
        public Builder startedTimeInMillis(Long startedTimeInMillis) {
            this.startedTimeInMillis = startedTimeInMillis;
            return this;
        }

        /**
         * SubmittedTimeInMillis.
         */
        public Builder submittedTimeInMillis(Long submittedTimeInMillis) {
            this.submittedTimeInMillis = submittedTimeInMillis;
            return this;
        }

        /**
         * TerminatedTimeInMillis.
         */
        public Builder terminatedTimeInMillis(Long terminatedTimeInMillis) {
            this.terminatedTimeInMillis = terminatedTimeInMillis;
            return this;
        }

        /**
         * WebUiAddress.
         */
        public Builder webUiAddress(String webUiAddress) {
            this.webUiAddress = webUiAddress;
            return this;
        }

        public Detail build() {
            return new Detail(this);
        } 

    } 

}
