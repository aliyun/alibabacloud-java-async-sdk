// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSiteDeliveryTasksRequest} extends {@link RequestModel}
 *
 * <p>ListSiteDeliveryTasksRequest</p>
 */
public class ListSiteDeliveryTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ListSiteDeliveryTasksRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSiteDeliveryTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListSiteDeliveryTasksRequest, Builder> {
        private String businessType; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListSiteDeliveryTasksRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.siteId = request.siteId;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456***</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListSiteDeliveryTasksRequest build() {
            return new ListSiteDeliveryTasksRequest(this);
        } 

    } 

}
