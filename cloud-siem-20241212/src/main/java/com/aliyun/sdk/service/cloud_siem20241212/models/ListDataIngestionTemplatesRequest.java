// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListDataIngestionTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListDataIngestionTemplatesRequest</p>
 */
public class ListDataIngestionTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateStatus")
    private String dataIngestionTemplateStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceTemplateIds")
    private String dataSourceTemplateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ListDataIngestionTemplatesRequest(Builder builder) {
        super(builder);
        this.dataIngestionTemplateStatus = builder.dataIngestionTemplateStatus;
        this.dataSourceTemplateIds = builder.dataSourceTemplateIds;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataIngestionTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIngestionTemplateStatus
     */
    public String getDataIngestionTemplateStatus() {
        return this.dataIngestionTemplateStatus;
    }

    /**
     * @return dataSourceTemplateIds
     */
    public String getDataSourceTemplateIds() {
        return this.dataSourceTemplateIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<ListDataIngestionTemplatesRequest, Builder> {
        private String dataIngestionTemplateStatus; 
        private String dataSourceTemplateIds; 
        private String lang; 
        private String pageNumber; 
        private String pageSize; 
        private String productId; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ListDataIngestionTemplatesRequest request) {
            super(request);
            this.dataIngestionTemplateStatus = request.dataIngestionTemplateStatus;
            this.dataSourceTemplateIds = request.dataSourceTemplateIds;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * DataIngestionTemplateStatus.
         */
        public Builder dataIngestionTemplateStatus(String dataIngestionTemplateStatus) {
            this.putBodyParameter("DataIngestionTemplateStatus", dataIngestionTemplateStatus);
            this.dataIngestionTemplateStatus = dataIngestionTemplateStatus;
            return this;
        }

        /**
         * DataSourceTemplateIds.
         */
        public Builder dataSourceTemplateIds(String dataSourceTemplateIds) {
            this.putBodyParameter("DataSourceTemplateIds", dataSourceTemplateIds);
            this.dataSourceTemplateIds = dataSourceTemplateIds;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public ListDataIngestionTemplatesRequest build() {
            return new ListDataIngestionTemplatesRequest(this);
        } 

    } 

}
