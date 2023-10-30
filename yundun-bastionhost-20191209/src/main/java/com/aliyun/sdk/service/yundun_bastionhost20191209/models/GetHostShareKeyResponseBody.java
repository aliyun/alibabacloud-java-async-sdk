// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostShareKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostShareKeyResponseBody</p>
 */
public class GetHostShareKeyResponseBody extends TeaModel {
    @NameInMap("HostShareKey")
    private HostShareKey hostShareKey;

    @NameInMap("RequestId")
    private String requestId;

    private GetHostShareKeyResponseBody(Builder builder) {
        this.hostShareKey = builder.hostShareKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostShareKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostShareKey
     */
    public HostShareKey getHostShareKey() {
        return this.hostShareKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HostShareKey hostShareKey; 
        private String requestId; 

        /**
         * The operation that you want to perform. Set the value to **GetHostShareKey**.
         */
        public Builder hostShareKey(HostShareKey hostShareKey) {
            this.hostShareKey = hostShareKey;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostShareKeyResponseBody build() {
            return new GetHostShareKeyResponseBody(this);
        } 

    } 

    public static class HostShareKey extends TeaModel {
        @NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @NameInMap("LastModifyKeyAt")
        private Long lastModifyKeyAt;

        @NameInMap("PrivateKeyFingerPrint")
        private String privateKeyFingerPrint;

        private HostShareKey(Builder builder) {
            this.hostShareKeyId = builder.hostShareKeyId;
            this.hostShareKeyName = builder.hostShareKeyName;
            this.lastModifyKeyAt = builder.lastModifyKeyAt;
            this.privateKeyFingerPrint = builder.privateKeyFingerPrint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostShareKey create() {
            return builder().build();
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
            private String hostShareKeyId; 
            private String hostShareKeyName; 
            private Long lastModifyKeyAt; 
            private String privateKeyFingerPrint; 

            /**
             * The fingerprint of the private key.
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

            public HostShareKey build() {
                return new HostShareKey(this);
            } 

        } 

    }
}
