// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantEncryptionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantEncryptionResponseBody</p>
 */
public class DescribeTenantEncryptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantEncryptions")
    private java.util.List < TenantEncryptions> tenantEncryptions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTenantEncryptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantEncryptions = builder.tenantEncryptions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantEncryptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantEncryptions
     */
    public java.util.List < TenantEncryptions> getTenantEncryptions() {
        return this.tenantEncryptions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TenantEncryptions> tenantEncryptions; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TenantEncryptions.
         */
        public Builder tenantEncryptions(java.util.List < TenantEncryptions> tenantEncryptions) {
            this.tenantEncryptions = tenantEncryptions;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantEncryptionResponseBody build() {
            return new DescribeTenantEncryptionResponseBody(this);
        } 

    } 

    public static class TenantEncryptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableEncryption")
        private Boolean enableEncryption;

        @com.aliyun.core.annotation.NameInMap("EncryptionKeyId")
        private String encryptionKeyId;

        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private String encryptionType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantMode")
        private String tenantMode;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TenantStatus")
        private String tenantStatus;

        private TenantEncryptions(Builder builder) {
            this.enableEncryption = builder.enableEncryption;
            this.encryptionKeyId = builder.encryptionKeyId;
            this.encryptionType = builder.encryptionType;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.tenantMode = builder.tenantMode;
            this.tenantName = builder.tenantName;
            this.tenantStatus = builder.tenantStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantEncryptions create() {
            return builder().build();
        }

        /**
         * @return enableEncryption
         */
        public Boolean getEnableEncryption() {
            return this.enableEncryption;
        }

        /**
         * @return encryptionKeyId
         */
        public String getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        /**
         * @return encryptionType
         */
        public String getEncryptionType() {
            return this.encryptionType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantMode
         */
        public String getTenantMode() {
            return this.tenantMode;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return tenantStatus
         */
        public String getTenantStatus() {
            return this.tenantStatus;
        }

        public static final class Builder {
            private Boolean enableEncryption; 
            private String encryptionKeyId; 
            private String encryptionType; 
            private String status; 
            private String tenantId; 
            private String tenantMode; 
            private String tenantName; 
            private String tenantStatus; 

            /**
             * EnableEncryption.
             */
            public Builder enableEncryption(Boolean enableEncryption) {
                this.enableEncryption = enableEncryption;
                return this;
            }

            /**
             * EncryptionKeyId.
             */
            public Builder encryptionKeyId(String encryptionKeyId) {
                this.encryptionKeyId = encryptionKeyId;
                return this;
            }

            /**
             * EncryptionType.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TenantMode.
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * TenantStatus.
             */
            public Builder tenantStatus(String tenantStatus) {
                this.tenantStatus = tenantStatus;
                return this;
            }

            public TenantEncryptions build() {
                return new TenantEncryptions(this);
            } 

        } 

    }
}
