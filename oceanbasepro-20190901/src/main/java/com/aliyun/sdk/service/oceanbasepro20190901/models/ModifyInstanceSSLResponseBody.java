// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceSSLResponseBody</p>
 */
public class ModifyInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSSL")
    private InstanceSSL instanceSSL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceSSLResponseBody(Builder builder) {
        this.instanceSSL = builder.instanceSSL;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSSLResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceSSL
     */
    public InstanceSSL getInstanceSSL() {
        return this.instanceSSL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceSSL instanceSSL; 
        private String requestId; 

        /**
         * The SSL setting of the OceanBase cluster instance.
         */
        public Builder instanceSSL(InstanceSSL instanceSSL) {
            this.instanceSSL = instanceSSL;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceSSLResponseBody build() {
            return new ModifyInstanceSSLResponseBody(this);
        } 

    } 

    public static class InstanceSSL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSSL")
        private String enableSSL;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstanceSSL(Builder builder) {
            this.enableSSL = builder.enableSSL;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSSL create() {
            return builder().build();
        }

        /**
         * @return enableSSL
         */
        public String getEnableSSL() {
            return this.enableSSL;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String enableSSL; 
            private String instanceId; 

            /**
             * The operation to modify the SSL status. Valid values:
             * <p>
             * 
             * - open: Enable SSL encryption.
             * 
             * - update: Update the CA certificate.
             * 
             * - close: Disable SSL encryption.
             */
            public Builder enableSSL(String enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * The ID of the OceanBase cluster.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceSSL build() {
                return new InstanceSSL(this);
            } 

        } 

    }
}
