// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventExportInfoResponseBody</p>
 */
public class DescribeSuspEventExportInfoResponseBody extends TeaModel {
    @NameInMap("ExportStatus")
    private String exportStatus;

    @NameInMap("FileName")
    private String fileName;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Id")
    private Integer id;

    @NameInMap("Link")
    private String link;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("Properties")
    private String properties;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Type")
    private String type;

    private DescribeSuspEventExportInfoResponseBody(Builder builder) {
        this.exportStatus = builder.exportStatus;
        this.fileName = builder.fileName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.link = builder.link;
        this.progress = builder.progress;
        this.properties = builder.properties;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventExportInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return exportStatus
     */
    public String getExportStatus() {
        return this.exportStatus;
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
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Integer getId() {
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
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String exportStatus; 
        private String fileName; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private Integer id; 
        private String link; 
        private Integer progress; 
        private String properties; 
        private String requestId; 
        private Integer totalCount; 
        private String type; 

        /**
         * The handling status for the exception. Valid values:
         * <p>
         * 
         * *   **processing**: in progress
         * *   **success**: successful
         * *   **failed**: failed
         * *   **pending**: pending
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * The name of the exported file.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * The time when the export task was created.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * The time when the export task was modified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * The ID of the export task.
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * The URL at which you can download the exported Excel file.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * The progress percentage of the export task.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * The exported parameters of exceptions.
         */
        public Builder properties(String properties) {
            this.properties = properties;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of exceptions exported.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The type of the export task. The value is fixed as suspiciousEvent.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeSuspEventExportInfoResponseBody build() {
            return new DescribeSuspEventExportInfoResponseBody(this);
        } 

    } 

}
