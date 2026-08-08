// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link ListCrossAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListCrossAccountsRequest</p>
 */
public class ListCrossAccountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountOwnerId")
    private Long crossAccountOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagementMode")
    private String managementMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private ListCrossAccountsRequest(Builder builder) {
        super(builder);
        this.crossAccountOwnerId = builder.crossAccountOwnerId;
        this.managementMode = builder.managementMode;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrossAccountsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccountOwnerId
     */
    public Long getCrossAccountOwnerId() {
        return this.crossAccountOwnerId;
    }

    /**
     * @return managementMode
     */
    public String getManagementMode() {
        return this.managementMode;
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

    public static final class Builder extends Request.Builder<ListCrossAccountsRequest, Builder> {
        private Long crossAccountOwnerId; 
        private String managementMode; 
        private Integer maxResults; 
        private String nextToken; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListCrossAccountsRequest request) {
            super(request);
            this.crossAccountOwnerId = request.crossAccountOwnerId;
            this.managementMode = request.managementMode;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * CrossAccountOwnerId.
         */
        public Builder crossAccountOwnerId(Long crossAccountOwnerId) {
            this.putQueryParameter("CrossAccountOwnerId", crossAccountOwnerId);
            this.crossAccountOwnerId = crossAccountOwnerId;
            return this;
        }

        /**
         * ManagementMode.
         */
        public Builder managementMode(String managementMode) {
            this.putQueryParameter("ManagementMode", managementMode);
            this.managementMode = managementMode;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * TargetId.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListCrossAccountsRequest build() {
            return new ListCrossAccountsRequest(this);
        } 

    } 

}
