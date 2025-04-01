// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
         * <p>Specifies whether to list the built-in <strong>SYSTEM_CATALOG</strong> projects that are used to provide data such as project metadata and historical usage data. For more information, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tenant-level-information-schema">Tenant-level Information Schema</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The built-in SYSTEM_CATALOG projects are listed.</li>
         * <li>false: The built-in SYSTEM_CATALOG projects are not listed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder listSystemCatalog(Boolean listSystemCatalog) {
            this.putQueryParameter("listSystemCatalog", listSystemCatalog);
            this.listSystemCatalog = listSystemCatalog;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxItem(Integer maxItem) {
            this.putQueryParameter("maxItem", maxItem);
            this.maxItem = maxItem;
            return this;
        }

        /**
         * <p>Specifies the marker after which the returned list begins.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The quota name that is automatically generated. You can log on to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a>, choose <strong>Workspace</strong> &gt; <strong>Quotas</strong> from the left-side navigation pane, and then view the quota name on the <strong>Quotas</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;hsajkdgbkaubh&quot;</p>
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("quotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * <p>The quota nickname. You can log on to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a>, choose <strong>Workspace</strong> &gt; <strong>Quotas</strong> from the left-side navigation pane, and then view the quota nickname on the <strong>Quotas</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>quotaA</p>
         */
        public Builder quotaNickName(String quotaNickName) {
            this.putQueryParameter("quotaNickName", quotaNickName);
            this.quotaNickName = quotaNickName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The instance ID and billing method of the default computing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;aaaa-bbbb&quot;</p>
         */
        public Builder saleTags(String saleTags) {
            this.putQueryParameter("saleTags", saleTags);
            this.saleTags = saleTags;
            return this;
        }

        /**
         * <p>The tenant ID. You can log on to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a>, and choose <strong>Tenants</strong> &gt; <strong>Tenant Property</strong> from the left-side navigation pane to view the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>549532154333697</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The project type. Valid values:</p>
         * <ul>
         * <li><strong>managed</strong>: internal project</li>
         * <li><strong>external</strong>: external project</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;managed&quot;</p>
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
