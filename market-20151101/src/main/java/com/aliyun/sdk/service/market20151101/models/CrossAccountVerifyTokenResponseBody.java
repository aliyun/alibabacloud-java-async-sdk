// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CrossAccountVerifyTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CrossAccountVerifyTokenResponseBody</p>
 */
public class CrossAccountVerifyTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>C19D103F-EA2D-50A5-8441-0267CE9FBA56</p>
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

    /**
     * 
     * {@link CrossAccountVerifyTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CrossAccountVerifyTokenResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthRoles")
        private java.util.List < String > authRoles;

        @com.aliyun.core.annotation.NameInMap("AuthTime")
        private Long authTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Uid")
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
