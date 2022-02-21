// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFenceScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetFenceScopeResponseBody</p>
 */
public class GetFenceScopeResponseBody extends TeaModel {
    @NameInMap("FenceScope")
    private FenceScope fenceScope;

    @NameInMap("RequestId")
    private String requestId;

    private GetFenceScopeResponseBody(Builder builder) {
        this.fenceScope = builder.fenceScope;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFenceScopeResponseBody create() {
        return builder().build();
    }

    /**
     * @return fenceScope
     */
    public FenceScope getFenceScope() {
        return this.fenceScope;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FenceScope fenceScope; 
        private String requestId; 

        /**
         * FenceScope.
         */
        public Builder fenceScope(FenceScope fenceScope) {
            this.fenceScope = fenceScope;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFenceScopeResponseBody build() {
            return new GetFenceScopeResponseBody(this);
        } 

    } 

    public static class FenceScope extends TeaModel {
        @NameInMap("BrandId")
        private String brandId;

        @NameInMap("Ctime")
        private String ctime;

        @NameInMap("FenceId")
        private Long fenceId;

        @NameInMap("ModelId")
        private String modelId;

        @NameInMap("Mtime")
        private String mtime;

        private FenceScope(Builder builder) {
            this.brandId = builder.brandId;
            this.ctime = builder.ctime;
            this.fenceId = builder.fenceId;
            this.modelId = builder.modelId;
            this.mtime = builder.mtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FenceScope create() {
            return builder().build();
        }

        /**
         * @return brandId
         */
        public String getBrandId() {
            return this.brandId;
        }

        /**
         * @return ctime
         */
        public String getCtime() {
            return this.ctime;
        }

        /**
         * @return fenceId
         */
        public Long getFenceId() {
            return this.fenceId;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return mtime
         */
        public String getMtime() {
            return this.mtime;
        }

        public static final class Builder {
            private String brandId; 
            private String ctime; 
            private Long fenceId; 
            private String modelId; 
            private String mtime; 

            /**
             * BrandId.
             */
            public Builder brandId(String brandId) {
                this.brandId = brandId;
                return this;
            }

            /**
             * Ctime.
             */
            public Builder ctime(String ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * FenceId.
             */
            public Builder fenceId(Long fenceId) {
                this.fenceId = fenceId;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * Mtime.
             */
            public Builder mtime(String mtime) {
                this.mtime = mtime;
                return this;
            }

            public FenceScope build() {
                return new FenceScope(this);
            } 

        } 

    }
}
