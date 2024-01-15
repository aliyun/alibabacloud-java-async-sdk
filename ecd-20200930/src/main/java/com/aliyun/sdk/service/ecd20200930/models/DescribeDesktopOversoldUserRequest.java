// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopOversoldUserRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopOversoldUserRequest</p>
 */
public class DescribeDesktopOversoldUserRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @Query
    @NameInMap("UserDesktopIds")
    private java.util.List < String > userDesktopIds;

    @Query
    @NameInMap("UserGroupId")
    private String userGroupId;

    private DescribeDesktopOversoldUserRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endUserId = builder.endUserId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.oversoldGroupId = builder.oversoldGroupId;
        this.userDesktopIds = builder.userDesktopIds;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopOversoldUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
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
     * @return oversoldGroupId
     */
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    /**
     * @return userDesktopIds
     */
    public java.util.List < String > getUserDesktopIds() {
        return this.userDesktopIds;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopOversoldUserRequest, Builder> {
        private String clientToken; 
        private String endUserId; 
        private Integer maxResults; 
        private String nextToken; 
        private String oversoldGroupId; 
        private java.util.List < String > userDesktopIds; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopOversoldUserRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endUserId = request.endUserId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.oversoldGroupId = request.oversoldGroupId;
            this.userDesktopIds = request.userDesktopIds;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
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
         * OversoldGroupId.
         */
        public Builder oversoldGroupId(String oversoldGroupId) {
            this.putQueryParameter("OversoldGroupId", oversoldGroupId);
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }

        /**
         * UserDesktopIds.
         */
        public Builder userDesktopIds(java.util.List < String > userDesktopIds) {
            this.putQueryParameter("UserDesktopIds", userDesktopIds);
            this.userDesktopIds = userDesktopIds;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public DescribeDesktopOversoldUserRequest build() {
            return new DescribeDesktopOversoldUserRequest(this);
        } 

    } 

}
