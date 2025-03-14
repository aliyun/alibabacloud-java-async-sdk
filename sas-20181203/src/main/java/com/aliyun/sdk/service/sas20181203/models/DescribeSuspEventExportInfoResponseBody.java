// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspEventExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventExportInfoResponseBody</p>
 */
public class DescribeSuspEventExportInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportStatus")
    private String exportStatus;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("Link")
    private String link;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private String properties;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Type")
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

        private Builder() {
        } 

        private Builder(DescribeSuspEventExportInfoResponseBody model) {
            this.exportStatus = model.exportStatus;
            this.fileName = model.fileName;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.link = model.link;
            this.progress = model.progress;
            this.properties = model.properties;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.type = model.type;
        } 

        /**
         * <p>The handling status for the exception. Valid values:</p>
         * <ul>
         * <li><strong>exporting</strong>: in progress</li>
         * <li><strong>success</strong>: successful</li>
         * <li><strong>failed</strong>: failed</li>
         * <li><strong>pending</strong>: pending</li>
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
         * <p>The name of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious_event_20221221_1671590521234.zip</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The time when the export task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-20T15:18Z</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the export task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-20T15:18Z</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The ID of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The URL at which you can download the exported Excel file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://suspicious-xxxxxxx.oss-cn-shanghai.aliyuncs.com/xxxxxxxxxxx/suspicious_event_20221221_1671590525269.zip?Expires=1671594125&OSSAccessKeyId=LTAIxxxxxxxxxxxxxx&Signature=xxxxxxxxxxxxxxxxxx">http://suspicious-xxxxxxx.oss-cn-shanghai.aliyuncs.com/xxxxxxxxxxx/suspicious_event_20221221_1671590525269.zip?Expires=1671594125&amp;OSSAccessKeyId=LTAIxxxxxxxxxxxxxx&amp;Signature=xxxxxxxxxxxxxxxxxx</a></p>
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * <p>The progress percentage of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The exported parameters of exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>id,eventSubType,eventDetail,level,status,ip,instanceName,desc,lastTime,operateTime,note</p>
         */
        public Builder properties(String properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578AXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of exceptions exported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The type of the export task. The value is fixed as suspiciousEvent.</p>
         * 
         * <strong>example:</strong>
         * <p>suspiciousEvent</p>
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
