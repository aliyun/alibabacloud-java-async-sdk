// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
    private java.util.List<Result> result;

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

        private Builder(DescribeApiMeteringResponseBody model) {
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Success&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62FC432C55A1A63534A6CB34</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of return values.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The result indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.aliyunPk = model.aliyunPk;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.totalCapacity = model.totalCapacity;
                this.totalQuota = model.totalQuota;
                this.totalUsage = model.totalUsage;
                this.unit = model.unit;
            } 

            /**
             * <p>The Alibaba Cloud PK.</p>
             * 
             * <strong>example:</strong>
             * <p>102277855749****</p>
             */
            public Builder aliyunPk(Long aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmapi0004****</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The commodity name.</p>
             * 
             * <strong>example:</strong>
             * <p>ID card real-name authentication - ID card real-name</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The total API capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCapacity(Long totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * <p>The remaining quota.</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * <p>The usage.</p>
             * 
             * <strong>example:</strong>
             * <p>220</p>
             */
            public Builder totalUsage(Long totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>Calls</p>
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
