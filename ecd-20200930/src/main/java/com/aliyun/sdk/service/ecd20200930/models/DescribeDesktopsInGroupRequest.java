// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDesktopsInGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopsInGroupRequest</p>
 */
public class DescribeDesktopsInGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEndTimePeriod")
    private Long customEndTimePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomStartTimePeriod")
    private Long customStartTimePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreDeleted")
    private Boolean ignoreDeleted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeDesktopsInGroupRequest(Builder builder) {
        super(builder);
        this.customEndTimePeriod = builder.customEndTimePeriod;
        this.customStartTimePeriod = builder.customStartTimePeriod;
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
     * @return customEndTimePeriod
     */
    public Long getCustomEndTimePeriod() {
        return this.customEndTimePeriod;
    }

    /**
     * @return customStartTimePeriod
     */
    public Long getCustomStartTimePeriod() {
        return this.customStartTimePeriod;
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
        private Long customEndTimePeriod; 
        private Long customStartTimePeriod; 
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
            this.customEndTimePeriod = request.customEndTimePeriod;
            this.customStartTimePeriod = request.customStartTimePeriod;
            this.desktopGroupId = request.desktopGroupId;
            this.ignoreDeleted = request.ignoreDeleted;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.payType = request.payType;
            this.regionId = request.regionId;
        } 

        /**
         * CustomEndTimePeriod.
         */
        public Builder customEndTimePeriod(Long customEndTimePeriod) {
            this.putQueryParameter("CustomEndTimePeriod", customEndTimePeriod);
            this.customEndTimePeriod = customEndTimePeriod;
            return this;
        }

        /**
         * CustomStartTimePeriod.
         */
        public Builder customStartTimePeriod(Long customStartTimePeriod) {
            this.putQueryParameter("CustomStartTimePeriod", customStartTimePeriod);
            this.customStartTimePeriod = customStartTimePeriod;
            return this;
        }

        /**
         * <p>The ID of the cloud computer share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to ignore deletion flags.</p>
         * <p>Default value: true. Valid values:</p>
         * <ul>
         * <li>true: ignores deletion flags. The cloud computers that were deleted are returned.</li>
         * <li>false: does not ignore deletion flags. The cloud computers that were deleted are not returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreDeleted(Boolean ignoreDeleted) {
            this.putQueryParameter("IgnoreDeleted", ignoreDeleted);
            this.ignoreDeleted = ignoreDeleted;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * <li>Maximum value: 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The billing method of the cloud computer share.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
