// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceOtaTaskByTenantResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceOtaTaskByTenantResponseBody</p>
 */
public class ListDeviceOtaTaskByTenantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDeviceOtaTaskByTenantResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceOtaTaskByTenantResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDeviceOtaTaskByTenantResponseBody build() {
            return new ListDeviceOtaTaskByTenantResponseBody(this);
        } 

    } 

    public static class TenantDeviceOtaTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OperationStatus")
        private Integer operationStatus;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        @com.aliyun.core.annotation.NameInMap("UpgradeCount")
        private Long upgradeCount;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private TenantDeviceOtaTasks(Builder builder) {
            this.model = builder.model;
            this.operationStatus = builder.operationStatus;
            this.publishTime = builder.publishTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.upgradeCount = builder.upgradeCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantDeviceOtaTasks create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return operationStatus
         */
        public Integer getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        /**
         * @return upgradeCount
         */
        public Long getUpgradeCount() {
            return this.upgradeCount;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String model; 
            private Integer operationStatus; 
            private String publishTime; 
            private Integer status; 
            private Integer taskId; 
            private Long upgradeCount; 
            private String version; 

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * OperationStatus.
             */
            public Builder operationStatus(Integer operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UpgradeCount.
             */
            public Builder upgradeCount(Long upgradeCount) {
                this.upgradeCount = upgradeCount;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public TenantDeviceOtaTasks build() {
                return new TenantDeviceOtaTasks(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TenantDeviceOtaTasks")
        private java.util.List < TenantDeviceOtaTasks> tenantDeviceOtaTasks;

        private Data(Builder builder) {
            this.tenantDeviceOtaTasks = builder.tenantDeviceOtaTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tenantDeviceOtaTasks
         */
        public java.util.List < TenantDeviceOtaTasks> getTenantDeviceOtaTasks() {
            return this.tenantDeviceOtaTasks;
        }

        public static final class Builder {
            private java.util.List < TenantDeviceOtaTasks> tenantDeviceOtaTasks; 

            /**
             * TenantDeviceOtaTasks.
             */
            public Builder tenantDeviceOtaTasks(java.util.List < TenantDeviceOtaTasks> tenantDeviceOtaTasks) {
                this.tenantDeviceOtaTasks = tenantDeviceOtaTasks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
