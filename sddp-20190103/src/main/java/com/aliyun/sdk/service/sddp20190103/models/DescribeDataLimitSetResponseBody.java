// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitSetResponseBody</p>
 */
public class DescribeDataLimitSetResponseBody extends TeaModel {
    @NameInMap("DataLimitSet")
    private DataLimitSet dataLimitSet;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDataLimitSetResponseBody(Builder builder) {
        this.dataLimitSet = builder.dataLimitSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataLimitSet
     */
    public DataLimitSet getDataLimitSet() {
        return this.dataLimitSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataLimitSet dataLimitSet; 
        private String requestId; 

        /**
         * The information about the data asset.
         */
        public Builder dataLimitSet(DataLimitSet dataLimitSet) {
            this.dataLimitSet = dataLimitSet;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataLimitSetResponseBody build() {
            return new DescribeDataLimitSetResponseBody(this);
        } 

    } 

    public static class DataLimitList extends TeaModel {
        @NameInMap("CheckStatus")
        private Integer checkStatus;

        @NameInMap("CheckStatusName")
        private String checkStatusName;

        @NameInMap("Connector")
        private String connector;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceType")
        private Long resourceType;

        @NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @NameInMap("UserName")
        private String userName;

        private DataLimitList(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.checkStatusName = builder.checkStatusName;
            this.connector = builder.connector;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.localName = builder.localName;
            this.parentId = builder.parentId;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.resourceTypeCode = builder.resourceTypeCode;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataLimitList create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkStatusName
         */
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        /**
         * @return connector
         */
        public String getConnector() {
            return this.connector;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceType
         */
        public Long getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceTypeCode
         */
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Integer checkStatus; 
            private String checkStatusName; 
            private String connector; 
            private Long gmtCreate; 
            private Long id; 
            private String localName; 
            private String parentId; 
            private String regionId; 
            private Long resourceType; 
            private String resourceTypeCode; 
            private String userName; 

            /**
             * Indicates whether the test of connectivity between DSC and the data asset is passed.
             * <p>
             * 
             * *   **2**: The connectivity test is in progress.
             * *   **3**: The connectivity test is passed.
             * *   **4**: The connectivity test failed.
             */
            public Builder checkStatus(Integer checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * The name of the data detection status.
             */
            public Builder checkStatusName(String checkStatusName) {
                this.checkStatusName = checkStatusName;
                return this;
            }

            /**
             * The connection string that is used to access the data asset.
             */
            public Builder connector(String connector) {
                this.connector = connector;
                return this;
            }

            /**
             * The time when the data asset was created. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID of the data asset.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The region in which the data asset resides.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The parent asset ID of the data asset.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The region in which the data asset resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of service to which the data asset belongs. Valid values:
             * <p>
             * 
             * *   **1**: MaxCompute
             * *   **2**: OSS
             * *   **3**: AnalyticDB for MySQL
             * *   **4**: Tablestore
             * *   **5**: ApsaraDB RDS
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The code of the service to which the data asset belongs. Valid values:
             * <p>
             * 
             * *   **ODPS**
             * *   **OSS**
             * *   **ADS**
             * *   **OTS**
             * *   **RDS**
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * The username that is used to access the data asset.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DataLimitList build() {
                return new DataLimitList(this);
            } 

        } 

    }
    public static class OssBucketList extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("RegionId")
        private String regionId;

        private OssBucketList(Builder builder) {
            this.bucketName = builder.bucketName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssBucketList create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String bucketName; 
            private String regionId; 

            /**
             * The name of the OSS bucket to which the OSS object belongs.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The region ID of the OSS object.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public OssBucketList build() {
                return new OssBucketList(this);
            } 

        } 

    }
    public static class RegionList extends TeaModel {
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionId")
        private String regionId;

        private RegionList(Builder builder) {
            this.localName = builder.localName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String localName; 
            private String regionId; 

            /**
             * The name of the region.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
    public static class DataLimitSet extends TeaModel {
        @NameInMap("DataLimitList")
        private java.util.List < DataLimitList> dataLimitList;

        @NameInMap("OssBucketList")
        private java.util.List < OssBucketList> ossBucketList;

        @NameInMap("RegionList")
        private java.util.List < RegionList> regionList;

        @NameInMap("ResourceType")
        private Long resourceType;

        @NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private DataLimitSet(Builder builder) {
            this.dataLimitList = builder.dataLimitList;
            this.ossBucketList = builder.ossBucketList;
            this.regionList = builder.regionList;
            this.resourceType = builder.resourceType;
            this.resourceTypeCode = builder.resourceTypeCode;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataLimitSet create() {
            return builder().build();
        }

        /**
         * @return dataLimitList
         */
        public java.util.List < DataLimitList> getDataLimitList() {
            return this.dataLimitList;
        }

        /**
         * @return ossBucketList
         */
        public java.util.List < OssBucketList> getOssBucketList() {
            return this.ossBucketList;
        }

        /**
         * @return regionList
         */
        public java.util.List < RegionList> getRegionList() {
            return this.regionList;
        }

        /**
         * @return resourceType
         */
        public Long getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceTypeCode
         */
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DataLimitList> dataLimitList; 
            private java.util.List < OssBucketList> ossBucketList; 
            private java.util.List < RegionList> regionList; 
            private Long resourceType; 
            private String resourceTypeCode; 
            private Integer totalCount; 

            /**
             * An array that consists of data assets that DSC is authorized to scan.
             */
            public Builder dataLimitList(java.util.List < DataLimitList> dataLimitList) {
                this.dataLimitList = dataLimitList;
                return this;
            }

            /**
             * An array consisting of the OSS objects that DSC is authorized to scan.
             */
            public Builder ossBucketList(java.util.List < OssBucketList> ossBucketList) {
                this.ossBucketList = ossBucketList;
                return this;
            }

            /**
             * An array consisting of the regions in which the data assets can be scanned.
             */
            public Builder regionList(java.util.List < RegionList> regionList) {
                this.regionList = regionList;
                return this;
            }

            /**
             * The type of service to which the data asset belongs. Valid values:
             * <p>
             * 
             * *   **1**: MaxCompute
             * *   **2**: OSS
             * *   **3**: AnalyticDB for MySQL
             * *   **4**: Tablestore
             * *   **5**: ApsaraDB RDS
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The service to which the data asset belongs. Valid values:
             * <p>
             * 
             * *   **ODPS**
             * *   **OSS**
             * *   **ADS**
             * *   **OTS**
             * *   **RDS**
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * The total number of data objects in the data assets.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DataLimitSet build() {
                return new DataLimitSet(this);
            } 

        } 

    }
}
