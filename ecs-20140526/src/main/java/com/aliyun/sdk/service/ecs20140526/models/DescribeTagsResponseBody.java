// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTagsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tags = builder.tags;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsResponseBody create() {
        return builder().build();
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
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Tags tags; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The tags that match all filter conditions.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The total number of tags.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    public static class ResourceTypeCount extends TeaModel {
        @NameInMap("Ddh")
        private Integer ddh;

        @NameInMap("Disk")
        private Integer disk;

        @NameInMap("Eni")
        private Integer eni;

        @NameInMap("Image")
        private Integer image;

        @NameInMap("Instance")
        private Integer instance;

        @NameInMap("KeyPair")
        private Integer keyPair;

        @NameInMap("LaunchTemplate")
        private Integer launchTemplate;

        @NameInMap("ReservedInstance")
        private Integer reservedInstance;

        @NameInMap("Securitygroup")
        private Integer securitygroup;

        @NameInMap("Snapshot")
        private Integer snapshot;

        @NameInMap("SnapshotPolicy")
        private Integer snapshotPolicy;

        @NameInMap("Volume")
        private Integer volume;

        private ResourceTypeCount(Builder builder) {
            this.ddh = builder.ddh;
            this.disk = builder.disk;
            this.eni = builder.eni;
            this.image = builder.image;
            this.instance = builder.instance;
            this.keyPair = builder.keyPair;
            this.launchTemplate = builder.launchTemplate;
            this.reservedInstance = builder.reservedInstance;
            this.securitygroup = builder.securitygroup;
            this.snapshot = builder.snapshot;
            this.snapshotPolicy = builder.snapshotPolicy;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypeCount create() {
            return builder().build();
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
         * @return eni
         */
        public Integer getEni() {
            return this.eni;
        }

        /**
         * @return image
         */
        public Integer getImage() {
            return this.image;
        }

        /**
         * @return instance
         */
        public Integer getInstance() {
            return this.instance;
        }

        /**
         * @return keyPair
         */
        public Integer getKeyPair() {
            return this.keyPair;
        }

        /**
         * @return launchTemplate
         */
        public Integer getLaunchTemplate() {
            return this.launchTemplate;
        }

        /**
         * @return reservedInstance
         */
        public Integer getReservedInstance() {
            return this.reservedInstance;
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

        /**
         * @return snapshotPolicy
         */
        public Integer getSnapshotPolicy() {
            return this.snapshotPolicy;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Integer ddh; 
            private Integer disk; 
            private Integer eni; 
            private Integer image; 
            private Integer instance; 
            private Integer keyPair; 
            private Integer launchTemplate; 
            private Integer reservedInstance; 
            private Integer securitygroup; 
            private Integer snapshot; 
            private Integer snapshotPolicy; 
            private Integer volume; 

            /**
             * The number of dedicated hosts to which the tag is added.
             */
            public Builder ddh(Integer ddh) {
                this.ddh = ddh;
                return this;
            }

            /**
             * The number of disks to which the tag is added.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * The number of ENIs to which the tag is added.
             */
            public Builder eni(Integer eni) {
                this.eni = eni;
                return this;
            }

            /**
             * The number of images to which the tag is added.
             */
            public Builder image(Integer image) {
                this.image = image;
                return this;
            }

            /**
             * The number of instances to which the tag is added.
             */
            public Builder instance(Integer instance) {
                this.instance = instance;
                return this;
            }

            /**
             * The number of key pairs to which the tag is added.
             */
            public Builder keyPair(Integer keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * The number of launch templates to which the tag is added.
             */
            public Builder launchTemplate(Integer launchTemplate) {
                this.launchTemplate = launchTemplate;
                return this;
            }

            /**
             * The number of reserved instances to which the tag is added.
             */
            public Builder reservedInstance(Integer reservedInstance) {
                this.reservedInstance = reservedInstance;
                return this;
            }

            /**
             * The number of security groups to which the tag is added.
             */
            public Builder securitygroup(Integer securitygroup) {
                this.securitygroup = securitygroup;
                return this;
            }

            /**
             * The number of snapshots to which the tag is added.
             */
            public Builder snapshot(Integer snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            /**
             * The number of automatic snapshot policies to which the tag is added.
             */
            public Builder snapshotPolicy(Integer snapshotPolicy) {
                this.snapshotPolicy = snapshotPolicy;
                return this;
            }

            /**
             * The number of storage volumes to which the tag is added.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public ResourceTypeCount build() {
                return new ResourceTypeCount(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("ResourceTypeCount")
        private ResourceTypeCount resourceTypeCount;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.resourceTypeCount = builder.resourceTypeCount;
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
         * @return resourceTypeCount
         */
        public ResourceTypeCount getResourceTypeCount() {
            return this.resourceTypeCount;
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
            private ResourceTypeCount resourceTypeCount; 
            private String tagKey; 
            private String tagValue; 

            /**
             * The number of resource types.
             */
            public Builder resourceTypeCount(ResourceTypeCount resourceTypeCount) {
                this.resourceTypeCount = resourceTypeCount;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
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
