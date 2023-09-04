// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessConfigurationProvisioningsRequest} extends {@link RequestModel}
 *
 * <p>ListAccessConfigurationProvisioningsRequest</p>
 */
public class ListAccessConfigurationProvisioningsRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ProvisioningStatus")
    private String provisioningStatus;

    @Query
    @NameInMap("TargetId")
    private String targetId;

    @Query
    @NameInMap("TargetType")
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
         * The ID of the access configuration. The ID can be used to filter accounts.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 20.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token to return for the next page. If this is your first time to call this operation, you do not need to specify `NextToken`.
         * <p>
         * 
         * When you call this operation for the first time, if the total number of entries to return exceeds the value of `MaxResults`, the entries are truncated. Only the entries that match the value of `MaxResults` are returned, and the excess entries are not returned. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The status of the access configuration. The value can be used to filter accounts. Valid values:
         * <p>
         * 
         * *   Provisioned: The access configuration is provisioned.
         * *   ReprovisionRequired: The access configuration needs to be re-provisioned.
         * *   DeprovisionFailed: The access configuration failed to be provisioned.
         */
        public Builder provisioningStatus(String provisioningStatus) {
            this.putQueryParameter("ProvisioningStatus", provisioningStatus);
            this.provisioningStatus = provisioningStatus;
            return this;
        }

        /**
         * The ID of the task object. The ID can be used to filter accounts.
         * <p>
         * 
         * >  You can use the ID to filter accounts only if you specify both `TargetId` and `TargetType`.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The type of the task object. The type can be used to filter accounts.
         * <p>
         * 
         * Set the value to RD-Account, which indicates an account in your resource directory.
         * 
         * >  You can use the type to filter accounts only if you specify both `TargetId` and `TargetType`.
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
