// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleBlackListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleBlackListRequest</p>
 */
public class DescribeMetricRuleBlackListRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Ids")
    private java.util.List < String > ids;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("IsEnable")
    private Boolean isEnable;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("Order")
    private Integer order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ScopeType")
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
         * The ID of the blacklist policy.
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
         * The IDs of the instances in the blacklist policy.
         * <p>
         * 
         * Valid values of N: 0 to 10.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The status of the blacklist policy. Valid values:
         * <p>
         * 
         * *   true: The blacklist policy is enabled.
         * *   false: The blacklist policy is disabled.
         */
        public Builder isEnable(Boolean isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
            return this;
        }

        /**
         * The name of the blacklist policy.
         * <p>
         * 
         * This parameter supports fuzzy match.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The timestamp when the blacklist policy expired.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder order(Integer order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The name of the metric.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The categories of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include `kvstore_standard`, `kvstore_sharding`, and `kvstore_splitrw`.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The effective scope of the blacklist policy. Valid values:
         * <p>
         * 
         * *   USER: The blacklist policy takes effect only within the current Alibaba Cloud account.
         * *   GROUP: The blacklist policy takes effect only within the specified application group.
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
