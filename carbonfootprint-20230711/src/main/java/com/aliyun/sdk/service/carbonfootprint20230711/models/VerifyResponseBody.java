// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyResponseBody</p>
 */
public class VerifyResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyResponseBody build() {
            return new VerifyResponseBody(this);
        } 

    } 

    public static class AllMultiAccountUids extends TeaModel {
        @NameInMap("accountId")
        private String accountId;

        @NameInMap("displayName")
        private String displayName;

        private AllMultiAccountUids(Builder builder) {
            this.accountId = builder.accountId;
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllMultiAccountUids create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String accountId; 
            private String displayName; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public AllMultiAccountUids build() {
                return new AllMultiAccountUids(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AllowedUids")
        private java.util.List < String > allowedUids;

        @NameInMap("accountType")
        private Integer accountType;

        @NameInMap("allMultiAccountUids")
        private java.util.List < AllMultiAccountUids> allMultiAccountUids;

        @NameInMap("code")
        private String code;

        @NameInMap("message")
        private String message;

        @NameInMap("multiAccountsAllow")
        private Integer multiAccountsAllow;

        private Data(Builder builder) {
            this.allowedUids = builder.allowedUids;
            this.accountType = builder.accountType;
            this.allMultiAccountUids = builder.allMultiAccountUids;
            this.code = builder.code;
            this.message = builder.message;
            this.multiAccountsAllow = builder.multiAccountsAllow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowedUids
         */
        public java.util.List < String > getAllowedUids() {
            return this.allowedUids;
        }

        /**
         * @return accountType
         */
        public Integer getAccountType() {
            return this.accountType;
        }

        /**
         * @return allMultiAccountUids
         */
        public java.util.List < AllMultiAccountUids> getAllMultiAccountUids() {
            return this.allMultiAccountUids;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return multiAccountsAllow
         */
        public Integer getMultiAccountsAllow() {
            return this.multiAccountsAllow;
        }

        public static final class Builder {
            private java.util.List < String > allowedUids; 
            private Integer accountType; 
            private java.util.List < AllMultiAccountUids> allMultiAccountUids; 
            private String code; 
            private String message; 
            private Integer multiAccountsAllow; 

            /**
             * AllowedUids.
             */
            public Builder allowedUids(java.util.List < String > allowedUids) {
                this.allowedUids = allowedUids;
                return this;
            }

            /**
             * accountType.
             */
            public Builder accountType(Integer accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * allMultiAccountUids.
             */
            public Builder allMultiAccountUids(java.util.List < AllMultiAccountUids> allMultiAccountUids) {
                this.allMultiAccountUids = allMultiAccountUids;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * multiAccountsAllow.
             */
            public Builder multiAccountsAllow(Integer multiAccountsAllow) {
                this.multiAccountsAllow = multiAccountsAllow;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
