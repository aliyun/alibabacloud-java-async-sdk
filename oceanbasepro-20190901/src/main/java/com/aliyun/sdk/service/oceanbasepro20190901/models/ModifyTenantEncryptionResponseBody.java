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
 * {@link ModifyTenantEncryptionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantEncryptionResponseBody</p>
 */
public class ModifyTenantEncryptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantEncryption")
    private TenantEncryption tenantEncryption;

    private ModifyTenantEncryptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantEncryption = builder.tenantEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantEncryptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantEncryption
     */
    public TenantEncryption getTenantEncryption() {
        return this.tenantEncryption;
    }

    public static final class Builder {
        private String requestId; 
        private TenantEncryption tenantEncryption; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>job</p>
         */
        public Builder tenantEncryption(TenantEncryption tenantEncryption) {
            this.tenantEncryption = tenantEncryption;
            return this;
        }

        public ModifyTenantEncryptionResponseBody build() {
            return new ModifyTenantEncryptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTenantEncryptionResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyTenantEncryptionResponseBody</p>
     */
    public static class TenantEncryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private String encryptionType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private TenantEncryption(Builder builder) {
            this.encryptionType = builder.encryptionType;
            this.instanceId = builder.instanceId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantEncryption create() {
            return builder().build();
        }

        /**
         * @return encryptionType
         */
        public String getEncryptionType() {
            return this.encryptionType;
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
            private String encryptionType; 
            private String instanceId; 
            private String tenantId; 

            /**
             * EncryptionType.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * InstanceId.
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

            public TenantEncryption build() {
                return new TenantEncryption(this);
            } 

        } 

    }
}
