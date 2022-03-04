// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLaunchTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLaunchTemplatesResponseBody</p>
 */
public class DescribeLaunchTemplatesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("LaunchTemplateSets")
    private LaunchTemplateSets launchTemplateSets;

    private DescribeLaunchTemplatesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.launchTemplateSets = builder.launchTemplateSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLaunchTemplatesResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return launchTemplateSets
     */
    public LaunchTemplateSets getLaunchTemplateSets() {
        return this.launchTemplateSets;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private LaunchTemplateSets launchTemplateSets; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The current page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of instance launch templates.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of instance launch templates.
         */
        public Builder launchTemplateSets(LaunchTemplateSets launchTemplateSets) {
            this.launchTemplateSets = launchTemplateSets;
            return this;
        }

        public DescribeLaunchTemplatesResponseBody build() {
            return new DescribeLaunchTemplatesResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * The tag value of the launch template.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The tag key of the launch template.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
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
        @NameInMap("LaunchTemplateName")
        private String launchTemplateName;

        @NameInMap("DefaultVersionNumber")
        private Long defaultVersionNumber;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("LatestVersionNumber")
        private Long latestVersionNumber;

        @NameInMap("Tags")
        private Tags tags;

        private LaunchTemplateSet(Builder builder) {
            this.launchTemplateName = builder.launchTemplateName;
            this.defaultVersionNumber = builder.defaultVersionNumber;
            this.modifiedTime = builder.modifiedTime;
            this.launchTemplateId = builder.launchTemplateId;
            this.createTime = builder.createTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.createdBy = builder.createdBy;
            this.latestVersionNumber = builder.latestVersionNumber;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateSet create() {
            return builder().build();
        }

        /**
         * @return launchTemplateName
         */
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        /**
         * @return defaultVersionNumber
         */
        public Long getDefaultVersionNumber() {
            return this.defaultVersionNumber;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return latestVersionNumber
         */
        public Long getLatestVersionNumber() {
            return this.latestVersionNumber;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String launchTemplateName; 
            private Long defaultVersionNumber; 
            private String modifiedTime; 
            private String launchTemplateId; 
            private String createTime; 
            private String resourceGroupId; 
            private String createdBy; 
            private Long latestVersionNumber; 
            private Tags tags; 

            /**
             * The name of the template.
             */
            public Builder launchTemplateName(String launchTemplateName) {
                this.launchTemplateName = launchTemplateName;
                return this;
            }

            /**
             * The default version of the template.
             */
            public Builder defaultVersionNumber(Long defaultVersionNumber) {
                this.defaultVersionNumber = defaultVersionNumber;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The time when the instance launch template was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the resource group to which the launch template belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The creator of the template.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The latest version of the template.
             */
            public Builder latestVersionNumber(Long latestVersionNumber) {
                this.latestVersionNumber = latestVersionNumber;
                return this;
            }

            /**
             * The tag pair attribute of the launch template.
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
        @NameInMap("LaunchTemplateSet")
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
