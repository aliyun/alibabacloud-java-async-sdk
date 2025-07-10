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
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DashboardPassword.
             */
            public Builder dashboardPassword(String dashboardPassword) {
                this.dashboardPassword = dashboardPassword;
                return this;
            }

            /**
             * DashboardUserName.
             */
            public Builder dashboardUserName(String dashboardUserName) {
                this.dashboardUserName = dashboardUserName;
                return this;
            }

            /**
             * DiskPerformanceLevel.
             */
            public Builder diskPerformanceLevel(String diskPerformanceLevel) {
                this.diskPerformanceLevel = diskPerformanceLevel;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * PrivateConnectUrl.
             */
            public Builder privateConnectUrl(String privateConnectUrl) {
                this.privateConnectUrl = privateConnectUrl;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ProjectSpec.
             */
            public Builder projectSpec(String projectSpec) {
                this.projectSpec = projectSpec;
                return this;
            }

            /**
             * PublicConnectUrl.
             */
            public Builder publicConnectUrl(String publicConnectUrl) {
                this.publicConnectUrl = publicConnectUrl;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>vSwitch ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1cpq8mr64paltkb****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp19ame5m1r3oejns****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
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
