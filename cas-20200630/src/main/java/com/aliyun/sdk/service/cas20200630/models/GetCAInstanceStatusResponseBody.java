// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link GetCAInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetCAInstanceStatusResponseBody</p>
 */
public class GetCAInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStatusList")
    private java.util.List<InstanceStatusList> instanceStatusList;

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
    public java.util.List<InstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceStatusList> instanceStatusList; 
        private String requestId; 

        /**
         * <p>The status information of the private CA instance.</p>
         */
        public Builder instanceStatusList(java.util.List<InstanceStatusList> instanceStatusList) {
            this.instanceStatusList = instanceStatusList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25589516-2A56-5159-AB88-4A1D9824E183</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCAInstanceStatusResponseBody build() {
            return new GetCAInstanceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCAInstanceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetCAInstanceStatusResponseBody</p>
     */
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
             * <p>The expiration date of the private CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the <strong>Status</strong> parameter is <strong>USED</strong> or <strong>REVOKE</strong>. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1792944000000</p>
             */
            public Builder afterTime(Long afterTime) {
                this.afterTime = afterTime;
                return this;
            }

            /**
             * <p>The issuance date of the private CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the <strong>Status</strong> parameter is <strong>USED</strong> or <strong>REVOKE</strong>. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1635177600000</p>
             */
            public Builder beforeTime(Long beforeTime) {
                this.beforeTime = beforeTime;
                return this;
            }

            /**
             * <p>The number of certificates that are issued by using the private CA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder certIssuedCount(Integer certIssuedCount) {
                this.certIssuedCount = certIssuedCount;
                return this;
            }

            /**
             * <p>The number of certificates that can be issued by using the private CA instance.</p>
             * <p>For a private root CA instance whose <strong>Type</strong> is <strong>ROOT</strong>, this parameter indicates the number of intermediate CA certificates that can be issued.</p>
             * <p>For a private intermediate CA instance whose <strong>Type</strong> is <strong>SUB_ROOT</strong>, this parameter indicates the total number of client certificates and server certificates that can be issued</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder certTotalCount(Integer certTotalCount) {
                this.certTotalCount = certTotalCount;
                return this;
            }

            /**
             * <p>The unique identifier of the private CA certificate.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the <strong>Status</strong> parameter is <strong>USED</strong> or <strong>REVOKE</strong>. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>a7bb2dd212a2112128cd5cc9b753****</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The ID of the private CA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cas-member-0hmi****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the private CA instance. Valid values:</p>
             * <ul>
             * <li><strong>BUY</strong>: The private CA instance is purchased but is not enabled.</li>
             * <li><strong>USED</strong>: The private CA instance is enabled.</li>
             * <li><strong>REFUND</strong>: The private CA instance is refunded.</li>
             * <li><strong>REVOKE</strong>: The private CA instance is revoked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the private CA instance. Valid values:</p>
             * <ul>
             * <li><strong>ROOT</strong>: root CA instance</li>
             * <li><strong>SUB_ROOT</strong>: intermediate CA instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ROOT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The expiration date of the private CA instance. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * <blockquote>
             * <p> This parameter corresponds to the duration that you select when you purchase the private CA instance. The duration indicates the subscription period of the Private Certificate Authority (PCA) service.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1637251200000</p>
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
