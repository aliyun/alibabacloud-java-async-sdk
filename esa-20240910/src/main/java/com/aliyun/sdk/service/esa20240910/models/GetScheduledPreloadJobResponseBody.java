// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>15685865xxx14622</p>
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-02T02:23:26Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The domain names to be prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p>testurl.com</p>
         */
        public Builder domains(String domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid domain:test.com</p>
         */
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * <p>The URL of the OSS object that stores a list of URLs that failed the conditional check for prefetching.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
         */
        public Builder failedFileOss(String failedFileOss) {
            this.failedFileOss = failedFileOss;
            return this;
        }

        /**
         * <p>The ID of the URL list file, which can be used during downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>665d3b48621bccf3fe29e1a7</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The ID of the prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>665d3af3621bccf3fe29e1a4</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The method to submit the URLs to be prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder insertWay(String insertWay) {
            this.insertWay = insertWay;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>190007158391808</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The number of submitted prefetch tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskSubmitted(Integer taskSubmitted) {
            this.taskSubmitted = taskSubmitted;
            return this;
        }

        /**
         * <p>The task type. Valid values: refresh and preload.</p>
         * 
         * <strong>example:</strong>
         * <p>preload</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The total number of URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder urlCount(Integer urlCount) {
            this.urlCount = urlCount;
            return this;
        }

        /**
         * <p>The number of submitted URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
