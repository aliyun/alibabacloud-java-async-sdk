// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackageStateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackageStateResponseBody</p>
 */
public class DescribePackageStateResponseBody extends TeaModel {
    @NameInMap("IssuedCount")
    private Long issuedCount;

    @NameInMap("ProductCode")
    private String productCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("UsedCount")
    private Long usedCount;

    private DescribePackageStateResponseBody(Builder builder) {
        this.issuedCount = builder.issuedCount;
        this.productCode = builder.productCode;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usedCount = builder.usedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageStateResponseBody create() {
        return builder().build();
    }

    /**
     * @return issuedCount
     */
    public Long getIssuedCount() {
        return this.issuedCount;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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

    /**
     * @return usedCount
     */
    public Long getUsedCount() {
        return this.usedCount;
    }

    public static final class Builder {
        private Long issuedCount; 
        private String productCode; 
        private String requestId; 
        private Long totalCount; 
        private Long usedCount; 

        /**
         * IssuedCount.
         */
        public Builder issuedCount(Long issuedCount) {
            this.issuedCount = issuedCount;
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

        /**
         * UsedCount.
         */
        public Builder usedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        public DescribePackageStateResponseBody build() {
            return new DescribePackageStateResponseBody(this);
        } 

    } 

}
