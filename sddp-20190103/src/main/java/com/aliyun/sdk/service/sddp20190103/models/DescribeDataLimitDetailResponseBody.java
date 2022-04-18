// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitDetailResponseBody</p>
 */
public class DescribeDataLimitDetailResponseBody extends TeaModel {
    @NameInMap("DataLimit")
    private DataLimit dataLimit;

    @NameInMap("RequestId")
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
         * DataLimit.
         */
        public Builder dataLimit(DataLimit dataLimit) {
            this.dataLimit = dataLimit;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataLimitDetailResponseBody build() {
            return new DescribeDataLimitDetailResponseBody(this);
        } 

    } 

    public static class DataLimit extends TeaModel {
        @NameInMap("CheckStatus")
        private Integer checkStatus;

        @NameInMap("CheckStatusName")
        private String checkStatusName;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceType")
        private Long resourceType;

        @NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @NameInMap("UserName")
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
             * CheckStatus.
             */
            public Builder checkStatus(Integer checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * CheckStatusName.
             */
            public Builder checkStatusName(String checkStatusName) {
                this.checkStatusName = checkStatusName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
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
             * ResourceType.
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ResourceTypeCode.
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * UserName.
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
