// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApDevicesResponseBody</p>
 */
public class DescribeApDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApDevices")
    private ApDevices apDevices;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApDevicesResponseBody(Builder builder) {
        this.apDevices = builder.apDevices;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
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

    public static DescribeApDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return apDevices
     */
    public ApDevices getApDevices() {
        return this.apDevices;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ApDevices apDevices; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * ApDevices.
         */
        public Builder apDevices(ApDevices apDevices) {
            this.apDevices = apDevices;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApDevicesResponseBody build() {
            return new DescribeApDevicesResponseBody(this);
        } 

    } 

    public static class ApInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsActivate")
        private Boolean isActivate;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private ApInfo(Builder builder) {
            this.isActivate = builder.isActivate;
            this.mac = builder.mac;
            this.model = builder.model;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApInfo create() {
            return builder().build();
        }

        /**
         * @return isActivate
         */
        public Boolean getIsActivate() {
            return this.isActivate;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean isActivate; 
            private String mac; 
            private String model; 
            private Boolean status; 

            /**
             * IsActivate.
             */
            public Builder isActivate(Boolean isActivate) {
                this.isActivate = isActivate;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public ApInfo build() {
                return new ApInfo(this);
            } 

        } 

    }
    public static class ApDevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApInfo")
        private java.util.List < ApInfo> apInfo;

        private ApDevices(Builder builder) {
            this.apInfo = builder.apInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApDevices create() {
            return builder().build();
        }

        /**
         * @return apInfo
         */
        public java.util.List < ApInfo> getApInfo() {
            return this.apInfo;
        }

        public static final class Builder {
            private java.util.List < ApInfo> apInfo; 

            /**
             * ApInfo.
             */
            public Builder apInfo(java.util.List < ApInfo> apInfo) {
                this.apInfo = apInfo;
                return this;
            }

            public ApDevices build() {
                return new ApDevices(this);
            } 

        } 

    }
}
