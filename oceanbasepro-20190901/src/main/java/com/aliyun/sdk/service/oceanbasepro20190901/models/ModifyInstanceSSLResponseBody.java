// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
         * <p>The SSL setting of the OceanBase cluster instance.</p>
         */
        public Builder instanceSSL(InstanceSSL instanceSSL) {
            this.instanceSSL = instanceSSL;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceSSLResponseBody build() {
            return new ModifyInstanceSSLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceSSLResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyInstanceSSLResponseBody</p>
     */
    public static class InstanceSSL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSSL")
        private String enableSSL;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private InstanceSSL(Builder builder) {
            this.enableSSL = builder.enableSSL;
            this.instanceId = builder.instanceId;
            this.tenantId = builder.tenantId;
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

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String enableSSL; 
            private String instanceId; 
            private String tenantId; 

            /**
             * <p>The operation to modify the SSL status. Valid values:</p>
             * <ul>
             * <li><p>open: Enable SSL encryption.</p>
             * </li>
             * <li><p>update: Update the CA certificate.</p>
             * </li>
             * <li><p>close: Disable SSL encryption.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder enableSSL(String enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * <p>The ID of the OceanBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ob317v4uif****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public InstanceSSL build() {
                return new InstanceSSL(this);
            } 

        } 

    }
}
