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
 * {@link ListOutputFilesRequest} extends {@link RequestModel}
 *
 * <p>ListOutputFilesRequest</p>
 */
public class ListOutputFilesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemType")
    private String itemType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sharedOnly")
    private Boolean sharedOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListOutputFilesRequest(Builder builder) {
        super(builder);
        this.itemType = builder.itemType;
        this.keyword = builder.keyword;
        this.operatingObjectName = builder.operatingObjectName;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.sharedOnly = builder.sharedOnly;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOutputFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
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
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sharedOnly
     */
    public Boolean getSharedOnly() {
        return this.sharedOnly;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListOutputFilesRequest, Builder> {
        private String itemType; 
        private String keyword; 
        private String operatingObjectName; 
        private Long page; 
        private Long pageSize; 
        private Boolean sharedOnly; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListOutputFilesRequest request) {
            super(request);
            this.itemType = request.itemType;
            this.keyword = request.keyword;
            this.operatingObjectName = request.operatingObjectName;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.sharedOnly = request.sharedOnly;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>产出明细类型: ppt/html/document/picture/slides/video/audio/email/others</p>
         * 
         * <strong>example:</strong>
         * <p>ppt</p>
         */
        public Builder itemType(String itemType) {
            this.putBodyParameter("itemType", itemType);
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>关键词搜索，匹配产出标题或明细名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>数字员工（运营对象）名称，按名称过滤</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
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
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量，范围 1-100</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>是否仅展示开启分享的产出和产出明细</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder sharedOnly(Boolean sharedOnly) {
            this.putBodyParameter("sharedOnly", sharedOnly);
            this.sharedOnly = sharedOnly;
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
        public ListOutputFilesRequest build() {
            return new ListOutputFilesRequest(this);
        } 

    } 

}
