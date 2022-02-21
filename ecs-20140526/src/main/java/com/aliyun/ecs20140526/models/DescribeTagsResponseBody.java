// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponseBody</p>
 */
public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Tags")
    private Tags tags;

    private DescribeTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String requestId; 
        private Integer pageSize; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private Tags tags; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Label list page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Label total number.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The tags that meet all the filter conditions.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    public static class ResourceTypeCount extends TeaModel {
        @NameInMap("Instance")
        private Integer instance;

        @NameInMap("Image")
        private Integer image;

        @NameInMap("Eni")
        private Integer eni;

        @NameInMap("LaunchTemplate")
        private Integer launchTemplate;

        @NameInMap("KeyPair")
        private Integer keyPair;

        @NameInMap("Ddh")
        private Integer ddh;

        @NameInMap("Disk")
        private Integer disk;

        @NameInMap("Volume")
        private Integer volume;

        @NameInMap("Securitygroup")
        private Integer securitygroup;

        @NameInMap("Snapshot")
        private Integer snapshot;

        private ResourceTypeCount(Builder builder) {
            this.instance = builder.instance;
            this.image = builder.image;
            this.eni = builder.eni;
            this.launchTemplate = builder.launchTemplate;
            this.keyPair = builder.keyPair;
            this.ddh = builder.ddh;
            this.disk = builder.disk;
            this.volume = builder.volume;
            this.securitygroup = builder.securitygroup;
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypeCount create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public Integer getInstance() {
            return this.instance;
        }

        /**
         * @return image
         */
        public Integer getImage() {
            return this.image;
        }

        /**
         * @return eni
         */
        public Integer getEni() {
            return this.eni;
        }

        /**
         * @return launchTemplate
         */
        public Integer getLaunchTemplate() {
            return this.launchTemplate;
        }

        /**
         * @return keyPair
         */
        public Integer getKeyPair() {
            return this.keyPair;
        }

        /**
         * @return ddh
         */
        public Integer getDdh() {
            return this.ddh;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        /**
         * @return securitygroup
         */
        public Integer getSecuritygroup() {
            return this.securitygroup;
        }

        /**
         * @return snapshot
         */
        public Integer getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private Integer instance; 
            private Integer image; 
            private Integer eni; 
            private Integer launchTemplate; 
            private Integer keyPair; 
            private Integer ddh; 
            private Integer disk; 
            private Integer volume; 
            private Integer securitygroup; 
            private Integer snapshot; 

            /**
             * The label tag how many instances.
             */
            public Builder instance(Integer instance) {
                this.instance = instance;
                return this;
            }

            /**
             * The label tag how many mirror.
             */
            public Builder image(Integer image) {
                this.image = image;
                return this;
            }

            /**
             * The label tag how many elastic network card.
             */
            public Builder eni(Integer eni) {
                this.eni = eni;
                return this;
            }

            /**
             * The label tag how many starter template.
             */
            public Builder launchTemplate(Integer launchTemplate) {
                this.launchTemplate = launchTemplate;
                return this;
            }

            /**
             * The label tag how many key pair.
             */
            public Builder keyPair(Integer keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * The label tag how many proprietary host.
             */
            public Builder ddh(Integer ddh) {
                this.ddh = ddh;
                return this;
            }

            /**
             * The label tag how much disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * The label tag how many extend volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            /**
             * The label tag how many security group.
             */
            public Builder securitygroup(Integer securitygroup) {
                this.securitygroup = securitygroup;
                return this;
            }

            /**
             * The label tag how many snapshot.
             */
            public Builder snapshot(Integer snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public ResourceTypeCount build() {
                return new ResourceTypeCount(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("ResourceTypeCount")
        private ResourceTypeCount resourceTypeCount;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
            this.resourceTypeCount = builder.resourceTypeCount;
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

        /**
         * @return resourceTypeCount
         */
        public ResourceTypeCount getResourceTypeCount() {
            return this.resourceTypeCount;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 
            private ResourceTypeCount resourceTypeCount; 

            /**
             * The value of the tag.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The Count of resource types.
             */
            public Builder resourceTypeCount(ResourceTypeCount resourceTypeCount) {
                this.resourceTypeCount = resourceTypeCount;
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
}
