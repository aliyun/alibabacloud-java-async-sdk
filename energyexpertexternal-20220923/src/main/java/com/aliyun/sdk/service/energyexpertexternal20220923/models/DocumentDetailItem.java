// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link DocumentDetailItem} extends {@link TeaModel}
 *
 * <p>DocumentDetailItem</p>
 */
public class DocumentDetailItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("docHash")
    private String docHash;

    @com.aliyun.core.annotation.NameInMap("docName")
    private String docName;

    @com.aliyun.core.annotation.NameInMap("docUrl")
    private String docUrl;

    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("folderName")
    private String folderName;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("jobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("originDocName")
    private String originDocName;

    @com.aliyun.core.annotation.NameInMap("originDocUrl")
    private String originDocUrl;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private DocumentDetailItem(Builder builder) {
        this.createTime = builder.createTime;
        this.docHash = builder.docHash;
        this.docName = builder.docName;
        this.docUrl = builder.docUrl;
        this.folderId = builder.folderId;
        this.folderName = builder.folderName;
        this.id = builder.id;
        this.jobId = builder.jobId;
        this.jobStatus = builder.jobStatus;
        this.originDocName = builder.originDocName;
        this.originDocUrl = builder.originDocUrl;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentDetailItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return docHash
     */
    public String getDocHash() {
        return this.docHash;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return docUrl
     */
    public String getDocUrl() {
        return this.docUrl;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return folderName
     */
    public String getFolderName() {
        return this.folderName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return originDocName
     */
    public String getOriginDocName() {
        return this.originDocName;
    }

    /**
     * @return originDocUrl
     */
    public String getOriginDocUrl() {
        return this.originDocUrl;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String docHash; 
        private String docName; 
        private String docUrl; 
        private String folderId; 
        private String folderName; 
        private Long id; 
        private String jobId; 
        private String jobStatus; 
        private String originDocName; 
        private String originDocUrl; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(DocumentDetailItem model) {
            this.createTime = model.createTime;
            this.docHash = model.docHash;
            this.docName = model.docName;
            this.docUrl = model.docUrl;
            this.folderId = model.folderId;
            this.folderName = model.folderName;
            this.id = model.id;
            this.jobId = model.jobId;
            this.jobStatus = model.jobStatus;
            this.originDocName = model.originDocName;
            this.originDocUrl = model.originDocUrl;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * docHash.
         */
        public Builder docHash(String docHash) {
            this.docHash = docHash;
            return this;
        }

        /**
         * docName.
         */
        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        /**
         * docUrl.
         */
        public Builder docUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }

        /**
         * folderId.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * folderName.
         */
        public Builder folderName(String folderName) {
            this.folderName = folderName;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * jobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * originDocName.
         */
        public Builder originDocName(String originDocName) {
            this.originDocName = originDocName;
            return this;
        }

        /**
         * originDocUrl.
         */
        public Builder originDocUrl(String originDocUrl) {
            this.originDocUrl = originDocUrl;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DocumentDetailItem build() {
            return new DocumentDetailItem(this);
        } 

    } 

}
