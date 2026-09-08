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
 * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSendFileResultsResponseBody</p>
 */
public class DescribeSendFileResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Invocations")
    private Invocations invocations;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSendFileResultsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSendFileResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invocations
     */
    public Invocations getInvocations() {
        return this.invocations;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Invocations invocations; 
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSendFileResultsResponseBody model) {
            this.invocations = model.invocations;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Invocations.
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * <p>The total number of scripts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSendFileResultsResponseBody build() {
            return new DescribeSendFileResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class InvokeInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private InvokeInstance(Builder builder) {
            this.creationTime = builder.creationTime;
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.invocationStatus = builder.invocationStatus;
            this.startTime = builder.startTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstance create() {
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
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String creationTime; 
            private String errorCode; 
            private String errorInfo; 
            private String finishTime; 
            private String instanceId; 
            private String invocationStatus; 
            private String startTime; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(InvokeInstance model) {
                this.creationTime = model.creationTime;
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.finishTime = model.finishTime;
                this.instanceId = model.instanceId;
                this.invocationStatus = model.invocationStatus;
                this.startTime = model.startTime;
                this.updateTime = model.updateTime;
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
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InvocationStatus.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InvokeInstance build() {
                return new InvokeInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class InvokeInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvokeInstance")
        private java.util.List<InvokeInstance> invokeInstance;

        private InvokeInstances(Builder builder) {
            this.invokeInstance = builder.invokeInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstances create() {
            return builder().build();
        }

        /**
         * @return invokeInstance
         */
        public java.util.List<InvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

        public static final class Builder {
            private java.util.List<InvokeInstance> invokeInstance; 

            private Builder() {
            } 

            private Builder(InvokeInstances model) {
                this.invokeInstance = model.invokeInstance;
            } 

            /**
             * InvokeInstance.
             */
            public Builder invokeInstance(java.util.List<InvokeInstance> invokeInstance) {
                this.invokeInstance = invokeInstance;
                return this;
            }

            public InvokeInstances build() {
                return new InvokeInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
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
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
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
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class Invocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileGroup")
        private String fileGroup;

        @com.aliyun.core.annotation.NameInMap("FileMode")
        private String fileMode;

        @com.aliyun.core.annotation.NameInMap("FileOwner")
        private String fileOwner;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeId")
        private String invokeId;

        @com.aliyun.core.annotation.NameInMap("InvokeInstances")
        private InvokeInstances invokeInstances;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Overwrite")
        private String overwrite;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TargetDir")
        private String targetDir;

        @com.aliyun.core.annotation.NameInMap("VmCount")
        private Integer vmCount;

        private Invocation(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.fileGroup = builder.fileGroup;
            this.fileMode = builder.fileMode;
            this.fileOwner = builder.fileOwner;
            this.invocationStatus = builder.invocationStatus;
            this.invokeId = builder.invokeId;
            this.invokeInstances = builder.invokeInstances;
            this.name = builder.name;
            this.overwrite = builder.overwrite;
            this.tags = builder.tags;
            this.targetDir = builder.targetDir;
            this.vmCount = builder.vmCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocation create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileGroup
         */
        public String getFileGroup() {
            return this.fileGroup;
        }

        /**
         * @return fileMode
         */
        public String getFileMode() {
            return this.fileMode;
        }

        /**
         * @return fileOwner
         */
        public String getFileOwner() {
            return this.fileOwner;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return invokeId
         */
        public String getInvokeId() {
            return this.invokeId;
        }

        /**
         * @return invokeInstances
         */
        public InvokeInstances getInvokeInstances() {
            return this.invokeInstances;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overwrite
         */
        public String getOverwrite() {
            return this.overwrite;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return targetDir
         */
        public String getTargetDir() {
            return this.targetDir;
        }

        /**
         * @return vmCount
         */
        public Integer getVmCount() {
            return this.vmCount;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private String creationTime; 
            private String description; 
            private String fileGroup; 
            private String fileMode; 
            private String fileOwner; 
            private String invocationStatus; 
            private String invokeId; 
            private InvokeInstances invokeInstances; 
            private String name; 
            private String overwrite; 
            private Tags tags; 
            private String targetDir; 
            private Integer vmCount; 

            private Builder() {
            } 

            private Builder(Invocation model) {
                this.content = model.content;
                this.contentType = model.contentType;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.fileGroup = model.fileGroup;
                this.fileMode = model.fileMode;
                this.fileOwner = model.fileOwner;
                this.invocationStatus = model.invocationStatus;
                this.invokeId = model.invokeId;
                this.invokeInstances = model.invokeInstances;
                this.name = model.name;
                this.overwrite = model.overwrite;
                this.tags = model.tags;
                this.targetDir = model.targetDir;
                this.vmCount = model.vmCount;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FileGroup.
             */
            public Builder fileGroup(String fileGroup) {
                this.fileGroup = fileGroup;
                return this;
            }

            /**
             * FileMode.
             */
            public Builder fileMode(String fileMode) {
                this.fileMode = fileMode;
                return this;
            }

            /**
             * FileOwner.
             */
            public Builder fileOwner(String fileOwner) {
                this.fileOwner = fileOwner;
                return this;
            }

            /**
             * InvocationStatus.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * InvokeId.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * InvokeInstances.
             */
            public Builder invokeInstances(InvokeInstances invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Overwrite.
             */
            public Builder overwrite(String overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TargetDir.
             */
            public Builder targetDir(String targetDir) {
                this.targetDir = targetDir;
                return this;
            }

            /**
             * VmCount.
             */
            public Builder vmCount(Integer vmCount) {
                this.vmCount = vmCount;
                return this;
            }

            public Invocation build() {
                return new Invocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class Invocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Invocation")
        private java.util.List<Invocation> invocation;

        private Invocations(Builder builder) {
            this.invocation = builder.invocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocations create() {
            return builder().build();
        }

        /**
         * @return invocation
         */
        public java.util.List<Invocation> getInvocation() {
            return this.invocation;
        }

        public static final class Builder {
            private java.util.List<Invocation> invocation; 

            private Builder() {
            } 

            private Builder(Invocations model) {
                this.invocation = model.invocation;
            } 

            /**
             * Invocation.
             */
            public Builder invocation(java.util.List<Invocation> invocation) {
                this.invocation = invocation;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
