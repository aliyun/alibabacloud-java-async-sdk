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
 * {@link ListCustomHostnamesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomHostnamesRequest</p>
 */
public class ListCustomHostnamesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameMatchType")
    private String nameMatchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListCustomHostnamesRequest(Builder builder) {
        super(builder);
        this.hostname = builder.hostname;
        this.nameMatchType = builder.nameMatchType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recordId = builder.recordId;
        this.siteId = builder.siteId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomHostnamesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return nameMatchType
     */
    public String getNameMatchType() {
        return this.nameMatchType;
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
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCustomHostnamesRequest, Builder> {
        private String hostname; 
        private String nameMatchType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long recordId; 
        private Long siteId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomHostnamesRequest request) {
            super(request);
            this.hostname = request.hostname;
            this.nameMatchType = request.nameMatchType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.recordId = request.recordId;
            this.siteId = request.siteId;
            this.status = request.status;
        } 

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * NameMatchType.
         */
        public Builder nameMatchType(String nameMatchType) {
            this.putQueryParameter("NameMatchType", nameMatchType);
            this.nameMatchType = nameMatchType;
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
         * RecordId.
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>744571165985008</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCustomHostnamesRequest build() {
            return new ListCustomHostnamesRequest(this);
        } 

    } 

}
