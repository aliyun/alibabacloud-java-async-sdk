// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitEmailVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitEmailVerificationResponseBody</p>
 */
public class SubmitEmailVerificationResponseBody extends TeaModel {
    @NameInMap("ExistList")
    private java.util.List < ExistList> existList;

    @NameInMap("FailList")
    private java.util.List < FailList> failList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessList")
    private java.util.List < SuccessList> successList;

    private SubmitEmailVerificationResponseBody(Builder builder) {
        this.existList = builder.existList;
        this.failList = builder.failList;
        this.requestId = builder.requestId;
        this.successList = builder.successList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEmailVerificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return existList
     */
    public java.util.List < ExistList> getExistList() {
        return this.existList;
    }

    /**
     * @return failList
     */
    public java.util.List < FailList> getFailList() {
        return this.failList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successList
     */
    public java.util.List < SuccessList> getSuccessList() {
        return this.successList;
    }

    public static final class Builder {
        private java.util.List < ExistList> existList; 
        private java.util.List < FailList> failList; 
        private String requestId; 
        private java.util.List < SuccessList> successList; 

        /**
         * ExistList.
         */
        public Builder existList(java.util.List < ExistList> existList) {
            this.existList = existList;
            return this;
        }

        /**
         * FailList.
         */
        public Builder failList(java.util.List < FailList> failList) {
            this.failList = failList;
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
         * SuccessList.
         */
        public Builder successList(java.util.List < SuccessList> successList) {
            this.successList = successList;
            return this;
        }

        public SubmitEmailVerificationResponseBody build() {
            return new SubmitEmailVerificationResponseBody(this);
        } 

    } 

    public static class ExistList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Email")
        private String email;

        @NameInMap("Message")
        private String message;

        private ExistList(Builder builder) {
            this.code = builder.code;
            this.email = builder.email;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExistList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String email; 
            private String message; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ExistList build() {
                return new ExistList(this);
            } 

        } 

    }
    public static class FailList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Email")
        private String email;

        @NameInMap("Message")
        private String message;

        private FailList(Builder builder) {
            this.code = builder.code;
            this.email = builder.email;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String email; 
            private String message; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public FailList build() {
                return new FailList(this);
            } 

        } 

    }
    public static class SuccessList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Email")
        private String email;

        @NameInMap("Message")
        private String message;

        private SuccessList(Builder builder) {
            this.code = builder.code;
            this.email = builder.email;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String email; 
            private String message; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public SuccessList build() {
                return new SuccessList(this);
            } 

        } 

    }
}
