// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataLimitDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitDetailResponseBody</p>
 */
public class DescribeDataLimitDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataLimit")
    private DataLimit dataLimit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDataLimitDetailResponseBody(Builder builder) {
        this.dataLimit = builder.dataLimit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataLimit
     */
    public DataLimit getDataLimit() {
        return this.dataLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataLimit dataLimit; 
        private String requestId; 

        /**
         * <p>The details of the data asset.</p>
         */
        public Builder dataLimit(DataLimit dataLimit) {
            this.dataLimit = dataLimit;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataLimitDetailResponseBody build() {
            return new DescribeDataLimitDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataLimitDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataLimitDetailResponseBody</p>
     */
    public static class DataLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private Integer checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckStatusName")
        private String checkStatusName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private Long resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DataLimit(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.checkStatusName = builder.checkStatusName;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.localName = builder.localName;
            this.parentId = builder.parentId;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.resourceTypeCode = builder.resourceTypeCode;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataLimit create() {
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
         * @return port
         */
        public Integer getPort() {
            return this.port;
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
            private Long gmtCreate; 
            private Long id; 
            private String localName; 
            private String parentId; 
            private Integer port; 
            private String regionId; 
            private Long resourceType; 
            private String resourceTypeCode; 
            private String userName; 

            /**
             * <p>The status of the connectivity test between the data asset and DSC. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: indicates that the data asset was being connected.</li>
             * <li><strong>3</strong>: indicates that the data asset was connected to DSC.</li>
             * <li><strong>4</strong>: indicates that the data asset failed to be connected.</li>
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
             * <p>The result that indicates the status of the connectivity test between the data asset and DSC. Valid values:</p>
             * <ul>
             * <li><strong>Passed</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Testing</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Passed</p>
             */
            public Builder checkStatusName(String checkStatusName) {
                this.checkStatusName = checkStatusName;
                return this;
            }

            /**
             * <p>The time when the data asset was connected to DSC. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>145600000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>12300</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The region in which the data asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Qingdao)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The ID and name of the data asset in the service to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5eup49p6o274****.RDS_example</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the data asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute</li>
             * <li><strong>2</strong>: OSS</li>
             * <li><strong>3</strong>: AnalyticDB for MySQL</li>
             * <li><strong>4</strong>: Tablestore</li>
             * <li><strong>5</strong>: ApsaraDB RDS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>MaxCompute</strong></li>
             * <li><strong>OSS</strong></li>
             * <li><strong>ADS</strong></li>
             * <li><strong>OTS</strong></li>
             * <li><strong>RDS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * <p>The account of the user who manages the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>User01</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DataLimit build() {
                return new DataLimit(this);
            } 

        } 

    }
}
