// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessAssignmentsRequest} extends {@link RequestModel}
 *
 * <p>ListAccessAssignmentsRequest</p>
 */
public class ListAccessAssignmentsRequest extends Request {
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
    @NameInMap("PrincipalId")
    private String principalId;

    @Query
    @NameInMap("PrincipalType")
    private String principalType;

    @Query
    @NameInMap("TargetId")
    private String targetId;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    private ListAccessAssignmentsRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessAssignmentsRequest create() {
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
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
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

    public static final class Builder extends Request.Builder<ListAccessAssignmentsRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private Integer maxResults; 
        private String nextToken; 
        private String principalId; 
        private String principalType; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessAssignmentsRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * The ID of the access configuration. The ID can be used to filter access permissions.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * The directory ID.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The maximum number of entries per page.
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
         * The pagination token that is used in the next request to retrieve a new page of results. If this is your first time to call this operation, you do not need to specify the `NextToken` parameter.
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
         * The ID of the CloudSSO identity. The ID can be used to filter access permissions.
         * <p>
         * 
         * *   If you set `PrincipalType` to User, set `PrincipalId` to the ID of the CloudSSO user.
         * *   If you set `PrincipalType` to Group, set `PrincipalId` to the ID of the CloudSSO group.
         * 
         * >  You can use the type to filter access permissions only if you specify both PrincipalId and `PrincipalType`.``
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * The type of the CloudSSO identity. The type can be used to filter access permissions. Valid values:
         * <p>
         * 
         * *   User
         * *   Group
         * 
         * >  You can use the type to filter access permissions only if you specify both PrincipalId and `PrincipalType`.``
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * The ID of the task object. The ID can be used to filter access permissions.
         * <p>
         * 
         * >  You can use the type to filter access permissions only if you specify both `TargetId` and `TargetType`.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The type of the task object. The type can be used to filter access permissions.
         * <p>
         * 
         * Set the value to RD-Account, which specifies the accounts in the resource directory.
         * 
         * >  You can use the type to filter access permissions only if you specify both `TargetId` and `TargetType`.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListAccessAssignmentsRequest build() {
            return new ListAccessAssignmentsRequest(this);
        } 

    } 

}
