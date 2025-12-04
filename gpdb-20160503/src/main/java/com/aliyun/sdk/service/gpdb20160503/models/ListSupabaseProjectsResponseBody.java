// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSupabaseProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupabaseProjectsResponseBody</p>
 */
public class ListSupabaseProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListSupabaseProjectsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupabaseProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListSupabaseProjectsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>A list of objects, where each object represents a Supabase instance.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum amount of data to read this time. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token to use in the next request to get the next page. If this field is empty, there are no more results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of log entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListSupabaseProjectsResponseBody build() {
            return new ListSupabaseProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupabaseProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupabaseProjectsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DashboardPassword")
        private String dashboardPassword;

        @com.aliyun.core.annotation.NameInMap("DashboardUserName")
        private String dashboardUserName;

        @com.aliyun.core.annotation.NameInMap("DiskPerformanceLevel")
        private String diskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PrivateConnectUrl")
        private String privateConnectUrl;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ProjectSpec")
        private String projectSpec;

        @com.aliyun.core.annotation.NameInMap("PublicConnectUrl")
        private String publicConnectUrl;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.dashboardPassword = builder.dashboardPassword;
            this.dashboardUserName = builder.dashboardUserName;
            this.diskPerformanceLevel = builder.diskPerformanceLevel;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.payType = builder.payType;
            this.privateConnectUrl = builder.privateConnectUrl;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectSpec = builder.projectSpec;
            this.publicConnectUrl = builder.publicConnectUrl;
            this.regionId = builder.regionId;
            this.securityIPList = builder.securityIPList;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dashboardPassword
         */
        public String getDashboardPassword() {
            return this.dashboardPassword;
        }

        /**
         * @return dashboardUserName
         */
        public String getDashboardUserName() {
            return this.dashboardUserName;
        }

        /**
         * @return diskPerformanceLevel
         */
        public String getDiskPerformanceLevel() {
            return this.diskPerformanceLevel;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return privateConnectUrl
         */
        public String getPrivateConnectUrl() {
            return this.privateConnectUrl;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectSpec
         */
        public String getProjectSpec() {
            return this.projectSpec;
        }

        /**
         * @return publicConnectUrl
         */
        public String getPublicConnectUrl() {
            return this.publicConnectUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createTime; 
            private String dashboardPassword; 
            private String dashboardUserName; 
            private String diskPerformanceLevel; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String payType; 
            private String privateConnectUrl; 
            private String projectId; 
            private String projectName; 
            private String projectSpec; 
            private String publicConnectUrl; 
            private String regionId; 
            private String securityIPList; 
            private String status; 
            private Long storageSize; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createTime = model.createTime;
                this.dashboardPassword = model.dashboardPassword;
                this.dashboardUserName = model.dashboardUserName;
                this.diskPerformanceLevel = model.diskPerformanceLevel;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.payType = model.payType;
                this.privateConnectUrl = model.privateConnectUrl;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.projectSpec = model.projectSpec;
                this.publicConnectUrl = model.publicConnectUrl;
                this.regionId = model.regionId;
                this.securityIPList = model.securityIPList;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-09T04:54:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Supabase Dashboard password (not used).</p>
             * 
             * <strong>example:</strong>
             * <p>xxpassword</p>
             */
            public Builder dashboardPassword(String dashboardPassword) {
                this.dashboardPassword = dashboardPassword;
                return this;
            }

            /**
             * <p>Supabase Dashboard user name (not used).</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder dashboardUserName(String dashboardUserName) {
                this.dashboardUserName = dashboardUserName;
                return this;
            }

            /**
             * <p>The ESSD performance level.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder diskPerformanceLevel(String diskPerformanceLevel) {
                this.diskPerformanceLevel = diskPerformanceLevel;
                return this;
            }

            /**
             * <p>The database engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>gpdb</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>6.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * <li><strong>Free</strong>: Free.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The private (VPC) connection URL for the Supabase Dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder privateConnectUrl(String privateConnectUrl) {
                this.privateConnectUrl = privateConnectUrl;
                return this;
            }

            /**
             * <p>The Supabase project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sbp-12***</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the Supabase project.</p>
             * 
             * <strong>example:</strong>
             * <p>supabase_project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The type of the Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1C1G</p>
             */
            public Builder projectSpec(String projectSpec) {
                this.projectSpec = projectSpec;
                return this;
            }

            /**
             * <p>The public connection URL for the Supabase Dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>10.154.11.10</p>
             */
            public Builder publicConnectUrl(String publicConnectUrl) {
                this.publicConnectUrl = publicConnectUrl;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>A comma-separated list of IP addresses and CIDR blocks allowed to connect. Valid values:</p>
             * <ul>
             * <li>0.0.0.0/0</li>
             * <li>10.23.12.24(IP)</li>
             * <li>10.23.12.24/24. This is a CIDR block. The value<code>/24</code>indicates that the prefix of the CIDR block is 24-bit long. You can replace 24 with a value in the range of<code>[1,32]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The status of the Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The vSwitch ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1cpq8mr64paltkb****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp19ame5m1r3oejns****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
