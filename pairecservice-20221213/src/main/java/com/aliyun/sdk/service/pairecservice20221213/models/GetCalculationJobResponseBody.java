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
 * {@link GetCalculationJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetCalculationJobResponseBody</p>
 */
public class GetCalculationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ABMetricId")
    private String ABMetricId;

    @com.aliyun.core.annotation.NameInMap("ABMetricName")
    private String ABMetricName;

    @com.aliyun.core.annotation.NameInMap("BizDate")
    private String bizDate;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("GmtRanTime")
    private String gmtRanTime;

    @com.aliyun.core.annotation.NameInMap("JobMessage")
    private java.util.List<String> jobMessage;

    @com.aliyun.core.annotation.NameInMap("JobSource")
    private String jobSource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetCalculationJobResponseBody(Builder builder) {
        this.ABMetricId = builder.ABMetricId;
        this.ABMetricName = builder.ABMetricName;
        this.bizDate = builder.bizDate;
        this.config = builder.config;
        this.gmtRanTime = builder.gmtRanTime;
        this.jobMessage = builder.jobMessage;
        this.jobSource = builder.jobSource;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCalculationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricId
     */
    public String getABMetricId() {
        return this.ABMetricId;
    }

    /**
     * @return ABMetricName
     */
    public String getABMetricName() {
        return this.ABMetricName;
    }

    /**
     * @return bizDate
     */
    public String getBizDate() {
        return this.bizDate;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return gmtRanTime
     */
    public String getGmtRanTime() {
        return this.gmtRanTime;
    }

    /**
     * @return jobMessage
     */
    public java.util.List<String> getJobMessage() {
        return this.jobMessage;
    }

    /**
     * @return jobSource
     */
    public String getJobSource() {
        return this.jobSource;
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
        private String ABMetricId; 
        private String ABMetricName; 
        private String bizDate; 
        private String config; 
        private String gmtRanTime; 
        private java.util.List<String> jobMessage; 
        private String jobSource; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetCalculationJobResponseBody model) {
            this.ABMetricId = model.ABMetricId;
            this.ABMetricName = model.ABMetricName;
            this.bizDate = model.bizDate;
            this.config = model.config;
            this.gmtRanTime = model.gmtRanTime;
            this.jobMessage = model.jobMessage;
            this.jobSource = model.jobSource;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the AB metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ABMetricId(String ABMetricId) {
            this.ABMetricId = ABMetricId;
            return this;
        }

        /**
         * <p>The name of the AB metric.</p>
         * 
         * <strong>example:</strong>
         * <p>pv</p>
         */
        public Builder ABMetricName(String ABMetricName) {
            this.ABMetricName = ABMetricName;
            return this;
        }

        /**
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15</p>
         */
        public Builder bizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }

        /**
         * <p>The job configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The runtime of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        public Builder gmtRanTime(String gmtRanTime) {
            this.gmtRanTime = gmtRanTime;
            return this;
        }

        /**
         * <p>The job messages.</p>
         */
        public Builder jobMessage(java.util.List<String> jobMessage) {
            this.jobMessage = jobMessage;
            return this;
        }

        /**
         * <p>The job source. Valid values:</p>
         * <ul>
         * <li><p>CronOffline: An offline cron job.</p>
         * </li>
         * <li><p>DataRerun: A data rerun task.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CronOffline</p>
         */
        public Builder jobSource(String jobSource) {
            this.jobSource = jobSource;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7D59453C-48AA-5FC5-8848-2D373BD1A17F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the calculation job. Valid values:</p>
         * <ul>
         * <li><p>Success: The job completed successfully.</p>
         * </li>
         * <li><p>Failure: The job failed.</p>
         * </li>
         * <li><p>Initializing: The job is initializing.</p>
         * </li>
         * <li><p>Running: The job is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetCalculationJobResponseBody build() {
            return new GetCalculationJobResponseBody(this);
        } 

    } 

}
