// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeFaceVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaceVerifyResponseBody</p>
 */
public class DescribeFaceVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeFaceVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaceVerifyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeFaceVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

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
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeFaceVerifyResponseBody build() {
            return new DescribeFaceVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFaceVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaceVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceRisk")
        private String deviceRisk;

        @com.aliyun.core.annotation.NameInMap("DeviceToken")
        private String deviceToken;

        @com.aliyun.core.annotation.NameInMap("IdentityInfo")
        private String identityInfo;

        @com.aliyun.core.annotation.NameInMap("MaterialInfo")
        private String materialInfo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private String userInfo;

        private ResultObject(Builder builder) {
            this.deviceRisk = builder.deviceRisk;
            this.deviceToken = builder.deviceToken;
            this.identityInfo = builder.identityInfo;
            this.materialInfo = builder.materialInfo;
            this.passed = builder.passed;
            this.subCode = builder.subCode;
            this.success = builder.success;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return deviceRisk
         */
        public String getDeviceRisk() {
            return this.deviceRisk;
        }

        /**
         * @return deviceToken
         */
        public String getDeviceToken() {
            return this.deviceToken;
        }

        /**
         * @return identityInfo
         */
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        /**
         * @return materialInfo
         */
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        /**
         * @return userInfo
         */
        public String getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String deviceRisk; 
            private String deviceToken; 
            private String identityInfo; 
            private String materialInfo; 
            private String passed; 
            private String subCode; 
            private String success; 
            private String userInfo; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.deviceRisk = model.deviceRisk;
                this.deviceToken = model.deviceToken;
                this.identityInfo = model.identityInfo;
                this.materialInfo = model.materialInfo;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.success = model.success;
                this.userInfo = model.userInfo;
            } 

            /**
             * DeviceRisk.
             */
            public Builder deviceRisk(String deviceRisk) {
                this.deviceRisk = deviceRisk;
                return this;
            }

            /**
             * DeviceToken.
             */
            public Builder deviceToken(String deviceToken) {
                this.deviceToken = deviceToken;
                return this;
            }

            /**
             * IdentityInfo.
             */
            public Builder identityInfo(String identityInfo) {
                this.identityInfo = identityInfo;
                return this;
            }

            /**
             * MaterialInfo.
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * Passed.
             */
            public Builder passed(String passed) {
                this.passed = passed;
                return this;
            }

            /**
             * SubCode.
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(String userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
