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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeImagePipelineExecutionsResponseBody model) {
            this.imagePipelineExecution = model.imagePipelineExecution;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ImagePipelineExecution.
         */
        public Builder imagePipelineExecution(ImagePipelineExecution imagePipelineExecution) {
            this.imagePipelineExecution = imagePipelineExecution;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned in this call. For more information about how to use this token, see the operation description.</p>
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
         * <p>The total number of image components returned.</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

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
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
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
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
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
            private String errorCode; 
            private String errorInfo; 
            private String executionId; 
            private String imageId; 
            private String imagePipelineId; 
            private String message; 
            private String modifiedTime; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 

            private Builder() {
            } 

            private Builder(ImagePipelineExecutionSet model) {
                this.creationTime = model.creationTime;
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.executionId = model.executionId;
                this.imageId = model.imageId;
                this.imagePipelineId = model.imagePipelineId;
                this.message = model.message;
                this.modifiedTime = model.modifiedTime;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorInfo.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
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

            private Builder() {
            } 

            private Builder(ImagePipelineExecution model) {
                this.imagePipelineExecutionSet = model.imagePipelineExecutionSet;
            } 

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
