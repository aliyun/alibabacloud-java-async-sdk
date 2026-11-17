// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetTenantMemoryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetTenantMemoryConfigResponseBody</p>
 */
public class GetTenantMemoryConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTenantMemoryConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTenantMemoryConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTenantMemoryConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The tenant memory configuration that matches the business combination.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTenantMemoryConfigResponseBody build() {
            return new GetTenantMemoryConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTenantMemoryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetTenantMemoryConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisabledReason")
        private String disabledReason;

        @com.aliyun.core.annotation.NameInMap("EffectiveEnabled")
        private Boolean effectiveEnabled;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("InstanceDesiredEnabled")
        private Boolean instanceDesiredEnabled;

        @com.aliyun.core.annotation.NameInMap("TenantEnabled")
        private Boolean tenantEnabled;

        private Data(Builder builder) {
            this.disabledReason = builder.disabledReason;
            this.effectiveEnabled = builder.effectiveEnabled;
            this.enabled = builder.enabled;
            this.instanceDesiredEnabled = builder.instanceDesiredEnabled;
            this.tenantEnabled = builder.tenantEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return disabledReason
         */
        public String getDisabledReason() {
            return this.disabledReason;
        }

        /**
         * @return effectiveEnabled
         */
        public Boolean getEffectiveEnabled() {
            return this.effectiveEnabled;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return instanceDesiredEnabled
         */
        public Boolean getInstanceDesiredEnabled() {
            return this.instanceDesiredEnabled;
        }

        /**
         * @return tenantEnabled
         */
        public Boolean getTenantEnabled() {
            return this.tenantEnabled;
        }

        public static final class Builder {
            private String disabledReason; 
            private Boolean effectiveEnabled; 
            private Boolean enabled; 
            private Boolean instanceDesiredEnabled; 
            private Boolean tenantEnabled; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.disabledReason = model.disabledReason;
                this.effectiveEnabled = model.effectiveEnabled;
                this.enabled = model.enabled;
                this.instanceDesiredEnabled = model.instanceDesiredEnabled;
                this.tenantEnabled = model.tenantEnabled;
            } 

            /**
             * <p>This field is not enabled. The current query result does not provide the disable reason. The example is used to illustrate the field status.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A (not enabled)</p>
             */
            public Builder disabledReason(String disabledReason) {
                this.disabledReason = disabledReason;
                return this;
            }

            /**
             * <p>This field is not enabled. The current query result does not provide the effective switch of the instance.</p>
             */
            public Builder effectiveEnabled(Boolean effectiveEnabled) {
                this.effectiveEnabled = effectiveEnabled;
                return this;
            }

            /**
             * <p>The tenant-level memory switch for the corresponding business combination. A value of <code>true</code> indicates that the switch is enabled, and a value of <code>false</code> indicates that the switch is disabled. This field may be omitted if no switch is configured for the combination.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>This field is not enabled. The current query result does not provide the instance desired switch.</p>
             */
            public Builder instanceDesiredEnabled(Boolean instanceDesiredEnabled) {
                this.instanceDesiredEnabled = instanceDesiredEnabled;
                return this;
            }

            /**
             * <p>This field is not enabled. To obtain the tenant-level configuration switch returned by the current API operation, read the Enabled field.</p>
             */
            public Builder tenantEnabled(Boolean tenantEnabled) {
                this.tenantEnabled = tenantEnabled;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
