// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetScheduledPreloadJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduledPreloadJobResponseBody</p>
 */
public class GetScheduledPreloadJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Domains")
    private String domains;

    @com.aliyun.core.annotation.NameInMap("ErrorInfo")
    private String errorInfo;

    @com.aliyun.core.annotation.NameInMap("FailedFileOss")
    private String failedFileOss;

    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("InsertWay")
    private String insertWay;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("TaskSubmitted")
    private Integer taskSubmitted;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("UrlCount")
    private Integer urlCount;

    @com.aliyun.core.annotation.NameInMap("UrlSubmitted")
    private Integer urlSubmitted;

    private GetScheduledPreloadJobResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.createdAt = builder.createdAt;
        this.domains = builder.domains;
        this.errorInfo = builder.errorInfo;
        this.failedFileOss = builder.failedFileOss;
        this.fileId = builder.fileId;
        this.id = builder.id;
        this.insertWay = builder.insertWay;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.taskSubmitted = builder.taskSubmitted;
        this.taskType = builder.taskType;
        this.urlCount = builder.urlCount;
        this.urlSubmitted = builder.urlSubmitted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledPreloadJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return domains
     */
    public String getDomains() {
        return this.domains;
    }

    /**
     * @return errorInfo
     */
    public String getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * @return failedFileOss
     */
    public String getFailedFileOss() {
        return this.failedFileOss;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return insertWay
     */
    public String getInsertWay() {
        return this.insertWay;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return taskSubmitted
     */
    public Integer getTaskSubmitted() {
        return this.taskSubmitted;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return urlCount
     */
    public Integer getUrlCount() {
        return this.urlCount;
    }

    /**
     * @return urlSubmitted
     */
    public Integer getUrlSubmitted() {
        return this.urlSubmitted;
    }

    public static final class Builder {
        private String aliUid; 
        private String createdAt; 
        private String domains; 
        private String errorInfo; 
        private String failedFileOss; 
        private String fileId; 
        private String id; 
        private String insertWay; 
        private String name; 
        private String requestId; 
        private Long siteId; 
        private Integer taskSubmitted; 
        private String taskType; 
        private Integer urlCount; 
        private Integer urlSubmitted; 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Domains.
         */
        public Builder domains(String domains) {
            this.domains = domains;
            return this;
        }

        /**
         * ErrorInfo.
         */
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * FailedFileOss.
         */
        public Builder failedFileOss(String failedFileOss) {
            this.failedFileOss = failedFileOss;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * InsertWay.
         */
        public Builder insertWay(String insertWay) {
            this.insertWay = insertWay;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * TaskSubmitted.
         */
        public Builder taskSubmitted(Integer taskSubmitted) {
            this.taskSubmitted = taskSubmitted;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * UrlCount.
         */
        public Builder urlCount(Integer urlCount) {
            this.urlCount = urlCount;
            return this;
        }

        /**
         * UrlSubmitted.
         */
        public Builder urlSubmitted(Integer urlSubmitted) {
            this.urlSubmitted = urlSubmitted;
            return this;
        }

        public GetScheduledPreloadJobResponseBody build() {
            return new GetScheduledPreloadJobResponseBody(this);
        } 

    } 

}
