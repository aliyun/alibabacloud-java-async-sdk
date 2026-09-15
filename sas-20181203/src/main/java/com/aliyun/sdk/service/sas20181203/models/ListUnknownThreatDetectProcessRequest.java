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
 * {@link ListUnknownThreatDetectProcessRequest} extends {@link RequestModel}
 *
 * <p>ListUnknownThreatDetectProcessRequest</p>
 */
public class ListUnknownThreatDetectProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnalyzeResult")
    private String analyzeResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstTimeEnd")
    private Long firstTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstTimeStart")
    private Long firstTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5")
    private String md5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessPath")
    private String processPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sha256")
    private String sha256;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListUnknownThreatDetectProcessRequest(Builder builder) {
        super(builder);
        this.analyzeResult = builder.analyzeResult;
        this.currentPage = builder.currentPage;
        this.firstTimeEnd = builder.firstTimeEnd;
        this.firstTimeStart = builder.firstTimeStart;
        this.md5 = builder.md5;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.processPath = builder.processPath;
        this.remark = builder.remark;
        this.sha256 = builder.sha256;
        this.tag = builder.tag;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnknownThreatDetectProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analyzeResult
     */
    public String getAnalyzeResult() {
        return this.analyzeResult;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return firstTimeEnd
     */
    public Long getFirstTimeEnd() {
        return this.firstTimeEnd;
    }

    /**
     * @return firstTimeStart
     */
    public Long getFirstTimeStart() {
        return this.firstTimeStart;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return processPath
     */
    public String getProcessPath() {
        return this.processPath;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sha256
     */
    public String getSha256() {
        return this.sha256;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListUnknownThreatDetectProcessRequest, Builder> {
        private String analyzeResult; 
        private Integer currentPage; 
        private Long firstTimeEnd; 
        private Long firstTimeStart; 
        private String md5; 
        private Integer pageSize; 
        private String path; 
        private String processPath; 
        private String remark; 
        private String sha256; 
        private String tag; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListUnknownThreatDetectProcessRequest request) {
            super(request);
            this.analyzeResult = request.analyzeResult;
            this.currentPage = request.currentPage;
            this.firstTimeEnd = request.firstTimeEnd;
            this.firstTimeStart = request.firstTimeStart;
            this.md5 = request.md5;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.processPath = request.processPath;
            this.remark = request.remark;
            this.sha256 = request.sha256;
            this.tag = request.tag;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The analysis result. Valid values:</p>
         * <ul>
         * <li><strong>black</strong>: abnormal process</li>
         * <li><strong>white</strong>: normal process</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        public Builder analyzeResult(String analyzeResult) {
            this.putQueryParameter("AnalyzeResult", analyzeResult);
            this.analyzeResult = analyzeResult;
            return this;
        }

        /**
         * <p>The page number of the current page when using paged query. This is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range during which the process was first detected. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1768891966345</p>
         */
        public Builder firstTimeEnd(Long firstTimeEnd) {
            this.putQueryParameter("FirstTimeEnd", firstTimeEnd);
            this.firstTimeEnd = firstTimeEnd;
            return this;
        }

        /**
         * <p>The start of the time range during which the process was first detected. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1768891966344</p>
         */
        public Builder firstTimeStart(Long firstTimeStart) {
            this.putQueryParameter("FirstTimeStart", firstTimeStart);
            this.firstTimeStart = firstTimeStart;
            return this;
        }

        /**
         * <p>The MD5 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>0552c44e243abdea1729d4507bce****</p>
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * <p>The maximum number of entries per page when using paged query. This is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/test</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The process path.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/rm</p>
         */
        public Builder processPath(String processPath) {
            this.putQueryParameter("ProcessPath", processPath);
            this.processPath = processPath;
            return this;
        }

        /**
         * <p>The server name or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The SHA-256 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>f204693a7d2ce99d6c4434e550d985ee1c7be7cb5dd9a76094369af0d2******</p>
         */
        public Builder sha256(String sha256) {
            this.putQueryParameter("Sha256", sha256);
            this.sha256 = sha256;
            return this;
        }

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>Process Tag</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The UUID of the server to query.</p>
         * 
         * <strong>example:</strong>
         * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListUnknownThreatDetectProcessRequest build() {
            return new ListUnknownThreatDetectProcessRequest(this);
        } 

    } 

}
