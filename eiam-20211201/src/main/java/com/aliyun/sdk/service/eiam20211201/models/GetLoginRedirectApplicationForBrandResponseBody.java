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
 * {@link GetLoginRedirectApplicationForBrandResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginRedirectApplicationForBrandResponseBody</p>
 */
public class GetLoginRedirectApplicationForBrandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BrandLoginRedirectApplication")
    private BrandLoginRedirectApplication brandLoginRedirectApplication;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLoginRedirectApplicationForBrandResponseBody(Builder builder) {
        this.brandLoginRedirectApplication = builder.brandLoginRedirectApplication;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginRedirectApplicationForBrandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandLoginRedirectApplication
     */
    public BrandLoginRedirectApplication getBrandLoginRedirectApplication() {
        return this.brandLoginRedirectApplication;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BrandLoginRedirectApplication brandLoginRedirectApplication; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLoginRedirectApplicationForBrandResponseBody model) {
            this.brandLoginRedirectApplication = model.brandLoginRedirectApplication;
            this.requestId = model.requestId;
        } 

        /**
         * BrandLoginRedirectApplication.
         */
        public Builder brandLoginRedirectApplication(BrandLoginRedirectApplication brandLoginRedirectApplication) {
            this.brandLoginRedirectApplication = brandLoginRedirectApplication;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLoginRedirectApplicationForBrandResponseBody build() {
            return new GetLoginRedirectApplicationForBrandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoginRedirectApplicationForBrandResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginRedirectApplicationForBrandResponseBody</p>
     */
    public static class BrandLoginRedirectApplication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("BrandId")
        private String brandId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private BrandLoginRedirectApplication(Builder builder) {
            this.applicationId = builder.applicationId;
            this.brandId = builder.brandId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrandLoginRedirectApplication create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return brandId
         */
        public String getBrandId() {
            return this.brandId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String applicationId; 
            private String brandId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(BrandLoginRedirectApplication model) {
                this.applicationId = model.applicationId;
                this.brandId = model.brandId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>应用ID</p>
             * 
             * <strong>example:</strong>
             * <p>app_xxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
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
             * <p>实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public BrandLoginRedirectApplication build() {
                return new BrandLoginRedirectApplication(this);
            } 

        } 

    }
}
