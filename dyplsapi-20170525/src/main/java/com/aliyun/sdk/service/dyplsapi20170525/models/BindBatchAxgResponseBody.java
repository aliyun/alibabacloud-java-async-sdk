// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindBatchAxgResponseBody} extends {@link TeaModel}
 *
 * <p>BindBatchAxgResponseBody</p>
 */
public class BindBatchAxgResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretBindList")
    private SecretBindList secretBindList;

    private BindBatchAxgResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretBindList = builder.secretBindList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindBatchAxgResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretBindList
     */
    public SecretBindList getSecretBindList() {
        return this.secretBindList;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretBindList secretBindList; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretBindList.
         */
        public Builder secretBindList(SecretBindList secretBindList) {
            this.secretBindList = secretBindList;
            return this;
        }

        public BindBatchAxgResponseBody build() {
            return new BindBatchAxgResponseBody(this);
        } 

    } 

    public static class SecretBind extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Message")
        private String message;

        @NameInMap("PhoneNoA")
        private String phoneNoA;

        @NameInMap("SecretNo")
        private String secretNo;

        @NameInMap("SubsId")
        private String subsId;

        private SecretBind(Builder builder) {
            this.code = builder.code;
            this.extension = builder.extension;
            this.groupId = builder.groupId;
            this.message = builder.message;
            this.phoneNoA = builder.phoneNoA;
            this.secretNo = builder.secretNo;
            this.subsId = builder.subsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretBind create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return phoneNoA
         */
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        /**
         * @return secretNo
         */
        public String getSecretNo() {
            return this.secretNo;
        }

        /**
         * @return subsId
         */
        public String getSubsId() {
            return this.subsId;
        }

        public static final class Builder {
            private String code; 
            private String extension; 
            private String groupId; 
            private String message; 
            private String phoneNoA; 
            private String secretNo; 
            private String subsId; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PhoneNoA.
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * SecretNo.
             */
            public Builder secretNo(String secretNo) {
                this.secretNo = secretNo;
                return this;
            }

            /**
             * SubsId.
             */
            public Builder subsId(String subsId) {
                this.subsId = subsId;
                return this;
            }

            public SecretBind build() {
                return new SecretBind(this);
            } 

        } 

    }
    public static class SecretBindList extends TeaModel {
        @NameInMap("SecretBind")
        private java.util.List < SecretBind> secretBind;

        private SecretBindList(Builder builder) {
            this.secretBind = builder.secretBind;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretBindList create() {
            return builder().build();
        }

        /**
         * @return secretBind
         */
        public java.util.List < SecretBind> getSecretBind() {
            return this.secretBind;
        }

        public static final class Builder {
            private java.util.List < SecretBind> secretBind; 

            /**
             * SecretBind.
             */
            public Builder secretBind(java.util.List < SecretBind> secretBind) {
                this.secretBind = secretBind;
                return this;
            }

            public SecretBindList build() {
                return new SecretBindList(this);
            } 

        } 

    }
}
