// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLaunchTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLaunchTemplatesResponseBody</p>
 */
public class DescribeLaunchTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateSets")
    private LaunchTemplateSets launchTemplateSets;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLaunchTemplatesResponseBody(Builder builder) {
        this.launchTemplateSets = builder.launchTemplateSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLaunchTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return launchTemplateSets
     */
    public LaunchTemplateSets getLaunchTemplateSets() {
        return this.launchTemplateSets;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private LaunchTemplateSets launchTemplateSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the launch template.
         */
        public Builder launchTemplateSets(LaunchTemplateSets launchTemplateSets) {
            this.launchTemplateSets = launchTemplateSets;
            return this;
        }

        /**
         * The total number of launch templates.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the launch templates.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLaunchTemplatesResponseBody build() {
            return new DescribeLaunchTemplatesResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The key of tag N of the launch template.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class LaunchTemplateSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("DefaultVersionNumber")
        private Long defaultVersionNumber;

        @com.aliyun.core.annotation.NameInMap("LatestVersionNumber")
        private Long latestVersionNumber;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateName")
        private String launchTemplateName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private LaunchTemplateSet(Builder builder) {
            this.createTime = builder.createTime;
            this.createdBy = builder.createdBy;
            this.defaultVersionNumber = builder.defaultVersionNumber;
            this.latestVersionNumber = builder.latestVersionNumber;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateName = builder.launchTemplateName;
            this.modifiedTime = builder.modifiedTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateSet create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return defaultVersionNumber
         */
        public Long getDefaultVersionNumber() {
            return this.defaultVersionNumber;
        }

        /**
         * @return latestVersionNumber
         */
        public Long getLatestVersionNumber() {
            return this.latestVersionNumber;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateName
         */
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createTime; 
            private String createdBy; 
            private Long defaultVersionNumber; 
            private Long latestVersionNumber; 
            private String launchTemplateId; 
            private String launchTemplateName; 
            private String modifiedTime; 
            private String resourceGroupId; 
            private Tags tags; 

            /**
             * The ID of the resource group to which the launch template belongs.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The latest version number of the launch template.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The time when the launch template was modified.
             */
            public Builder defaultVersionNumber(Long defaultVersionNumber) {
                this.defaultVersionNumber = defaultVersionNumber;
                return this;
            }

            /**
             * The tags of the launch template.
             */
            public Builder latestVersionNumber(Long latestVersionNumber) {
                this.latestVersionNumber = latestVersionNumber;
                return this;
            }

            /**
             * The time when the launch template was created.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The default version number of the launch template.
             */
            public Builder launchTemplateName(String launchTemplateName) {
                this.launchTemplateName = launchTemplateName;
                return this;
            }

            /**
             * The ID of the launch template.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The creator of the launch template.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tag of the launch template.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public LaunchTemplateSet build() {
                return new LaunchTemplateSet(this);
            } 

        } 

    }
    public static class LaunchTemplateSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchTemplateSet")
        private java.util.List < LaunchTemplateSet> launchTemplateSet;

        private LaunchTemplateSets(Builder builder) {
            this.launchTemplateSet = builder.launchTemplateSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateSets create() {
            return builder().build();
        }

        /**
         * @return launchTemplateSet
         */
        public java.util.List < LaunchTemplateSet> getLaunchTemplateSet() {
            return this.launchTemplateSet;
        }

        public static final class Builder {
            private java.util.List < LaunchTemplateSet> launchTemplateSet; 

            /**
             * LaunchTemplateSet.
             */
            public Builder launchTemplateSet(java.util.List < LaunchTemplateSet> launchTemplateSet) {
                this.launchTemplateSet = launchTemplateSet;
                return this;
            }

            public LaunchTemplateSets build() {
                return new LaunchTemplateSets(this);
            } 

        } 

    }
}
