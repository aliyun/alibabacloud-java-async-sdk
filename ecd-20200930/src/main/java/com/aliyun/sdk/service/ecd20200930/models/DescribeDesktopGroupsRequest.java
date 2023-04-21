// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopGroupsRequest</p>
 */
public class DescribeDesktopGroupsRequest extends Request {
    @Query
    @NameInMap("BundleId")
    private java.util.List < String > bundleId;

    @Query
    @NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopGroupName")
    private String desktopGroupName;

    @Query
    @NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

    @Query
    @NameInMap("ExcludedEndUserIds")
    private java.util.List < String > excludedEndUserIds;

    @Query
    @NameInMap("ImageId")
    private java.util.List < String > imageId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("OwnType")
    private Long ownType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private Integer status;

    private DescribeDesktopGroupsRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupName = builder.desktopGroupName;
        this.endUserIds = builder.endUserIds;
        this.excludedEndUserIds = builder.excludedEndUserIds;
        this.imageId = builder.imageId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.ownType = builder.ownType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public java.util.List < String > getBundleId() {
        return this.bundleId;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopGroupName
     */
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    /**
     * @return endUserIds
     */
    public java.util.List < String > getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return excludedEndUserIds
     */
    public java.util.List < String > getExcludedEndUserIds() {
        return this.excludedEndUserIds;
    }

    /**
     * @return imageId
     */
    public java.util.List < String > getImageId() {
        return this.imageId;
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
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return ownType
     */
    public Long getOwnType() {
        return this.ownType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopGroupsRequest, Builder> {
        private java.util.List < String > bundleId; 
        private String desktopGroupId; 
        private String desktopGroupName; 
        private java.util.List < String > endUserIds; 
        private java.util.List < String > excludedEndUserIds; 
        private java.util.List < String > imageId; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private Long ownType; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String protocolType; 
        private String regionId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopGroupsRequest request) {
            super(request);
            this.bundleId = request.bundleId;
            this.desktopGroupId = request.desktopGroupId;
            this.desktopGroupName = request.desktopGroupName;
            this.endUserIds = request.endUserIds;
            this.excludedEndUserIds = request.excludedEndUserIds;
            this.imageId = request.imageId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.ownType = request.ownType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * BundleId.
         */
        public Builder bundleId(java.util.List < String > bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The ID of the desktop group.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The name of the desktop group that you want to query. Fuzzy search is supported.
         */
        public Builder desktopGroupName(String desktopGroupName) {
            this.putQueryParameter("DesktopGroupName", desktopGroupName);
            this.desktopGroupName = desktopGroupName;
            return this;
        }

        /**
         * The IDs of the end users who have the permissions on the desktop group.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * The IDs of the end users that you want to exclude. The end users have the permissions on the desktop group.
         */
        public Builder excludedEndUserIds(java.util.List < String > excludedEndUserIds) {
            this.putQueryParameter("ExcludedEndUserIds", excludedEndUserIds);
            this.excludedEndUserIds = excludedEndUserIds;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(java.util.List < String > imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The maximum number of entries to return on each page. Maximum value: 100. Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The workspace ID of the desktop groups that you want to query.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The type of the desktop group.
         * <p>
         * 
         * Valid values:
         * 
         * *   0
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     personal desktop group.
         * 
         *     <!-- -->
         * 
         * *   1
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     shared desktop group (multi-session)
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder ownType(Long ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * The validity period of the desktop group. The unit is specified by the PeriodUnit parameter.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the validity period of the desktop group.
         * <p>
         * 
         * Valid values:
         * 
         * *   Month
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Year
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Day
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The ID of the policy with which you want to associate the desktop group.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * The type of the protocol. Valid values:
         * <p>
         * 
         * *   ASP
         * *   HDX
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The region ID of the desktop groups that you want to query.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The payment status of the desktop group.
         * <p>
         * 
         * Valid values:
         * 
         * *   0
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The desktop group is unpaid
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   1
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The desktop group is paid
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   2
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The desktop group has an overdue payment or expired
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeDesktopGroupsRequest build() {
            return new DescribeDesktopGroupsRequest(this);
        } 

    } 

}
