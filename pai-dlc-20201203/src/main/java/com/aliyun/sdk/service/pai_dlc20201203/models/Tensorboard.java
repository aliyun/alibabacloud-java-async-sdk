// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Tensorboard} extends {@link TeaModel}
 *
 * <p>Tensorboard</p>
 */
public class Tensorboard extends TeaModel {
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("Duration")
    private String duration;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("SummaryPath")
    private String summaryPath;

    @NameInMap("TensorboardId")
    private String tensorboardId;

    @NameInMap("TensorboardUrl")
    private String tensorboardUrl;

    @NameInMap("UserId")
    private String userId;

    private Tensorboard(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.jobId = builder.jobId;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.summaryPath = builder.summaryPath;
        this.tensorboardId = builder.tensorboardId;
        this.tensorboardUrl = builder.tensorboardUrl;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tensorboard create() {
        return builder().build();
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
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

    /**
     * @return summaryPath
     */
    public String getSummaryPath() {
        return this.summaryPath;
    }

    /**
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    /**
     * @return tensorboardUrl
     */
    public String getTensorboardUrl() {
        return this.tensorboardUrl;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String dataSourceId; 
        private String displayName; 
        private String duration; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private String jobId; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private String status; 
        private String summaryPath; 
        private String tensorboardId; 
        private String tensorboardUrl; 
        private String userId; 

        /**
         * 数据源Id
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * 展示名称
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * 运行时长
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * 创建时间（UTC）
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * 修改时间（UTC）
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * 任务Id
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * 状态详情码
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * 状态详情
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 文件路径
         */
        public Builder summaryPath(String summaryPath) {
            this.summaryPath = summaryPath;
            return this;
        }

        /**
         * Tensorboard Id
         */
        public Builder tensorboardId(String tensorboardId) {
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * Tensorboard URL
         */
        public Builder tensorboardUrl(String tensorboardUrl) {
            this.tensorboardUrl = tensorboardUrl;
            return this;
        }

        /**
         * 创建者
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Tensorboard build() {
            return new Tensorboard(this);
        } 

    } 

}
