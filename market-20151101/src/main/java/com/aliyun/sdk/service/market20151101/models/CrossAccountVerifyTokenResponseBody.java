// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CrossAccountVerifyTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CrossAccountVerifyTokenResponseBody</p>
 */
public class CrossAccountVerifyTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private CrossAccountVerifyTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CrossAccountVerifyTokenResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

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
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CrossAccountVerifyTokenResponseBody build() {
            return new CrossAccountVerifyTokenResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AuthRoles")
        private java.util.List < String > authRoles;

        @NameInMap("AuthTime")
        private Long authTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Uid")
        private String uid;

        private Result(Builder builder) {
            this.authRoles = builder.authRoles;
            this.authTime = builder.authTime;
            this.name = builder.name;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authRoles
         */
        public java.util.List < String > getAuthRoles() {
            return this.authRoles;
        }

        /**
         * @return authTime
         */
        public Long getAuthTime() {
            return this.authTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private java.util.List < String > authRoles; 
            private Long authTime; 
            private String name; 
            private String uid; 

            /**
             * AuthRoles.
             */
            public Builder authRoles(java.util.List < String > authRoles) {
                this.authRoles = authRoles;
                return this;
            }

            /**
             * AuthTime.
             */
            public Builder authTime(Long authTime) {
                this.authTime = authTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
