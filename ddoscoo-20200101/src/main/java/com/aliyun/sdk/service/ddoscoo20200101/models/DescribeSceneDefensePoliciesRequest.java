// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneDefensePoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneDefensePoliciesRequest</p>
 */
public class DescribeSceneDefensePoliciesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    private String template;

    private DescribeSceneDefensePoliciesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneDefensePoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<DescribeSceneDefensePoliciesRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneDefensePoliciesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.template = request.template;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management.
         * <p>
         * 
         * If you do not configure this parameter, the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The status of the policy. Valid values:
         * <p>
         * 
         * *   **0**: disabled
         * *   **1**: pending enabling
         * *   **2**: enabled
         * *   **3**: expired
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the template that is used to create the policy. Valid values:
         * <p>
         * 
         * *   **promotion**: the Important Activity template
         * *   **bypass**: the Forward All template
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public DescribeSceneDefensePoliciesRequest build() {
            return new DescribeSceneDefensePoliciesRequest(this);
        } 

    } 

}
