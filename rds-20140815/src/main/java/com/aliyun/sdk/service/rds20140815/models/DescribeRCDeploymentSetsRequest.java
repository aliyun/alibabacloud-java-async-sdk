// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCDeploymentSetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCDeploymentSetsRequest</p>
 */
public class DescribeRCDeploymentSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetIds")
    private String deploymentSetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    private String strategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private DescribeRCDeploymentSetsRequest(Builder builder) {
        super(builder);
        this.deploymentSetIds = builder.deploymentSetIds;
        this.deploymentSetName = builder.deploymentSetName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.strategy = builder.strategy;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCDeploymentSetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentSetIds
     */
    public String getDeploymentSetIds() {
        return this.deploymentSetIds;
    }

    /**
     * @return deploymentSetName
     */
    public String getDeploymentSetName() {
        return this.deploymentSetName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeRCDeploymentSetsRequest, Builder> {
        private String deploymentSetIds; 
        private String deploymentSetName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String strategy; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCDeploymentSetsRequest request) {
            super(request);
            this.deploymentSetIds = request.deploymentSetIds;
            this.deploymentSetName = request.deploymentSetName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.strategy = request.strategy;
            this.tag = request.tag;
        } 

        /**
         * <p>The IDs of the deployment sets. The value can be a JSON array that consists of deployment set IDs in the format of <code>[&quot;ds-xxxxxxxxx&quot;, &quot;ds-yyyyyyyyy&quot;, ... &quot;ds-zzzzzzzzz&quot;]</code>. You can specify up to 100 deployment set IDs in each request. Separate the deployment set IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ds-2zeeuw16zo2gr9e6****&quot;]</p>
         */
        public Builder deploymentSetIds(String deploymentSetIds) {
            this.putQueryParameter("DeploymentSetIds", deploymentSetIds);
            this.deploymentSetIds = deploymentSetIds;
            return this;
        }

        /**
         * <p>The deployment set name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, letters, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>deployment_test</p>
         */
        public Builder deploymentSetName(String deploymentSetName) {
            this.putQueryParameter("DeploymentSetName", deploymentSetName);
            this.deploymentSetName = deploymentSetName;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries per page.</p>
         * <p>Maximum value: 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The deployment strategy. Valid values:</p>
         * <ul>
         * <li><strong>Availability</strong>: high availability strategy</li>
         * <li><strong>AvailabilityGroup</strong>: high availability group strategy</li>
         * </ul>
         * <p>Default value: Availability.</p>
         * 
         * <strong>example:</strong>
         * <p>Availability</p>
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeRCDeploymentSetsRequest build() {
            return new DescribeRCDeploymentSetsRequest(this);
        } 

    } 

}
