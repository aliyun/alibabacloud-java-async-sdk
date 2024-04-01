// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecretKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecretKeysResponseBody</p>
 */
public class DescribeSecretKeysResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretKeys")
    private SecretKeys secretKeys;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecretKeysResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.secretKeys = builder.secretKeys;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecretKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretKeys
     */
    public SecretKeys getSecretKeys() {
        return this.secretKeys;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SecretKeys secretKeys; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretKeys.
         */
        public Builder secretKeys(SecretKeys secretKeys) {
            this.secretKeys = secretKeys;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecretKeysResponseBody build() {
            return new DescribeSecretKeysResponseBody(this);
        } 

    } 

    public static class SecretKey extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecretKey")
        private String secretKey;

        @NameInMap("SecretKeyId")
        private String secretKeyId;

        @NameInMap("SecretKeyName")
        private String secretKeyName;

        @NameInMap("SecretKeyValue")
        private String secretKeyValue;

        private SecretKey(Builder builder) {
            this.createdTime = builder.createdTime;
            this.modifiedTime = builder.modifiedTime;
            this.regionId = builder.regionId;
            this.secretKey = builder.secretKey;
            this.secretKeyId = builder.secretKeyId;
            this.secretKeyName = builder.secretKeyName;
            this.secretKeyValue = builder.secretKeyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretKey create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return secretKeyId
         */
        public String getSecretKeyId() {
            return this.secretKeyId;
        }

        /**
         * @return secretKeyName
         */
        public String getSecretKeyName() {
            return this.secretKeyName;
        }

        /**
         * @return secretKeyValue
         */
        public String getSecretKeyValue() {
            return this.secretKeyValue;
        }

        public static final class Builder {
            private String createdTime; 
            private String modifiedTime; 
            private String regionId; 
            private String secretKey; 
            private String secretKeyId; 
            private String secretKeyName; 
            private String secretKeyValue; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecretKey.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * SecretKeyId.
             */
            public Builder secretKeyId(String secretKeyId) {
                this.secretKeyId = secretKeyId;
                return this;
            }

            /**
             * SecretKeyName.
             */
            public Builder secretKeyName(String secretKeyName) {
                this.secretKeyName = secretKeyName;
                return this;
            }

            /**
             * SecretKeyValue.
             */
            public Builder secretKeyValue(String secretKeyValue) {
                this.secretKeyValue = secretKeyValue;
                return this;
            }

            public SecretKey build() {
                return new SecretKey(this);
            } 

        } 

    }
    public static class SecretKeys extends TeaModel {
        @NameInMap("SecretKey")
        private java.util.List < SecretKey> secretKey;

        private SecretKeys(Builder builder) {
            this.secretKey = builder.secretKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretKeys create() {
            return builder().build();
        }

        /**
         * @return secretKey
         */
        public java.util.List < SecretKey> getSecretKey() {
            return this.secretKey;
        }

        public static final class Builder {
            private java.util.List < SecretKey> secretKey; 

            /**
             * SecretKey.
             */
            public Builder secretKey(java.util.List < SecretKey> secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            public SecretKeys build() {
                return new SecretKeys(this);
            } 

        } 

    }
}
