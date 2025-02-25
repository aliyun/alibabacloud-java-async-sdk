// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHostShareKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostShareKeysResponseBody</p>
 */
public class ListHostShareKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostShareKeys")
    private java.util.List < HostShareKeys> hostShareKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListHostShareKeysResponseBody(Builder builder) {
        this.hostShareKeys = builder.hostShareKeys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostShareKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostShareKeys
     */
    public java.util.List < HostShareKeys> getHostShareKeys() {
        return this.hostShareKeys;
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
        private java.util.List < HostShareKeys> hostShareKeys; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>An array that consists of the shared keys.</p>
         */
        public Builder hostShareKeys(java.util.List < HostShareKeys> hostShareKeys) {
            this.hostShareKeys = hostShareKeys;
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
         * <p>The total number of the shared keys.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostShareKeysResponseBody build() {
            return new ListHostShareKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostShareKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostShareKeysResponseBody</p>
     */
    public static class HostShareKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountCount")
        private Long hostAccountCount;

        @com.aliyun.core.annotation.NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @com.aliyun.core.annotation.NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @com.aliyun.core.annotation.NameInMap("LastModifyKeyAt")
        private Long lastModifyKeyAt;

        @com.aliyun.core.annotation.NameInMap("PrivateKeyFingerPrint")
        private String privateKeyFingerPrint;

        private HostShareKeys(Builder builder) {
            this.hostAccountCount = builder.hostAccountCount;
            this.hostShareKeyId = builder.hostShareKeyId;
            this.hostShareKeyName = builder.hostShareKeyName;
            this.lastModifyKeyAt = builder.lastModifyKeyAt;
            this.privateKeyFingerPrint = builder.privateKeyFingerPrint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostShareKeys create() {
            return builder().build();
        }

        /**
         * @return hostAccountCount
         */
        public Long getHostAccountCount() {
            return this.hostAccountCount;
        }

        /**
         * @return hostShareKeyId
         */
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        /**
         * @return hostShareKeyName
         */
        public String getHostShareKeyName() {
            return this.hostShareKeyName;
        }

        /**
         * @return lastModifyKeyAt
         */
        public Long getLastModifyKeyAt() {
            return this.lastModifyKeyAt;
        }

        /**
         * @return privateKeyFingerPrint
         */
        public String getPrivateKeyFingerPrint() {
            return this.privateKeyFingerPrint;
        }

        public static final class Builder {
            private Long hostAccountCount; 
            private String hostShareKeyId; 
            private String hostShareKeyName; 
            private Long lastModifyKeyAt; 
            private String privateKeyFingerPrint; 

            /**
             * <p>The number of the associated host accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostAccountCount(Long hostAccountCount) {
                this.hostAccountCount = hostAccountCount;
                return this;
            }

            /**
             * <p>The shared key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10247</p>
             */
            public Builder hostShareKeyId(String hostShareKeyId) {
                this.hostShareKeyId = hostShareKeyId;
                return this;
            }

            /**
             * <p>The name of the shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder hostShareKeyName(String hostShareKeyName) {
                this.hostShareKeyName = hostShareKeyName;
                return this;
            }

            /**
             * <p>The time when the shared key was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1644806406</p>
             */
            public Builder lastModifyKeyAt(Long lastModifyKeyAt) {
                this.lastModifyKeyAt = lastModifyKeyAt;
                return this;
            }

            /**
             * <p>The fingerprint of the private key.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder privateKeyFingerPrint(String privateKeyFingerPrint) {
                this.privateKeyFingerPrint = privateKeyFingerPrint;
                return this;
            }

            public HostShareKeys build() {
                return new HostShareKeys(this);
            } 

        } 

    }
}
