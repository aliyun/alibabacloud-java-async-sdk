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
 * {@link ListTransportLayerApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListTransportLayerApplicationsRequest</p>
 */
public class ListTransportLayerApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordName")
    private String recordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ListTransportLayerApplicationsRequest(Builder builder) {
        super(builder);
        this.matchType = builder.matchType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransportLayerApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
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

    public static final class Builder extends Request.Builder<ListTransportLayerApplicationsRequest, Builder> {
        private String matchType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String recordName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransportLayerApplicationsRequest request) {
            super(request);
            this.matchType = request.matchType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Query type for the transport layer application host record, supporting the following 4 types, with exact query as the default.</p>
         * <ul>
         * <li>fuzzy: Fuzzy query.</li>
         * <li>exact: Exact query.</li>
         * <li>prefix: Prefix match query.</li>
         * <li>suffix: Suffix match query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fuzzy</p>
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>Page number set for pagination. Starting value: 1. Default value: 1.</p>
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
         * <p>Page size. The maximum value is 500.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Host record of the transport layer application.</p>
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
         * <p>123456******</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListTransportLayerApplicationsRequest build() {
            return new ListTransportLayerApplicationsRequest(this);
        } 

    } 

}
