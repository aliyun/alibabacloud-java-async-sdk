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
 * {@link CreateKeyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyVersionResponseBody</p>
 */
public class CreateKeyVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyVersion")
    private KeyVersion keyVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKeyVersionResponseBody(Builder builder) {
        this.keyVersion = builder.keyVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyVersionResponseBody create() {
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

        private Builder(CreateKeyVersionResponseBody model) {
            this.keyVersion = model.keyVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metadata of the version.</p>
         */
        public Builder keyVersion(KeyVersion keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b96f250a-4b75-498c-91be-22c6928f85be</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKeyVersionResponseBody build() {
            return new CreateKeyVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateKeyVersionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateKeyVersionResponseBody</p>
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
             * <p>The date and time when the version was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-02T10:38:27Z</p>
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * <p>The ID of the CMK. The ID must be globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>0b30658a-ed1a-4922-b8f7-a673ca9c****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The ID of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>c0a3d5dc-0b47-4199-a050-b289349a****</p>
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
