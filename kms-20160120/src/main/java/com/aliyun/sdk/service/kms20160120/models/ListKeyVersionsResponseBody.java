// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKeyVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKeyVersionsResponseBody</p>
 */
public class ListKeyVersionsResponseBody extends TeaModel {
    @NameInMap("KeyVersions")
    private KeyVersions keyVersions;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListKeyVersionsResponseBody(Builder builder) {
        this.keyVersions = builder.keyVersions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeyVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyVersions
     */
    public KeyVersions getKeyVersions() {
        return this.keyVersions;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private KeyVersions keyVersions; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * KeyVersions.
         */
        public Builder keyVersions(KeyVersions keyVersions) {
            this.keyVersions = keyVersions;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKeyVersionsResponseBody build() {
            return new ListKeyVersionsResponseBody(this);
        } 

    } 

    public static class KeyVersion extends TeaModel {
        @NameInMap("CreationDate")
        private String creationDate;

        @NameInMap("KeyId")
        private String keyId;

        @NameInMap("KeyVersionId")
        private String keyVersionId;

        private KeyVersion(Builder builder) {
            this.creationDate = builder.creationDate;
            this.keyId = builder.keyId;
            this.keyVersionId = builder.keyVersionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyVersion create() {
            return builder().build();
        }

        /**
         * @return creationDate
         */
        public String getCreationDate() {
            return this.creationDate;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return keyVersionId
         */
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

        public static final class Builder {
            private String creationDate; 
            private String keyId; 
            private String keyVersionId; 

            /**
             * CreationDate.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * KeyId.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * KeyVersionId.
             */
            public Builder keyVersionId(String keyVersionId) {
                this.keyVersionId = keyVersionId;
                return this;
            }

            public KeyVersion build() {
                return new KeyVersion(this);
            } 

        } 

    }
    public static class KeyVersions extends TeaModel {
        @NameInMap("KeyVersion")
        private java.util.List < KeyVersion> keyVersion;

        private KeyVersions(Builder builder) {
            this.keyVersion = builder.keyVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyVersions create() {
            return builder().build();
        }

        /**
         * @return keyVersion
         */
        public java.util.List < KeyVersion> getKeyVersion() {
            return this.keyVersion;
        }

        public static final class Builder {
            private java.util.List < KeyVersion> keyVersion; 

            /**
             * KeyVersion.
             */
            public Builder keyVersion(java.util.List < KeyVersion> keyVersion) {
                this.keyVersion = keyVersion;
                return this;
            }

            public KeyVersions build() {
                return new KeyVersions(this);
            } 

        } 

    }
}
