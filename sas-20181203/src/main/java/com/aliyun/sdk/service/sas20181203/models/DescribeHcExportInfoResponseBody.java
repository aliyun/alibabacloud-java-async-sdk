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
 * {@link DescribeHcExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHcExportInfoResponseBody</p>
 */
public class DescribeHcExportInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentCount")
    private Integer currentCount;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Link")
    private String link;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultStatus")
    private String resultStatus;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHcExportInfoResponseBody(Builder builder) {
        this.currentCount = builder.currentCount;
        this.fileName = builder.fileName;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.link = builder.link;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.resultStatus = builder.resultStatus;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHcExportInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return this.currentCount;
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

    /**
     * @return resultStatus
     */
    public String getResultStatus() {
        return this.resultStatus;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentCount; 
        private String fileName; 
        private Long gmtCreate; 
        private Long id; 
        private String link; 
        private Integer progress; 
        private String requestId; 
        private String resultStatus; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHcExportInfoResponseBody model) {
            this.currentCount = model.currentCount;
            this.fileName = model.fileName;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.link = model.link;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.resultStatus = model.resultStatus;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of exported entries.</p>
         * 
         * <strong>example:</strong>
         * <p>148</p>
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * <p>The name of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>health_check_export_2022****</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The time when the export task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-03T15:15Z</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The ID of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>1082278</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The download URL for the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://hc-export.oss-cn-shanghai.aliyuncs.com/export_hc/health_check_export_20221222_1671699255808.zip?Expires=1672304056&OSSAccessKeyId=****&Signature=">https://hc-export.oss-cn-shanghai.aliyuncs.com/export_hc/health_check_export_20221222_1671699255808.zip?Expires=1672304056&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * <p>The progress percentage of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3C2C94CF-ED08-50C0-BC72-C5029251****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the export task. Valid values:</p>
         * <ul>
         * <li><strong>exporting</strong>: The task is in progress.</li>
         * <li><strong>success</strong>: The task is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exporting</p>
         */
        public Builder resultStatus(String resultStatus) {
            this.resultStatus = resultStatus;
            return this;
        }

        /**
         * <p>The total number of exported entries.</p>
         * 
         * <strong>example:</strong>
         * <p>624</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHcExportInfoResponseBody build() {
            return new DescribeHcExportInfoResponseBody(this);
        } 

    } 

}
