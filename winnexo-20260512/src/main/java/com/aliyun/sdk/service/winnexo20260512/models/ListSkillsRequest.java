// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListSkillsRequest} extends {@link RequestModel}
 *
 * <p>ListSkillsRequest</p>
 */
public class ListSkillsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bindStatus")
    private String bindStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filterType")
    private String filterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListSkillsRequest(Builder builder) {
        super(builder);
        this.bindStatus = builder.bindStatus;
        this.filterType = builder.filterType;
        this.keyword = builder.keyword;
        this.operatingObjectName = builder.operatingObjectName;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.tags = builder.tags;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindStatus
     */
    public String getBindStatus() {
        return this.bindStatus;
    }

    /**
     * @return filterType
     */
    public String getFilterType() {
        return this.filterType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListSkillsRequest, Builder> {
        private String bindStatus; 
        private String filterType; 
        private String keyword; 
        private String operatingObjectName; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<String> tags; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillsRequest request) {
            super(request);
            this.bindStatus = request.bindStatus;
            this.filterType = request.filterType;
            this.keyword = request.keyword;
            this.operatingObjectName = request.operatingObjectName;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.tags = request.tags;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>绑定状态：BOUND(已绑定) / UNBOUND(未绑定的全局技能)；必须与 operatingObjectName 同时传入</p>
         * 
         * <strong>example:</strong>
         * <p>BOUND</p>
         */
        public Builder bindStatus(String bindStatus) {
            this.putBodyParameter("bindStatus", bindStatus);
            this.bindStatus = bindStatus;
            return this;
        }

        /**
         * <p>技能筛选维度：ALL/BUILTIN/CUSTOM/DRAFT/ALL_WITH_DRAFTS</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder filterType(String filterType) {
            this.putBodyParameter("filterType", filterType);
            this.filterType = filterType;
            return this;
        }

        /**
         * <p>按技能名称或描述模糊匹配</p>
         * 
         * <strong>example:</strong>
         * <p>示例关键词</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>数字员工名称；必须与 bindStatus 同时传入</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>页码，从 1 开始</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder page(Integer page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量，范围 1-100</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>按标签过滤，数组任一命中即匹配</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putBodyParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListSkillsRequest build() {
            return new ListSkillsRequest(this);
        } 

    } 

}
