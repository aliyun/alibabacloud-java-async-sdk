// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeLaunchTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeLaunchTemplatesRequest</p>
 */
public class DescribeLaunchTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private java.util.List<String> launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateName")
    private java.util.List<String> launchTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateResourceGroupId")
    private String templateResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateTag")
    private java.util.List<TemplateTag> templateTag;

    private DescribeLaunchTemplatesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateName = builder.launchTemplateName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateResourceGroupId = builder.templateResourceGroupId;
        this.templateTag = builder.templateTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLaunchTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return launchTemplateId
     */
    public java.util.List<String> getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateName
     */
    public java.util.List<String> getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return templateResourceGroupId
     */
    public String getTemplateResourceGroupId() {
        return this.templateResourceGroupId;
    }

    /**
     * @return templateTag
     */
    public java.util.List<TemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public static final class Builder extends Request.Builder<DescribeLaunchTemplatesRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List<String> launchTemplateId; 
        private java.util.List<String> launchTemplateName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateResourceGroupId; 
        private java.util.List<TemplateTag> templateTag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLaunchTemplatesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateName = request.launchTemplateName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateResourceGroupId = request.templateResourceGroupId;
            this.templateTag = request.templateTag;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The IDs of one or more launch templates.</p>
         * <ul>
         * <li><p>You can query up to 100 launch templates at a time.</p>
         * </li>
         * <li><p>You must specify LaunchTemplateId or LaunchTemplateName to determine the template.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lt-m5e3ofjr1zn1aw7q****</p>
         */
        public Builder launchTemplateId(java.util.List<String> launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The names of one or more launch templates.</p>
         * <ul>
         * <li><p>You can query up to 100 launch templates at a time.</p>
         * </li>
         * <li><p>You must specify LaunchTemplateId or LaunchTemplateName to determine the template.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wd-152630748****</p>
         */
        public Builder launchTemplateName(java.util.List<String> launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number of the launch template list. Minimum value: 1.</p>
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
         * <p>The number of entries per page for a paged query.</p>
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
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * <p>The ID of the resource group to which the launch template belongs. When you use this parameter to filter resources, the resource count cannot exceed 1000.</p>
         * <blockquote>
         * <p>Filtering by the default resource group is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4p****</p>
         */
        public Builder templateResourceGroupId(String templateResourceGroupId) {
            this.putQueryParameter("TemplateResourceGroupId", templateResourceGroupId);
            this.templateResourceGroupId = templateResourceGroupId;
            return this;
        }

        /**
         * <p>The list of tag key-value pairs of the launch template itself.</p>
         * <blockquote>
         * <p>Currently, you can create and query tags of launch templates only by calling API operations. You cannot create or view tags in the console.</p>
         * </blockquote>
         */
        public Builder templateTag(java.util.List<TemplateTag> templateTag) {
            this.putQueryParameter("TemplateTag", templateTag);
            this.templateTag = templateTag;
            return this;
        }

        @Override
        public DescribeLaunchTemplatesRequest build() {
            return new DescribeLaunchTemplatesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLaunchTemplatesRequest} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplatesRequest</p>
     */
    public static class TemplateTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TemplateTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TemplateTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the launch template. Valid values of N: 1 to 20.</p>
             * <p>If you use a single tag to filter resources, the resource count with the specified tag cannot exceed 1000. If you use multiple tags to filter resources, the resource count of resources that have all specified tags attached cannot exceed 1000. If the resource count exceeds 1000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the launch template. Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TemplateTag build() {
                return new TemplateTag(this);
            } 

        } 

    }
}
