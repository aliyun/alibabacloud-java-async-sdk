// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link DeleteEmailVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEmailVerificationResponseBody</p>
 */
public class DeleteEmailVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailList")
    private java.util.List<FailList> failList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessList")
    private java.util.List<SuccessList> successList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failList
     */
    public java.util.List<FailList> getFailList() {
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
    public java.util.List<SuccessList> getSuccessList() {
        return this.successList;
    }

    public static final class Builder {
        private java.util.List<FailList> failList; 
        private String requestId; 
        private java.util.List<SuccessList> successList; 

        private Builder() {
        } 

        private Builder(DeleteEmailVerificationResponseBody model) {
            this.failList = model.failList;
            this.requestId = model.requestId;
            this.successList = model.successList;
        } 

        /**
         * <p>List of email addresses for which deletion failed.</p>
         */
        public Builder failList(java.util.List<FailList> failList) {
            this.failList = failList;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A3D0E4A-0D4B-4BD0-90D7-A61DF8DD26AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of successfully deleted email addresses.</p>
         */
        public Builder successList(java.util.List<SuccessList> successList) {
            this.successList = successList;
            return this;
        }

        public DeleteEmailVerificationResponseBody build() {
            return new DeleteEmailVerificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteEmailVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteEmailVerificationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(FailList model) {
                this.code = model.code;
                this.email = model.email;
                this.message = model.message;
            } 

            /**
             * <p>Returned code.</p>
             * 
             * <strong>example:</strong>
             * <p>ParameterIllegall</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Email address for which deletion failed.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test1@aliyun.com">test1@aliyun.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Message returned upon failure to delete the email address.</p>
             * 
             * <strong>example:</strong>
             * <p>Parameter error</p>
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
    /**
     * 
     * {@link DeleteEmailVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteEmailVerificationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SuccessList model) {
                this.code = model.code;
                this.email = model.email;
                this.message = model.message;
            } 

            /**
             * <p>Returned code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Email address that was successfully deleted.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test2@aliyun.com">test2@aliyun.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Message returned upon successful deletion of the email address.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
