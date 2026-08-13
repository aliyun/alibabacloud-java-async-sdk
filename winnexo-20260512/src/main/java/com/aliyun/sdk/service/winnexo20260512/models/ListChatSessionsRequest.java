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
 * {@link ListChatSessionsRequest} extends {@link RequestModel}
 *
 * <p>ListChatSessionsRequest</p>
 */
public class ListChatSessionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListChatSessionsRequest(Builder builder) {
        super(builder);
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.keyword = builder.keyword;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatSessionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListChatSessionsRequest, Builder> {
        private String digitalEmployeeName; 
        private String keyword; 
        private Integer page; 
        private Integer pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListChatSessionsRequest request) {
            super(request);
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.keyword = request.keyword;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>数字员工名称筛选（逗号分隔，如 sales_agent,service_agent）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.putQueryParameter("digitalEmployeeName", digitalEmployeeName);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>标题模糊搜索</p>
         * 
         * <strong>example:</strong>
         * <p>示例关键词</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>页码，从 1 开始</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>租户ID</p>
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
        public ListChatSessionsRequest build() {
            return new ListChatSessionsRequest(this);
        } 

    } 

}
