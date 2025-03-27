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
 * {@link ListRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListRecordsRequest</p>
 */
public class ListRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proxied")
    private Boolean proxied;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordMatchType")
    private String recordMatchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordName")
    private String recordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListRecordsRequest(Builder builder) {
        super(builder);
        this.bizName = builder.bizName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.proxied = builder.proxied;
        this.recordMatchType = builder.recordMatchType;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
        this.sourceType = builder.sourceType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return proxied
     */
    public Boolean getProxied() {
        return this.proxied;
    }

    /**
     * @return recordMatchType
     */
    public String getRecordMatchType() {
        return this.recordMatchType;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListRecordsRequest, Builder> {
        private String bizName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean proxied; 
        private String recordMatchType; 
        private String recordName; 
        private Long siteId; 
        private String sourceType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListRecordsRequest request) {
            super(request);
            this.bizName = request.bizName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.proxied = request.proxied;
            this.recordMatchType = request.recordMatchType;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
            this.sourceType = request.sourceType;
            this.type = request.type;
        } 

        /**
         * <p>The business scenario of the record for acceleration. Valid values:</p>
         * <ul>
         * <li><strong>image_video</strong>: video and image.</li>
         * <li><strong>api</strong>: API.</li>
         * <li><strong>web</strong>: web page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        public Builder bizName(String bizName) {
            this.putQueryParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>500</strong>.</p>
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
         * <p>Filters by whether the record is proxied. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder proxied(Boolean proxied) {
            this.putQueryParameter("Proxied", proxied);
            this.proxied = proxied;
            return this;
        }

        /**
         * <p>The match mode to search for the record name. Default value: exact. Valid values:</p>
         * <ul>
         * <li><strong>prefix</strong>: match by prefix.</li>
         * <li><strong>suffix</strong>: match by suffix.</li>
         * <li><strong>exact</strong>: exact match.</li>
         * <li><strong>fuzzy</strong>: fuzzy match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fuzzy</p>
         */
        public Builder recordMatchType(String recordMatchType) {
            this.putQueryParameter("RecordMatchType", recordMatchType);
            this.recordMatchType = recordMatchType;
            return this;
        }

        /**
         * <p>The record name. This parameter specifies a filter condition for the query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder recordName(String recordName) {
            this.putQueryParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The origin type of the record. Only CNAME records can be filtered by using this field. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS bucket.</li>
         * <li><strong>S3</strong>: S3 bucket.</li>
         * <li><strong>LB</strong>: load balancer.</li>
         * <li><strong>OP</strong>: origin pool.</li>
         * <li><strong>Domain</strong>: domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The DNS record type.</p>
         * 
         * <strong>example:</strong>
         * <p>CNAME</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListRecordsRequest build() {
            return new ListRecordsRequest(this);
        } 

    } 

}
