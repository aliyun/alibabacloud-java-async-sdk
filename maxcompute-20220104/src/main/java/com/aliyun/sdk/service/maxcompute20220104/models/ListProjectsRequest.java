// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectsRequest</p>
 */
public class ListProjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("listSystemCatalog")
    private Boolean listSystemCatalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxItem")
    private Integer maxItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("quotaName")
    private String quotaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("quotaNickName")
    private String quotaNickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("saleTags")
    private String saleTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListProjectsRequest(Builder builder) {
        super(builder);
        this.listSystemCatalog = builder.listSystemCatalog;
        this.marker = builder.marker;
        this.maxItem = builder.maxItem;
        this.prefix = builder.prefix;
        this.quotaName = builder.quotaName;
        this.quotaNickName = builder.quotaNickName;
        this.region = builder.region;
        this.saleTags = builder.saleTags;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listSystemCatalog
     */
    public Boolean getListSystemCatalog() {
        return this.listSystemCatalog;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItem
     */
    public Integer getMaxItem() {
        return this.maxItem;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return quotaNickName
     */
    public String getQuotaNickName() {
        return this.quotaNickName;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return saleTags
     */
    public String getSaleTags() {
        return this.saleTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListProjectsRequest, Builder> {
        private Boolean listSystemCatalog; 
        private String marker; 
        private Integer maxItem; 
        private String prefix; 
        private String quotaName; 
        private String quotaNickName; 
        private String region; 
        private String saleTags; 
        private String tenantId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectsRequest request) {
            super(request);
            this.listSystemCatalog = request.listSystemCatalog;
            this.marker = request.marker;
            this.maxItem = request.maxItem;
            this.prefix = request.prefix;
            this.quotaName = request.quotaName;
            this.quotaNickName = request.quotaNickName;
            this.region = request.region;
            this.saleTags = request.saleTags;
            this.tenantId = request.tenantId;
            this.type = request.type;
        } 

        /**
         * Specifies whether to list a project named SystemCatalog.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder listSystemCatalog(Boolean listSystemCatalog) {
            this.putQueryParameter("listSystemCatalog", listSystemCatalog);
            this.listSystemCatalog = listSystemCatalog;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder maxItem(Integer maxItem) {
            this.putQueryParameter("maxItem", maxItem);
            this.maxItem = maxItem;
            return this;
        }

        /**
         * Specifies the marker after which the returned list begins.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * The name of the quota. The value of this parameter is the identifier of the quota in MaxCompute, which differs from the quotaNickname parameter. You can configure the quotaNickname parameter. The system automatically generates a value for the quotaName parameter. This parameter is only used to describe the tunnel quota.
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("quotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * The name of the quota.
         */
        public Builder quotaNickName(String quotaNickName) {
            this.putQueryParameter("quotaNickName", quotaNickName);
            this.quotaNickName = quotaNickName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.
         */
        public Builder saleTags(String saleTags) {
            this.putQueryParameter("saleTags", saleTags);
            this.saleTags = saleTags;
            return this;
        }

        /**
         * The tenant ID.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The project type. Valid values: external and managed. The value external indicates an external project, which is used in the data lakehouse solution. The value managed indicates an internal project.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListProjectsRequest build() {
            return new ListProjectsRequest(this);
        } 

    } 

}
