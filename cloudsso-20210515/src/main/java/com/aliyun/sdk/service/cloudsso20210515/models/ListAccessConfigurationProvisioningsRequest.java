// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
    @com.aliyun.core.annotation.NameInMap("OriginTargetId")
    private String originTargetId;

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
        this.originTargetId = builder.originTargetId;
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
     * @return originTargetId
     */
    public String getOriginTargetId() {
        return this.originTargetId;
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
        private String originTargetId; 
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
            this.originTargetId = request.originTargetId;
            this.provisioningStatus = request.provisioningStatus;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The access configuration ID used as a filter condition for the query.</p>
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
         * <p>The directory ID.</p>
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
         * <p>The maximum number of entries to return on each page.</p>
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
         * <p>The token used to return the next page of query results. You do not need to specify NextToken when you call this operation for the first time.</p>
         * <p>When you call this operation for the first time, if the total number of returned entries exceeds the value of MaxResults, the returned results are truncated. Only the number of entries specified by MaxResults is returned, the IsTruncated parameter is set to true, and a NextToken is returned. You can use the returned NextToken to call this operation again to query the truncated entries while keeping other request parameters unchanged. You can repeat this process until IsTruncated is set to false, which indicates that all entries are returned.</p>
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
         * <p>The Alibaba Cloud account ID of the provisioning target.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder originTargetId(String originTargetId) {
            this.putQueryParameter("OriginTargetId", originTargetId);
            this.originTargetId = originTargetId;
            return this;
        }

        /**
         * <p>The provisioning status used as a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>Provisioned: The provisioning succeeded.</li>
         * <li>ReprovisionRequired: Reprovisioning is required.</li>
         * <li>DeprovisionFailed: The provisioning failed.</li>
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
         * <p>The target ID used as a filter condition for the query.</p>
         * <blockquote>
         * <p>You must specify both TargetId and TargetType for them to take effect as filter conditions.</p>
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
         * <p>The target type used as a filter condition for the query.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RD-Account: The target is an account in a resource directory.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both TargetId and TargetType for them to take effect as filter conditions.</p>
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
