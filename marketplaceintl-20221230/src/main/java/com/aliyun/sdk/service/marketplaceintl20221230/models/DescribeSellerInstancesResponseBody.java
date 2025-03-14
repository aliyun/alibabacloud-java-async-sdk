// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20221230.models;

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
 * {@link DescribeSellerInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSellerInstancesResponseBody</p>
 */
public class DescribeSellerInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("Fatal")
    private Boolean fatal;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DescribeSellerInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.fatal = builder.fatal;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSellerInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return fatal
     */
    public Boolean getFatal() {
        return this.fatal;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String code; 
        private Long count; 
        private Boolean fatal; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 
        private String version; 

        private Builder() {
        } 

        private Builder(DescribeSellerInstancesResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.fatal = model.fatal;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
            this.version = model.version;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>fatal</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder fatal(Boolean fatal) {
            this.fatal = fatal;
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
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
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
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeSellerInstancesResponseBody build() {
            return new DescribeSellerInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSellerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSellerInstancesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInfo")
        private String appInfo;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private Integer chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreatedOn")
        private Long createdOn;

        @com.aliyun.core.annotation.NameInMap("HostInfo")
        private String hostInfo;

        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Result(Builder builder) {
            this.appInfo = builder.appInfo;
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.createdOn = builder.createdOn;
            this.hostInfo = builder.hostInfo;
            this.info = builder.info;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appInfo
         */
        public String getAppInfo() {
            return this.appInfo;
        }

        /**
         * @return chargeType
         */
        public Integer getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createdOn
         */
        public Long getCreatedOn() {
            return this.createdOn;
        }

        /**
         * @return hostInfo
         */
        public String getHostInfo() {
            return this.hostInfo;
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appInfo; 
            private Integer chargeType; 
            private String commodityCode; 
            private Long createdOn; 
            private String hostInfo; 
            private String info; 
            private Long instanceId; 
            private String instanceStatus; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appInfo = model.appInfo;
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.createdOn = model.createdOn;
                this.hostInfo = model.hostInfo;
                this.info = model.info;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.userId = model.userId;
            } 

            /**
             * AppInfo.
             */
            public Builder appInfo(String appInfo) {
                this.appInfo = appInfo;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(Integer chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CreatedOn.
             */
            public Builder createdOn(Long createdOn) {
                this.createdOn = createdOn;
                return this;
            }

            /**
             * HostInfo.
             */
            public Builder hostInfo(String hostInfo) {
                this.hostInfo = hostInfo;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
