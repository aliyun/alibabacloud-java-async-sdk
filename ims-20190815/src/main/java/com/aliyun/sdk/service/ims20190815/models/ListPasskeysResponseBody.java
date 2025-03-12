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
 * {@link ListPasskeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListPasskeysResponseBody</p>
 */
public class ListPasskeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Passkeys")
    private java.util.List<Passkeys> passkeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPasskeysResponseBody(Builder builder) {
        this.passkeys = builder.passkeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPasskeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return passkeys
     */
    public java.util.List<Passkeys> getPasskeys() {
        return this.passkeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Passkeys> passkeys; 
        private String requestId; 

        /**
         * <p>The information about the passkeys.</p>
         */
        public Builder passkeys(java.util.List<Passkeys> passkeys) {
            this.passkeys = passkeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPasskeysResponseBody build() {
            return new ListPasskeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPasskeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListPasskeysResponseBody</p>
     */
    public static class Passkeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("LastUseDate")
        private String lastUseDate;

        @com.aliyun.core.annotation.NameInMap("PasskeyId")
        private String passkeyId;

        @com.aliyun.core.annotation.NameInMap("PasskeyName")
        private String passkeyName;

        private Passkeys(Builder builder) {
            this.createDate = builder.createDate;
            this.lastUseDate = builder.lastUseDate;
            this.passkeyId = builder.passkeyId;
            this.passkeyName = builder.passkeyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Passkeys create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return lastUseDate
         */
        public String getLastUseDate() {
            return this.lastUseDate;
        }

        /**
         * @return passkeyId
         */
        public String getPasskeyId() {
            return this.passkeyId;
        }

        /**
         * @return passkeyName
         */
        public String getPasskeyName() {
            return this.passkeyName;
        }

        public static final class Builder {
            private String createDate; 
            private String lastUseDate; 
            private String passkeyId; 
            private String passkeyName; 

            /**
             * <p>The time when the passkey was created. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1737450279</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The time when the passkey was last used. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1737450390</p>
             */
            public Builder lastUseDate(String lastUseDate) {
                this.lastUseDate = lastUseDate;
                return this;
            }

            /**
             * <p>The ID of the passkey.</p>
             * 
             * <strong>example:</strong>
             * <p>PASSKEY-CuZjEHhWcr7GIQOMGvkS</p>
             */
            public Builder passkeyId(String passkeyId) {
                this.passkeyId = passkeyId;
                return this;
            }

            /**
             * <p>The name of the passkey.</p>
             * 
             * <strong>example:</strong>
             * <p>device1</p>
             */
            public Builder passkeyName(String passkeyName) {
                this.passkeyName = passkeyName;
                return this;
            }

            public Passkeys build() {
                return new Passkeys(this);
            } 

        } 

    }
}
