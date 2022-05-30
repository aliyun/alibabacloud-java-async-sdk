// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationMembersRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationMembersRequest</p>
 */
public class ListOrganizationMembersRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("externUid")
    private String externUid;

    @Query
    @NameInMap("joinTimeFrom")
    private Long joinTimeFrom;

    @Query
    @NameInMap("joinTimeTo")
    private Long joinTimeTo;

    @Query
    @NameInMap("maxResults")
    @Validation(maximum = 200, minimum = 1)
    private Long maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("organizationMemberName")
    private String organizationMemberName;

    @Query
    @NameInMap("provider")
    private String provider;

    @Query
    @NameInMap("state")
    private String state;

    private ListOrganizationMembersRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.externUid = builder.externUid;
        this.joinTimeFrom = builder.joinTimeFrom;
        this.joinTimeTo = builder.joinTimeTo;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.organizationMemberName = builder.organizationMemberName;
        this.provider = builder.provider;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationMembersRequest create() {
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
     * @return externUid
     */
    public String getExternUid() {
        return this.externUid;
    }

    /**
     * @return joinTimeFrom
     */
    public Long getJoinTimeFrom() {
        return this.joinTimeFrom;
    }

    /**
     * @return joinTimeTo
     */
    public Long getJoinTimeTo() {
        return this.joinTimeTo;
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
     * @return organizationMemberName
     */
    public String getOrganizationMemberName() {
        return this.organizationMemberName;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListOrganizationMembersRequest, Builder> {
        private String organizationId; 
        private String externUid; 
        private Long joinTimeFrom; 
        private Long joinTimeTo; 
        private Long maxResults; 
        private String nextToken; 
        private String organizationMemberName; 
        private String provider; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListOrganizationMembersRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.externUid = request.externUid;
            this.joinTimeFrom = request.joinTimeFrom;
            this.joinTimeTo = request.joinTimeTo;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.organizationMemberName = request.organizationMemberName;
            this.provider = request.provider;
            this.state = request.state;
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
         * externUid.
         */
        public Builder externUid(String externUid) {
            this.putQueryParameter("externUid", externUid);
            this.externUid = externUid;
            return this;
        }

        /**
         * joinTimeFrom.
         */
        public Builder joinTimeFrom(Long joinTimeFrom) {
            this.putQueryParameter("joinTimeFrom", joinTimeFrom);
            this.joinTimeFrom = joinTimeFrom;
            return this;
        }

        /**
         * joinTimeTo.
         */
        public Builder joinTimeTo(Long joinTimeTo) {
            this.putQueryParameter("joinTimeTo", joinTimeTo);
            this.joinTimeTo = joinTimeTo;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * organizationMemberName.
         */
        public Builder organizationMemberName(String organizationMemberName) {
            this.putQueryParameter("organizationMemberName", organizationMemberName);
            this.organizationMemberName = organizationMemberName;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.putQueryParameter("state", state);
            this.state = state;
            return this;
        }

        @Override
        public ListOrganizationMembersRequest build() {
            return new ListOrganizationMembersRequest(this);
        } 

    } 

}
