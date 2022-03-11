// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostShareKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostShareKeysResponseBody</p>
 */
public class ListHostShareKeysResponseBody extends TeaModel {
    @NameInMap("HostShareKeys")
    private java.util.List < HostShareKeys> hostShareKeys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * HostShareKeys.
         */
        public Builder hostShareKeys(java.util.List < HostShareKeys> hostShareKeys) {
            this.hostShareKeys = hostShareKeys;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostShareKeysResponseBody build() {
            return new ListHostShareKeysResponseBody(this);
        } 

    } 

    public static class HostShareKeys extends TeaModel {
        @NameInMap("HostAccountCount")
        private Long hostAccountCount;

        @NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @NameInMap("LastModifyKeyAt")
        private Long lastModifyKeyAt;

        @NameInMap("PrivateKeyFingerPrint")
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
             * HostAccountCount.
             */
            public Builder hostAccountCount(Long hostAccountCount) {
                this.hostAccountCount = hostAccountCount;
                return this;
            }

            /**
             * HostShareKeyId.
             */
            public Builder hostShareKeyId(String hostShareKeyId) {
                this.hostShareKeyId = hostShareKeyId;
                return this;
            }

            /**
             * HostShareKeyName.
             */
            public Builder hostShareKeyName(String hostShareKeyName) {
                this.hostShareKeyName = hostShareKeyName;
                return this;
            }

            /**
             * LastModifyKeyAt.
             */
            public Builder lastModifyKeyAt(Long lastModifyKeyAt) {
                this.lastModifyKeyAt = lastModifyKeyAt;
                return this;
            }

            /**
             * PrivateKeyFingerPrint.
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
