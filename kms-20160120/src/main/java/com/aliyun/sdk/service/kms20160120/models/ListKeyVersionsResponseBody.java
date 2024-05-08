// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKeyVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKeyVersionsResponseBody</p>
 */
public class ListKeyVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyVersions")
    private KeyVersions keyVersions;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * An array that consists of key versions.
         */
        public Builder keyVersions(KeyVersions keyVersions) {
            this.keyVersions = keyVersions;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned key versions.
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
        @com.aliyun.core.annotation.NameInMap("CreationDate")
        private String creationDate;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("KeyVersionId")
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
             * The date and time when the CMK version was created. The time is displayed in UTC.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * The globally unique ID of the CMK.
             * <p>
             * 
             * >  If you set the KeyId parameter to the alias of the CMK, the ID of the CMK to which the alias is bound is returned.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * The globally unique ID of the CMK version.
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
        @com.aliyun.core.annotation.NameInMap("KeyVersion")
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
