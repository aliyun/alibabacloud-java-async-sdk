// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessKeysResponseBody</p>
 */
public class ListAccessKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeys")
    private AccessKeys accessKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccessKeysResponseBody(Builder builder) {
        this.accessKeys = builder.accessKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKeys
     */
    public AccessKeys getAccessKeys() {
        return this.accessKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessKeys accessKeys; 
        private String requestId; 

        /**
         * The list of AccessKey pairs that belong to the RAM user.
         */
        public Builder accessKeys(AccessKeys accessKeys) {
            this.accessKeys = accessKeys;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccessKeysResponseBody build() {
            return new ListAccessKeysResponseBody(this);
        } 

    } 

    public static class AccessKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AccessKey(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.createDate = builder.createDate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKey create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String createDate; 
            private String status; 

            /**
             * The AccessKey ID.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * The time when the AccessKey pair was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The status of the AccessKey pair. Valid values: Active and Inactive.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AccessKey build() {
                return new AccessKey(this);
            } 

        } 

    }
    public static class AccessKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private java.util.List < AccessKey> accessKey;

        private AccessKeys(Builder builder) {
            this.accessKey = builder.accessKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKeys create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public java.util.List < AccessKey> getAccessKey() {
            return this.accessKey;
        }

        public static final class Builder {
            private java.util.List < AccessKey> accessKey; 

            /**
             * AccessKey.
             */
            public Builder accessKey(java.util.List < AccessKey> accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            public AccessKeys build() {
                return new AccessKeys(this);
            } 

        } 

    }
}
