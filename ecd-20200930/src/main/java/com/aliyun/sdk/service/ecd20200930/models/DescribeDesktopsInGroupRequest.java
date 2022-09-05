// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopsInGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopsInGroupRequest</p>
 */
public class DescribeDesktopsInGroupRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("IgnoreDeleted")
    private Boolean ignoreDeleted;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDesktopsInGroupRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.ignoreDeleted = builder.ignoreDeleted;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopsInGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return ignoreDeleted
     */
    public Boolean getIgnoreDeleted() {
        return this.ignoreDeleted;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopsInGroupRequest, Builder> {
        private String desktopGroupId; 
        private Boolean ignoreDeleted; 
        private Integer maxResults; 
        private String nextToken; 
        private String payType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopsInGroupRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.ignoreDeleted = request.ignoreDeleted;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.payType = request.payType;
            this.regionId = request.regionId;
        } 

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * IgnoreDeleted.
         */
        public Builder ignoreDeleted(Boolean ignoreDeleted) {
            this.putQueryParameter("IgnoreDeleted", ignoreDeleted);
            this.ignoreDeleted = ignoreDeleted;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDesktopsInGroupRequest build() {
            return new DescribeDesktopsInGroupRequest(this);
        } 

    } 

}
