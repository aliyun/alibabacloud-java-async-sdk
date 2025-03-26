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
 * {@link ListOfficeSiteOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>ListOfficeSiteOverviewResponseBody</p>
 */
public class ListOfficeSiteOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OfficeSiteOverviewResults")
    private java.util.List<OfficeSiteOverviewResults> officeSiteOverviewResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<OfficeSiteOverviewResults> getOfficeSiteOverviewResults() {
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
        private java.util.List<OfficeSiteOverviewResults> officeSiteOverviewResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListOfficeSiteOverviewResponseBody model) {
            this.nextToken = model.nextToken;
            this.officeSiteOverviewResults = model.officeSiteOverviewResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The token that is used to start the next query. If this parameter is empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The office network information.</p>
         */
        public Builder officeSiteOverviewResults(java.util.List<OfficeSiteOverviewResults> officeSiteOverviewResults) {
            this.officeSiteOverviewResults = officeSiteOverviewResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOfficeSiteOverviewResponseBody build() {
            return new ListOfficeSiteOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOfficeSiteOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfficeSiteOverviewResponseBody</p>
     */
    public static class OfficeSiteOverviewResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasExpiredEdsCount")
        private Integer hasExpiredEdsCount;

        @com.aliyun.core.annotation.NameInMap("HasExpiredEdsCountForGroup")
        private Integer hasExpiredEdsCountForGroup;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteStatus")
        private String officeSiteStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunningEdsCount")
        private Integer runningEdsCount;

        @com.aliyun.core.annotation.NameInMap("RunningEdsCountForGroup")
        private Integer runningEdsCountForGroup;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCount")
        private Integer totalEdsCount;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCountForGroup")
        private Integer totalEdsCountForGroup;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        @com.aliyun.core.annotation.NameInMap("WillExpiredEdsCount")
        private Integer willExpiredEdsCount;

        @com.aliyun.core.annotation.NameInMap("WillExpiredEdsCountForGroup")
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

            private Builder() {
            } 

            private Builder(OfficeSiteOverviewResults model) {
                this.hasExpiredEdsCount = model.hasExpiredEdsCount;
                this.hasExpiredEdsCountForGroup = model.hasExpiredEdsCountForGroup;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteStatus = model.officeSiteStatus;
                this.regionId = model.regionId;
                this.runningEdsCount = model.runningEdsCount;
                this.runningEdsCountForGroup = model.runningEdsCountForGroup;
                this.totalEdsCount = model.totalEdsCount;
                this.totalEdsCountForGroup = model.totalEdsCountForGroup;
                this.vpcType = model.vpcType;
                this.willExpiredEdsCount = model.willExpiredEdsCount;
                this.willExpiredEdsCountForGroup = model.willExpiredEdsCountForGroup;
            } 

            /**
             * <p>The number of expired cloud computers in the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hasExpiredEdsCount(Integer hasExpiredEdsCount) {
                this.hasExpiredEdsCount = hasExpiredEdsCount;
                return this;
            }

            /**
             * <p>The number of expired cloud computers in the cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hasExpiredEdsCountForGroup(Integer hasExpiredEdsCountForGroup) {
                this.hasExpiredEdsCountForGroup = hasExpiredEdsCountForGroup;
                return this;
            }

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The office network name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The office network status.</p>
             * <p>Default values:</p>
             * <ul>
             * <li><p>CONFIGUSERFAILED</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>REGISTERING</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>REGISTERED</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NEEDCONFIGTRUST</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>CONFIGUSERING</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>CONFIGTRUSTFAILED</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>ERROR</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>CONFIGTRUSTING</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NEEDCONFIGUSER</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGISTERED</p>
             */
            public Builder officeSiteStatus(String officeSiteStatus) {
                this.officeSiteStatus = officeSiteStatus;
                return this;
            }

            /**
             * <p>The ID of the region where the office network resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of cloud computers that are running in the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningEdsCount(Integer runningEdsCount) {
                this.runningEdsCount = runningEdsCount;
                return this;
            }

            /**
             * <p>The number of running cloud computers in the cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningEdsCountForGroup(Integer runningEdsCountForGroup) {
                this.runningEdsCountForGroup = runningEdsCountForGroup;
                return this;
            }

            /**
             * <p>The total number of cloud computers in the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalEdsCount(Integer totalEdsCount) {
                this.totalEdsCount = totalEdsCount;
                return this;
            }

            /**
             * <p>The total number of cloud computers in the cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalEdsCountForGroup(Integer totalEdsCountForGroup) {
                this.totalEdsCountForGroup = totalEdsCountForGroup;
                return this;
            }

            /**
             * <p>The office network type and its suitable VPC type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>standard (default): standard, exclusive VPC</li>
             * <li>customized: custom, user VPC</li>
             * <li>basic: basic, shared VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            /**
             * <p>The number of cloud computers that are about to expire in the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder willExpiredEdsCount(Integer willExpiredEdsCount) {
                this.willExpiredEdsCount = willExpiredEdsCount;
                return this;
            }

            /**
             * <p>The number of cloud computers that are about to expire in the cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
