// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostAccountResponseBody</p>
 */
public class GetHostAccountResponseBody extends TeaModel {
    @NameInMap("HostAccount")
    private HostAccount hostAccount;

    @NameInMap("RequestId")
    private String requestId;

    private GetHostAccountResponseBody(Builder builder) {
        this.hostAccount = builder.hostAccount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostAccount
     */
    public HostAccount getHostAccount() {
        return this.hostAccount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HostAccount hostAccount; 
        private String requestId; 

        /**
         * The details of the host account that were queried.
         */
        public Builder hostAccount(HostAccount hostAccount) {
            this.hostAccount = hostAccount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostAccountResponseBody build() {
            return new GetHostAccountResponseBody(this);
        } 

    } 

    public static class HostAccount extends TeaModel {
        @NameInMap("HasPassword")
        private Boolean hasPassword;

        @NameInMap("HostAccountId")
        private String hostAccountId;

        @NameInMap("HostAccountName")
        private String hostAccountName;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @NameInMap("PrivateKeyFingerprint")
        private String privateKeyFingerprint;

        @NameInMap("ProtocolName")
        private String protocolName;

        private HostAccount(Builder builder) {
            this.hasPassword = builder.hasPassword;
            this.hostAccountId = builder.hostAccountId;
            this.hostAccountName = builder.hostAccountName;
            this.hostId = builder.hostId;
            this.hostShareKeyId = builder.hostShareKeyId;
            this.hostShareKeyName = builder.hostShareKeyName;
            this.privateKeyFingerprint = builder.privateKeyFingerprint;
            this.protocolName = builder.protocolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccount create() {
            return builder().build();
        }

        /**
         * @return hasPassword
         */
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return hostAccountId
         */
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        /**
         * @return hostAccountName
         */
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
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
         * @return privateKeyFingerprint
         */
        public String getPrivateKeyFingerprint() {
            return this.privateKeyFingerprint;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private Boolean hasPassword; 
            private String hostAccountId; 
            private String hostAccountName; 
            private String hostId; 
            private String hostShareKeyId; 
            private String hostShareKeyName; 
            private String privateKeyFingerprint; 
            private String protocolName; 

            /**
             * Indicates whether a password is set for the host account. Valid values:
             * <p>
             * 
             * *   **true**: indicates that a password is set for the host account.
             * *   **false**: indicates that no password is set for the host account.
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * The ID of the host account.
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * The name of the host account.
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * The ID of the host to which the host account belongs.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The ID of the shared key.
             */
            public Builder hostShareKeyId(String hostShareKeyId) {
                this.hostShareKeyId = hostShareKeyId;
                return this;
            }

            /**
             * The name of the shared key.
             */
            public Builder hostShareKeyName(String hostShareKeyName) {
                this.hostShareKeyName = hostShareKeyName;
                return this;
            }

            /**
             * The fingerprint of the private key.
             */
            public Builder privateKeyFingerprint(String privateKeyFingerprint) {
                this.privateKeyFingerprint = privateKeyFingerprint;
                return this;
            }

            /**
             * The protocol used by the host account. Valid values:
             * <p>
             * 
             * *   **SSH**
             * *   **RDP**
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            public HostAccount build() {
                return new HostAccount(this);
            } 

        } 

    }
}
