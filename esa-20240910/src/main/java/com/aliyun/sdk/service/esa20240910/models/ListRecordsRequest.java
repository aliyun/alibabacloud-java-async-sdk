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
    @com.aliyun.core.annotation.NameInMap("CustomPort")
    private String customPort;

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
        this.customPort = builder.customPort;
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
     * @return customPort
     */
    public String getCustomPort() {
        return this.customPort;
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
        private String customPort; 
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
            this.customPort = request.customPort;
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
         * <p>The business scenario for record acceleration. Used as a filter condition for queries. Valid values:</p>
         * <ul>
         * <li><strong>image_video</strong>: Image and video.</li>
         * <li><strong>api</strong>: API.</li>
         * <li><strong>web</strong>: Web page.</li>
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
         * CustomPort.
         */
        public Builder customPort(String customPort) {
            this.putQueryParameter("CustomPort", customPort);
            this.customPort = customPort;
            return this;
        }

        /**
         * <p>The page number for paginated queries. The value must be greater than or equal to 1. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page for paginated queries. Valid values: 1 to 500. Default value: <strong>500</strong>.</p>
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
         * <p>Specifies whether proxy acceleration is enabled for the record. Used as a filter condition for queries. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Proxy enabled.</li>
         * <li><strong>false</strong>: Proxy acceleration disabled.</li>
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
         * <p>The search matching mode for record names. Defaults to exact match. Valid values:</p>
         * <ul>
         * <li><strong>prefix</strong>: Prefix match.</li>
         * <li><strong>suffix</strong>: Suffix match.</li>
         * <li><strong>exact</strong>: Exact match.</li>
         * <li><strong>fuzzy</strong>: Fuzzy match.</li>
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
         * <p>Record name. Used as a filter condition for queries.</p>
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
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
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
         * <p>The origin type of the record. Used as a filter condition for queries (only CNAME records can be filtered by this field). Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS origin.</li>
         * <li><strong>S3</strong>: S3 origin.</li>
         * <li><strong>LB</strong>: Load balancer origin.</li>
         * <li><strong>OP</strong>: Origin pool.</li>
         * <li><strong>Domain</strong>: Standard domain origin.</li>
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
         * <p>The DNS record type of the record. Used as a filter condition for queries.</p>
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
