// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDeviceBrandsResponseBody} extends {@link TeaModel}
 *
 * <p>CountDeviceBrandsResponseBody</p>
 */
public class CountDeviceBrandsResponseBody extends TeaModel {
    @NameInMap("BrandCount")
    private Integer brandCount;

    @NameInMap("RequestId")
    private String requestId;

    private CountDeviceBrandsResponseBody(Builder builder) {
        this.brandCount = builder.brandCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountDeviceBrandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return brandCount
     */
    public Integer getBrandCount() {
        return this.brandCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer brandCount; 
        private String requestId; 

        /**
         * BrandCount.
         */
        public Builder brandCount(Integer brandCount) {
            this.brandCount = brandCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CountDeviceBrandsResponseBody build() {
            return new CountDeviceBrandsResponseBody(this);
        } 

    } 

}
