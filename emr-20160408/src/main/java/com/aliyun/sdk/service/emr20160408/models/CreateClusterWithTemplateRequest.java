// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterWithTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterWithTemplateRequest</p>
 */
public class CreateClusterWithTemplateRequest extends Request {
    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TemplateBizId")
    @Validation(required = true)
    private String templateBizId;

    @Query
    @NameInMap("UniqueTag")
    private String uniqueTag;

    private CreateClusterWithTemplateRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateBizId = builder.templateBizId;
        this.uniqueTag = builder.uniqueTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterWithTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return templateBizId
     */
    public String getTemplateBizId() {
        return this.templateBizId;
    }

    /**
     * @return uniqueTag
     */
    public String getUniqueTag() {
        return this.uniqueTag;
    }

    public static final class Builder extends Request.Builder<CreateClusterWithTemplateRequest, Builder> {
        private String clusterName; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String templateBizId; 
        private String uniqueTag; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterWithTemplateRequest response) {
            super(response);
            this.clusterName = response.clusterName;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.templateBizId = response.templateBizId;
            this.uniqueTag = response.uniqueTag;
        } 

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * TemplateBizId.
         */
        public Builder templateBizId(String templateBizId) {
            this.putQueryParameter("TemplateBizId", templateBizId);
            this.templateBizId = templateBizId;
            return this;
        }

        /**
         * UniqueTag.
         */
        public Builder uniqueTag(String uniqueTag) {
            this.putQueryParameter("UniqueTag", uniqueTag);
            this.uniqueTag = uniqueTag;
            return this;
        }

        @Override
        public CreateClusterWithTemplateRequest build() {
            return new CreateClusterWithTemplateRequest(this);
        } 

    } 

}
