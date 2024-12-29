// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAPSADBInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAPSADBInstancesResponseBody</p>
 */
public class DescribeAPSADBInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeAPSADBInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAPSADBInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private String message; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private String totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAPSADBInstancesResponseBody build() {
            return new DescribeAPSADBInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAPSADBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAPSADBInstancesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private String computeResource;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("ReservedACU")
        private String reservedACU;

        @com.aliyun.core.annotation.NameInMap("StorageResource")
        private Long storageResource;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Items(Builder builder) {
            this.computeResource = builder.computeResource;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.reservedACU = builder.reservedACU;
            this.storageResource = builder.storageResource;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public String getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return DBClusterDescription
         */
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBClusterStatus
         */
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        /**
         * @return reservedACU
         */
        public String getReservedACU() {
            return this.reservedACU;
        }

        /**
         * @return storageResource
         */
        public Long getStorageResource() {
            return this.storageResource;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String computeResource; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterStatus; 
            private String reservedACU; 
            private Long storageResource; 
            private String zoneId; 

            /**
             * ComputeResource.
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * DBClusterDescription.
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * DBClusterStatus.
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * ReservedACU.
             */
            public Builder reservedACU(String reservedACU) {
                this.reservedACU = reservedACU;
                return this;
            }

            /**
             * StorageResource.
             */
            public Builder storageResource(Long storageResource) {
                this.storageResource = storageResource;
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
