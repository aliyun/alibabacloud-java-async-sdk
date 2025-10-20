// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateBrandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBrandResponseBody</p>
 */
public class CreateBrandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BrandId")
    private String brandId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBrandResponseBody(Builder builder) {
        this.brandId = builder.brandId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBrandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandId
     */
    public String getBrandId() {
        return this.brandId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String brandId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateBrandResponseBody model) {
            this.brandId = model.brandId;
            this.requestId = model.requestId;
        } 

        /**
         * BrandId.
         */
        public Builder brandId(String brandId) {
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

        public CreateBrandResponseBody build() {
            return new CreateBrandResponseBody(this);
        } 

    } 

}
