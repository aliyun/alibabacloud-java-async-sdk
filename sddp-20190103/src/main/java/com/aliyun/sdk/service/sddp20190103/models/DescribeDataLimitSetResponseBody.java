// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataLimitSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitSetResponseBody</p>
 */
public class DescribeDataLimitSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataLimitSet")
    private DataLimitSet dataLimitSet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the data asset.</p>
         */
        public Builder dataLimitSet(DataLimitSet dataLimitSet) {
            this.dataLimitSet = dataLimitSet;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataLimitSetResponseBody build() {
            return new DescribeDataLimitSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataLimitSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataLimitSetResponseBody</p>
     */
    public static class DataLimitList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private Integer checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckStatusName")
        private String checkStatusName;

        @com.aliyun.core.annotation.NameInMap("Connector")
        private String connector;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private Long resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
             * <p>Indicates whether the test of connectivity between DSC and the data asset is passed.</p>
             * <ul>
             * <li><strong>2</strong>: The connectivity test is in progress.</li>
             * <li><strong>3</strong>: The connectivity test is passed.</li>
             * <li><strong>4</strong>: The connectivity test failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder checkStatus(Integer checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The name of the data detection status.</p>
             * 
             * <strong>example:</strong>
             * <p>Connectivity test status</p>
             */
            public Builder checkStatusName(String checkStatusName) {
                this.checkStatusName = checkStatusName;
                return this;
            }

            /**
             * <p>The connection string that is used to access the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Connection string</p>
             */
            public Builder connector(String connector) {
                this.connector = connector;
                return this;
            }

            /**
             * <p>The time when the data asset was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1625587423000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The region in which the data asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The parent asset ID of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The region in which the data asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-****</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute</li>
             * <li><strong>2</strong>: OSS</li>
             * <li><strong>3</strong>: AnalyticDB for MySQL</li>
             * <li><strong>4</strong>: Tablestore</li>
             * <li><strong>5</strong>: ApsaraDB RDS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The code of the service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>ODPS</strong></li>
             * <li><strong>OSS</strong></li>
             * <li><strong>ADS</strong></li>
             * <li><strong>OTS</strong></li>
             * <li><strong>RDS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * <p>The username that is used to access the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>tsts</p>
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
    /**
     * 
     * {@link DescribeDataLimitSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataLimitSetResponseBody</p>
     */
    public static class OssBucketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
             * <p>The name of the OSS bucket to which the OSS object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The region ID of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-****</p>
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
    /**
     * 
     * {@link DescribeDataLimitSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataLimitSetResponseBody</p>
     */
    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-****</p>
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
    /**
     * 
     * {@link DescribeDataLimitSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataLimitSetResponseBody</p>
     */
    public static class DataLimitSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataLimitList")
        private java.util.List < DataLimitList> dataLimitList;

        @com.aliyun.core.annotation.NameInMap("OssBucketList")
        private java.util.List < OssBucketList> ossBucketList;

        @com.aliyun.core.annotation.NameInMap("RegionList")
        private java.util.List < RegionList> regionList;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private Long resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>An array that consists of data assets that DSC is authorized to scan.</p>
             */
            public Builder dataLimitList(java.util.List < DataLimitList> dataLimitList) {
                this.dataLimitList = dataLimitList;
                return this;
            }

            /**
             * <p>An array consisting of the OSS objects that DSC is authorized to scan.</p>
             */
            public Builder ossBucketList(java.util.List < OssBucketList> ossBucketList) {
                this.ossBucketList = ossBucketList;
                return this;
            }

            /**
             * <p>An array consisting of the regions in which the data assets can be scanned.</p>
             */
            public Builder regionList(java.util.List < RegionList> regionList) {
                this.regionList = regionList;
                return this;
            }

            /**
             * <p>The type of service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute</li>
             * <li><strong>2</strong>: OSS</li>
             * <li><strong>3</strong>: AnalyticDB for MySQL</li>
             * <li><strong>4</strong>: Tablestore</li>
             * <li><strong>5</strong>: ApsaraDB RDS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>ODPS</strong></li>
             * <li><strong>OSS</strong></li>
             * <li><strong>ADS</strong></li>
             * <li><strong>OTS</strong></li>
             * <li><strong>RDS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * <p>The total number of data objects in the data assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
