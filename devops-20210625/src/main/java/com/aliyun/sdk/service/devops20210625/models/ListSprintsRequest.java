// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSprintsRequest} extends {@link RequestModel}
 *
 * <p>ListSprintsRequest</p>
 */
public class ListSprintsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("maxResults")
    private Long maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
    private String spaceIdentifier;

    @Query
    @NameInMap("spaceType")
    @Validation(required = true)
    private String spaceType;

    private ListSprintsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSprintsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    public static final class Builder extends Request.Builder<ListSprintsRequest, Builder> {
        private String organizationId; 
        private Long maxResults; 
        private String nextToken; 
        private String spaceIdentifier; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(ListSprintsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.spaceIdentifier = response.spaceIdentifier;
            this.spaceType = response.spaceType;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 每页最大返回数量，0-200，默认值20
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页中的起始序列
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 项目id
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putQueryParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * 类型
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public ListSprintsRequest build() {
            return new ListSprintsRequest(this);
        } 

    } 

}
