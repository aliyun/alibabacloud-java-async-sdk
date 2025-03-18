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
 * {@link GetHostShareKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostShareKeyResponseBody</p>
 */
public class GetHostShareKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostShareKey")
    private HostShareKey hostShareKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetHostShareKeyResponseBody model) {
            this.hostShareKey = model.hostShareKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned information about the shared key.</p>
         */
        public Builder hostShareKey(HostShareKey hostShareKey) {
            this.hostShareKey = hostShareKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostShareKeyResponseBody build() {
            return new GetHostShareKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHostShareKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetHostShareKeyResponseBody</p>
     */
    public static class HostShareKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @com.aliyun.core.annotation.NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @com.aliyun.core.annotation.NameInMap("LastModifyKeyAt")
        private Long lastModifyKeyAt;

        @com.aliyun.core.annotation.NameInMap("PrivateKeyFingerPrint")
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

            private Builder() {
            } 

            private Builder(HostShareKey model) {
                this.hostShareKeyId = model.hostShareKeyId;
                this.hostShareKeyName = model.hostShareKeyName;
                this.lastModifyKeyAt = model.lastModifyKeyAt;
                this.privateKeyFingerPrint = model.privateKeyFingerPrint;
            } 

            /**
             * <p>The ID of the shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>10427</p>
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
             * <p>The time when the information about the shared key was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1644287246</p>
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

            public HostShareKey build() {
                return new HostShareKey(this);
            } 

        } 

    }
}
