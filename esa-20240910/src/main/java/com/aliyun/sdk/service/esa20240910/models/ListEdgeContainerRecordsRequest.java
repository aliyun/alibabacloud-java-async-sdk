// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEdgeContainerRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListEdgeContainerRecordsRequest</p>
 */
public class ListEdgeContainerRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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

    private ListEdgeContainerRecordsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recordMatchType = builder.recordMatchType;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeContainerRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListEdgeContainerRecordsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String recordMatchType; 
        private String recordName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListEdgeContainerRecordsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.recordMatchType = request.recordMatchType;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RecordMatchType.
         */
        public Builder recordMatchType(String recordMatchType) {
            this.putQueryParameter("RecordMatchType", recordMatchType);
            this.recordMatchType = recordMatchType;
            return this;
        }

        /**
         * RecordName.
         */
        public Builder recordName(String recordName) {
            this.putQueryParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
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

        @Override
        public ListEdgeContainerRecordsRequest build() {
            return new ListEdgeContainerRecordsRequest(this);
        } 

    } 

}
