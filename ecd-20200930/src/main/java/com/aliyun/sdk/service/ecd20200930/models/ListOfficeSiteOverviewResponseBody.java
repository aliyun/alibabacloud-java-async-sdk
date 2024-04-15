// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOfficeSiteOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>ListOfficeSiteOverviewResponseBody</p>
 */
public class ListOfficeSiteOverviewResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OfficeSiteOverviewResults")
    private java.util.List < OfficeSiteOverviewResults> officeSiteOverviewResults;

    @NameInMap("RequestId")
    private String requestId;

    private ListOfficeSiteOverviewResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.officeSiteOverviewResults = builder.officeSiteOverviewResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfficeSiteOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officeSiteOverviewResults
     */
    public java.util.List < OfficeSiteOverviewResults> getOfficeSiteOverviewResults() {
        return this.officeSiteOverviewResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < OfficeSiteOverviewResults> officeSiteOverviewResults; 
        private String requestId; 

        /**
         * The token that is used to start the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The office network information.
         */
        public Builder officeSiteOverviewResults(java.util.List < OfficeSiteOverviewResults> officeSiteOverviewResults) {
            this.officeSiteOverviewResults = officeSiteOverviewResults;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOfficeSiteOverviewResponseBody build() {
            return new ListOfficeSiteOverviewResponseBody(this);
        } 

    } 

    public static class OfficeSiteOverviewResults extends TeaModel {
        @NameInMap("HasExpiredEdsCount")
        private Integer hasExpiredEdsCount;

        @NameInMap("HasExpiredEdsCountForGroup")
        private Integer hasExpiredEdsCountForGroup;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("OfficeSiteStatus")
        private String officeSiteStatus;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RunningEdsCount")
        private Integer runningEdsCount;

        @NameInMap("RunningEdsCountForGroup")
        private Integer runningEdsCountForGroup;

        @NameInMap("TotalEdsCount")
        private Integer totalEdsCount;

        @NameInMap("TotalEdsCountForGroup")
        private Integer totalEdsCountForGroup;

        @NameInMap("VpcType")
        private String vpcType;

        @NameInMap("WillExpiredEdsCount")
        private Integer willExpiredEdsCount;

        @NameInMap("WillExpiredEdsCountForGroup")
        private Integer willExpiredEdsCountForGroup;

        private OfficeSiteOverviewResults(Builder builder) {
            this.hasExpiredEdsCount = builder.hasExpiredEdsCount;
            this.hasExpiredEdsCountForGroup = builder.hasExpiredEdsCountForGroup;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteStatus = builder.officeSiteStatus;
            this.regionId = builder.regionId;
            this.runningEdsCount = builder.runningEdsCount;
            this.runningEdsCountForGroup = builder.runningEdsCountForGroup;
            this.totalEdsCount = builder.totalEdsCount;
            this.totalEdsCountForGroup = builder.totalEdsCountForGroup;
            this.vpcType = builder.vpcType;
            this.willExpiredEdsCount = builder.willExpiredEdsCount;
            this.willExpiredEdsCountForGroup = builder.willExpiredEdsCountForGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfficeSiteOverviewResults create() {
            return builder().build();
        }

        /**
         * @return hasExpiredEdsCount
         */
        public Integer getHasExpiredEdsCount() {
            return this.hasExpiredEdsCount;
        }

        /**
         * @return hasExpiredEdsCountForGroup
         */
        public Integer getHasExpiredEdsCountForGroup() {
            return this.hasExpiredEdsCountForGroup;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSiteStatus
         */
        public String getOfficeSiteStatus() {
            return this.officeSiteStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runningEdsCount
         */
        public Integer getRunningEdsCount() {
            return this.runningEdsCount;
        }

        /**
         * @return runningEdsCountForGroup
         */
        public Integer getRunningEdsCountForGroup() {
            return this.runningEdsCountForGroup;
        }

        /**
         * @return totalEdsCount
         */
        public Integer getTotalEdsCount() {
            return this.totalEdsCount;
        }

        /**
         * @return totalEdsCountForGroup
         */
        public Integer getTotalEdsCountForGroup() {
            return this.totalEdsCountForGroup;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        /**
         * @return willExpiredEdsCount
         */
        public Integer getWillExpiredEdsCount() {
            return this.willExpiredEdsCount;
        }

        /**
         * @return willExpiredEdsCountForGroup
         */
        public Integer getWillExpiredEdsCountForGroup() {
            return this.willExpiredEdsCountForGroup;
        }

        public static final class Builder {
            private Integer hasExpiredEdsCount; 
            private Integer hasExpiredEdsCountForGroup; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteStatus; 
            private String regionId; 
            private Integer runningEdsCount; 
            private Integer runningEdsCountForGroup; 
            private Integer totalEdsCount; 
            private Integer totalEdsCountForGroup; 
            private String vpcType; 
            private Integer willExpiredEdsCount; 
            private Integer willExpiredEdsCountForGroup; 

            /**
             * The number of expired cloud computers in the office network.
             */
            public Builder hasExpiredEdsCount(Integer hasExpiredEdsCount) {
                this.hasExpiredEdsCount = hasExpiredEdsCount;
                return this;
            }

            /**
             * The number of expired cloud computers in the cloud computer pool.
             */
            public Builder hasExpiredEdsCountForGroup(Integer hasExpiredEdsCountForGroup) {
                this.hasExpiredEdsCountForGroup = hasExpiredEdsCountForGroup;
                return this;
            }

            /**
             * The office network ID.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The office network name.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The office network status.
             * <p>
             * 
             * Default values:
             * 
             * *   CONFIGUSERFAILED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   REGISTERING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   REGISTERED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NEEDCONFIGTRUST
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CONFIGUSERING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CONFIGTRUSTFAILED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   ERROR
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CONFIGTRUSTING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NEEDCONFIGUSER
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder officeSiteStatus(String officeSiteStatus) {
                this.officeSiteStatus = officeSiteStatus;
                return this;
            }

            /**
             * The ID of the region where the office network resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of cloud computers that are running in the office network.
             */
            public Builder runningEdsCount(Integer runningEdsCount) {
                this.runningEdsCount = runningEdsCount;
                return this;
            }

            /**
             * The number of running cloud computers in the cloud computer pool.
             */
            public Builder runningEdsCountForGroup(Integer runningEdsCountForGroup) {
                this.runningEdsCountForGroup = runningEdsCountForGroup;
                return this;
            }

            /**
             * The total number of cloud computers in the office network.
             */
            public Builder totalEdsCount(Integer totalEdsCount) {
                this.totalEdsCount = totalEdsCount;
                return this;
            }

            /**
             * The total number of cloud computers in the cloud computer pool.
             */
            public Builder totalEdsCountForGroup(Integer totalEdsCountForGroup) {
                this.totalEdsCountForGroup = totalEdsCountForGroup;
                return this;
            }

            /**
             * The office network type and its suitable VPC type.
             * <p>
             * 
             * Valid values:
             * 
             * *   standard (default): standard, exclusive VPC
             * *   customized: custom, user VPC
             * *   basic: basic, shared VPC
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            /**
             * The number of cloud computers that are about to expire in the office network.
             */
            public Builder willExpiredEdsCount(Integer willExpiredEdsCount) {
                this.willExpiredEdsCount = willExpiredEdsCount;
                return this;
            }

            /**
             * The number of cloud computers that are about to expire in the cloud computer pool.
             */
            public Builder willExpiredEdsCountForGroup(Integer willExpiredEdsCountForGroup) {
                this.willExpiredEdsCountForGroup = willExpiredEdsCountForGroup;
                return this;
            }

            public OfficeSiteOverviewResults build() {
                return new OfficeSiteOverviewResults(this);
            } 

        } 

    }
}
