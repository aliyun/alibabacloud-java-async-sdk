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
 * {@link DescribeKeyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeyVersionResponseBody</p>
 */
public class DescribeKeyVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyVersion")
    private KeyVersion keyVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKeyVersionResponseBody(Builder builder) {
        this.keyVersion = builder.keyVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyVersion
     */
    public KeyVersion getKeyVersion() {
        return this.keyVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KeyVersion keyVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeKeyVersionResponseBody model) {
            this.keyVersion = model.keyVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metadata of the CMK version.</p>
         */
        public Builder keyVersion(KeyVersion keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7021b6ec-4be7-4d3c-8a68-1e85d4d515a0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKeyVersionResponseBody build() {
            return new DescribeKeyVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKeyVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKeyVersionResponseBody</p>
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
             * <p> If you set the KeyId parameter in the request to an alias of the CMK, the ID of the CMK to which the alias is bound is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The globally unique ID of the CMK version.</p>
             * 
             * <strong>example:</strong>
             * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
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
}
