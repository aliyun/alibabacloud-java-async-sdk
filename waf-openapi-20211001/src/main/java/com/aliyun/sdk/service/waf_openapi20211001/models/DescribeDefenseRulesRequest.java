// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseRulesRequest</p>
 */
public class DescribeDefenseRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    private DescribeDefenseRulesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<DescribeDefenseRulesRequest, Builder> {
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefenseRulesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleType = request.ruleType;
        } 

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query conditions. Specify a string that contains multiple parameters in the JSON format.
         * <p>
         * 
         * >  The results vary based on the query conditions. For more information, see the "**Query parameters**" section in this topic.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The type of protection rule that you want to query. Valid values:
         * <p>
         * 
         * *   **whitelist:** whitelist rule.
         * *   **defense:** defense rule. This is the default value.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public DescribeDefenseRulesRequest build() {
            return new DescribeDefenseRulesRequest(this);
        } 

    } 

}
