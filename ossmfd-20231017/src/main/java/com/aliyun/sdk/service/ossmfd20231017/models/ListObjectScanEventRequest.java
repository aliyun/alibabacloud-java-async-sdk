// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossmfd20231017.models;

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
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

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
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    private Long timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    private Long timeStart;

    private ListObjectScanEventRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.currentPage = builder.currentPage;
        this.eventName = builder.eventName;
        this.lang = builder.lang;
        this.md5 = builder.md5;
        this.ossKey = builder.ossKey;
        this.pageSize = builder.pageSize;
        this.parentEventId = builder.parentEventId;
        this.riskLevel = builder.riskLevel;
        this.source = builder.source;
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
        private String bucketName; 
        private Integer currentPage; 
        private String eventName; 
        private String lang; 
        private String md5; 
        private String ossKey; 
        private Integer pageSize; 
        private Long parentEventId; 
        private String riskLevel; 
        private String source; 
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectScanEventRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.currentPage = request.currentPage;
            this.eventName = request.eventName;
            this.lang = request.lang;
            this.md5 = request.md5;
            this.ossKey = request.ossKey;
            this.pageSize = request.pageSize;
            this.parentEventId = request.parentEventId;
            this.riskLevel = request.riskLevel;
            this.source = request.source;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
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
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Md5.
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ParentEventId.
         */
        public Builder parentEventId(Long parentEventId) {
            this.putQueryParameter("ParentEventId", parentEventId);
            this.parentEventId = parentEventId;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * TimeEnd.
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * TimeStart.
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
