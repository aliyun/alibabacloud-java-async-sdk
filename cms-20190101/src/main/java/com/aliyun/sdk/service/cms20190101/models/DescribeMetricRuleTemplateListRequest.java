// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleTemplateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleTemplateListRequest</p>
 */
public class DescribeMetricRuleTemplateListRequest extends Request {
    @Query
    @NameInMap("History")
    private Boolean history;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Order")
    private Boolean order;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("TemplateId")
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
         * Specifies whether to display the history of applying the alert templates to application groups. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         */
        public Builder history(Boolean history) {
            this.putQueryParameter("History", history);
            this.history = history;
            return this;
        }

        /**
         * The keyword of the alert template name.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The name of the alert template.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The sorting order. Valid values:
         * <p>
         * 
         * *   true (default): ascending order
         * *   false: descending order
         */
        public Builder order(Boolean order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The sorting basis. Valid values:
         * <p>
         * 
         * *   gmtMotified: sorts alert templates by modification time
         * *   gmtCreate (default): sorts alert templates by creation time
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the alert template.
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
