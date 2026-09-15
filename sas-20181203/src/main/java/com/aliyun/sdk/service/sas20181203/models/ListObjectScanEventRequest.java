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
 * {@link ListObjectScanEventRequest} extends {@link RequestModel}
 *
 * <p>ListObjectScanEventRequest</p>
 */
public class ListObjectScanEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiDetect")
    private Boolean aiDetect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchType")
    private String batchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5")
    private String md5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentEventId")
    private Long parentEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    private Long timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    private Long timeStart;

    private ListObjectScanEventRequest(Builder builder) {
        super(builder);
        this.aiDetect = builder.aiDetect;
        this.batchType = builder.batchType;
        this.bucketName = builder.bucketName;
        this.currentPage = builder.currentPage;
        this.eventId = builder.eventId;
        this.eventName = builder.eventName;
        this.lang = builder.lang;
        this.md5 = builder.md5;
        this.ossKey = builder.ossKey;
        this.pageSize = builder.pageSize;
        this.parentEventId = builder.parentEventId;
        this.riskLevel = builder.riskLevel;
        this.source = builder.source;
        this.status = builder.status;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectScanEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiDetect
     */
    public Boolean getAiDetect() {
        return this.aiDetect;
    }

    /**
     * @return batchType
     */
    public String getBatchType() {
        return this.batchType;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentEventId
     */
    public Long getParentEventId() {
        return this.parentEventId;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return timeEnd
     */
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public Long getTimeStart() {
        return this.timeStart;
    }

    public static final class Builder extends Request.Builder<ListObjectScanEventRequest, Builder> {
        private Boolean aiDetect; 
        private String batchType; 
        private String bucketName; 
        private Integer currentPage; 
        private Long eventId; 
        private String eventName; 
        private String lang; 
        private String md5; 
        private String ossKey; 
        private Integer pageSize; 
        private Long parentEventId; 
        private String riskLevel; 
        private String source; 
        private Integer status; 
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectScanEventRequest request) {
            super(request);
            this.aiDetect = request.aiDetect;
            this.batchType = request.batchType;
            this.bucketName = request.bucketName;
            this.currentPage = request.currentPage;
            this.eventId = request.eventId;
            this.eventName = request.eventName;
            this.lang = request.lang;
            this.md5 = request.md5;
            this.ossKey = request.ossKey;
            this.pageSize = request.pageSize;
            this.parentEventId = request.parentEventId;
            this.riskLevel = request.riskLevel;
            this.source = request.source;
            this.status = request.status;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * <p>Specifies whether the alert was detected by AI. Valid values:</p>
         * <ul>
         * <li>true: The alert was detected by AI.</li>
         * <li>false: The alert was not detected by AI.</li>
         * </ul>
         */
        public Builder aiDetect(Boolean aiDetect) {
            this.putQueryParameter("AiDetect", aiDetect);
            this.aiDetect = aiDetect;
            return this;
        }

        /**
         * <p>The batch operation type. Valid values:</p>
         * <ul>
         * <li><p><strong>sha256</strong>: same file content.</p>
         * </li>
         * <li><p><strong>eventName</strong>: same alerting type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sha256</p>
         */
        public Builder batchType(String batchType) {
            this.putQueryParameter("BatchType", batchType);
            this.batchType = batchType;
            return this;
        }

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>ltrbuck****</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query.</p>
         * <p>This parameter is required.</p>
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
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8925****</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The alert name.</p>
         * 
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * <p>The storage key of the file in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page in a paging query.</p>
         * <p>This parameter is required.</p>
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
         * <p>If the file is a sub-file within a compressed archive, <strong>ParentEventId</strong> specifies the event ID of the alert for the compressed archive itself.</p>
         * <p>To retrieve and query alert events for sub-files within a compressed archive:</p>
         * <ol>
         * <li>Call this operation and check the <strong>HasSubEvent</strong> response parameter. If the value is <strong>true</strong>, the corresponding <strong>EventId</strong> is the event ID of the alert for the compressed archive itself.</li>
         * <li>Call this operation again and pass the <strong>EventId</strong> value to <strong>ParentEventId</strong> to view the alert events for the sub-files within the compressed archive.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parentEventId(Long parentEventId) {
            this.putQueryParameter("ParentEventId", parentEventId);
            this.parentEventId = parentEventId;
            return this;
        }

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>high</strong>: High risk.</p>
         * </li>
         * <li><p><strong>medium</strong>: Medium risk.</p>
         * </li>
         * <li><p><strong>low</strong>: Low risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li><strong>API</strong>: API-based detection.</li>
         * <li><strong>OSS</strong>: OSS-based detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li>0: Unhandled. </li>
         * <li>1: Manually handled.</li>
         * <li>2: Whitelisted.</li>
         * <li>3: Ignored.</li>
         * <li>4: Access blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The end time of the time range during which the anomalous event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>1683862286000</p>
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * <p>The start time of the time range during which the anomalous event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>1683603086000</p>
         */
        public Builder timeStart(Long timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        @Override
        public ListObjectScanEventRequest build() {
            return new ListObjectScanEventRequest(this);
        } 

    } 

}
