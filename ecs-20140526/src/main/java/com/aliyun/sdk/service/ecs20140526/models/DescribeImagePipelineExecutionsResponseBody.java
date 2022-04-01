// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePipelineExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePipelineExecutionsResponseBody</p>
 */
public class DescribeImagePipelineExecutionsResponseBody extends TeaModel {
    @NameInMap("ImagePipelineExecution")
    private ImagePipelineExecution imagePipelineExecution;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * ImagePipelineExecution.
         */
        public Builder imagePipelineExecution(ImagePipelineExecution imagePipelineExecution) {
            this.imagePipelineExecution = imagePipelineExecution;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImagePipelineExecutionsResponseBody build() {
            return new DescribeImagePipelineExecutionsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * TagValue.
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
    public static class ImagePipelineExecutionSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ExecutionId")
        private String executionId;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImagePipelineId")
        private String imagePipelineId;

        @NameInMap("Message")
        private String message;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ExecutionId.
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImagePipelineId.
             */
            public Builder imagePipelineId(String imagePipelineId) {
                this.imagePipelineId = imagePipelineId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
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
    public static class ImagePipelineExecution extends TeaModel {
        @NameInMap("ImagePipelineExecutionSet")
        private java.util.List < ImagePipelineExecutionSet> imagePipelineExecutionSet;

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
        public java.util.List < ImagePipelineExecutionSet> getImagePipelineExecutionSet() {
            return this.imagePipelineExecutionSet;
        }

        public static final class Builder {
            private java.util.List < ImagePipelineExecutionSet> imagePipelineExecutionSet; 

            /**
             * ImagePipelineExecutionSet.
             */
            public Builder imagePipelineExecutionSet(java.util.List < ImagePipelineExecutionSet> imagePipelineExecutionSet) {
                this.imagePipelineExecutionSet = imagePipelineExecutionSet;
                return this;
            }

            public ImagePipelineExecution build() {
                return new ImagePipelineExecution(this);
            } 

        } 

    }
}
