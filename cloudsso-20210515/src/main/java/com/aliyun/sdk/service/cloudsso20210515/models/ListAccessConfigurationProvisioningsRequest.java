// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAccessConfigurationProvisioningsRequest} extends {@link RequestModel}
 *
 * <p>ListAccessConfigurationProvisioningsRequest</p>
 */
public class ListAccessConfigurationProvisioningsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisioningStatus")
    private String provisioningStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private ListAccessConfigurationProvisioningsRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.provisioningStatus = builder.provisioningStatus;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessConfigurationProvisioningsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListAccessConfigurationProvisioningsRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private Integer maxResults; 
        private String nextToken; 
        private String provisioningStatus; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessConfigurationProvisioningsRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.provisioningStatus = request.provisioningStatus;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the access configuration. The ID can be used to filter access permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00ccule7tadaijxc****</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 1 to 20.</p>
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
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. If this is your first time to call this operation, you do not need to specify the <code>NextToken</code> parameter.</p>
         * <p>When you call this operation for the first time, if the total number of entries to return exceeds the value of <code>MaxResults</code>, the entries are truncated. Only the entries that match the value of <code>MaxResults</code> are returned, and the excess entries are not returned. In this case, the value of the response parameter <code>IsTruncated</code> is <code>true</code>, and <code>NextToken</code> is returned. In the next call, you can use the value of <code>NextToken</code> and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of <code>IsTruncated</code> becomes <code>false</code>. This way, all entries are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The status of the access configuration. The value can be used to filter accounts. Valid values:</p>
         * <ul>
         * <li>Provisioned: The access configuration is provisioned.</li>
         * <li>ReprovisionRequired: The access configuration needs to be re-provisioned.</li>
         * <li>DeprovisionFailed: The access configuration failed to be provisioned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Provisioned</p>
         */
        public Builder provisioningStatus(String provisioningStatus) {
            this.putQueryParameter("ProvisioningStatus", provisioningStatus);
            this.provisioningStatus = provisioningStatus;
            return this;
        }

        /**
         * <p>The ID of the task object. The ID can be used to filter access permissions.</p>
         * <blockquote>
         * <p> You can use the type to filter access permissions only if you specify both <code>TargetId</code> and <code>TargetType</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the task object. The type can be used to filter access permissions.</p>
         * <p>Set the value to RD-Account, which specifies the accounts in the resource directory.</p>
         * <blockquote>
         * <p> You can use the type to filter access permissions only if you specify both <code>TargetId</code> and <code>TargetType</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListAccessConfigurationProvisioningsRequest build() {
            return new ListAccessConfigurationProvisioningsRequest(this);
        } 

    } 

}
