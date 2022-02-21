// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneDefensePoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneDefensePoliciesRequest</p>
 */
public class DescribeSceneDefensePoliciesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Template")
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

        private Builder(DescribeSceneDefensePoliciesRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.status = response.status;
            this.template = response.template;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Template.
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
