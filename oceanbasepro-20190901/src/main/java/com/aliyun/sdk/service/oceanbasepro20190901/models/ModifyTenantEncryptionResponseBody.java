// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantEncryptionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantEncryptionResponseBody</p>
 */
public class ModifyTenantEncryptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantEncryption")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * job
         */
        public Builder tenantEncryption(TenantEncryption tenantEncryption) {
            this.tenantEncryption = tenantEncryption;
            return this;
        }

        public ModifyTenantEncryptionResponseBody build() {
            return new ModifyTenantEncryptionResponseBody(this);
        } 

    } 

    public static class TenantEncryption extends TeaModel {
        @NameInMap("EncryptionType")
        private String encryptionType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TenantId")
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
