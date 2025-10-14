// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetExportTaskResponseBody</p>
 */
public class GetExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportStatus")
    private String exportStatus;

    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Link")
    private String link;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetExportTaskResponseBody(Builder builder) {
        this.exportStatus = builder.exportStatus;
        this.exportType = builder.exportType;
        this.fileName = builder.fileName;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.link = builder.link;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportStatus
     */
    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return link
     */
    public String getLink() {
        return this.link;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String exportStatus; 
        private String exportType; 
        private String fileName; 
        private String gmtCreate; 
        private Long id; 
        private String link; 
        private Integer progress; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetExportTaskResponseBody model) {
            this.exportStatus = model.exportStatus;
            this.exportType = model.exportType;
            this.fileName = model.fileName;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.link = model.link;
            this.progress = model.progress;
            this.requestId = model.requestId;
        } 

        /**
         * ExportStatus.
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * ExportType.
         */
        public Builder exportType(String exportType) {
            this.exportType = exportType;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Link.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExportTaskResponseBody build() {
            return new GetExportTaskResponseBody(this);
        } 

    } 

}
