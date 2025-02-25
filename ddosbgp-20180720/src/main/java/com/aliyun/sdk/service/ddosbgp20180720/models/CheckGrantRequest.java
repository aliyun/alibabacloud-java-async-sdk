// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckGrantRequest} extends {@link RequestModel}
 *
 * <p>CheckGrantRequest</p>
 */
public class CheckGrantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSlr")
    private Boolean isSlr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CheckGrantRequest(Builder builder) {
        super(builder);
        this.isSlr = builder.isSlr;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckGrantRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isSlr
     */
    public Boolean getIsSlr() {
        return this.isSlr;
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

    public static final class Builder extends Request.Builder<CheckGrantRequest, Builder> {
        private Boolean isSlr; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CheckGrantRequest request) {
            super(request);
            this.isSlr = request.isSlr;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>Specifies whether to allow Anti-DDoS Origin to check the service-linked role. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSlr(Boolean isSlr) {
            this.putQueryParameter("IsSlr", isSlr);
            this.isSlr = isSlr;
            return this;
        }

        /**
         * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
         * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CheckGrantRequest build() {
            return new CheckGrantRequest(this);
        } 

    } 

}
