// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInvocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationsRequest</p>
 */
public class DescribeInvocationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandName")
    private String commandName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandType")
    private String commandType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeOutput")
    private Boolean includeOutput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeStatus")
    private String invokeStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatMode")
    private String repeatMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timed")
    private Boolean timed;

    private DescribeInvocationsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.commandId = builder.commandId;
        this.commandName = builder.commandName;
        this.commandType = builder.commandType;
        this.contentEncoding = builder.contentEncoding;
        this.includeOutput = builder.includeOutput;
        this.instanceId = builder.instanceId;
        this.invokeId = builder.invokeId;
        this.invokeStatus = builder.invokeStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.repeatMode = builder.repeatMode;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.timed = builder.timed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return commandName
     */
    public String getCommandName() {
        return this.commandName;
    }

    /**
     * @return commandType
     */
    public String getCommandType() {
        return this.commandType;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return includeOutput
     */
    public Boolean getIncludeOutput() {
        return this.includeOutput;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return invokeStatus
     */
    public String getInvokeStatus() {
        return this.invokeStatus;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timed
     */
    public Boolean getTimed() {
        return this.timed;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationsRequest, Builder> {
        private String sourceRegionId; 
        private String commandId; 
        private String commandName; 
        private String commandType; 
        private String contentEncoding; 
        private Boolean includeOutput; 
        private String instanceId; 
        private String invokeId; 
        private String invokeStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String repeatMode; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private Boolean timed; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.commandId = request.commandId;
            this.commandName = request.commandName;
            this.commandType = request.commandType;
            this.contentEncoding = request.contentEncoding;
            this.includeOutput = request.includeOutput;
            this.instanceId = request.instanceId;
            this.invokeId = request.invokeId;
            this.invokeStatus = request.invokeStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.repeatMode = request.repeatMode;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.timed = request.timed;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>c-hz0jdfwcsr****</p>
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>The command name. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>CommandTestName</p>
         */
        public Builder commandName(String commandName) {
            this.putQueryParameter("CommandName", commandName);
            this.commandName = commandName;
            return this;
        }

        /**
         * <p>The command type. Valid values:</p>
         * <ul>
         * <li>RunBatScript: batch command, applicable to Windows instances.</li>
         * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances.</li>
         * <li>RunShellScript: shell command, applicable to Linux instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        public Builder commandType(String commandType) {
            this.putQueryParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * <p>The encoding mode of the <code>CommandContent</code> and <code>Output</code> response parameters. Valid values:</p>
         * <ul>
         * <li>PlainText: returns the original command content and command outputs.</li>
         * <li>Base64: returns the Base64-encoded command content and command outputs.</li>
         * </ul>
         * <p>Default value: Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>Specifies whether to return the command outputs in the response.</p>
         * <ul>
         * <li>true: The command outputs are returned. When this parameter is set to true, you must specify <code>InvokeId</code>, <code>InstanceId</code>, or both.</li>
         * <li>false: The command outputs are not returned.</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeOutput(Boolean includeOutput) {
            this.putQueryParameter("IncludeOutput", includeOutput);
            this.includeOutput = includeOutput;
            return this;
        }

        /**
         * <p>The ID of instance N. When you specify this parameter, the system queries all the execution records of all the commands that run on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1i7gg30r52z2em****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The command task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The overall execution status of the command task. The value of this parameter depends on the execution states of the command task on all involved instances. Valid values:</p>
         * <ul>
         * <li><p>Running:</p>
         * <ul>
         * <li>Scheduled task: Before you stop the scheduled execution of the command, the overall execution state is always Running.</li>
         * <li>One-time task: If the command is being run on instances, the overall execution state is Running.</li>
         * </ul>
         * </li>
         * <li><p>Finished:</p>
         * <ul>
         * <li>Scheduled task: The overall execution state can never be Finished.</li>
         * <li>One-time task: The execution is complete on all instances, or the execution is stopped on some instances and is complete on the other instances.</li>
         * </ul>
         * </li>
         * <li><p>Success: If the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
         * <ul>
         * <li>One-time task: The execution is complete, and the exit code is 0.</li>
         * <li>Scheduled task: The last execution is complete, the exit code is 0, and the specified period ends.</li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li>Scheduled task: The overall execution state can never be Failed.</li>
         * <li>One-time task: The execution failed on all instances.</li>
         * </ul>
         * </li>
         * <li><p>Stopped: The task is stopped.</p>
         * </li>
         * <li><p>Stopping: The task is being stopped.</p>
         * </li>
         * <li><p>PartialFailed: The task fails on some instances. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect.</p>
         * </li>
         * <li><p>Pending: The command is being verified or sent. If the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
         * </li>
         * <li><p>Scheduled: The command that is set to run on a schedule is sent and waiting to be run. If the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder invokeStatus(String invokeStatus) {
            this.putQueryParameter("InvokeStatus", invokeStatus);
            this.invokeStatus = invokeStatus;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 1 to 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The execution mode of the command. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect. Valid values:</p>
         * <ul>
         * <li>Once: The command is immediately run.</li>
         * <li>Period: The command is run on a schedule.</li>
         * <li>NextRebootOnly: The command is run the next time the instances start.</li>
         * <li>EveryReboot: The command is run every time the instances start.</li>
         * </ul>
         * <p>This parameter is empty by default, which indicates that commands run in all modes are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * <p>The ID of the resource group. After you set this parameter, command execution results in the specified resource group are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The tags that are added to the command.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether the command is to be automatically run. Valid values:</p>
         * <ul>
         * <li><p>true: The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code>.</p>
         * </li>
         * <li><p>false: The command meets one of the following requirements:</p>
         * <ul>
         * <li>The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Once</code>.</li>
         * <li>The command task is canceled, stopped, or completed.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        @Override
        public DescribeInvocationsRequest build() {
            return new DescribeInvocationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvocationsRequest} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N of the command. You can specify up to 20 tag keys for the command. The tag key cannot be an empty string.</p>
             * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the command. You can specify up to 20 tag values for the command. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
