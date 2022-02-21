// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiscoveredResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiscoveredResourceRequest</p>
 */
public class DescribeDiscoveredResourceRequest extends Request {
    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private DescribeDiscoveredResourceRequest(Builder builder) {
        super(builder);
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
        this.region = builder.region;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiscoveredResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeDiscoveredResourceRequest, Builder> {
        private Long memberId; 
        private Boolean multiAccount; 
        private String region; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiscoveredResourceRequest response) {
            super(response);
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
            this.region = response.region;
            this.resourceId = response.resourceId;
            this.resourceType = response.resourceType;
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

        @Override
        public DescribeDiscoveredResourceRequest build() {
            return new DescribeDiscoveredResourceRequest(this);
        } 

    } 

}
