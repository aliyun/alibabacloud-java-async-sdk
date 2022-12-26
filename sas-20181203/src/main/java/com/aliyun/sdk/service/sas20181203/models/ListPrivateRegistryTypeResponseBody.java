// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateRegistryTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateRegistryTypeResponseBody</p>
 */
public class ListPrivateRegistryTypeResponseBody extends TeaModel {
    @NameInMap("RegistryTypeInfos")
    private java.util.List < RegistryTypeInfos> registryTypeInfos;

    @NameInMap("RequestId")
    private String requestId;

    private ListPrivateRegistryTypeResponseBody(Builder builder) {
        this.registryTypeInfos = builder.registryTypeInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateRegistryTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return registryTypeInfos
     */
    public java.util.List < RegistryTypeInfos> getRegistryTypeInfos() {
        return this.registryTypeInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < RegistryTypeInfos> registryTypeInfos; 
        private String requestId; 

        /**
         * RegistryTypeInfos.
         */
        public Builder registryTypeInfos(java.util.List < RegistryTypeInfos> registryTypeInfos) {
            this.registryTypeInfos = registryTypeInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateRegistryTypeResponseBody build() {
            return new ListPrivateRegistryTypeResponseBody(this);
        } 

    } 

    public static class RegistryTypeInfos extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("RegistryType")
        private String registryType;

        private RegistryTypeInfos(Builder builder) {
            this.count = builder.count;
            this.registryType = builder.registryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistryTypeInfos create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        public static final class Builder {
            private Long count; 
            private String registryType; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * RegistryType.
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            public RegistryTypeInfos build() {
                return new RegistryTypeInfos(this);
            } 

        } 

    }
}
