// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceBrandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceBrandResponseBody</p>
 */
public class CreateDeviceBrandResponseBody extends TeaModel {
    @NameInMap("BrandId")
    private Long brandId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDeviceBrandResponseBody(Builder builder) {
        this.brandId = builder.brandId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceBrandResponseBody create() {
        return builder().build();
    }

    /**
     * @return brandId
     */
    public Long getBrandId() {
        return this.brandId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long brandId; 
        private String requestId; 

        /**
         * BrandId.
         */
        public Builder brandId(Long brandId) {
            this.brandId = brandId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDeviceBrandResponseBody build() {
            return new CreateDeviceBrandResponseBody(this);
        } 

    } 

}
