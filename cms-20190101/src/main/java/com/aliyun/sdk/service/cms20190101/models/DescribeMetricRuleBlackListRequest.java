// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleBlackListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleBlackListRequest</p>
 */
public class DescribeMetricRuleBlackListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List < String > ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEnable")
    private Boolean isEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private Integer order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private String scopeType;

    private DescribeMetricRuleBlackListRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.ids = builder.ids;
        this.instanceIds = builder.instanceIds;
        this.isEnable = builder.isEnable;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return ids
     */
    public java.util.List < String > getIds() {
        return this.ids;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return order
     */
    public Integer getOrder() {
        return this.order;
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
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<DescribeMetricRuleBlackListRequest, Builder> {
        private String category; 
        private java.util.List < String > ids; 
        private java.util.List < String > instanceIds; 
        private Boolean isEnable; 
        private String name; 
        private String namespace; 
        private Integer order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scopeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricRuleBlackListRequest request) {
            super(request);
            this.category = request.category;
            this.ids = request.ids;
            this.instanceIds = request.instanceIds;
            this.isEnable = request.isEnable;
            this.name = request.name;
            this.namespace = request.namespace;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scopeType = request.scopeType;
        } 

        /**
         * <p>The ID of the blacklist policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Ids.
         */
        public Builder ids(java.util.List < String > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The IDs of the instances in the blacklist policy.</p>
         * <p>Valid values of N: 0 to 10.</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The status of the blacklist policy. Valid values:</p>
         * <ul>
         * <li>true: The blacklist policy is enabled.</li>
         * <li>false: The blacklist policy is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isEnable(Boolean isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
            return this;
        }

        /**
         * <p>The name of the blacklist policy.</p>
         * <p>This parameter supports fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>Blacklist-01</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The timestamp when the blacklist policy expired.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(Integer order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The categories of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include <code>kvstore_standard</code>, <code>kvstore_sharding</code>, and <code>kvstore_splitrw</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The effective scope of the blacklist policy. Valid values:</p>
         * <ul>
         * <li>USER: The blacklist policy takes effect only within the current Alibaba Cloud account.</li>
         * <li>GROUP: The blacklist policy takes effect only within the specified application group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public DescribeMetricRuleBlackListRequest build() {
            return new DescribeMetricRuleBlackListRequest(this);
        } 

    } 

}
