// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private String proxied;

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
    public String getProxied() {
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
        private String proxied; 
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
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.putQueryParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
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
         * Proxied.
         */
        public Builder proxied(String proxied) {
            this.putQueryParameter("Proxied", proxied);
            this.proxied = proxied;
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
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Type.
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
