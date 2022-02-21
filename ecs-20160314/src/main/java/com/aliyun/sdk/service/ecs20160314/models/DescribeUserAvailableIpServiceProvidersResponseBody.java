// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserAvailableIpServiceProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAvailableIpServiceProvidersResponseBody</p>
 */
public class DescribeUserAvailableIpServiceProvidersResponseBody extends TeaModel {
    @NameInMap("IpServiceProviders")
    private IpServiceProviders ipServiceProviders;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUserAvailableIpServiceProvidersResponseBody(Builder builder) {
        this.ipServiceProviders = builder.ipServiceProviders;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAvailableIpServiceProvidersResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipServiceProviders
     */
    public IpServiceProviders getIpServiceProviders() {
        return this.ipServiceProviders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IpServiceProviders ipServiceProviders; 
        private String requestId; 

        /**
         * IpServiceProviders.
         */
        public Builder ipServiceProviders(IpServiceProviders ipServiceProviders) {
            this.ipServiceProviders = ipServiceProviders;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserAvailableIpServiceProvidersResponseBody build() {
            return new DescribeUserAvailableIpServiceProvidersResponseBody(this);
        } 

    } 

    public static class IpServiceProvider extends TeaModel {
        @NameInMap("Name")
        private String name;

        private IpServiceProvider(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpServiceProvider create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IpServiceProvider build() {
                return new IpServiceProvider(this);
            } 

        } 

    }
    public static class IpServiceProviders extends TeaModel {
        @NameInMap("IpServiceProvider")
        private java.util.List < IpServiceProvider> ipServiceProvider;

        private IpServiceProviders(Builder builder) {
            this.ipServiceProvider = builder.ipServiceProvider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpServiceProviders create() {
            return builder().build();
        }

        /**
         * @return ipServiceProvider
         */
        public java.util.List < IpServiceProvider> getIpServiceProvider() {
            return this.ipServiceProvider;
        }

        public static final class Builder {
            private java.util.List < IpServiceProvider> ipServiceProvider; 

            /**
             * IpServiceProvider.
             */
            public Builder ipServiceProvider(java.util.List < IpServiceProvider> ipServiceProvider) {
                this.ipServiceProvider = ipServiceProvider;
                return this;
            }

            public IpServiceProviders build() {
                return new IpServiceProviders(this);
            } 

        } 

    }
}
