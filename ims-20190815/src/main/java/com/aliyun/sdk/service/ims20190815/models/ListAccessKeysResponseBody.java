// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The list of AccessKey pairs.</p>
         */
        public Builder accessKeys(AccessKeys accessKeys) {
            this.accessKeys = accessKeys;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4B450CA1-36E8-4AA2-8461-86B42BF4CC4E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccessKeysResponseBody build() {
            return new ListAccessKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessKeysResponseBody</p>
     */
    public static class AccessKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private AccessKey(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.createDate = builder.createDate;
            this.status = builder.status;
            this.updateDate = builder.updateDate;
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

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String createDate; 
            private String status; 
            private String updateDate; 

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0wNEpMMlzy7s****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-13T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The status of the AccessKey pair. Valid values:</p>
             * <ul>
             * <li>Active</li>
             * <li>Inactive</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-13T12:33:18Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public AccessKey build() {
                return new AccessKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAccessKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessKeysResponseBody</p>
     */
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
