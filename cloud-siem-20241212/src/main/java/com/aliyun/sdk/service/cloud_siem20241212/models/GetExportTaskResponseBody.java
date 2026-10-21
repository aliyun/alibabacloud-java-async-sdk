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
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>success: The export is successful.</li>
         * <li>exporting: The export is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * <p>The export type. Valid values:</p>
         * <ul>
         * <li>incident_list: incident list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>incident_list</p>
         */
        public Builder exportType(String exportType) {
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>event_1193842352994186_17344888****.xlsx</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1605076118000</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The export task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>400185</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The download URL of the exported Excel file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cloud-siem-user-dataset.oss-cn-shanghai.aliyuncs.com/export_file/17661858******5/event_17661858******5_175748****.xlsx">https://cloud-siem-user-dataset.oss-cn-shanghai.aliyuncs.com/export_file/17661858******5/event_17661858******5_175748****.xlsx</a></p>
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * <p>The export progress.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
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
