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
         * <p>Return code: 200 indicates success, other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
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
             * <p>Device risk label.</p>
             * 
             * <strong>example:</strong>
             * <p>ROOT,VPN,HOOK</p>
             */
            public Builder deviceRisk(String deviceRisk) {
                this.deviceRisk = deviceRisk;
                return this;
            }

            /**
             * <p>Device token.</p>
             * 
             * <strong>example:</strong>
             * <p>McozS1ZWRcRZStlERcZZo_QOytx5jcgZoZJEoRLOxxxxxxx</p>
             */
            public Builder deviceToken(String deviceToken) {
                this.deviceToken = deviceToken;
                return this;
            }

            /**
             * <p>Information about the authenticated subject, usually empty in general authentication scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder identityInfo(String identityInfo) {
                this.identityInfo = identityInfo;
                return this;
            }

            /**
             * <p>Attachment information of the authenticated subject, mainly image materials. JSON format, see example below.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;faceAttack&quot;: &quot;F&quot;,&quot;facialPictureFront&quot;: {&quot;qualityScore&quot;: 88.3615493774414,&quot;pictureUrl&quot;: &quot;<a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg%22,%22ossBucketName">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg&quot;,&quot;ossBucketName</a>&quot;: &quot;cn-shanghai-aliyun-cloudauth-1260051251634779&quot;,&quot;ossObjectName&quot;: &quot;verify/1260051251634779/6ba7bcfccf33f56cdb44ed086f36ce3e0.jpeg&quot;}}</p>
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * <p>Whether it passed, T for pass, F for fail.</p>
             * 
             * <strong>example:</strong>
             * <p>T</p>
             */
            public Builder passed(String passed) {
                this.passed = passed;
                return this;
            }

            /**
             * <p>Description of the authentication result. For details, see the SubCode explanation below.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>Whether the response was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            /**
             * <p>Records the identity information and corresponding encoding entered by the user under the rare character mode. The returned data is a JSON formatted string, which will be an empty string if there are no rare characters in the name.</p>
             * <ul>
             * <li><p>name: Refers to the name entered by the user.</p>
             * </li>
             * <li><p>verifyName: Refers to the final name encoding after verification. For example, if a rare character is verified through transcoding: “Mr. Wang”, the actual verified name is “Wang Xiansheng”.</p>
             * </li>
             * <li><p>number: Refers to the identification number entered by the user.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;number&quot;: &quot;610***********1110&quot;,
             *   &quot;name&quot;: &quot;王先生&quot;,
             *   &quot;verifyName&quot;: &quot;王先&quot;
             * }</p>
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
