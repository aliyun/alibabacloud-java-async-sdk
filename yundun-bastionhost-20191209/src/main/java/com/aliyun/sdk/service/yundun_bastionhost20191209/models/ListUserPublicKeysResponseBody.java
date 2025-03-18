// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListUserPublicKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserPublicKeysResponseBody</p>
 */
public class ListUserPublicKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PublicKeys")
    private java.util.List<PublicKeys> publicKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListUserPublicKeysResponseBody(Builder builder) {
        this.publicKeys = builder.publicKeys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserPublicKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return publicKeys
     */
    public java.util.List<PublicKeys> getPublicKeys() {
        return this.publicKeys;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<PublicKeys> publicKeys; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListUserPublicKeysResponseBody model) {
            this.publicKeys = model.publicKeys;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>An array that consists of the public keys of the user.</p>
         */
        public Builder publicKeys(java.util.List<PublicKeys> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of public keys.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserPublicKeysResponseBody build() {
            return new ListUserPublicKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserPublicKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPublicKeysResponseBody</p>
     */
    public static class PublicKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("FingerPrint")
        private String fingerPrint;

        @com.aliyun.core.annotation.NameInMap("PublicKeyId")
        private String publicKeyId;

        @com.aliyun.core.annotation.NameInMap("PublicKeyName")
        private String publicKeyName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private PublicKeys(Builder builder) {
            this.comment = builder.comment;
            this.fingerPrint = builder.fingerPrint;
            this.publicKeyId = builder.publicKeyId;
            this.publicKeyName = builder.publicKeyName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicKeys create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return fingerPrint
         */
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        /**
         * @return publicKeyId
         */
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

        /**
         * @return publicKeyName
         */
        public String getPublicKeyName() {
            return this.publicKeyName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String comment; 
            private String fingerPrint; 
            private String publicKeyId; 
            private String publicKeyName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(PublicKeys model) {
                this.comment = model.comment;
                this.fingerPrint = model.fingerPrint;
                this.publicKeyId = model.publicKeyId;
                this.publicKeyName = model.publicKeyName;
                this.userId = model.userId;
            } 

            /**
             * <p>The description of the public key.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The fingerprint of the public key.</p>
             * 
             * <strong>example:</strong>
             * <p>d8:7d:b6:27:70:2d:07:fb:c6:b6:66:0a:86:7b:0f:9a</p>
             */
            public Builder fingerPrint(String fingerPrint) {
                this.fingerPrint = fingerPrint;
                return this;
            }

            /**
             * <p>The ID of the public key.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder publicKeyId(String publicKeyId) {
                this.publicKeyId = publicKeyId;
                return this;
            }

            /**
             * <p>The name of the public key.</p>
             * 
             * <strong>example:</strong>
             * <p>Keyname</p>
             */
            public Builder publicKeyName(String publicKeyName) {
                this.publicKeyName = publicKeyName;
                return this;
            }

            /**
             * <p>The ID of the user to which the public key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PublicKeys build() {
                return new PublicKeys(this);
            } 

        } 

    }
}
