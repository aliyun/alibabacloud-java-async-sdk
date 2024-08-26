// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEmailVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEmailVerificationResponseBody</p>
 */
public class DeleteEmailVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailList")
    private java.util.List < FailList> failList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessList")
    private java.util.List < SuccessList> successList;

    private DeleteEmailVerificationResponseBody(Builder builder) {
        this.failList = builder.failList;
        this.requestId = builder.requestId;
        this.successList = builder.successList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEmailVerificationResponseBody create() {
        return builder().build();
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
        private java.util.List < FailList> failList; 
        private String requestId; 
        private java.util.List < SuccessList> successList; 

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

        public DeleteEmailVerificationResponseBody build() {
            return new DeleteEmailVerificationResponseBody(this);
        } 

    } 

    public static class FailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Message")
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
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Message")
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
