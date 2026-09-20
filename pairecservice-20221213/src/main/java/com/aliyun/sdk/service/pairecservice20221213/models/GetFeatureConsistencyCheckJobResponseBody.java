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
 * {@link GetFeatureConsistencyCheckJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetFeatureConsistencyCheckJobResponseBody</p>
 */
public class GetFeatureConsistencyCheckJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
    private String featureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigName")
    private String featureConsistencyCheckJobConfigName;

    @com.aliyun.core.annotation.NameInMap("GmtEndTime")
    private String gmtEndTime;

    @com.aliyun.core.annotation.NameInMap("GmtStartTime")
    private String gmtStartTime;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<String> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetFeatureConsistencyCheckJobResponseBody(Builder builder) {
        this.config = builder.config;
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.featureConsistencyCheckJobConfigName = builder.featureConsistencyCheckJobConfigName;
        this.gmtEndTime = builder.gmtEndTime;
        this.gmtStartTime = builder.gmtStartTime;
        this.logs = builder.logs;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureConsistencyCheckJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String gmtEndTime; 
        private String gmtStartTime; 
        private java.util.List<String> logs; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetFeatureConsistencyCheckJobResponseBody model) {
            this.config = model.config;
            this.featureConsistencyCheckJobConfigId = model.featureConsistencyCheckJobConfigId;
            this.featureConsistencyCheckJobConfigName = model.featureConsistencyCheckJobConfigName;
            this.gmtEndTime = model.gmtEndTime;
            this.gmtStartTime = model.gmtStartTime;
            this.logs = model.logs;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The job config, as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the feature consistency check job configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }

        /**
         * <p>The name of the feature consistency check job configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>feature_consistency_check_1</p>
         */
        public Builder featureConsistencyCheckJobConfigName(String featureConsistencyCheckJobConfigName) {
            this.featureConsistencyCheckJobConfigName = featureConsistencyCheckJobConfigName;
            return this;
        }

        /**
         * <p>The end time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        public Builder gmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
            return this;
        }

        /**
         * <p>The start time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        public Builder gmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }

        /**
         * <p>The logs generated by the job.</p>
         */
        public Builder logs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A04CB8C0-E74A-5E83-BC61-64D153574EC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><p><code>ToRun</code>: The job is waiting to run.</p>
         * </li>
         * <li><p><code>Running</code>: The job is in progress.</p>
         * </li>
         * <li><p><code>Success</code>: The job completed successfully.</p>
         * </li>
         * <li><p><code>Failure</code>: The job failed.</p>
         * </li>
         * <li><p><code>Terminated</code>: The job was stopped or canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetFeatureConsistencyCheckJobResponseBody build() {
            return new GetFeatureConsistencyCheckJobResponseBody(this);
        } 

    } 

}
