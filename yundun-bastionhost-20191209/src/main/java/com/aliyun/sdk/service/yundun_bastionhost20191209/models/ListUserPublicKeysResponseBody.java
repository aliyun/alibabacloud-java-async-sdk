// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserPublicKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserPublicKeysResponseBody</p>
 */
public class ListUserPublicKeysResponseBody extends TeaModel {
    @NameInMap("PublicKeys")
    private java.util.List < PublicKeys> publicKeys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return publicKeys
     */
    public java.util.List < PublicKeys> getPublicKeys() {
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
        private java.util.List < PublicKeys> publicKeys; 
        private String requestId; 
        private Long totalCount; 

        /**
         * An array that consists of the public keys of the user.
         */
        public Builder publicKeys(java.util.List < PublicKeys> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of public keys.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserPublicKeysResponseBody build() {
            return new ListUserPublicKeysResponseBody(this);
        } 

    } 

    public static class PublicKeys extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("FingerPrint")
        private String fingerPrint;

        @NameInMap("PublicKeyId")
        private String publicKeyId;

        @NameInMap("PublicKeyName")
        private String publicKeyName;

        @NameInMap("UserId")
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

            /**
             * The description of the public key.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The fingerprint of the public key.
             */
            public Builder fingerPrint(String fingerPrint) {
                this.fingerPrint = fingerPrint;
                return this;
            }

            /**
             * The ID of the public key.
             */
            public Builder publicKeyId(String publicKeyId) {
                this.publicKeyId = publicKeyId;
                return this;
            }

            /**
             * The name of the public key.
             */
            public Builder publicKeyName(String publicKeyName) {
                this.publicKeyName = publicKeyName;
                return this;
            }

            /**
             * The ID of the user to which the public key belongs.
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
