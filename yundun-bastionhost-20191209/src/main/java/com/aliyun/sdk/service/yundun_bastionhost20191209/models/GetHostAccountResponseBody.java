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
 * {@link GetHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostAccountResponseBody</p>
 */
public class GetHostAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccount")
    private HostAccount hostAccount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetHostAccountResponseBody model) {
            this.hostAccount = model.hostAccount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the host account that was queried.</p>
         */
        public Builder hostAccount(HostAccount hostAccount) {
            this.hostAccount = hostAccount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostAccountResponseBody build() {
            return new GetHostAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHostAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetHostAccountResponseBody</p>
     */
    public static class HostAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private Boolean hasPassword;

        @com.aliyun.core.annotation.NameInMap("HostAccountId")
        private String hostAccountId;

        @com.aliyun.core.annotation.NameInMap("HostAccountName")
        private String hostAccountName;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @com.aliyun.core.annotation.NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @com.aliyun.core.annotation.NameInMap("PrivateKeyFingerprint")
        private String privateKeyFingerprint;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
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

            private Builder() {
            } 

            private Builder(HostAccount model) {
                this.hasPassword = model.hasPassword;
                this.hostAccountId = model.hostAccountId;
                this.hostAccountName = model.hostAccountName;
                this.hostId = model.hostId;
                this.hostShareKeyId = model.hostShareKeyId;
                this.hostShareKeyName = model.hostShareKeyName;
                this.privateKeyFingerprint = model.privateKeyFingerprint;
                this.protocolName = model.protocolName;
            } 

            /**
             * <p>Indicates whether a password is configured for the host account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * <p>The ID of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * <p>The name of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * <p>The ID of the host to which the host account belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The ID of the shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The fingerprint of the private key.</p>
             * 
             * <strong>example:</strong>
             * <p>fe:ca:37:42:30:00:9d:95:e6:73:e5:b0:32:0a:<strong>:</strong></p>
             */
            public Builder privateKeyFingerprint(String privateKeyFingerprint) {
                this.privateKeyFingerprint = privateKeyFingerprint;
                return this;
            }

            /**
             * <p>The protocol that is used by the host. Valid values:</p>
             * <ul>
             * <li><strong>SSH</strong></li>
             * <li><strong>RDP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SSH</p>
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
