// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link RefreshAdvisorCostCheckRequest} extends {@link RequestModel}
 *
 * <p>RefreshAdvisorCostCheckRequest</p>
 */
public class RefreshAdvisorCostCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunIdList")
    private java.util.List<Long> assumeAliyunIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List<String> checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPlanId")
    private Long checkPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefreshResource")
    private Boolean refreshResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    private RefreshAdvisorCostCheckRequest(Builder builder) {
        super(builder);
        this.assumeAliyunIdList = builder.assumeAliyunIdList;
        this.checkIds = builder.checkIds;
        this.checkPlanId = builder.checkPlanId;
        this.product = builder.product;
        this.refreshResource = builder.refreshResource;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAdvisorCostCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumeAliyunIdList
     */
    public java.util.List<Long> getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
    }

    /**
     * @return checkIds
     */
    public java.util.List<String> getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return checkPlanId
     */
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return refreshResource
     */
    public Boolean getRefreshResource() {
        return this.refreshResource;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<RefreshAdvisorCostCheckRequest, Builder> {
        private java.util.List<Long> assumeAliyunIdList; 
        private java.util.List<String> checkIds; 
        private Long checkPlanId; 
        private String product; 
        private Boolean refreshResource; 
        private java.util.List<String> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAdvisorCostCheckRequest request) {
            super(request);
            this.assumeAliyunIdList = request.assumeAliyunIdList;
            this.checkIds = request.checkIds;
            this.checkPlanId = request.checkPlanId;
            this.product = request.product;
            this.refreshResource = request.refreshResource;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * AssumeAliyunIdList.
         */
        public Builder assumeAliyunIdList(java.util.List<Long> assumeAliyunIdList) {
            String assumeAliyunIdListShrink = shrink(assumeAliyunIdList, "AssumeAliyunIdList", "json");
            this.putQueryParameter("AssumeAliyunIdList", assumeAliyunIdListShrink);
            this.assumeAliyunIdList = assumeAliyunIdList;
            return this;
        }

        /**
         * CheckIds.
         */
        public Builder checkIds(java.util.List<String> checkIds) {
            String checkIdsShrink = shrink(checkIds, "CheckIds", "json");
            this.putQueryParameter("CheckIds", checkIdsShrink);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * CheckPlanId.
         */
        public Builder checkPlanId(Long checkPlanId) {
            this.putQueryParameter("CheckPlanId", checkPlanId);
            this.checkPlanId = checkPlanId;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RefreshResource.
         */
        public Builder refreshResource(Boolean refreshResource) {
            this.putQueryParameter("RefreshResource", refreshResource);
            this.refreshResource = refreshResource;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            String resourceIdsShrink = shrink(resourceIds, "ResourceIds", "json");
            this.putQueryParameter("ResourceIds", resourceIdsShrink);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public RefreshAdvisorCostCheckRequest build() {
            return new RefreshAdvisorCostCheckRequest(this);
        } 

    } 

}
