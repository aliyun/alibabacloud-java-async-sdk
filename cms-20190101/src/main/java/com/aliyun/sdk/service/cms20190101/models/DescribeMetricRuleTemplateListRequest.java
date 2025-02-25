// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleTemplateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleTemplateListRequest</p>
 */
public class DescribeMetricRuleTemplateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("History")
    private Boolean history;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private Boolean order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private DescribeMetricRuleTemplateListRequest(Builder builder) {
        super(builder);
        this.history = builder.history;
        this.keyword = builder.keyword;
        this.name = builder.name;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleTemplateListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return history
     */
    public Boolean getHistory() {
        return this.history;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public Boolean getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeMetricRuleTemplateListRequest, Builder> {
        private Boolean history; 
        private String keyword; 
        private String name; 
        private Boolean order; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricRuleTemplateListRequest request) {
            super(request);
            this.history = request.history;
            this.keyword = request.keyword;
            this.name = request.name;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.templateId = request.templateId;
        } 

        /**
         * <p>Specifies whether to display the history of applying the alert templates to application groups. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder history(Boolean history) {
            this.putQueryParameter("History", history);
            this.history = history;
            return this;
        }

        /**
         * <p>The keyword of the alert template name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The name of the alert template.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Template1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li>true (default): ascending order</li>
         * <li>false: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder order(Boolean order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The sorting basis. Valid values:</p>
         * <ul>
         * <li>gmtMotified: sorts alert templates by modification time</li>
         * <li>gmtCreate (default): sorts alert templates by creation time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gmtCreate</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the alert template.</p>
         * 
         * <strong>example:</strong>
         * <p>70****</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeMetricRuleTemplateListRequest build() {
            return new DescribeMetricRuleTemplateListRequest(this);
        } 

    } 

}
