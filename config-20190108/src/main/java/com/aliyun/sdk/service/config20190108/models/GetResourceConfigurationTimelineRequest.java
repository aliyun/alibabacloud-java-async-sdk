// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceConfigurationTimelineRequest} extends {@link RequestModel}
 *
 * <p>GetResourceConfigurationTimelineRequest</p>
 */
public class GetResourceConfigurationTimelineRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Limit")
    @Validation(maximum = 100, minimum = 1)
    private Integer limit;

    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private GetResourceConfigurationTimelineRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
        this.nextToken = builder.nextToken;
        this.region = builder.region;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceConfigurationTimelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return memberId
     */
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * @return multiAccount
     */
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetResourceConfigurationTimelineRequest, Builder> {
        private Long endTime; 
        private Integer limit; 
        private Long memberId; 
        private Boolean multiAccount; 
        private String nextToken; 
        private String region; 
        private String resourceId; 
        private String resourceType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceConfigurationTimelineRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.limit = response.limit;
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
            this.nextToken = response.nextToken;
            this.region = response.region;
            this.resourceId = response.resourceId;
            this.resourceType = response.resourceType;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(Long memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MultiAccount.
         */
        public Builder multiAccount(Boolean multiAccount) {
            this.putQueryParameter("MultiAccount", multiAccount);
            this.multiAccount = multiAccount;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetResourceConfigurationTimelineRequest build() {
            return new GetResourceConfigurationTimelineRequest(this);
        } 

    } 

}
