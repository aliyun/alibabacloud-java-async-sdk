// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListAclEntriesRequest</p>
 */
public class ListAclEntriesRequest extends Request {
    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListAclEntriesRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
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

    public static final class Builder extends Request.Builder<ListAclEntriesRequest, Builder> {
        private String aclId; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListAclEntriesRequest response) {
            super(response);
            this.aclId = response.aclId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
        } 

        /**
         * 访问控制策略Id
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * 查询数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListAclEntriesRequest build() {
            return new ListAclEntriesRequest(this);
        } 

    } 

}
