// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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

        /**
         * <p>The file sending records.</p>
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The total number of file sending tasks queried.</p>
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

            /**
             * <p>The creation time of the file sending task.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:54Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error code returned when the file failed to be sent to the instance. Valid values:</p>
             * <ul>
             * <li>Null: The file is sent to the instance.</li>
             * <li>InstanceNotExists: The instance does not exist or has been released.</li>
             * <li>InstanceReleased: The instance is released while the file is being sent.</li>
             * <li>InstanceNotRunning: The instance is not running when the file sending task is being created.</li>
             * <li>AccountNotExists: The specified account does not exist.</li>
             * <li>ClientNotRunning: Cloud Assistant Agent is not running.</li>
             * <li>ClientNotResponse: Cloud Assistant Agent does not respond.</li>
             * <li>ClientIsUpgrading: Cloud Assistant Agent is being upgraded.</li>
             * <li>ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded.</li>
             * <li>DeliveryTimeout: The file sending task timed out.</li>
             * <li>FileCreateFail: The file failed to be created.</li>
             * <li>FileAlreadyExists: A file with the same name exists in the specified directory.</li>
             * <li>FileContentInvalid: The file content is invalid.</li>
             * <li>FileNameInvalid: The file name is invalid.</li>
             * <li>FilePathInvalid: The specified directory is invalid.</li>
             * <li>FileAuthorityInvalid: The specified permissions on the file are invalid.</li>
             * <li>UserGroupNotExists: The specified user group does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InstanceNotExists</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the file failed to be sent or the file sending task failed to be executed. Valid values:</p>
             * <ul>
             * <li>Null: The file is sent to the instance.</li>
             * <li>the specified instance does not exists</li>
             * <li>the specified instance has been released</li>
             * <li>the instance is not running when create task</li>
             * <li>the specified account does not exists</li>
             * <li>the aliyun service is not running on the instance</li>
             * <li>the aliyun service in the instance does not response</li>
             * <li>the aliyun service in the instance is upgrading now</li>
             * <li>the aliyun service in the instance need upgrade</li>
             * <li>the command delivery has been timeout</li>
             * <li>the file creation is failed due to unknown error</li>
             * <li>the authority of file is invalid</li>
             * <li>File content is empty</li>
             * <li>the content of file is invalid</li>
             * <li>File already exists</li>
             * <li>File name is invalid</li>
             * <li>File path is invalid</li>
             * <li>Owner not exists</li>
             * <li>Group not exists</li>
             * <li>Mode is invalid</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>the instance is not running when create task</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>The time when the file sending task was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:54Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf614fhehhz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the file sending task. Valid values:</p>
             * <ul>
             * <li>Pending: The file is being verified or sent.</li>
             * <li>Invalid: The file is invalid.</li>
             * <li>Running: The file is being sent to the instance.</li>
             * <li>Aborted: The file failed to be sent to the instance.</li>
             * <li>Success: The file is sent.</li>
             * <li>Failed: The file failed to be created on the instance.</li>
             * <li>Error: An error occurred and interrupted the file sending task.</li>
             * <li>Timeout: The file sending task timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>The time when the file sending task started to be executed on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:54Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when the task status was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:54Z</p>
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
        private java.util.List < InvokeInstance> invokeInstance;

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
        public java.util.List < InvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

        public static final class Builder {
            private java.util.List < InvokeInstance> invokeInstance; 

            /**
             * InvokeInstance.
             */
            public Builder invokeInstance(java.util.List < InvokeInstance> invokeInstance) {
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

            /**
             * <p>The tag key of the file sending task.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the file sending task.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
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

            /**
             * <p>The content of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>#!/bin/bash  echo &quot;Current User is :&quot;  echo $(ps | grep &quot;$$&quot; | awk &quot;{print $2}&quot;)</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The type of the file content. Valid values:</p>
             * <ul>
             * <li>PlainText: The file content is not encoded.</li>
             * <li>Base64: The file content is encoded in Base64.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PlainText</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The time when the file sending task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:54Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a test file.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The group of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder fileGroup(String fileGroup) {
                this.fileGroup = fileGroup;
                return this;
            }

            /**
             * <p>The permissions on the file.</p>
             * 
             * <strong>example:</strong>
             * <p>777</p>
             */
            public Builder fileMode(String fileMode) {
                this.fileMode = fileMode;
                return this;
            }

            /**
             * <p>The owner of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder fileOwner(String fileOwner) {
                this.fileOwner = fileOwner;
                return this;
            }

            /**
             * <p>The overall sending status of the file. The overall sending status of the file varies based on the sending status of the file on all destination instances. Valid values:</p>
             * <ul>
             * <li><p>Pending: The file is being verified or sent. If the sending state of the file on at least one instance is Pending, the overall sending state of the file is Pending.</p>
             * </li>
             * <li><p>Running: The file is being sent to the instances. If the sending state of the file on at least one instance is Running, the overall sending state of the file is Running.</p>
             * </li>
             * <li><p>Success: If the sending state of the file on all instances is Success, the overall sending state of the file is Success.</p>
             * </li>
             * <li><p>If the sending state of the file on all instances is Failed, the overall sending state of the file is Failed. If the sending state of the file on one or more instances is one of the following values, the overall sending state of the file is Failed:</p>
             * <ul>
             * <li>Invalid: The file is invalid.</li>
             * <li>Aborted: The file failed to be sent to the instances.</li>
             * <li>Failed: The file failed to be created on the instances.</li>
             * <li>Timeout: The file sending task timed out.</li>
             * <li>Error: An error occurred and interrupted the file sending task.</li>
             * </ul>
             * </li>
             * <li><p>PartialFailed: The file sending task was completed on some instances but failed on other instances. If the sending state of the file is Success on some instances and is Failed on other instances, the overall sending state of the file is PartialFailed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>The ID of the file sending task.</p>
             * 
             * <strong>example:</strong>
             * <p>f-hz0jdfwd9f****</p>
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * <p>The destination instances.</p>
             */
            public Builder invokeInstances(InvokeInstances invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.txt</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether a file in the destination directory is overwritten if the file has the same name as the sent file.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder overwrite(String overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * <p>The tags of the file sending task.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The destination directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/user</p>
             */
            public Builder targetDir(String targetDir) {
                this.targetDir = targetDir;
                return this;
            }

            /**
             * <p>The number of the destination instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
        private java.util.List < Invocation> invocation;

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
        public java.util.List < Invocation> getInvocation() {
            return this.invocation;
        }

        public static final class Builder {
            private java.util.List < Invocation> invocation; 

            /**
             * Invocation.
             */
            public Builder invocation(java.util.List < Invocation> invocation) {
                this.invocation = invocation;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
