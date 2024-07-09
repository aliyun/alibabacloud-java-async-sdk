// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCAInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetCAInstanceStatusResponseBody</p>
 */
public class GetCAInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStatusList")
    private java.util.List < InstanceStatusList> instanceStatusList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCAInstanceStatusResponseBody(Builder builder) {
        this.instanceStatusList = builder.instanceStatusList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCAInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatusList
     */
    public java.util.List < InstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceStatusList> instanceStatusList; 
        private String requestId; 

        /**
         * The status information of the private CA instance.
         */
        public Builder instanceStatusList(java.util.List < InstanceStatusList> instanceStatusList) {
            this.instanceStatusList = instanceStatusList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCAInstanceStatusResponseBody build() {
            return new GetCAInstanceStatusResponseBody(this);
        } 

    } 

    public static class InstanceStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterTime")
        private Long afterTime;

        @com.aliyun.core.annotation.NameInMap("BeforeTime")
        private Long beforeTime;

        @com.aliyun.core.annotation.NameInMap("CertIssuedCount")
        private Integer certIssuedCount;

        @com.aliyun.core.annotation.NameInMap("CertTotalCount")
        private Integer certTotalCount;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UseExpireTime")
        private Long useExpireTime;

        private InstanceStatusList(Builder builder) {
            this.afterTime = builder.afterTime;
            this.beforeTime = builder.beforeTime;
            this.certIssuedCount = builder.certIssuedCount;
            this.certTotalCount = builder.certTotalCount;
            this.identifier = builder.identifier;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.type = builder.type;
            this.useExpireTime = builder.useExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatusList create() {
            return builder().build();
        }

        /**
         * @return afterTime
         */
        public Long getAfterTime() {
            return this.afterTime;
        }

        /**
         * @return beforeTime
         */
        public Long getBeforeTime() {
            return this.beforeTime;
        }

        /**
         * @return certIssuedCount
         */
        public Integer getCertIssuedCount() {
            return this.certIssuedCount;
        }

        /**
         * @return certTotalCount
         */
        public Integer getCertTotalCount() {
            return this.certTotalCount;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return useExpireTime
         */
        public Long getUseExpireTime() {
            return this.useExpireTime;
        }

        public static final class Builder {
            private Long afterTime; 
            private Long beforeTime; 
            private Integer certIssuedCount; 
            private Integer certTotalCount; 
            private String identifier; 
            private String instanceId; 
            private String status; 
            private String type; 
            private Long useExpireTime; 

            /**
             * The expiration date of the private CA certificate. This value is a UNIX timestamp. Unit: milliseconds.
             * <p>
             * 
             * >  This parameter is returned only when the value of the **Status** parameter is **USED** or **REVOKE**. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.
             */
            public Builder afterTime(Long afterTime) {
                this.afterTime = afterTime;
                return this;
            }

            /**
             * The issuance date of the private CA certificate. This value is a UNIX timestamp. Unit: milliseconds.
             * <p>
             * 
             * >  This parameter is returned only when the value of the **Status** parameter is **USED** or **REVOKE**. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.
             */
            public Builder beforeTime(Long beforeTime) {
                this.beforeTime = beforeTime;
                return this;
            }

            /**
             * The number of certificates that are issued by using the private CA instance.
             */
            public Builder certIssuedCount(Integer certIssuedCount) {
                this.certIssuedCount = certIssuedCount;
                return this;
            }

            /**
             * The number of certificates that can be issued by using the private CA instance.
             * <p>
             * 
             * For a private root CA instance whose **Type** is **ROOT**, this parameter indicates the number of intermediate CA certificates that can be issued.
             * 
             * For a private intermediate CA instance whose **Type** is **SUB_ROOT**, this parameter indicates the total number of client certificates and server certificates that can be issued
             */
            public Builder certTotalCount(Integer certTotalCount) {
                this.certTotalCount = certTotalCount;
                return this;
            }

            /**
             * The unique identifier of the private CA certificate.
             * <p>
             * 
             * >  This parameter is returned only when the value of the **Status** parameter is **USED** or **REVOKE**. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The ID of the private CA instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of the private CA instance. Valid values:
             * <p>
             * 
             * *   **BUY**: The private CA instance is purchased but is not enabled.
             * *   **USED**: The private CA instance is enabled.
             * *   **REFUND**: The private CA instance is refunded.
             * *   **REVOKE**: The private CA instance is revoked.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the private CA instance. Valid values:
             * <p>
             * 
             * *   **ROOT**: root CA instance
             * *   **SUB_ROOT**: intermediate CA instance
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The expiration date of the private CA instance. This value is a UNIX timestamp. Unit: milliseconds.
             * <p>
             * 
             * >  This parameter corresponds to the duration that you select when you purchase the private CA instance. The duration indicates the subscription period of the Private Certificate Authority (PCA) service.
             */
            public Builder useExpireTime(Long useExpireTime) {
                this.useExpireTime = useExpireTime;
                return this;
            }

            public InstanceStatusList build() {
                return new InstanceStatusList(this);
            } 

        } 

    }
}
