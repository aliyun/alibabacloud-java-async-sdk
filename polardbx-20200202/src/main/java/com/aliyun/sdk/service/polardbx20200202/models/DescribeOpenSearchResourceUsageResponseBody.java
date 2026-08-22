// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeOpenSearchResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenSearchResourceUsageResponseBody</p>
 */
public class DescribeOpenSearchResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenSearchResourceUsageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenSearchResourceUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOpenSearchResourceUsageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenSearchResourceUsageResponseBody build() {
            return new DescribeOpenSearchResourceUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenSearchResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchResourceUsageResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>NoPermissionType</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchResourceUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocCount")
        private Long docCount;

        @com.aliyun.core.annotation.NameInMap("IndexCount")
        private Integer indexCount;

        @com.aliyun.core.annotation.NameInMap("StorageSizeInBytes")
        private Long storageSizeInBytes;

        @com.aliyun.core.annotation.NameInMap("StorageTotalInBytes")
        private Long storageTotalInBytes;

        @com.aliyun.core.annotation.NameInMap("StorageUsagePercent")
        private Double storageUsagePercent;

        private Data(Builder builder) {
            this.docCount = builder.docCount;
            this.indexCount = builder.indexCount;
            this.storageSizeInBytes = builder.storageSizeInBytes;
            this.storageTotalInBytes = builder.storageTotalInBytes;
            this.storageUsagePercent = builder.storageUsagePercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return docCount
         */
        public Long getDocCount() {
            return this.docCount;
        }

        /**
         * @return indexCount
         */
        public Integer getIndexCount() {
            return this.indexCount;
        }

        /**
         * @return storageSizeInBytes
         */
        public Long getStorageSizeInBytes() {
            return this.storageSizeInBytes;
        }

        /**
         * @return storageTotalInBytes
         */
        public Long getStorageTotalInBytes() {
            return this.storageTotalInBytes;
        }

        /**
         * @return storageUsagePercent
         */
        public Double getStorageUsagePercent() {
            return this.storageUsagePercent;
        }

        public static final class Builder {
            private Long docCount; 
            private Integer indexCount; 
            private Long storageSizeInBytes; 
            private Long storageTotalInBytes; 
            private Double storageUsagePercent; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.docCount = model.docCount;
                this.indexCount = model.indexCount;
                this.storageSizeInBytes = model.storageSizeInBytes;
                this.storageTotalInBytes = model.storageTotalInBytes;
                this.storageUsagePercent = model.storageUsagePercent;
            } 

            /**
             * DocCount.
             */
            public Builder docCount(Long docCount) {
                this.docCount = docCount;
                return this;
            }

            /**
             * IndexCount.
             */
            public Builder indexCount(Integer indexCount) {
                this.indexCount = indexCount;
                return this;
            }

            /**
             * StorageSizeInBytes.
             */
            public Builder storageSizeInBytes(Long storageSizeInBytes) {
                this.storageSizeInBytes = storageSizeInBytes;
                return this;
            }

            /**
             * StorageTotalInBytes.
             */
            public Builder storageTotalInBytes(Long storageTotalInBytes) {
                this.storageTotalInBytes = storageTotalInBytes;
                return this;
            }

            /**
             * StorageUsagePercent.
             */
            public Builder storageUsagePercent(Double storageUsagePercent) {
                this.storageUsagePercent = storageUsagePercent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
