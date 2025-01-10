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
 * {@link DescribeImagePipelineExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePipelineExecutionsResponseBody</p>
 */
public class DescribeImagePipelineExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImagePipelineExecution")
    private ImagePipelineExecution imagePipelineExecution;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImagePipelineExecutionsResponseBody(Builder builder) {
        this.imagePipelineExecution = builder.imagePipelineExecution;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagePipelineExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return imagePipelineExecution
     */
    public ImagePipelineExecution getImagePipelineExecution() {
        return this.imagePipelineExecution;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private ImagePipelineExecution imagePipelineExecution; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Details of the image creation tasks.</p>
         */
        public Builder imagePipelineExecution(ImagePipelineExecution imagePipelineExecution) {
            this.imagePipelineExecution = imagePipelineExecution;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists. For information about how to use the returned value, see the &quot;Usage notes&quot; section in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned image components.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImagePipelineExecutionsResponseBody build() {
            return new DescribeImagePipelineExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImagePipelineExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelineExecutionsResponseBody</p>
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
             * <p>The tag key of the image creation task.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the image creation task.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
     * {@link DescribeImagePipelineExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelineExecutionsResponseBody</p>
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
     * {@link DescribeImagePipelineExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelineExecutionsResponseBody</p>
     */
    public static class ImagePipelineExecutionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ExecutionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImagePipelineId")
        private String imagePipelineId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private ImagePipelineExecutionSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.executionId = builder.executionId;
            this.imageId = builder.imageId;
            this.imagePipelineId = builder.imagePipelineId;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagePipelineExecutionSet create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imagePipelineId
         */
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String creationTime; 
            private String executionId; 
            private String imageId; 
            private String imagePipelineId; 
            private String message; 
            private String modifiedTime; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 

            /**
             * <p>The time when the image creation task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-24T06:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the image creation task.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-5fb8facb8ed7427c****</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp67acfmxazb4p****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the image template.</p>
             * 
             * <strong>example:</strong>
             * <p>ip-2ze5tsl5bp6nf2b3****</p>
             */
            public Builder imagePipelineId(String imagePipelineId) {
                this.imagePipelineId = imagePipelineId;
                return this;
            }

            /**
             * <p>The data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Create transition vpc &quot;vpc-2ze70rc7093j9idu6****&quot; success!</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The last modification time of the image creation task.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-25T06:00:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the image creation task. Valid values:</p>
             * <ul>
             * <li>PREPARING: Resources, such as intermediate instances, are being created.</li>
             * <li>REPAIRING: The source image is being repaired.</li>
             * <li>BUILDING: The user-defined commands are being run and an image is being created.</li>
             * <li>TESTING: The user-defined test commands are being run.</li>
             * <li>DISTRIBUTING: The created image is being copied and shared.</li>
             * <li>RELEASING: The temporary resources generated during the image creation process are being released.</li>
             * <li>SUCCESS The image creation task is completed.</li>
             * <li>PARTITION_SUCCESS: The image creation task is partially completed. The image is created, but exceptions may occur when the image was copied or shared or when temporary resources were released.</li>
             * <li>FAILED: The image creation task fails.</li>
             * <li>TEST_FAILED: The image is created, but the test fails.</li>
             * <li>CANCELLING: The image creation task is being canceled.</li>
             * <li>CANCELLED: The image creation task is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUILDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the image creation task.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public ImagePipelineExecutionSet build() {
                return new ImagePipelineExecutionSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelineExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelineExecutionsResponseBody</p>
     */
    public static class ImagePipelineExecution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImagePipelineExecutionSet")
        private java.util.List<ImagePipelineExecutionSet> imagePipelineExecutionSet;

        private ImagePipelineExecution(Builder builder) {
            this.imagePipelineExecutionSet = builder.imagePipelineExecutionSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagePipelineExecution create() {
            return builder().build();
        }

        /**
         * @return imagePipelineExecutionSet
         */
        public java.util.List<ImagePipelineExecutionSet> getImagePipelineExecutionSet() {
            return this.imagePipelineExecutionSet;
        }

        public static final class Builder {
            private java.util.List<ImagePipelineExecutionSet> imagePipelineExecutionSet; 

            /**
             * ImagePipelineExecutionSet.
             */
            public Builder imagePipelineExecutionSet(java.util.List<ImagePipelineExecutionSet> imagePipelineExecutionSet) {
                this.imagePipelineExecutionSet = imagePipelineExecutionSet;
                return this;
            }

            public ImagePipelineExecution build() {
                return new ImagePipelineExecution(this);
            } 

        } 

    }
}
