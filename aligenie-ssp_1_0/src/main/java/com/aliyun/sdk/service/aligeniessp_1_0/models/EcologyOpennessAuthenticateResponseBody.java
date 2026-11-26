// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link EcologyOpennessAuthenticateResponseBody} extends {@link TeaModel}
 *
 * <p>EcologyOpennessAuthenticateResponseBody</p>
 */
public class EcologyOpennessAuthenticateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EcologyOpennessAuthenticateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcologyOpennessAuthenticateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EcologyOpennessAuthenticateResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Response code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>73*<em><strong>9-175A-1324-8202-9FAAB</strong></em>**A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Response Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Flag indicating whether the invocation succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EcologyOpennessAuthenticateResponseBody build() {
            return new EcologyOpennessAuthenticateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EcologyOpennessAuthenticateResponseBody} extends {@link TeaModel}
     *
     * <p>EcologyOpennessAuthenticateResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("SceneCode")
        private String sceneCode;

        @com.aliyun.core.annotation.NameInMap("ThirdUserIdentifier")
        private String thirdUserIdentifier;

        @com.aliyun.core.annotation.NameInMap("ThirdUserType")
        private String thirdUserType;

        @com.aliyun.core.annotation.NameInMap("UserOpenId")
        private String userOpenId;

        private Result(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.sceneCode = builder.sceneCode;
            this.thirdUserIdentifier = builder.thirdUserIdentifier;
            this.thirdUserType = builder.thirdUserType;
            this.userOpenId = builder.userOpenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return sceneCode
         */
        public String getSceneCode() {
            return this.sceneCode;
        }

        /**
         * @return thirdUserIdentifier
         */
        public String getThirdUserIdentifier() {
            return this.thirdUserIdentifier;
        }

        /**
         * @return thirdUserType
         */
        public String getThirdUserType() {
            return this.thirdUserType;
        }

        /**
         * @return userOpenId
         */
        public String getUserOpenId() {
            return this.userOpenId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String sceneCode; 
            private String thirdUserIdentifier; 
            private String thirdUserType; 
            private String userOpenId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.sceneCode = model.sceneCode;
                this.thirdUserIdentifier = model.thirdUserIdentifier;
                this.thirdUserType = model.thirdUserType;
                this.userOpenId = model.userOpenId;
            } 

            /**
             * <p>entity key</p>
             * 
             * <strong>example:</strong>
             * <p>12****7</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>entity Type</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>scenario code</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * <p>Third-party user identifier</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder thirdUserIdentifier(String thirdUserIdentifier) {
                this.thirdUserIdentifier = thirdUserIdentifier;
                return this;
            }

            /**
             * <p>Third-party user type</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder thirdUserType(String thirdUserType) {
                this.thirdUserType = thirdUserType;
                return this;
            }

            /**
             * <p>Tmall Genie user openId</p>
             * 
             * <strong>example:</strong>
             * <p>o****RnNAW/smBNX9By7Zlc3J7iQUXPiUj/6OizU+ifLSzn1vpQL9ZgSp22u7hsxj0UZ2i6urbv9HQ==</p>
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
