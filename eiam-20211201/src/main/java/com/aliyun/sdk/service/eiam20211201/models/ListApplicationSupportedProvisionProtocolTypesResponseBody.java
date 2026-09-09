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
 * {@link ListApplicationSupportedProvisionProtocolTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationSupportedProvisionProtocolTypesResponseBody</p>
 */
public class ListApplicationSupportedProvisionProtocolTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationSupportedProvisionProtocolType")
    private ApplicationSupportedProvisionProtocolType applicationSupportedProvisionProtocolType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApplicationSupportedProvisionProtocolTypesResponseBody(Builder builder) {
        this.applicationSupportedProvisionProtocolType = builder.applicationSupportedProvisionProtocolType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationSupportedProvisionProtocolTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationSupportedProvisionProtocolType
     */
    public ApplicationSupportedProvisionProtocolType getApplicationSupportedProvisionProtocolType() {
        return this.applicationSupportedProvisionProtocolType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationSupportedProvisionProtocolType applicationSupportedProvisionProtocolType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApplicationSupportedProvisionProtocolTypesResponseBody model) {
            this.applicationSupportedProvisionProtocolType = model.applicationSupportedProvisionProtocolType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of synchronization types supported by the application.</p>
         */
        public Builder applicationSupportedProvisionProtocolType(ApplicationSupportedProvisionProtocolType applicationSupportedProvisionProtocolType) {
            this.applicationSupportedProvisionProtocolType = applicationSupportedProvisionProtocolType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationSupportedProvisionProtocolTypesResponseBody build() {
            return new ListApplicationSupportedProvisionProtocolTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationSupportedProvisionProtocolTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationSupportedProvisionProtocolTypesResponseBody</p>
     */
    public static class ApplicationSupportedProvisionProtocolType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProvisionProtocolType")
        private java.util.List<String> provisionProtocolType;

        private ApplicationSupportedProvisionProtocolType(Builder builder) {
            this.provisionProtocolType = builder.provisionProtocolType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationSupportedProvisionProtocolType create() {
            return builder().build();
        }

        /**
         * @return provisionProtocolType
         */
        public java.util.List<String> getProvisionProtocolType() {
            return this.provisionProtocolType;
        }

        public static final class Builder {
            private java.util.List<String> provisionProtocolType; 

            private Builder() {
            } 

            private Builder(ApplicationSupportedProvisionProtocolType model) {
                this.provisionProtocolType = model.provisionProtocolType;
            } 

            /**
             * <p>The account synchronization type supported by the application. Valid values:</p>
             * <ul>
             * <li>idaas_callback: Event callback type.</li>
             * <li>scim2: System for Cross-domain Identity Management protocol type.</li>
             * </ul>
             */
            public Builder provisionProtocolType(java.util.List<String> provisionProtocolType) {
                this.provisionProtocolType = provisionProtocolType;
                return this;
            }

            public ApplicationSupportedProvisionProtocolType build() {
                return new ApplicationSupportedProvisionProtocolType(this);
            } 

        } 

    }
}
