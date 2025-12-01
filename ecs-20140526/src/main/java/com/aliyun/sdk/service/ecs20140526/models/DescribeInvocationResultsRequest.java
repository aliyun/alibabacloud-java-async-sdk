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
 * {@link DescribeInvocationResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationResultsRequest</p>
 */
public class DescribeInvocationResultsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeHistory")
    private Boolean includeHistory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeRecordStatus")
    private String invokeRecordStatus;

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
    private java.util.List<Tag> tag;

    private DescribeInvocationResultsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.commandId = builder.commandId;
        this.contentEncoding = builder.contentEncoding;
        this.includeHistory = builder.includeHistory;
        this.instanceId = builder.instanceId;
        this.invokeId = builder.invokeId;
        this.invokeRecordStatus = builder.invokeRecordStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationResultsRequest create() {
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
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return includeHistory
     */
    public Boolean getIncludeHistory() {
        return this.includeHistory;
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
     * @return invokeRecordStatus
     */
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationResultsRequest, Builder> {
        private String sourceRegionId; 
        private String commandId; 
        private String contentEncoding; 
        private Boolean includeHistory; 
        private String instanceId; 
        private String invokeId; 
        private String invokeRecordStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationResultsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.commandId = request.commandId;
            this.contentEncoding = request.contentEncoding;
            this.includeHistory = request.includeHistory;
            this.instanceId = request.instanceId;
            this.invokeId = request.invokeId;
            this.invokeRecordStatus = request.invokeRecordStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
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
         * <p>$.parameters[11].schema.example</p>
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
         * <DescribeInvocationResultsResponse>
         *     <RequestId>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</RequestId>
         *     <Invocation>
         *         <InvocationResults>
         *             <InvocationResult>
         *                 <Dropped>0</Dropped>
         *                 <InvocationStatus>Success</InvocationStatus>
         *                 <InstanceId>i-bp1i7gg30r52z2em****</InstanceId>
         *                 <ExitCode>0</ExitCode>
         *                 <ErrorInfo>the specified instance does not exists</ErrorInfo>
         *                 <StartTime>2019-12-20T06:15:55Z</StartTime>
         *                 <Repeats>0</Repeats>
         *                 <InvokeRecordStatus>Running</InvokeRecordStatus>
         *                 <FinishedTime>2019-12-20T06:15:56Z</FinishedTime>
         *                 <Output>MTU6MzA6MDEK</Output>
         *                 <CommandId>c-hz0jdfwcsr****</CommandId>
         *                 <ErrorCode>InstanceNotExists</ErrorCode>
         *                 <InvokeId>t-hz0jdfwd9f****</InvokeId>
         *                 <StopTime>2020-01-19T09:15:47Z</StopTime>
         *                 <ContainerId>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</ContainerId>
         *                 <ContainerName>test-container</ContainerName>
         *                 <Tags>
         *                     <TagKey>owner</TagKey>
         *                     <TagValue>zhangsan</TagValue>
         *                 </Tags>
         *             </InvocationResult>
         *         </InvocationResults>
         *         <TotalCount>1</TotalCount>
         *         <PageSize>1</PageSize>
         *         <PageNumber>1</PageNumber>
         *     </Invocation>
         * </DescribeInvocationResultsResponse>
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
         * <p>{
         *   &quot;RequestId&quot; : &quot;473469C7-AA6F-4DC5-B3DB-A3DC0DE*****&quot;,
         *   &quot;Invocation&quot; : {
         *     &quot;InvocationResults&quot; : {
         *       &quot;InvocationResult&quot; : [ {
         *         &quot;Dropped&quot; : 0,
         *         &quot;InvocationStatus&quot; : &quot;Success&quot;,
         *         &quot;InstanceId&quot; : &quot;i-bp1i7gg30r52z2em****&quot;,
         *         &quot;ExitCode&quot; : 0,
         *         &quot;ErrorInfo&quot; : &quot;the specified instance does not exists&quot;,
         *         &quot;StartTime&quot; : &quot;2019-12-20T06:15:55Z&quot;,
         *         &quot;Repeats&quot; : 0,
         *         &quot;InvokeRecordStatus&quot; : &quot;Running&quot;,
         *         &quot;FinishedTime&quot; : &quot;2019-12-20T06:15:56Z&quot;,
         *         &quot;Output&quot; : &quot;MTU6MzA6MDEK&quot;,
         *         &quot;CommandId&quot; : &quot;c-hz0jdfwcsr****&quot;,
         *         &quot;ErrorCode&quot; : &quot;InstanceNotExists&quot;,
         *         &quot;InvokeId&quot; : &quot;t-hz0jdfwd9f****&quot;,
         *         &quot;StopTime&quot; : &quot;2020-01-19T09:15:47Z&quot;,
         *         &quot;ContainerId&quot;:&quot;ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****&quot;,
         *         &quot;ContainerName&quot;:&quot;test-container&quot;,<br>        &quot;Tags&quot;: [
         *                     {
         *                         &quot;TagKey&quot;: &quot;owner&quot;,
         *                         &quot;TagValue&quot;: &quot;zhangsan&quot;
         *                     }
         *                 ]
         *       } ]
         *     },
         *     &quot;TotalCount&quot; : 1,
         *     &quot;PageSize&quot; : 1,
         *     &quot;PageNumber&quot; : 1
         *   }
         * }</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeHistory(Boolean includeHistory) {
            this.putQueryParameter("IncludeHistory", includeHistory);
            this.includeHistory = includeHistory;
            return this;
        }

        /**
         * <p>$.parameters[11].schema.description</p>
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
         * <p>$.parameters[11].schema.items.enumValueTitles</p>
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
         * <p>$.parameters[11].schema.enumValueTitles</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder invokeRecordStatus(String invokeRecordStatus) {
            this.putQueryParameter("InvokeRecordStatus", invokeRecordStatus);
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }

        /**
         * <p>FEATUREecsXZ3H4M</p>
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
         * <p>dubbo</p>
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
         * <p>acs:ecs:{#regionId}:{#accountId}:command/*</p>
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
         * <p>acs:ecs:{#regionId}:{#accountId}:instance/*</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>$.parameters[11].schema.items.description</p>
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
         * <p>$.parameters[11].schema.items.example</p>
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
         * <p>The region ID of the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeInvocationResultsRequest build() {
            return new DescribeInvocationResultsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvocationResultsRequest} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the command task. You can call the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> operation to query the IDs of all command tasks.</p>
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
