// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link DescribeApplicationGroupBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationGroupBillRequest</p>
 */
public class DescribeApplicationGroupBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private DescribeApplicationGroupBillRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.billingCycle = builder.billingCycle;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationGroupBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationGroupBillRequest, Builder> {
        private String applicationName; 
        private String billingCycle; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationGroupBillRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.billingCycle = request.billingCycle;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_application</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The billing cycle, in the YYYY-MM format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The application group name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_application_group</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the cloud resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::INSTANCE</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeApplicationGroupBillRequest build() {
            return new DescribeApplicationGroupBillRequest(this);
        } 

    } 

}
