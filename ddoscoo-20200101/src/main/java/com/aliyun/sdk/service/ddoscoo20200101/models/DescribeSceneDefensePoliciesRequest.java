// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
         * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
         * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: pending enabling</li>
         * <li><strong>2</strong>: enabled</li>
         * <li><strong>3</strong>: expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the template that is used to create the policy. Valid values:</p>
         * <ul>
         * <li><strong>promotion</strong>: the Important Activity template</li>
         * <li><strong>bypass</strong>: the Forward All template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
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
