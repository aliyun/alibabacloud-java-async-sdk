// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListAccessKeysInRecycleBinResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessKeysInRecycleBinResponseBody</p>
 */
public class ListAccessKeysInRecycleBinResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeys")
    private AccessKeys accessKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccessKeysInRecycleBinResponseBody(Builder builder) {
        this.accessKeys = builder.accessKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessKeysInRecycleBinResponseBody create() {
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
         * <p>The information about the AccessKey pairs.</p>
         */
        public Builder accessKeys(AccessKeys accessKeys) {
            this.accessKeys = accessKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccessKeysInRecycleBinResponseBody build() {
            return new ListAccessKeysInRecycleBinResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessKeysInRecycleBinResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessKeysInRecycleBinResponseBody</p>
     */
    public static class AccessKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DeleteDate")
        private String deleteDate;

        @com.aliyun.core.annotation.NameInMap("RecycleDate")
        private String recycleDate;

        private AccessKey(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.createDate = builder.createDate;
            this.deleteDate = builder.deleteDate;
            this.recycleDate = builder.recycleDate;
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
         * @return deleteDate
         */
        public String getDeleteDate() {
            return this.deleteDate;
        }

        /**
         * @return recycleDate
         */
        public String getRecycleDate() {
            return this.recycleDate;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String createDate; 
            private String deleteDate; 
            private String recycleDate; 

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI4GFTgcR8m8cZQDTH****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-11T09:12:00Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair will be permanently deleted from the recycle bin.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-12T09:12:00Z</p>
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair was deleted and moved to the recycle bin.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-12T09:12:00Z</p>
             */
            public Builder recycleDate(String recycleDate) {
                this.recycleDate = recycleDate;
                return this;
            }

            public AccessKey build() {
                return new AccessKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAccessKeysInRecycleBinResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessKeysInRecycleBinResponseBody</p>
     */
    public static class AccessKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private java.util.List<AccessKey> accessKey;

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
        public java.util.List<AccessKey> getAccessKey() {
            return this.accessKey;
        }

        public static final class Builder {
            private java.util.List<AccessKey> accessKey; 

            /**
             * AccessKey.
             */
            public Builder accessKey(java.util.List<AccessKey> accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            public AccessKeys build() {
                return new AccessKeys(this);
            } 

        } 

    }
}
