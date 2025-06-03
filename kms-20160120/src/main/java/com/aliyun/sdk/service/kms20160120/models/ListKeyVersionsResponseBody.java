// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListKeyVersionsResponseBody model) {
            this.keyVersions = model.keyVersions;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>An array that consists of key versions.</p>
         */
        public Builder keyVersions(KeyVersions keyVersions) {
            this.keyVersions = keyVersions;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>f71204c4-53cd-4eea-b405-653ba2db7e86</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned key versions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKeyVersionsResponseBody build() {
            return new ListKeyVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKeyVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKeyVersionsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(KeyVersion model) {
                this.creationDate = model.creationDate;
                this.keyId = model.keyId;
                this.keyVersionId = model.keyVersionId;
            } 

            /**
             * <p>The date and time when the CMK version was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-03-25T10:42:40Z</p>
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * <p>The globally unique ID of the CMK.</p>
             * <blockquote>
             * <p> If you set the KeyId parameter to the alias of the CMK, the ID of the CMK to which the alias is bound is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0b30658a-ed1a-4922-b8f7-a673ca9c****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The globally unique ID of the CMK version.</p>
             * 
             * <strong>example:</strong>
             * <p>1e3304fd-68ac-4d5b-8886-ae5f01a1****</p>
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
    /**
     * 
     * {@link ListKeyVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKeyVersionsResponseBody</p>
     */
    public static class KeyVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyVersion")
        private java.util.List<KeyVersion> keyVersion;

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
        public java.util.List<KeyVersion> getKeyVersion() {
            return this.keyVersion;
        }

        public static final class Builder {
            private java.util.List<KeyVersion> keyVersion; 

            private Builder() {
            } 

            private Builder(KeyVersions model) {
                this.keyVersion = model.keyVersion;
            } 

            /**
             * KeyVersion.
             */
            public Builder keyVersion(java.util.List<KeyVersion> keyVersion) {
                this.keyVersion = keyVersion;
                return this;
            }

            public KeyVersions build() {
                return new KeyVersions(this);
            } 

        } 

    }
}
