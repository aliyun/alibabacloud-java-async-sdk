// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApiMeteringResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiMeteringResponseBody</p>
 */
public class DescribeApiMeteringResponseBody extends TeaModel {
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
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DescribeApiMeteringResponseBody(Builder builder) {
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

    public static DescribeApiMeteringResponseBody create() {
        return builder().build();
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
        private Boolean success; 
        private String version; 

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
         * <p>false</p>
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
        public Builder result(java.util.List < Result> result) {
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

        public DescribeApiMeteringResponseBody build() {
            return new DescribeApiMeteringResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiMeteringResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiMeteringResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunPk")
        private Long aliyunPk;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Long totalCapacity;

        @com.aliyun.core.annotation.NameInMap("TotalQuota")
        private Long totalQuota;

        @com.aliyun.core.annotation.NameInMap("TotalUsage")
        private Long totalUsage;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Result(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.totalCapacity = builder.totalCapacity;
            this.totalQuota = builder.totalQuota;
            this.totalUsage = builder.totalUsage;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public Long getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return totalCapacity
         */
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return totalQuota
         */
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return totalUsage
         */
        public Long getTotalUsage() {
            return this.totalUsage;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Long aliyunPk; 
            private String productCode; 
            private String productName; 
            private Long totalCapacity; 
            private Long totalQuota; 
            private Long totalUsage; 
            private String unit; 

            /**
             * AliyunPk.
             */
            public Builder aliyunPk(Long aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(Long totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * TotalQuota.
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * TotalUsage.
             */
            public Builder totalUsage(Long totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
