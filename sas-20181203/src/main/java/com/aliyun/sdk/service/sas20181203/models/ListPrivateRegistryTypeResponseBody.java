// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListPrivateRegistryTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateRegistryTypeResponseBody</p>
 */
public class ListPrivateRegistryTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegistryTypeInfos")
    private java.util.List<RegistryTypeInfos> registryTypeInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryTypeInfos
     */
    public java.util.List<RegistryTypeInfos> getRegistryTypeInfos() {
        return this.registryTypeInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RegistryTypeInfos> registryTypeInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrivateRegistryTypeResponseBody model) {
            this.registryTypeInfos = model.registryTypeInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of image repository types.</p>
         */
        public Builder registryTypeInfos(java.util.List<RegistryTypeInfos> registryTypeInfos) {
            this.registryTypeInfos = registryTypeInfos;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateRegistryTypeResponseBody build() {
            return new ListPrivateRegistryTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateRegistryTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateRegistryTypeResponseBody</p>
     */
    public static class RegistryTypeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
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

            private Builder() {
            } 

            private Builder(RegistryTypeInfos model) {
                this.count = model.count;
                this.registryType = model.registryType;
            } 

            /**
             * <p>The number of image repositories.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the image repository type. Valid values:</p>
             * <ul>
             * <li><strong>acr</strong>: Container Registry</li>
             * <li><strong>harbor</strong>: Harbor</li>
             * <li><strong>quay</strong>: Quay</li>
             * <li><strong>CI/CD</strong>: Jenkins</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>harbor</p>
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
