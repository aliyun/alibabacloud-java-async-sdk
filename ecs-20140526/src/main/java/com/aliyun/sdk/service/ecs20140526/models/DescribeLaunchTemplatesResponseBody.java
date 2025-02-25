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
         * <p>The queried launch templates.</p>
         */
        public Builder launchTemplateSets(LaunchTemplateSets launchTemplateSets) {
            this.launchTemplateSets = launchTemplateSets;
            return this;
        }

        /**
         * <p>The total number of launch templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE12CBA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the launch templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLaunchTemplatesResponseBody build() {
            return new DescribeLaunchTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLaunchTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplatesResponseBody</p>
     */
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
             * <p>The tag value of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag key of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeLaunchTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplatesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplatesResponseBody</p>
     */
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
             * <p>The time when the launch template was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-14T14:18:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that created the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time when the launch template was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultVersionNumber(Long defaultVersionNumber) {
                this.defaultVersionNumber = defaultVersionNumber;
                return this;
            }

            /**
             * <p>The tags of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestVersionNumber(Long latestVersionNumber) {
                this.latestVersionNumber = latestVersionNumber;
                return this;
            }

            /**
             * <p>The time when the launch template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-m5e3ofjr1zn1aw7q****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The default version number of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>wd-152630748****</p>
             */
            public Builder launchTemplateName(String launchTemplateName) {
                this.launchTemplateName = launchTemplateName;
                return this;
            }

            /**
             * <p>The time when a version was added to or deleted from the launch template.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-14T14:18:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The creator of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags of the launch template.</p>
             * <blockquote>
             * <p> You can only call API operations to add tags to and query the tags of a launch template. You cannot add tags to or view the tags of a launch template in the ECS console.</p>
             * </blockquote>
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
    /**
     * 
     * {@link DescribeLaunchTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplatesResponseBody</p>
     */
    public static class LaunchTemplateSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchTemplateSet")
        private java.util.List<LaunchTemplateSet> launchTemplateSet;

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
        public java.util.List<LaunchTemplateSet> getLaunchTemplateSet() {
            return this.launchTemplateSet;
        }

        public static final class Builder {
            private java.util.List<LaunchTemplateSet> launchTemplateSet; 

            /**
             * LaunchTemplateSet.
             */
            public Builder launchTemplateSet(java.util.List<LaunchTemplateSet> launchTemplateSet) {
                this.launchTemplateSet = launchTemplateSet;
                return this;
            }

            public LaunchTemplateSets build() {
                return new LaunchTemplateSets(this);
            } 

        } 

    }
}
