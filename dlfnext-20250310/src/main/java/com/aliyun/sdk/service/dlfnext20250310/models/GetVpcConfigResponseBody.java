// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetVpcConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcConfigResponseBody</p>
 */
public class GetVpcConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("trustedVpcs")
    private java.util.List<TrustedVpcs> trustedVpcs;

    private GetVpcConfigResponseBody(Builder builder) {
        this.trustedVpcs = builder.trustedVpcs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trustedVpcs
     */
    public java.util.List<TrustedVpcs> getTrustedVpcs() {
        return this.trustedVpcs;
    }

    public static final class Builder {
        private java.util.List<TrustedVpcs> trustedVpcs; 

        private Builder() {
        } 

        private Builder(GetVpcConfigResponseBody model) {
            this.trustedVpcs = model.trustedVpcs;
        } 

        /**
         * trustedVpcs.
         */
        public Builder trustedVpcs(java.util.List<TrustedVpcs> trustedVpcs) {
            this.trustedVpcs = trustedVpcs;
            return this;
        }

        public GetVpcConfigResponseBody build() {
            return new GetVpcConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpcConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpcConfigResponseBody</p>
     */
    public static class TrustedVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("extendedOptions")
        private java.util.Map<String, String> extendedOptions;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private TrustedVpcs(Builder builder) {
            this.createdAt = builder.createdAt;
            this.extendedOptions = builder.extendedOptions;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrustedVpcs create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return extendedOptions
         */
        public java.util.Map<String, String> getExtendedOptions() {
            return this.extendedOptions;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Long createdAt; 
            private java.util.Map<String, String> extendedOptions; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(TrustedVpcs model) {
                this.createdAt = model.createdAt;
                this.extendedOptions = model.extendedOptions;
                this.vpcId = model.vpcId;
            } 

            /**
             * createdAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * extendedOptions.
             */
            public Builder extendedOptions(java.util.Map<String, String> extendedOptions) {
                this.extendedOptions = extendedOptions;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf67xxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public TrustedVpcs build() {
                return new TrustedVpcs(this);
            } 

        } 

    }
}
