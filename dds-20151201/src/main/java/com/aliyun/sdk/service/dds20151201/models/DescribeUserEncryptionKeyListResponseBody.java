// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeUserEncryptionKeyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserEncryptionKeyListResponseBody</p>
 */
public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyIds")
    private KeyIds keyIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserEncryptionKeyListResponseBody(Builder builder) {
        this.keyIds = builder.keyIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserEncryptionKeyListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyIds
     */
    public KeyIds getKeyIds() {
        return this.keyIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KeyIds keyIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserEncryptionKeyListResponseBody model) {
            this.keyIds = model.keyIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of custom keys.</p>
         */
        public Builder keyIds(KeyIds keyIds) {
            this.keyIds = keyIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7CD51DA4-A499-43CE-B9B5-20CD4FDC648E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserEncryptionKeyListResponseBody build() {
            return new DescribeUserEncryptionKeyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserEncryptionKeyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserEncryptionKeyListResponseBody</p>
     */
    public static class KeyIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyId")
        private java.util.List<String> keyId;

        private KeyIds(Builder builder) {
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyIds create() {
            return builder().build();
        }

        /**
         * @return keyId
         */
        public java.util.List<String> getKeyId() {
            return this.keyId;
        }

        public static final class Builder {
            private java.util.List<String> keyId; 

            private Builder() {
            } 

            private Builder(KeyIds model) {
                this.keyId = model.keyId;
            } 

            /**
             * KeyId.
             */
            public Builder keyId(java.util.List<String> keyId) {
                this.keyId = keyId;
                return this;
            }

            public KeyIds build() {
                return new KeyIds(this);
            } 

        } 

    }
}
