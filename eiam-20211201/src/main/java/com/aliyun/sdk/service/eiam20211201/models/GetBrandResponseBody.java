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
 * {@link GetBrandResponseBody} extends {@link TeaModel}
 *
 * <p>GetBrandResponseBody</p>
 */
public class GetBrandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Brand")
    private Brand brand;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBrandResponseBody(Builder builder) {
        this.brand = builder.brand;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBrandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brand
     */
    public Brand getBrand() {
        return this.brand;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Brand brand; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetBrandResponseBody model) {
            this.brand = model.brand;
            this.requestId = model.requestId;
        } 

        /**
         * Brand.
         */
        public Builder brand(Brand brand) {
            this.brand = brand;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBrandResponseBody build() {
            return new GetBrandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBrandResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrandResponseBody</p>
     */
    public static class Brand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrandId")
        private String brandId;

        @com.aliyun.core.annotation.NameInMap("BrandName")
        private String brandName;

        @com.aliyun.core.annotation.NameInMap("BrandType")
        private String brandType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Brand(Builder builder) {
            this.brandId = builder.brandId;
            this.brandName = builder.brandName;
            this.brandType = builder.brandType;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Brand create() {
            return builder().build();
        }

        /**
         * @return brandId
         */
        public String getBrandId() {
            return this.brandId;
        }

        /**
         * @return brandName
         */
        public String getBrandName() {
            return this.brandName;
        }

        /**
         * @return brandType
         */
        public String getBrandType() {
            return this.brandType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String brandId; 
            private String brandName; 
            private String brandType; 
            private String instanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Brand model) {
                this.brandId = model.brandId;
                this.brandName = model.brandName;
                this.brandType = model.brandType;
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * <p>品牌ID</p>
             * 
             * <strong>example:</strong>
             * <p>brand_xxxx</p>
             */
            public Builder brandId(String brandId) {
                this.brandId = brandId;
                return this;
            }

            /**
             * <p>品牌名称</p>
             * 
             * <strong>example:</strong>
             * <p>Custom Brand</p>
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * <p>品牌类型</p>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder brandType(String brandType) {
                this.brandType = brandType;
                return this;
            }

            /**
             * <p>实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>品牌状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Brand build() {
                return new Brand(this);
            } 

        } 

    }
}
